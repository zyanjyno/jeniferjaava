/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg12.pkg8;

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

        // Leer dos números
        System.out.print("Ingrese dos numeros: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

       
        if (num1 % 2 == 0) {
            
            int mcd = 1;
            for (int i = 1; i <= num1 && i <= num2; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    mcd = i;
                }
            }

           
            System.out.println("El máximo común divisor del primer numero es: " + mcd);
    }
    }
    
}
