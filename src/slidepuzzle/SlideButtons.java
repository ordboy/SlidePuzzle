/*

 */
package slidepuzzle;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author stevi
 */
public class SlideButtons extends JButton {
    String number;
    int value = 0;
    ImageIcon pic;
    
    public SlideButtons(){}
    
    public SlideButtons(String text){
        this.setText(text);
    }
    
    public SlideButtons(ImageIcon pic,String number,int value){
                
        this.setSize(150, 150);
        this.number = number;
        this.pic = pic;
        this.value = value;
        this.setIcon(pic);
    }    
}