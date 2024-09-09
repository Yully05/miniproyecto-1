package src.main.mini_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    
    private static final Scanner inputScanner = new Scanner(System.in);
    private static final Negocio negocio = new Negocio(200000, 40000, "Servicios la 30");


    public static void MenuPrincipal(){

        boolean salir = false;
        do {
            System.out.println("\n\t\t\t\tMenu de opciones:");
            System.out.println("\t(1) Menú de fotocopias");
            System.out.println("\t(2) Registrar venta de minutos");
            System.out.println("\t(3) Hacer cierre del dia");
            System.out.println("\t(4) Salir");
            System.out.print("Seleccione una opción: ");

            
            switch (inputScanner.nextInt()) {
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
                    System.out.println("Opción incorrecta.");
            }
        } while (!salir);
    }

    private static void menuFotocopiadora(){
        boolean salir = false;

        class fotocopiadoraBuilder{
            public static void builder(boolean color){
                System.out.println("Ingrese la cantidad de fotocopias:");
                try{
                    final int cnt = inputScanner.nextInt();
                    Fotocopiadora nuevaFotocopia = new Fotocopiadora(cnt, color);
                    nuevaFotocopia.registrarServicio(negocio);
                }catch(InputMismatchException e){
                    System.err.println("Ingrese un numero valido.");
                }

            }
        }
        do {
            System.out.print("""

                    \t\t\t\tMenu de Fotocopias:
                    
                    \t(1) Registrar copias a blanco y negro
                    \t(2) Registrar copias a Color
                    \t(3) Volver al menú principal
                    
                    Seleccione la opción:
                    """);


            switch (inputScanner.nextInt()) {
                case 1:
                    fotocopiadoraBuilder.builder(false);
                    break;
                case 2:
                    fotocopiadoraBuilder.builder(true);
                    break;
                case 3:
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
