package TrabajosGrupo1;

import ClasesCondiciones.Condiciones;
import java.util.Scanner;

public class Ejercicio1{

    public static void ejercicio1() {

        /// Programa de identificacion si un numero ingresado por el usuario es par o impar

        Scanner entrada = new Scanner(System.in);
        Condiciones c = new Condiciones();
        int n;

        System.out.println("Ingrese un numero: ");
        n = entrada.nextInt();

        System.out.println(c.parImpar(n));

    }

    public static void main(String[] args) {

        ejercicio1();

    }

}
