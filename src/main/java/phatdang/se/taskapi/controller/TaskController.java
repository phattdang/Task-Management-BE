package phatdang.se.taskapi.controller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;
import phatdang.se.taskapi.converter.TaskConverter;
import phatdang.se.taskapi.dto.request.CreationTaskRequest;
import phatdang.se.taskapi.dto.response.ApiResponse;
import phatdang.se.taskapi.dto.response.CreationTaskResponse;
import phatdang.se.taskapi.dto.response.TaskResponse;
import phatdang.se.taskapi.entity.Task;
import phatdang.se.taskapi.exception.HttpCodes;
import phatdang.se.taskapi.service.TaskService;

import java.util.List;

@RestController
@RequestMapping("tasks")

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)

public class TaskController {

    TaskService taskService;

    @GetMapping
    List<TaskResponse> getTasks() {
        return taskService.getTasks();
    }

    @PostMapping
    ApiResponse<CreationTaskResponse> saveTask(@RequestBody CreationTaskRequest request) {
        return ApiResponse.<CreationTaskResponse>builder()
                .code(HttpCodes.OK.getCODE())
                .message(HttpCodes.OK.getMESSAGE())
                .data(taskService.saveTask(request))
                .build();
    }
}
