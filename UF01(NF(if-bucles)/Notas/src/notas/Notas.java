/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notas;

import java.util.Scanner;
/**
 *
 * @author hema5364
 */
public class Notas {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int notaM02=10, notaM03=10, notaM04=10;
        //Objeto que escanea datos de entrada
        Scanner pantalla = new Scanner(System.in);  //Indico salida por consola
        System.out.print("Que nota crees que sacaras en M02? ");
        notaM02 = pantalla.nextInt();
        System.out.println("Que nota crees que sacaras en M02 es un "+ notaM02);
        System.out.print("Que nota crees que sacaras en M03? ");
        notaM03 = pantalla.nextInt();
        System.out.println("Que nota crees que sacaras en M03 es un "+ notaM03);
        System.out.print("Que nota crees que sacaras en M04? ");
        notaM04 = pantalla.nextInt();
        System.out.println("Que nota crees que sacaras en M04 es un "+ notaM04);
        
    }
    
}
