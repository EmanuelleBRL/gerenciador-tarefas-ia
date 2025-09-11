import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String menu = """ 
                       Bem-vindo ao Gerenciador de Tarefas! O que deseja fazer?
                       
                       1- Criar nova tarefa
                       3- Listar tarefas
                       4- Excluir tarefa
                       5- Mudar status da tarefa
                            """;

        System.out.println(menu);
        String opcao = input.nextLine();
        switch (opcao) {
            case "1":
                System.out.println("Informe o titulo: ");
                task.setTitulo();
                TaskServices  criar = new TaskServices();
                criar.createTask();
        }






    }
}