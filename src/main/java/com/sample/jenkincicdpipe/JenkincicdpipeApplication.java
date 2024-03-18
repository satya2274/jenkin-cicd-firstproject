package com.sample.jenkincicdpipe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkincicdpipeApplication {

    @GetMapping("/greeting/{name}")
    public String greeting(@PathVariable String name){

        return "Hello" + name + "congratulations for fist CICD Demo";

    }

    public static void main(String[] args) {
        SpringApplication.run(JenkincicdpipeApplication.class, args);
    }

}
