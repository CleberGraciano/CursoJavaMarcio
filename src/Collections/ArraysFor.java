package Collections;

public class ArraysFor {
    public static void main(String[] args) {

        String nome="Marcio";
        String[] nomes = {"Marcio","Cleber","Mario","Lays","Ana", "fulano", "ciclano", "Joana", "Pedregunda", "Rodolfo"};

        for(int valor=nomes.length-1; valor>=0; valor--){
            System.out.println(nomes[valor]);
        }
    }
}


