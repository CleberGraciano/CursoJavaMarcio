package Collections;

public class StringMetodos {

    public static void main(String[] args) {
        String nome="Marcio";
        char letra = 'C';

        if (nome.charAt(0)==letra) {
            System.out.println("Existe letra "+letra+" no nome");
        }else {
            System.out.println("Não existe letra "+letra+" no nome");
        }
    }
}
