/*

 */
package slidepuzzle;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author stevi
 */
public class Game {
    public ArrayList<SlideButtons> buttonList = new ArrayList();
    SlideButtons sb;
    public Game(){
        for (int i = 0; i < 16; i++) {
            buttonList.add(sb = new SlideButtons(i+"",i));
            
        }
       this.shuffleBoard();
    }
    
    public void shuffleBoard(){
           Collections.shuffle(buttonList);
       }
    public boolean hasWon(){
        //todo jämföra array
       return true; 
    }
        
}
