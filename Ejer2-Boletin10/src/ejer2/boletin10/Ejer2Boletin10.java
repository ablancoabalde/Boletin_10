
package ejer2.boletin10;

import javax.swing.JOptionPane;

public class Ejer2Boletin10 {

    public static void main(String[] args) {
        Condicion cond = new Condicion();
        Comprendido comp= new Comprendido();

        JOptionPane.showMessageDialog(null, "Número comprendido entre 1 y 50"); 

        int num=comp.metodoComprendido();
        
        String intentos = JOptionPane.showInputDialog("Ingrese numero de intentos: ");
        
        int ent = Integer.parseInt(intentos);
        
       
        for(int i=0; i<ent;i++){
           
                
           
            if(cond.metodoAcertar()==true){
                break;
            }else{
             JOptionPane.showMessageDialog(null, "Tienes " + (ent-i) + " intentos");
             String respuesta =JOptionPane.showInputDialog("Ingrese número: ");
             int res = Integer.parseInt(respuesta);
             cond.metodoCondicion(num, res);
             if(i+1==ent){
                  JOptionPane.showMessageDialog(null, "Se te han acabado los intentos");  
            }  
            }  
         
           
           
        }
    }
    
}
