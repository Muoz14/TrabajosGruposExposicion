package principal;

import principal.SubMenus.SMCasos;
import principal.SubMenus.SMCondicionales;

import java.util.Scanner;
import java.io.IOException;

public class MenuPrincipal {

    public final Scanner entrada = new Scanner(System.in);

    public void pausarConsola() {

        System.out.println("\nPresione la tecla Enter para continuar...");
        entrada.nextLine();

    }

    public void menuPrincipal(){

        Scanner entrada = new Scanner(System.in);

        SMCondicionales subMenu1 = new SMCondicionales();

        SMCasos subMenu2 = new SMCasos();

        boolean salir = false;

        int op = 0;

        while (!salir){

            System.out.println("\n---- MENU PRINCIPAL ----\n");
            System.out.println("  1. Tarea Grupo 1 (Condicionales)");
            System.out.println("  2. Tarea Grupo 2 (Switch)");
            System.out.println(" -1. Salir del programa");

            System.out.println("\n Ingrese una opcion: ");

            if (entrada.hasNextInt()) {

                op = entrada.nextInt();

                switch (op){

                    case 1:

                        System.out.println("\nTareas Grupo 1 (Condicionales)\n");

                        subMenu1.smCondicionales(entrada);

                        break;

                    case 2:

                        System.out.println("\nTareas Grupo 2 (Switch)\n");

                        subMenu2.smCasos(entrada);

                        break;

                    case -1:

                        salir = true;

                        System.out.println("\nPrograma finalizado....\n");

                        break;

                    default:

                        System.out.println("\nOpcion ingresada invalida o no existe.\n");

                        pausarConsola();

                        break;

                    }

            } else {

                // Manejar entradas no numericas para evitar craheos
                System.out.println("\nError! Ingrese solo numeros.");
                entrada.nextLine(); // Consumir la entrada invzlida
                continue; // Volver al inicio del ciclo

            }

        }

    }

}
