package project.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.learning.entity.UserEntity;
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
