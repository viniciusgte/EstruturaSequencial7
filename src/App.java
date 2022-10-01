// Area do quadrado e seu dobro
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double largura;
        double area;
        double dobra;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Escreva ao lado a largura do quadrado: ");
        largura = teclado.nextDouble();

        area = (Math.pow(largura, 2));
        dobra = area * 2;

        System.out.println("A área do quadrado é: " + area + " E seu dobro é: " + dobra);
      
        teclado.close();

    }

}