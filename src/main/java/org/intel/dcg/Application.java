package org.intel.dcg;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args){
        System.out.println("Project Start!");
        SpringApplication.run(Application.class, args);
    }
}
