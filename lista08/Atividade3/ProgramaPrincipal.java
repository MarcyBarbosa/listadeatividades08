package Questao3;

import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Informe o primeiro lado do retângulo: ");
            retangulo.getLadoA(scanner.nextInt());
        System.out.println("Informe o segundo lado do retângulo: ");
            retangulo.getLadoB(scanner.nextInt());
    
        System.out.println("Valor da área: " + retangulo.CalcularArea());
        System.out.println("Valor do perímetro: " + retangulo.CalcularPerimetro());    
        System.out.println("----------------------------");
        
        System.out.println("Qual o tamanho do piso em metros: ");
           double tamanhoPiso = scanner.nextDouble();
           
           System.out.println("Qual o tamanho do rodape em centímetros: ");
            double tamanhoRodapeCM = scanner.nextDouble();
            double tamanhoRodapeM =  tamanhoRodapeCM / 100;
        
            double totalDePisos = retangulo.CalcularArea()/tamanhoPiso;
            double totalDeRodapes = retangulo.CalcularPerimetro()/tamanhoRodapeM;

        System.out.println("A quantidade de pisos necessárias é de: " + totalDePisos);
        System.out.println("A quantidade de rodapés necessárias é de " + totalDeRodapes);


        scanner.close(); 
    }
}