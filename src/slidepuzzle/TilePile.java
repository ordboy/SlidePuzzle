/*

 */
package slidepuzzle;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author stevi
 */
public class TilePile {
    public ArrayList<Tile> buttonList = new ArrayList();
    Tile tile;
    public TilePile(){
        buttonList.add(tile = new Tile("src\\slidepuzzle\\pics\\One.png","One",1));
        buttonList.add(tile = new Tile("src\\slidepuzzle\\pics\\Two.png","Two",2));
        buttonList.add(tile = new Tile("src\\slidepuzzle\\pics\\Three.png","Three",3));
        buttonList.add(tile = new Tile("src\\slidepuzzle\\pics\\Four.png","Four",4));
        buttonList.add(tile = new Tile("src\\slidepuzzle\\pics\\Five.png","Five",5));
        buttonList.add(tile = new Tile("src\\slidepuzzle\\pics\\Six.png","Six",6));
        buttonList.add(tile = new Tile("src\\slidepuzzle\\pics\\Seven.png","Seven",7));
        buttonList.add(tile = new Tile("src\\slidepuzzle\\pics\\Eight.png","Eight",8));
        buttonList.add(tile = new Tile("src\\slidepuzzle\\pics\\Nine.png","Nine",9));
        buttonList.add(tile = new Tile("src\\slidepuzzle\\pics\\Ten.png","Ten",10));
        buttonList.add(tile = new Tile("src\\slidepuzzle\\pics\\Eleven.png","Eleven",11));
        buttonList.add(tile = new Tile("src\\slidepuzzle\\pics\\Twelve.png","Twelve",12));
        buttonList.add(tile = new Tile("src\\slidepuzzle\\pics\\Thirteen.png","Thirteen",13));
        buttonList.add(tile = new Tile("src\\slidepuzzle\\pics\\Fourteen.png","Fourteen",14));
        buttonList.add(tile = new Tile("src\\slidepuzzle\\pics\\Fifteen.png","Fifteen",15));
        
//        for (int i = 1; i < 16; i++) {
//            buttonList.add(sb = new SlideButtons(i+"",i));
//            
//        }
       
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