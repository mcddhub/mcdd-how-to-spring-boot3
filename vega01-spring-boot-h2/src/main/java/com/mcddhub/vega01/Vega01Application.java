package com.mcddhub.vega01;

import com.mcddhub.vega01.model.Book;
import com.mcddhub.vega01.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class Vega01Application {
    public static void main(String[] args) {
        ApplicationContext app = SpringApplication.run(Vega01Application.class, args);
        log.info("the datasource is {}", app.getBean("dataSource"));
    }

    @Bean
    CommandLineRunner commandLineRunner(BookRepository repository) {
        return args -> {
            // add some data
            repository.save(new Book(null,"Hong Lou Meng",691,"CaoXueQin"));
        };
    }
}