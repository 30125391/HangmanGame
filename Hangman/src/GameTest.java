import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import net.miginfocom.swing.MigLayout;

public class GameTest {
    public GameTest() {

        Categories categories = new Categories();
        //Set categories
        categories.SetCategories();
        //Get categories
        String[][] Categories = categories.getCategories();

        JFrame frame = new JFrame("test");
        frame.setSize(640, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MigLayout layout = new MigLayout(
                "",           // layout constraints, add debug to see dotted lines
                "[][grow]",     // column constraints
                "[][][grow]"   // row constraints
        );
        frame.setLayout(layout);

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


        final String[] dashLine = {Categories[0][0].replaceAll("[a-zA-Z]", "-")};

        JLabel label = new JLabel(dashLine[0]);


        frame.getContentPane().add(panel);

/////////////////////////////////////////////////[ Buttons Functionality]/////////////////////////////////////////////////////////////////////

        buttonA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputLetter = "a";
                char charLetter = inputLetter.charAt(0);
                String newDashLine = testLetter(charLetter, dashLine[0], inputLetter, Categories);
                dashLine[0] = dashLine[0].replaceAll(dashLine[0], newDashLine);
                label.setText(dashLine[0]);
            }
        });
        buttonB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputLetter = "b";
                char charLetter = inputLetter.charAt(0);
                String newDashLine = testLetter(charLetter, dashLine[0], inputLetter, Categories);
                dashLine[0] = dashLine[0].replaceAll(dashLine[0], newDashLine);
                label.setText(dashLine[0]);

            }
        });
        buttonC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputLetter = "c";
                char charLetter = inputLetter.charAt(0);
                String newDashLine = testLetter(charLetter, dashLine[0], inputLetter, Categories);
                dashLine[0] = dashLine[0].replaceAll(dashLine[0], newDashLine);
                label.setText(dashLine[0]);
            }
        });
        buttonD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputLetter = "d";
                char charLetter = inputLetter.charAt(0);
                String newDashLine = testLetter(charLetter, dashLine[0], inputLetter, Categories);
                dashLine[0] = dashLine[0].replaceAll(dashLine[0], newDashLine);
                label.setText(dashLine[0]);
            }
        });
        buttonE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputLetter = "e";
                char charLetter = inputLetter.charAt(0);
                String newDashLine = testLetter(charLetter, dashLine[0], inputLetter, Categories);
                dashLine[0] = dashLine[0].replaceAll(dashLine[0], newDashLine);
                label.setText(dashLine[0]);

            }
        });
        buttonF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputLetter = "f";
                char charLetter = inputLetter.charAt(0);
                String newDashLine = testLetter(charLetter, dashLine[0], inputLetter, Categories);
                dashLine[0] = dashLine[0].replaceAll(dashLine[0], newDashLine);
                label.setText(dashLine[0]);
            }
        });
        buttonG.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputLetter = "g";
                char charLetter = inputLetter.charAt(0);
                String newDashLine = testLetter(charLetter, dashLine[0], inputLetter, Categories);
                dashLine[0] = dashLine[0].replaceAll(dashLine[0], newDashLine);
                label.setText(dashLine[0]);
            }
        });
        buttonH.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputLetter = "h";
                char charLetter = inputLetter.charAt(0);
                String newDashLine = testLetter(charLetter, dashLine[0], inputLetter, Categories);
                dashLine[0] = dashLine[0].replaceAll(dashLine[0], newDashLine);
                label.setText(dashLine[0]);
            }
        });
        buttonI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputLetter = "i";
                char charLetter = inputLetter.charAt(0);
                String newDashLine = testLetter(charLetter, dashLine[0], inputLetter, Categories);
                dashLine[0] = dashLine[0].replaceAll(dashLine[0], newDashLine);
                label.setText(dashLine[0]);
            }
        });
        buttonJ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputLetter = "j";
                char charLetter = inputLetter.charAt(0);
                String newDashLine = testLetter(charLetter, dashLine[0], inputLetter, Categories);
                dashLine[0] = dashLine[0].replaceAll(dashLine[0], newDashLine);
                label.setText(dashLine[0]);
            }
        });
        buttonK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputLetter = "k";
                char charLetter = inputLetter.charAt(0);
                String newDashLine = testLetter(charLetter, dashLine[0], inputLetter, Categories);
                dashLine[0] = dashLine[0].replaceAll(dashLine[0], newDashLine);
                label.setText(dashLine[0]);
            }
        });
        buttonL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputLetter = "l";
                char charLetter = inputLetter.charAt(0);
                String newDashLine = testLetter(charLetter, dashLine[0], inputLetter, Categories);
                dashLine[0] = dashLine[0].replaceAll(dashLine[0], newDashLine);
                label.setText(dashLine[0]);
            }
        });
        buttonM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputLetter = "m";
                char charLetter = inputLetter.charAt(0);
                String newDashLine = testLetter(charLetter, dashLine[0], inputLetter, Categories);
                dashLine[0] = dashLine[0].replaceAll(dashLine[0], newDashLine);
                label.setText(dashLine[0]);
            }
        });
        buttonN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputLetter = "n";
                char charLetter = inputLetter.charAt(0);
                String newDashLine = testLetter(charLetter, dashLine[0], inputLetter, Categories);
                dashLine[0] = dashLine[0].replaceAll(dashLine[0], newDashLine);
                label.setText(dashLine[0]);
            }
        });
        buttonO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputLetter = "o";
                char charLetter = inputLetter.charAt(0);
                String newDashLine = testLetter(charLetter, dashLine[0], inputLetter, Categories);
                dashLine[0] = dashLine[0].replaceAll(dashLine[0], newDashLine);
                label.setText(dashLine[0]);
            }
        });
        buttonP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputLetter = "p";
                char charLetter = inputLetter.charAt(0);
                String newDashLine = testLetter(charLetter, dashLine[0], inputLetter, Categories);
                dashLine[0] = dashLine[0].replaceAll(dashLine[0], newDashLine);
                label.setText(dashLine[0]);
            }
        });
        buttonQ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputLetter = "q";
                char charLetter = inputLetter.charAt(0);
                String newDashLine = testLetter(charLetter, dashLine[0], inputLetter, Categories);
                dashLine[0] = dashLine[0].replaceAll(dashLine[0], newDashLine);
                label.setText(dashLine[0]);
            }
        });
        buttonR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputLetter = "r";
                char charLetter = inputLetter.charAt(0);
                String newDashLine = testLetter(charLetter, dashLine[0], inputLetter, Categories);
                dashLine[0] = dashLine[0].replaceAll(dashLine[0], newDashLine);
                label.setText(dashLine[0]);
            }
        });
        buttonS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputLetter = "s";
                char charLetter = inputLetter.charAt(0);
                String newDashLine = testLetter(charLetter, dashLine[0], inputLetter, Categories);
                dashLine[0] = dashLine[0].replaceAll(dashLine[0], newDashLine);
                label.setText(dashLine[0]);
            }
        });
        buttonT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputLetter = "t";
                char charLetter = inputLetter.charAt(0);
                String newDashLine = testLetter(charLetter, dashLine[0], inputLetter, Categories);
                dashLine[0] = dashLine[0].replaceAll(dashLine[0], newDashLine);
                label.setText(dashLine[0]);
            }
        });
        buttonU.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputLetter = "u";
                char charLetter = inputLetter.charAt(0);
                String newDashLine = testLetter(charLetter, dashLine[0], inputLetter, Categories);
                dashLine[0] = dashLine[0].replaceAll(dashLine[0], newDashLine);
                label.setText(dashLine[0]);
            }
        });
        buttonV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputLetter = "v";
                char charLetter = inputLetter.charAt(0);
                String newDashLine = testLetter(charLetter, dashLine[0], inputLetter, Categories);
                dashLine[0] = dashLine[0].replaceAll(dashLine[0], newDashLine);
                label.setText(dashLine[0]);
            }
        });
        buttonW.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputLetter = "w";
                char charLetter = inputLetter.charAt(0);
                String newDashLine = testLetter(charLetter, dashLine[0], inputLetter, Categories);
                dashLine[0] = dashLine[0].replaceAll(dashLine[0], newDashLine);
                label.setText(dashLine[0]);
            }
        });
        buttonX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputLetter = "x";
                char charLetter = inputLetter.charAt(0);
                String newDashLine = testLetter(charLetter, dashLine[0], inputLetter, Categories);
                dashLine[0] = dashLine[0].replaceAll(dashLine[0], newDashLine);
                label.setText(dashLine[0]);
            }
        });
        buttonY.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputLetter = "y";
                char charLetter = inputLetter.charAt(0);
                String newDashLine = testLetter(charLetter, dashLine[0], inputLetter, Categories);
                dashLine[0] = dashLine[0].replaceAll(dashLine[0], newDashLine);
                label.setText(dashLine[0]);
            }
        });
        buttonZ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputLetter = "z";
                char charLetter = inputLetter.charAt(0);
                String newDashLine = testLetter(charLetter, dashLine[0], inputLetter, Categories);
                dashLine[0] = dashLine[0].replaceAll(dashLine[0], newDashLine);
                label.setText(dashLine[0]);
            }
        });






        frame.getContentPane().add(label, "cell 0 1");



        frame.setVisible(true);

    }

/////////////////////////////////////////////////[ Hangman Image(s) ]/////////////////////////////////////////////////////////////////////
    public String testLetter (char charLetter, String dashLine, String inputLetter, String[][] Categories ) {

        StringBuilder myString = new StringBuilder(dashLine);
        String newDash = dashLine;
        if (Categories[0][0].equalsIgnoreCase(dashLine)) {

        }
        else if (Categories[0][0].contains(inputLetter)) {
            int indexOfWord = Categories[0][0].indexOf(inputLetter);
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




    public static void main(String[] args) {
        new GameTest();
    }
}
