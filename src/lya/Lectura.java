package lya;

import java.io.*;
import java.util.ArrayList;

public class Lectura {
    
//    public String leer() throws java.io.IOException{
//
//        BufferedReader br = new BufferedReader (new FileReader ("cadena.txt"));
//        String cadena=br.readLine();
//        return cadena;
//    }
    public ArrayList<String> getStrings() throws FileNotFoundException, IOException{
        ArrayList<String> cadenas = new ArrayList();
        String cadena = "";
        BufferedReader br = new BufferedReader(new FileReader("cadena.txt"));
            while((cadena=br.readLine())!=null){
                cadenas.add(cadena);
            }        
        return cadenas;
    }
}
    

