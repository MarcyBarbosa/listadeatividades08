import java.util.Scanner;

public class ProgramaQuadrado {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        Quadrado quadrado = new Quadrado();

        System.out.println("\nQuadrado");

        System.out.print("Digite o tamanho do lado do quadrado: ");
        quadrado.setLado(scanner.nextDouble());
        System.out.printf("O quadrado tem área de: %.2f", quadrado.calcularArea());

        System.out.print("\nDigite um novo tamanho do lado do quadrado: ");
        quadrado.mudarValorLado(scanner.nextDouble());
        
        System.out.printf("A nova área do quadrado é de: %.2f", quadrado.calcularArea());

        scanner.close();
    }    
}
}
