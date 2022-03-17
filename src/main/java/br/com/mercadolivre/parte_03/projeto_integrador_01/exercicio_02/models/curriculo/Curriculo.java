package br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_02.models.curriculo;

import br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_02.interfaces.Printable;
import br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_02.models.curriculo.DadosDeContato;
import br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_02.models.curriculo.DadosPessoais;
import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;

@Builder
@Getter
public class Curriculo implements Printable {

    private DadosPessoais dadosPessoais;
    private DadosDeContato dadosDeContato;
    private ArrayList<Habilidade> habilidades;

    @Override
    public void imprimir() {
        System.out.println("Imprimindo curriculo");
        System.out.println("Dados pessoais: ".concat(dadosPessoais.toString()));
        System.out.println("Dados de contato: ".concat(dadosDeContato.toString()));
        System.out.println("Habilidades: ".concat(habilidades.toString()));
    }
}
