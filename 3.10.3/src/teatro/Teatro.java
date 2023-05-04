/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teatro;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class Teatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // TODO code application logic here
        double descuento;
        int edad, opcion;
        int total = 0;
        int boleta = 78000;
        do {

            System.out.println("para comprar el boleto primero ingrese su edad");
            edad = scan.nextInt();
            if (edad > 5 && edad <= 14) {
                System.out.println("entra en la categoria 1, su descuento es de 35%");
                System.out.println("el valor de su boleta es: ");
                descuento = 0.35 * boleta;
                descuento = boleta - descuento;
                System.out.println(descuento);
                total += descuento;

            } else {
                if (edad > 15 && edad <= 19) {
                    System.out.println("entra en la categoria 2, su descuento es de 25%");
                    System.out.println("el valor de su boleta es: ");
                    descuento = 0.25 * boleta;
                    descuento = boleta - descuento;
                    System.out.println(descuento);
                    total += descuento;

                } else {
                    if (edad > 20 && edad <= 45) {
                        System.out.println("entra en la categoria 3, su descuento es de 10%");
                        System.out.println("el valor de su boleta es: ");
                        descuento = 0.10 * boleta;
                        descuento = boleta - descuento;
                        System.out.println(descuento);
                        total += descuento;

                    } else {
                        if (edad < 46 && edad <= 65) {
                            System.out.println("entra en la categoria 4, su descuento es de 25%");
                            System.out.println("el valor de su boleta es: ");
                            descuento = 0.25 * boleta;
                            descuento = boleta - descuento;
                            System.out.println(descuento);
                            total += descuento;

                        } else {
                            if (edad > 66) {
                                System.out.println("entra en la categoria 5, su descuento es de 35%");
                                System.out.println("el valor de su boleta es: ");
                                descuento = 0.35 * boleta;
                                descuento = boleta - descuento;
                                System.out.println(descuento);
                                total += descuento;
                            }
                        }
                    }

                }
            }
            System.out.println("si desea terminar con la compra igrese el numero 1 sino presione 2");
            opcion = scan.nextInt();
            System.out.println("el total de todas las boletas: ");
            System.out.println(total);

        } while (opcion != 1);

    }
}
