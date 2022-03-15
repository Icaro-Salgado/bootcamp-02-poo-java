package br.com.mercadolivre.corrida_na_selva;

import java.util.ArrayList;
import java.util.HashMap;

public class Evento {
    private ArrayList<Inscricao> incricoes = new ArrayList<Inscricao>();
    private HashMap<Integer, Categoria> categorias;

    public Evento() {
        setCategorias();
    }

    private void setCategorias() {

        this.categorias = new HashMap<Integer, Categoria>();

        // Circuito pequeno
        Categoria categoria1 = new Categoria(
                "pequeno_abaixo_18_anos", 1300,
                "Circuito pequeno: 2 km pela selva e riachos. Somente participantes abaixo de 18 anos");
        this.categorias.put(1, categoria1);

        Categoria categoria2 = new Categoria(
                "pequeno_acima_18_anos", 1500,
                "Circuito pequeno: 2 km pela selva e riachos. Somente participantes acima de 18 anos");
        this.categorias.put(2, categoria2);

        // Circuito medio
        Categoria categoria3 = new Categoria(
                "medio_abaixo_18_anos", 2000,
                "Circuito médio: 5 km pela selva, riachos e lama. Somente participantes abaixo de 18 anos");
        this.categorias.put(3, categoria3);

        Categoria categoria4 = new Categoria(
                "medio_acima_18_anos", 2300,
                "Circuito médio: 5 km pela selva, riachos e lama. Somente participantes acima de 18 anos");
        this.categorias.put(4, categoria4);

        // Circuito avançado - adicionar validação de idade
        Categoria categoria5 = new Categoria(
                "avancado", 2800, "Circuito Avançado: 10 km pela selva, riachos, lama e escalada.");
        this.categorias.put(5, categoria5);
    }

    public void adicionarInscricao(Inscricao inscricao) {
        this.incricoes.add(inscricao);
    }

    public void listarTodasInscrições() {
        for (Inscricao inscricao : incricoes) {
            System.out.println(inscricao.toString());
        }
    }

    public void listarParticipantesCategoria(Categoria categoria) {
        for (Inscricao inscricao : incricoes) {
            if (inscricao.categoria.nome.equals(categoria.nome)) {
                System.out.println(inscricao.toString());
            }
        }
    }

    public Inscricao getInscricaoPeloNumeroDaInscricao(Integer numeroDaInscricao) {
        for (Inscricao inscricao : incricoes) {
            if (inscricao.numeroDeInscricao.equals(numeroDaInscricao)) {
                return inscricao;
            }
        }

        return null;
    }

    public void cancelarUmaInscricao(Inscricao inscricaoASerCancelada) {
        this.incricoes.remove(inscricaoASerCancelada);
    }

    public void realizarPagamento(Inscricao inscricaoPagante, int valor) {
        for (Inscricao inscricao : incricoes) {
            if (inscricao.numeroDeInscricao.equals(inscricaoPagante.numeroDeInscricao)) {
                inscricao.pagarInscricao(valor);
            }
        }
    }

    public Integer numeroInscricoes() {
        try {
            return incricoes.size();
        } catch (NullPointerException ne) { // Para caso seja a primeira inscrição
            return 1;
        }
    }

    public Categoria getCategoriaById(Integer id){
        return this.categorias.get(id);
    }
}
