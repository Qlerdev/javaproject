package login.page;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

/**
 *
 * @author Punnakan Punsiri
 */
public class login extends javax.swing.JFrame {

    private sound musicObject;

    /**
     * Creates new form login
     */
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    public login() {
        initComponents();
        setIconImage();//icon
        times();//time
        dt();//date
        con = db.mycon();
    }

//year month day 
    public void dt() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd  MM  yyyy");

        String dd = sdf.format(d);
        l_date.setText(dd);
    }
//time        
    Timer t;
    SimpleDateFormat st;

    public void times() {

        t = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

                Date dt = new Date();
                st = new SimpleDateFormat("hh  mm  ss  a");

                String tt = st.format(dt);
                l_time.setText(tt);
            }
        });

        t.start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        jusername = new javax.swing.JTextField();
        jpassword = new javax.swing.JPasswordField();
        l_date = new javax.swing.JLabel();
        l_time = new javax.swing.JLabel();
        Log_In = new javax.swing.JButton();
        Sign_up = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(168, 218, 220));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 30));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("ArcadeClassic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" LOGIN ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(330, 80, 170, 60);

        username.setFont(new java.awt.Font("ArcadeClassic", 1, 14)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/page/user (1) (1).png"))); // NOI18N
        username.setText("Username");
        jPanel1.add(username);
        username.setBounds(170, 160, 103, 30);

        Password.setFont(new java.awt.Font("ArcadeClassic", 1, 14)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/page/padlock (1).png"))); // NOI18N
        Password.setText("Password ");
        jPanel1.add(Password);
        Password.setBounds(170, 220, 104, 30);

        jusername.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jusername.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jusernameActionPerformed(evt);
            }
        });
        jPanel1.add(jusername);
        jusername.setBounds(290, 160, 261, 26);

        jpassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jpassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jpassword);
        jpassword.setBounds(290, 220, 261, 26);

        l_date.setFont(new java.awt.Font("ArcadeClassic", 1, 18)); // NOI18N
        l_date.setForeground(new java.awt.Color(0, 0, 0));
        l_date.setText("0");
        jPanel1.add(l_date);
        l_date.setBounds(120, 50, 100, 20);

        l_time.setFont(new java.awt.Font("ArcadeClassic", 1, 18)); // NOI18N
        l_time.setForeground(new java.awt.Color(0, 0, 0));
        l_time.setText("0");
        jPanel1.add(l_time);
        l_time.setBounds(120, 70, 110, 20);

        Log_In.setBackground(new java.awt.Color(189, 224, 254));
        Log_In.setFont(new java.awt.Font("ArcadeClassic", 0, 11)); // NOI18N
        Log_In.setForeground(new java.awt.Color(0, 0, 0));
        Log_In.setText("Log in");
        Log_In.setBorder(null);
        Log_In.setBorderPainted(false);
        Log_In.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Log_In.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Log_InActionPerformed(evt);
            }
        });
        jPanel1.add(Log_In);
        Log_In.setBounds(350, 310, 90, 30);

        Sign_up.setBackground(new java.awt.Color(189, 224, 254));
        Sign_up.setFont(new java.awt.Font("ArcadeClassic", 0, 11)); // NOI18N
        Sign_up.setForeground(new java.awt.Color(0, 0, 0));
        Sign_up.setText("EXIT");
        Sign_up.setBorder(null);
        Sign_up.setBorderPainted(false);
        Sign_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sign_upActionPerformed(evt);
            }
        });
        jPanel1.add(Sign_up);
        Sign_up.setBounds(470, 310, 100, 30);

        jButton4.setBackground(new java.awt.Color(168, 218, 220));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/page/speaker-filled-audio-tool (2).png"))); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(49, 52, 60, 30);

        jButton1.setBackground(new java.awt.Color(189, 224, 254));
        jButton1.setFont(new java.awt.Font("ArcadeClassic", 0, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Register");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(220, 310, 90, 30);

        jCheckBox1.setFont(new java.awt.Font("ArcadeClassic", 0, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Show   Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(330, 270, 127, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/page/745cc90fcc688569610f84bc5d2b2fd6.gif"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 20, 780, 400);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jusernameActionPerformed
    //vol on and off button.
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String filepath = "pixel.wav";//pixel sound
        //check if musicobject is null 
        if (musicObject == null) {
            musicObject = new sound(); //if null musicobject create object sound from class sound
            musicObject.playMusic(filepath);//musicobject using playmusic method from sound and sending filepath to it.
            jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("volume-off.png"))); //show volume-off icon
        } else {
            musicObject.stopMusic();//musicbject using stopmusic method from sound to stop the music
            musicObject = null;//set musicobject to null
            jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("speaker-filled-audio-tool (2).png")));//show volume-on icon
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    //username and password alert. //login
    private void Log_InActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Log_InActionPerformed

        if (jusername.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill out username ");
        } else if (String.valueOf(jpassword.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill out password");
        } else {
            JOptionPane.showConfirmDialog(null, "Are you sure ? ");
        }
        String un = jusername.getText();
        String pw = jpassword.getText();
        
        try {
            String sql  = "SELECT * FROM userinfo WHERE username=? AND password=?";
            pst = con.prepareCall(sql);
            pst.setString(1, un); //username
            pst.setString(2, pw); //password
            
            rs = pst.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(rootPane, "Your are loging in...");
                
            } else {
                JOptionPane.showMessageDialog(rootPane, "Your login failed");
                
            }
        } catch (Exception e) {
            
        }
        

    }//GEN-LAST:event_Log_InActionPerformed
    //show password checkbox
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        //if showpassword is selected that mean show password
        if (jCheckBox1.isSelected()) {
            jpassword.setEchoChar((char) 0);
        } //replace all of the password to *
        else {
            jpassword.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed
    //exit from program
    private void Sign_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sign_upActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Sign_upActionPerformed
    //Register
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            this.setVisible(false);
            new RegisterForm().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("star1010.png")));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Log_In;
    private javax.swing.JLabel Password;
    private javax.swing.JButton Sign_up;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JTextField jusername;
    private javax.swing.JLabel l_date;
    private javax.swing.JLabel l_time;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
