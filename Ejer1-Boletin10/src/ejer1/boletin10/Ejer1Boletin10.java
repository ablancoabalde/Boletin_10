
package ejer1.boletin10;

import javax.swing.JOptionPane;

public class Ejer1Boletin10 {

    public static void main(String[] args) {
       
        Condicion cond = new Condicion();
        Comprendido comp= new Comprendido();
        
        String ndescubrir = JOptionPane.showInputDialog("Ingrese un numero comprendido entre 1 y 50: ");
        int num = Integer.parseInt(ndescubrir);//se convierte el dato a entero
        
        while(comp.metodoComprendido(num)==0){
             num=comp.metodoComprendido(num);
             ndescubrir = JOptionPane.showInputDialog("Ingrese un numero comprendido entre 1 y 50: ");
             num = Integer.parseInt(ndescubrir);
        }
        
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
