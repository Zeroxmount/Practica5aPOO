/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordle;
import java.io.IOException;
import java.util.ArrayList;
import wordle.interfaces.ITablero;
import wordle.interfaces.ITeclado;

/**
 *
 * @author molguin
 */
public class JuegoWordle {
    ITablero tablero;
    ITeclado teclado;
    Diccionario diccionario;
    Palabra palabraIntento;
    ArrayList<Palabra> listaIntentos;
    Teclado tecladoIntentos;
    

    public JuegoWordle(ITablero tablero, ITeclado teclado) throws IOException {
        this.tablero = tablero;
        this.teclado = teclado;
        diccionario=new Diccionario();
        listaIntentos=new ArrayList<>();
        tecladoIntentos=new Teclado();
    }
    
    public boolean jugar() {
        boolean gano=false;
        do{
            
            
            for (Palabra listaIntento : listaIntentos) {
                System.out.println(listaIntento.toString());
            }
            
            imprimirTeclado();
            palabraIntento=new Palabra(this.teclado.getIntento());
            
        }while(diccionario.palabraIntentoExiste(palabraIntento.getPalabra())==false);
        
        palabraIntento=diccionario.compararIntento(palabraIntento);
        listaIntentos.add(palabraIntento);
        this.tablero.despliegaIntento(palabraIntento.toString());
        
        if(palabraIntento.getPalabra().equals(diccionario.getPalabraClave()))gano=true;
            
        return gano;
    }
    
    public String getPalabraganadora(){
        return diccionario.getPalabraClave();
    }
    
    
    public void imprimirTeclado(){
        ArrayList<Integer> valorTeclas= new ArrayList<>();
        tecladoIntentos.compararPalabras(listaIntentos);
        tecladoIntentos.toString();
        
    }
    
}
