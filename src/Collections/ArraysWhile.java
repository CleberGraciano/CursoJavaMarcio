package Collections;

public class ArraysWhile {
    public static void main(String[] args) {

        String nome="Marcio";
        String[] nomes = {"Marcio","Cleber","Mario","Lays","Ana", "fulano", "ciclano", "Joana", "Pedregunda", "Rodolfo"};

        int valor=0;
        while(valor<nomes.length){

            System.out.println(nomes[valor]);

            valor++;
        }
    }
}
