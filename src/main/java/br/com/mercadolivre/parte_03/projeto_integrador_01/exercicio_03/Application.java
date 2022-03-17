package br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_03;

import br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_03.interfaces.Animal;
import br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_03.interfaces.AnimalCarnivoro;
import br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_03.interfaces.AnimalHerbivoro;
import br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_03.model.Cachorro;
import br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_03.model.Gato;
import br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_03.model.Vaca;

public class Application {

    private static void comerAnimal(Animal animal) {
        if (animal instanceof AnimalCarnivoro) {
            ((AnimalCarnivoro) animal).comerCarne();

        } else if (animal instanceof AnimalHerbivoro) {
            ((AnimalHerbivoro) animal).comerPasto();
        }
    }

    public static void main(String[] args) {
        Vaca vaca = new Vaca();
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        System.out.println("=== Implementação direta ===");
        vaca.emitirSom();
        vaca.comerPasto();
        System.out.println();

        cachorro.emitirSom();
        cachorro.comerCarne();
        System.out.println();

        gato.emitirSom();
        gato.comerCarne();
        System.out.println();

        System.out.println("=== Implementação do comerAnimal ===");
        comerAnimal(vaca);
        comerAnimal(cachorro);
        comerAnimal(gato);
    }
}
