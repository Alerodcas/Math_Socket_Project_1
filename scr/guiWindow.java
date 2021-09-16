import javax.swing.*;
import java.awt.*;

public class guiWindow extends JFrame{
    public guiWindow(){
        setBounds(600,300,680,580);

        gui gui_1 = new gui();
        add(gui_1);

        setVisible(true);
        setResizable(false);
    }
}
