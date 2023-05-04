/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carritodecompras;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class Carritodecompras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int cantidad, precio, subtotal, opcion;
        int total=0;
        do {
            System.out.println("agregar al carrito: ");
            System.out.println("ingrese el precio y la cantidad de producto que va a llevar: ");
            precio = scan.nextInt();
            cantidad = scan.nextInt();
            subtotal = cantidad * precio;
            System.out.println("el subtotal de su compra es: ");
            System.out.println(subtotal);
            total+=(float)subtotal;

            System.out.println("desea agregar mas productos al carrito? marque 1 si desea parar la compra o 2 si desea continuar:");
            System.out.println("1.cerrar");
            System.out.println("2.continuar");
            opcion = scan.nextInt();
            if (opcion == 1) {
                System.out.println("el total de su compra es: ");
                System.out.println(total);
            } 

        } while (opcion != 1);

    }

}
