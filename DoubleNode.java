


public class DoubleNode implements java.io.Serializable{

    private DoubleNode prev;
    private DoubleNode next;
    private String type;

/**
 * Metodo constructor
 * @param type String del tipo de casilla de juego que va a ser
 */
    public DoubleNode(String type){
        this.type = type;
    }


    /**
     * @return retorna el siguiente nodo, en caso de que no haya retorna null
     */
    public DoubleNode getNext(){
        return next;
    }

    /**
     * @return retorna el nodo anterior, en caso de que no haya retorna 
     */
    public DoubleNode getPrev(){
        return prev;
    }
    
    public String getType(){
        return type;
    }

    /**
     * Asigna el siguiente nodo
     * @param n el siguiente nodo
     */
    public void setNext(DoubleNode n){
        next = n;
    }

    /**
     * Asigna el nodo anterior
     * @param p nodo anterior
     */
    public void setPrev(DoubleNode p){
        prev = p;
    }
    
    
    public String toString(){
        String sNode = "[ "+ this.getType()+"] ->";
        return sNode;
    }
}
