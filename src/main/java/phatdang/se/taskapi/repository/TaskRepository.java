package phatdang.se.taskapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import phatdang.se.taskapi.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, String> {
}
