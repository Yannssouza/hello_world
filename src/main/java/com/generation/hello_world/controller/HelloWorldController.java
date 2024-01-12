package com.generation.hello_world.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping
public class HelloWorldController {

    @GetMapping("/helloWorld")
    public String getHelloWorld() {
        return "Hello World!";
    }

    @GetMapping("/bsms")
    public List<String> getBSMs() {
        return Arrays.asList(
                "Mentalidade de Crescimento",
                "Orientação ao futuro",
                "Comunicação",
                "Atenção aos detalhes",
                "Trabalho em equipe",
                "Persistência"
        );
    }

    @GetMapping("/objetivos")
    public List<String> getObjetivosEstudos() {
        return Arrays.asList(
                "Aprender Spring Boot",
                "Entender endpoints em Spring",
                "Praticar desenvolvimento web com Spring"
        );
    }
}
