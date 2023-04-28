package controlador;

import javax.swing.JOptionPane;
import static reto.v3.*;
public class ventana3 {
    
    public void calcular(){
        try{
     int v1,v2,total;
v1= Integer.parseInt(cn.getText());
v2= Integer.parseInt(cd.getText());
total = v1*150+v2*120;
JOptionPane.showMessageDialog(null,"Nemos comprados: "+v1+"\nDoris comprados: "+v2+
            "\nEl total es: "+total);    
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error..."+e);
        }
        }  
}
