
import java.util.*;

public class Game {
    private DoubleNode finalPos;
    private boolean state;
    private List<Player> players;
    private Player lastPlayer;//nuevo
    private Player playingPlayer;//nuevo
    private Player tmp;//nuevo
    
    

    public Game(Player player1, Player player2, LinkedList tablero){//nuevo
        finalPos = tablero.tail;
        state = true;
        playingPlayer = player1;//nuevo
        lastPlayer = player2;//nuevo
        players = new ArrayList<Player>();
        players.add(player1);
        players.add(player2);
        
    }
    
    
    public void Play(){//todo esto va en lugar de newGame
        Dice dice = new Dice();
        int move = dice.getRollResult();
        for (int i=0;i<move;i++){
            playingPlayer.setCurrentPosition(playingPlayer.getCurrentPosition().getNext());
        }
        checkBoxType();
        checkWin(playingPlayer);
        tmp = playingPlayer;
        playingPlayer = lastPlayer;
        lastPlayer = tmp;
    }
    
    public void checkBoxType(){//Se cambio mucho
        if(playingPlayer.currentPosition.getType()=="challenge"){
            Challenge_box.generate_problem();
            lastPlayer.setCurrentPosition(lastPlayer.getCurrentPosition().getNext());
            }
        if(playingPlayer.currentPosition.getType()=="tunel"){
            int move = generate_random();
                for(int i=0; i<move;i++){
                    playingPlayer.setCurrentPosition(playingPlayer.getCurrentPosition().getNext());
                }
        }if(playingPlayer.currentPosition.getType()=="trampa"){
            int move = generate_random();
                for(int i=0; i<move;i++){
                    playingPlayer.setCurrentPosition(playingPlayer.getCurrentPosition().getPrev());
                }
        }
    }
    
    static int generate_random(){
        int max=3,min=1;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        return random_int;
    }
    
    public void checkWin(Player player){
        if(player.getCurrentPosition() == finalPos || player.getCurrentPosition()== null){
            state = false;
            System.exit(0);
        }else{
        }
    }
    
    
}
