package phatdang.se.taskapi.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import phatdang.se.taskapi.converter.JpaConverterJson;
import phatdang.se.taskapi.enums.AccountStatus;
import phatdang.se.taskapi.enums.Role;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @EqualsAndHashCode.Include
    String userId;

    @EqualsAndHashCode.Include
    @Column(unique = true, nullable = false)
    String email;

    @Column(nullable = false)
    String password;
    @Column(nullable = false)
    String firstName;
    @Column(nullable = false)
    String lastName;

    @Enumerated(EnumType.STRING)
    Role role;
    @Column(nullable = false)
    String phoneNumber;
    @Column(nullable = false)
    String address;

    String jobTitle;
    String department;
    String organization;

    @Column(nullable = false, updatable = false)
    @Convert(converter = Jsr310JpaConverters.LocalDateTimeConverter.class)
    LocalDateTime createdAt;

    @Column(nullable = false, updatable = false)
    @Convert(converter = Jsr310JpaConverters.LocalDateTimeConverter.class)

    LocalDateTime updatedAt;
    String avatarUrl;
    String backgroundUrl;
    String language;
    String timeZone;


    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    AccountStatus status;

    LocalDateTime lastActive;

//    @Convert(converter = JpaConverterJson.class)
//    Map<String, String> externalIds;

    @OneToMany(mappedBy = "assignee")
    List<Task> tasks;

    // Hook để tự động cập nhật updatedAt
    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }

    // Hook để cập nhật lastActive khi đăng nhập (cần thêm logic trong service)
    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }
}
