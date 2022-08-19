import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) throws Exception{
        Scanner entrada = new Scanner(System.in);
        float nota1;
        float nota2;
        float nota3;
        float parcialNotas;

        System.out.println("Ingrese las notas: ");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();

        parcialNotas = (nota1 + nota2 + nota3) / 3;
        System.out.println("La nota parcial es: " + parcialNotas);
        entrada.close();
    }
}
