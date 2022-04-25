/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del hospital 1");
        String nombreHospital = entrada.nextLine();
        System.out.println("Ingrese el numero de camas del hospital 1");
        int camas1 = entrada.nextInt();
        System.out.println("Ingrese el numero de presupuesto del hospital 1");
        double presupuesto = entrada.nextDouble();

        
        Hospital h1 = new Hospital();
        h1.establecerNumeroCamas(camas1);
        h1.establecerNombre(nombreHospital);
        h1.establecerPresupuesto(presupuesto);

        System.out.printf("%s\n%s\n%s\n",h1.obtenerNombre(), h1.obtenerNumeroCamas(),
                h1.obtenerPresupuesto());
        entrada.nextLine();
        
        System.out.println("Ingrese el nombre del hospital 2");
        String nombreHospital2 = entrada.nextLine();
        System.out.println("Ingrese el numero de camas del hospital 2");
        int camas2 = entrada.nextInt();
        System.out.println("Ingrese el numero de presupuesto del hospital 2");
        double presupuesto2 = entrada.nextDouble();

        
        Hospital h2 = new Hospital();
        h2.establecerNumeroCamas(camas2);
        h2.establecerNombre(nombreHospital2);
        h2.establecerPresupuesto(presupuesto2);

        System.out.printf("%s\n%s\n%s\n",h2.obtenerNombre(), h2.obtenerNumeroCamas(),
                h2.obtenerPresupuesto());
    }
}
