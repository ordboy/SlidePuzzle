/*

 */
package slidepuzzle;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionListener;

public class SlidePuzzle extends JFrame {

    SlidePuzzle() {
        JFrame frame = new JFrame();
        Game game = new Game();
        JPanel pane = new JPanel();
        
        JButton[] buttonArray = new JButton[16];

        for (int i = 0; i < buttonArray.length-1; i++) {
            buttonArray[i] = new JButton(game.buttonList.get(i).name);
            
            pane.add(buttonArray[i]);
//            buttonArray[i].addActionListener(this); KOLLA HÄR!!
            
        }
        pane.setLayout(new GridLayout(4,4));
        
        frame.setSize(500, 500);
        
        frame.setLocation(1000, 50);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.add(pane);
        frame.setVisible(true);
        pack();
    }

    public static void main(String[] args) {
        SlidePuzzle s = new SlidePuzzle();
    }

}
