package br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_01.models;

import br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_01.transacoes.Deposito;
import br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_01.transacoes.Transferencia;

import java.math.BigDecimal;

public class Executivo {

    public void realizarDeposito(BigDecimal valorASerDepositado) {
        Deposito.realizarDeposito(valorASerDepositado);
    }

    public void realizarTransferencia(String contaDestino, BigDecimal valor) {
        Transferencia.realizarTransferencia(contaDestino, valor);
    }
}
