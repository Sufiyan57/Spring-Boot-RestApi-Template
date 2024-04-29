package dev.sufiyan.rtetrack.repository;

import dev.sufiyan.rtetrack.model.HelloWorld;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHelloWorldRepository extends JpaRepository<HelloWorld, Long> {
    HelloWorld findByMessage(String message);
}
