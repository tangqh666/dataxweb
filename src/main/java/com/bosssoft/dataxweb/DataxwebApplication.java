package com.bosssoft.dataxweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DataxwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataxwebApplication.class, args);
    }

}
