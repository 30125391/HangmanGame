import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.miginfocom.swing.MigLayout;


public class Hangman {
    public Hangman(){

        //title window
        JFrame frame = new JFrame("Hangman");
        //size window
        frame.setSize(740,580);
        //close window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MigLayout layout = new MigLayout(
                "",           // layout constraints, add debug to see dotted lines
                "[][grow]",     // column constraints
                "[][][grow]"   // row constraints
        );
        frame.setLayout(layout);

        //create label (text)
        JLabel label = new JLabel("Enter Text:");
        // add it to the frame in top left (0 0 means column and row)
        frame.getContentPane().add(label,"cell 0 0");

        JTextField field = new JTextField();
        frame.getContentPane().add(field,"cell 1 0, growx");

        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new Hangman();
    }

}
