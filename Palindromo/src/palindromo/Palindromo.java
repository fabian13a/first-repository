package palindromo;
import javax.swing.JOptionPane;


public class Palindromo {
public static String pb, texto, palabra, palabrab;
    public static void main(String[] args) 
    {
     palabra=JOptionPane.showInputDialog("Dame la palabra: ");
        for (int i = 0; i < palabra.length(); i++) 
        {
         if(palabra.charAt(i) != ' ')
         {
            palabrab += palabra.charAt(i);
         }
        }
        int a=0; int b = palabra.length()-1; boolean error=false;
    if(palabra.charAt(a)==palabra.charAt(b))
    {
       a++;
       b--;
    }
    else{
        error=true;
    }
    if(!error)
    {
        System.out.println("Palabra: "+palabra+" es palindromo");
    }
    else
    {
        System.out.println("Palabra: "+palabra+" no es palindromo");
    }
        
    }
    
}
