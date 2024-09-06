public class DesvioPadrao {

    private int[] numeros;

    public DesvioPadrao(int[] numeros){
        this.numeros = numeros;
    }

    public DesvioPadrao(){}

    private double retornarMedia(int[] numeros){
        double somatotal = 0;

        for (int i = 0; i < numeros.length; i++) {
            somatotal += numeros[i];
        }
        return somatotal / numeros.length;
    }

    public void calculoVariancia(int[] numeros){
        double media = retornarMedia(numeros);
        double soma = 0.0;
        for (int i = 0; i < numeros.length; i++) {
            soma += Math.pow(numeros[i] - media, 2);
        }
        double resultado = soma / numeros.length;
        System.out.println("A variancia dos dados é " + resultado);
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }
}
