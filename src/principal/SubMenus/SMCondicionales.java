package principal.SubMenus;

import TrabajosGrupo1.*;
import java.util.Scanner;

public class SMCondicionales {

    public final Scanner entrada = new Scanner(System.in);

    public void pausarConsola() {

        System.out.println("\nPresione la tecla Enter para continuar...");
        entrada.nextLine();

    }

    public void smCondicionales(Scanner entrada){

        boolean regresarMP = false;
        int op;

        while (!regresarMP){

            System.out.println("\n---- MENU DE EJERCICIOS CONDICIONALES ----\n");

            System.out.println("  1. Ejercicio 1 (Par/Impar)");
            System.out.println("  2. Ejercicio 2 (Descuento Producto)");
            System.out.println("  3. Ejercicio 3 (Mayor/Menor 2 nums)");
            System.out.println("  4. Ejercicio 4 (Mayor/Menor 3 nums)");
            System.out.println("  5. Ejercicio 5 (Edades)");
            System.out.println("  6. Ejercicio 6 (Operaciones Aritmeticas)");
            System.out.println("  7. Ejercicio 7 (Dias de semana)");
            System.out.println(" -1. Regresar al menu principal");

            System.out.println("\n Ingrese una opcion: ");

            if (entrada.hasNextInt()) {

                op = entrada.nextInt();

                switch (op){

                    case 1:

                        System.out.println("\n1. Ejercicio 1 (Par/Impar)\n");

                        Ejercicio1.ejercicio1();

                        pausarConsola();

                        break;

                    case 2:

                        System.out.println("\n2. Ejercicio 2 (Descuento Producto)\n");

                        Ejercicio2.ejercicio2();

                        pausarConsola();

                        break;

                    case 3:

                        System.out.println("\n3. Ejercicio 3 (Mayor/Menor 2 nums)\n");

                        Ejercicio3.ejercicio3();

                        pausarConsola();

                        break;

                    case 4:

                        System.out.println("\n4. Ejercicio 4 (Mayor/Menor 3 nums)\n");

                        Ejercicio4.ejercicio4();

                        pausarConsola();

                        break;

                    case 5:

                        System.out.println("\n5. Ejercicio 5 (Edades)\n");

                        Ejercicio5.ejercicio5();

                        pausarConsola();

                        break;

                    case 6:

                        System.out.println("\n6. Ejercicio 6 (Operaciones Aritmeticas)\n");

                        Ejercicio6.ejercicio6();

                        pausarConsola();

                        break;

                    case 7:

                        System.out.println("\n7. Ejercicio 7 (Dias de semana)\n");

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

