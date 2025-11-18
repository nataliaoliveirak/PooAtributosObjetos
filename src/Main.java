import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {


        Cachorro cachorro1 = new Cachorro("bob", "azul", 5,48, 6.7,"feliz");

        System.out.println("Nome: " + cachorro1.getNome());
        System.out.println("Cor: " + cachorro1.getCor());
        System.out.println("Altura: " + cachorro1.getAltura() + " cm");
        System.out.println("Tamanho do Rabo: " + cachorro1.getTamanhoDoRabo() + " cm");
        System.out.println("Peso: " + cachorro1.getPeso() + " kg");
        System.out.println("Estado de Espírito: " + cachorro1.getEstadoDeEspirito());

    }
}