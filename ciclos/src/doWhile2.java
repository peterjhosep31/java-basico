import java.util.Scanner;

public class doWhile2 {
 public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int baseUs;
    int alturaUs;
    double areaT;

    do {
        System.out.println("\nPara Salir del programa debe de poner un valor igual a 0.\n\nIngrese la base del triangulo: ");
        baseUs = entrada.nextInt();
        System.out.println("Ingrese la ultura del triangulo: ");
        alturaUs = entrada.nextInt();

        areaT = (baseUs * alturaUs) / 2;
        System.out.println("El area total del triangulo es: " + areaT);
    } while (baseUs == 0 && alturaUs == 0);

    entrada.close();
 }
}
