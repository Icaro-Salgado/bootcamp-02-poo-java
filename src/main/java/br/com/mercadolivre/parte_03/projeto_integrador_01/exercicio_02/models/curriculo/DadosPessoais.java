package br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_02.models.curriculo;

import lombok.Builder;
import lombok.ToString;

@ToString
@Builder
public class DadosPessoais {
    private String nome="", sobrenome="", titulo="";
    private int idade=0;
}
