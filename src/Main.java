import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TaskServices  task = new TaskServices();

        String menu = """ 
                       Bem-vindo ao Gerenciador de Tarefas! O que deseja fazer?
                       
                       1- Criar nova tarefa
                       2- Ver minhas tarefas
                       """;

        System.out.println(menu);
        String opcao = input.nextLine();

        switch (opcao) {
            case "1":
                System.out.println("Informe o titulo: ");
                String titulo = input.nextLine();
                System.out.println("Informe a descricao: ");
                String descricao = input.nextLine();

                task.createTask(titulo,descricao);



            case "2":
                System.out.println("Aqui está sua lista de tarefas!");
                task.getAllTasks();
                menu = """ 
                           1 - Marcar como concluído
                           2 - Editar 
                           3 - Excluir
                        """;
                System.out.println(menu);
                String opcao2 = input.nextLine();
                         switch (opcao2) {
                             case "1":
                                 System.out.println("Qual tarefa você quer marcar como concluído?");
                                 String id = input.nextLine();
                                 if (id.equals(task.id))
                                 task.concludeTask(Task task);
                                 System.out.println("Tarefa concluída!");
                }

        }






    }
}