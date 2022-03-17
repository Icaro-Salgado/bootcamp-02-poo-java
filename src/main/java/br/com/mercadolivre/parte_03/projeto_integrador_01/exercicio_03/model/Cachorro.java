package br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_03.model;

import br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_03.interfaces.AnimalCarnivoro;

public class Cachorro implements AnimalCarnivoro {
    @Override
    public void emitirSom() {
        System.out.println("Auau");
    }

    @Override
    public void comerCarne() {
        System.out.println("Doguinho comendo carne...");
    }
}
