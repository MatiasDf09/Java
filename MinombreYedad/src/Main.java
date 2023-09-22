import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese por favor su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese por favor su apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese por favor su edad: ");
        int edad = scanner.nextInt();

        System.out.println("Mi nombre es " + nombre + " " + apellido);
        System.out.println("Y tengo " + edad + " años!!!");

        scanner.close();
    }
}