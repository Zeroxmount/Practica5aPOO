/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wordle;

import java.io.IOException;
import wordle.consola.TableroConsola;
import wordle.consola.TecladoConsola;
import wordle.holografico.TableroHolografico;
import wordle.interfaces.ITablero;
import wordle.interfaces.ITeclado;

/**
 *
 * @author molguin
 */
public class Wordle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ITablero tablero = new TableroHolografico();
        ITeclado teclado = new TecladoConsola();
        JuegoWordle juego = new JuegoWordle(tablero, teclado);
        
        boolean gana;
        int ronda=0;
        
        System.out.println("Bienvenido Al juego Wordle");
        System.out.println("Para ganar tienes que ingresar una palabra de 5 letras y ver si concide con una palabra aleatoria");
        System.out.println("\nPara ello te birndamos la sig informacion:");
        System.out.println("\t1- \"(*)\" la letra pertenece a la palabra aleatoria y esta en la posicion correcta");
        System.out.println("\t2- \"<*>\" la letra pertenece a la palabra aleatoria pero no en esa posicion");
        System.out.println("\t3- \"{*}\" la letra no pertenece a la palabra aleatoria");
        
        do{
            ronda++;
            gana=juego.jugar();
        }while(gana==false&&ronda<=6);
        
        if (gana==true) System.out.println("Felicidades has ganado :D");
        if (gana==false)System.out.println("Perdiste la palabra era "+juego.getPalabraganadora()+" :c");
    }
    
}
