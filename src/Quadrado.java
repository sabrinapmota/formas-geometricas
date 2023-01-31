public class Quadrado extends  Forma {
    double lado;

    public void setLado(double lado) {
        this.lado = lado;
    }

@Override
    public double calculaArea() {
    return this.lado * this.lado;
}

}