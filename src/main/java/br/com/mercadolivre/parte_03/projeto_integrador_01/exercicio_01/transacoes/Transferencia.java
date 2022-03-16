package br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_01.transacoes;

import java.math.BigDecimal;

public class Transferencia extends Transacao {

    public static void realizarTransferencia(String contaDestino, BigDecimal valor) {
        if(validateContaDestino() && validateValor()) {
            transacaoOk("Transferencia realizada com sucesso");
        } else {
            transacaoNaoOk("Transferencia não foi realizada");
        }
    }

    private static boolean validateContaDestino() {
        // TODO: Melhorar validação
        return true;
    }

    private static boolean validateValor() {
        // TODO: Melhorar validação
        return true;
    }
}
