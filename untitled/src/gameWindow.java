import javax.swing.*;
import java.awt.*;

public class gameWindow extends JFrame{
    public gameWindow(){
        setBounds(500,500,320,220);
        gui principal = new gui();
        add(principal);

        setVisible(true);
        setResizable(false);
    }
}
