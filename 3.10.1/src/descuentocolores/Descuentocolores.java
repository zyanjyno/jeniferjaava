/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package descuentocolores;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class Descuentocolores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int compra, color ;
        double subtotal;
        int total=0;
      int clientes=0;
        Scanner scan = new Scanner(System.in);
        Scanner scann = new Scanner(System.in);
        
        
        
       do{
           clientes++;
           System.out.println("siguiente cliente: "+clientes);
        System.out.println("bienvenido!");
        System.out.println("por favor puede ingresar el valor de toda su compra: ");
        compra = scan.nextInt();
        System.out.println("ahora elige una bolita de color, tal vez obtengas un gran descuento!");
        System.out.println("1.rojo");
        System.out.println("2.amarillo");
        System.out.println("3.blanco");
        System.out.println("4.NO cerrar");
        color = scann.nextInt();
        if (color< 1 || color >4 ){
            System.out.println("esa opcion no es valida, intente de nuevo.");
        }
        switch (color) {
        case 1:
            subtotal = 0.40*compra;
            subtotal = compra-subtotal;
            System.out.println("la bolita escogida fue la de color rojo, su descuento es de 40% y el total a pagar es "+subtotal);
             total+=(float)subtotal;
            break;
        case 2:
            subtotal = 0.25*compra;
            subtotal = compra-subtotal;
            System.out.println("la bolita escogida fue la de color amarillo, su descuento es de 25% y el total a pagar es "+subtotal);
             total+=(float)subtotal;
            break;
        case 3:
            subtotal = compra;
            subtotal = compra-subtotal;
            System.out.println("la bolita escogida fue la de color blanco, mala suerte no hay desceunto y el total a pagar es "+subtotal);
             total+=(float)subtotal;
            break;
        case 4:
            break;
       
       
    }
           
          
        } while (color!=04);
         System.out.println("cuantos clientes ingresaron:");
         System.out.println(clientes);
        
        System.out.println("el ingreso en la venta de hoy es: ");
       
        System.out.println(total);
        
        }
        
            
        }