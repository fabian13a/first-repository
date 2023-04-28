
package controlador;

import javax.swing.JOptionPane;
import reto.login;
import static reto.login.contraseña;
import static reto.login.usuario;
import reto.v1;
import reto.v2;
import reto.v3;

public class log {
    public static void main(String[] args) {
        
        }
    
    public static void entrar(){
        
        try{
            
            
    int posicion;
    posicion = usuario.getSelectedIndex();
    
    if(posicion==1 && contraseña.getText().equals("1a")){
         v1 v= new v1();
         v.setVisible(true);
         
            
    }else if(posicion==2 && contraseña.getText().equals("2a")){
           v2 v= new v2();
         v.setVisible(true);
    }else if(posicion==3 && contraseña.getText().equals("3a")){
         v3 v= new v3();
         v.setVisible(true);
        } else{
        JOptionPane.showMessageDialog(null,"Usuario o contraseña incorrectos...");
        login l=new login();
        l.setVisible(true);
    }
}catch (Exception e){ 

JOptionPane.showMessageDialog(null,"Error..."+e);

}
}
}

