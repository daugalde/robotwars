/*
 * Pantalla.java
 *
 * Created on 7 de septiembre de 2008, 02:33 PM
 */
package interfaz;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import negocio.UI.UI;

/**
 *
 * @author  David
 */
public class Pantalla extends javax.swing.JFrame {

    private UI user;

    public Pantalla() {
        initComponents();
        setUser(new UI(JOptionPane.showInputDialog("Digite la direccion ip del cliente")));
        getUser().asigna(this);
        getUser().start();
        this.getT1().setEnabled(false);
        this.getT2().setEnabled(false);
        Panel fondo = new Panel();
        this.add(fondo, BorderLayout.CENTER);
        this.pack();

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        j4 = new javax.swing.JLabel();
        j7 = new javax.swing.JLabel();
        j9 = new javax.swing.JLabel();
        j0 = new javax.swing.JLabel();
        j13 = new javax.swing.JLabel();
        j8 = new javax.swing.JLabel();
        j10 = new javax.swing.JLabel();
        j12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        j3 = new javax.swing.JLabel();
        j5 = new javax.swing.JLabel();
        j11 = new javax.swing.JLabel();
        j6 = new javax.swing.JLabel();
        j14 = new javax.swing.JLabel();
        j1 = new javax.swing.JLabel();
        j2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CLIENTE");
        setMinimumSize(new java.awt.Dimension(794, 600));
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        j4.setFont(new java.awt.Font("Tahoma", 0, 3));
        j4.setText("1");

        j7.setFont(new java.awt.Font("Tahoma", 0, 3));
        j7.setText("2");

        j9.setFont(new java.awt.Font("Tahoma", 0, 3));
        j9.setText("1");

        j0.setFont(new java.awt.Font("Tahoma", 0, 3));
        j0.setText("1");

        j13.setFont(new java.awt.Font("Tahoma", 0, 3));
        j13.setText("1");

        j8.setFont(new java.awt.Font("Tahoma", 0, 3));
        j8.setText("3");

        j10.setFont(new java.awt.Font("Tahoma", 0, 3));
        j10.setText("2");

        j12.setFont(new java.awt.Font("Tahoma", 0, 3));
        j12.setText("2");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Robot");

        t2.setText("0");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 11));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cohete");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12));

        j3.setFont(new java.awt.Font("Tahoma", 0, 3));
        j3.setText("3");

        j5.setFont(new java.awt.Font("Tahoma", 0, 3));
        j5.setText("2");

        j11.setFont(new java.awt.Font("Tahoma", 0, 3));
        j11.setText("1");

        j6.setFont(new java.awt.Font("Tahoma", 0, 3));
        j6.setText("1");

        j14.setFont(new java.awt.Font("Tahoma", 0, 3));
        j14.setText("3");

        j1.setFont(new java.awt.Font("Tahoma", 0, 3));
        j1.setText("3");

        j2.setFont(new java.awt.Font("Tahoma", 0, 3));
        j2.setText("1");

        t1.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(j4)
                        .addGap(145, 145, 145)
                        .addComponent(j7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(j9)
                                .addGap(75, 75, 75)
                                .addComponent(j0)
                                .addGap(105, 105, 105)
                                .addComponent(j13)
                                .addGap(75, 75, 75)
                                .addComponent(j8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(j10)
                                .addGap(95, 95, 95)
                                .addComponent(j12))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(20, 20, 20)
                                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(200, 200, 200)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(140, 140, 140)
                                .addComponent(j3)
                                .addGap(45, 45, 45)
                                .addComponent(j5)
                                .addGap(45, 45, 45)
                                .addComponent(j11)
                                .addGap(65, 65, 65)
                                .addComponent(j6)
                                .addGap(25, 25, 25)
                                .addComponent(j14)
                                .addGap(65, 65, 65)
                                .addComponent(j1)
                                .addGap(25, 25, 25)
                                .addComponent(j2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(j4)
                            .addComponent(j7))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(j3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(j5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(j11))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(j6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(j14))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(j1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(j2)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(j10)
                            .addComponent(j12))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(j0)
                                    .addComponent(j9)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(j13))
                            .addComponent(j8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
// TODO add your handling code here:
    if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
        getUser().datos(1);
    }

    if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
        getUser().datos(2);
    }

    if (evt.getKeyCode() == KeyEvent.VK_UP) {
        getUser().datos(3);
    }

    if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
        getUser().datos(4);
    }

}//GEN-LAST:event_formKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                new Pantalla().setVisible(true);


            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel j0;
    private javax.swing.JLabel j1;
    private javax.swing.JLabel j10;
    private javax.swing.JLabel j11;
    private javax.swing.JLabel j12;
    private javax.swing.JLabel j13;
    private javax.swing.JLabel j14;
    private javax.swing.JLabel j2;
    private javax.swing.JLabel j3;
    private javax.swing.JLabel j4;
    private javax.swing.JLabel j5;
    private javax.swing.JLabel j6;
    private javax.swing.JLabel j7;
    private javax.swing.JLabel j8;
    private javax.swing.JLabel j9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables

    public UI getUser() {
        return user;
    }

    public void setUser(UI user) {
        this.user = user;
    }

    public javax.swing.JLabel getJLabel1() {
        return jLabel1;
    }

    public void setJLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public javax.swing.JLabel getJLabel2() {
        return jLabel2;
    }

    public void setJLabel2(javax.swing.JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public javax.swing.JLabel getJLabel3() {
        return jLabel3;
    }

    public void setJLabel3(javax.swing.JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public javax.swing.JLabel getJ0() {
        return j0;
    }

    public void setJ0(javax.swing.JLabel j0) {
        this.j0 = j0;
    }

    public javax.swing.JLabel getJ1() {
        return j1;
    }

    public void setJ1(javax.swing.JLabel j1) {
        this.j1 = j1;
    }

    public javax.swing.JLabel getJ10() {
        return j10;
    }

    public void setJ10(javax.swing.JLabel j10) {
        this.j10 = j10;
    }

    public javax.swing.JLabel getJ11() {
        return j11;
    }

    public void setJ11(javax.swing.JLabel j11) {
        this.j11 = j11;
    }

    public javax.swing.JLabel getJ12() {
        return j12;
    }

    public void setJ12(javax.swing.JLabel j12) {
        this.j12 = j12;
    }

    public javax.swing.JLabel getJ13() {
        return j13;
    }

    public void setJ13(javax.swing.JLabel j13) {
        this.j13 = j13;
    }

    public javax.swing.JLabel getJ14() {
        return j14;
    }

    public void setJ14(javax.swing.JLabel j14) {
        this.j14 = j14;
    }

    public javax.swing.JLabel getJ2() {
        return j2;
    }

    public void setJ2(javax.swing.JLabel j2) {
        this.j2 = j2;
    }

    public javax.swing.JLabel getJ3() {
        return j3;
    }

    public void setJ3(javax.swing.JLabel j3) {
        this.j3 = j3;
    }

    public javax.swing.JLabel getJ4() {
        return j4;
    }

    public void setJ4(javax.swing.JLabel j4) {
        this.j4 = j4;
    }

    public javax.swing.JLabel getJ5() {
        return j5;
    }

    public void setJ5(javax.swing.JLabel j5) {
        this.j5 = j5;
    }

    public javax.swing.JLabel getJ6() {
        return j6;
    }

    public void setJ6(javax.swing.JLabel j6) {
        this.j6 = j6;
    }

    public javax.swing.JLabel getJ7() {
        return j7;
    }

    public void setJ7(javax.swing.JLabel j7) {
        this.j7 = j7;
    }

    public javax.swing.JLabel getJ8() {
        return j8;
    }

    public void setJ8(javax.swing.JLabel j8) {
        this.j8 = j8;
    }

    public javax.swing.JLabel getJ9() {
        return j9;
    }

    public void setJ9(javax.swing.JLabel j9) {
        this.j9 = j9;
    }

    public javax.swing.JTextField getT1() {
        return t1;
    }

    public void setT1(javax.swing.JTextField p1) {
        this.t1 = p1;
    }

    public javax.swing.JTextField getT2() {
        return t2;
    }

    public void setT2(javax.swing.JTextField p2) {
        this.t2 = p2;
    }
}
