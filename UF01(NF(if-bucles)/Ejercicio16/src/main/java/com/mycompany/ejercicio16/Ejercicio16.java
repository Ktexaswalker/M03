/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio16;
import java.util.Scanner;
/*
*   16.	Dibuja un ordinograma que lea una calificación numérica 
*       entre 0 y 10 y la transforma en calificación alfabética, 
*       escribiendo el resultado.
*
•	de 0 a <3 Muy Deficiente.
•	de 3 a <5 Insuficiente.
•	de 5 a <6 Bien.
•	de 6 a <9 Notable
•	de 9 a 10 Sobresaliente

 * @author hema5364
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner pantalla = new Scanner(System.in);
        System.out.print("Introduce un numero entre 0 y 10: ");
        int nota = pantalla.nextInt();
        if (nota >= 0 && nota <= 10) {
            if (nota >= 0 && nota < 3) {
                System.out.println("Muy Deficiente");
            } 
            else if (nota >= 3 && nota < 5) {
                System.out.println("Insuficiente");
            } 
            else if (nota >= 5 && nota <= 6) {
                System.out.println("Bien");
            } 
            else if (nota > 6 && nota < 9) {
                System.out.println("Notable");
            } 
            else if (nota >= 9 && nota <= 10) {
                System.out.println("Sobresaliente");
            }
        }
        else {
            System.out.print("La nota introducida esta fuera de los parametros");
        }
    }
}
