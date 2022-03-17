package br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_03.model;

import br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_03.interfaces.AnimalHerbivoro;

public class Vaca implements AnimalHerbivoro {
    @Override
    public void emitirSom() {
        System.out.println("Mu");
    }

    @Override
    public void comerPasto() {
        System.out.println("Vaquinha pastando....");
    }
}
