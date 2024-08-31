
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Base64;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mpaze
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        fname = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        register = new javax.swing.JButton();
        messageText1 = new javax.swing.JLabel();
        lnamefield = new javax.swing.JTextField();
        address = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        salary = new javax.swing.JLabel();
        department = new javax.swing.JLabel();
        emailfield = new javax.swing.JTextField();
        addressfield = new javax.swing.JTextField();
        salaryfield = new javax.swing.JTextField();
        namefield = new javax.swing.JTextField();
        departmentfield = new javax.swing.JTextField();
        phonefield = new javax.swing.JTextField();
        passworedfield = new javax.swing.JPasswordField();
        menuBar2 = new javax.swing.JMenuBar();
        menu2 = new javax.swing.JMenu();
        home1 = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        employees2 = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        upload_tasks2 = new javax.swing.JMenuItem();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        manage_tasks2 = new javax.swing.JMenuItem();
        jSeparator15 = new javax.swing.JPopupMenu.Separator();
        register_workers2 = new javax.swing.JMenuItem();
        jSeparator16 = new javax.swing.JPopupMenu.Separator();
        help2 = new javax.swing.JMenuItem();
        jSeparator17 = new javax.swing.JPopupMenu.Separator();
        logout2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        title2 = new javax.swing.JMenu();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTER");
        setPreferredSize(new java.awt.Dimension(1143, 950));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(221, 221, 221));

        jLabel6.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 36)); // NOI18N
        jLabel6.setText("Register");

        fname.setFont(new java.awt.Font("Verdana Pro", 0, 24)); // NOI18N
        fname.setText("First Name");

        lname.setFont(new java.awt.Font("Verdana Pro", 0, 24)); // NOI18N
        lname.setText("Last Name");

        email.setFont(new java.awt.Font("Verdana Pro", 0, 24)); // NOI18N
        email.setText("Email");

        phone.setFont(new java.awt.Font("Verdana Pro", 0, 24)); // NOI18N
        phone.setText("Phone Number");

        register.setFont(new java.awt.Font("Verdana Pro", 0, 24)); // NOI18N
        register.setText("Register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        messageText1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N

        lnamefield.setFont(new java.awt.Font("Verdana Pro", 0, 24)); // NOI18N
        lnamefield.setToolTipText("Task Name");
        lnamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnamefieldActionPerformed(evt);
            }
        });

        address.setFont(new java.awt.Font("Verdana Pro", 0, 24)); // NOI18N
        address.setText("Address");

        password.setFont(new java.awt.Font("Verdana Pro", 0, 24)); // NOI18N
        password.setText("Password");

        salary.setFont(new java.awt.Font("Verdana Pro", 0, 24)); // NOI18N
        salary.setText("Salary");

        department.setFont(new java.awt.Font("Verdana Pro", 0, 24)); // NOI18N
        department.setText("Department");

        emailfield.setFont(new java.awt.Font("Verdana Pro", 0, 24)); // NOI18N
        emailfield.setToolTipText("Task Name");
        emailfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailfieldActionPerformed(evt);
            }
        });

        addressfield.setFont(new java.awt.Font("Verdana Pro", 0, 24)); // NOI18N
        addressfield.setToolTipText("Task Name");
        addressfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressfieldActionPerformed(evt);
            }
        });

        salaryfield.setFont(new java.awt.Font("Verdana Pro", 0, 24)); // NOI18N
        salaryfield.setToolTipText("Task Name");
        salaryfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryfieldActionPerformed(evt);
            }
        });

        namefield.setFont(new java.awt.Font("Verdana Pro", 0, 24)); // NOI18N
        namefield.setToolTipText("Task Name");
        namefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namefieldActionPerformed(evt);
            }
        });

        departmentfield.setFont(new java.awt.Font("Verdana Pro", 0, 24)); // NOI18N
        departmentfield.setToolTipText("Task Name");
        departmentfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentfieldActionPerformed(evt);
            }
        });

        phonefield.setFont(new java.awt.Font("Verdana Pro", 0, 24)); // NOI18N
        phonefield.setToolTipText("Task Name");
        phonefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonefieldActionPerformed(evt);
            }
        });

        passworedfield.setFont(new java.awt.Font("Verdana Pro", 0, 24)); // NOI18N
        passworedfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passworedfieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(emailfield, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressfield, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namefield, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phonefield, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salaryfield, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(departmentfield, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lname)
                    .addComponent(fname)
                    .addComponent(email)
                    .addComponent(address)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(department)
                            .addGap(345, 345, 345))
                        .addComponent(salary, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(phone, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(password)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(passworedfield, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(332, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(456, 456, 456))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(messageText1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(302, 302, 302))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(456, 456, 456))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fname)
                    .addComponent(namefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lname)
                    .addComponent(lnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(emailfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passworedfield, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(address))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(addressfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(phone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(phonefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salary)
                    .addComponent(salaryfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(department)
                    .addComponent(departmentfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(messageText1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );

        menuBar2.setForeground(new java.awt.Color(245, 219, 165));
        menuBar2.setToolTipText("");
        menuBar2.setFont(new java.awt.Font("Verdana Pro Cond Black", 0, 20)); // NOI18N
        menuBar2.setPreferredSize(new java.awt.Dimension(65, 50));

        menu2.setText(" MENU");
        menu2.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 26)); // NOI18N

        home1.setFont(new java.awt.Font("Verdana Pro", 0, 16)); // NOI18N
        home1.setText("HOME");
        home1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home1ActionPerformed(evt);
            }
        });
        menu2.add(home1);
        menu2.add(jSeparator12);

        employees2.setFont(new java.awt.Font("Verdana Pro", 0, 16)); // NOI18N
        employees2.setText("EMPLOYEES");
        employees2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employees2ActionPerformed(evt);
            }
        });
        menu2.add(employees2);
        menu2.add(jSeparator13);

        upload_tasks2.setFont(new java.awt.Font("Verdana Pro", 0, 16)); // NOI18N
        upload_tasks2.setText("UPLOAD TASKS");
        upload_tasks2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upload_tasks2ActionPerformed(evt);
            }
        });
        menu2.add(upload_tasks2);
        menu2.add(jSeparator14);

        manage_tasks2.setFont(new java.awt.Font("Verdana Pro", 0, 16)); // NOI18N
        manage_tasks2.setText("MANAGE TASKS");
        manage_tasks2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manage_tasks2ActionPerformed(evt);
            }
        });
        menu2.add(manage_tasks2);
        menu2.add(jSeparator15);

        register_workers2.setFont(new java.awt.Font("Verdana Pro", 0, 16)); // NOI18N
        register_workers2.setText("REGISTER WORKERS");
        register_workers2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_workers2ActionPerformed(evt);
            }
        });
        menu2.add(register_workers2);
        menu2.add(jSeparator16);

        help2.setFont(new java.awt.Font("Verdana Pro", 0, 16)); // NOI18N
        help2.setText("HELP");
        help2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                help2ActionPerformed(evt);
            }
        });
        menu2.add(help2);
        menu2.add(jSeparator17);

        logout2.setFont(new java.awt.Font("Verdana Pro", 0, 16)); // NOI18N
        logout2.setText("LOGOUT");
        logout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout2ActionPerformed(evt);
            }
        });
        menu2.add(logout2);

        menuBar2.add(menu2);

        jMenu3.setText("                                                                                                                               ");
        jMenu3.setEnabled(false);
        menuBar2.add(jMenu3);

        title2.setText("SKY CODE");
        title2.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 48)); // NOI18N
        menuBar2.add(title2);

        setJMenuBar(menuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 // Hashing pw method
 private static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedPassword = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hashedPassword) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    } 
   

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed

        String firstName = namefield.getText();
        String lastName = lnamefield.getText();
        String email = emailfield.getText();
        String password = new String(passworedfield.getPassword());
        String address = addressfield.getText();
        String phone = phonefield.getText();
        String salary = salaryfield.getText();
        String department = departmentfield.getText();

        // Validation
        if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || password.isEmpty() ||
            address.isEmpty() || phone.isEmpty() || salary.isEmpty() || department.isEmpty()) {
            messageText1.setText("Please fill out all fields.");
            return;
        }
        // Hashing
        String hashedPassword = hashPassword(password);
        if (hashedPassword == null) {
            messageText1.setText("Password hashing failed.");
            return;
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DatabaseHelper.connect();
            String sql = "INSERT INTO register (name, lastname, email, password, address, phone_num, salary, department) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, hashedPassword);
            preparedStatement.setString(5, address);
            preparedStatement.setString(6, phone);
            preparedStatement.setString(7, salary);
            preparedStatement.setString(8, department);

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                messageText1.setText("Registration successful!");
            } else {
                messageText1.setText("Failed to register.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            messageText1.setText("Error: " + e.getMessage());
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }//GEN-LAST:event_registerActionPerformed

    
    private void lnamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnamefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnamefieldActionPerformed

    private void home1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home1ActionPerformed
        AdminHomePage adminhomepage = new AdminHomePage();

        adminhomepage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_home1ActionPerformed

    private void employees2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employees2ActionPerformed
        Employees empolyees = new Employees();

        empolyees.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_employees2ActionPerformed

    private void upload_tasks2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upload_tasks2ActionPerformed
       UploadTasks uploadtasks = new UploadTasks();

        this.setVisible(false);
        uploadtasks.setVisible(true);
    }//GEN-LAST:event_upload_tasks2ActionPerformed

    private void manage_tasks2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manage_tasks2ActionPerformed

        ManageTasks managetasks = new ManageTasks();

        managetasks.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_manage_tasks2ActionPerformed

    private void register_workers2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_workers2ActionPerformed
        Register register = new Register();
        
        this.dispose();
        register.setVisible(true); 
    }//GEN-LAST:event_register_workers2ActionPerformed

    private void help2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_help2ActionPerformed
        HelpAdmin helpadmin = new HelpAdmin();
        
        helpadmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_help2ActionPerformed

    private void logout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout2ActionPerformed
        Main main = new Main();

        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logout2ActionPerformed

    private void emailfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailfieldActionPerformed

    private void addressfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressfieldActionPerformed

    private void salaryfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salaryfieldActionPerformed

    private void namefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namefieldActionPerformed

    private void departmentfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departmentfieldActionPerformed

    private void phonefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonefieldActionPerformed

    private void passworedfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passworedfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passworedfieldActionPerformed

    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JTextField addressfield;
    private javax.swing.JLabel department;
    private javax.swing.JTextField departmentfield;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailfield;
    private javax.swing.JMenuItem employees2;
    private javax.swing.JLabel fname;
    private javax.swing.JMenuItem help2;
    private javax.swing.JMenuItem home1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator15;
    private javax.swing.JPopupMenu.Separator jSeparator16;
    private javax.swing.JPopupMenu.Separator jSeparator17;
    private javax.swing.JLabel lname;
    private javax.swing.JTextField lnamefield;
    private javax.swing.JMenuItem logout2;
    private javax.swing.JMenuItem manage_tasks2;
    private javax.swing.JMenu menu2;
    private javax.swing.JMenuBar menuBar2;
    private javax.swing.JLabel messageText1;
    private javax.swing.JTextField namefield;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passworedfield;
    private javax.swing.JLabel phone;
    private javax.swing.JTextField phonefield;
    private javax.swing.JButton register;
    private javax.swing.JMenuItem register_workers2;
    private javax.swing.JLabel salary;
    private javax.swing.JTextField salaryfield;
    private javax.swing.JMenu title2;
    private javax.swing.JMenuItem upload_tasks2;
    // End of variables declaration//GEN-END:variables
}
