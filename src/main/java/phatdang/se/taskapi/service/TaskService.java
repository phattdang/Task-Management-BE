package phatdang.se.taskapi.service;

import org.springframework.web.bind.annotation.RequestBody;
import phatdang.se.taskapi.dto.request.CreationTaskRequest;
import phatdang.se.taskapi.dto.response.ApiResponse;
import phatdang.se.taskapi.dto.response.CreationTaskResponse;
import phatdang.se.taskapi.dto.response.TaskResponse;
import phatdang.se.taskapi.entity.Task;

import java.util.List;

public interface TaskService {
    CreationTaskResponse saveTask(@RequestBody CreationTaskRequest request);
    List<TaskResponse> getTasks();
}
