package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese los numero de galones que quiere convertir");
        double x = leer.nextDouble();

        double litros = 3.7854;

        double resultado = litros * x;

        System.out.println("El resultado de la conversion es: " + resultado);

    }
}
