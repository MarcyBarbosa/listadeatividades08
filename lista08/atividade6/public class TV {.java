public class TV {
    private int canal;
    private int volume;

    public TV() {
        canal = 1; // Canal inicial padrão
        volume = 50; // Nível de volume inicial padrão
    }

    public void setCanal(int novoCanal) {
        if (novoCanal >= 1 && novoCanal <= 100) {
            canal = novoCanal;
            System.out.println("Canal alterado para: " + canal);
        } else {
            System.out.println("Canal inválido! Por favor, informe um número de canal entre 1 e 100.");
        }
    }

    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
            System.out.println("Volume aumentado para: " + volume);
        } else {
            System.out.println("O volume já está no nível máximo.");
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume diminuído para: " + volume);
        } else {
            System.out.println("O volume já está no nível mínimo.");
        }
    }

    public static void main(String[] args) {
        TV minhaTV = new TV();
        minhaTV.setCanal(5);
        minhaTV.aumentarVolume();
        minhaTV.aumentarVolume();
        minhaTV.diminuirVolume();
        minhaTV.setCanal(120);
        minhaTV.setCanal(50);
    }
}
