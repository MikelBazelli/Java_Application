/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mpaze
 */
public class Help extends javax.swing.JFrame {


    public Help() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        home = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        title = new javax.swing.JMenu();

        jPanel1.setBackground(new java.awt.Color(0, 255, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 800));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1190, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 784, Short.MAX_VALUE)
        );

        setTitle("HELP");
        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(1034, 894));
        setMinimumSize(new java.awt.Dimension(1034, 894));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel7.setFont(new java.awt.Font("Verdana Pro", 0, 36)); // NOI18N
        jLabel7.setText("Call the IT SUPPORT CENTER at  2810 245215");

        jLabel9.setFont(new java.awt.Font("Verdana Pro", 1, 36)); // NOI18N
        jLabel9.setText("skycode@company.com");

        jLabel8.setFont(new java.awt.Font("Verdana Pro", 0, 36)); // NOI18N
        jLabel8.setText("For any issues with your application send email to");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel8)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jLabel8)
                .addGap(57, 57, 57)
                .addComponent(jLabel9)
                .addGap(55, 55, 55)
                .addComponent(jLabel7)
                .addContainerGap(395, Short.MAX_VALUE))
        );

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

        menuBar.add(menu);

        jMenu1.setText("                                                                                                    ");
        jMenu1.setEnabled(false);
        menuBar.add(jMenu1);

        title.setText("SKY CODE");
        title.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 48)); // NOI18N
        menuBar.add(title);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed

        UserHomePage userhomepage = new UserHomePage();

        userhomepage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeActionPerformed

   
    public static void main(String args[]) {
   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Help().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem home;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu title;
    // End of variables declaration//GEN-END:variables
}
