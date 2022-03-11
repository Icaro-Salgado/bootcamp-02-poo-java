package corrida_na_selva;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private Integer exitOption = 6;
    private Evento evento;

    private Scanner input = new Scanner(System.in);

    public Main() {
        this.evento = new Evento();
    }

    private void printMenuPrincipal() {
        String[] opcoes = new String[] {
                "1 - Adicionar inscrição",
                "2 - Mostrar todas inscrições",
                "3 - Mostrar todas inscrições em uma categoria",
                "4 - Cancelar uma inscrição",
                "5 - Registrar pagamento",
                "6 - Sair do programa"
        };

        System.out.println("\nMenu principal");
        System.out.println("=================\n");
        for (String opcao : opcoes) {
            System.out.println(opcao);
        }
    }

    private void printMenuSelecionarCategoria() {
        String[] opcoes = new String[] {
                "1 - Circuito pequeno",
                "2 - Circuito médio",
                "3 - Circuito avançado",
        };

        System.out.println("\nSelecione a categoria:");
        for (String opcao : opcoes) {
            System.out.println(opcao);
        }
    }

    private Integer getUserMainMenuInput() {
        Integer opcao;

        printMenuPrincipal();
        System.out.print("Digite a opção desejada: ");

        try {
            opcao = input.nextInt();

        } catch (InputMismatchException ie) {
            input.nextLine();
            return -1;
        }

        return opcao;
    }

    private void inscreverParticipante() {

        System.out.print("Digite o nome do participante: ");
        input.nextLine();
        String nomeParticipante = input.nextLine();

        printMenuSelecionarCategoria();
        Integer userInput = input.nextInt();
        Categoria categoria;

        categoria = evento.getCategoriaById(userInput);

        Participante participante = new Participante();
        participante.nome = nomeParticipante;

        Inscricao inscricao = new Inscricao(participante, categoria, 0, evento.numeroInscricoes());

        this.evento.adicionarInscricao(inscricao);
    }

    private void getParticipantesNaCategoria() {
        Integer opcao;

        printMenuSelecionarCategoria();
        System.out.print("Digite a opção desejada: ");

        opcao = input.nextInt();

        this.evento.listarParticipantesCategoria(this.evento.getCategoriaById(opcao));
    }

    public void run() {
        Integer userOption;

        do {
            userOption = this.getUserMainMenuInput();

            switch (userOption) {
                case 1:
                    this.inscreverParticipante();
                    break;

                case 2:
                    this.evento.listarTodasInscrições();
                    break;

                case 3:
                    this.getParticipantesNaCategoria();
                    break;

                case 4:
                    break;

                case 5:
                    break;

                default:
                    break;
            }
        } while (userOption != this.exitOption);
    }

    public static void main(String[] args) {
        Main app = new Main();

        app.run();

        System.exit(0);
    }
}
