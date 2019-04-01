/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import Logica.CapturaTeclado;
import Logica.EjemploCiclo;
import Logica.EjemploCondicional;

/**
 *
 * @author Estudiantes
 */
public class Principal {

    public static void main(String[] args){
        System.out.println("Nuevo ejercicio: ");
        CapturaTeclado ct = new CapturaTeclado();
        ct.operacion();
        System.out.println("Ejemplo de Condicional: ");
        EjemploCondicional ec = new EjemploCondicional();
        ec.operacion();
        System.out.println("Ejemplo de Ciclo: ");
        EjemploCiclo cl= new EjemploCiclo();
        cl.operation();
    }

}
