public class TaskServices {

    PersistenceTask persistenceTask = new PersistenceTask();

    public void createTask(Long id, String titulo, String descricao, boolean status) {
        if( id == null || titulo == null || descricao == null) {
            System.out.println("Erro ao iniciar o task");
        } else if (id < 0){
            System.out.println("Erro ao iniciar o task: Id inválido");
        }
        //validações
        Task task = new Task(id, titulo,  descricao, status) ;


    }


    public void getAllTasks() {


    }

    public void concludeTask(Task task) {
        if (task.getStatus()) {
            System.out.println("Task já concluída");
            return;
        }
        persistenceTask.removeTask(task);
    }




}


