package controlador;

import javax.swing.JOptionPane;
import static reto.v1.*;


public class ventana1 {
    
    public static int cp1=0, ck2=0, total;
    
    public void calcular(){
    try{
    
    cp1 = Integer.parseInt(cp.getText());
    ck2 = Integer.parseInt(ck.getText());
        
    total= cp1*1000+ck2*5000;
    JOptionPane.showMessageDialog(null,"Pinguinos comprados: "+cp1+"\nKoalas comprados: "+ck2+
            "\nEl precio total es: "+total);
    
    } catch(Exception e){

    JOptionPane.showMessageDialog(null,"Error..."+e);

}
}
}