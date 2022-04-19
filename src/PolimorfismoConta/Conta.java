package PolimorfismoConta;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Conta {

    private String nome;
    private String cpf;
    private long agencia;
    private long numeroconta;
    private double saldo;

    public Conta() {
        this.saldo = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public long getAgencia() {
        return agencia;
    }

    public void setAgencia(long agencia) {
        this.agencia = agencia;
    }

    public long getNumeroconta() {
        return numeroconta;
    }

    public void setNumeroconta(long numeroconta) {
        this.numeroconta = numeroconta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double depositar(Conta contaDestino, double valorDeposito){
        return contaDestino.saldo = contaDestino.saldo+valorDeposito;
    }

    public double tranferir(Conta contaOrigem, Conta contaDestino, double valorTransferencia){
        contaDestino.saldo = contaDestino.saldo + valorTransferencia;
        return contaOrigem.saldo = contaOrigem.saldo - valorTransferencia;

    }

    public void exibirExtrato(){
        System.out.println("=============== Extrato do dia: "+ LocalDateTime.now()+" ===============");
        System.out.println("Nome: "+nome);
        System.out.println("Cpf: "+cpf);
        System.out.println("Agencia: "+agencia);
        System.out.println("Conta: "+numeroconta);
        System.out.println("Saldo: "+saldo);
        System.out.println("=======================================================================");
    }

}
