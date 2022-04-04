public class Calculadora {

    double entrada1;
    String operadorLogico;
    double entrada2;
    double resultado;

    public void calcular(){
        if (operadorLogico.equals("+")) {
            resultado = entrada1 + entrada2;
        }else if (operadorLogico.equals("-")){
            resultado = entrada1 - entrada2;
        } else if (operadorLogico.equals("*")){
            resultado = entrada1 * entrada2;
        } else if (operadorLogico.equals("/")){
            resultado = entrada1 / entrada2;
        }else {
            System.out.println("Operador invalido!!");
        }
        System.out.println("O Resultado é: "+resultado);
    }


}