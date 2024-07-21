import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o cep: ");
        var cep = leitura.nextLine();
        BuscadorCep buscadorCep = new BuscadorCep();

    try {
        Endereco novoEndereco = buscadorCep.buscaEndereco(cep);
        System.out.println(novoEndereco);
        GeradorArquivo gerador = new GeradorArquivo();
        gerador.salvaArquivo(novoEndereco);

    }catch (RuntimeException | IOException e ){
        System.out.println(e.getMessage());
        System.out.println("Finalizou");
    }


    }
}
