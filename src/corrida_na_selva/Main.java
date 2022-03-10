package corrida_na_selva;

import java.util.Scanner;

public class Main {

    private static Integer exitOption = 6;
    private static Scanner input = new Scanner(System.in);

    private static void printMenuPrincipal() {
        String[] opcoes = new String[]{
            "1 - Adicionar inscrição",
            "2 - Mostrar todas inscrições",
            "3 - Mostrar todas inscrições em uma categoria",
            "4 - Cancelar uma inscrição",
            "5 - Registrar pagamento",
            "6 - Sair do programa"
        };

        System.out.println("\nMenu principal");
        for (String opcao : opcoes) {
            System.out.println(opcao);
        }
    }

    private static Integer getUserInput() {
        Integer opcao;

        printMenuPrincipal();
        System.out.print("Digite a opção desejada: ");
        
        opcao = input.nextInt();

        return opcao;
    }
    
    public static void main(String[] args) {
        Integer userOption = getUserInput();
        
        while(userOption != exitOption){
            userOption = getUserInput();

            switch (userOption) {
                case 1:
                    System.out.println("1");
                    break;
            
                default:
                    break;
            }
        }

        input.close();
        System.exit(0);
    }
}
