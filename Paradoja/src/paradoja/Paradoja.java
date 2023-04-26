package paradoja;

import javax.swing.JOptionPane;


public class Paradoja 
{
public static int num, x;
public static Double tortuga, aquiles, ventaja, seg, ven;
   
    public static void main(String[] args) 
    {
        JOptionPane.showMessageDialog(null,"Paradoja de Aquiles y la Tortuga");
        num = Integer.parseInt(JOptionPane.showInputDialog("¿Hasta qué etapa deseas ver? (0-5)"));
        Calculo Cal= new Calculo ();
        Cal.problema();
    }
    
}
