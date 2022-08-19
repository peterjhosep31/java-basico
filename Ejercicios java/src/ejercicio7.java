import java.util.Scanner;

public class ejercicio7 {
    public static void main(String args[]) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int costoTratamiento;
        short diasHospitalizado;
        double costoMedicamentos;
        double totalPagarHospital;

        System.out.println("Ingrese los costos del Tratamiento: ");
        costoTratamiento = entrada.nextInt();
        System.out.println("Ingrese los dias Hospitalizado: ");
        diasHospitalizado = entrada.nextShort();
        System.out.println("Ingrese el costo de los medicamentos: ");
        costoMedicamentos = entrada.nextDouble();

        totalPagarHospital = (diasHospitalizado * 100000)+ costoTratamiento + costoMedicamentos;

        System.out.println("En el hospital debe de pagar: " + totalPagarHospital);
        entrada.close();
    }
}
