import java.util.Scanner;

public class doWhite {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double costoTratamiento;
        short diasHospitalizado;
        double costoMedicamentos;
        double totalPagarHospital;
        int salir = 0;

        do {
            System.out.println("Ingrese los costos del Tratamiento: ");
            costoTratamiento = entrada.nextInt();
            System.out.println("Ingrese los dias Hospitalizado: ");
            diasHospitalizado = entrada.nextShort();
            System.out.println("Ingrese el costo de los medicamentos: ");
            costoMedicamentos = entrada.nextDouble();

            totalPagarHospital = (diasHospitalizado * 100000) + costoTratamiento + costoMedicamentos;

            System.out.println("En el hospital debe de pagar: " + totalPagarHospital + "\n\n");
            System.out.println("¿Desea salir del programa? \n 0 para salir, cualquier otro numero para continuar");
            salir = entrada.nextInt();

        } while (salir != 0);

        entrada.close();

    }
}
