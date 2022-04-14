package Calculadora;

public class TestaCalculadora {
    public static void main(String[] args) {
        Calculadora calculadoraSoma = new Calculadora();
        calculadoraSoma.entrada1=15;
        calculadoraSoma.entrada2=20;
        calculadoraSoma.operadorLogico="+";
        calculadoraSoma.calcular();

        //Criar mais objetos subtração - Divisão - Multiplicação

        Calculadora calculadoraSub = new Calculadora();
        calculadoraSoma.entrada1=20;
        calculadoraSoma.entrada2=10;
        calculadoraSoma.operadorLogico="-";
        calculadoraSoma.calcular();



    }
}
