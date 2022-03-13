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

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    private void printBanner() {
        System.out.println();
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
        System.out.println();
    }

    private void printMenuTitle(String title) {
        // Tamanho do banner, pode ser obtido contando o tamanho da maior linha do banner
        int bannerSize = 59;
        
        // Espaços entre o inicio do titulo || e o texto do titulo
        // a largura do titulo do menu deve ser igual a do banner
        int spacesBetween = Math.floorDiv((bannerSize - title.length() - 4), 2);

        System.out.println("=".repeat(bannerSize));
        System.out.println("||" + " ".repeat(spacesBetween) + title + " ".repeat(spacesBetween) + " ||");
        System.out.println("=".repeat(bannerSize));
    }

    private void printMenuPrincipal() {
        // A partir daqui o código é unicamente para printar melhor no cli
        String[] opcoes = new String[] {
                "1 - Adicionar inscrição",
                "2 - Mostrar todas inscrições",
                "3 - Mostrar todas inscrições em uma categoria",
                "4 - Cancelar uma inscrição",
                "5 - Registrar pagamento",
                "6 - Sair do programa"
        };
        
        this.printBanner();
        this.printMenuTitle("Menu principal");
        // System.out.println("=".repeat(59));
        // System.out.println("||" + " ".repeat(20) + "Menu principal" + " ".repeat(20) + " ||");
        // System.out.println("=".repeat(59));
        for (String opcao : opcoes) {
            System.out.println(opcao);
        }
    }

    private void printMenuSelecionarCategoria(boolean horizontal) {
        String[] opcoes = new String[] {
                "1 - Circuito pequeno",
                "2 - Circuito médio",
                "3 - Circuito avançado",
        };

        System.out.println("\nSelecione a categoria:");
        for (String opcao : opcoes) {
            if (horizontal){ 
                System.out.print(opcao + "\t");
            } else {
                System.out.println(opcao);
            }
        }

        System.out.println();
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
        this.printBanner();
        this.printMenuTitle("Adicionar participante");

        System.out.print("Digite o nome do participante: ");
        input.nextLine();
        String nomeParticipante = input.nextLine();

        printMenuSelecionarCategoria(true);
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

        printMenuSelecionarCategoria(false);
        System.out.print("Digite a opção desejada: ");

        opcao = input.nextInt();

        this.evento.listarParticipantesCategoria(this.evento.getCategoriaById(opcao));
    }

    private void cancelarInscricao() {
        Integer opcao;

        System.out.print("Digite o numero da inscricao a ser cancelada: ");

        opcao = input.nextInt();
        input.nextLine();
        Inscricao inscricaoParaCancelar = this.evento.getInscricaoPeloNumeroDaInscricao(opcao);

        if (inscricaoParaCancelar == null) {
            System.out.println("Inscrição não encontrada");
            return;
        }

        System.out.println(inscricaoParaCancelar);
        boolean yn = false;
        String confirmacao;

        while(!yn) {
            System.out.print("Deseja mesmo cancelar essa inscrição? [S/n]");
            confirmacao = input.nextLine().toLowerCase();

            switch (confirmacao) {
                case "s":
                    yn = true;
                    this.evento.cancelarUmaInscricao(inscricaoParaCancelar);
                    System.out.println("Inscrição cancelada com sucesso!");
                    break;
                
                case "n":
                    System.out.println("A inscrição não foi cancelada!");
                    yn = true;
                    break;

                default:
                    break;
            }
        
        }

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
                    this.evento.listarTodasInscrições();
                    break;

                case 3:
                    clearScreen();
                    this.getParticipantesNaCategoria();
                    break;

                case 4:
                    clearScreen();
                    this.cancelarInscricao();
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
