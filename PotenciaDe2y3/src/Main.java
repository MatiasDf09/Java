import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Pedimos al usuario un numero
        System.out.print("Ingrese un numero: ");
        int n = scanner.nextInt();
        //Hacamos la potencia al cuadrado
        int np2 = n * n ;
        //Hacemos la potencia al cubo
        int np3 = n * n * n ;
        //Mostramos en pantalla los resultados
        System.out.println("El numero ingreso al cuadrado es: " + np2);
        System.out.println("El numero ingresado al cubo es: " + np3);
        //Cerramos el scanner
        scanner.close();

    }
}