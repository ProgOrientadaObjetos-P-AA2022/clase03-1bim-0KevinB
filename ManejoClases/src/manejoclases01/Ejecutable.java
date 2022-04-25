/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases01;


public class Ejecutable {
    public static void main(String[] args) {
        // Se crea un objeto
        Hospital hospital = new Hospital();
        Hospital hospita2 = new Hospital();
        
        // Se asigna valores particulares al objeto
        hospital.nombre = "Isidro Ayora";
        hospital.numeroCamas = 100;
        hospital.presupuesto = 560340.43;
        hospita2.nombre = "San Agustin";
        hospita2.numeroCamas = 90;
        hospita2.presupuesto = 610002.67;
        
        
        // Se presenta valores en pantalla
        System.out.printf("%s - %d - %.2f\n", hospital.nombre,
                hospital.numeroCamas, hospital.presupuesto);
        System.out.printf("%s - %d - %.2f\n", hospita2.nombre,
                hospita2.numeroCamas, hospita2.presupuesto);
        
        // System.out.println(hospital.nombre + "-" + hospital.numeroCamas);
    }
}
