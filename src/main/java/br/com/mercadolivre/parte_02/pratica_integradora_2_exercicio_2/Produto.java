package main.java.br.com.mercadolivre.parte_02.pratica_integradora_2_exercicio_2;

public class Produto {
    private String nome;
    private Double preco;

    public Produto(String nome, Double preco) {
        this.setNome(nome);
        this.setPreco(preco);
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome + ": " + this.preco;
    }

    public Double calcular(int quantidadeDeProdutos) {
        return this.preco * quantidadeDeProdutos;
    }
}
