package model;


public class Adotante extends Pessoa implements Papel {

    // Atributos privados da classe Adotantes
    private int id_adotante;
    private String preferencia_adocao;
    //private String historico_adocoes;
    private HistoricoAdotante historico_adotante;
    private Boolean status;


    // Construtor da classe Adotante
    public Adotante(String nome, String nascimento, String genero, String CPF, String logradouro, String numero, String bairro, String cidade, String estado, String pais, String telefone, String email, String hashsenha, int id_adotante, String preferencia_adocao, HistoricoAdotante historico_adotante, Boolean status) {
        
        // Chama o construtor da classe Pessoa para inicializar os atributos que foram herdados
        super(nome, nascimento, genero, CPF, logradouro, numero, bairro, cidade, estado, pais, telefone, email, hashsenha);

        this.id_adotante = id_adotante;
        this.preferencia_adocao = preferencia_adocao;
        this.historico_adotante = historico_adotante;
        this.status = status;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("ID do Adotante: " + id_adotante );
        System.out.println("Preferência de adoção: " + preferencia_adocao);
        System.out.println("Histórico de adoções: " + historico_adotante.toString());
        System.out.printf("O status de %s é: %b\n", this.getNome(), status ? "Ativo" : "Inativo");
    }


    // Chama o construtor
    public int getId_adotante() {
        return id_adotante;
    }


    // Getters e Setters
    public void setId_adotante(int id_adotante) {
        this.id_adotante = id_adotante;
    }

    public String getPreferencia_adocao() {
        return preferencia_adocao;
    }

    public void setPreferencia_adocao(String preferencia_adocao) {
        this.preferencia_adocao = preferencia_adocao;
    }

    public HistoricoAdotante getHistorico_Adotante() {
        return historico_adotante;
    }

    public void setHistorico_adotante(HistoricoAdotante historico_adotante) {
        this.historico_adotante = historico_adotante;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

}
