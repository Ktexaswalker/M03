/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

import java.util.Scanner;

/**
 *
 * @author hema5364
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float extra;
        float dinero;
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantas horas has trabajado? ");
        int horas = sc.nextInt();
        if (horas > 35) {
            extra = (float) (1.5 * (float) (horas - 35));
        } else {
            extra = 0;
        }
        horas = (int) (extra + horas);
        dinero = 20 * horas;
        System.out.println("Cobraras: " + dinero);
    }
    
}
