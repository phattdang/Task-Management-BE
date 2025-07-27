package phatdang.se.taskapi.converter;

import phatdang.se.taskapi.dto.response.CreationTaskResponse;
import phatdang.se.taskapi.dto.response.TaskResponse;
import phatdang.se.taskapi.entity.Task;

public class TaskConverter {
    public static CreationTaskResponse toCreationTaskResponse(Task task) {
        CreationTaskResponse response = new CreationTaskResponse();
        response.setTaskName(task.getTaskName());
        response.setCreatedAt(task.getCreatedAt().toString());
        response.setProjectId(task.getProject().getId());
        response.setUserId(task.getAssignee().getUserId());
        return response;
    }

    public static TaskResponse toTaskResponse(Task task) {
        TaskResponse taskResponse = new TaskResponse();
        taskResponse.setTaskName(task.getTaskName());
        taskResponse.setCreatedAt(task.getCreatedAt().toString());
        taskResponse.setProjectId(task.getProject().getId());
        taskResponse.setUserId(task.getAssignee().getUserId());
        return taskResponse;
    }
}
