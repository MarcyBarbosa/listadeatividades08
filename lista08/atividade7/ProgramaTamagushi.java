import java.util.Scanner;

public class ProgramaTamagushi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tamagushi tamagushi = new Tamagushi();

        System.out.println("\n\t#### Tamagushi ####");

        System.out.print("Digite o nome do seu Tamagushi: ");
        tamagushi.setNome(scanner.nextLine());
        System.out.println("\nNome do seu Tamagushi definido com sucesso! \nDê olá ao seu novo bichinho " + tamagushi.retornarNome());

        while (true) {
            System.out.printf("\nStatus do seu Tamagushi:\nHumor: %s \nFome: %s \nSaúde: %s ", tamagushi.Humor(),
                    tamagushi.statusFome(), tamagushi.statusSaude());
            System.out.println("\n\nO que deseja fazer com seu Tamagushi: \n1 - Alimentar \n2 - Brincar \n3 - Por pra dormir \n4 - Desligar Tamagushi");
            tamagushi.setOperation(scanner.nextInt());

            if (tamagushi.getOperation() == 4) {
                System.out.println("Volta mais tarde!!");
                break;
            } else if (tamagushi.getOperation() >= 1 && tamagushi.getOperation() <= 3) {
                System.out.println(tamagushi.acoes());
            } else {
                System.out.println("Favor, digite um dos números da tabela.");
            }
        }
        scanner.close();
    }
}
