package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.TaskListDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    private static final String DESCRIPTION = "Test description";
    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("TestList", DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTasks = taskListDao.findByListName(listName);

        //Then
        assertEquals(1, readTasks.size());

        //CleanUp
        int id = readTasks.get(0).getId();
        taskListDao.deleteById(id);
    }
}
