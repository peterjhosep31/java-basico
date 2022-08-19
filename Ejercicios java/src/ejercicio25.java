import java.util.Scanner;

public class ejercicio25 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        double porsentaje;
        System.out.println("Ingrese el porsentaje que le aplicara a el sueldo: ");
        porsentaje = entrada.nextInt();
        double porsentajeConvertido;
        porsentajeConvertido = porsentaje / 100;
        int valorUs;
        System.out.println("Ingrese su anterior sueldo");
        valorUs = entrada.nextInt();
        double sueldoNuevo = valorUs * porsentajeConvertido + valorUs;
        System.out.println("Su nuevo suelso es: " + sueldoNuevo);
        entrada.close();
    }
}
