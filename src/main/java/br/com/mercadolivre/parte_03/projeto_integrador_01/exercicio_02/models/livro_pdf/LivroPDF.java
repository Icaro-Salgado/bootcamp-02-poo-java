package br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_02.models.livro_pdf;

import br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_02.interfaces.Printable;
import lombok.Builder;

@Builder
public class LivroPDF implements Printable {

    private String titulo, nomeDoAutor;
    private GeneroDeLivro generoDoLivro;
    private int numeroDePaginas;

    @Override
    public void imprimir() {
        System.out.println("Imprimindo livro");
        System.out.println("Titulo: " + titulo);
        System.out.println("Nome do autor: " + nomeDoAutor);
        System.out.println("Genero: " + generoDoLivro);
        System.out.println("Numero de paginas: " + numeroDePaginas);
    }
}
