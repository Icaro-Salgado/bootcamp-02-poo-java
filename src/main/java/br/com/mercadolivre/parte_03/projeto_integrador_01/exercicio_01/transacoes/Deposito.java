package br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_01.transacoes;

import java.math.BigDecimal;

public class Deposito extends Transacao{

    public static void realizarDeposito(BigDecimal valor) {
        if (validateDeposito(valor)) {
            transacaoOk("Deposito realizado com sucesso");
        } else {
            transacaoNaoOk("Deposito não foi realizado");
        }
    }

    private static boolean validateDeposito(BigDecimal valor) {
        // Eventualmente será necessário uma validação melhor
        return true;
    }
}
