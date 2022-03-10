package corrida_na_selva;

import java.util.ArrayList;

public class Evento {
    private ArrayList<Inscricao> incricoes;


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

    public void cancelarUmaInscricao(Inscricao inscricaoASerCancelada) {
        this.incricoes.remove(inscricaoASerCancelada);
    }
}
