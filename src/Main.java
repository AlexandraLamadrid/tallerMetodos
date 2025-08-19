package ejercicios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== TALLER JAVA 7 - MÉTODOS ===");
            System.out.println("1. Ejercicio 1: Conversión de Unidades");
            System.out.println("2. Ejercicio 2: Sistema de Calificaciones");
            System.out.println("3. Ejercicio 3: Calculadora Avanzada");
            System.out.println("4. Salir");
            System.out.println("===============================");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> Ejercicio1Conversiones.ejecutar();
                case 2 -> Ejercicio2Calificaciones.ejecutar();
                case 3 -> Ejercicio3Calculadora.ejecutar();
                case 4 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción inválida. Intenta de nuevo.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}
