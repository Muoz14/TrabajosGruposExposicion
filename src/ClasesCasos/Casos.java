package ClasesCasos;

import javax.swing.*;
import java.util.Scanner;

public class Casos {

    public String diasSemana(int numero){

        switch (numero){

            case 1:

                return "Lunes";

            case 2:

                return "Martes";


            case 3:

                return "Miercoles";


            case 4:

                return "Jueves";


            case 5:

                return "Viernes";


            case 6:

                return "Sabado";


            case 7:

                return "Domingo";


            default:

                return "Numero ingresado invalido o fuera del rango";


        }

    }

    public String Meses(int numero){

        switch (numero){

            case 1:

                return "Enero";

            case 2:

                return "Febrero";


            case 3:

                return "Marzo";


            case 4:

                return "Abril";


            case 5:

                return "Mayo";


            case 6:

                return "Junio";


            case 7:

                return "Julio";

            case 8:

                return "Agosto";

            case 9:

                return "Septiembre";

            case 10:

                return "Octubre";

            case 11:

                return "Noviembre";

            case 12:

                return "Diciembre";


            default:

                return "Numero ingresado invalido o fuera del rango";


        }

    }

    public String Vocal(String caracter){

       caracter = caracter.toUpperCase();

       switch (caracter){

           case "A":

               return "Es una vocal";

           case "E":

               return "Es una vocal";

           case "I":

               return "Es una vocal";

           case "O":

               return "Es una vocal";

           case "U":

               return "Es una vocal";

           default:

               return "No es una vocal";

       }

    }

    public String colorePrimarios(String color){

        color = color.toUpperCase();

        switch (color){

            case "ROJO":

                return "El color rojo es un color primario";

            case "VERDE":

                return "El color verde es un color primario";

            case "AZUL":

                return "El color azul es un color primario";

            default:

                return "El color ingresado no es un color primario";


        }

    }

    public void mascotaAdopcion(int opcion){

        switch(opcion){

            case 1:

                JOptionPane.showMessageDialog(null, "Has adoptado un Perro");

                break;

            case 2:

                JOptionPane.showMessageDialog(null, "Has adoptado un Gato");

                break;

            case 3:

                JOptionPane.showMessageDialog(null, "Has adoptado un Cuyo");

                break;

            default:

                JOptionPane.showMessageDialog(null,  "La opcion ingresada es invalida o no existe");

                break;

        }

    }

    public void Dinero(int opcion){

        Scanner entrada = new Scanner(System.in);

        float dinero = 1000, deposito = 0, retiro = 0;

        switch (opcion){

            case 1:

                System.out.println("Dinero disponible = $ " + dinero);

                break;

            case 2:

                System.out.println("Ingrese la cantidad de dinero a depositar: ");
                deposito = entrada.nextInt();

                if (deposito > 1000){

                    System.out.println("No se puede depositar cantidades mayores de $ 1000");

                }
                else if (deposito <= 0){

                    System.out.println("No se puede depositar cantidades negativas o iguales a cero");

                }
                else{

                    System.out.println("Deposito realizado");

                    dinero += deposito;

                }

                break;

            case 3:

                System.out.println("Ingrese la cantidad de dinero a retirar: ");
                retiro = entrada.nextInt();

                if (retiro > 1000){

                    System.out.println("No se puede retirar cantidades mayores de $ 1000");

                }
                else if (retiro <= 0){

                    System.out.println("No se puede retirar cantidades negativas o iguales a cero");

                }
                else{

                    System.out.println("Retiro realizado");

                    dinero -= retiro;

                }

                break;

            case 4:

                System.out.println("Programa finalizado....");

                break;

            default:

                System.out.println("La opcion ingresada es invalida.");

                break;

        }


    }

    public static String numeroEnRomano(int numero) {

        if (numero <= 0 || numero > 3999){

            return null;

        }

        int miles = numero / 1000;
        int centenas = (numero % 1000) / 100;
        int decenas = (numero % 100) / 10;
        int unidades = numero % 10;

        StringBuilder rom = new StringBuilder();

        // Miles (1-3)
        switch (miles) {

            case 1:

                rom.append("M");

                break;

            case 2: rom.append("MM");

                break;

            case 3:

                rom.append("MMM");

                break;

            default:

                break;
        }

        // Centenas (0-9)
        switch (centenas) {

            case 1:

                rom.append("C");

                break;

            case 2:

                rom.append("CC");

                break;

            case 3:

                rom.append("CCC");

                break;

            case 4:

                rom.append("CD");

                break;

            case 5:

                rom.append("D");

                break;

            case 6:

                rom.append("DC");

                break;

            case 7:

                rom.append("DCC");

                break;

            case 8:

                rom.append("DCCC");

                break;

            case 9:

                rom.append("CM");

                break;

            default:

                break;
        }

        // Decenas (0-9)
        switch (decenas) {

            case 1:

                rom.append("X");

                break;

            case 2:

                rom.append("XX");

                break;

            case 3:

                rom.append("XXX");

                break;

            case 4:

                rom.append("XL");

                break;

            case 5:

                rom.append("L");

                break;

            case 6:

                rom.append("LX");

                break;

            case 7:

                rom.append("LXX");

                break;

            case 8:

                rom.append("LXXX");

                break;

            case 9:

                rom.append("XC");

                break;


            default:

                break;
        }

        // Unidades (0-9)
        switch (unidades) {

            case 1:

                rom.append("I");

                break;

            case 2:

                rom.append("II");

                break;

            case 3:

                rom.append("III");

                break;

            case 4:

                rom.append("IV");

                break;

            case 5:

                rom.append("V");

                break;

            case 6:

                rom.append("VI");

                break;

            case 7:

                rom.append("VII");

                break;

            case 8:

                rom.append("VIII");

                break;

            case 9:

                rom.append("IX");

                break;

            default:

                break;
        }

        return rom.toString();

    }


}
