import java.util.Scanner;

public interface ejercicio21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double porsentaje = 0.10;
        int horasTrabajadas;
        double salario;
        double descuento;

        System.out.println("Ingrese las horas trabajadas: ");
        horasTrabajadas = entrada.nextInt();

        salario = horasTrabajadas * 2000;
        descuento = ((salario * porsentaje) - salario) * -1;

        System.out.println("Su salario seria de: " + descuento);
        entrada.close();
    }
}
