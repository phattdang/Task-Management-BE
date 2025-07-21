# Stage 1: Build ứng dụng Spring Boot
FROM eclipse-temurin:21-jdk-alpine AS builder
WORKDIR /app
COPY . .
# Cài đặt bash và dos2unix để đảm bảo mvnw chạy đúng
RUN apk add --no-cache bash dos2unix
# Chuyển đổi định dạng dòng cho mvnw
RUN dos2unix mvnw
# Cấp quyền thực thi cho mvnw
RUN chmod +x mvnw
# Build ứng dụng
RUN ./mvnw clean package -DskipTests

# Stage 2: Chạy ứng dụng
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]