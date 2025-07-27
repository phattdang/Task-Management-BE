package phatdang.se.taskapi.dto.response;

import lombok.Setter;

@Setter
public class TaskResponse {
    String taskName;
    String createdAt;
    String userId;
    Long projectId;
}
