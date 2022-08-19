import java.util.Scanner;

public class ejercicio24 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int valorUs;
        System.out.println("Ingrese su anterior sueldo");
        valorUs = entrada.nextInt();
        double sueldoNuevo = valorUs * 1.25;
        System.out.println("Su nuevo suelso es: " + sueldoNuevo);
        entrada.close();
    }
}
