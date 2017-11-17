
package extra_empresa;

import javax.swing.JOptionPane;



public class Repetir {
    Traballador tr=new Traballador();
    
    public Repetir() {
        
    }
    
    public void metodoRepetir(){
        String nom= JOptionPane.showInputDialog ("Introduzca nombre");
        
        
        while(!nom.equals("*")){
            
            String nfi= JOptionPane.showInputDialog ("Número de fillos");
             int n = Integer.parseInt(nfi);//se convierte el dato a entero
            String habs= JOptionPane.showInputDialog ("Horas de absentismo");
             int h = Integer.parseInt(habs);//se convierte el dato a entero
            String sueldo= JOptionPane.showInputDialog ("Sueldo base");
             int s = Integer.parseInt(sueldo);//se convierte el dato a entero
            tr=new Traballador(nom,n,h,s);
            
            
            JOptionPane.showMessageDialog(null, tr.toString());
            
            
            
             nom= JOptionPane.showInputDialog ("Introduzca nombre");
        }
        
    
    }
  
    
    
    
}
