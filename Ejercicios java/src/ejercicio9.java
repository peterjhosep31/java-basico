import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) throws Exception{
        Scanner entrada = new Scanner(System.in);
        int a;
        int b;
        double x;

        System.out.println("Ingrese el valor de A: ");
        a = entrada.nextInt();
        System.out.println("Ingrese el valor de B: ");
        b = entrada.nextInt();

        x = a + ( b * 2 * a);
        System.out.println("El valor de X es: " + x);
        entrada.close();
    }
}
