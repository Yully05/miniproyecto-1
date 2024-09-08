package src.main.mini_1;

import java.util.Scanner;

public class Main {
    
    public static Scanner inputScanner = new Scanner(System.in);


    public static void MenuPrincipal(){

        int opcion;
        boolean salir = false;
        do {
            System.out.println("\nMenu de opciones:");
            System.out.println("\t(1) Menú de fotocopias");
            System.out.println("(2) Registrar venta de minutos");
            System.out.println("(3) Hacer cierre del dia");
            System.out.println("(4) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = inputScanner.nextInt();
            inputScanner.nextLine();
            
            switch (opcion) {
                case 1:
                    menuFotocopiadora();
                    break;
                case 2:
                    //servicio minutos
                    break;
                case 3:
                    //cierre del dia
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
            }
        } while (!salir);
    }

    private static void menuFotocopiadora(){
        int opcion;
        boolean salir = false;
        do {
            System.out.print("""

                    \t\t\t\tMenu de Fotocopias:
                    
                    \t(1) Registrar copias a blanco y negro
                    \t(2) Registrar copias a Color
                    \t(3) Volver al menú principal
                    
                    Seleccione la opcion:
                    """);

            opcion = inputScanner.nextInt();
            inputScanner.nextLine();

            switch (opcion) {
                case 1:
                    //servicio fotocopia
                    break;
                case 2:
                    //servicio minutos
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
            }
        } while (!salir);
        MenuPrincipal();
    }



    
    public static void main(String[] args) {

        MenuPrincipal();
    }
}
