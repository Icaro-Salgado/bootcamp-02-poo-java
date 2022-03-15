package br.com.mercadolivre.exercicio_01;

import br.com.mercadolivre.exercicio_01.models.Basico;
import br.com.mercadolivre.exercicio_01.transacoes.ConsultaDeSaldo;

public class Application {

    public static void main(String[] args) {
        Basico basico = new Basico();

        ConsultaDeSaldo consultaDeSaldo = new ConsultaDeSaldo();

        basico.realizarTransacao(consultaDeSaldo);
    }
}
