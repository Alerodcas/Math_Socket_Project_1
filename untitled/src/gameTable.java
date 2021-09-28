package untitled.src;

import javax.swing.*;
import java.awt.*;
public class gameTable extends JPanel{

    public void paint(Graphics g){
        // Aca está probado con una cuadrícula 4 x 4, se deben cambiar las coordenadas conforme el tamaño del tablero que elegimos
        g.fillRect(100, 100, 200, 200);
        for(int i = 100; i <= 200; i+=100){
            for(int j = 100; j <= 200; j+=100){
                g.clearRect(i, j, 50, 50);
            }
        }

        for(int i = 150; i <= 450; i+=100){
            for(int j = 150; j <= 450; j+=100){
                g.clearRect(i, j, 50, 50);
            }
        }
    }


    //CAMBIO IMPORTANTE//

    //public void player_position(Graphics g){ //Esto se debería ejecutar con cada tirada de dados. Implementar, si es necesario, el borrar con la inversa de la funcion
        //g.fillOval(//Coordenadas del jugador conforme al dado x & y, y el width and height para el grueso);
    //}

    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(600,600);
        frame.getContentPane().add(new gameTable());
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.LIGHT_GRAY);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
