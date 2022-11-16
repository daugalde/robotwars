package model;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author David Ugalde
 */
public class Saw  {
    private Image image;
    
    public Saw() {
        image = new ImageIcon(getClass().getResource("/assets/film.gif")).getImage();
    }
    
    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
