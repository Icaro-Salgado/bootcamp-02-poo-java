package corrida_na_selva;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private Integer exitOption = 6;
    private Evento evento;

    private Scanner input = new Scanner(System.in);

    // Para utilizar cores no terminal
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public Main() {
        this.evento = new Evento();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private void printBanner() {
        System.out.println(ANSI_GREEN);
        System.out.println("a88888b.                            oo       dP");
        System.out.println("d8'   `88                                     88");
        System.out.println("88        .d8888b. 88d888b. 88d888b. dP .d888b88 .d8888b.");
        System.out.println("88        88'  `88 88'  `88 88'  `88 88 88'  `88 88'  `88");
        System.out.println("Y8.   .88 88.  .88 88       88       88 88.  .88 88.  .88");
        System.out.println(" Y88888P' `88888P' dP       dP       dP `88888P8 `88888P8");
        System.out.println("");
        System.out.println("");
        System.out.println("                                       dP");
        System.out.println("                                       88");
        System.out.println("88d888b. .d8888b.    .d8888b. .d8888b. 88 dP   .dP .d8888b.");
        System.out.println("88'  `88 88'  `88    Y8ooooo. 88ooood8 88 88   d8' 88'  `88");
        System.out.println("88    88 88.  .88          88 88.  ... 88 88 .88'  88.  .88");
        System.out.println("dP    dP `88888P8    `88888P' `88888P' dP 8888P'   `88888P8");
        System.out.println(ANSI_RESET);
    }

    private void printMenuTitle(String title) {
        // Tamanho do banner, pode ser obtido contando o tamanho da maior linha do
        // banner
        int bannerSize = 59;

        // Espaços entre o inicio do titulo || e o texto do titulo
        // a largura do titulo do menu deve ser igual a do banner
        int spacesBetween = Math.floorDiv((bannerSize - title.length() - 4), 2);
        System.out.print(ANSI_BLUE);
        System.out.println("=".repeat(bannerSize));
        System.out.println("||" + " ".repeat(spacesBetween) + title + " ".repeat(spacesBetween) + " ||");
        System.out.println("=".repeat(bannerSize));
        System.out.println(ANSI_RESET);
    }

    private void printMenuOpcoes(String[] opcoes, boolean vertical) {
        System.out.print(ANSI_BLUE);
        for (String opcao : opcoes) {
            if (vertical) {
                System.out.println(opcao);
            } else {
                System.out.print(opcao + "\t");
            }
        }
        System.out.println(ANSI_RESET);

        System.out.print(ANSI_RED + "Digite a opção desejada: " + ANSI_RESET);
    }

    private void printMenuPrincipal() {
        // A partir daqui o código é unicamente para printar melhor no cli
        String[] opcoes = new String[] {
                " 1 - Adicionar inscrição",
                " 2 - Mostrar todas inscrições",
                " 3 - Mostrar todas inscrições em uma categoria",
                " 4 - Cancelar uma inscrição",
                " 5 - Registrar pagamento",
                " 6 - Sair do programa",
        };

        this.printBanner();
        this.printMenuTitle("Menu principal");

        printMenuOpcoes(opcoes, true);

    }

    private void printMenuSelecionarCategoria(boolean vertical) {
        String[] opcoes = new String[] {
                " 1 - Circuito pequeno",
                " 2 - Circuito médio",
                " 3 - Circuito avançado",
        };

        printMenuOpcoes(opcoes, vertical);
    }

    private Integer getUserMainMenuInput() {
        Integer opcao;

        printMenuPrincipal();

        try {
            opcao = input.nextInt();

        } catch (InputMismatchException ie) {
            input.nextLine();
            return -1;
        }

        return opcao;
    }

    private void inscreverParticipante() {
        this.printBanner();
        this.printMenuTitle("Adicionar participante");

        System.out.print(ANSI_RED + "Digite o nome do participante: " + ANSI_RESET);
        input.nextLine();
        String nomeParticipante = input.nextLine();

        System.out.println(ANSI_RED + "Selecione a categoria do participante: " + ANSI_RESET);
        printMenuSelecionarCategoria(true);
        Integer userInput = input.nextInt();
        Categoria categoria;

        categoria = evento.getCategoriaById(userInput);

        Participante participante = new Participante();
        participante.nome = nomeParticipante;

        Inscricao inscricao = new Inscricao(participante, categoria, 0, evento.numeroInscricoes());

        this.evento.adicionarInscricao(inscricao);

        System.out.print(ANSI_GREEN
                + "Participante adicionado com sucesso! Aperte enter para retornar ao menu principal..." + ANSI_RESET);
        input.nextLine();
        input.nextLine();
    }

    private void listarParticipantesNaCategoria() {
        Integer opcao;

        printBanner();
        printMenuTitle("Listar participantes na categoria");
        printMenuSelecionarCategoria(false);

        opcao = input.nextInt();

        System.out.print(ANSI_BLUE);
        this.evento.listarParticipantesCategoria(this.evento.getCategoriaById(opcao));
        System.out.println(ANSI_RESET);

        waitUserReturn();
    }

    private void listarTodosParticipantes() {
        printBanner();
        printMenuTitle("Lista de todos os participantes inscritos no evento");

        System.out.print(ANSI_BLUE);
        this.evento.listarTodasInscrições();
        System.out.print(ANSI_RESET);

        waitUserReturn();
    }

    private void waitUserReturn() {
        System.out.print(ANSI_GREEN + "Aperte enter para voltar ao menu principal..." + ANSI_RESET);
        input.nextLine();
        input.nextLine();
    }

    private void cancelarInscricao() {
        Integer opcao;

        printBanner();
        printMenuTitle("Cancelar uma inscrição");

        System.out.print(ANSI_RED);
        System.out.print("Digite o numero da inscricao a ser cancelada: ");
        System.out.print(ANSI_RESET);

        opcao = input.nextInt();
        input.nextLine();
        Inscricao inscricaoParaCancelar = this.evento.getInscricaoPeloNumeroDaInscricao(opcao);

        if (inscricaoParaCancelar == null) {
            System.out.println(ANSI_YELLOW + "Inscrição não encontrada" + ANSI_RESET);
            waitUserReturn();
            return;
        }

        System.out.println(ANSI_BLUE + inscricaoParaCancelar + ANSI_RESET);
        boolean yn = false;
        String confirmacao;

        while (!yn) {
            System.out.print(ANSI_RED + "Deseja mesmo cancelar essa inscrição? [S/n]" + ANSI_RESET);
            confirmacao = input.nextLine().toLowerCase();

            switch (confirmacao) {
                case "s":
                    yn = true;
                    this.evento.cancelarUmaInscricao(inscricaoParaCancelar);
                    System.out.println(ANSI_GREEN + "Inscrição cancelada com sucesso!" + ANSI_RESET);
                    break;

                case "n":
                    System.out.println(ANSI_YELLOW + "A inscrição não foi cancelada!" + ANSI_RESET);
                    yn = true;
                    break;

                default:
                    break;
            }

        }

        waitUserReturn();

    }

    private void realizarPagamento() {
        Integer opcao;

        printBanner();
        printMenuTitle("Realizar um pagamento");

        System.out.print(ANSI_RED);
        System.out.print("Digite o numero da inscricao que o pagamento será registrado: ");
        System.out.print(ANSI_RESET);

        opcao = input.nextInt();
        input.nextLine();
        Inscricao inscricaoPagamento = this.evento.getInscricaoPeloNumeroDaInscricao(opcao);

        if (inscricaoPagamento == null) {
            System.out.println(ANSI_YELLOW + "Inscrição não encontrada" + ANSI_RESET);
            waitUserReturn();
            return;
        }

        System.out.println(ANSI_BLUE + inscricaoPagamento + ANSI_RESET);
        System.out.print("Digite o valor do pagamento: ");
        int valorPagamento = input.nextInt();

        this.evento.realizarPagamento(inscricaoPagamento, valorPagamento);
        System.out.println(ANSI_GREEN + "Pagamento realizado com sucesso" + ANSI_RESET);
        waitUserReturn();
    }

    public void run() {
        Integer userOption;

        do {
            userOption = this.getUserMainMenuInput();

            switch (userOption) {
                case 1:
                    clearScreen();
                    this.inscreverParticipante();
                    break;

                case 2:
                    clearScreen();
                    this.listarTodosParticipantes();
                    ;
                    break;

                case 3:
                    clearScreen();
                    this.listarParticipantesNaCategoria();
                    break;

                case 4:
                    clearScreen();
                    this.cancelarInscricao();
                    break;

                case 5:
                    realizarPagamento();
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
