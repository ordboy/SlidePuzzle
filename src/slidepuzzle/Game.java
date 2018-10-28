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
        buttonList.add(sb = new SlideButtons("src\\slidepuzzle\\pics\\One.png","One",1));
        buttonList.add(sb = new SlideButtons("src\\slidepuzzle\\pics\\Two.png","Two",1));
        buttonList.add(sb = new SlideButtons("src\\slidepuzzle\\pics\\Three.png","Three",1));
        buttonList.add(sb = new SlideButtons("src\\slidepuzzle\\pics\\Four.png","Four",1));
        buttonList.add(sb = new SlideButtons("src\\slidepuzzle\\pics\\Five.png","Five",1));
        buttonList.add(sb = new SlideButtons("src\\slidepuzzle\\pics\\Six.png","Six",1));
        buttonList.add(sb = new SlideButtons("src\\slidepuzzle\\pics\\Seven.png","Seven",1));
        buttonList.add(sb = new SlideButtons("src\\slidepuzzle\\pics\\Eight.png","Eight",1));
        buttonList.add(sb = new SlideButtons("src\\slidepuzzle\\pics\\Nine.png","Nine",1));
        buttonList.add(sb = new SlideButtons("src\\slidepuzzle\\pics\\Ten.png","Ten",1));
        buttonList.add(sb = new SlideButtons("src\\slidepuzzle\\pics\\Eleven.png","Eleven",1));
        buttonList.add(sb = new SlideButtons("src\\slidepuzzle\\pics\\Twelve.png","Twelve",1));
        buttonList.add(sb = new SlideButtons("src\\slidepuzzle\\pics\\Thirteen.png","Thirteen",1));
        buttonList.add(sb = new SlideButtons("src\\slidepuzzle\\pics\\Fourteen.png","Fourteen",1));
        buttonList.add(sb = new SlideButtons("src\\slidepuzzle\\pics\\Fifteen.png","Fifteen",1));
        
//        for (int i = 1; i < 16; i++) {
//            buttonList.add(sb = new SlideButtons(i+"",i));
//            
//        }
       
//       this.shuffleBoard();
    }
    
    public void shuffleBoard(){
           Collections.shuffle(buttonList);
       }
    public boolean hasWon(){
        //todo jämföra array
       return true; 
    }
        
}
