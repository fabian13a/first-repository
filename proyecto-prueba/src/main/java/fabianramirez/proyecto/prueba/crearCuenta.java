/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabianramirez.proyecto.prueba;

/**
 *
 * @author fabian
 */
public class crearCuenta {
    
    public static void main(String[] args) {
        cuenta primeraCuenta = new cuenta();
        primeraCuenta.saldo = 200;
        System.out.println(primeraCuenta.saldo);

        primeraCuenta.saldo += 100;
        System.out.println(primeraCuenta.saldo);

        cuenta segundaCuenta = new cuenta();
        segundaCuenta.saldo = 50;

        System.out.println("primera Cuenta tiene " + primeraCuenta.saldo);
        System.out.println("segunda Cuenta tiene " + segundaCuenta.saldo);

        System.out.println(primeraCuenta.agencia);
        System.out.println(primeraCuenta.numero);

        System.out.println(segundaCuenta.agencia);

        segundaCuenta.agencia = 146;
        System.out.println("Ahora la segunda cuenta esta en la agencia " + segundaCuenta.agencia);

        if(primeraCuenta == segundaCuenta) {
            System.out.println("misma cuenta");
        } else {
            System.out.println("cuentas diferentes");
        }

        System.out.println(primeraCuenta);
        System.out.println(segundaCuenta);
    }      
      
       
}
