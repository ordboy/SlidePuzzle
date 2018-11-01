/*

 */
package slidepuzzle;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class SlidePuzzle extends JFrame {

    Rectangle temp;
    JFrame frame = new JFrame();
    TilePile tp = new TilePile();
    JPanel pane = new JPanel();
    JPanel pane2 = new JPanel();
    JPanel pane3 = new JPanel();
    JLabel winMessage = new JLabel(new ImageIcon("src\\slidepuzzle\\pics\\vinst.jpg"));
    
    SlideButtons[] buttonArray = new SlideButtons[16];
    SlideButtons newGame = new SlideButtons("New Game");

    SlidePuzzle() {

        ActionListener l = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int index = 0;
                int nullIndex = 0;
                SlideButtons temp;
                SlideButtons x = (SlideButtons) e.getSource();
                
                //new game funktonen
                if(x==newGame){
                     Random rnd = new Random();
                    for (int i = buttonArray.length - 1; i > 0; i--) {
                    index = rnd.nextInt(buttonArray.length-1);
                    SlideButtons a = buttonArray[index];
                    buttonArray[index] = buttonArray[i];
                    buttonArray[i] = a;             
                    
                    }
                    for (int i = 0; i < buttonArray.length; i++) {
                        pane.add(buttonArray[i]);
                    }
                    pane3.setVisible(false);
                    pane.setVisible(true);
                    pane.revalidate();
                    pane.repaint();
                }
                //swap-funktionen1
                for (int i = 0; i < buttonArray.length; i++) {
                    if (x.value == buttonArray[i].value) {
                        index = i;
                    }

                    if (buttonArray[i].value == 0) {
                        nullIndex = i;
                    }
                }
                //swap-funktionen2
                if ((index != 3 && index != 7 && index != 11 && index != 15) && (index - nullIndex) == -1
                        || (index - nullIndex) == 4 || (index - nullIndex) == -4
                        || (index != 0 && index != 4 && index != 8 && index != 12) && (index - nullIndex) == 1) {
                    temp = buttonArray[index];
                    buttonArray[index] = buttonArray[nullIndex];
                    buttonArray[nullIndex] = temp;

                    for (int i = 0; i < buttonArray.length; i++) {
                        pane.add(buttonArray[i]);
                    }
                    pane.revalidate();
                    pane.repaint();
                }
                //vinstfunktionen
                if (tp.hasWon(buttonArray)) {
                    pane.setVisible(false);
                    pane3.setVisible(true);
                    pane2.setVisible(true);
                }
            }
        };
        tp.getArray(buttonArray);
        for (int i = 0; i < buttonArray.length - 1; i++) {                        
            pane.add(buttonArray[i]);
            buttonArray[i].addActionListener(l);
        }

//  
    pane3.setSize(700, 700);
    
    pane3.setLayout(new BorderLayout());
    pane3.add(winMessage);
    newGame.addActionListener(l);
    pane2.add (newGame);
    pane.add (buttonArray[15] = new SlideButtons());
    frame.setLayout (new BorderLayout());
    pane.setLayout (new GridLayout(4, 4));
    pane3.setVisible(false);
    
    
    frame.setSize (700, 700);
    frame.setLocation (1000, 50);
    frame.setVisible (true);
    frame.setDefaultCloseOperation (EXIT_ON_CLOSE);
    frame.add(pane2, BorderLayout.NORTH);
    frame.add(pane3, BorderLayout.CENTER);
    frame.add(pane, BorderLayout.CENTER);
    frame.setVisible (true);
    frame.repaint ();
    pack();
}

    public static void main(String[] args) {
        SlidePuzzle s = new SlidePuzzle();
    }
}
