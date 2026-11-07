package padroescomportamentais.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TarifaVisitorTest {

    @Test
    void deveLancarExcecaoQuandoCarroComPermanenciaInvalida() {
        Carro carro1 = new Carro("Placa 1", "Modelo 1", 0, new Proprietario("Dono 1", false));

        TarifaVisitor visitor = new TarifaVisitor();
        assertThrows(IllegalArgumentException.class, () -> visitor.calcular(carro1));
    }

    @Test
    void deveCalcularTarifaDoCarro() {
        Carro carro1 = new Carro("Placa 1", "Modelo 1", 3, new Proprietario("Dono 1", false));

        TarifaVisitor visitor = new TarifaVisitor();
        assertEquals(22.0, visitor.calcular(carro1), 0.01);
    }

    @Test
    void deveAplicarDescontoNoCarroConveniado() {
        Carro carro1 = new Carro("Placa 1", "Modelo 1", 3, new Proprietario("Dono 1", true));

        TarifaVisitor visitor = new TarifaVisitor();
        assertEquals(17.6, visitor.calcular(carro1), 0.01);
    }

    @Test
    void deveLancarExcecaoQuandoMotoComPermanenciaInvalida() {
        Moto moto1 = new Moto("Placa 1", 150, 0);

        TarifaVisitor visitor = new TarifaVisitor();
        assertThrows(IllegalArgumentException.class, () -> visitor.calcular(moto1));
    }

    @Test
    void deveCalcularTarifaDaMoto() {
        Moto moto1 = new Moto("Placa 1", 150, 4);

        TarifaVisitor visitor = new TarifaVisitor();
        assertEquals(14.0, visitor.calcular(moto1), 0.01);
    }

    @Test
    void deveAplicarAcrescimoNaMotoDeAltaCilindrada() {
        Moto moto1 = new Moto("Placa 1", 600, 4);

        TarifaVisitor visitor = new TarifaVisitor();
        assertEquals(17.5, visitor.calcular(moto1), 0.01);
    }

    @Test
    void deveLancarExcecaoQuandoCaminhaoComPermanenciaInvalida() {
        Caminhao caminhao1 = new Caminhao("Placa 1", 8.0, 0);

        TarifaVisitor visitor = new TarifaVisitor();
        assertThrows(IllegalArgumentException.class, () -> visitor.calcular(caminhao1));
    }

    @Test
    void deveCalcularTarifaDoCaminhao() {
        Caminhao caminhao1 = new Caminhao("Placa 1", 8.0, 2);

        TarifaVisitor visitor = new TarifaVisitor();
        assertEquals(40.0, visitor.calcular(caminhao1), 0.01);
    }

    @Test
    void deveAplicarSobretaxaNoCaminhaoComCargaPesada() {
        Caminhao caminhao1 = new Caminhao("Placa 1", 15.0, 2);

        TarifaVisitor visitor = new TarifaVisitor();
        assertEquals(52.0, visitor.calcular(caminhao1), 0.01);
    }

}