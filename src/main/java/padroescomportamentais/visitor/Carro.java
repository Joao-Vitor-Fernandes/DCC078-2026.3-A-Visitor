package padroescomportamentais.visitor;

public class Carro implements Veiculo {

    private String placa;
    private String modelo;
    private int horasPermanencia;
    private Proprietario proprietario;

    public Carro(String placa, String modelo, int horasPermanencia, Proprietario proprietario) {
        this.placa = placa;
        this.modelo = modelo;
        this.horasPermanencia = horasPermanencia;
        this.proprietario = proprietario;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public int getHorasPermanencia() {
        return horasPermanencia;
    }

    public String getNomeProprietario() {
        return this.proprietario.getNome();
    }

    public boolean isProprietarioConveniado() {
        return this.proprietario.isConveniado();
    }

    public double aceitar(Visitor visitor) {
        return visitor.calcularCarro(this);
    }

}