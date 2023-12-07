import java.util.Scanner;

public class Menu {
    public static void menu(ListaAeropuerto listaAeropuerto, ListaVuelos listaVuelos){
        Output output = new Output();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("MENU:");
            System.out.println("1- listado de Aeropueros");
            System.out.println("2- listado de las salidas por cada Aeropuerto");
            System.out.println("3- listado de las entradas por cada Aeropuerto");
            System.out.println("4- Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Opción 1.");
                    output.listaAeorpuertos(listaAeropuerto);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Opción 2.");
                    output.listaSalidas(listaVuelos, listaAeropuerto);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("3.");
                    output.listaEntradas(listaVuelos, listaAeropuerto);
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Elige una opcion correcta");
                    break;
            }
        } while (opcion != 4);
        scanner.close();
    }
}