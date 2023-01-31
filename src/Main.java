import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Selecione a forma cuja área você deseja calcular:");
        System.out.println("1 para quadrado");
        System.out.println("2 para retângulo");
        System.out.println("3 para triângulo");
        System.out.println("4 para círculo");

        int opcao = input.nextInt();

        if (opcao == 1) {
            Quadrado quadrado = new Quadrado();
            System.out.println("digite o comprimento do lado em metros. Exemplo: 0,3 quer dizer 30 cm");
            double lado = input.nextDouble();
            quadrado.setLado(lado);
            double resultado = quadrado.calculaArea();
            System.out.println("a área do quadrado é igual a " + resultado);
        }
        else if (opcao == 2) {
            System.out.println("Digite o tamanho da base do triângulo retângulo em metros. Exemplo: 0,3 significa 30 centímetros.");
            double base = input.nextDouble();
            System.out.println("Digite o tamanho da altura em metros (0,5 = 50 centímetros)");
            double altura = input.nextDouble();
            Triangulo triangulo = new Triangulo();
                    triangulo.setBase(base);
                    triangulo.setAltura(altura);
                    double resultado = triangulo.calculaArea();
            System.out.println("A área do triângulo retângulo é igual a " + resultado);
        }
        else {
            System.out.println("programa encerrado");
        }
    }
}