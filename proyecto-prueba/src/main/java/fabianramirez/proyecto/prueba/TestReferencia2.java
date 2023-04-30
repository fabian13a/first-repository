/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabianramirez.proyecto.prueba;

/**
 *
 * @author fabia
 */
public class TestReferencia2 {
    public static void main(String[] args) {
        Cliente diego = new Cliente();
        diego.nombre = "Diego Rojas";
        diego.documento = "33442211";
        diego.telefono = "987654321";

        Cuenta cuentaDeDiego = new Cuenta();
        cuentaDeDiego.deposita(100);

        cuentaDeDiego.titular = diego;
        System.out.println(cuentaDeDiego.titular.nombre);
    }
    
}
