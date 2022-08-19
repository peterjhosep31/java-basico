import java.util.Scanner;

public class for2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor;
        int suma = 1;
        for (int i = 0; i < suma; i++) {
            System.out.println("ingrese un numero");
            valor = entrada.nextInt();
            suma = (valor * (valor + 1)) / 2;
            System.out.println("la suma de todos los numeros naturales anteriores a " + valor + " es: " + suma + "\n\n ingrese el 0 para salir");
        }
        entrada.close();
    }
}
