import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double precioArt;
        int cantidad;
        double montoRecibido;
        double totalPagar;
        double totalDevolver;

        System.out.println("Ingrese el precio del artıculo");
        precioArt = entrada.nextDouble();
        System.out.println("Ingrese la cantidad de articulos");
        cantidad = entrada.nextInt();
        System.out.println("Ingrese la monto recibido");
        montoRecibido = entrada.nextDouble();


        totalPagar = precioArt * cantidad;
        if (totalPagar <= montoRecibido) {
            totalDevolver = totalPagar - montoRecibido;
            System.out.println("El total a pagar es de: " + totalPagar + " y se le debe de devolver: " + totalDevolver * -1);
        } else {
            System.out.println("Lo lamentamos el monto recibido es insuficiente, te hace falta dinero.");
            entrada.close();
        }
    }
}
