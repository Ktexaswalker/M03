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
        int T_NORMAL = 20;
        int HORAS_NORMALES = 35;
        int horas;
        int h_extra;
        int salario_extra;
        int salario_normal;
        float salario;
        int SALARIO_SIN_IMPUESTOS = 500;
        float impuestos;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero de horas trabajadas: ");
        horas = sc.nextInt();
        if (horas > HORAS_NORMALES) {
            h_extra = horas - HORAS_NORMALES;
            salario_extra = (int) ((float) h_extra * (float) (T_NORMAL * 1.5));
            salario_normal = HORAS_NORMALES * T_NORMAL;
            salario = salario_extra + salario_normal;
        } else {
            salario = horas * T_NORMAL;
        }
        System.out.println("El salario es: " + salario);
        if (salario > SALARIO_SIN_IMPUESTOS) {
            impuestos = salario - SALARIO_SIN_IMPUESTOS;
            System.out.println("salario: " + salario + " de los cuales: " + impuestos + " son con impuestos");
            System.out.println("libres de impuestos: " + SALARIO_SIN_IMPUESTOS + " impuestos con imposicion: " + impuestos);
            impuestos = (float)(((float)impuestos * (float)0.25));
            System.out.println("impuestos * 25%: " + impuestos + "\nSalario: " + salario);
            salario = (float) ((int)((float)salario) - impuestos);
            System.out.println("salario: " + salario);
        } else {
            System.out.println("No hay impuestos");
        }
        System.out.println("Tu sueldo es de: " + salario +" Euros");
    }
    
}
