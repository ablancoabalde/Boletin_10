
package ejer2.boletin10;

import java.util.Random;


public class Comprendido {
    
    Random rnd = new Random();
    
    public Comprendido(){
        
    }
    
    public int metodoComprendido(){
        int num =(int)(rnd.nextDouble() * 50 + 0);
        return num ;    
    }
}
