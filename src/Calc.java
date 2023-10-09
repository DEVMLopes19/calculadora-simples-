import java.util.Scanner;

// Importe para entrada de teclado
public class Calc {
    static public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Declaro acima que o scanner ira receber entradas do teclado.

        Numero n1 = new Numero();
        Numero n2 = new Numero();
        Numero resultado = new Numero();

        System.out.printf("%nDigite o valor 1:");
        n1.setValor(scan.nextInt());
        System.out.printf("%nDigite o valor 2:");
        n2.setValor(scan.nextInt());
        resultado.setValor(n1.getValor() + n2.getValor());
        System.out.printf("%nA soma de %d com %d é igual a %d%n", n1.getValor(), n2.getValor(), resultado.getValor());
        scan.close();
    }
}
