package entidades;

public class Emprestimo {
    private String funcionario;
    private String epi;

    public Emprestimo(String funcionario, String epi) {
        this.funcionario = funcionario;
        this.epi = epi;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public String getEpi() {
        return epi;
    }

    public void setEpi(String epi) {
        this.epi = epi;
    }

    @Override
    public String toString() {
        return funcionario + " - " + epi;
    }
}
