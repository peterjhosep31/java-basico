import java.util.Scanner;

public class ejercicio4 {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        double valorUs;
        System.out.println("Digite un valor");
        valorUs = entrada.nextInt();
        double porsentaje = valorUs * 1.19 - valorUs;
        System.out.println("El 19% de " + valorUs + "es:  " + porsentaje);
        entrada.close();
    }
}
