public class Impressora {

    public static void main(String[] args) {
        System.out.println(sequenciaDeCincoLinhasDe1a5());
    }

    public static String sequenciaDeCincoLinhasDe1a5() {
        StringBuilder texto = new StringBuilder();

        for (int linha = 1; linha <= 5; linha++) {
            StringBuilder temporario = new StringBuilder();

            for (int coluna = 1; coluna <= 5; coluna++) {
                temporario.append(coluna).append(" ");
            }
            texto.append(temporario);
            if (linha < 5) {
                texto.append("\n");
            }
        }
        return texto.toString();
    }
}