package kataDos;

import java.util.Arrays;

public class KataDos {

    private String cadena;


    public KataDos(){

    }

    public KataDos(String cadena) {
        this.cadena = cadena;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public String reemplazar(String s){

        //Pasar la cadena a mayusculas
        String c = s.toUpperCase();
        //convertimos c en un array
        String[] array = c.split("");
        //variable donde se va almacenar la nueva cadena
        String c1="";
        //Recorremos el arreglo
        for(int x=0; x<array.length; x++){
            //Si la posicion es igual a T , suma una A
            if(array[x].equals("T")){
                c1= c1 + "A";
            }else if (array[x].equals("A")){
                c1= c1 + "T";
            }else if (array[x].equals("C")){
                c1=c1+ "G";
            }else if(array[x].equals("G")){
                c1=c1+ "C";
            }
        }
        return c1;
    }
}
