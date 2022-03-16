package br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_01.transacoes;

import java.math.BigDecimal;

public class SaqueEmDinheiro extends Transacao{
    public static void realizarSaque(BigDecimal valor) {
        if(validarValor()) {
            transacaoOk("Saque realizado com sucesso");
        } else {
            transacaoNaoOk("Saque não pode ser realizado");
        }
    }

    private static boolean validarValor() {
        // TODO: Melhorar validação
        return true;
    }
}
