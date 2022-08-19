import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) throws Exception {
       Scanner entrada = new Scanner(System.in);
        int baseUs;
        int alturaUs;
        double areaT;

        System.out.println("Ingrese la base del triangulo: ");
        baseUs = entrada.nextInt();
        System.out.println("Ingrese la ultura del triangulo: ");
        alturaUs = entrada.nextInt();

        areaT = (baseUs * alturaUs) / 2;
        System.out.println("El area total del triangulo es: " + areaT);
        entrada.close();
    }
}
