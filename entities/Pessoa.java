package entities;

public class Pessoa {
    protected String nome;
    protected int idade;

    protected String sexo;

    protected boolean ePrioridade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public boolean getEPrioridade() {
        return ePrioridade;
    }

    public Pessoa(String nome, int idade, String sexo, boolean ePrioridade) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.ePrioridade = ePrioridade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", ePrioridade=" + ePrioridade +
                '}';
    }
}

