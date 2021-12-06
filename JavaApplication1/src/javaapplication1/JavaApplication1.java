/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Sumit
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("print for main class");
        beings be = new beings();   
        be.breadth(); be.die();
        System.out.println("");
       
        System.out.println("example of single inhertance:");
        animal am = new animal();   
        am.breadth(); am.die(); am.tail();
        System.out.println("");
       
        System.out.println("example of heirarical inhertance:");
        bird bir = new bird();   
        bir.breadth(); bir.die(); bir.fly();
        System.out.println("");
       
        System.out.println("example of multilevel inhertance:");
        dog dg = new dog();   
        dg.breadth(); dg.die(); dg.tail(); dg.bark();
                
    }
    
}
