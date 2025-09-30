import java.util.List;

public class TaskServices {

    PersistenceTaskList persistenceTask = new PersistenceTaskList();

    public void createTask(String titulo, String descricao) {
        if (titulo == null || descricao == null) {
            System.out.println("Erro ao iniciar o task");
        }
        //validações
        Task task = new Task((long) (Math.floor(Math.random() * 10000) + 1), titulo, descricao, false);
        persistenceTask.addTask(task);
    }


    public void printAllTasks() {
        List<Task> tasks = persistenceTask.getAllTasks();
        int ordem = 0;
        for (Task task : tasks) {
            System.out.println("Ordem: " + ordem + " " + "\n\t" + task.toString());
            ordem++;
        }
    }

   public void editTask(int ordem, String titulo, String descricao) {
        Task task = persistenceTask.getTaskByOrdem(ordem);

        if (titulo == null || descricao == null) {
            System.out.println("Erro ao editar a tarefa.");
        }

        task.setTitulo(titulo);
        task.setDescricao(descricao);


   }

    public void concludeTask(int ordem) {
        if (ordem >= persistenceTask.getTaskListSize()) {
            System.out.println("Impossível, ordem inexistente.");
            return;
        }
        Task task = persistenceTask.getTaskByOrdem(ordem);
        if (!task.getStatus()) {
            task.setStatus(true);
            System.out.println("tarefa concluida!");
            return;
        }
        System.out.println("tarefa já foi concluida!");
    }

    public void excludeTask(int ordem) {
        Task task = persistenceTask.getTaskByOrdem(ordem);

        persistenceTask.removeTask(task);
        System.out.println("A " + task.toString() + " foi excluida!");



    }

}