import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import net.miginfocom.swing.MigLayout;


public class HangmanMenu {
    private String category = "";
    private  char mode = ' ';
    private String userChoice = "";
    public HangmanMenu(){

        //title window
        JFrame frame = new JFrame("Hangman");
        //size window
        frame.setSize(740,580);
        //close window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //METHOD-1 : Using Color Fields
        frame.getContentPane().setBackground(Color.WHITE);

        MigLayout layout = new MigLayout(
                "",           // layout constraints, add debug to see dotted lines
                "[][grow]",     // column constraints
                "[][][grow]"   // row constraints
        );
        frame.setLayout(layout);

        //create label (text)
        JLabel heading = new JLabel(" H A N G M A N ");
        // add it to the frame in top centre (0 0 means column and row)
        frame.getContentPane().add(heading,"cell 3 1");

        //give heading font (default currently)
        Font currentFont = heading.getFont();
        Font newFont = currentFont.deriveFont(currentFont.getSize() * 1.7F);
        heading.setFont(newFont);

        //Add border
        Border label_border = BorderFactory.createLineBorder(Color.black, 3);
        heading.setBorder(label_border);
        heading.setBounds(25,25,250,300);

        //create themes header
        JLabel difficulty = new JLabel("  D I F F I C U L T Y ");
        // add it to the frame in low centre
        frame.getContentPane().add(difficulty,"cell 3 2");

        Font currentFont2 = difficulty.getFont();
        Font newFont2 = currentFont.deriveFont(currentFont2.getSize() * 1.3F);
        difficulty.setFont(newFont2);

        //create the difficulty buttons
        JButton easyButton = new JButton("easy");
        JButton mediumButton = new JButton("medium");
        JButton hardButton = new JButton("hard");

        frame.getContentPane().add(easyButton, "cell 2 3");
        frame.getContentPane().add(mediumButton, "cell 3 3");
        frame.getContentPane().add(hardButton, "cell 4 3");

        //create themes header
        JLabel themes = new JLabel("  T H E M E S ");
        // add it to the frame in low centre
        frame.getContentPane().add(themes,"cell 3 4");

        Font currentFont3 = themes.getFont();
        Font newFont3 = currentFont.deriveFont(currentFont3.getSize() * 1.3F);
        themes.setFont(newFont3);

        // creates the theme buttons
        JButton animalButton = new JButton("Animals");
        JButton cartoonButton = new JButton("Cartoons");
        JButton sWButton = new JButton("Star Wars");
        JButton marvelButton = new JButton("Marvel");

        //adds the theme buttons
        frame.getContentPane().add(cartoonButton, "cell 2 5");
        frame.getContentPane().add(sWButton, "cell 3 5");
        frame.getContentPane().add(animalButton, "cell 4 5");
        frame.getContentPane().add(marvelButton, "cell 5 5");





        cartoonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                category = "cartoon";
            }
        });
        sWButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                category = "sw";
            }
        });
        animalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                category = "animal";
            }
        });
        marvelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                category = "marvel";
            }
        });



        easyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mode = 'E';
            }
        });
        mediumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mode = 'M';
            }
        });
        hardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mode = 'H';
            }
        });



        // creates the submit button
        JButton submit = new JButton("submit");

        //adds the theme buttons
        frame.getContentPane().add(submit, "cell 5 6 ");

        // Add action listener to the submit button
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                userChoice = category + mode;
                System.out.println(userChoice);
                // Close the current frame
                frame.dispose();
                // Start the Hangman game
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        new HangmanGame(userChoice);
                    }
                });
            }
        });


        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new HangmanMenu();
    }
}
