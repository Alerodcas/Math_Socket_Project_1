/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto.Math_Socket_Project_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author alero
 */
public class ActionListenerPregunta implements ActionListener {

    private GUIPregunta ventana;

    /**
     * Metodo constructor
     *
     * @param gui ventana que se va a cerrar
     */
    public ActionListenerPregunta(GUIPregunta gui) {
        this.ventana = gui;

    }

    /**
     * Metodo que ejecuta las acciones al presionarse un boton especifico
     * 
     * @param e evento
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {

            case "Submit":
                this.ventana.dispose();

        }
    }
}
