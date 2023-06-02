import java.util.Scanner;

public class ModeleBola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bola bola = new Bola();

        System.out.print("Informe a cor da bola: ");
        String cor = scanner.nextLine();
        bola.setCor(cor);

        double circunferencia = 0;
        boolean entradaValida = false;
        while (!entradaValida) {
            System.out.print("Informe a circunferência da bola (em números inteiros): ");
            String circunferenciaStr = scanner.nextLine();
            try {
                circunferencia = Double.parseDouble(circunferenciaStr);
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Digite um número inteiro para a circunferência.");
            }
        }
        bola.setCircunferencia(circunferencia);

        System.out.print("Informe o material da bola: ");
        String material = scanner.next();
        bola.setMaterial(material);

        System.out.println("\nCor da bola: " + bola.getCor());
        System.out.println("Circunferência da bola: " + bola.getCircunferencia());
        System.out.println("Material da bola: " + bola.getMaterial());

        String alterarCor;
        do {
            System.out.println("\nDeseja alterar a cor da bola?");
            System.out.println("\nNao \nSim");
            scanner.nextLine();
            alterarCor = scanner.nextLine();
            if (alterarCor.equalsIgnoreCase("sim")) {
                System.out.print("Informe a nova cor da bola: ");
                cor = scanner.nextLine();
                bola.setCor(cor);
                System.out.println("Cor da bola alterada para: " + bola.getCor());
            }
        } while (!alterarCor.equalsIgnoreCase("nao"));
        
        System.out.println("\nCor final da bola: " + bola.getCor());
        System.out.println("Circunferência final da bola: " + bola.getCircunferencia());
        System.out.println("Material final da bola: " + bola.getMaterial());
        System.out.println("\nFinalizado");
        
        scanner.close();
    }
}