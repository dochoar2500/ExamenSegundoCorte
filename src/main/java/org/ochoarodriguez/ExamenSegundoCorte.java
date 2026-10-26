package org.ochoarodriguez;

import java.util.Scanner;

public class ExamenSegundoCorte {

    static Scanner scanner = new Scanner(System.in);
    static int totalEstudiantes = 0;
    static int aprobados = 0;
    static int reprobados = 0;
    static double sumaPromedios = 0;

    public static void Registrar() {
        System.out.println("=====================================");
        System.out.println("        REGISTRAR ESTUDIANTE");
        System.out.println("=====================================");
        System.out.print("¿Cuántos estudiantes registrará?: ");
        int estud = scanner.nextInt();
        scanner.nextLine();

        int i = 1;
        while (i <= estud) {
            System.out.println("-------------------------------------");
            System.out.println("Estudiante " + i);
            System.out.println("-------------------------------------");

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Evaluación 1: ");
            double cal1 = scanner.nextDouble();
            System.out.print("Evaluación 2: ");
            double cal2 = scanner.nextDouble();
            System.out.print("Evaluación 3: ");
            double cal3 = scanner.nextDouble();
            scanner.nextLine();

            double promedio = (cal1 + cal2 + cal3) / 3;
            System.out.println("Promedio: " + String.format("%.2f", promedio));

            if (promedio >= 6 && promedio <= 10) {
                System.out.println("Resultado: APROBADO");
                aprobados++;
            } else {
                System.out.println("Resultado: REPROBADO");
                reprobados++;
            }

            totalEstudiantes++;
            sumaPromedios += promedio;
            i = i + 1;
        }
    }

    public static void Estadisticas() {
        System.out.println("=====================================");
        System.out.println("       ESTADÍSTICAS DEL GRUPO");
        System.out.println("=====================================");
        System.out.println("Estudiantes registrados: " + totalEstudiantes);
        System.out.println("Estudiantes aprobados: " + aprobados);
        System.out.println("Estudiantes reprobados: " + reprobados);
        double general = 0;
        if (totalEstudiantes > 0) {
            general = sumaPromedios / totalEstudiantes;
        }
        System.out.println("Promedio general: " + String.format("%.2f", general));
        System.out.println("=====================================");
    }

    public static void main(String[] args) {
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("=====================================");
            System.out.println("       CONTROL DE CALIFICACIONES");
            System.out.println("=====================================");
            System.out.println("1. Registrar calificaciones");
            System.out.println("2. Mostrar estadísticas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    Registrar();
                    break;
                case 2:
                    Estadisticas();
                    break;
                case 3:
                    System.out.println("FIN DEL PROGRAMA");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}