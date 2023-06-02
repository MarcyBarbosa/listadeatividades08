 public class Pessoa {
    private String nome;
    private int idade;
    private float peso;
    private float altura;
    private float gordura;
    private float perda;
    private float aumento;
    private int evento;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    public void setPerda(float perda) {
        this.perda = perda;
    }

    public float getPerda() {
        return perda;
    }

    public void setGordura(float gordura) {
        this.gordura = gordura;
    }

    public float getGordura() {
        return gordura;
    }

    public void setAumento(float aumento) {
        this.aumento = aumento;
    }

    public float getAumento() {
        return aumento;
    }

    public int envelhecer() {
        return idade++;
    }

    public float engordar(float peso, float gordura) {
        return peso + gordura;
    }

    public float emagrecer(float peso, float perda) {
        return peso - perda;
    }

    public float crescer(float altura, float aumento) {
        return altura + aumento;
    }

    public void setEvento(int evento) {
        this.evento = evento;
    }

    public int getEvento() {
        return evento;
    }

    public double escolhaEvento() {
    switch(evento){
        case 1:
        return engordar(peso, gordura);
        case 2:
        return emagrecer(peso,perda);
        case 3:
        return crescer(altura,aumento);
        default:
        return 0;
    }
  }
} {
    
}
    
}
