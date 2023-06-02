public class Tamagushi {
    private String nome;
    private int idade;
    private int fome = 6;
    private int saude = 6;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setFome(int fome) {
        this.fome = fome;
    }
    public void setSaude(int saude) {
        this.saude = saude;
    }

    public String alterarNome(String nome) {
        setNome(nome);
        return nome;
    }
    public String retornarNome() {
        return nome;
    }

    public int alterarIdade(int idade) {
        setIdade(idade);
        return idade;
    }
    public String retornarIdade() {
        return idade;
    }

    public String alterarFome(int fome) {
        setFome(fome);
        return fome;
    }
    public String retornarFome() {
        return fome;
    }

    public String alterarSaude(int saude) {
        setSaude(saude);
        return saude;
    }
    public String retornarSaude() {
        return saude;
    }

    public String Humor() {
        int humor = saude + fome;
        if (1 <= humor && humor <= 5) {
            return nome + " está muito triste. Cuide melhor dele!";
        } else if (humor > 5 && humor <= 10) {
            return nome + " está triste. Cuidado.";
        } else if (humor > 10 && humor <= 15) {
            return nome + " está feliz.";
        } else if (humor > 15 && humor <= 20) {
            return nome + " está muito feliz. Parábens!!";
        } else {
            return "Erro";
        }
    }

    public String statusFome() {
        if (fome >= 1 && fome <= 3) {
            return nome + " está com muita fome. Alimente-o! ";
        } else if (fome > 3 && fome <= 5) {
            return nome + " está com fome.";
        } else if (fome > 5 && fome <= 7) {
            return nome + " está bem.";
        } else if (fome > 7 && fome <= 10) {
            return nome + " está satisfeito. Parábens!!";
        } else {
            return "Erro";
        }
    }

    public String statusSaude() {
        if (saude >= 1 && saude <= 3) {
            return nome + " está com muito mal. Trate-o! ";
        } else if (saude > 3 && saude <= 5) {
            return nome + " está mal.";
        } else if (saude > 5 && saude <= 7) {
            return nome + " está bem.";
        } else if (saude > 7 && saude <= 10) {
            return nome + " está muito bem. Parábens!!";
        } else {
            return "Erro";
        }
    }

    private int operation;

    public int getOperation() {
        return operation;
    }
    public void setOperation(int operation) {
        this.operation = operation;
    }

    public String acoes() { 
        switch (operation) {
            case 1:
            setFome(fome);
            if (fome <= 10 ) {
            fome ++;
            return "Que gostoso!!";
            } else {
                return nome + "já está satisfeito. ";
            }
            case 2:
            if (saude <= 10 ) {
                saude ++;
                fome --;
                return "Isso foi muito legal!!";
                } else {
                    return nome + "cansou de brincar ";
                }
            case 3:
            if (saude <= 10 ) {
                saude ++;
                fome --;
                return "Que cochilo bomm!!";
                } else {
                    fome --;
                    return "Que noite boa!";
                }
            default:
            return "Favor, digite um dos números da tabela.";
        }
    }

}
