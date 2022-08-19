import java.util.Scanner;

public class for1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1US = 1;
        double numero2US = 1;
        double numero3US = 1;
        double totalSuma = 1;

        for (double i = 0.0 ; totalSuma != i;) {
            System.out.println("----------------------------------\nPara salir del programa debe de poner todos los valores en 0. \ningrese los valores: ");
            numero1US = entrada.nextDouble();
            numero2US = entrada.nextDouble();
            numero3US = entrada.nextDouble();
            totalSuma = numero1US + numero2US + numero3US;
            System.out.println("El total de la suma de los numeros es: " + totalSuma);

        }
        entrada.close();
    }
}
