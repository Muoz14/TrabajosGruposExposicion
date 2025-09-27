package TrabajosGrupo2;

import ClasesCasos.Casos;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args){

        /// PROGRAMA QUE PIDE AL USUARIO UN NUMERO ENTERO POSITIVO AL USUARIO Y LO CONVIERTE
        /// EN UN NUMERO ROMANO DESDE EL 1 AL 3999.

        Scanner entrada = new Scanner(System.in);
        Casos c = new Casos();

        int numero;

        System.out.println("Ingrese un numero entero positivo (1 - 3999): ");

        numero = entrada.nextInt();

        String romano = c.numeroEnRomano(numero);

        if (romano == null) {

            System.out.println("Numero fuera de rango. Ingrese un entero entre 1 y 3999.");

        } else {

            System.out.println("El numero " + numero + " en numeros romanos es: " + romano);

        }

        entrada.close();

    }

}
