import untitled.src.Player;

import java.io.*;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client {
    
    public static void main(String[] args) {
        try {
            iniciateClient();
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void iniciateClient() throws IOException, ClassNotFoundException{
        // need host and port, we want to connect to the ServerSocket at port 7777
        Socket socket = new Socket("localhost", 7777);
        System.out.println("Connected!");

        OutputStream outputStream = socket.getOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        
        InputStream inputStream = socket.getInputStream();
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        
        LinkedList tablero = (LinkedList) objectInputStream.readObject();
        
        Player player2 = new Player(tablero.head);
        
        objectOutputStream.writeObject(player2);
        

        System.out.println("Closing socket and terminating program.");
        socket.close();
    }
}
 
