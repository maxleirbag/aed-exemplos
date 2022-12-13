public class CalculadoraSalario {

    public double exemplar(double vendas) {

        double salario = 0;
        System.out.println(vendas);
        if (vendas <= 1000)
            salario = 240;
        else if (vendas <= 10000) {
            salario = 240 + vendas * .1;
        } else salario = 240 + 1000;
        return salario;
    }
}
