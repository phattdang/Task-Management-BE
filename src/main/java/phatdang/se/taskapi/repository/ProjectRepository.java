package phatdang.se.taskapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import phatdang.se.taskapi.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {
}
