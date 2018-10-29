/*

 */
package slidepuzzle;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import jdk.nashorn.internal.objects.NativeArray;

public class SlidePuzzle extends JFrame {
    
    SlidePuzzle() {
        JFrame frame = new JFrame();
        TilePile tp = new TilePile();
        JPanel pane = new JPanel();
        
        SlideButtons[] buttonArray = new SlideButtons[16];
        
        
        ActionListener l = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                    
                SlideButtons x;
                x = (SlideButtons)e.getSource();
                System.out.println(x.value);
                
                if(tp.hasWon(buttonArray))
                    System.out.println("vinst");
               

            }
        };
        
        for (int i = 0; i < buttonArray.length-1; i++) {
            //tilverkar en slidebutton med hjälp av beskriving från Tile som ligger i buttonlist
            buttonArray[i] = new SlideButtons(tp.buttonList.get(i).img,tp.buttonList.get(i).name,tp.buttonList.get(i).value);

            pane.add(buttonArray[i]);
            buttonArray[i].addActionListener(l);
        }
       
        pane.setLayout(new GridLayout(4, 4));

        frame.setSize(600, 600);

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
