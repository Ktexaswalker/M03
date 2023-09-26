/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;
import java.util.Scanner;
/**
 *
 * @author hema5364
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        float num1 = sc.nextFloat();
        System.out.print("Introduzca un numero: ");
        float num2 = sc.nextFloat();
        if (num1 == num2) {
            System.out.println("Los numeros son iguales");
        }
        else {
            if (num1 > num2) {
                System.out.println(num1 + " es mayor que "+ num2);
            } else {
                System.out.println(num1 + " es menor que "+ num2);
            }
        }
    }
}
