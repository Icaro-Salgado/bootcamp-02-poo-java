package br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_03.model;

import br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_03.interfaces.AnimalCarnivoro;

public class Gato implements AnimalCarnivoro {
    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    @Override
    public void comerCarne() {
        System.out.println("Gatenho comendo carne...");
    }
}
