package padroescomportamentais.visitor;

public class Moto implements Veiculo {

    private String placa;
    private int cilindradas;
    private int horasPermanencia;

    public Moto(String placa, int cilindradas, int horasPermanencia) {
        this.placa = placa;
        this.cilindradas = cilindradas;
        this.horasPermanencia = horasPermanencia;
    }

    public String getPlaca() {
        return placa;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public int getHorasPermanencia() {
        return horasPermanencia;
    }

    public double aceitar(Visitor visitor) {
        return visitor.calcularMoto(this);
    }

}