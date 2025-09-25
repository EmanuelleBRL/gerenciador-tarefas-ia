import java.util.Scanner;

public class InteracaoUser {

    //é final pq
    private final Scanner scanner;

    public InteracaoUser(Scanner scanner) {
        this.scanner = scanner;
    }



    public String exibirMenuPrincipalEReceberOpcao() {
        String menu = """
                Bem-vindo ao Gerenciador de Tarefas! O que deseja fazer?
                
                1- Criar nova tarefa
                2- Ver minhas tarefas
                3- Sair
                """;
        System.out.println(menu);
        return scanner.nextLine();

    }

    public String




}