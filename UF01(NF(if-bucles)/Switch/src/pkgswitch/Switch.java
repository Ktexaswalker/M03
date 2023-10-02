/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author hema5364
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon un numero del 1 al 7: ");
        int dias = sc.nextInt();
        switch (dias) {
            case 1:
                System.out.println("1º dia de la semana");
                break;
             case 2:
                System.out.println("2º dia de la semana");
                break;
            case 3:
                System.out.println("3º dia de la semana");
                break;
            case 4:
                System.out.println("4º dia de la semana");
                break;
            case 5:
                System.out.println("5º dia de la semana");
                break;
            case 6:
                System.out.println("6º dia de la semana");
                break;
            case 7:
                System.out.println("7º dia de la semana");
                break;
            default:
                System.out.println("dia no valido");
        }       
        System.out.print("Pon la letra inicial del mes: ");
        char inicial = sc.next().charAt(0);
        switch (inicial) {
            case 'e':
                System.out.println("Enero");
                break;
            case 'E':
                System.out.println("Enero");
                break;
            case 'f':
                System.out.println("Febrero");
                break;
            case 'F':
                System.out.println("Febrero");
                break;
            case 'm':
                System.out.println("Marzo");
                break;
            case 'M':
                System.out.println("Marzo");
                break;
            case 'a':
                System.out.println("Abril");
                break;
            case 'A':
                System.out.println("Abril");
                break;
            case 'y':
                System.out.println("Mayo");
                break;
            case 'Y':
                System.out.println("Mayo");
                break;
            case 'j':
                System.out.println("Junio");
                break;
            case 'J':
                System.out.println("Junio");
                break;
            case 'l':
                System.out.println("Julio");
                break;
            case 'L':
                System.out.println("Julio");
                break;
            case 'g':
                System.out.println("Agosto");
                break;
            case 'G':
                System.out.println("Agosto");
                break;    
            case 's':
                System.out.println("Setiembre");
                break;
            case 'S':
                System.out.println("Setiembre");
                break;
            case 'o':
                System.out.println("Octubre");
                break;
            case 'O':
                System.out.println("Octubre");
                break;
            case 'n':
                System.out.println("Noviembre");
                break;
            case 'N':
                System.out.println("Noviembre");
                break;
            case 'd':
                System.out.println("Diciembre");
                break;
            case 'D':
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("No existe tal mes");
        }
    }
    
}
