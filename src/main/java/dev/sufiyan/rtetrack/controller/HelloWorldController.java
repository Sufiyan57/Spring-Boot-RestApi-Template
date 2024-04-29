package dev.sufiyan.rtetrack.controller;

import dev.sufiyan.rtetrack.service.IHelloWorldService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@Api(tags = "Hello World")

public class HelloWorldController {

    private final IHelloWorldService helloWorldService;

    @Autowired
    public HelloWorldController(IHelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping("/message")
    @ApiOperation("Get Hello World Message")
    public String getHelloWorldMessage() {
        return "Hello, World!";
    }
    @GetMapping("/hello/{name}")
    @ApiOperation("Get User Id By Name")
    public Long getIdByName(@PathVariable String name) {
        return helloWorldService.getIdByName(name);
    }
}
