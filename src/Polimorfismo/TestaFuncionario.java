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
        objetoEngenheiro.calcularSalario(objetoEngenheiro.valorHora, objetoEngenheiro.quantidadeHoras);

        System.out.println("========== Funcionario Diretor ==========");

    }

}
