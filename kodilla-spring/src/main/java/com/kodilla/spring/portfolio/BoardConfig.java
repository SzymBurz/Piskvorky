package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Bean
    public Board board() {
        return new Board(taskList(), taskList(), taskList());
    }

    private TaskList taskList() {
        return new TaskList();
    }

}
