/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package americanbreadsbreakfast;

import java.util.Iterator;

public class AmericanBreads implements Iterator_Use {
    
    //Array for storing types of Breads
    
    public String types[] = {
        
        "Banana Bread","rudisillGetty","Baguette","Yuliya Koshchiy",
        "Breadstick","Westend61Getty","Brioche","Rachel WeillGetty ","Challah",
        "Pantry/Violeta PasatGetty","Ciabatta","Cornbread"
    
    };

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
       
        //Count Variables
        int count;
        
        @Override
        public boolean hasNext() {
            if(count < types.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return types[count++];
            }
            return null;
        }
    }
}