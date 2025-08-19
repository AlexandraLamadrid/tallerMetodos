package ejercicios;

public class Ejercicio2Calificaciones {

    public static double calcularPromedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    public static String obtenerLetra(double promedio) {
        if (promedio >= 90) return "A";
        else if (promedio >= 80) return "B";
        else if (promedio >= 70) return "C";
        else if (promedio >= 60) return "D";
        else return "F";
    }

    public static boolean aprobado(double promedio) {
        return promedio >= 70;
    }

    public static void ejecutar() {
        String estudiante = "PICAPIEDRA, Pedro";
        String usuario = "pedro.picapiedra";
        double n1 = 85, n2 = 92, n3 = 78;

        double promedio = calcularPromedio(n1, n2, n3);
        String letra = obtenerLetra(promedio);
        boolean estado = aprobado(promedio);

        System.out.println("=== REPORTE DE ESTUDIANTE ===");
        System.out.println("Estudiante: " + estudiante);
        System.out.println("Usuario: " + usuario);
        System.out.printf("Calificaciones: %.1f, %.1f, %.1f\n", n1, n2, n3);
        System.out.printf("Promedio: %.2f\n", promedio);
        System.out.println("Calificación: " + letra);
        System.out.println("Estado: " + (estado ? "APROBADO" : "REPROBADO"));
    }
}
