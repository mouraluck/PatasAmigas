package heranca;

public class Pessoa {

    private String nome;
    private String nascimento;
    private String genero;
    private String CPF;
    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;
    private String telefone;
    private String email;
    private String hashsenha;

    public Pessoa(String nome, String nascimento, String genero, String CPF, String logradouro, String numero,
            String bairro, String cidade, String estado, String pais, String telefone, String email, String hashsenha) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.genero = genero;
        this.CPF = CPF;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.telefone = telefone;
        this.email = email;
        this.hashsenha = hashsenha;

    }

    public Pessoa() {

    }

    public void ToString() {
        System.out.println("Nome: " + nome);
        System.out.println("Nascimento: " + nascimento);
        System.out.println("Gênero: " + genero);
        System.out.println("CPF: " + CPF);
        System.out.println("Endereço: " + logradouro + ", " + numero + ", " + bairro + ", " + cidade + ", " + estado + ", " + pais);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println("Hash da senha: " + hashsenha);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHashsenha() {
        return hashsenha;
    }

    public void setHashsenha(String hashsenha) {
        this.hashsenha = hashsenha;
    }

}
