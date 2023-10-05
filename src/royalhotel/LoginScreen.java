package royalhotel;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Frame;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Ariel L
 */
public class LoginScreen extends javax.swing.JFrame {

    public LoginScreen() {

        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().
                getResource("/imgs/RoyalHotelImajotipoMini.png")).getImage());}
    
    public class EmailValidator {
        private static final Pattern EMAIL_PATTERN = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
        public static boolean isValidEmail(String email) {
            Matcher matcher = EMAIL_PATTERN.matcher(email);
            return matcher.matches();}}
    
    
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogoContainer = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Mail = new javax.swing.JLabel();
        PassWord = new javax.swing.JLabel();
        BackIcon = new javax.swing.JLabel();
        ImajotipoIcon = new javax.swing.JLabel();
        LoginButton = new javax.swing.JLabel();
        CheckBox = new javax.swing.JCheckBox();
        MailField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(350, 500));
        setResizable(false);

        LogoContainer.setBackground(new java.awt.Color(255, 255, 255));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/HotelLogo.png"))); // NOI18N

        Mail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Mail.setText("Mail");

        PassWord.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        PassWord.setText("Password");

        BackIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/BackIcon.png"))); // NOI18N
        BackIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BackIconMousePressed(evt);
            }
        });

        ImajotipoIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/RoyalHotelImajotipoMini.png"))); // NOI18N

        LoginButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LoginButton.setText("Login");
        LoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LoginButtonMousePressed(evt);
            }
        });

        CheckBox.setText("Show password");
        CheckBox.setBorder(new javax.swing.border.MatteBorder(null));
        CheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxActionPerformed(evt);
            }
        });

        MailField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        MailField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MailFieldActionPerformed(evt);
            }
        });

        PasswordField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        PasswordField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LogoContainerLayout = new javax.swing.GroupLayout(LogoContainer);
        LogoContainer.setLayout(LogoContainerLayout);
        LogoContainerLayout.setHorizontalGroup(
            LogoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogoContainerLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(Logo)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogoContainerLayout.createSequentialGroup()
                .addComponent(BackIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(LogoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LoginButton)
                    .addComponent(ImajotipoIcon))
                .addGap(159, 159, 159))
            .addGroup(LogoContainerLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(LogoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(CheckBox)
                    .addComponent(PassWord, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Mail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MailField)
                    .addComponent(PasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
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
                .addComponent(MailField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PassWord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBox)
                .addGap(54, 54, 54)
                .addComponent(LoginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(LogoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogoContainerLayout.createSequentialGroup()
                        .addComponent(BackIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(ImajotipoIcon, javax.swing.GroupLayout.Alignment.TRAILING)))
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

    private void LoginButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMousePressed
        String mail, code;
        mail = MailField.getText();
        code = PasswordField.getText();
        
            String email = MailField.getText();
        if (!EmailValidator.isValidEmail(email)) { 
            JOptionPane.showMessageDialog(this, "La dirección de correo electrónico no es válida.");}
        
        int estado = 0;
        if (mail.isEmpty() && code.isEmpty()) {
            estado = 1;
        } else if (mail == null || mail.isEmpty()) {
            estado = 2;
        } else if (code == null || code.isEmpty()) {
            estado = 3;
        }
            switch (estado) {
                case 1:
                    JOptionPane.showMessageDialog(this, "llena los campos para ingresar");
                    return;
                case 2:
                    JOptionPane.showMessageDialog(this, "No puedes ingresar sin tu correo");
                    return;
                case 3:
                    JOptionPane.showMessageDialog(this, "No puedes ingresar sin contraseña");
                    return;
                default:
                    break;}

        for (Frame frame : Frame.getFrames()) {frame.dispose();}
        JFrame createacountscreen = new royalhotel.UserInterface.UserFrame();
        createacountscreen.setVisible(true);   
    }//GEN-LAST:event_LoginButtonMousePressed

    private void CheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxActionPerformed
    if(CheckBox.isSelected()){PasswordField.setEchoChar((char)0);}
    else{PasswordField.setEchoChar('*');}
    }//GEN-LAST:event_CheckBoxActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed

    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void MailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MailFieldActionPerformed

    }//GEN-LAST:event_MailFieldActionPerformed

    public static void main(String args[]) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            new LoginScreen().setVisible(true);});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackIcon;
    private javax.swing.JCheckBox CheckBox;
    private javax.swing.JLabel ImajotipoIcon;
    private javax.swing.JLabel LoginButton;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel LogoContainer;
    private javax.swing.JLabel Mail;
    private javax.swing.JTextField MailField;
    private javax.swing.JLabel PassWord;
    private javax.swing.JPasswordField PasswordField;
    // End of variables declaration//GEN-END:variables
}
