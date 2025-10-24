package ui;

import java.util.Scanner;
import model.*;

/**
 * Clase principal que permite interactuar con el sistema
 * desde la consola (modo texto).
 */
public class SchoolApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SchoolController controller = new SchoolController();
        boolean running = true;

        System.out.println("🏫 Bienvenido al sistema de Computaricemos");
        System.out.println("=========================================");

        while (running) {
            System.out.println("\nMenú principal:");
            System.out.println("1. Agregar computador");
            System.out.println("2. Reportar incidente");
            System.out.println("3. Mostrar computador con más incidentes");
            System.out.println("4. Listar todos los computadores");
            System.out.println("0. Salir");
            System.out.print("👉 Elige una opción: ");
            int option = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (option) {
                case 1:
                    System.out.print("Serial del computador: ");
                    String serial = sc.nextLine();
                    System.out.print("Piso (0-4): ");
                    int floor = sc.nextInt();
                    sc.nextLine();
                    controller.addComputer(serial, floor);
                    break;

                case 2:
                    System.out.print("Serial del computador: ");
                    String s = sc.nextLine();
                    System.out.print("Descripción del incidente: ");
                    String desc = sc.nextLine();
                    System.out.print("Fecha del reporte: ");
                    String date = sc.nextLine();
                    System.out.print("Gravedad (BAJA, MEDIA, ALTA, CRITICA): ");
                    String levelStr = sc.nextLine().toUpperCase();
                    Severity level = Severity.valueOf(levelStr);
                    controller.addIncidentToComputer(s, desc, date, level);
                    break;

                case 3:
                    controller.getComputerWithMostIncidents();
                    break;

                case 4:
                    for (Computer c : controller.getAllComputers()) {
                        System.out.println(c.showData());
                    }
                    break;

                case 0:
                    running = false;
                    System.out.println("👋 Cerrando el sistema...");
                    break;

                default:
                    System.out.println("❗ Opción no válida, intenta otra vez.");
                    break;
            }
        }

        sc.close();
    }
}
