package Ejercicios;

public class Ejercicio5 {

    public static void main(String[] args) {

        double litros = 3.7854;

        for(int a=1;a<=100;a ++){
            double resultado = a * litros;
            System.out.println("Numero de galon "+ a + " Conversion: " + resultado);
            if(a%10 == 0){
                System.out.println("");
            }
        }
    }
}
