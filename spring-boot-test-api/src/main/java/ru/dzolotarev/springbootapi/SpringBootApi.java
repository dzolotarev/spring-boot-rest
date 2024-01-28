package ru.dzolotarev.springbootapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootApi {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApi.class, args);
    }

}
