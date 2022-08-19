import java.util.Scanner;

public class while2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int sueldoUs = 1;
        short HorasEstraUs;
        int sueldoTotalUs;
        // String salir = "no";
        while (sueldoUs != 0) {

            System.out.println("Ingrese su sueldo");
            sueldoUs = entrada.nextInt();
            System.out.println("Ingrese las horas estra laborados");
            HorasEstraUs = entrada.nextShort();
            sueldoTotalUs = (HorasEstraUs * 3000) + sueldoUs;
            System.out.println("su sueldo total es de: " + sueldoTotalUs + "\n Para salir debe de poner en el sueldo el numero 0");
            /*
             * System.out.println("¿Desea salir del programa?\n SI o NO");
             * salir = entrada.nextLine();
             * instru lo intente pedir por consola si deseava salir y colocara si o no, pero
             * me sale un error en el main :[
             */
        }
        entrada.close();
    }
}
