package org.example;

import java.util.Scanner;
public class Main {
    static int saciedad=6, energia=6, diversion = 6;
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
                    mostrarEstado();
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

    private static void mostrarEstado(){
        // ESTADO CONTENTO
        if (saciedad > 5 && energia > 5 && diversion > 5) {
            System.out.println("(•‿•)  ¡Estoy feliz! \n" +
                               "/|_|\\ \n" +
                                " | | \n");
        }

        // ESTADO TRISTE
        if (diversion < 5){
            System.out.println("(-︵-)  Estoy aburrido \n" +
                               "/|_|\\  ¡Juega conmigo! \n" +
                               " / \\ \n");
        }

        // ESTADO CANSADO
        if (energia < 5){
            System.out.println("(-_-)   Zzz \n" +
                               "/|_|\\ \n" +
                               " | | \n");
        }

        // ESTADO HAMBRIENTO
        if (saciedad < 5){
            System.out.println("(•︵•)   ¡Tengo hambre! \n" +
                               "/|x|\\ \n" +
                                " | | \n");
        }

        // SI ALGUN ESTADO LLEGA A 0, FIN DEL JUEGO
        if (saciedad == 0 || energia == 0 || diversion == 5){
            System.out.println("(x_x)  :( Game over ): \n" +
                               "/|_|\\ \n" +
                                " | | \n");
        }
    }
}

