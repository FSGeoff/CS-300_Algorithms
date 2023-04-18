package Module4;

import java.util.ArrayList;
import java.util.List;

public class TaskService extends Task {

  private static List<Task> allTasks = new ArrayList<Task>();

  public TaskService(String Id, String name, String description) {
    super(Id, name, description);
  }

  public void addTask(String Id, String name, String description) {
    Task myTask = new Task(Id, name, description);
    allTasks.add(myTask);
  }

  public int getTaskIndexById(String Id) {
    for (int i = 0; i < allTasks.size(); i++) {
      Task matchedTask = allTasks.get(i);
      String matchedIndex = matchedTask.getId();

      System.out.println(matchedTask.getId());
      System.out.println("String Id: " + Id);

      if (Id.equals(matchedIndex)) {
        return i;
      }
    }
    return -1;
  }

  public Task getTasksById(String Id) {
    for (int i = 0; i < allTasks.size(); i++) {
      Task matchedTask = allTasks.get(i);
      String matchedTaskId = matchedTask.getId();

      if (Id.equals(matchedTaskId)) {
        return matchedTask;
      }
    }
    return null;
  }

  public boolean deleteTasksPerId(String Id) {
    int foundTask = getTaskIndexById(Id);
    System.out.println("foundTask is: " + foundTask);
    if (foundTask != -1) {
      allTasks.remove(foundTask);
      return true;
    }
    return false;
  }

  public boolean updateNameById(String Id, String newName) {
    Task task = allTasks.get(getTaskIndexById(Id));

    if (task == null) {
      return false;
    }
    task.setName(newName);
    return true;
  }

  public boolean updateDescriptionById(String Id, String newDescription) {
    Task task = getTasksById(Id);

    if (task == null) {
      return false;
    }
    task.setDescription(newDescription);
    return true;
  }
}
