import java.util.ArrayList;
import java.util.List;

public class TaskServices {
    private final ITaskRepository repository;

    private List<Task> tasksInMemory;


    public TaskServices(ITaskRepository repository) {
        this.repository = repository;
        this.tasksInMemory = new ArrayList<>();
    }

    public void createTask(String titulo, String descricao) {
        if (titulo == null || descricao == null) {
            System.out.println("Erro ao iniciar o task");
        }
        //validações
        Task task = new Task((long) (Math.floor(Math.random() * 10000) + 1), titulo, descricao, false);
        this.tasksInMemory.add(task);
    }


    public void printAllTasks() {

        int ordem = 0;
        for (Task task : tasksInMemory) {
            System.out.println("Ordem: " + ordem + " " + "\n\t" + task.toString());
            ordem++;
        }
    }

   public void editTask(int ordem, String titulo, String descricao) {
        Task task = this.tasksInMemory.getTaskByOrdem(ordem);

        if (titulo == null || descricao == null) {
            System.out.println("Erro ao editar a tarefa.");
        }

        task.setTitulo(titulo);
        task.setDescricao(descricao);


   }

    public void concludeTask(int ordem) {
        if (ordem >= tasksInMemory.getTaskListSize()) {
            System.out.println("Impossível, ordem inexistente.");
            return;
        }
        Task task = tasksInMemory.getTaskByOrdem(ordem);
        if (!task.getStatus()) {
            task.setStatus(true);
            System.out.println("tarefa concluida!");
            return;
        }
        System.out.println("tarefa já foi concluida!");
    }

    public void excludeTask(int ordem) {
        Task task = tasksInMemory.getTaskByOrdem(ordem);

        tasksInMemory.removeTask(task);
        System.out.println("A " + task.toString() + " foi excluida!");



    }

}