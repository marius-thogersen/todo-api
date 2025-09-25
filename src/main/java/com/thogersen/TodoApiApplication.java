package com.thogersen;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@Slf4j
@SpringBootApplication
public class TodoApiApplication {

    public static void main(String[] args) {
        log.info("Starting TodoApiApplication");
        SpringApplication.run(TodoApiApplication.class, args);

    }

}
