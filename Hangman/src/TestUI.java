import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.miginfocom.swing.MigLayout;

public class TestUI {
    public TestUI(){
        //title window
        JFrame frame = new JFrame("My First UI Project");
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




        //bring up image
        ImageIcon img = new ImageIcon("./monkey.png");
        //size image
        img = new ImageIcon(img.getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH));
        JLabel imgLabel = new JLabel(img);
        frame.getContentPane().add(imgLabel,"cell 0 1");



/////////////////////////////////////////[  calculator  ]//////////////////////////////////////////////////////////



        JLabel index1 = new JLabel("Number 1:");
        frame.getContentPane().add(index1,"cell 1 1");
        JTextField indexfield1 = new JTextField();
        frame.getContentPane().add(indexfield1,"cell 1 1, growx");

        JLabel index2 = new JLabel("Number 2:");
        frame.getContentPane().add(index2,"cell 2 1");
        JTextField indexfield2 = new JTextField();
        frame.getContentPane().add(indexfield2,"cell 2 1, growx");



        JLabel result = new JLabel("Output:");
        frame.getContentPane().add(result,"cell 3 1");
        JTextField resultfield = new JTextField();
        frame.add(resultfield,"cell 3 1, growx");
        resultfield.setEditable(false);



        JButton popup = new JButton("+");
        frame.getContentPane().add(popup,"cell 3 3, aligny bottom, alignx right");

        popup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //create a popup
                //JOptionPane.showMessageDialog(frame, "Field contains: " +field.getText());

                int sum1 = Integer.parseInt(indexfield1.getText());
                int sum2 = Integer.parseInt(indexfield2.getText());

                int calc = (sum1 + sum2);

                resultfield.setText(" " + calc);
            }


        });

        JButton popup2 = new JButton("x");
        frame.getContentPane().add(popup2,"cell 3 3, aligny bottom, alignx right");

        popup2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //create a popup
                //JOptionPane.showMessageDialog(frame, "Field contains: " +field.getText());

                int sum1 = Integer.parseInt(indexfield1.getText());
                int sum2 = Integer.parseInt(indexfield2.getText());

                int calc = (sum1 * sum2);

                resultfield.setText(" " + calc);
            }


        });
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new TestUI();
    }

}
