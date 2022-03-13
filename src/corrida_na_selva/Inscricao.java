package corrida_na_selva;

public class Inscricao {
    public Participante participante;
    public Categoria categoria;

    public Integer numeroDeInscricao;
    
    private Integer valorPago = 0;
    
    public Inscricao(Participante participante, Categoria categoria, Integer valorPago, Integer numeroDaInscricao) {       
        this.participante = participante;
        this.categoria = categoria;
        this.valorPago += valorPago;
        this.numeroDeInscricao = numeroDaInscricao;
    }

    public Integer valorAPagar(){
        return this.categoria.valor - this.valorPago;
    }

    public void pagarInscricao(Integer valor){
        this.valorPago += valor; // Pensar em algo a respeito de pagamentos maiores que o valor da inscrição
    }

    public String toString() {
        
        
        return (
            "==================\n"+
            "Número da inscrição: " + this.numeroDeInscricao + 
            "\n" +
            "Nome do inscrito: " + this.participante.nome + 
            "\n" +
            "Categoria da inscrição: " + this.categoria.nome + 
            "\n==================");
    }
}
