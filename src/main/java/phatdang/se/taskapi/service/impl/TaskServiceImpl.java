package phatdang.se.taskapi.service.impl;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import phatdang.se.taskapi.converter.TaskConverter;
import phatdang.se.taskapi.dto.request.CreationTaskRequest;
import phatdang.se.taskapi.dto.response.CreationTaskResponse;
import phatdang.se.taskapi.dto.response.TaskResponse;
import phatdang.se.taskapi.entity.Task;
import phatdang.se.taskapi.repository.ProjectRepository;
import phatdang.se.taskapi.repository.TaskRepository;
import phatdang.se.taskapi.repository.UserRepository;
import phatdang.se.taskapi.service.TaskService;
import phatdang.se.taskapi.utils.ConvertTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class TaskServiceImpl implements TaskService {
    TaskRepository taskRepository;
    ProjectRepository projectRepository;
    UserRepository userRepository;

    @Override
    public CreationTaskResponse saveTask(CreationTaskRequest request) {
        Task task = new Task();
        task.setTaskName(request.getTaskName());
        task.setProject(projectRepository.findById(request.getProjectId()).orElse(null));
        task.setAssignee(userRepository.findById(request.getUserId()).orElse(null));

        return TaskConverter.toCreationTaskResponse(taskRepository.save(task));
    }

    @Override
    public List<TaskResponse> getTasks() {
        return taskRepository.findAll()
                .stream()
                .map(TaskConverter::toTaskResponse)
                .collect(Collectors.toList());
    }
}
