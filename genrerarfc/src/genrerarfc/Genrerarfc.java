package genrerarfc;

import java.math.*;
import java.security.*;
import java.util.Scanner;

/**
 *
 * @author Fabian
 */
public class Genrerarfc {

    public static void main(String[] args) throws Exception {
        Scanner scan= new Scanner(System.in);
int opc;
String s;
        System.out.println("Ingresa la cadena: ");
        s= scan.nextLine();
        System.out.println("elige una opcion: \n1-MD5.\n2-SHA1.");
        opc= scan.nextInt();
       
        switch (opc){
                case 1:
                    MessageDigest m=MessageDigest.getInstance("MD5");
                    m.update(s.getBytes(),0,s.length());
                    System.out.println("MD5: "+new BigInteger(1,m.digest()).toString(16));
                    break;
                case 2:
                    String g="hola como estasa ";
                    System.out.println(""+g.replace(" ",""));
                    break;
        
    }
    }
    
}
