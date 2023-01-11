package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student test = new Student(
                    "Test",
                    "test3@testowy",
                    LocalDate.of(2000, DECEMBER, 28)
            );
            Student test2 = new Student(

                    "Test2",
                    "test2@testowy",
                    LocalDate.of(1999, FEBRUARY, 19)
            );
            repository.saveAll(
                    List.of(test,test2)
            );
        };
    }
}
