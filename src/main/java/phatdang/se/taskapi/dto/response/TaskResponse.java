package phatdang.se.taskapi.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder

public class TaskResponse {
    String taskName;
    String createdAt;
    String userId;
    Long projectId;
}
