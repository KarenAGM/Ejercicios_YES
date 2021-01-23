package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la medida en pies");
        Double p = leer.nextDouble();

        //Coversion de pies a pulgada
        double pulgada = 12;
        double res1= p * 12;
        System.out.println("Conversion de pies a pulgada: " + res1);

        //Conversion de pies a yardas
        double res2 = p / 3;
        System.out.println("Conversion de pies a yardas: " + res2);

        //Conversion de pies a metros
        double res3 = p/3.281;
        System.out.println("Converion de pies a metros: " + res3);

        //Conversion de pies a centimetros
        double res4 = p * 30.48;
        System.out.println("Conversion de pies a centimetros: " + res4);

    }
}
