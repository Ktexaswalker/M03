/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18_correccion;

import java.util.Scanner;

/**
 *
 * @author hema5364
 */
public class Ejercicio18_correccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int t_normal = 20;
        int horas_normales = 35;
        int horas;
        int h_extra;
        int salario_extra;
        int salario_normal;
        int salario;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero de horas trabajadas: ");
        horas = sc.nextInt();
        if (horas > horas_normales) {
            h_extra = horas - horas_normales;
            salario_extra = (int) ((float) h_extra * (float) (t_normal * 1.5));
            salario_normal = horas_normales * t_normal;
            salario = salario_extra + salario_normal;
        } else {
            salario = horas * t_normal;
        }
        System.out.println("Tu sueldo es de: " + salario +" Euros");
    }
    
}
