import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import net.miginfocom.swing.MigLayout;

public class HangmanGame extends Categories{
    private String userChoice;

    public HangmanGame(String category, char mode){


        userChoice = category + mode;
        System.out.println("User choice received in HangmanGame: " + userChoice);


        Random rnd = new Random();
        int rand = 0 + rnd.nextInt(4);


        Categories categories = new Categories();
        //Set categories
        categories.SetCategories();
        //Get categories
        String[][] Categories = categories.getCategories();

        int userArray = 0;

        if(userChoice.equals("Star WarsE")){
            userArray = 0;
        } else if (userChoice.equals("Star WarsM")) {
            userArray = 1;
        } else if (userChoice.equals("Star WarsH")) {
            userArray = 2;
        }else if (userChoice.equals("AnimalsE")) {
            userArray = 3;
        } else if (userChoice.equals("AnimalsM")) {
            userArray = 4;
        } else if (userChoice.equals("AnimalsH")) {
            userArray = 5;
        }else if (userChoice.equals("CartoonsE")) {
            userArray = 6;
        } else if (userChoice.equals("CartoonsM")) {
            userArray = 7;
        }else if (userChoice.equals("CartoonsH")) {
            userArray = 8;
        } else if (userChoice.equals("MarvelE")) {
            userArray = 9;
        }else if (userChoice.equals("MarvelM")) {
            userArray = 10;
        } else if (userChoice.equals("MarvelH")) {
            userArray = 11;
        }


        //first [0] being the array and second [0] being the word
        String hangmanWord = (Categories[userArray][rand]);


//////////////////////////////////////////////////////////////[ User Interface ]/////////////////////////////////////////////////////////////////



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



////////////////////////////////////////////////[ Theme Heading ]/////////////////////////////////////////////////////////////////////

        //create label (text)
        JLabel heading = new JLabel("  "+ category + "  ");
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


        String modeValue = String.valueOf(mode);

        String easy = "Easy";
        String medium = "Medium";
        String hard = "Hard";

        if (modeValue.equals("H")) {
            modeValue = hard;
        } else if (modeValue.equals("M")) {
            modeValue = medium;
        } else if (modeValue.equals("E")) {
            modeValue = easy;
        }

        JLabel setting = new JLabel("   "+ modeValue + "   ");
        frame.getContentPane().add(setting,"cell 4 1, aligny bottom, alignx right");

        Font currentFont2 = setting.getFont();
        Font modeFont = currentFont2.deriveFont(currentFont2.getSize() * 1.5F);
        setting.setFont(modeFont);

        Border label_border2 = BorderFactory.createLineBorder(Color.black, 3);
        setting.setBorder(label_border);
        setting.setBounds(25,25,250,300);




////////////////////////////////////////////////[ TEST ]/////////////////////////////////////////////////////////////////////



        JLabel wordTest = new JLabel(hangmanWord);
        frame.getContentPane().add(wordTest,"cell 4 5, aligny bottom, alignx right");



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


        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new HangmanMenu();
            }
        });
    }
}
