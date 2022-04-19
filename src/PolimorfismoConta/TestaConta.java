package PolimorfismoConta;

public class TestaConta {
    public static void main(String[] args) {

        Conta objetoContaOrigem = new Conta();

        objetoContaOrigem.setNome("Marcio");
        objetoContaOrigem.setAgencia(123);
        objetoContaOrigem.setNumeroconta(12345);
        objetoContaOrigem.setCpf("12345678");
        objetoContaOrigem.exibirExtrato();

        objetoContaOrigem.depositar(objetoContaOrigem,500);

        objetoContaOrigem.exibirExtrato();

    }
}
