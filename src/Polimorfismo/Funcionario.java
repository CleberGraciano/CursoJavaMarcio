package Polimorfismo;

public class Funcionario {

    String nome;
    String departamento;
    double valorHora;
    int quantidadeHoras;

    public void calcularSalario(double valorHora, int quantidadeHoras){
        System.out.println("Salario: "+valorHora*quantidadeHoras);
    }

    public void calcularSalario(double valorHora, int quantidadeHoras, double comissao){
        double salario = valorHora*quantidadeHoras;
        double retornaRemuneracao = (salario*(comissao/100))+salario;
        System.out.println("Salario: "+ retornaRemuneracao);
    }

    public void calcularSalario(double valorHora, int quantidadeHoras, double comissao, double bonificacao){
        double salario = valorHora*quantidadeHoras;
        double retornaRemuneracao = (salario*(comissao/100))+salario+bonificacao;
        System.out.println("Salario: "+ retornaRemuneracao);
    }


    public void exibirValores(){
        System.out.println("Nome: "+nome);
        System.out.println("Departamento: "+departamento);
        System.out.println("Valor Hora: "+valorHora);
        System.out.println("Quantidade de Horas Trabalhadas: "+quantidadeHoras);
    }


}
