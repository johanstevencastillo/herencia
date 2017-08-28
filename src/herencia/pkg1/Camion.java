/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.pkg1;

/**
 *
 * @author Johan Castillo
 */
public class Camion extends Carro {
     int capacidad;
     int codigo;

    
   void imprimir(){
       System.out.println("la capacidad es "+this.capacidad);
       System.out.println("el codigo es "+this.codigo);
       System.out.println("la placa es "+this.placa);
       System.out.println("la marca es "+this.marca);
       System.out.println("el cilindraje ess "+this.cilndraje);
   }
   

   
 
    
}
