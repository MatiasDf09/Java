import java.util.Scanner ;
public class DivisibilidadYSuma {
    public static void main (String[]args){
        // Creamos un objeto scanner para leer los datos de entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Pedimos al usuario que ingrese el primer valor
        System.out.print("Ingrese el primer numero: ");
        int numero1 = scanner.nextInt();
        // Pedimos al usuario que ingrese el Segundo valor
        System.out.print("Ingrese el Segundo numero: ");
        int numero2 = scanner.nextInt();

        // Realizamos la suma de los valores
        int suma = numero1 + numero2;

        // Determinamos si el primer numero es divisible por el segundo
        if (numero1 % numero2 == 0){
        System.out.println(numero1+" Es Divisible por "+numero2);
    } else {
            System.out.println(numero1+" No es divisible por "+numero2);
        }
        //Mostramos el resultado de la suma]
        System.out.print("El resultado de la suma es: "+suma);
        //Cerramos el objeto scanner
        scanner.close();
    }
}
