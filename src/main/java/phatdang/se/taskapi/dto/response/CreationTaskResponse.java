package phatdang.se.taskapi.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)

public class CreationTaskResponse {
    String taskName;
    String createdAt;
    String userId;
    Long projectId;
}
