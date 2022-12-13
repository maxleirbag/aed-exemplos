import org.junit.jupiter.api.*;

import java.util.List;

// AED1 - Capítulo 8 - Exemplo 23
public class TesteImpressaoSequencia {

    Impressora impressora = new Impressora();

    @Test
    @DisplayName("Testar impressão de 1 a 5, 5 vezes")
    void sequenciaImpressao1a5() {
        String teste = impressora.sequenciaDeCincoLinhasDe1a5();
        List<String> frasesTeste = List.of(teste.split(","));

        String gabarito = "1 2 3 4 5 \n1 2 3 4 5 \n1 2 3 4 5 \n1 2 3 4 5 \n1 2 3 4 5 ";
        List<String> frasesGabarito = List.of(gabarito.split(","));

        Assertions.assertEquals(frasesGabarito, frasesTeste);
    }

    @RepeatedTest(value = 5, name = "Teste impressão de 1 a 5 repetindo 5x")
    void repetidasSequenciasImpressao1a5(RepetitionInfo repInfo) {
        String teste = impressora.sequenciaDeCincoLinhasDe1a5();

        String[] coisa = teste.split("\n");
        String resultadoEsperado = "1 2 3 4 5 ";
        Assertions.assertEquals(resultadoEsperado, coisa[repInfo.getCurrentRepetition() - 1]);
    }

}
