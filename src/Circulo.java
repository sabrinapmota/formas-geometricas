public class Circulo extends  Forma{
    double raio;

    @Override
    public double calculaArea() {
        return Math.pow(this.raio, 2.0) * 3.14;
    }
}