package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd(){
        //When
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.addTaskToList(board.getToDoList(), "new to do list task" );
        board.addTaskToList(board.getInProgressList(), "new in progress task");
        board.addTaskToList(board.getDoneList(), "new done list task");

        //Then
        System.out.println(board.getToDoList().getTasks() + "\n" + board.getInProgressList().getTasks() + "\n" + board.getDoneList().getTasks());

    }
}
