import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//AED1 - Capítulo 6 - Exercício 3

public class TesteSalarioComissao {

    CalculadoraSalario calc = new CalculadoraSalario();

    @Test
    @DisplayName("Validar salário com vendas <= 1000")
    void validarSalarioFaixa1() {
        double vendas1 = 560;
        double salario1 = calculadoraReferencia(vendas1);
        double teste1 = calc.exemplar(vendas1);
        Assertions.assertEquals(salario1, teste1);
    }

    @Test
    @DisplayName("Validar salário com 1000 < vendas <= 10000")
    void validarSalarioFaixa2() {
        double vendas2 = 7500;
        double salario2 = calculadoraReferencia(vendas2);
        double teste2 = calc.exemplar(vendas2);
        Assertions.assertEquals(salario2, teste2);
    }

    @Test
    @DisplayName("Validar salário com vendas > 10000")
    void validarSalarioFaixa3() {
        double vendas3 = 23000;
        double salario3 = calculadoraReferencia(vendas3);
        double teste3 = calc.exemplar(vendas3);
        Assertions.assertEquals(salario3, teste3);
    }

    double calculadoraReferencia(double vendas) {
        double valorBase = 240, comissao = 0, salario = 0;
        int faixa = 1;
        if (vendas > 1000 && vendas <= 10000) faixa = 2;
        else if (vendas > 10000) faixa = 3;

        switch (faixa) {
            case 1:
                salario = valorBase;
                break;
            case 2:
                comissao = vendas * 0.1;
                salario = comissao + valorBase;
                break;
            case 3:
                comissao = 1000;
                salario = comissao + valorBase;
                break;
        }
        return salario;
    }
}
