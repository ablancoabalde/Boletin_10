
package ejer2.boletin10;

import javax.swing.JOptionPane;

public class Condicion {
    private boolean acertar=false;
    
    public Condicion(){
        
    }
    
    public void metodoCondicion(int num,int res){
        if(num==res){
                 JOptionPane.showMessageDialog(null, "Has acertado");
                 acertar=true;
             }else if(num<res){                 
                 JOptionPane.showMessageDialog(null, "El número introducido es mayor que el número a acertar"); 
                 
             }else{
                 JOptionPane.showMessageDialog(null, "El número introducido es menor que el número a acertar");
                 
             }
       
    }
    
    public boolean metodoAcertar(){
        
        if(acertar==true){
            return true;
        }else{
            return false;
        }
        
    }
}
