package com.project.Market;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/holaMundo")
public class HolaMundoController {

    @GetMapping("/hola")
    public String holaMundo(){
        return "Primer Hola Mundo con Spring Boot";
    }
}
