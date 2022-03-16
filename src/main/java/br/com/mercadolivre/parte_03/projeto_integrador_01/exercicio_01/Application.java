package br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_01;

import br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_01.models.Basico;
import br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_01.models.Cobrador;
import br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_01.models.Executivo;

import javax.sound.midi.Soundbank;
import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) {
        // Teste conta basico
        Basico basico = new Basico();

        System.out.println("===== Basico =====");
        basico.pagarServico();
        basico.realizarConsultaDeSaldo();
        basico.realizarSaque(BigDecimal.valueOf(2.0));
        System.out.println("");

        // Teste conta executivo
        System.out.println("===== Executivo =====");
        Executivo executivo = new Executivo();
        executivo.realizarDeposito(BigDecimal.valueOf(2.0));
        executivo.realizarTransferencia("", BigDecimal.valueOf(2.0));
        System.out.println("");

        // Teste conta cobrador
        System.out.println("===== Cobrador =====");
        Cobrador cobrador = new Cobrador();
        cobrador.consultarSaldo();
        cobrador.realizarSaque(BigDecimal.valueOf(2.0));
        System.out.println("");
    }
}
