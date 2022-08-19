import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valorUs = 1;
        while (valorUs != 0) {
            System.out.println("-------------------------------------------\nPara Salir del programa debe de poner un valor igual a 0.\n\nDigite un valor");
            valorUs = entrada.nextInt();
            double porsentaje = valorUs * 0.19;
            System.out.println("El 19% de " + valorUs + "es:  " + porsentaje);
        }
        entrada.close();
    }
}
