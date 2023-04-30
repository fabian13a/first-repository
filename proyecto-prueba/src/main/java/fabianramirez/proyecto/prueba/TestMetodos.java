/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabianramirez.proyecto.prueba;

/**
 *
 * @author fabia
 */
public class TestMetodos {
     public static void main (String[] args) {
        cuenta cuentaDeDiego = new cuenta();
        cuentaDeDiego.saldo = 100;
        cuentaDeDiego.deposita(50);
        System.out.println(cuentaDeDiego.saldo);

        boolean consigioRetirar = cuentaDeDiego.saca(20);
        System.out.println(cuentaDeDiego.saldo);
        System.out.println(consigioRetirar);

        cuenta cuentaDeJimena = new cuenta();
        cuentaDeJimena.deposita(1000);

        boolean exitoTransferencia = cuentaDeJimena.transfiere(300, cuentaDeDiego);
        if(exitoTransferencia) {
            System.out.println("transferencia exitosa");
        } else {
            System.out.println("falto dinero");
        }
    }
    
}
