package br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_02;

import br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_02.models.curriculo.Curriculo;
import br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_02.models.curriculo.DadosDeContato;
import br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_02.models.curriculo.DadosPessoais;
import br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_02.models.curriculo.Habilidade;
import br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_02.models.livro_pdf.GeneroDeLivro;
import br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_02.models.livro_pdf.LivroPDF;
import br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_02.models.relatorio.Relatorio;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        // Teste curriculo
        DadosPessoais dadosPessoais = DadosPessoais.builder().nome("Icaro").build();
        DadosDeContato dadosDeContato = DadosDeContato.builder().endereco("Rua dos tolos, numero 0").build();

        ArrayList<Habilidade> habilidades = new ArrayList<>();
        habilidades.add(new Habilidade("Java Avançado", "Linguagem Java"));

        Curriculo curriculo = Curriculo.builder()
                .dadosPessoais(dadosPessoais)
                .dadosDeContato(dadosDeContato)
                .habilidades(habilidades)
                .build();

        System.out.println("====== Curriculo ======");
        curriculo.imprimir();
        System.out.println();

        // Teste livro em PDF
        LivroPDF livroPDF = LivroPDF.builder()
                .titulo("Guia de mochileiro das galaxias")
                .generoDoLivro(GeneroDeLivro.FICÇÃO).
                        nomeDoAutor("Douglas Adams")
                .numeroDePaginas(123)
                .build();

        System.out.println("====== Livro em PDF ======");
        livroPDF.imprimir();
        System.out.println();

        // Teste Relatório
        System.out.println("====== Relatório ======");
        Relatorio relatorio = Relatorio.builder()
                .nomeDoAutor("Icaro")
                .nomeDoRevisor("Cara muito bom")
                .texto("~Artigo muito bom escrito~")
                .build();
        relatorio.imprimir();
        System.out.println();
    }
}
