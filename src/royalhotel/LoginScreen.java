package royalhotel;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Frame;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 * @author Ariel L
 */
public class LoginScreen extends javax.swing.JFrame {
    
    public LoginScreen() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().
                getResource("/imgs/RoyalHotelImajotipoMini.png")).getImage());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogoContainer = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Mail = new javax.swing.JLabel();
        PassWord = new javax.swing.JLabel();
        BackIcon = new javax.swing.JLabel();
        PassWordTextField = new javax.swing.JTextField();
        MailTextField1 = new javax.swing.JTextField();
        ImajotipoIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(350, 500));
        setResizable(false);

        LogoContainer.setBackground(new java.awt.Color(255, 255, 255));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/HotelLogo.png"))); // NOI18N

        Mail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Mail.setText("Mail");

        PassWord.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        PassWord.setText("PassWord");

        BackIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/BackIcon.png"))); // NOI18N
        BackIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BackIconMousePressed(evt);
            }
        });

        PassWordTextField.setText("jTextField1");

        MailTextField1.setText("jTextField1");

        ImajotipoIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/RoyalHotelImajotipoMini.png"))); // NOI18N

        javax.swing.GroupLayout LogoContainerLayout = new javax.swing.GroupLayout(LogoContainer);
        LogoContainer.setLayout(LogoContainerLayout);
        LogoContainerLayout.setHorizontalGroup(
            LogoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogoContainerLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(Logo)
                .addGap(24, 24, 24))
            .addGroup(LogoContainerLayout.createSequentialGroup()
                .addComponent(BackIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImajotipoIcon)
                .addGap(165, 165, 165))
            .addGroup(LogoContainerLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(LogoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PassWordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mail)
                    .addComponent(PassWord)
                    .addComponent(MailTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LogoContainerLayout.setVerticalGroup(
            LogoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoContainerLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MailTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LogoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LogoContainerLayout.createSequentialGroup()
                        .addComponent(PassWord)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PassWordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                        .addComponent(BackIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(LogoContainerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ImajotipoIcon))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LogoContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LogoContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackIconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackIconMousePressed
        for (Frame frame : Frame.getFrames()) {frame.dispose();}
        JFrame welcomescreen = new WelcomeScreen();
        welcomescreen.setVisible(true);
    }//GEN-LAST:event_BackIconMousePressed

    public static void main(String args[]) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);    
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackIcon;
    private javax.swing.JLabel ImajotipoIcon;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel LogoContainer;
    private javax.swing.JLabel Mail;
    private javax.swing.JTextField MailTextField1;
    private javax.swing.JLabel PassWord;
    private javax.swing.JTextField PassWordTextField;
    // End of variables declaration//GEN-END:variables
}
