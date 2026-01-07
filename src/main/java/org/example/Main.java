package org.example;

import java.util.Scanner;
public class Main {
    public static void main() {
        // DECLARACION DE VARIABLES
        int opcion = 0;
        System.out.println("Hola Git");

        do{
            opcion = menuPrincipal();
            switch(opcion){
                case 0:
                    System.out.println("Saliendo...");
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Selecciona una opcion valida. \n");
            };
        }while (opcion!=0);
    }

    private static int menuPrincipal(){
        //DECLARACION DE VARIABLES
        int opcion = 0;
        Scanner lectura = new Scanner(System.in);

        System.out.println("Seleccione una opcion del menu: \n" +
                "1. Estado \n" +
                "2. Comer \n" +
                "3. Jugar \n" +
                "4. Dormir \n" +
                "---------- \n" +
                "0. Salir \n");
        opcion = lectura.nextInt();

        return opcion;
    }
}

