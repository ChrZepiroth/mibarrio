package com.mibarrio.api;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mibarrio.api")
public class MibarrioApplication {

    public static void main(String[] args) {
        SpringApplication.run(MibarrioApplication.class, args);
    }

}

