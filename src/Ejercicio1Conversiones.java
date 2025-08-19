public class Ejercicio1Conversiones {
    public static double metrosACentimetros(double metros) {
        return metros * 100;
    }

    public static double kilogramosALibras(double kg) {
        return kg * 2.20462;
    }

    public static double celsiusAFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        double metros = 5.5;
        double kg = 70.0;
        double celsius = 25.0;

        System.out.println("=== SISTEMA DE CONVERSIÓN ===");
        System.out.printf("%.2f metros = %.2f centímetros%n", metros, metrosACentimetros(metros));
        System.out.printf("%.2f kilogramos = %.2f libras%n", kg, kilogramosALibras(kg));
        System.out.printf("%.2f°C = %.2f°F%n", celsius, celsiusAFahrenheit(celsius));
    }
}
