package controlador;
import javax.swing.JOptionPane;
import static reto.v2.*;



public class ventana2 {
    
  public void calcular(){
     try{
int v1,v2,total;
v1= Integer.parseInt(ca.getText());
v2= Integer.parseInt(cc.getText());
total = v1*300+v2*200;
JOptionPane.showMessageDialog(null,"Blue birds comprados: "+v1+"\nColibris comprados: "+v2+
            "\nEl total es: "+total);
     }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Error..."+e);
     }
     }

}  

