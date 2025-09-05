import java.util.ArrayList;
import java.util.List;

public class PersistenceTask {

  private List<Task> tasks = new ArrayList<Task>();

  public void addTask(Task task){
    tasks.add(task);
  }


  public void removeTask(Task task){
    tasks.remove(task);



  }



}
