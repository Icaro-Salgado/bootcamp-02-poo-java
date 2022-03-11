package parte_02_exercicios;

public class Pessoa {
    private String nome, id;
    private int idade;
    private float peso, altura;

    public Pessoa() {

    }

    public Pessoa(String nome, int idade, String id) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome, String id, int idade, float peso, float altura) {
        this.nome = nome;
        this.id = id;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC() {
        double imc = this.peso / (Math.pow(altura, 2));

        if (imc < 20) {
            return -1;
        } else if (imc < 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean ehMaiorIdade() {
        return idade >= 18;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\n" +
            "Idade: " + this.idade+ "\n" +
            "Peso: " + this.peso+ "\n" +
            "Altura: " + this.altura;
    }

    public String getNome() {
        return nome;
    }

}
