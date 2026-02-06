package com.clara.first_spring_app.controller;

import com.clara.first_spring_app.domain.User;
import com.clara.first_spring_app.service.HelloWorldService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world") //url.

    public class HelloWorldController {

    private HelloWorldService helloWorldService;

        public  HelloWorldController(HelloWorldService helloWorldService){
            this.helloWorldService = helloWorldService;
        }

    @GetMapping
    public String helloWorld(){
        return helloWorldService.helloWorld("Clara");
    }

    @PostMapping("")
    public String helloWorldPost(@RequestBody User body){
            return "Hello World Post \n" + body.getName() + "\n" + body.getEmail();
    }
}
