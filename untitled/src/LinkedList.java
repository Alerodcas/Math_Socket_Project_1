package untitled.src;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class LinkedList implements Serializable {
    public DoubleNode tail;
    public DoubleNode head;
    private int size;
    public int maxsize=16;
    
    /**
     * Metodo constructor
     */
    public LinkedList(){
        head = null;
        tail = null;
        size = 0;
    }
    
    /**
     * Crea y anade un nodo a la lista
     * @param data 
     */
    public void add(String data) {
        DoubleNode newNode = new DoubleNode(data);
        if (head == null){
            this.head = newNode;
            this.tail = newNode;
        }else{
            DoubleNode tmp = head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(newNode);
            newNode.setPrev(tmp);
            this.tail = newNode;
        }
        this.size++;
    }
    
    /**
     * Anade de forma aleatoria tipos distintos de nodos a la lista enlazada
     * @param lista lista vacia a la que se le anaden los nodos
     */
    public void add_randomly(LinkedList lista){
        int max_challenge = maxsize/2;
        int max_trampa = maxsize/4;
        int max_tunel = maxsize/4;
        int challenge=0;
        int trampa=0;
        int tunel=0;
        for (int i=0; i<maxsize; i++){
            List<String> types = new ArrayList<>();
            if(challenge<max_challenge){
                types.add("challenge");
            }if(tunel<max_tunel){
                types.add("tunel");
            }if (trampa<max_trampa){
                types.add("trampa");
            }
            String new_type = generate_random_s(types);
            if (new_type == "challenge"){
                lista.add(new_type);
                challenge++;
            }if (new_type == "trampa"){
                lista.add(new_type);
                trampa++;
            }if (new_type == "tunel"){
                lista.add(new_type);
                tunel++;
            }
        }lista.show();
        System.out.println(lista.size);
    }
    
    /**
     * @return el tamano de la lista enlazada 
     */
    public int size(){
        return this.size;
    }
    
    /**
     * retorna un string random de una lista
     * @param types lista de los strings
     * @return 
     */
    static String generate_random_s(List<String> types){
       Random random = new Random();
       int randomInt = random.nextInt(types.size());
       String randomS;
       randomS = types.get(randomInt);
       return randomS;
    }
    
    /**
     * Imprime todos los nodos de la lista
     */
    public void show() {
        DoubleNode node = head;
        while (node != null){
            System.out.print(node.toString());
            node = node.getNext();
        }
        System.out.println();
    }
}
    
    