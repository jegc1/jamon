/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jamon;

/**
 *
 * @author portatil_profesorado
 */
public class Main {
    
    public static void main(String[] args) {
        JamonGonzalezClarosJoseEugenio2122 miJamonGonzalezClarosJoseEugenio2122;
        int stockActual;
        
        miJamonGonzalezClarosJoseEugenio2122 = new JamonGonzalezClarosJoseEugenio2122("5Jotas",580,100);
        vendeJamGonzalezClarosJoseEugenio2122(miJamonGonzalezClarosJoseEugenio2122);
        
        compraJamGonzalezClarosJoseEugenio2122(miJamonGonzalezClarosJoseEugenio2122);
        stockActual = miJamonGonzalezClarosJoseEugenio2122.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }

    private static void compraJamGonzalezClarosJoseEugenio2122(JamonGonzalezClarosJoseEugenio2122 miJamonGonzalezClarosJoseEugenio2122) {
        try
        {
            System.out.println("Compra de Jamones");
            miJamonGonzalezClarosJoseEugenio2122.comprar(50);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar " + e);
        }
    }

    private static void vendeJamGonzalezClarosJoseEugenio2122(JamonGonzalezClarosJoseEugenio2122 miJamonGonzalezClarosJoseEugenio2122) {
        try
        {
            System.out.println("Venta de Jamones");
            miJamonGonzalezClarosJoseEugenio2122.vender(80, "Espa\u00f1a");
        } catch (Exception e)
        {
            System.out.print("Fallo al vender " + e);
        }
    }
}
