package principal.SubMenus;

import TrabajosGrupo2.*;
import java.util.Scanner;

public class SMCasos {

    public final Scanner entrada = new Scanner(System.in);

    public void pausarConsola() {

        System.out.println("\nPresione la tecla Enter para continuar...");
        entrada.nextLine();

    }

    public void smCasos(Scanner entrada){

        boolean regresarMP = false;
        int op;

        while (!regresarMP){

            System.out.println("\n---- MENU DE EJERCICIOS CONDICIONALES ----\n");

            System.out.println("  1. Ejercicio 1 (dia semana)");
            System.out.println("  2. Ejercicio 2 (meses anio)");
            System.out.println("  3. Ejercicio 3 (vocal o no)");
            System.out.println("  4. Ejercicio 4 (colores primarios)");
            System.out.println("  5. Ejercicio 5 (adopcion mascota)");
            System.out.println("  6. Ejercicio 6 (dinero)");
            System.out.println("  7. Ejercicio 7 (numero a numero romano)");
            System.out.println(" -1. Regresar al menu principal");

            System.out.println("\n Ingrese una opcion: ");

            if (entrada.hasNextInt()) {

                op = entrada.nextInt();

                switch (op){

                    case 1:

                        System.out.println("\n1. Ejercicio 1 (dia semana)\n");

                        Ejercicio1.ejercicio1();

                        pausarConsola();

                        break;

                    case 2:

                        System.out.println("\n2. Ejercicio 2 (meses anio)\n");

                        Ejercicio2.ejercicio2();

                        pausarConsola();

                        break;

                    case 3:

                        System.out.println("\n3. Ejercicio 3 (vocal o no)\n");

                        Ejercicio3.ejercicio3();

                        pausarConsola();

                        break;

                    case 4:

                        System.out.println("\n4. Ejercicio 4 (colores primarios)\n");

                        Ejercicio4.ejercicio4();

                        pausarConsola();

                        break;

                    case 5:

                        System.out.println("\n5. Ejercicio 5 (adopcion mascota)\n");

                        Ejercicio5.ejercicio5();

                        pausarConsola();

                        break;

                    case 6:

                        System.out.println("\n6. Ejercicio 6 (dinero)\n");

                        Ejercicio6.ejercicio6();

                        pausarConsola();

                        break;

                    case 7:

                        System.out.println("\n7. Ejercicio 7 (numero a numero romano)\n");

                        Ejercicio7.ejercicio7();

                        pausarConsola();

                        break;

                    case -1:

                        regresarMP = true;

                        System.out.println("\nRegresando al menu principal....\n");

                        pausarConsola();

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
