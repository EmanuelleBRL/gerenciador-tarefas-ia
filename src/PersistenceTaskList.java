import java.util.ArrayList;
import java.util.List;

public class PersistenceTaskList implements ITaskRepository {

    private List<Task> tasks = new ArrayList<>();

    @Override
    public void addTask(Task task) {
        tasks.add(task);
    }

    @Override
    public void removeTask(Task task) {
        tasks.remove(task);
    }
    @Override
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
    @Override
    public Task getTaskByOrdem(int ordem) {
        return tasks.get(ordem);
    }
    @Override
    public int getTaskListSize() {
        return tasks.size();
    }
}
