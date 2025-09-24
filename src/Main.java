import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{


    public static void main(String[] args) {

        // --Inicialização--

        Scanner input = new Scanner(System.in);
        TaskServices task = new TaskServices();
        InteracaoUser ui = new InteracaoUser(input);

        int sair = 0;

        while (sair != 1) {





            System.out.println(menu);
            String opcao = input.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("Informe o titulo: ");
                    String titulo = input.nextLine();
                    System.out.println("Informe a descricao: ");
                    String descricao = input.nextLine();
                    task.createTask(titulo, descricao);
                    break;
                case "2":
                    System.out.println("Aqui está sua lista de tarefas!");
                    task.printAllTasks();
                    menu = """ 
                               1 - Marcar como concluído
                               2 - Editar
                               3 - Excluir
                               4 - Voltar pro menu
                            """;
                    System.out.println(menu);
                    String opcao2 = input.nextLine();
                    int ordem;
                    switch (opcao2) {
                        case "1":
                            System.out.println("Digite a ordem da terefa que você deseja concluir: ");
                            ordem = input.nextInt();
                            input.nextLine();
                            task.concludeTask(ordem);
                            break;
                        case "2":
                            break;
                        case "3":
                            System.out.println("Digite a ordem da terefa que você deseja excluir: ");
                            ordem = input.nextInt();
                            input.nextLine();
                            task.excludeTask(ordem);
                    }
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


}



