import java.util.List;

public class TaskServices {

    PersistenceTask persistenceTask = new PersistenceTask();

    public void createTask(String titulo, String descricao) {
        if(titulo == null || descricao == null) {
            System.out.println("Erro ao iniciar o task");
        }
        //validações
        Task task = new Task((long)(Math.floor(Math.random() * 10000) + 1), titulo,  descricao, false) ;
        persistenceTask.addTask(task);
    }


    public void getAllTasks() {
        List<Task> tasks = persistenceTask.getAllTasks();
        for (Task task : tasks) {

            System.out.println(task.getTitulo());
            System.out.println(task.getId());


        }
    }

    public void concludeTask(Task task) {
        if (task.getStatus()) {
            System.out.println("Task já concluída");
            return;
        }

        task.setStatus(true);
        
        
    }

    public void excludeTask(Task task){
        persistenceTask.removeTask(task);
    }



}


