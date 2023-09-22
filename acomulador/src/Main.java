public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        double acomulador = 0.0;

        for (int i = 1; i <= 15; i++){
            double resultado = (double)(num1 * num2) / i;
            acomulador += resultado;
        }

        System.out.println("El resultado de la acomulacion es: " + acomulador);
    }

}