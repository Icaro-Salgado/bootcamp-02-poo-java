package parte_02_pratica_integradora_2_exercicio_2;

public class NaoPereciveis extends Produto{
    private String tipo;

    public NaoPereciveis(String nome, Double preco, String tipo) {
        super(nome, preco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "(Tipo: " + this.tipo + ")";
    }
}
