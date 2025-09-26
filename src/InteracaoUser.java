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


    public String solicitarTarefa() {
        String menu = "Digite o nome da tarefa: ";
        System.out.println(menu);
        return scanner.nextLine();
    }

    public String  solicitarDescricao() {
        String menu = "Digite o a descrição da tarefa: ";
        System.out.println(menu);
        return scanner.nextLine();
    }

    public String exibirMenuSegundárioEReceberOpcao() {
        String menu = """ 
                   1 - Marcar como concluído
                   2 - Editar
                   3 - Excluir
                   4 - Voltar pro menu
                """;
        System.out.println(menu);
        return scanner.nextLine();
    }

    public int solicitarOrdemDaTarefa(String acao) {
        String menu = "Digite a ordem da tarefa que você deseja " + acao + ": ";
        System.out.println(menu);
        int ordem = scanner.nextInt();
        scanner.nextLine();
        return ordem;

    }
}