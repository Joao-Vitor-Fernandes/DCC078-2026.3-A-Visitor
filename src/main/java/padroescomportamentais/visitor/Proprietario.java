package padroescomportamentais.visitor;

public class Proprietario {

    private String nome;
    private boolean conveniado;

    public Proprietario(String nome, boolean conveniado) {
        this.nome = nome;
        this.conveniado = conveniado;
    }

    public String getNome() {
        return nome;
    }

    public boolean isConveniado() {
        return conveniado;
    }
}