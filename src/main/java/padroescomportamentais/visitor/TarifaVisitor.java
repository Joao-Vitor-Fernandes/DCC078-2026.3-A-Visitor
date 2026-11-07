package padroescomportamentais.visitor;

public class TarifaVisitor implements Visitor {

    public double calcular(Veiculo veiculo) {
        return veiculo.aceitar(this);
    }

    @Override
    public double calcularCarro(Carro carro) {
        if (carro.getHorasPermanencia() <= 0) {
            throw new IllegalArgumentException("Permanência inválida");
        }

        double valor = Math.min(10 + 6 * (carro.getHorasPermanencia() - 1), 60);

        if (carro.isProprietarioConveniado()) {
            valor = valor * 0.8;
        }

        return valor;
    }

    @Override
    public double calcularMoto(Moto moto) {
        if (moto.getHorasPermanencia() <= 0) {
            throw new IllegalArgumentException("Permanência inválida");
        }

        double valor = 5 + 3 * (moto.getHorasPermanencia() - 1);

        if (moto.getCilindradas() > 500) {
            valor = valor * 1.25;
        }

        return valor;
    }

    @Override
    public double calcularCaminhao(Caminhao caminhao) {
        if (caminhao.getHorasPermanencia() <= 0) {
            throw new IllegalArgumentException("Permanência inválida");
        }

        double valor = 20 * caminhao.getHorasPermanencia();

        if (caminhao.getPesoToneladas() > 10) {
            valor = valor * 1.3;
        }

        return Math.min(valor, 200);
    }
}