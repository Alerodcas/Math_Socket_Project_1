/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto.Math_Socket_Project_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author alero
 */
public class ActionListenerPrincipal implements ActionListener {
    
    private GUIPrincipal guiPrincipal;
    private GUITablero panelTablero;


    public ActionListenerPrincipal(GUIPrincipal  guiPrincipal) {
        this.guiPrincipal = guiPrincipal;
        this.panelTablero = new GUITablero();
    }
    
    /**
     * Metodo que ejecuta las accioens al presionarse un boton especifico
     * @param e evento
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {

            case "Host Game":
                System.out.println("se escucha");
                Server server = new Server();
                try {
                    server.startServer();

                } catch (IOException ex) {
                    Logger.getLogger(ActionListenerPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
                panelTablero.setVisible(true);
                panelTablero.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                break;

            case "Join Game":
                Client client = new Client();
                 {
                    try {
                        client.iniciateClient();
                    } catch (IOException ex) {
                        Logger.getLogger(ActionListenerPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                         Logger.getLogger(ActionListenerPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                     }
                    panelTablero.setVisible(true);

                    break;

                }
        }

    }

}
