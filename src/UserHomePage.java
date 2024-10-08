
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class UserHomePage extends javax.swing.JFrame {

   
    public UserHomePage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tasks = new javax.swing.JButton();
        contact = new javax.swing.JButton();
        calendar = new javax.swing.JLabel();
        background_img = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        home = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        tasks1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        contact1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        logout = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        title = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOME");
        setPreferredSize(new java.awt.Dimension(1400, 900));
        setResizable(false);
        getContentPane().setLayout(null);

        tasks.setBackground(new java.awt.Color(0, 0, 0));
        tasks.setFont(new java.awt.Font("Verdana Pro", 1, 22)); // NOI18N
        tasks.setForeground(new java.awt.Color(255, 255, 255));
        tasks.setText("TASKS - PROJECTS");
        tasks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tasksActionPerformed(evt);
            }
        });
        getContentPane().add(tasks);
        tasks.setBounds(90, 170, 270, 120);

        contact.setBackground(new java.awt.Color(0, 0, 0));
        contact.setFont(new java.awt.Font("Verdana Pro", 1, 22)); // NOI18N
        contact.setForeground(new java.awt.Color(255, 255, 255));
        contact.setText("HELP");
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        getContentPane().add(contact);
        contact.setBounds(90, 440, 270, 120);

        calendar.setBackground(new java.awt.Color(51, 51, 51));
        calendar.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 1, 24)); // NOI18N
        calendar.setForeground(new java.awt.Color(255, 255, 255));
        calendar.setText("   ");
        calendar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        calendar.setEnabled(false);
        calendar.setOpaque(true);
        getContentPane().add(calendar);
        calendar.setBounds(1040, 210, 240, 140);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        calendar.setText(LocalDateTime.now().format(formatter));

        calendar.setEnabled(true); // Temporarily enable the label to see if the color changes
        calendar.setForeground(new java.awt.Color(255, 255, 255)); // Set text color to white

        background_img.setBackground(new java.awt.Color(0, 0, 0));
        background_img.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        background_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img4.png"))); // NOI18N
        background_img.setText("jLabel1");
        background_img.setToolTipText("");
        getContentPane().add(background_img);
        background_img.setBounds(-110, -10, 1590, 840);

        menuBar.setForeground(new java.awt.Color(245, 219, 165));
        menuBar.setToolTipText("");
        menuBar.setFont(new java.awt.Font("Verdana Pro Cond Black", 0, 20)); // NOI18N
        menuBar.setPreferredSize(new java.awt.Dimension(65, 50));

        menu.setText(" MENU");
        menu.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 26)); // NOI18N

        home.setFont(new java.awt.Font("Verdana Pro", 0, 16)); // NOI18N
        home.setText("HOME");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        menu.add(home);
        menu.add(jSeparator3);

        tasks1.setFont(new java.awt.Font("Verdana Pro", 0, 16)); // NOI18N
        tasks1.setText("TASKS");
        tasks1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tasks1ActionPerformed(evt);
            }
        });
        menu.add(tasks1);
        menu.add(jSeparator1);

        contact1.setFont(new java.awt.Font("Verdana Pro", 0, 16)); // NOI18N
        contact1.setText("HELP");
        contact1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contact1ActionPerformed(evt);
            }
        });
        menu.add(contact1);
        menu.add(jSeparator2);

        logout.setFont(new java.awt.Font("Verdana Pro", 0, 16)); // NOI18N
        logout.setText("LOGOUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        menu.add(logout);

        menuBar.add(menu);

        jMenu1.setText("                                                                                                                                                                        ");
        jMenu1.setEnabled(false);
        menuBar.add(jMenu1);

        title.setText("SKY CODE");
        title.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 48)); // NOI18N
        menuBar.add(title);

        setJMenuBar(menuBar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        Help help = new Help();
        help.setVisible(true);
    }//GEN-LAST:event_contactActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed

        UserHomePage userhomepage = new UserHomePage();

        userhomepage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeActionPerformed

    private void contact1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contact1ActionPerformed
        Help help = new Help();
        help.setVisible(true);
    }//GEN-LAST:event_contact1ActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed

        Main main = new Main();

        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void tasks1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tasks1ActionPerformed
        Tasks tasks = new Tasks();

        this.setVisible(false);
        tasks.setVisible(true);
    }//GEN-LAST:event_tasks1ActionPerformed

    private void tasksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tasksActionPerformed

        Tasks tasks = new Tasks();

        this.setVisible(false);
        tasks.setVisible(true);
    }//GEN-LAST:event_tasksActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(UserHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background_img;
    private javax.swing.JLabel calendar;
    private javax.swing.JButton contact;
    private javax.swing.JMenuItem contact1;
    private javax.swing.JMenuItem home;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuItem logout;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton tasks;
    private javax.swing.JMenuItem tasks1;
    private javax.swing.JMenu title;
    // End of variables declaration//GEN-END:variables
}
