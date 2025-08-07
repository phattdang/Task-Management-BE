package phatdang.se.taskapi.converter;

import phatdang.se.taskapi.dto.response.CreationTaskResponse;
import phatdang.se.taskapi.dto.response.TaskResponse;
import phatdang.se.taskapi.entity.Task;

public class TaskConverter {
    public static CreationTaskResponse toCreationTaskResponse(Task task) {
        return CreationTaskResponse.builder()
                .taskName(task.getTaskName())
                .createdAt(task.getCreatedAt().toString())
                .projectId(task.getProject().getId())
                .userId(task.getAssignee().getUserId())
                .build();
    }

    public static TaskResponse toTaskResponse(Task task) {
        return TaskResponse.builder()
                .taskName(task.getTaskName())
                .createdAt(task.getCreatedAt().toString())
                .projectId(task.getProject().getId())
                .userId(task.getAssignee().getUserId())
                .build();
    }
}
