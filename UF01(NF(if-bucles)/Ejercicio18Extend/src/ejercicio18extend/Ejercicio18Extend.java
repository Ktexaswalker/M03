/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18extend;

import java.util.Scanner;

/**
 *
 * @author hema5364
 */
public class Ejercicio18Extend {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int horas, h_extra; //Es enter perque no tractem amb mitjes hores
        int HORAS_NORMAL = 35; //es enter perque no te sentit que sigui hores partides
        double T_NORMAL = 20; //el fico double, perque et podrien pagar la hora a 10.5
        double PRECIOS_EXTRA = 1.5;
        double salario, salario_extra, salario_normal; //
        double SALARIO_SIN_IMPUESTOS = 500;
        double SALARIO_TOPE_IMPUESTOS = 900;
        double salario_impuestos, salario_tope_impuestos;
        double impuestos = 0, impuestos_25;
        Scanner sc = new Scanner(System.in);
        if (salario > SALARIO_TOPE_IMPUESTOS) {
            salario_tope_impuestos = salario - SALARIO_TOPE_IMPUESTOS;
            impuestos_25 = salario_impuestos * 0.25;
            impuestos = impuestos + impuestos_25;
        }
        else if (salario > SALARIO_SIN_IMPUESTOS) {
            salario_impuestos = salario - SALARIO_SIN_IMPUESTOS;
        }
        if (salario_tope_impuestos)
        System.out.print("Quantes hores has treballat?... ");
        horas = sc.nextInt();
        if (horas>HORAS_NORMAL)
        { //tinc que pagar hores extres
            h_extra = horas - HORAS_NORMAL;
            //System.out.println("horas extra" + h_extra);
            salario_extra = h_extra*T_NORMAL*PRECIOS_EXTRA;
            salario_normal = HORAS_NORMAL*T_NORMAL;
            salario = salario_extra + salario_normal;
            System.out.println("Tu salario es... " + salario);
        }
        else
        { //tarifa normal
            //no definicio de variables
            salario = horas * T_NORMAL;
            System.out.println("Tu salario es... " + salario);
        }
    }
    
}
