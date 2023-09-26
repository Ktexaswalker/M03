/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejer13;
import java.util.Scanner;
/**
 * 13.	Dibuja un ordinograma de un programa que lee dos números y los visualiza 
 * en orden ascendente.
 * @author hema5364
 */
public class Ejer13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        float num1 = sc.nextFloat();
        System.out.print("Introduce otro numero:");
        float num2 = sc.nextFloat();
        if (num1 >= num2) {
            System.out.print(num1 + " - " + num2);
        } else {
            System.out.print(num2 + " - " + num1);
        }
    }
}
