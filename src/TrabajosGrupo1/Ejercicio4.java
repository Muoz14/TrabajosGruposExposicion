package TrabajosGrupo1;

import ClasesCondiciones.Condiciones;
import java.util.Scanner;

public class Ejercicio4 {

    public static void ejercicio4(){

        //Programa que devuelve el mayor y menor de 3 numeros ingresados por el usuario

        Condiciones c =  new Condiciones();
        Scanner entrada = new Scanner(System.in);

        int n1, n2, n3;

        System.out.println("Ingrese primer numero: ");
        n1 = entrada.nextInt();

        System.out.println("Ingrese segundo numero: ");
        n2 = entrada.nextInt();

        System.out.println("Ingrese tercer numero: ");
        n3 = entrada.nextInt();

        System.out.println(c.mayorMenor3Nums(n1, n2, n3));

    }

    public static void main(String[] args){

        ejercicio4();

    }

}