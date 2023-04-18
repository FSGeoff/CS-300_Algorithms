package Module4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TaskServiceTest {

  @Test
  void testAddTask() {
    Task task = new Task("54321", "Geoff", "Solid Student");

    assertTrue(task.getId().equals("54321"));
    assertTrue(task.getName().equals("Geoff"));
    assertTrue(task.getDescription().equals("Solid Student"));
  }

  @Test
  void testDeleteTaskPerId() {
    TaskService task = new TaskService("345trf", "Iniko", "Cool Kid");
    task.addTask("345trf", "Iniko", "Cool Kid");

    assertTrue(task.deleteTasksPerId(task.getId()));
  }

  @Test
  void testUpdateTaskName() {
    TaskService task = new TaskService("43tfre21", "Inity", "A-Student");
    task.addTask("43tfre21", "Inity", "A-Student");

    task.updateNameById("43tfre21", "Geoff");
    assertTrue(task.getTasksById("43tfre21").getName().equals("Geoff"));
  }

  @Test
  void testUpdateTaskDescription() {
    TaskService task = new TaskService("43t77e21", "Inity", "A Student");
    task.addTask("43t77e21", "Inity", "A Student");

    task.updateDescriptionById("43t77e21", "A great student");
    assertTrue(
      task.getTasksById("43t77e21").getDescription().equals("A great student")
    );
  }
}
