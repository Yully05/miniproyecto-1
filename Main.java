import java.util.Scanner;

public class Main {
    
    public static Scanner inputScanner = new Scanner(System.in);


    public static void MenuPrincipal(){

        int opcion;
        boolean salir = false;
        do {
            System.out.println("\nMenu de opciones:");
            System.out.println("(1) Registrar venta de fotocopia");
            System.out.println("(2) Registrar venta de minutos");
            System.out.println("(3) Hacer cierre del dia");
            System.out.println("(4) Salir");
            System.out.print("Seleccione una opcion: ");
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
    
    public static void main(String[] args) {

        MenuPrincipal();
    }
}
