package padroescomportamentais.visitor;

public class Caminhao implements Veiculo {

    private String placa;
    private double pesoToneladas;
    private int horasPermanencia;

    public Caminhao(String placa, double pesoToneladas, int horasPermanencia) {
        this.placa = placa;
        this.pesoToneladas = pesoToneladas;
        this.horasPermanencia = horasPermanencia;
    }

    public String getPlaca() {
        return placa;
    }

    public double getPesoToneladas() {
        return pesoToneladas;
    }

    public int getHorasPermanencia() {
        return horasPermanencia;
    }

    public double aceitar(Visitor visitor) {
        return visitor.calcularCaminhao(this);
    }

}