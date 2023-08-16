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
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student nodir = new Student(
                    "Nodir",
                    "nodirbekmadaminov1999@gmail.com",
                    LocalDate.of(1999, OCTOBER, 27)
            );
            Student bekzod = new Student(
                    "Nodir",
                    "nodirbekmadaminov1999@gmail.com",
                    LocalDate.of(1999, OCTOBER, 27)
            );
            repository.saveAll(
                    List.of(nodir,bekzod)
            );
        };
    }
}
