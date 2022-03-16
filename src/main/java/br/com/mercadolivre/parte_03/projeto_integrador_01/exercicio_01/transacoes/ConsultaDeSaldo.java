package br.com.mercadolivre.parte_03.projeto_integrador_01.exercicio_01.transacoes;

public class ConsultaDeSaldo extends Transacao {

    public static void consultarSaldo(String conta) {
        if (validConta()) {
            transacaoOk("Saldo: R$ 0,00");
        } else {
            transacaoNaoOk("Não foi possivel realizar a consulta de saldo");
        }
    }

    private static boolean validConta() {
        // TODO: Melhorar validação
        return true;
    }
}
