package view;

import java.awt.BorderLayout;

/**
 *
 * @author David Ugalde
 */
public class View {
    
    public View() {
        initComponents();
    }

    @SuppressWarnings("unchecked")    
    private void initComponents() {

        view = new javax.swing.JFrame();
        player1Label = new javax.swing.JLabel();
        player2Label = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();
        trap1 = new javax.swing.JLabel();
        trap2 = new javax.swing.JLabel();
        scorePlayer1 = new javax.swing.JProgressBar ();
        scorePlayer2 = new javax.swing.JProgressBar ();
        robotName1 = new javax.swing.JLabel();
        robotName2 = new javax.swing.JLabel();

        view.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        view.setTitle("SERVER");
        view.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        view.setMinimumSize(new java.awt.Dimension(1024, 768));
        view.setResizable(false);
        
        player1Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/avion.gif")));
        player2Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/robot2.gif")));

        messageLabel.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        messageLabel.setForeground(new java.awt.Color(255, 255, 255));
        messageLabel.setText("");

        trap1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        trap1.setText("1");

        trap2.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        trap2.setText("3");

        scorePlayer1.setValue(100);
        scorePlayer1.setStringPainted(true);
        scorePlayer2.setValue(100);
        scorePlayer2.setStringPainted(true);
        
        
        robotName1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        robotName1.setForeground(new java.awt.Color(255, 255, 255));
        robotName1.setText("Cohete");

        robotName2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        robotName2.setForeground(new java.awt.Color(255, 255, 255));
        robotName2.setText("Robot");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(view.getContentPane());
        view.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(robotName2)
                        .addGap(52, 52, 52)
                        .addComponent(scorePlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168)
                        .addComponent(messageLabel)
                        .addGap(251, 251, 251)
                        .addComponent(robotName1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(player1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)
                        .addComponent(trap2)
                        .addGap(280, 280, 280)
                        .addComponent(trap1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(player2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(scorePlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(robotName2)
                        .addComponent(scorePlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(messageLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(robotName1)
                        .addComponent(scorePlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(player1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(trap2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(trap1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(player2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(131, Short.MAX_VALUE))
        );

        backgroundPanel = new Panel();
        view.add(backgroundPanel, BorderLayout.CENTER);
        view.setLocationRelativeTo(null);
        view.pack();
        view.setVisible(true);
    }

    // Variables declaration - do not modify
    private Panel backgroundPanel;
    private javax.swing.JFrame view;
    private javax.swing.JLabel trap1;
    private javax.swing.JLabel trap2;
    private javax.swing.JLabel player1Label;
    private javax.swing.JLabel player2Label;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JLabel robotName1;
    private javax.swing.JLabel robotName2;
    private javax.swing.JProgressBar  scorePlayer1;
    private javax.swing.JProgressBar  scorePlayer2;
    // End of variables declaration                   

    public javax.swing.JLabel getPlayer1Label() {
        return player1Label;
    }

    public void setPlayer1Label(javax.swing.JLabel p1) {
        this.player1Label = p1;
    }

    public javax.swing.JLabel getPlayer2Label() {
        return player2Label;
    }

    public void setPlayer2Label(javax.swing.JLabel p2) {
        this.player2Label = p2;
    }

    public javax.swing.JLabel getMessageLabel() {
        return messageLabel;
    }

    public void setMessageLabel(javax.swing.JLabel ms) {
        this.messageLabel = ms;
    }

    public javax.swing.JLabel getTrap1() {
        return trap1;
    }

    public void setTrap1(javax.swing.JLabel trap1) {
        this.trap1 = trap1;
    }

    public javax.swing.JLabel getTrap2() {
        return trap2;
    }

    public void setTrap2(javax.swing.JLabel trap2) {
        this.trap2 = trap2;
    }

    public javax.swing.JProgressBar   getScorePlayer1() {
        return scorePlayer1;
    }

    public void setScorePlayer1(javax.swing.JProgressBar   sp1) {
        this.scorePlayer1 = sp1;
    }

    public javax.swing.JProgressBar   getScorePlayer2() {
        return scorePlayer2;
    }

    public void setScorePlayer2(javax.swing.JProgressBar   sp2) {
        this.scorePlayer2 = sp2;
    }
    
    public javax.swing.JFrame getView() {
        return view;
    }

    public void setView(javax.swing.JFrame v) {
        this.view = v;
    }
    
    public Panel getPanel() {
        return backgroundPanel;
    }

}
