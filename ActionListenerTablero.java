/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto.Math_Socket_Project_1;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author alero
 */
public class ActionListenerTablero implements ActionListener {

    private Game GAME;
    private PanelTablero panel;
    
    /**
     * Metodo constructor
     * @param panell panel donde se dibuja el tablero y jugadores
     */
    public ActionListenerTablero(PanelTablero panell) {
        this.panel = panell;
        Game game = new Game();
        this.GAME = game;

    }

    /**
     * Metodo que ejecuta las accioens al presionarse un boton especifico
     * @param e evento
     */
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Roll Dice":
                System.out.println("tiro de dado");
                Dice dice = new Dice();
                int move = dice.getRollResult();
                this.GAME.Play(move);
                this.panel.repaint();
                break;
        }
    }

    /**
     * metodo que dibuja el tablero
     * @param g graficos
     */
    public void dibujar(Graphics g) {
        g.fillRect(100, 100, 200, 200);
        for (int i = 100; i <= 200; i += 100) {
            for (int j = 100; j <= 200; j += 100) {
                g.clearRect(i, j, 50, 50);
            }
        }

        for (int i = 150; i <= 450; i += 100) {
            for (int j = 150; j <= 450; j += 100) {
               g.clearRect(i, j, 50, 50);
            }
        }
    }

    /**
     * Metodo que dibuja los jugadores en el tablero
     **/
    public void paintPlayer(Graphics g) {
        g.fillOval(this.GAME.player1.getX(), this.GAME.player1.getY(), 50, 50);
        g.fillOval(this.GAME.player2.getX(), this.GAME.player2.getY(), 50, 50);
    }

}
