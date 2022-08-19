import java.util.Scanner;

public class ejercicio27 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese las notas del alumno: ");
        float nota1 = entrada.nextFloat();
        float nota2 = entrada.nextFloat();
        System.out.println("Ingrese la nota de los trajos: ");
        float notaTrabajos = entrada.nextFloat();
        System.out.println("Ingrese la nota del examen final: ");
        float notaEvaluacion = entrada.nextFloat();

        double notaFinal = (0.20 * nota1) + (0.20 * nota2) + (0.30 * notaTrabajos) + (0.30 * notaEvaluacion);
        System.out.println("La nota final es de: " + notaFinal);
        entrada.close();
    }
}
