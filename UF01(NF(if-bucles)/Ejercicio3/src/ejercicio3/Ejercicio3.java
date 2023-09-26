/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 * @author hema5364
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dibuja un ordinograma que calcule el área de un cuadrado
        cuyo lado se introduce por teclado.*/
        System.out.print("Introduce el tamaño de un lado: ");
        Scanner pantalla = new Scanner(System.in);
        double lado = pantalla.nextFloat();
        double area = lado * lado;
        System.out.println("El area del cuadrado con el lado " + lado +  " es " + area);
    }
    
}
