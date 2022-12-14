package model;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author David Ugalde
 */
public class Weapon {
    
    private int x;
    
    private int y;
    
    private Image image;
    
    public Weapon () {
        image = new ImageIcon(getClass().getResource("/assets/bola.gif")).getImage();
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
