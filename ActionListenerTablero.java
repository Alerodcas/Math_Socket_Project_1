/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto.Math_Socket_Project_1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alero
 */
public class ActionListenerTablero implements ActionListener {

    private Game GAME;
    private PanelTablero panel;
    private Server server;
    private Client client;

    /**
     * Metodo constructor
     *
     * @param panell panel donde se dibuja el tablero y jugadores
     */
    public ActionListenerTablero(PanelTablero panell) {
        this.panel = panell;
        Game game = new Game();
        this.GAME = game;
        Server servidor = new Server();
        Client cliente = new Client();

        this.server = servidor;
        this.client = cliente;

    }

    /**
     * Metodo que ejecuta las acciones al presionarse un boton especifico
     *
     * @param e evento
     */
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Roll Dice":
                Dice dice = new Dice();
                int move = dice.getRollResult();
                this.GAME.Play(move);
                this.panel.repaint();
                break;

        }

    }

    /**
     * metodo que dibuja el tablero
     *
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
     *
     */
    public void paintPlayer(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(this.GAME.player1.getX(), this.GAME.player1.getY(), 50, 50);
        g.setColor(Color.blue);
        g.fillOval(this.GAME.player2.getX(), this.GAME.player2.getY(), 50, 50);

    }

}
