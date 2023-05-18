/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordle;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author rojas
 */
public class Diccionario {
    
    ArrayList<String> lista;
    BufferedReader reader;
    String palabraClave;
    public Diccionario() throws FileNotFoundException, IOException{
        
        lista = new ArrayList<>();
        reader = new BufferedReader(new FileReader("palabras5Letras.txt"));
            
        String line = reader.readLine();
        while (line != null) {
            String[] palabras = line.split(" ");
            for (String p : palabras) {
            lista.add(p);    
            }
            line = reader.readLine();
        }
        reader.close();
        
        
        
        //Creando palabra clave
        
        Random rmd = new Random();
        palabraClave=lista.get(rmd.nextInt(lista.size()));
    }
   
    public String getPalabraClave(){
        return this.palabraClave;
    }
   
    public Palabra compararIntento(Palabra p){
        
        for (int i = 0; i<p.getPalabra().length(); i++) {
            if(p.getPalabra().charAt(i)==palabraClave.charAt(i)){
                p.setPosicion(1);
            }
            else if(palabraClave.contains(String.valueOf(p.getPalabra().charAt(i)))){
                p.setPosicion(2);
                }else p.setPosicion(3);
        }
        
        return p;
    }
    
    public boolean palabraIntentoExiste(String palabra){
        boolean existe;
        existe = lista.contains(palabra);
        return existe;
    }
    
    
    
    
    
    
    
    
    
    
   
}
