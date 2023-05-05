/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg12.pkg10;
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
        Scanner scan = new Scanner (System.in);
           int a = 0, b = 1, c;
        System.out.print(a + " " + b);
        for(int i = 2; i <= 100; i++){
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
    
}
