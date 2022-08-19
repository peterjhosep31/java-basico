import java.util.Scanner;

public class ejercicio26 {
    public static void main(String[] args)  throws Exception{
        Scanner entrada = new Scanner(System.in);
        int valor;
        int suma;
        System.out.println("ingrese un numero");
        valor = entrada.nextInt();
        suma = (valor * (valor + 1)) / 2;
        System.out.println("la suma de todos los numeros naturales anteriores a " + valor + " es: " + suma);
        entrada.close();
    }
}
