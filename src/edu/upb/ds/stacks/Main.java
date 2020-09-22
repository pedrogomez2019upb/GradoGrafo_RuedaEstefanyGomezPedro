package edu.upb.ds.stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static String calcularGrado(String x , int size){
        String salidaString="";
        List<String> listaSeparada = new ArrayList<String>(Arrays.asList(x.split("")));
        for(int i=1;i<listaSeparada.size();i++){
            if(x.charAt(i)==':'){
                String letra = listaSeparada.get(i-1);
                int gradoNodo=-2;
                while(x.charAt(i)!=';'){
                    gradoNodo++;
                    i++;
                    if(i==x.length()){break;}
                }
                for(int q = 0;q<size;q++){
                    String valor = listaSeparada.get(q);
                    if(valor.equals(letra)){
                        gradoNodo++;
                    }
                }
                if(salidaString==""){
                    salidaString=salidaString+letra+"="+gradoNodo;
                }else
                {
                    salidaString=salidaString+","+letra+"="+gradoNodo;
                }
            }
        }
        return salidaString;
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int casos = sc.nextInt();
	for(int i =0 ; i<casos;i++){
	    String cadena = sc.next().toString();
	    int size = cadena.length();
        System.out.println("\n"+calcularGrado(cadena,size));
    }
    }
}
