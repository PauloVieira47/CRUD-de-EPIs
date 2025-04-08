package entidades;

public class Devolucao {
    private String funcionario;
    private String epiDevolvido;

    public Devolucao(String funcionario, String epiDevolvido) {
        this.funcionario = funcionario;
        this.epiDevolvido = epiDevolvido;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public String getEpiDevolvido() {
        return epiDevolvido;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public void setEpiDevolvido(String epiDevolvido) {
        this.epiDevolvido = epiDevolvido;
    }

    @Override
    public String toString() {
        return funcionario + " - " + epiDevolvido;
    }
}
