import java.util.List;

public interface ITaskRepository {

    void addTask(Task task);

    void removeTask(Task task);

    List<Task> getAllTasks();

    Task getTaskByOrdem(int ordem);

    int getTaskListSize();
}
