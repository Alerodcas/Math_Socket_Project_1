package untitled.src;

public class Player implements java.io.Serializable{
    public DoubleNode currentPosition;
   
    /**
     * Metodo constructor
     * @param pos Nodo en el que va a iniciar
     */
    public Player(DoubleNode pos){
        currentPosition = pos;
}
    /**
     * @return posicion actual del jugador
     */
    public DoubleNode getCurrentPosition(){
        return currentPosition;
    }
    
    /**
     * Asigna la posicion actual del jugador
     * @param pos nueva posicion
     */
    public void setCurrentPosition(DoubleNode pos){
        currentPosition = pos;
    }
    
    
}
