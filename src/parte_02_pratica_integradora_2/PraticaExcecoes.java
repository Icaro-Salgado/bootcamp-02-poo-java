package parte_02_pratica_integradora_2;

public class PraticaExcecoes {
    private static final int A=0, B=300;


    public int razaoAB() throws IllegalArgumentException{
        try {
            return B/A;

        } catch(ArithmeticException zd) {
            throw new IllegalArgumentException("Não pode ser divido por zero");
        }
    }
}
