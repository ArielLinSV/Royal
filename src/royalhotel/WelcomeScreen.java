
package royalhotel;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Frame;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 * @author Ariel L
 */
public class WelcomeScreen extends javax.swing.JFrame {
  
    public WelcomeScreen() {
        initComponents();
        this.setLocationRelativeTo(null); //center JFrame in display
        setIconImage(new ImageIcon(getClass().getResource("/imgs/RoyalHotelImajotipoMini.png")).getImage()); //Set icon
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGroundLogo = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        LoginButton = new javax.swing.JLabel();
        CreateAcountButton = new javax.swing.JLabel();
        ImajotipoIcon5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(350, 500));
        setMinimumSize(new java.awt.Dimension(350, 500));
        setResizable(false);

        BackGroundLogo.setBackground(new java.awt.Color(255, 255, 255));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/HotelLogo.png"))); // NOI18N

        LoginButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LoginButton.setText("Login");
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LoginButtonMousePressed(evt);
            }
        });

        CreateAcountButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CreateAcountButton.setText("Create acount");
        CreateAcountButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CreateAcountButtonMousePressed(evt);
            }
        });

        ImajotipoIcon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/RoyalHotelImajotipoMini.png"))); // NOI18N

        javax.swing.GroupLayout BackGroundLogoLayout = new javax.swing.GroupLayout(BackGroundLogo);
        BackGroundLogo.setLayout(BackGroundLogoLayout);
        BackGroundLogoLayout.setHorizontalGroup(
            BackGroundLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLogoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackGroundLogoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BackGroundLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackGroundLogoLayout.createSequentialGroup()
                        .addComponent(LoginButton)
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackGroundLogoLayout.createSequentialGroup()
                        .addComponent(CreateAcountButton)
                        .addGap(115, 115, 115))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackGroundLogoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ImajotipoIcon5)
                .addGap(159, 159, 159))
        );
        BackGroundLogoLayout.setVerticalGroup(
            BackGroundLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLogoLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LoginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CreateAcountButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(ImajotipoIcon5))
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

    private void LoginButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMousePressed
    for (Frame frame : Frame.getFrames()) {frame.dispose();} //close de last JFrame after select other window (Don´t leave JFrames Stack)
    JFrame loginScreen = new LoginScreen(); //Cration of a reference to change from the currenly JFrame to another JFrame (Man screen to login screen for example)
    loginScreen.setVisible(true);
        
    }//GEN-LAST:event_LoginButtonMousePressed

    private void CreateAcountButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateAcountButtonMousePressed
        for (Frame frame : Frame.getFrames()) {frame.dispose();}
        JFrame createacountscreen = new CreateAcountScreen();
        createacountscreen.setVisible(true);
    }//GEN-LAST:event_CreateAcountButtonMousePressed

    public static void main(String args[]) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGroundLogo;
    private javax.swing.JLabel CreateAcountButton;
    private javax.swing.JLabel ImajotipoIcon5;
    private javax.swing.JLabel LoginButton;
    private javax.swing.JLabel Logo;
    // End of variables declaration//GEN-END:variables
}
