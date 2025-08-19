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

    public static boolean estaAprobado(double promedio) {
        return promedio >= 70;
    }




}

