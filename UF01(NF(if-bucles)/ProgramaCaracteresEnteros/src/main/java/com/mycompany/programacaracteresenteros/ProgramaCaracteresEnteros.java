/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.programacaracteresenteros;
import java.util.Scanner;
/**
 * A que clase vas? (A, B, C) Que edad tienes?
 * En la Clase A: van los adultos
 * En la Clase B o C: van los menores de edad
 * El programa tiene que comprobar que estas en la clase correcta
 * @author hema5364
 */
public class ProgramaCaracteresEnteros {

    public static void main(String[] args) {
        System.out.println("A que clase vas?");
        Scanner sc = new Scanner(System.in);
        int edad;
        char clase;
        clase = sc.next().charAt(0);
        System.out.println("Vas al grupo "+ clase);
        System.out.print("Introduce tu edad: ");
        edad = sc.nextInt();
        if (clase == 'A' && edad >= 18) {
            System.out.println("Estas en la clase correcta");
        }
        else if ((clase == 'B' || clase == 'C') && edad < 18){
            System.out.println("Estas en la clase correcta");
        }
        else {
            System.out.println("No estas en la clase correcta");
        }
        
    }
}
