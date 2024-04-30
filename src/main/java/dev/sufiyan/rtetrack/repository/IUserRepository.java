package dev.sufiyan.rtetrack.repository;
import dev.sufiyan.rtetrack.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {}
