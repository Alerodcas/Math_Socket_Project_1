import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class gameTable extends JPanel{

    public void paint(Graphics g){

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
