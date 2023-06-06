//create a bean named as "Framework" for "JavaWorld" class

package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public JavaWorld javaWorld() {
        return new JavaWorld();
    }

    @Bean
    public Framework framework() {
        return new Framework(javaWorld());
    }
}
