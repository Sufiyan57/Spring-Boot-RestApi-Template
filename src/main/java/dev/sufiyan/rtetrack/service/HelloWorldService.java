package dev.sufiyan.rtetrack.service;

import dev.sufiyan.rtetrack.model.HelloWorld;
import dev.sufiyan.rtetrack.repository.IHelloWorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService implements IHelloWorldService {

    private final IHelloWorldRepository helloWorldRepository;

    @Autowired
    public HelloWorldService(IHelloWorldRepository helloWorldRepository) {
        this.helloWorldRepository = helloWorldRepository;
    }

    @Override
    public Long getIdByName(String name) {
        HelloWorld helloWorld = helloWorldRepository.findByMessage(name);
        if (helloWorld != null) {
            return helloWorld.getId();
        }
        return null;
    }
}
