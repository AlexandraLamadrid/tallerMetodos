package ejercicios;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3Calculadora {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("=== CALCULADORA CIENTÍFICA ===");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Porcentaje");
            System.out.println("7. Raíz cuadrada");
            System.out.println("8. Salir");
            System.out.println("===============================");
            System.out.print("Seleccione una opción: ");

            opcion = leerEntero(sc);

            switch (opcion) {
                case 1 -> { // Suma
                    double a = leerNumero(sc, "Ingrese el primer número: ");
                    double b = leerNumero(sc, "Ingrese el segundo número: ");
                    System.out.println("Resultado: " + (a + b));
                }
                case 2 -> { // Resta
                    double a = leerNumero(sc, "Ingrese el primer número: ");
                    double b = leerNumero(sc, "Ingrese el segundo número: ");
                    System.out.println("Resultado: " + (a - b));
                }
                case 3 -> { // Multiplicación
                    double a = leerNumero(sc, "Ingrese el primer número: ");
                    double b = leerNumero(sc, "Ingrese el segundo número: ");
                    System.out.println("Resultado: " + (a * b));
                }
                case 4 -> { // División con validación
                    double a = leerNumero(sc, "Ingrese el dividendo: ");
                    double b;
                    do {
                        b = leerNumero(sc, "Ingrese el divisor: ");
                        if (b == 0) {
                            System.out.println("⚠️ Error: No se puede dividir entre cero.");
                        }
                    } while (b == 0);
                    System.out.println("Resultado: " + (a / b));
                }
                case 5 -> { // Potencia
                    double base = leerNumero(sc, "Ingrese la base: ");
                    double exp = leerNumero(sc, "Ingrese el exponente: ");
                    System.out.println("Resultado: " + Math.pow(base, exp));
                }
                case 6 -> { // Porcentaje
                    double total = leerNumero(sc, "Ingrese el número: ");
                    double porcentaje = leerNumero(sc, "Ingrese el porcentaje (%): ");
                    System.out.println("Resultado: " + (total * porcentaje / 100));
                }
                case 7 -> { // Raíz cuadrada con validación
                    double num;
                    do {
                        num = leerNumero(sc, "Ingrese el número: ");
                        if (num < 0) {
                            System.out.println("⚠️ Error: No se puede calcular raíz cuadrada de un número negativo.");
                        }
                    } while (num < 0);
                    System.out.println("Resultado: " + Math.sqrt(num));
                }
                case 8 -> System.out.println("👋 Saliendo de la calculadora...");
                default -> System.out.println("⚠️ Opción inválida. Intente de nuevo.");
            }

            System.out.println();
        } while (opcion != 8);
    }

    // === MÉTODOS AUXILIARES ===

    private static double leerNumero(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                return sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("⚠️ Error: debe ingresar un número válido.");
                sc.nextLine(); // limpiar buffer
            }
        }
    }

    private static int leerEntero(Scanner sc) {
        while (true) {
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("⚠️ Error: debe ingresar un número entero.");
                sc.nextLine();

            }

        }

    }
}
