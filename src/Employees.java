
import java.awt.*;
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author mpaze
 */
public class Employees extends javax.swing.JFrame {

    /**
     * Creates new form Employees
     */
    public Employees() {
        initComponents();
        addEmployeeDetailsToScrollPane(jScrollPane1);
        populateEmployeeComboBox();


    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        delete = new javax.swing.JButton();
        menuBar1 = new javax.swing.JMenuBar();
        menu1 = new javax.swing.JMenu();
        home = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        employees1 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        upload_tasks1 = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        manage_tasks1 = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        register_workers1 = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        help1 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        logout1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        title1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employees");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(219, 239, 239));

        jComboBox1.setFont(new java.awt.Font("Verdana Pro", 0, 18)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Verdana Pro", 0, 18)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuBar1.setForeground(new java.awt.Color(245, 219, 165));
        menuBar1.setToolTipText("");
        menuBar1.setFont(new java.awt.Font("Verdana Pro Cond Black", 0, 20)); // NOI18N
        menuBar1.setPreferredSize(new java.awt.Dimension(65, 50));

        menu1.setText(" MENU");
        menu1.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 26)); // NOI18N

        home.setFont(new java.awt.Font("Verdana Pro", 0, 16)); // NOI18N
        home.setText("HOME");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        menu1.add(home);
        menu1.add(jSeparator6);

        employees1.setFont(new java.awt.Font("Verdana Pro", 0, 16)); // NOI18N
        employees1.setText("EMPLOYEES");
        employees1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employees1ActionPerformed(evt);
            }
        });
        menu1.add(employees1);
        menu1.add(jSeparator7);

        upload_tasks1.setFont(new java.awt.Font("Verdana Pro", 0, 16)); // NOI18N
        upload_tasks1.setText("UPLOAD TASKS");
        upload_tasks1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upload_tasks1ActionPerformed(evt);
            }
        });
        menu1.add(upload_tasks1);
        menu1.add(jSeparator9);

        manage_tasks1.setFont(new java.awt.Font("Verdana Pro", 0, 16)); // NOI18N
        manage_tasks1.setText("MANAGE TASKS");
        manage_tasks1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manage_tasks1ActionPerformed(evt);
            }
        });
        menu1.add(manage_tasks1);
        menu1.add(jSeparator10);

        register_workers1.setFont(new java.awt.Font("Verdana Pro", 0, 16)); // NOI18N
        register_workers1.setText("REGISTER WORKERS");
        register_workers1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_workers1ActionPerformed(evt);
            }
        });
        menu1.add(register_workers1);
        menu1.add(jSeparator11);

        help1.setFont(new java.awt.Font("Verdana Pro", 0, 16)); // NOI18N
        help1.setText("HELP");
        help1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                help1ActionPerformed(evt);
            }
        });
        menu1.add(help1);
        menu1.add(jSeparator8);

        logout1.setFont(new java.awt.Font("Verdana Pro", 0, 16)); // NOI18N
        logout1.setText("LOGOUT");
        logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout1ActionPerformed(evt);
            }
        });
        menu1.add(logout1);

        menuBar1.add(menu1);

        jMenu2.setText("                                                                                                                                                                                                                                   ");
        jMenu2.setEnabled(false);
        menuBar1.add(jMenu2);

        title1.setText("SKY CODE");
        title1.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 48)); // NOI18N
        menuBar1.add(title1);

        setJMenuBar(menuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        AdminHomePage adminhomepage = new AdminHomePage();

        adminhomepage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeActionPerformed

    private void employees1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employees1ActionPerformed
        Employees empolyees = new Employees();

        empolyees.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_employees1ActionPerformed

    private void upload_tasks1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upload_tasks1ActionPerformed
         UploadTasks uploadtasks = new UploadTasks();
         
         this.setVisible(false);
         uploadtasks.setVisible(true);
    }//GEN-LAST:event_upload_tasks1ActionPerformed

    private void manage_tasks1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manage_tasks1ActionPerformed
        ManageTasks managetasks = new ManageTasks();
        
        this.setVisible(false);
        managetasks.setVisible(true);
    }//GEN-LAST:event_manage_tasks1ActionPerformed

    private void register_workers1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_workers1ActionPerformed
        Register register = new Register();
        
        this.setVisible(false);
        register.setVisible(true);
    }//GEN-LAST:event_register_workers1ActionPerformed

    private void help1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_help1ActionPerformed
        HelpAdmin helpadmin = new HelpAdmin();
        helpadmin.setVisible(true);
    }//GEN-LAST:event_help1ActionPerformed

    private void logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout1ActionPerformed
        Main main = new Main();

        main.setVisible(true);
        this.dispose();

        this.dispose();    }//GEN-LAST:event_logout1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

    deleteSelectedEmployee();
        
    }//GEN-LAST:event_deleteActionPerformed
   
   // Getting each employees info from the database 
    private ResultSet getEmployeeDetails() {
    try {
        Connection conn = DatabaseHelper.connect();
        String sql = "SELECT id, name, lastname, email, phone_num, address, salary, department FROM register";
        PreparedStatement statement = conn.prepareStatement(sql);
        return statement.executeQuery();
    } catch (SQLException ex) {
        ex.printStackTrace();
        return null;
    }
}

    // Method to add employee details to JScrollPane and customize it like a table
     private void addEmployeeDetailsToScrollPane(JScrollPane scrollPane) {
        ResultSet rs = getEmployeeDetails();
        JPanel panel = new JPanel(new GridLayout(0, 8, 10, 10));
        if (rs != null) {
            try {
                Font font = new Font("Arial", Font.PLAIN, 18);

                while (rs.next()) {
                    for (int i = 1; i <= 8; i++) {
                        JLabel label = new JLabel(rs.getString(i));
                        label.setFont(font); 
                        panel.add(label);
                    }
                }
                scrollPane.setViewportView(panel);
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Helper method to create custom header labels
    private JLabel createHeaderLabel(String text, Font font) {

        Font newFont = font.deriveFont(18f);    
        JLabel label = new JLabel(text);
        label.setFont(newFont);
        label.setForeground(Color.BLACK);
        return label;
}

    
    // Method to populate JComboBox with employee details
    private void populateEmployeeComboBox() {
        try (Connection conn = DatabaseHelper.connect()) {
            String sql = "SELECT id, name, lastname FROM register";
            try (PreparedStatement statement = conn.prepareStatement(sql);
                 ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    String lastName = resultSet.getString("lastname");

                    jComboBox1.addItem(id + " - " + name + " " + lastName);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }



    // Method to delete the selected employee from the database
    private void deleteSelectedEmployee() {
       String selectedItem = (String) jComboBox1.getSelectedItem();
       if (selectedItem != null) {
           String selectedId = selectedItem.split(" - ")[0];

           try {
               Connection conn = DatabaseHelper.connect();
               String sql = "DELETE FROM register WHERE id=?";
               PreparedStatement statement = conn.prepareStatement(sql);
               statement.setString(1, selectedId);
               int rowsDeleted = statement.executeUpdate();
               statement.close();

               if (rowsDeleted > 0) {
                   JOptionPane.showMessageDialog(this, "Employee deleted successfully!");
                   
                   // Refresh the combo box and the scroll pane
                   jComboBox1.removeItem(selectedItem);
                   addEmployeeDetailsToScrollPane(jScrollPane1);
               } else {
                   JOptionPane.showMessageDialog(this, "Error: Employee not found!");
               }
           } catch (SQLException e) {
               e.printStackTrace();
               JOptionPane.showMessageDialog(this, "Error deleting employee!");
           }
       } else {
           JOptionPane.showMessageDialog(this, "No employee selected!");
       }
   }

    
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
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JMenuItem employees1;
    private javax.swing.JMenuItem help1;
    private javax.swing.JMenuItem home;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JMenuItem logout1;
    private javax.swing.JMenuItem manage_tasks1;
    private javax.swing.JMenu menu1;
    private javax.swing.JMenuBar menuBar1;
    private javax.swing.JMenuItem register_workers1;
    private javax.swing.JMenu title1;
    private javax.swing.JMenuItem upload_tasks1;
    // End of variables declaration//GEN-END:variables
}
