/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabianramirez.proyecto.prueba;

/**
 *
 * @author fabia
 */
public class TestReferencia {
    public static void main(String[] args) {
        cuenta primeraCuenta = new cuenta();
        primeraCuenta.saldo = 300;

        System.out.println("saldo de primera cuenta : " + primeraCuenta.saldo);

        cuenta segundaCuenta = primeraCuenta;

        System.out.println("saldo de segunda Cuenta: " + segundaCuenta.saldo);

        segundaCuenta.saldo += 100;
        System.out.println("saldo de segunda Cuenta " + segundaCuenta.saldo);

        System.out.println(primeraCuenta.saldo);

        if(primeraCuenta == segundaCuenta) {
            System.out.println("Es la misma cuenta");
        }

        System.out.println(primeraCuenta);
        System.out.println(segundaCuenta);
    }
    
}
