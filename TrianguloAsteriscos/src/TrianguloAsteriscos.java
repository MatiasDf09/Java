import java.util.Scanner;

public class TrianguloAsteriscos {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la altura del triángulo
        System.out.print("Ingrese la altura del triángulo: ");
        int altura = scanner.nextInt();

        // Imprimir el triángulo de asteriscos
        for (int i = 1; i <= altura; i++) {
            // Imprimir espacios en blanco antes de los asteriscos
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }

            // Imprimir asteriscos
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Ir a la siguiente línea para la siguiente fila
            System.out.println();
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
