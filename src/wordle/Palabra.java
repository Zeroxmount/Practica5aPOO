/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordle;

import java.util.ArrayList;

/**
 *
 * @author rojas
 */
public class Palabra {
    String palabra;
    String palabraImpresa="";
    ArrayList<Integer> posiciones;
    
    public Palabra(String nuevaPalabra){
        palabra=nuevaPalabra;
        posiciones=new ArrayList<>();
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    public void setPosicion(int valor){
        posiciones.add(valor);
    }
    public ArrayList<Integer> getPosiciones(){
        return this.posiciones;
    }
    
    
    @Override
    public String toString(){
        palabraImpresa="";
        for (int i = 0; i < palabra.length(); i++) {
            switch(posiciones.get(i)){
                
                case 1 -> palabraImpresa+="("+palabra.charAt(i)+")";
                case 2 -> palabraImpresa+="<"+palabra.charAt(i)+">";
                case 3 -> palabraImpresa+="{"+palabra.charAt(i)+"}";
                default -> palabraImpresa+="["+palabra.charAt(i)+"]";
            }
        }
        return palabraImpresa;
    }
    
    
    
}
