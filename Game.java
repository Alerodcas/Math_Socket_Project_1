/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elements.Math_Socket_Project_1;

import Board.DoubleNode;
import Board.LinkedList;
import My_Challenge_box.My_Challenge_box;
import java.util.*;

public class Game {
    private DoubleNode finalPos;
    private Player player1;
    private Player player2;
    private boolean state;
    private List<Player> players;
    
    public static void main(String[] args) {
        Game game = new Game();
        game.startGame(game);
        }
    

    public Game(){
        LinkedList lista = new LinkedList();
        lista.maxsize = 16;
        lista.add_randomly(lista);
        finalPos = lista.tail;
        state = true;
        player1 = new Player(lista.head);
        player2 = new Player(lista.head);
        players = new ArrayList<Player>();
        players.add(player1);
        players.add(player2);
        
    }
    
    
    public void startGame(Game game){
        Dice dice = new Dice();
        Scanner input = new Scanner(System.in);
        while(game.state){
            game.players.forEach(Player -> {
                if(Player==player1){
                    String jugador = "Jugador 1";
                }else{
                    String jugador = "Jugador 2";
                }
            System.out.println("Digite 1 para tirar el dado");
            if (input.nextInt()==1){
                int move = dice.getRollResult();
                for(int i=0; i<move;i++){
                    Player.setCurrentPosition(Player.getCurrentPosition().getNext());
                    checkWin(Player,game);
                }
                if(Player==player1){
                    System.out.println("El jugador 1 tiro un "+move+" y avanzo hasta una casilla tipo "+Player.currentPosition.getType());
                    checkBoxType(Player.getCurrentPosition(), Player, game);
               }else{
                    System.out.println("El jugador 2 tiro un "+move+" y avanzo hasta una casilla tipo "+Player.currentPosition.getType());
                    checkBoxType(Player.getCurrentPosition(), Player, game);
                }
            }else{
                System.out.println("Por favor digite una respuesta valida");
            }
              
        });   
        }
    }
    
    public void checkBoxType(DoubleNode pos, Player player, Game game){
        if(pos.getType()=="challenge"){
            My_Challenge_box.generate_problem();
            My_Challenge_box.check_answer();
            if(player==player1){
                player2.setCurrentPosition(player2.getCurrentPosition().getNext());
                System.out.println("El jugador 2 avanza un espacio");
            }else{
                player1.setCurrentPosition(player1.getCurrentPosition().getNext());
                System.out.println("El jugador 1 avanza un espacio");
            }
        }if(pos.getType()=="tunel"){
            int move = generate_random();
                for(int i=0; i<move;i++){
                    player.setCurrentPosition(player.getCurrentPosition().getNext());
                }
            System.out.println(player+ " avanza "+move+" espacios");
        }if(pos.getType()=="trampa"){
            int move = generate_random();
                for(int i=0; i<move;i++){
                    player.setCurrentPosition(player.getCurrentPosition().getPrev());
                }
            System.out.println(player+" retrocede "+move+" espacios");
        }
    }
    
    static int generate_random(){
        int max=3,min=1;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        return random_int;
    }
    
    public void checkWin(Player player, Game game){
        if(player.getCurrentPosition() == game.finalPos || player.getCurrentPosition()== null){
            System.out.println(player+ " gana esta partida");
            game.state = false;
            System.exit(0);
        }else{
        }
    }
    
    
}
