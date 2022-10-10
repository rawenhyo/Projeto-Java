public class Pessoas {
    private String nome;
    private String cpf;
    private String email;

    public Pessoas(String nome, String cpf, String email) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEmail(email);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa: {" +
                "nome='" + this.getNome() + '\'' +
                ", cpf='" + this.getCpf() + '\'' +
                ", email='" + this.getEmail() + '\'' +
                '}';
    }
}
