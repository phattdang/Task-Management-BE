package phatdang.se.taskapi.dto.request;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import phatdang.se.taskapi.entity.Project;
import phatdang.se.taskapi.entity.User;
import phatdang.se.taskapi.enums.TaskPriority;
import phatdang.se.taskapi.enums.TaskStatus;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class CreationTaskRequest {
    String taskName;
    String userId;
    Long projectId;
}
