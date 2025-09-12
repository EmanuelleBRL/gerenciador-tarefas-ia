import java.util.ArrayList;
import java.util.List;

public class PersistenceTask {

  private List<Task> tasks = new ArrayList<>();

  public void addTask(Task task){
    tasks.add(task);
  }


  public void removeTask(Task task){
    tasks.remove(task);
  }

    public List<Task> getAllTasks() {
      return tasks;
    }
}
