/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pagoobreros;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class Pagoobreros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int horas, ho, extras, textras,opcion;
        int vhora = 3000;
        int total;
        
        do {

            System.out.println("horas que trabaja por dia: ");
            horas = scan.nextInt();
            ho = horas * 5;
            total = ho * vhora;
            System.out.println("la cantidad a pagarle es de: " + total);
            if (ho > 40) {
                extras = ho - 40;
                if (extras > 0 && extras < 8) {
                    textras = (extras * vhora) * 2;

                    System.out.println("la cantidad a pagarle es de: " + textras);
                } else {
                    if (extras > 8) {
                        textras = (extras * vhora) * 3;
                        System.out.println("la cantidad a pagarle es " + textras);
                    }
                 
                }

            }
            System.out.println("si desea terminar de dar la cantidad de pago marque 1 sino marque 2");
            opcion=scan.nextInt();
        }while(opcion!=1);
            
    }
}
