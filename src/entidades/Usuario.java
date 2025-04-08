package entidades;

public class Usuario {
    private String nome;
    private String email;
    private String cargo;

    public Usuario(String nome, String email, String cargo) {
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return nome + " - " + email + " - " + cargo;
    }
}