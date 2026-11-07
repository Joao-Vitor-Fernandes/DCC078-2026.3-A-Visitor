package padroescomportamentais.visitor;

public interface Visitor {

    double calcularCarro(Carro carro);
    double calcularMoto(Moto moto);
    double calcularCaminhao(Caminhao caminhao);
}
