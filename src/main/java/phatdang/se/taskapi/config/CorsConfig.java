package phatdang.se.taskapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Cho phép tất cả endpoint
                .allowedOrigins("https://task-management-fe-dusky.vercel.app") // Domain frontend
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Các phương thức HTTP được phép
                .allowedHeaders("*") // Cho phép tất cả header
                .allowCredentials(true); // Cho phép gửi cookie hoặc thông tin xác thực
    }
}