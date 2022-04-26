package Collections;

import java.util.Scanner;

public class Tabuada {

    public static void main(StringMetodos[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o multiplo desejado: ");
        double multiplo = entrada.nextDouble();

        for (int i=1;i<=10;i++){
            System.out.println(multiplo+" X "+i+" = "+(i*multiplo));
        }
    }
}
