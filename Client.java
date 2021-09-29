package com.mycompany.proyecto.Math_Socket_Project_1;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client {
    

    /**
     * Inicia la clase cliente y se conecta con el servidor
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    public void iniciateClient() throws IOException, ClassNotFoundException{
        // need host and port, we want to connect to the ServerSocket at port 7777
        Socket socket = new Socket("localhost", 7777);
        System.out.println("Connected!");

    }
    
    /**
     * Recibe una lista enlazada que va a ser el tablero de juego
     * @return retorna la lista que recibe
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    public LinkedList receiveBoard() throws IOException, ClassNotFoundException{
        ServerSocket ss = new ServerSocket(7777);
        Socket socket = ss.accept();
        InputStream inputStream = socket.getInputStream();
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        
        LinkedList casillas = (LinkedList) objectInputStream.readObject();
        return casillas;
        
    }
    
    /**
     * Envia un jugador al socket
     */
    void sendPlayer(Player player) throws IOException{
        ServerSocket ss = new ServerSocket(7777);
        Socket socket = ss.accept();
        OutputStream outputStream = socket.getOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        
        objectOutputStream.writeObject(player);
    }
    
    /**
     * Recibe un jugador del servidor
     * @return el jugador que recibe
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    public Player receivePlayer() throws IOException, ClassNotFoundException{
        ServerSocket ss = new ServerSocket(7777);
        Socket socket = ss.accept();
        InputStream inputStream = socket.getInputStream();
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        
        Player player1 = (Player) objectInputStream.readObject();
        return player1;
        
    }

}
 
