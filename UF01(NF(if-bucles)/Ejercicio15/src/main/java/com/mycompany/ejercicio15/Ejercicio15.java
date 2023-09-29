/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio15;
import java.util.Scanner;
/**
 * 15.	Dibuja un ordinograma que lea tres números distintos 
 * y nos diga cuál es el mayor.
 * @author hema5364
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner pantalla = new Scanner(System.in);
        System.out.print("Introduce el 1º numero: ");
        float num1 = pantalla.nextFloat();
        System.out.print("Introduce el 2º numero: ");
        float num2 = pantalla.nextFloat();
        System.out.print("Introduce el 3º numero: ");
        float num3 = pantalla.nextFloat();
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1);
        }
        else {
            if (num2 >= num3 && num2 >= num1) {
                System.out.println(num2);
            }
            else {
                if (num3 >= num1 && num3 >= num2) {
                    System.out.println(num3);
                }
                else {
                    if(num1 >= num2) {
                        System.out.println(num1);
                    }
                    else {
                        System.out.println(num2);
                    }
                }
            }
        }
        
    }
}
