import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        double numero1US;
        double numero2US;
        double numero3US;
        double totalSuma;

        System.out.println("ingrese los valores");
        numero1US = entrada.nextDouble();
        numero2US = entrada.nextDouble();
        numero3US = entrada.nextDouble();

        totalSuma = (numero1US + numero2US + numero3US) * 2;
        System.out.println("El resultado es: " + totalSuma);
        entrada.close();
    }
}
