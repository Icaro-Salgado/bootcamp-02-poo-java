package br.com.mercadolivre.exercicio_01.transacoes;

public class Deposito implements Transacao{


    @Override
    public void transacaoOk() {
        System.out.println("Transação ok!");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Transação não ok!");
    }
}
