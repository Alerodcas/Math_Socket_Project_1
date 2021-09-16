import javax.swing.*;
import java.awt.*;

public class gui extends JPanel{
    private JButton hostButton;
    private JTextField portField;
    private JButton joinButton;

    public gui(){
        JLabel title_label = new JLabel("MATH SOCKET");
        title_label.setFont(new Font("Verdana", Font.PLAIN, 18));
        add(title_label);

        JButton hostButton = new JButton("Host a Game");

        add(hostButton);
    }
}
