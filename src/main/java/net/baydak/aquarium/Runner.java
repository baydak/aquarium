package net.baydak.aquarium;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Runner {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Runner.class, args);
    }
}
