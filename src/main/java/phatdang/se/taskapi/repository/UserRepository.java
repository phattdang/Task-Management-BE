package phatdang.se.taskapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import phatdang.se.taskapi.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
