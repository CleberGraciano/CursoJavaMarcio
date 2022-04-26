package Collections;

//Criar Uma lista de Carros e filtrar os carros que comecem com determinada letra.
public class ListaCarro {
    public static void main(String[] args) {
        String[] carros = {"Fusca","Fiat","Gol","Onix","Ethios","Ka","Ferrari","Fit","Idea","Hilux","Corola","Fusion"};

        for (int contCarros=0;contCarros<carros.length;contCarros++){
            if (carros[contCarros].charAt(0)=='F' || carros[contCarros].charAt(0)=='I') {
                System.out.println(carros[contCarros]);
            }

        }

    }
}
