/*

 */
package slidepuzzle;

import javax.swing.JButton;

/**
 *
 * @author stevi
 */
public class SlideButtons extends JButton{
    String name;
    int value;
    SlideButtons(String name,int value){
        this.setSize(200, 200);
        this.name = name;
        this.value = value;
    }
}
