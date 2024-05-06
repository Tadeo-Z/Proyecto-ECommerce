package com.mycompany.proyectoe.commerce;

import Interfaz.frmInicio;
import persistencia.Conexion;


/**
 *
 * @author yalam
 */
public class ProyectoECommerce {
    /**
     * clase main 
     * @param args  
     */
    public static void main(String[] args) {
        System.out.println("Esto es un mensaje de prueba jaja salu3");
        Conexion conex = new Conexion();

        conex.getConexion();
        
        frmInicio log = new frmInicio();
        log.setVisible(true);     


    }
}
