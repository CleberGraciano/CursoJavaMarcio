package Polimorfismo;

public class TestaFuncionario {

    public static void main(String[] args) {
        System.out.println("========== Funcionario Engenheiro ==========");
        Funcionario objetoEngenheiro = new Funcionario();
        objetoEngenheiro.nome="Pipoca";
        objetoEngenheiro.departamento="Engenharia";
        objetoEngenheiro.valorHora=50;
        objetoEngenheiro.quantidadeHoras=180;

        objetoEngenheiro.exibirValores();
        objetoEngenheiro.calcularSalario(objetoEngenheiro.valorHora, objetoEngenheiro.quantidadeHoras, 50);

        System.out.println("========== Funcionario Diretor ==========");

        Gerente objetoGerente = new Gerente();

        objetoGerente.nome="Rodolfo";
        objetoGerente.departamento="Sistemas";
        double valorHora = objetoGerente.valorHora=100;
        int quantidadeHoras = objetoGerente.quantidadeHoras=50;

        objetoGerente.exibirValores();
        objetoGerente.calcularSalario(valorHora, quantidadeHoras, 20, 1000);


    }

}
