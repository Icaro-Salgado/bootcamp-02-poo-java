package br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_02.models.curriculo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Habilidade {
    private String nomeDaHabilidade, descricaoDaHabilidade;
}
