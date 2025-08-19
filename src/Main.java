import ejercicios.Ejercicio1Conversiones;
import ejercicios.Ejercicio2Calificaciones;

import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("=== CONVERSIÓN DE UNIDADES ===");
                System.out.print("Ingresa metros: ");
                double metros = scanner.nextDouble();
                System.out.println("Centímetros: " + Ejercicio1Conversiones.metrosACentimetros(metros));

                System.out.print("Ingresa kilogramos: ");
                double kg = scanner.nextDouble();
                System.out.println("Libras: " + Ejercicio1Conversiones.kilogramosALibras(kg));

                System.out.print("Ingresa grados Celsius: ");
                double celsius = scanner.nextDouble();
                System.out.println("Fahrenheit: " + Ejercicio1Conversiones.celsiusAFahrenheit(celsius));

                //Ejercicio2

                System.out.println("\n=== CALIFICACIONES ===");
                System.out.print("Nota 1: ");
                double n1 = scanner.nextDouble();
                System.out.print("Nota 2: ");
                double n2 = scanner.nextDouble();
                System.out.print("Nota 3: ");
                double n3 = scanner.nextDouble();

                double promedio = Ejercicio2Calificaciones.calcularPromedio(n1, n2, n3);
                System.out.println("Promedio: " + promedio);
                System.out.println("Letra: " + Ejercicio2Calificaciones.obtenerLetra(promedio));
                System.out.println("Estado: " + (Ejercicio2Calificaciones.estaAprobado(promedio) ? "APROBADO" : "REPROBADO"));
            }



        }