/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package americanbreadsbreakfast;

import java.util.Iterator;


public class AmericanBreadsBreakFast {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AmericanBreads availableBreads = new AmericanBreads();

        System.out.println("Bread Types are available in Factory:");
           
        System.out.println();
        
        for(Iterator repeat= availableBreads.getIterator(); repeat.hasNext();){
            String breadType = (String)repeat.next();
            
            
            System.out.println("-> " + breadType);
        
            System.out.println();
        
        }
    }
    
}
