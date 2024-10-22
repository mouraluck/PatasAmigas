package model;

public class HistoricoAdotante {
    private String descricao;
    private int numeroAdocoes;

    // Construtor, getters e setters
    public HistoricoAdotante(String descricao, int numeroAdocoes) {
        this.descricao = descricao;
        this.numeroAdocoes = numeroAdocoes;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNumeroAdocoes() {
        return numeroAdocoes;
    }

    public void setNumeroAdocoes(int numeroAdocoes) {
        this.numeroAdocoes = numeroAdocoes;
    }

    @Override
    public String toString() {
        return "\nDescricao: " + descricao + " \nNúmero de adoções: " + numeroAdocoes;
    }
}
