package com.mycompany.proyecto.Math_Socket_Project_1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Logger;

public class Server {

    /**
     * Inicia el servidor
     * @throws IOException 
     */
    public void startServer() throws IOException {

        ServerSocket ss = new ServerSocket(7777);
        System.out.println("Esperando otro jugador...");
        Socket socket = ss.accept();
        System.out.println("Un jugador se unio a la partida");

    }
    
    /**
     * Envia un tablero al cliente
     */
    public void sendBoard(LinkedList board) throws IOException{
        ServerSocket ss = new ServerSocket(7777);
        Socket socket = ss.accept();
        OutputStream outputStream = socket.getOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        
        objectOutputStream.writeObject(board);
    }
    
    /**
     * Envia un jugador al cliente
     */
    public void sendPlayer(Player player) throws IOException{
        ServerSocket ss = new ServerSocket(7777);
        Socket socket = ss.accept();
        OutputStream outputStream = socket.getOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        
        objectOutputStream.writeObject(player);
    }
    
    /**
     * Recibe un jugador del cliente
     */
    public Player receivePlayer() throws IOException, ClassNotFoundException{
        ServerSocket ss = new ServerSocket(7777);
        Socket socket = ss.accept();
        InputStream inputStream = socket.getInputStream();
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        
        Player player2 = (Player) objectInputStream.readObject();
        return player2;
        
    }
        
}
