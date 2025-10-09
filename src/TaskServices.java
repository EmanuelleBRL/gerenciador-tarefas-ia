import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TaskServices {

    private final ITaskRepository repository;
    private List<Task> tasksInMemory;

    public TaskServices(ITaskRepository repository) {
        this.repository = repository;
        this.tasksInMemory = new ArrayList<>();
    }

    public void loadTasksFromJson() {
        try {
            this.tasksInMemory = repository.load();
        } catch (IOException e) {
            //TODO implementar tratamento de erro mais tarde
            System.out.println("Erro ao carregar tarefas do arquivo. Iniciando com lista vazia>" + e.getMessage());
        }
    }

    public void persistTasksInJson() {
        try {
            this.repository.save(this.tasksInMemory);
        } catch (IOException e) {
            //TODO implementar tratamento de erro mais tarde
            System.out.println("Erro ao salvar tarefas no arquivo: " + e.getMessage());
        }
    }

    public void createTask(String titulo, String descricao) {
        if (titulo == null || descricao == null) {
            //TODO impementar exception mais tarde
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
        //TODO impementar exception mais tarde
        Task task = this.tasksInMemory.get(ordem);
        if (titulo == null || descricao == null) {
            System.out.println("Erro ao editar a tarefa.");
        }
        task.setTitulo(titulo);
        task.setDescricao(descricao);
    }

    public void concludeTask(int ordem) {
        //TODO impementar exception mais tarde
        if (ordem >= tasksInMemory.size()) {
            System.out.println("Impossível, ordem inexistente.");
            return;
        }
        Task task = tasksInMemory.get(ordem);
        if (!task.getStatus()) {
            task.setStatus(true);
            System.out.println("tarefa concluida!");
            return;
        }
        System.out.println("tarefa já foi concluida!");
    }

    public void excludeTask(int ordem) {
        Task task = tasksInMemory.get(ordem);
        tasksInMemory.remove(task);
        //Pedir confirmação de remoção
        System.out.println("A " + task.toString() + " foi excluida!");

        //TODO impementar exception ordem não existente" mais tarde
    }
}