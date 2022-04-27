package Collections;

import java.util.Scanner;

//Uma lista de Livros filtrando todos os livros que comecem com a letra 'C', e exiba os livros filtrados e a
//        quantidade de livros com aquela determinada Letra.
//        A quantidade de Livros com a letra 'C' é: 5
public class ListaLivros {
    public static void main(String[] args) {
        String[] livros = {"Orgulho e Preconceito - Jane Austen", "1984 - George Orwell",
                "Dom Quixote de la Mancha - Miguel de Cervantes", "O Pequeno Príncipe - Antoine de Saint-Exupéry",
                "Dom Casmurro - Machado de Assis", "O Bandolim do Capitão Corelli - Louis de Bernières",
                "O Conde de Monte Cristo - Alexandre Dumas", "Ilíada – Homero", "Odisséia – Homero",
                "Hamlet – William Shakespeare", "Dom Quixote – Miguel Cervantes", "A Divina Comédia – Dante Alighieri",
                "Em Busca do Tempo Perdido – Marcel Proust", "Ulysses – James Joyce", "Guerra e Paz – Leon Tolstoi",
                "Amor e gelato (Jenna Evans Welch)",
                "O avesso da pele (Jeferson Tenório)", "Lucas: a Esperança do Último (Juliano Loureiro)",
                "Vermelho, branco e sangue azul (Casey McQuiston)",
                "Enquanto eu não te encontro (Pedro Rhuas)", "A riqueza da vida simples (Gustavo Cerbasi)",
                "Outros livros para ler em 2022", "1984, de George Orwell", "Uma breve história do tempo, de Stephen Hawking",
                "Uma Comovente Obra de Espantoso Talento, de Dave Eggers", "Muito longe de casa: memórias de um menino-soldado, de Ishmael Beh"};

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o item de pesquisa desejada: ");
        char letraDesejada = sc.next().charAt(0);
        int quantidadeLivros = 0;

        while (letraDesejada != 0) {
            for (int i = 0; i < livros.length; i++) {
                if (livros[i].toUpperCase().charAt(0) == letraDesejada || livros[i].toLowerCase().charAt(0) == letraDesejada) {
                    System.out.println(livros[i]);
                    quantidadeLivros++;
                }
            }
            System.out.println("A Quantidade de Livros que começam com a letra '" + letraDesejada + "' é: " + quantidadeLivros);

            quantidadeLivros=0;

            System.out.println("=======================================================================");

            System.out.println("Digite o item de pesquisa desejada ou 0 para sair: ");
            letraDesejada = sc.next().charAt(0);
        }
    }
    

}
