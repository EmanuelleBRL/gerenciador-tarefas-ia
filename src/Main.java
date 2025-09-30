import java.util.Scanner;


public class Main {

    Scanner input = new Scanner(System.in);
    TaskServices task = new TaskServices();
    InteracaoUser ui = new InteracaoUser(input);


    public static void main(String[] args) {
        // --Inicialização--
        Main m = new Main();
        m.executar();
    }

    public void executar() {
        int sair = 0;
        while (sair != 1) {
            String opcao = ui.exibirMenuPrincipalEReceberOpcao();
            switch (opcao) {
                case "1":
                    createNewTask();
                    break;
                case "2":
                    showTasks();
                    break;
                case "3":
                    sair = 1;
                    break;
                default:
                    System.out.println("opção inválida!");
                    break;
            }
        }


    }

    public void createNewTask() {
        String titulo = ui.solicitarTarefa();
        String descricao = ui.solicitarDescricao();
        task.createTask(titulo, descricao);
    }

    public void showTasks() {
        System.out.println("Aqui está sua lista de tarefas!" + "\n\t");
        task.printAllTasks();
        secondMenu();
    }

    public void concludeTask() {
        int ordem = ui.solicitarOrdemDaTarefa("concluir");
        task.concludeTask(ordem);
    }

    public void excludeTask() {
        int ordem = ui.solicitarOrdemDaTarefa("excluir");
        task.excludeTask(ordem);
    }

    public void editTask() {
        int ordem = ui.solicitarOrdemDaTarefa("editar");
        String titulo = ui.solicitarTarefa();
        String descricao = ui.solicitarDescricao();
        task.editTask(ordem, titulo, descricao);
        System.out.println("Tarefa editada com sucesso!");
    }

    public void secondMenu() {

        int sair = 3;
        while (sair != 2) {
            String opcao2 = ui.exibirMenuSegundarioEReceberOpcao();
            switch (opcao2) {
                case "1":
                    concludeTask();
                    break;
                case "2":
                    editTask();
                    break;
                case "3":
                    excludeTask();
                    break;
                case "4":
                    sair = 2;
                    break;


            }
        }
    }
}



