import java.util.ArrayList;
import java.util.List;

public class PersistenceTaskList implements IPersistence {

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

    public Task getTaskById(Long taskId) {
      for (Task task : tasks) {
        if (task.getId().equals(taskId)) {
          return task;
        }
      }
      return null;
    }

    public Task getTaskByOrdem(int ordem) {
      return tasks.get(ordem);
    }

    public int getTaskListSize(){
      return tasks.size();
    }
}
