/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg12.pkg9;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese dos numeros: ");
        int num1 = sc.nextInt();

        int num2 = sc.nextInt();

        if (num2 % 2 != 0) {

            int mcm = num1;
            while (mcm % num2 != 0) {
                mcm += num1;
            }
            System.out.println("El mínimo común múltiplo es: " + mcm);
        }
    }

}
