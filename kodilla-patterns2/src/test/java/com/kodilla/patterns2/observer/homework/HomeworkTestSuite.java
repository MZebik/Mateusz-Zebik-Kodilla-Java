package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTestSuite {
    @Test
    void updateStudentTaskListTest() {
        // Given
        StudentTaskList john_smith = new StudentTaskList("John Smith");
        StudentTaskList stan_kovalsky = new StudentTaskList("Stan Kovalsky");
        StudentTaskList peter_novak = new StudentTaskList("Peter Novak");
        Mentor mentor1 = new Mentor("mentor1");
        Mentor mentor2 = new Mentor("mentor2");
        john_smith.registerObserver(mentor1);
        stan_kovalsky.registerObserver(mentor2);
        peter_novak.registerObserver(mentor1);
        // When
        john_smith.addNewTask("Hard task");
        stan_kovalsky.addNewTask("Very hard task");
        peter_novak.addNewTask("Realy very hard task");
        john_smith.addNewTask("Next dificult task");
        stan_kovalsky.addNewTask("Realy dificult task");
        // Then
        assertEquals(3, mentor1.getUpdateCount());
        assertEquals(2, mentor2.getUpdateCount());
        assertEquals(1, john_smith.getObservers().size());
        assertEquals(2, john_smith.getTaskList().size());
    }
}
