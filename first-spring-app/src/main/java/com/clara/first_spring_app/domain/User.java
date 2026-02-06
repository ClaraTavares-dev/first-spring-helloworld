package com.clara.first_spring_app.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//Gerar o get, set e construtor automáticamente.

@Getter
@Setter
@AllArgsConstructor
public class User {
    private String name;
    private String email;

}

