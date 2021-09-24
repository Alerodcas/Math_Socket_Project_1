import javax.swing.*;
import net.miginfocom.swing.*;

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
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border.
        EmptyBorder( 0, 0, 0, 0) , "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e", javax. swing. border. TitledBorder. CENTER, javax. swing
        . border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069al\u006fg" ,java .awt .Font .BOLD ,12 ),
        java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( )
        { @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062or\u0064er" .equals (e .getPropertyName () ))
        throw new RuntimeException( ); }} );
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
        set_name event_1 = new set_name();
        button1.addActionListener(event_1);
        add(button1, "cell 8 4");
        add(textField2, "cell 1 6 7 1");

        //---- button2 ----
        button2.setText("Host a Game");
        set_host event_2 = new set_host();
        button2.addActionListener(event_2);
        add(button2, "cell 8 6");
        add(textField3, "cell 1 8 7 1");

        //---- button3 ----
        button3.setText("Join a Game");
        set_port event_3 = new set_port();
        button3.addActionListener(event_3);
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
            int port = Integer.parseInt(textField3.getText());
        }
    }
    public class set_host implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int host = Integer.parseInt(textField3.getText());
        }
    }
}
