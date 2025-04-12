package com.lvlup.bank;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/")
    public String hello() {
        return "¡Hola Spring Boot desde Codespace guanajo!";
    } 
}
