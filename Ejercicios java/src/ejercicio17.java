import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        String nombres;
        String apellidos;
        int identificacion;
        int edad;
        String profecion;

        System.out.println("Ingrese sus nombres: ");
        nombres = entrada.nextLine();
        System.out.println("Ingrese sus apellidos: ");
        apellidos = entrada.nextLine();
        System.out.println("Ingrese su numero de identificacion: ");
        identificacion = entrada.nextInt();
        System.out.println("Ingrese su edad: ");
        edad = entrada.nextInt();
        System.out.println("Ingrese su profecion: ");
        profecion = entrada.next();

        System.out.println("Datos ingresados: \n Nombre Completo: " + nombres + " " + apellidos + "\n Documento: " + identificacion + "\n Edad= " + edad + "\n Profesion: " + profecion + "\n\n Bienvenido!!!");
        entrada.close();
    }
}
