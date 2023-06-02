import java.util.Scanner;
public class PersonData {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();

        System.out.println("Cadastrando Pessoas");
        
        System.out.println("Digite seu nome");
        pessoa.setNome(scanner.next());

        System.out.println("Digite sua idade:");
        pessoa.setIdade(scanner.nextInt());

        System.out.println("Digite seu peso:");
        pessoa.setPeso(scanner.nextFloat());

        System.out.println("Digite sua altura:");
        pessoa.setAltura(scanner.nextFloat());

        System.out.println("Escolha um dos eventos:\n 1-Engordar\n 2-Emagrecer\n 3-Crescer\n 4-Sair");
        pessoa.setEvento(scanner.nextInt());
        pessoa.envelhecer();

        pessoa.getIdade();
        pessoa.getAltura();

        if (pessoa.getIdade() <= 21){
            pessoa.setAltura(pessoa.getAltura() + 0.5f);
        }
    }
}