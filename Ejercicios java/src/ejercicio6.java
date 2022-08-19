import java.util.Scanner;

public class ejercicio6 {
    public static void main(String args[]) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int sueldoUs;
        short HorasEstraUs;
        int sueldoTotalUs;
        System.out.println("Ingrese su sueldo");
        sueldoUs = entrada.nextInt();
        System.out.println("Ingrese las horas estra laborados");
        HorasEstraUs = entrada.nextShort();
        sueldoTotalUs = (HorasEstraUs * 3000) + sueldoUs;
        System.out.println("su sueldo total es de: " + sueldoTotalUs);        entrada.close();
    }
}
