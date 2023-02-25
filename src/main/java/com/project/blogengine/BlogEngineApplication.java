package com.project.blogengine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.project.blogengine.model")
@EnableJpaRepositories("com.project.blogengine.repository")
public class BlogEngineApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogEngineApplication.class, args);

    }

}
