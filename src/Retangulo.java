public class Retangulo extends Forma {
    double base;
    double altura;

    @Override
    public double calculaArea() {
    return this.altura * this.base;
    }
}