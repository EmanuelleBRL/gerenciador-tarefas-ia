import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    Scanner input = new Scanner(System.in);
    TaskServices task = new TaskServices();
    InteracaoUser ui = new InteracaoUser(input);

    

    public static void main(String[] args) {

        // --Inicialização--
    Main m = new Main();
    m.executar();

    }

    public void executar(){
        int sair = 0;

        while (sair != 1) {

            String opcao = ui.exibirMenuPrincipalEReceberOpcao();

            switch (opcao) {
                case "1":
                    createNewTask();
                case "2":
                    System.out.println("Aqui está sua lista de tarefas!" + "\n\t");
                    task.printAllTasks();
                    String opcao2 = ui.exibirMenuSegundárioEReceberOpcao();
                    if (opcao2.equals("4")) {
                        continue;
                    }
                    int ordem;
                    switch (opcao2) {
                        case "1":
                            ordem = ui.solicitarOrdemDaTarefa("concluir");
                            task.concludeTask(ordem);
                            continue;
                        case "2":
                            continue;
                        case "3":
                            ordem = ui.solicitarOrdemDaTarefa("excluir");
                            task.excludeTask(ordem);
                    }
                case "4":
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



}



