package Questao3;

public class Retangulo {
    
    private double ladoA, ladoB;
    
    public void setMudarLados(double novoLadoA, double novoLadoB) {
        ladoA = novoLadoA;
        ladoB = novoLadoB;
    }
    
    public double getLadoA (double novoLadoA) {
        return ladoA;
    }

    public double getLadoB (double novoLadoB) {
        return ladoB;
    }

    public double CalcularArea (){
       return ladoA * ladoB;
    }
    
    public double CalcularPerimetro () {
        return 2 * (ladoA + ladoB);
    }
}
