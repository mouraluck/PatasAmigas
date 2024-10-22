package model;

import java.util.Optional;

public class Animal {

    private Integer idAnimal;
    private String nome;
    private String especie;
    private Integer idade;
    private String historico;
    private Optional<Boolean> statusAdocao;
    private String tutor;

    public Animal(Integer idAnimal, Integer idade, String nome, String especie, String historico, Boolean statusAdocao, String tutor){
        this.idAnimal = idAnimal;
        this.nome = nome;
        this.especie = especie;
        this.historico = historico;
        this.statusAdocao = Optional.ofNullable(statusAdocao);
        this.tutor = tutor;
        this.idade = idade;
    }

    public Integer getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Integer idAnimal) {
        this.idAnimal = idAnimal;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public Optional<Boolean> getStatusAdocao() {
        return statusAdocao;
    }

    public void setStatusAdocao(Boolean statusAdocao) {
        this.statusAdocao = Optional.ofNullable(statusAdocao);
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    @Override
    public String toString() {
        return "Animal: " + nome +
                "especie: " + especie  +
                ", idade: " + idade +
                ", historico: " + historico  +
                ", statusAdocao: " + statusAdocao +
                ", tutor: " + tutor;
    }
}
