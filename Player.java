
package My_Challenge_box.Math_Socket_Project_1;

import generate_boxes.DoubleNode;

/**
 *
 * @author alero
 */
public class Player {
    public DoubleNode currentPosition;
    public DoubleNode startPosition;
   
    /**
     * Metodo constructor
     * @param pos Nodo en el que va a iniciar
     */
    public Player(DoubleNode pos){
        currentPosition = pos;
        startPosition = pos;
}
    /**
     * @return posicion actual del jugador
     */
    public DoubleNode getCurrentPosition(){
        return currentPosition;
    }
    
    /**
     * Asigna la posicion actual del jugador
     * @param pos 
     */
    public void setCurrentPosition(DoubleNode pos){
        currentPosition = pos;
    }
    
    
}
