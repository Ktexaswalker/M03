/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author hema5364
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dibuja un ordinograma que lea dos números, 
        calcule y muestre el valor de sus suma, resta, producto y división.*/
        System.out.print("introduce un numero: ");
        Scanner pantalla = new Scanner(System.in);
        int num1 = pantalla.nextInt();
        System.out.print("introduce otro numero: ");
        int num2 = pantalla.nextInt();
        int suma = num1 + num2;
        int resta = num1 - num2;
        long multiplicacion = num1 * num2;
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        if (num2 == 0) {
           System.out.println("La division no puede ser divisible por 0");
        } else {
            float division = (float) num1 / num2;
            System.out.println("La division es " + division);
        }
    }
    
}
