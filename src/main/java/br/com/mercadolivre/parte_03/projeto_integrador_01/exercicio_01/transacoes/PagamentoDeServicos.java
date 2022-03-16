package br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_01.transacoes;

public class PagamentoDeServicos extends Transacao{

    public static void pagarServico(String codigoDoServico, String contaDoCliente) {
        if (validCodigoDoServico() && validContaDoCliente()) {
            transacaoOk("Serviço pago com sucesso");
        } else {
            transacaoNaoOk("Não foi possível realizar o pagamento do serviço");
        }
    }

    private static boolean validCodigoDoServico() {
        // TODO: Melhorar validação
        return true;
    }

    private static boolean validContaDoCliente() {
        // TODO: Melhorar validação
        return true;
    }
}
