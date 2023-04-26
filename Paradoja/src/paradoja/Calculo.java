package paradoja;

import javax.swing.JOptionPane;


public class Calculo extends Paradoja
{
    
    public Calculo()
    {
        tortuga = 100.0;
        aquiles = 0.0; 
        ventaja = 100.0;
        seg = 0.0;
        ven = (double) Math.round(ventaja);
        x = 0;       
    }
    public void problema()
    {
        try{
        if(num <= 5)
        {
        System.out.println("Etapa         Aquiles         Tortuga          Ventaja         Segundos\n"
                + "     "+x+"          "+aquiles+"          "+tortuga+"          "+ven+"          "+seg);
        for(x = 1; x <= num; x++)
        {            
            
            aquiles = tortuga;
            tortuga = tortuga + ((ventaja/10));
            ventaja = tortuga - aquiles;
            seg = (aquiles/10);
            ven = (double) Math.round(ventaja*10000000)/10000000;    
            
            
            System.out.println("     "+x+"          "+aquiles+"          "+tortuga+"          "+ven+"          "+seg);
        }    
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Etapa no valida");
        }
        }catch(Exception e){
            System.out.println(""+e);
}   
    }
    
   
    
}
