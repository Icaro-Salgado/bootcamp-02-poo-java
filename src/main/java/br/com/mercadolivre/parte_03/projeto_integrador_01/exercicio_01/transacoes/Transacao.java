package br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_01.transacoes;

public abstract class Transacao {
    static void transacaoOk(String msg){
        System.out.println(msg);
    };

    static void transacaoNaoOk(String msg){
        System.out.println(msg);
    };
}
