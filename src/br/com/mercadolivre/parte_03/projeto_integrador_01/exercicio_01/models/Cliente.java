package br.com.mercadolivre.exercicio_01.models;

import br.com.mercadolivre.exercicio_01.transacoes.Transacao;

public interface Cliente {

    void realizarTransacao(Transacao transacao);
}
