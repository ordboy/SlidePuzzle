/*

 */

package slidepuzzle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class SlidePuzzle extends JFrame {
    public static void go(){
    JFrame frame = new JFrame();    
    Game game;
    JPanel pane = new JPanel();
    
    JButton[] buttonArray = new JButton[16];
        
        for (int i = 0; i < buttonArray.length; i++) {
            game = new Game();
            pane.add(game.buttonList.get(i));
        }
    
    frame.add(pane);
    frame.setVisible(true);
    }    
    public static void main(String[] args) {
        go();
    }

}
