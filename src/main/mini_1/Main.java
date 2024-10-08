package src.main.mini_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    
    private static final Scanner inputScanner = new Scanner(System.in);
    private static final Negocio negocio = new Negocio(200000, 40000, "Servicios la 30");


    public static void MenuPrincipal(){

        boolean salir = false;
        do {
            System.out.println("\n\t\t\t\tMenú de opciones:");
            System.out.println("\t(1) Menú de fotocopias");
            System.out.println("\t(2) Registrar venta de minutos");
            System.out.println("\t(3) Adminitración");
            System.out.println("\t(4) Salir");
            System.out.print("Seleccione una opción: ");

            
            switch (inputScanner.nextInt()) {
                case 1:
                    menuFotocopiadora();
                    break;
                case 2:
                    regVentaMinutos();
                    break;
                case 3:
                    menuAdministracion();
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

        do {
            System.out.print("""

                    \t\t\t\tMenú de Fotocopias:
                    
                    \t(1) Registrar copias a blanco y negro
                    \t(2) Registrar copias a Color
                    \t(3) Volver al menú principal
                    
                    Seleccione la opción:
                    """);
            switch (inputScanner.nextInt()) {
                case 1:
                    builderFoto(false);
                    break;
                case 2:
                    builderFoto(true);
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
            }
        } while (!salir);
    }
    public static void builderFoto(boolean color){
        System.out.println("Ingrese la cantidad de fotocopias:");
        try {
            final int cnt = inputScanner.nextInt();
            Fotocopiadora nuevaFotocopia = new Fotocopiadora(cnt, color);
            nuevaFotocopia.registrarServicio(negocio);
        }catch(InputMismatchException e){
            System.err.println("Ingrese un número valido.");
        }
    }

    private static void regVentaMinutos(){
        System.out.println("Ingrese el Operador (Claro, Movistar, Tigo): ");
        try{
            String operador = inputScanner.next();
            operador = operador.toLowerCase();
            switch (operador){
                case "claro", "movistar", "tigo":
                    builderVentaMinutos(operador);
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
            }
        }catch (InputMismatchException e){
            System.err.println("Error en el tipo de dato ingresado");
        }
    }

    public static void builderVentaMinutos(String operador){
        System.out.println("Ingrese la cantidad de minutos vendidos: ");
        int cantMinutos = inputScanner.nextInt();
        VentaMinutos newVenta = new VentaMinutos(cantMinutos, operador);
        newVenta.registrarServicio(negocio);
    }

    private static void menuAdministracion(){
        boolean salir = false;
        do {
            System.out.print("""

                    \t\t\t\tMenú administración:
                    
                    \t(1) Ingresos del día
                    \t(2) Gastos del día
                    \t(3) Ganancia total obtenida del día
                    \t(4) imprimir recibos fotocopias
                    \t(5) imprimir recibos minutos
                    \t(6) Volver al menú principal
                    
                    Seleccione la opción:
                    """);
            switch (inputScanner.nextInt()) {
                case 1:
                    negocio.calcularIngresos();
                    break;
                case 2:
                    negocio.calcularEgresos();
                    break;
                case 3:
                    negocio.calcularGanancia();
                    break;
                case 4:
                    negocio.imprimirRecibosFotocopias();
                    break;
                case 5:
                    negocio.imprimirReciboMinutos();
                    break;
                case 6:
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
