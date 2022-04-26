package PolimorfismoConta;

import java.util.ArrayList;
import java.util.List;

public class TestaConta {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();

        Conta objetoContaMarcio = new Conta();
        Conta objetoContaJoao = new Conta();
        Conta objetoContaMaria = new Conta();

        objetoContaMarcio.setNome("Marcio");
        objetoContaMarcio.setAgencia(123);
        objetoContaMarcio.setNumeroconta(12345);
        objetoContaMarcio.setCpf("12345678");
        objetoContaMarcio.depositar(1500);
        contas.add(objetoContaMarcio);
        objetoContaMarcio.exibirExtrato();

        objetoContaJoao.setNome("João");
        objetoContaJoao.setAgencia(456);
        objetoContaJoao.setNumeroconta(25896);
        objetoContaJoao.setCpf("8888888");
        objetoContaJoao.depositar(1500);
        contas.add(objetoContaJoao);
        objetoContaJoao.exibirExtrato();

        objetoContaMaria.setNome("Maria");
        objetoContaMaria.setAgencia(7892);
        objetoContaMaria.setNumeroconta(96587);
        objetoContaMaria.setCpf("999999");
        objetoContaMaria.depositar(1500);
        contas.add(objetoContaMaria);
        objetoContaMaria.exibirExtrato();

        objetoContaMarcio.pix(contas, "999999", 250);

        objetoContaMarcio.exibirExtrato();
        objetoContaMaria.exibirExtrato();
        objetoContaJoao.exibirExtrato();
        

    }
}
