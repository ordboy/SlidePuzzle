package slidepuzzle;

import java.awt.*;
import java.util.*;
import javax.swing.*;

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
        

       
       this.shuffleBoard();
    }
    
    public void shuffleBoard(){
//           Collections.shuffle(buttonList);
       }
    
    public SlideButtons[] getArray(SlideButtons[] a){
        for (int i = 0; i < a.length-1; i++) {
            a[i] = new SlideButtons(this.buttonList.get(i).img,this.buttonList.get(i).name,this.buttonList.get(i).value);
        }
        return a;
        
    }
    
    public boolean hasWon(SlideButtons[] a){
                for (int i = 0; i < a.length - 1; i++) {
            
            System.out.println(a[i].value +" "+ (i+1));
            if (a[i].value != (i+1)) 
                return false;       
        }
       return true; 
    }
        
}
