public class Triangulo extends  Forma{
    double base;
    double altura;

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
    return (this.altura * this.base) /2 ;
    }
}