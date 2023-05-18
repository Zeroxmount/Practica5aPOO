/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordle.consola;
import wordle.interfaces.ITeclado;
import java.util.Scanner;

/**
 *
 * @author molguin
 */
public class TecladoConsola implements ITeclado {

    @Override
    public String getIntento() {
       Scanner in = new Scanner(System.in);
       String intento;
       do{
       System.out.print("Palabra: ");
       intento=in.nextLine();
       }while(intento.length()!=5);
       return intento;
    }
    
}
