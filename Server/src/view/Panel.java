/*
 * Panel.java
 */

package view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import model.Weapon;

/**
 *
 * @author  David
 */
public class Panel extends javax.swing.JPanel implements ActionListener {
    
    private Weapon weapon;
    private Timer timer;
    private int x = 0;
    private int y = 0;
    
    public Panel() {
        initComponents();
        weapon = new Weapon();
        this.setSize(1024, 768);
        timer = new Timer(300, this);
    }
    
    public void paintComponent(Graphics g) {
        Dimension size = getSize();
        ImageIcon background = new ImageIcon(getClass().getResource("/assets/BattleField1.png"));
        g.drawImage(background.getImage(), 0, 0, size.width, size.height, null);
        setOpaque(false);
        super.paintComponent(g);
    }
    
    public void paint(Graphics g){
        
        super.paint(g); 
        
        Graphics2D g2D = (Graphics2D) g;
        Dimension size = getSize();
        Image bullet = weapon.getImage();
        g2D.drawImage(bullet, x, y, null);
    }
    
    public Weapon getWeapon() {
        return weapon;
    }
    
    public Timer getRefreshTimer() {
        return timer;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setPreferredSize(new java.awt.Dimension(740, 504));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 315, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void actionPerformed(ActionEvent e) {
        
        x =  weapon.getX() + x;
        y = weapon.getY() ;
        repaint();
    }

    public void resetBulletLocation() {
        x =  0;
        y = 0;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
