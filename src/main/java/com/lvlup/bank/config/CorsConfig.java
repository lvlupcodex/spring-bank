package com.lvlup.bank.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") //SI A TODAS LAS RUTAS
            .allowedOrigins("*") //SI A TODOS LOS ORÍGENES
            .allowedMethods("GET", "POST", "PUT", "DELETE") //METODOS PERMITIDOS
            .allowedHeaders("*");
    }
}
