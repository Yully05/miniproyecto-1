package main.quiz_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    
    private static final Scanner inputScanner = new Scanner(System.in);
    private static final Negocio negocio = new Negocio(50000, 30000);;


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
    public static void builderFoto(boolean tipoCopia){
        System.out.println("Ingrese la cantidad de fotocopias:");
        try {
            final int cnt = inputScanner.nextInt();
            Fotocopiadora nuevaFotocopia = negocio.registrar(cnt, tipoCopia);
            System.out.println("Fotocopias: " 
                               + nuevaFotocopia.getCantidadCopias() 
                               + " - valor venta: " 
                               + nuevaFotocopia.getValorVenta());
        }catch(InputMismatchException e){
            System.err.println("Ingrese un número valido.");
        }
    }

    private static void regVentaMinutos(){
        System.out.println("Ingrese el Operador (Claro, Movistar, Tigo o Une): ");
        try{
            String operador = inputScanner.next();
            operador = operador.toLowerCase();
            for (Tipo tipo : Operador.Tipo.values()) {
                if (tipo.getNombre().equalsIgnoreCase(operador)) {        
                    System.out.println("Ingrese la cantidad de minutos:");
                    final int cnt = inputScanner.nextInt();
                    negocio.registrar(cnt, tipo);
                    return;
                }
            }
                System.out.println("Opcion incorrecta.");
                return;
            }
        }catch (Exception e){
            System.err.println("Error en el tipo de dato ingresado");
        }
    }

    private static void menuAdministracion(){
        boolean salir = false;
        do {
            System.out.print("""

                    \t\t\t\tMenú administración:
                    
                    \t(1) Ingresos del día
                    \t(2) Gastos del día
                    \t(3) Ganancia total obtenida del día
                    \t(4) Volver al menú principal
                    
                    Seleccione la opción:
                    """);
            switch (inputScanner.nextInt()) {
                case 1:
                    negocio.cantidadDineroDia();
                    break;
                case 2:
                    negocio.costoDia();
                    break;
                case 3:
                    negocio.gananciaObtenida();
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
