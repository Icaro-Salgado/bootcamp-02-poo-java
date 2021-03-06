package br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_01.models;

import br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_01.transacoes.ConsultaDeSaldo;
import br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_01.transacoes.PagamentoDeServicos;
import br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_01.transacoes.SaqueEmDinheiro;

import java.math.BigDecimal;

public class Basico {

    public void realizarConsultaDeSaldo() {
        ConsultaDeSaldo.consultarSaldo("");
    }

    public void pagarServico() {
        PagamentoDeServicos.pagarServico("", "");
    }

    public void realizarSaque(BigDecimal valor) {
        SaqueEmDinheiro.realizarSaque(valor);
    }
}
