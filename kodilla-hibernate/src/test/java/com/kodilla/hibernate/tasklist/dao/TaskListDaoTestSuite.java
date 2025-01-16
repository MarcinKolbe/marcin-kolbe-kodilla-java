package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static String LISTNAME = "TestTaskList";
    private static String DESCRIPTION = "TestDescription";

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(taskList);
        String name = taskList.getListName();
        //When
        List<TaskList> taskLists = taskListDao.findByListName(name);

        //Then
        Assertions.assertEquals(1, taskLists.size());

        //CleanUp
        int id = taskLists.get(0).getId();
        taskListDao.deleteById(id);
    }
}
