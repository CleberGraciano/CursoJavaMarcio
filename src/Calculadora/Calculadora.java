package Calculadora;

public class Calculadora {

    double entrada1;
    String operadorLogico;
    double entrada2;
    double resultado;

    public void calcular(){
        switch (operadorLogico) {
            case "+":
                resultado = entrada1 + entrada2;
                break;
            case "-":
                resultado = entrada1 - entrada2;
                break;
            case "*":
                resultado = entrada1 * entrada2;
                break;
            case "/":
                resultado = entrada1 / entrada2;
                break;
            default:
                System.out.println("Operador invalido!!");
        }
        System.out.println("O Resultado é: "+resultado);
    }


}