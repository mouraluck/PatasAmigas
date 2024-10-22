package model;

public class Tutores extends Pessoa implements Papel {

    // Atributos privados da classe Tutores
    private int id_tutor;
    private int animais_custodia;
    private String historico_tutor;
    private Boolean status;

    // Construtor da classe Tutores
    public Tutores(String nome, String nascimento, String genero, String CPF, String logradouro, String numero,String bairro, String cidade, String estado, String pais, String telefone, String email,String hashsenha, int id_tutor, int animais_custodia, String historico_tutor, Boolean status) {

        // Chama o construtor da classe Pessoa para inicializar os atributos que foram herdados
        super(nome, nascimento, genero, CPF, logradouro, numero, bairro, cidade, estado, pais, telefone, email, hashsenha);

        this.id_tutor = id_tutor;
        this.animais_custodia = animais_custodia;
        this.historico_tutor = historico_tutor;
        this.status = status;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Tutor ID: " + id_tutor);
        System.out.println("Animais sob Custódia:" + animais_custodia);
        System.out.printf("Historico de %s: %s\n", this.getNome(), historico_tutor);
        System.out.printf("O status de %s é: %s\n", this.getNome(), status ? "Ativo" : "Inativo");
        //Perguntar a diferença pro Quirino de usar status e de usar o construtor com o this.getStatus()
    }

    // Chama o construtor
    public int getId_tutor() {
        return id_tutor;
    }

    
    // Getters e Setters 
    public void setId_tutor(int id_tutor) {
        this.id_tutor = id_tutor;
    }

    public int getAnimais_custodia() {
        return animais_custodia;
    }

    public void setAnimais_custodia(int animais_custodia) {
        this.animais_custodia = animais_custodia;
    }

    public String getHistorico_tutor() {
        return historico_tutor;
    }

    public void setHistorico_tutor(String historico_tutor) {
        this.historico_tutor = historico_tutor;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

}
