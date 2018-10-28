/*

 */
package slidepuzzle;

import javax.swing.ImageIcon;

/**
 *Description of a tile for merging with a button
 * @author stevi
 */
public class Tile {
    ImageIcon img;
    int value;
    String name;
    Tile(String path, String name, int value){
        img = new ImageIcon(path);
        this.name = name;
        this.value = value;
    }
}
