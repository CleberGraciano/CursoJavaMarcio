package Heranca;

public class TestaUsuario {
    public static void main(String[] args) {

        Usuario objetoUsuarioMarcio = new Usuario();
        objetoUsuarioMarcio.id=1;
        objetoUsuarioMarcio.nomeUsuario="Marcio";
        objetoUsuarioMarcio.cpf="123456";
        objetoUsuarioMarcio.celular="9989999";
        objetoUsuarioMarcio.endereco.bairro="Centro";
        objetoUsuarioMarcio.endereco.cep="0002558";

    }
}
