public class SegundoGrau {

    private double a;
    private double b;
    private double c;
    private double y1;
    private double y2;

    public SegundoGrau(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public SegundoGrau() {

    }


    public boolean calcular(){
        double delta = b*b - (4 * c *a);

        if (delta < 0 ){
            System.out.println("Delta negativo");
            return false;
        }
        double raizDelta = Math.sqrt(delta);
        double denominador = 2 * a;

        y1 = (-b + raizDelta) / denominador;
        y2 = (-b - raizDelta) / denominador;

        System.out.println("y1 = " + y1);
        System.out.println("y2 = " + y2);

        return true;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getY1() {
        return y1;
    }

    public double getY2() {
        return y2;
    }
}