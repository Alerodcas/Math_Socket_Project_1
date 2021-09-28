package untitled.src;

import net.miginfocom.swing.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
 * Created by JFormDesigner on Thu Sep 23 17:55:04 CST 2021
 */



/**
 * @author unknown
 */
public class gui extends JPanel {
    public gui() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        label1 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();
        textField2 = new JTextField();
        button2 = new JButton();
        textField3 = new JTextField();
        button3 = new JButton();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder
        ( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder. CENTER, javax. swing. border
        . TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 ), java. awt
        . Color. red) , getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void
        propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .equals (e .getPropertyName () )) throw new RuntimeException( )
        ; }} );
        setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[156:157,fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- label1 ----
        label1.setText("Math Socket");
        add(label1, "cell 7 1");
        add(textField1, "cell 1 4 7 1");

        //---- button1 ----
        button1.setText("Set Name");
        add(button1, "cell 8 4");
        add(textField2, "cell 1 6 7 1");

        //---- button2 ----
        button2.setText("Host a Game");
        add(button2, "cell 8 6");
        add(textField3, "cell 1 8 7 1");

        //---- button3 ----
        button3.setText("Join a Game");
        add(button3, "cell 8 8");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JLabel label1;
    private JTextField textField1;
    private JButton button1;
    private JTextField textField2;
    private JButton button2;
    private JTextField textField3;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public class set_name implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String name = textField1.getText();
        }
    }

    public class set_port implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int port = Integer.parseInt(textField3.getText()); //Aca está el puerto elegido en la pantalla inicial, usar para abrir el socket
            gameTable new_game = new gameTable();
            new_game.setVisible(true);
        }
    }
    public class set_host implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int host = Integer.parseInt(textField3.getText()); //Aca está el puerto elegido en la pantalla inicial, usar para abrir el socket
            gameTable new_game = new gameTable();
            new_game.setVisible(true);
        }
    }
}
