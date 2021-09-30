package com.mycompany.proyecto.Math_Socket_Project_1;



import java.util.*;

public class Game {
    private DoubleNode finalPos;
    private boolean state;
    public Player lastPlayer;
    public Player playingPlayer;
    public Player player1;
    public Player player2;
    private Player tmp;
    
    
    /**
     * Metodo constructor
     */
    public Game(){
        LinkedList tablero = new LinkedList();
        tablero.add_randomly(tablero);
        Player player1 = new Player(tablero.head, 100,100);
        Player player2 = new Player(tablero.head, 100,100);
        this.finalPos = tablero.tail;
        this.state = true;
        this.player1 = player1;
        this.player2 = player2;
        this.playingPlayer = player1;
        this.lastPlayer = player2;

        
    }
    
    /**
     * Mueve al jugador en el tablero
     * @param move cantidad de espacios que se mueve el jugador
     */
    public void Play(int move){
        for (int i=0;i<move;i++){
            playingPlayer.setCurrentPosition(playingPlayer.getCurrentPosition().getNext());
        }playingPlayer.movePlayer(move);
        checkWin(playingPlayer);
        checkBoxType();
        tmp = playingPlayer;
        playingPlayer = lastPlayer;
        lastPlayer = tmp;
    }
    
    /**
     * Metodo que revisa el tipo de casilla del jugador y llama o hace la funcion correspondiente
     */
    public void checkBoxType(){
        if(playingPlayer.currentPosition.getType()=="challenge"){
            Challenge_box.generate_problem();
            lastPlayer.setCurrentPosition(lastPlayer.getCurrentPosition().getNext());
            }
        if(playingPlayer.currentPosition.getType()=="tunel"){
            int move = generate_random();
                for(int i=0; i<move;i++){
                    playingPlayer.setCurrentPosition(playingPlayer.getCurrentPosition().getNext());
                }System.out.println("El jugador ha caido en una casilla de tunel y avanza "+move+" espacios");
        }if(playingPlayer.currentPosition.getType()=="trampa"){
            int move = generate_random();
                for(int i=0; i<move;i++){
                    playingPlayer.setCurrentPosition(playingPlayer.getCurrentPosition().getPrev());
                }System.out.println("El jugador ha caido en una casilla de trampa y retrocede "+move+" espacios");
        }
    }
    
    /**
     * Metodo que genera el numero random de casillas que va a avanzar/retroceder el jugador
     * @return numero random entre 1 y 3
     */
    static int generate_random(){
        int max=3,min=1;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        return random_int;
    }
    
    /**
     * Verifica si el jugador alcanza la ultima casilla o la pasa
     * @param player ultimo jugador que se movio
     */
    public void checkWin(Player player){
        if(player.getCurrentPosition() == finalPos || player.getCurrentPosition()== null){
            state = false;
            System.exit(0);
        }else{
        }
    }
    
    
}
