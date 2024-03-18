import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.miginfocom.swing.MigLayout;

public class HangmanGame extends Categories{
    private String userChoice;
    public HangmanGame(String userChoice){
        this.userChoice = userChoice;
        System.out.println("User choice received in HangmanGame: " + userChoice);

        boolean lose = false;

        ImageIcon[] img;
        final int[] currentImageIndex = {0};

        //title window
        JFrame frame = new JFrame("Hangman");
        //size window
        frame.setSize(740,580);
        //close window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        MigLayout layout = new MigLayout(
                "",      // layout constraints, add debug to see dotted lines
                "[][grow]",     // column constraints
                "[][][grow]"   // row constraints
        );
        frame.setLayout(layout);


        //METHOD-1 : Using Color Fields
        frame.getContentPane().setBackground(Color.WHITE);


        String themes = " 'T H E M E' ";
        String difficulty = " 'M O D E' ";


////////////////////////////////////////////////[ Theme Heading ]/////////////////////////////////////////////////////////////////////

        //create label (text)
        JLabel heading = new JLabel(themes);
        // add it to the frame in top centre (0 0 means column and row)
        frame.getContentPane().add(heading,"cell 3 1, aligny bottom, alignx center");

        //give heading font (default currently)
        Font currentFont = heading.getFont();
        Font newFont = currentFont.deriveFont(currentFont.getSize() * 1.7F);
        heading.setFont(newFont);

        //Add border
        Border label_border = BorderFactory.createLineBorder(Color.black, 3);
        heading.setBorder(label_border);
        heading.setBounds(25,25,250,300);


////////////////////////////////////////////////[ Difficulty Heading ]/////////////////////////////////////////////////////////////////////


        JLabel mode = new JLabel(difficulty);

        frame.getContentPane().add(mode,"cell 4 1, aligny bottom, alignx right");

        Font currentFont2 = mode.getFont();
        Font modeFont = currentFont2.deriveFont(currentFont2.getSize() * 1.5F);
        mode.setFont(modeFont);

        Border label_border2 = BorderFactory.createLineBorder(Color.black, 3);
        mode.setBorder(label_border);
        mode.setBounds(25,25,250,300);


////////////////////////////////////////////////[ Used Letters ]/////////////////////////////////////////////////////////////////////


        //Add used letters box
        JLabel usedLetters = new JLabel("Used Letters Here:");
        frame.getContentPane().add(usedLetters,"cell 4 2, aligny top, alignx right");
        Font currentFont3 = usedLetters.getFont();
        Font usedLettersFont = currentFont3.deriveFont(currentFont3.getSize() * 1.5F);
        usedLetters.setFont(usedLettersFont);

        //Add border
        Border label_border3 = BorderFactory.createLineBorder(Color.black, 3);
        usedLetters.setBorder(label_border);
        usedLetters.setBounds(25,25,250,300);


////////////////////////////////////////////////[ Hints ]/////////////////////////////////////////////////////////////////////


        JButton hints = new JButton("   Hint   ");
        frame.getContentPane().add(hints,"cell 4 3, aligny top, alignx right");

        //Add border
        Border label_border4 = BorderFactory.createLineBorder(Color.black, 3);
        hints.setBorder(label_border);
        hints.setBounds(25,25,250,300);

        hints.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "pending", "Hint", JOptionPane.INFORMATION_MESSAGE);
            }
        });


/////////////////////////////////////////////////[ Hangman Image(s) ]/////////////////////////////////////////////////////////////////////

        img = new ImageIcon[]{new ImageIcon("./HangmanS1.png"), new ImageIcon("./HangmanS2.png"),
                new ImageIcon("./HangmanS3.png"),new ImageIcon("./HangmanS4.png"),
                new ImageIcon("./HangmanS5.png"),new ImageIcon("./HangmanS6.png"),
                new ImageIcon("./HangmanS7.png")};

        JLabel imgLabel = new JLabel(img[currentImageIndex[0]]);
        frame.getContentPane().add(imgLabel,"cell 3 4, aligny bottom, alignx left");



//////////////////////////////////////////////////[ Temporary Button ]/////////////////////////////////////////////////////////////////////


        JButton x = new JButton("x");
        frame.getContentPane().add(x,"cell 3 5, aligny bottom, alignx left");

        x.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentImageIndex[0]++;
                if (currentImageIndex[0] == 7) {
                    JOptionPane.showMessageDialog(frame, "Game Over", "Game Over", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    imgLabel.setIcon(img[currentImageIndex[0]]);
                }
            }
        });

//////////////////////////////////////////////////[ JFrame ]//////////////////////////////////////////////////////////////////////////////

        frame.setVisible(true);
    }







////////////////////////////////////////////////////////[ Main ]/////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {

        Categories categories = new Categories();
        //Set categories
        categories.SetCategories();
        //Get categories
        String[][] Categories = categories.getCategories();

        //first [0] being the array and second [0] being the word
        System.out.println(Categories[2][0]);


        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new HangmanMenu();
            }
        });
    }
}
