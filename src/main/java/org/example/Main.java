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
                    // SALIR
                    System.out.println("Saliendo...");
                    break;
                case 1:
                    // ESTADO
                    mostrarEstado();
                    break;
                case 2:
                    // COMER
                    // EL TAMAGOTCHI SOLO COMERA CUANDO EL VALOR DE SACIEDAD SEA MENOR QUE 10
                    // AL COMER, SACIEDAD SE INCREMENTARA HASTA 5 PUNTOS, TENIENDO EN CUENTA QUE
                    // EL MAXIMO SON 10 PUNTOS, Y DISMINUIRA EL VALOR DE DIVERSION EN 1
                    if (saciedad < 10){
                        diversion--;
                        if (saciedad == 5){
                            saciedad = saciedad +5;
                        } else if (saciedad == 6){
                            saciedad = saciedad +4;
                        } else if (saciedad == 7){
                            saciedad = saciedad +3;
                        } else if (saciedad == 8){
                            saciedad = saciedad +2;
                        } else if (saciedad == 9){
                            saciedad = saciedad +1;
                        }
                    } else {
                        // EN CASO CONTRARIO MOSTRARA UN MENSAJE
                        System.out.println("No tengo hambre.");
                    }
                    break;
                case 3:
                    // JUGAR

                    break;
                case 4:
                    // DORMIR

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

