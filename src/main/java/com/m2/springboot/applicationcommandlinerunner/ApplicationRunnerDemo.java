package com.m2.springboot.applicationcommandlinerunner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ApplicationRunner and CommandLineRunner interfaces lets you to execute the code after the Spring Boot application is started.
 * You can use these interfaces to perform any actions immediately after the application has started.
 */

@SpringBootApplication
public class ApplicationRunnerDemo implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRunnerDemo.class, args);
    }

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        System.out.println("Hello World from Application Runner");
    }
}
/*
@SpringBootApplication
class CommandLineRunnerDemo implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CommandLineRunnerDemo.class, args);
    }


    @Override
    public void run(String... strings) throws Exception {  //varargs here
        System.out.println("Hello World from COMMAND line Runner");
    }
}*/
