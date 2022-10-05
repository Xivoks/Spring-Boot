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
                    21,
                    LocalDate.of(2000, APRIL, 5)
            );
            Student test2 = new Student(

                    "Test2",
                    "test2@testowy",
                    19,
                    LocalDate.of(1999, MAY, 12)
            );
            repository.saveAll(
                    List.of(test,test2)
            );
        };
    }
}
