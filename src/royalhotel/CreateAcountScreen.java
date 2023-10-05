package royalhotel;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Frame;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 * @author Ariel L
 */
public class CreateAcountScreen extends javax.swing.JFrame {

    public CreateAcountScreen() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().
                getResource("/imgs/RoyalHotelImajotipoMini.png")).getImage());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGroundLogo = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        LastName = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        MailTextField = new javax.swing.JTextField();
        BackIcon = new javax.swing.JLabel();
        Mail = new javax.swing.JLabel();
        LastNameTextField1 = new javax.swing.JTextField();
        ImajotipoIcon3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(350, 500));
        setResizable(false);

        BackGroundLogo.setBackground(new java.awt.Color(255, 255, 255));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/HotelLogo.png"))); // NOI18N

        Name.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Name.setText("Name");

        LastName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LastName.setText("Last Name");

        NameTextField.setText("jTextField1");

        MailTextField.setText("jTextField1");

        BackIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/BackIcon.png"))); // NOI18N
        BackIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BackIconMousePressed(evt);
            }
        });

        Mail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Mail.setText("Mail");

        LastNameTextField1.setText("jTextField1");
        LastNameTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameTextField1ActionPerformed(evt);
            }
        });

        ImajotipoIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/RoyalHotelImajotipoMini.png"))); // NOI18N

        javax.swing.GroupLayout BackGroundLogoLayout = new javax.swing.GroupLayout(BackGroundLogo);
        BackGroundLogo.setLayout(BackGroundLogoLayout);
        BackGroundLogoLayout.setHorizontalGroup(
            BackGroundLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackGroundLogoLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(Logo)
                .addGap(24, 24, 24))
            .addGroup(BackGroundLogoLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(BackGroundLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LastName)
                    .addComponent(Name)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mail)
                    .addComponent(LastNameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(BackGroundLogoLayout.createSequentialGroup()
                .addComponent(BackIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImajotipoIcon3)
                .addGap(159, 159, 159))
        );
        BackGroundLogoLayout.setVerticalGroup(
            BackGroundLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLogoLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LastName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LastNameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackGroundLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackGroundLogoLayout.createSequentialGroup()
                        .addComponent(Mail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 93, Short.MAX_VALUE)
                        .addComponent(BackIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(BackGroundLogoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ImajotipoIcon3))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGroundLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGroundLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackIconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackIconMousePressed
        for (Frame frame : Frame.getFrames()) {frame.dispose();}
        JFrame welcomescreen = new WelcomeScreen();  
        welcomescreen.setVisible(true);
    }//GEN-LAST:event_BackIconMousePressed

    private void LastNameTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameTextField1ActionPerformed

    public static void main(String args[]) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAcountScreen().setVisible(true);   
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGroundLogo;
    private javax.swing.JLabel BackIcon;
    private javax.swing.JLabel ImajotipoIcon3;
    private javax.swing.JLabel LastName;
    private javax.swing.JTextField LastNameTextField1;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Mail;
    private javax.swing.JTextField MailTextField;
    private javax.swing.JLabel Name;
    private javax.swing.JTextField NameTextField;
    // End of variables declaration//GEN-END:variables
}
