public class Main {
    public static void main(String[] args) {
        // Usamos la funcion double para los numeros reales
        double numeroReal1 = 2.5;
        double numeroReal2 = 3.0;
        double resultadoReal = numeroReal1 * numeroReal2;

        // Multiplicamos  dos numero enteros
        int numeroE1 = 6;
        int numeroE2 = 4;
        int resultadoEntero = numeroE1 * numeroE2;

        // Sumamos los dos resultados
        double suma = resultadoReal + resultadoEntero ;

        // mostramos en pantalla el resultado
        System.out.println("El resultado de los numeros Reales es: " + resultadoReal);
        System.out.println("El resultado de los numeros Enteros es: " + resultadoEntero);
        System.out.println("Suma de las dos multiplicaciones es: " + suma);
    }
}