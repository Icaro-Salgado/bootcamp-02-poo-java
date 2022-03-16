package br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_01.models;

import br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_01.transacoes.ConsultaDeSaldo;
import br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_01.transacoes.SaqueEmDinheiro;

import java.math.BigDecimal;

public class Cobrador {
    public void realizarSaque(BigDecimal valor) {
        SaqueEmDinheiro.realizarSaque(valor);
    }

    public void consultarSaldo() {
        ConsultaDeSaldo.consultarSaldo("");
    }
}
