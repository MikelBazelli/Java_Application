
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.Alert;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Tasks extends javax.swing.JFrame {

 
    public Tasks() {
        
    initComponents();
    populateComboBox();        
    addTaskDetailsToScrollPane(jScrollPane2);

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        chooseFileButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        tasks = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        contact = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        logout = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        title = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TASKS");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(238, 238, 238));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 900));

        jPanel3.setBackground(new java.awt.Color(219, 239, 239));

        chooseFileButton.setText("Choose File");
        chooseFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseFileButtonActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(219, 239, 239));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(chooseFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chooseFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(204, 204, 204))
        );

        jLabel1.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 36)); // NOI18N
        jLabel1.setText("TASKS - PROJECTS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(535, 535, 535)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        menuBar.setForeground(new java.awt.Color(245, 219, 165));
        menuBar.setToolTipText("");
        menuBar.setFont(new java.awt.Font("Verdana Pro Cond Black", 0, 20)); // NOI18N
        menuBar.setPreferredSize(new java.awt.Dimension(65, 50));

        menu.setText(" MENU");
        menu.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 26)); // NOI18N

        tasks.setFont(new java.awt.Font("Verdana Pro", 0, 16)); // NOI18N
        tasks.setText("TASKS");
        menu.add(tasks);
        menu.add(jSeparator1);

        contact.setFont(new java.awt.Font("Verdana Pro", 0, 16)); // NOI18N
        contact.setText("CONTACT");
        menu.add(contact);
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

        jMenu1.setText("                                                                                                                                                      ");
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed

        Main main = new Main();

        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    
        private String selectedTaskName;
    
    private void populateComboBox() {
    try (Connection conn = DatabaseHelper.connect()) {
        String sql = "SELECT DISTINCT taskname FROM tasks";
        try (PreparedStatement statement = conn.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                jComboBox1.addItem(resultSet.getString("taskname"));
            }
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}
    
    
    private void chooseFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseFileButtonActionPerformed

     JFileChooser fileChooser = new JFileChooser();

    // File filter to accept certain file types
    FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "Supported Files (*.docx, *.pdf, *.txt, *.xlsx)", "docx", "pdf", "txt", "xlsx");
    fileChooser.setFileFilter(filter);

    // Showing the open dialog and capture the selected file
    int returnValue = fileChooser.showOpenDialog(null);

    if (returnValue == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        String filePath = selectedFile.getAbsolutePath();

        // Displayimg selected file path
        System.out.println("Selected file: " + filePath);
        
        if (selectedTaskName != null && !selectedTaskName.trim().isEmpty()) {
            // Updateimg the file path in the database
            updateFilePath(filePath, selectedTaskName);
        } else {
            JOptionPane.showMessageDialog(this, "No task selected. Please select a task first.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_chooseFileButtonActionPerformed

    
    private void updateFilePath(String filePath, String taskName) {
    try (Connection conn = DatabaseHelper.connect()) {
        String sql = "UPDATE tasks SET file_path = ? WHERE TRIM(taskname) = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, filePath);
            statement.setString(2, taskName.trim());
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "File path updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Failed to update file path. No rows affected.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Failed to update file path. Exception: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }
}

    

    
    
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
   
        selectedTaskName = (String) jComboBox1.getSelectedItem();

        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    
    

        private ResultSet getTaskDetails() {
        try {
            Connection conn = DatabaseHelper.connect();
            String sql = "SELECT tasks.*, register.name FROM tasks JOIN register ON tasks.user_id = register.id";
            PreparedStatement statement = conn.prepareStatement(sql);
            return statement.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

            // Method to add task details to JScrollPane
            private void addTaskDetailsToScrollPane(JScrollPane scrollPane) {
                
                JPanel panel = new JPanel();
                panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
                Font customFont = new Font("Verdana pro", Font.PLAIN, 18);

                try {
                    ResultSet resultSet = getTaskDetails();
                    if (resultSet != null) {
                        while (resultSet.next()) {
                            String taskName = resultSet.getString("taskname");
                            String taskDescription = resultSet.getString("task_description");
                            String userName = resultSet.getString("name");
                            String deadline = resultSet.getString("deadline_date");

                            // Create JPanel for each task detail
                            JPanel taskPanel = new JPanel();
                            taskPanel.setLayout(new BoxLayout(taskPanel, BoxLayout.Y_AXIS));
                            taskPanel.setBackground(Color.WHITE);
                            taskPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

                            // Create labels for task details and set the custom font
                            JLabel taskLabel = new JLabel("Task: " + taskName);
                            taskLabel.setFont(customFont);

                            JLabel descriptionLabel = new JLabel("Description: " + taskDescription);
                            descriptionLabel.setFont(customFont);

                            JLabel userLabel = new JLabel("Assigned to: " + userName);
                            userLabel.setFont(customFont);

                            JLabel deadlineLabel = new JLabel("Deadline: " + deadline);
                            deadlineLabel.setFont(customFont);

                            // Adding labels to task JPanel
                            taskPanel.add(taskLabel);
                            taskPanel.add(descriptionLabel);
                            taskPanel.add(userLabel);
                            taskPanel.add(deadlineLabel);

                            // Adding task JPanel to the main panel
                            panel.add(taskPanel);

                            // Small gap after each taskPanel
                            panel.add(Box.createRigidArea(new Dimension(0, 10))); // 10 pixels vertical gap
                        }
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

                panel.setBackground(Color.WHITE);

                scrollPane.setViewportView(panel);
            }



    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
            

      
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Tasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tasks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chooseFileButton;
    private javax.swing.JMenuItem contact;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem logout;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem tasks;
    private javax.swing.JMenu title;
    // End of variables declaration//GEN-END:variables
}
