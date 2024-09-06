public class Main {
    public static void main(String[] args) {
        SegundoGrau a1 = new SegundoGrau(1, 3, -4);

        var contaGrau = a1.calcular();
        System.out.println(contaGrau);

        int[] numerosArray = {1,2,3,4,5};
        DesvioPadrao a2 = new DesvioPadrao(numerosArray);

        var contaVari = a2.calculoVariancia(numerosArray);
        System.out.println(contaVari);

        JurosCompostos a3 = new JurosCompostos(1000.0, 0.05, 5,12);

        var contaJuros = a3.calculoJuros();
        System.out.println("Total de juros Composto: " + contaJuros);
    }
}