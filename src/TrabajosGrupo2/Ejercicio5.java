package TrabajosGrupo2;

import ClasesCasos.Casos;
import ClasesCondiciones.Condiciones;

import javax.swing.*;

public class Ejercicio5 {

    public static void ejercicio5(){

        Casos c = new Casos();

        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"MENU DE ADOPCION DE MASCOTA \n 1. Perro \n 2. Gato \n 3. Cuyo \nElija una mascota:"));

        c.mascotaAdopcion(opcion);

    }

    public static void main(String[] args){

        ejercicio5();

    }

}
