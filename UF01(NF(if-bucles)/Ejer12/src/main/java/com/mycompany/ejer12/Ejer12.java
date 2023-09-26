/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejer12;
import java.util.Scanner;
/**
 * 12.	Dibuja el ordinograma de un programa que lee un número y 
 * me dice si es positivo o negativo, consideraremos el cero como positivo.
 * @author hema5364
 */
public class Ejer12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero");
        float num1 = sc.nextFloat();
        if (num1 >= 0) {
            System.out.println("El "+ num1 + " es positivo");
        }
        else {
            System.out.println("El "+ num1 + " es negativo");
        }
    }
}
