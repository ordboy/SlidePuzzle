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
    String name;
    int value;
//    String patt;
    ImageIcon pic;
    SlideButtons(String path,String number,int value){
        this.pic =  new ImageIcon(path, number);
//        patt = path;
        this.setSize(150, 150);
        //this.name = name;
        this.value = value;
    }
}
