import java.util.Scanner;

public class SumaDeDosNumerosBis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Solicitamos al usuario que ingrese el 1er numero
        System.out.print("Ingrese el Primer numero: ");
        int numero1 = scanner.nextInt();

        // Solicitamos al usuario que ingrese el 2do numero
        System.out.print("Ingrese el Segundo numero: ");
        int numero2 = scanner.nextInt();

        // Realizamos la suma de los numeros ingresados por el usuario

        int resultado = numero1 + numero2;

        // Mostramos el resultado en pantalla
        System.out.println("La Suma de los dos numeros es: " + resultado);
        // Determinamos si el numero es par o impar
        if (resultado % 2 == 0) {
            System.out.println("El resultado es de la suma es par");
        } else {
            System.out.println("El resultado de la suma es impar");
        }
        scanner.close();
    }
}