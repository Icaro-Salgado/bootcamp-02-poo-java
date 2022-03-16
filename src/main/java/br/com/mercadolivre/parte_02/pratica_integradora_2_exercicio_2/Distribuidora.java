package main.java.br.com.mercadolivre.parte_02.pratica_integradora_2_exercicio_2;

import java.util.ArrayList;

public class Distribuidora {

    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<Produto>();

        produtos.add(new Pereciveis("Alcatra", 49.99, 7));
        produtos.add(new Pereciveis("Extrato de tomate", 9.99, 365));
        produtos.add(new Pereciveis("Queijo ralado", 10.99, 3));
        produtos.add(new Pereciveis("Salmão resfriado", 69.99, 1));
        produtos.add(new Pereciveis("Pão sirio", 9.99, 2));

        produtos.add(new NaoPereciveis("Oleo", 7.99, "Cesta básica"));
        produtos.add(new NaoPereciveis("Arroz", 19.99, "Cesta básica"));
        produtos.add(new NaoPereciveis("Farinha de trigo", 6.99, "Cesta básica"));
        produtos.add(new NaoPereciveis("Omo Lava Roupas", 20.99, "Produtos de limpeza"));
        produtos.add(new NaoPereciveis("Lampada LED", 29.99, "Casa"));

        Double precoTotal = 0.0;
        for (Produto produto : produtos) {
            System.out.println(produto);
            precoTotal += produto.getPreco();
        }

        System.out.println("===================");
        System.out.println("Preco total: R$" + precoTotal);
    }
}
