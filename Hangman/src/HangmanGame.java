import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.miginfocom.swing.MigLayout;
import java.util.Random;

public class HangmanGame{
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
        frame.getContentPane().add(hints, "cell 4 3, aligny top, alignx right");

//Add border
        Border label_border4 = BorderFactory.createLineBorder(Color.black, 3);
        hints.setBorder(label_border);
        hints.setBounds(25, 25, 250, 300);

        String hint = "pending";

        if (hangmanWord.equalsIgnoreCase("jabba")) {
            hint = "Intergalactic Gangster Slug";
        } else if (hangmanWord.equalsIgnoreCase("darth vader") || hangmanWord.equalsIgnoreCase("emperor") || hangmanWord.equalsIgnoreCase("thanos")|| hangmanWord.equalsIgnoreCase("daleks")|| hangmanWord.equalsIgnoreCase("nebula")) {
            hint = "Villian(s)";
        } else if (hangmanWord.equalsIgnoreCase("coruscant") || hangmanWord.equalsIgnoreCase("endor") || (hangmanWord.equalsIgnoreCase("hoth"))) {
            hint = "Planet(s) In The Universe";
        } else if (hangmanWord.equalsIgnoreCase("loki")) {
            hint = ("The Adopted Son of Odin");
        } else if (hangmanWord.equalsIgnoreCase("human torch")) {
            hint = ("Core Member of tThe fantastic 4");
        } else if (hangmanWord.equalsIgnoreCase("light saber")) {
            hint = ("Famous Sci-fi Weapon used by force wielders");
        } else if (hangmanWord.equalsIgnoreCase("edna")) {
            hint = ("Small woman who made the suits for The Incredibles");
        } else if (hangmanWord.equalsIgnoreCase("iceman") || hangmanWord.equalsIgnoreCase("storm") || (hangmanWord.equalsIgnoreCase("cyclops")|| (hangmanWord.equalsIgnoreCase("gambit")))){
            hint = ("Mutant(s)");
        } else if (hangmanWord.equalsIgnoreCase("cat") || hangmanWord.equalsIgnoreCase("duck") || (hangmanWord.equalsIgnoreCase("hamster") || hangmanWord.equalsIgnoreCase("budgie"))) {
            hint = ("Pets and Friendly Creature");
        } else if (hangmanWord.equalsIgnoreCase("wild boar") || hangmanWord.equalsIgnoreCase("koala") || (hangmanWord.equalsIgnoreCase("elephant") || hangmanWord.equalsIgnoreCase("monkey"))) {
            hint = ("Wild Creature");
        } else if (hangmanWord.equalsIgnoreCase("luke") || hangmanWord.equalsIgnoreCase("yoda") || hangmanWord.equalsIgnoreCase("leia")) {
            hint = ("Hero");
        } else if (hangmanWord.equalsIgnoreCase("dolphin") || hangmanWord.equalsIgnoreCase("beluga whale")|| hangmanWord.equalsIgnoreCase("goblin shark")|| hangmanWord.equalsIgnoreCase("orca")|| hangmanWord.equalsIgnoreCase("shark")){
            hint = ("Sea Creature");
        } else if (hangmanWord.equalsIgnoreCase("jedi")) {
            hint = ("Powerful Guardians of Order and Justice");
        } else if (hangmanWord.equalsIgnoreCase("droid")) {
            hint = ("Anthropomorphic Robotic Entities");
        } else if (hangmanWord.equalsIgnoreCase("x wing")) {
            hint = ("Vehicle Used by the Rebellion");
        } else if (hangmanWord.equalsIgnoreCase("spider man")|| hangmanWord.equalsIgnoreCase("hulk")|| hangmanWord.equalsIgnoreCase("iron man")|| hangmanWord.equalsIgnoreCase("the falcon")|| hangmanWord.equalsIgnoreCase("nick fury")) {
            hint = ("Key Component to the Avengers");
        } else if (hangmanWord.equalsIgnoreCase("stan lee")|| hangmanWord.equalsIgnoreCase("jack kirby") || hangmanWord.equalsIgnoreCase("steve ditko")){
            hint = ("Creator(s) of marvels best creations");
        }



        String finalHint = hint;

        hints.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, finalHint, "Hint", JOptionPane.INFORMATION_MESSAGE);
            }
        });
/////////////////////////////////////////////////[ Hangman Image(s) ]/////////////////////////////////////////////////////////////////////

        img = new ImageIcon[]{new ImageIcon("./hangmanS1.png"), new ImageIcon("./hangmanS2.png"),
                new ImageIcon("./hangmanS3.png"),new ImageIcon("./hangmanS4.png"),
                new ImageIcon("./hangmanS5.png"),new ImageIcon("./hangmanS6.png"),
                new ImageIcon("./hangmanS7.png")};

        JLabel imgLabel = new JLabel(img[currentImageIndex[0]]);
        frame.getContentPane().add(imgLabel,"cell 3 4, aligny bottom, alignx left");

        JPanel panel = new JPanel();

/////////////////////////////////////////////////[ Keyboard Buttons ]/////////////////////////////////////////////////////////////////////

        // Create the JButtons for the Keyboard
        JButton buttonA = new JButton("a");
        JButton buttonB = new JButton("b");
        JButton buttonC = new JButton("c");
        JButton buttonD = new JButton("d");
        JButton buttonE = new JButton("e");
        JButton buttonF = new JButton("f");
        JButton buttonG = new JButton("g");
        JButton buttonH = new JButton("h");
        JButton buttonI = new JButton("i");
        JButton buttonJ = new JButton("j");
        JButton buttonK = new JButton("k");
        JButton buttonL = new JButton("l");
        JButton buttonM = new JButton("m");
        JButton buttonN = new JButton("n");
        JButton buttonO = new JButton("o");
        JButton buttonP = new JButton("p");
        JButton buttonQ = new JButton("q");
        JButton buttonR = new JButton("r");
        JButton buttonS = new JButton("s");
        JButton buttonT = new JButton("t");
        JButton buttonU = new JButton("u");
        JButton buttonV = new JButton("v");
        JButton buttonW = new JButton("w");
        JButton buttonX = new JButton("x");
        JButton buttonY = new JButton("y");
        JButton buttonZ = new JButton("z");


        // Add the JButtons to a panel
        panel.add(buttonA,  "");
        panel.add(buttonB,  "");
        panel.add(buttonC,  "");
        panel.add(buttonD,  "");
        panel.add(buttonE,  "");
        panel.add(buttonF,  "");
        panel.add(buttonG,  "");
        panel.add(buttonH,  "");
        panel.add(buttonI,  "");
        panel.add(buttonJ,  "");
        panel.add(buttonK,  "");
        panel.add(buttonL,  "");
        panel.add(buttonM,  "");
        panel.add(buttonN,  "");
        panel.add(buttonO,  "");
        panel.add(buttonP,  "");
        panel.add(buttonQ,  "");
        panel.add(buttonR,  "");
        panel.add(buttonS,  "");
        panel.add(buttonT,  "");
        panel.add(buttonU,  "");
        panel.add(buttonV,  "");
        panel.add(buttonW,  "");
        panel.add(buttonX,  "");
        panel.add(buttonY,  "");
        panel.add(buttonZ,  "");


        final String[] dashLine = {Categories[userArray][rand].replaceAll("[a-zA-Z]", "-")};

        JLabel label = new JLabel(dashLine[0]);

        int userArray1 = userArray;

        frame.getContentPane().add(panel, "cell 3 7");

/////////////////////////////////////////////////[ Buttons Functionality ]/////////////////////////////////////////////////////////////////////

        JButton[] buttons = {buttonA, buttonB, buttonC, buttonD, buttonE, buttonF, buttonG, buttonH, buttonI, buttonJ, buttonK, buttonL, buttonM, buttonN, buttonO, buttonP, buttonQ, buttonR, buttonS, buttonT, buttonU, buttonV, buttonW, buttonX, buttonY, buttonZ};

        // Initialize a StringBuilder to store the used letters
        StringBuilder usedLettersText = new StringBuilder();

        // Add action listener to each button to handle letter guesses
        for (JButton button : buttons) {
            button.addActionListener(e -> {

                if (currentImageIndex[0] != 6) {
                    String buttonText = button.getText().toLowerCase();


                    // Check if the button's letter has already been guessed
                    if (usedLettersText.toString().contains(buttonText)) {
                        JOptionPane.showMessageDialog(frame, "You already guessed this letter.", "Warning", JOptionPane.WARNING_MESSAGE);
                        return; // Exit the listener if the letter has already been guessed
                    }

                    // Add the guessed letter to the used letters
                    usedLettersText.append(buttonText).append(" ");


                    // Update the text of the usedLetters JLabel
                    usedLetters.setText("Used Letters Here: " + usedLettersText.toString());


                    if (hangmanWord.contains(buttonText)) {
                        StringBuilder newDashLine = new StringBuilder(dashLine[0]);
                        for (int i = 0; i < hangmanWord.length(); i++) {
                            if (hangmanWord.charAt(i) == buttonText.charAt(0)) {
                                newDashLine.setCharAt(i, buttonText.charAt(0));
                            }
                        }
                        dashLine[0] = newDashLine.toString();
                        label.setText(newDashLine.toString());
                    } else {
                        currentImageIndex[0]++;
                        imgLabel.setIcon(img[currentImageIndex[0]]);
                    }
//////////////////////////////////////////////////[ Game Over ]//////////////////////////////////////////////////////////////////////////////

                } else {
                    JOptionPane.showMessageDialog(frame, "Game Over: " + hangmanWord, "Game Over", JOptionPane.INFORMATION_MESSAGE);

                    // Close the current frame
                    frame.dispose();
                    // Start the Hangman game
                    SwingUtilities.invokeLater(new Runnable() {
                        public void run() {
                            new HangmanMenu();
                        }
                    });

//////////////////////////////////////////////////[ Victory ]//////////////////////////////////////////////////////////////////////////////

                }  if (dashLine[0].equalsIgnoreCase(hangmanWord)) {
                    JOptionPane.showMessageDialog(frame, "Victory", "Victory", JOptionPane.INFORMATION_MESSAGE);

                    // Close the current frame
                    frame.dispose();
                    // Start the Hangman game
                    SwingUtilities.invokeLater(new Runnable() {
                        public void run() {
                            new HangmanMenu();
                        }
                    });
                }
            });
        }

//////////////////////////////////////////////////[ Word ]//////////////////////////////////////////////////////////////////////////////


        frame.getContentPane().add(label, "cell 3 4, alignx right");

        label.setFont(new Font("Serif", Font.PLAIN, 70));

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

    public String testLetter (char charLetter, String dashLine, String inputLetter, String[][] Categories, int userArray, int rand ) {

        StringBuilder myString = new StringBuilder(dashLine);
        String newDash = dashLine;
        if (Categories[userArray][rand].equalsIgnoreCase(dashLine)) {

        }
        else if (Categories[userArray][rand].contains(inputLetter)) {
            int indexOfWord = Categories[userArray][rand].indexOf(inputLetter);
            myString.setCharAt(indexOfWord, charLetter);

            dashLine = replaceText(dashLine, indexOfWord, charLetter);
            newDash = dashLine;
        }
        else {
            newDash = dashLine;

        }
        return newDash;
    }

    public static String replaceText (String dashLine, int indexOfWord, char charLetter) {
        StringBuilder myString = new StringBuilder(dashLine);
        myString.setCharAt(indexOfWord, charLetter);
        return myString.toString();

    }
}