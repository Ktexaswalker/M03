/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author hema5364
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dibuja un ordinograma que toma como dato de entrada un número 
        que corresponde a la longitud de un radio y nos escribe la longitud 
        de la circunferencia(Pi * diametro), el área del círculo
        (buscalo en google).*/
        System.out.print("Introduce la longitud de un radio: ");
        Scanner pantalla = new Scanner(System.in);
        double pi = 3.1415926535897932384626433832795028841971693993751058209;
        double radio = pantalla.nextDouble();
        double longitudCircunferencia = ((radio*radio) * pi);
        System.out.println("El area del circulo es " + longitudCircunferencia + ".");
    }
    
}
