package br.com.mercadolivre.parte_02.pratica_integradora_2_exercicio_2;

public class Pereciveis extends Produto{
    private int diasParaVencer;

    public Pereciveis(String nome, Double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public String toString() {
        return super.toString() + "(Dias para vencer: " + this.diasParaVencer + ")";
    }

    @Override
    public Double calcular(int quantidadeDeProdutos) {
        Double precoBruto = super.calcular(quantidadeDeProdutos);

        if(diasParaVencer == 1) {
            return precoBruto * 0.25;
        } else if (diasParaVencer == 2) {
            return precoBruto * (precoBruto/3);
        } else if (diasParaVencer == 3) {
            return precoBruto * 0.5;
        } else {
            return precoBruto;
        }
    }
}
