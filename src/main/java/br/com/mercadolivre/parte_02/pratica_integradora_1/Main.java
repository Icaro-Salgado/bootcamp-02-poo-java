package main.java.br.com.mercadolivre.parte_02.pratica_integradora_1;

public class Main {

    public static void main(String[] args) {
        // Pessoa zeNinguem = new Pessoa();
        // Pessoa cidadoIncompleto = new Pessoa("Alguma combinação de letras", 101); // Isso vai quebrar
        Pessoa novaGeracao = new Pessoa("Enzo", "2021", 18, 80.5f, 1.91f);

        System.out.println(novaGeracao);

        System.out.println(novaGeracao.ehMaiorIdade() ? novaGeracao.getNome() + " é maior de dade"
                : novaGeracao.getNome() + " não é maior de idade");

        double imcNovaGeração = novaGeracao.calcularIMC();

        if (imcNovaGeração < 0) {
            System.out.println(novaGeracao.getNome() + " está abaixo do peso");
        } else if (imcNovaGeração == 0) {
            System.out.println(novaGeracao.getNome() + " está com peso saudavél");
        } else {
            System.out.println(novaGeracao.getNome() + " está acima do peso");
        }
    }
}
