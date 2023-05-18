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
public class Teclado {
    private final char[] linea1={'q','w','e','r','t','y','u','i','o','p'};
    private final char[] linea2={'a','s','d','f','g','h','j','k','l'};
    private final char[] linea3={'z','x','c','v','b','n','m'};
    private ArrayList<Integer> linea1Valor;
    private ArrayList<Integer> linea2Valor;
    private ArrayList<Integer> linea3Valor;
    
    
    public Teclado(){
        linea1Valor=new ArrayList<>();
        linea2Valor=new ArrayList<>();
        linea3Valor=new ArrayList<>();

        for (int i = 0; i < linea1.length; i++) {
            linea1Valor.add(0);
            linea2Valor.add(0);
        }
        for (int i = 0; i < linea3.length; i++) {
            linea3Valor.add(0);
        }
    }
    
    public void compararPalabras(ArrayList<Palabra> listaPalabras){
        
        
        
        for(Palabra p : listaPalabras){
            for (int i = 0; i < p.getPalabra().length(); i++) {
                for (int j = 0; j < linea1.length; j++) {
                    if(linea1[j]==p.getPalabra().charAt(i)) linea1Valor.set(j,p.getPosiciones().get(i));
                }
                
                for (int j = 0; j < linea2.length; j++) {
                    if(linea2[j]==p.getPalabra().charAt(i)) linea2Valor.set(j,p.getPosiciones().get(i));
                }
                
                for (int j = 0; j < linea3.length; j++) {
                    if(linea3[j]==p.getPalabra().charAt(i)) linea3Valor.set(j,p.getPosiciones().get(i));
                }
            }
        }
    }
    
    
    
    
    
    @Override
    public String toString(){
        for (int i = 0; i < linea1.length; i++) {
            switch(linea1Valor.get(i)){
                case 1 ->System.out.print("("+linea1[i]+")");
                case 2 ->System.out.print("<"+linea1[i]+">");
                case 3 ->System.out.print("{"+linea1[i]+"}");
                default ->System.out.print("["+linea1[i]+"]");
            }
        }
        System.out.println("");
        for (int i = 0; i < linea2.length; i++) {
            switch(linea2Valor.get(i)){
                case 1 ->System.out.print("("+linea2[i]+")");
                case 2 ->System.out.print("<"+linea2[i]+">");
                case 3 ->System.out.print("{"+linea2[i]+"}");
                default ->System.out.print("["+linea2[i]+"]");
            }
        }
        System.out.print("\n    ");
        for (int i = 0; i < linea3.length; i++) {
            switch(linea3Valor.get(i)){
                case 1 ->System.out.print("("+linea3[i]+")");
                case 2 ->System.out.print("<"+linea3[i]+">");
                case 3 ->System.out.print("{"+linea3[i]+"}");
                default ->System.out.print("["+linea3[i]+"]");
            }
        }
        System.out.println("\n");
        return "";
    }
    
}
