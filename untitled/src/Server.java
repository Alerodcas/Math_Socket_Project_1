package untitled.src;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {
    
    public static void main(String[] args) {
        try {
            startServer();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void startServer() throws IOException{
        LinkedList tablero = new LinkedList();
        tablero.add_randomly(tablero);
        
        Player player1 = new Player(tablero.head);

        ServerSocket ss = new ServerSocket(7777);
        System.out.println("Esperando otro jugador...");
        Socket socket = ss.accept();
        System.out.println("Un jugador se unio a la partida");

        OutputStream outputStream = socket.getOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);        
        
        InputStream inputStream = socket.getInputStream();
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);     
        
        objectOutputStream.writeObject(tablero);
        try {
            Player player2 = (Player) objectInputStream.readObject();
            System.out.println("jugador 2 creado");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        System.out.println("Closing sockets.");
        ss.close();
        socket.close();
    }
}