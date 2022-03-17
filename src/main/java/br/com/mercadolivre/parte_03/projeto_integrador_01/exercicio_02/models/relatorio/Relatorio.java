package br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_02.models.relatorio;

import br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_02.interfaces.Printable;
import lombok.Builder;

import java.math.BigInteger;

@Builder
public class Relatorio implements Printable {
    private String nomeDoAutor, nomeDoRevisor;
    private String texto;

    @Override
    public void imprimir() {
        System.out.println("Imprimindo relatório");
        System.out.println("Autor: ".concat(nomeDoAutor));
        System.out.println("Revisor: ".concat(nomeDoRevisor));
        System.out.println("Texto: ".concat(texto)) ;
    }
}
