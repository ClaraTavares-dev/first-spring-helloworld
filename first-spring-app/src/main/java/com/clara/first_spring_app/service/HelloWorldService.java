package com.clara.first_spring_app.service;

import org.springframework.stereotype.Service;

//regras de negócio.

@Service
public class HelloWorldService {
    public String helloWorld(String name){
        return "Regra de Negócio\n" +
                "DEV: " + name;
    }
}
