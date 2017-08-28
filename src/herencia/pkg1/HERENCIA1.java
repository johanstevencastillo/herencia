/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.pkg1;

import java.util.Scanner;

/**
 *
 * @author Johan Castillo
 */
public class HERENCIA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Carro carro = new Carro();
        Camion camion =  new Camion();
        Scanner leer = new Scanner(System.in);
        System.out.println("diga la marca del carro ");
        carro.marca=leer.nextLine();
        System.out.println("marca="+carro.marca);
       
    }
    
}
