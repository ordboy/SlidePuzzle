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
    SlideButtons [] buttonArray = new SlideButtons[16];
    
    SlidePuzzle() {
        
        ActionListener l = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                int index=0;
                int nullIndex=0;
                SlideButtons temp;
               SlideButtons x =(SlideButtons) e.getSource();
                for (int i = 0; i < buttonArray.length; i++) {
                    
                    if(x.value == buttonArray[i].value)
                        index= i;
                    
                    if(buttonArray[i].value ==0)
                        nullIndex = i;
                }
                
                if((index-nullIndex)==1 || (index-nullIndex)==4 || (index-nullIndex)==-4 || (index-nullIndex)==-1) {
                    temp = buttonArray[index];
                    buttonArray[index] = buttonArray[nullIndex];
                    buttonArray[nullIndex]=temp;
                    
                    for (int i = 0; i < buttonArray.length; i++) {
                        pane.add(buttonArray[i]);
                    }
                    pane.revalidate();
                    pane.repaint();
                }
           
            
              
                if(tp.hasWon(buttonArray))
                    System.out.println("Vinst");
            }
        };
        tp.getArray(buttonArray);
        for (int i = 0; i < buttonArray.length-1; i++) {
            //tilverkar en slidebutton med hjälp av beskriving från Tile som ligger i buttonlist            
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
