/*

 */
package slidepuzzle;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SlidePuzzle extends JFrame {
    Rectangle temp;
    JFrame frame = new JFrame();
    TilePile tp = new TilePile();
    JPanel pane = new JPanel();
    JButton[] buttonArray = new JButton[16];
    
    SlidePuzzle() {
        
        ActionListener l = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < buttonArray.length; i++) {
                    if(e.getSource().equals(buttonArray[i])){
                        tp.swapButton(buttonArray[15], buttonArray[i]);
                    }
                }
            }
        };
        
        for (int i = 0; i < buttonArray.length-1; i++) {
            //tilverkar en slidebutton med hjälp av beskriving från Tile som ligger i buttonlist
            buttonArray[i] = new SlideButtons(tp.buttonList.get(i).img,tp.buttonList.get(i).name,tp.buttonList.get(i).value);
            pane.add(buttonArray[i]);
            buttonArray[i].addActionListener(l);
        }
        
        pane.add(buttonArray[15] = new SlideButtons());
        
        pane.setLayout(new GridLayout(4, 4));
        frame.setSize(500, 500);
        frame.setLocation(1000, 50);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.add(pane);
        frame.setVisible(true);
        frame.repaint();
        pack();
    }

    public static void main(String[] args) {
        SlidePuzzle s = new SlidePuzzle();
    }    
}
