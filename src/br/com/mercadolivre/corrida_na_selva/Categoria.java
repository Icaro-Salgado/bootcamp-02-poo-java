package br.com.mercadolivre.corrida_na_selva;

public class Categoria {
    public String nome, descricao;
    public Integer valor;

    public Categoria(String nome, Integer valor, String descricao){
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
    }
}
