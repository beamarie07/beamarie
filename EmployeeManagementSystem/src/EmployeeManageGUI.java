
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class EmployeeManageGUI extends javax.swing.JFrame {

    
    public EmployeeManageGUI() {
        initComponents();
    }




 private void refreshTable() {
    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "Frozenflower90")) {
        String sql = "SELECT * FROM employees";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        populateTable(rs);
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}

 private void populateTable(ResultSet rs) {
    try {
        DefaultTableModel model = (DefaultTableModel) employeeTable.getModel();
        model.setRowCount(0); // Clear the table
        while (rs.next()) {
            model.addRow(new Object[] {
                rs.getInt("id"),
                rs.getString("name"),
                rs.getString("position"),
                rs.getString("department"),
                rs.getDouble("salary"),
                rs.getString("email"),
                rs.getString("phone"),
                rs.getString("hire_date")
            });
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        salaryField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        positionField = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();
        deptField = new javax.swing.JTextField();
        hiredateField = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnShowAll = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        employeeTable.setBackground(new java.awt.Color(0, 255, 255));
        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Position", "Department", "Salary", "Email", "Phone Number", "Hire Date"
            }
        ));
        jScrollPane1.setViewportView(employeeTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 85, 988, 232));

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 333, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Salary");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 367, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 333, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 367, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Position");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 333, 50, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Phone Number");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 367, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Department");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 333, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Hire Date");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(721, 367, -1, -1));

        idField.setBackground(new java.awt.Color(0, 255, 255));
        getContentPane().add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 330, 90, -1));

        salaryField.setBackground(new java.awt.Color(0, 255, 255));
        getContentPane().add(salaryField, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 364, 90, -1));

        nameField.setBackground(new java.awt.Color(0, 255, 255));
        getContentPane().add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 330, 100, -1));

        emailField.setBackground(new java.awt.Color(0, 255, 255));
        getContentPane().add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 364, 100, -1));

        positionField.setBackground(new java.awt.Color(0, 255, 255));
        getContentPane().add(positionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 330, 100, -1));

        phoneField.setBackground(new java.awt.Color(0, 255, 255));
        getContentPane().add(phoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 364, 100, -1));

        deptField.setBackground(new java.awt.Color(0, 255, 255));
        getContentPane().add(deptField, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 330, 100, -1));

        hiredateField.setBackground(new java.awt.Color(0, 255, 255));
        getContentPane().add(hiredateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 364, 100, -1));

        btnAdd.setBackground(new java.awt.Color(51, 153, 255));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 409, 90, -1));

        btnDelete.setBackground(new java.awt.Color(0, 153, 255));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 409, 85, -1));

        btnUpdate.setBackground(new java.awt.Color(0, 153, 255));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 409, 85, -1));

        btnSearch.setBackground(new java.awt.Color(0, 153, 255));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 467, 90, -1));

        btnShowAll.setBackground(new java.awt.Color(0, 153, 255));
        btnShowAll.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnShowAll.setText("Show All");
        btnShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAllActionPerformed(evt);
            }
        });
        getContentPane().add(btnShowAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 467, 90, -1));

        btnRefresh.setBackground(new java.awt.Color(0, 153, 255));
        btnRefresh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        getContentPane().add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 467, 85, -1));

        searchField.setBackground(new java.awt.Color(0, 255, 255));
        getContentPane().add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 467, 100, -1));

        btnClear.setBackground(new java.awt.Color(0, 153, 255));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 409, 90, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 255, 255));
        jLabel9.setText("Employee Management System");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 25, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pngtree-quarantine-office-people-employee-manager-png-image_5913171.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 323, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
    String name = nameField.getText();
    String position = positionField.getText();
    String department = deptField.getText();
    double salary = Double.parseDouble(salaryField.getText());
    String email = emailField.getText();
    String phone = phoneField.getText();
    String hiredate = hiredateField.getText();

    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "Frozenflower90")) {
        String sql = "INSERT INTO employees (name, position, department, salary, email, phone, hire_date) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, name);
        pstmt.setString(2, position);
        pstmt.setString(3, department);
        pstmt.setDouble(4, salary);
        pstmt.setString(5, email);
        pstmt.setString(6, phone);
        pstmt.setString(7, hiredate);
        pstmt.executeUpdate();
        JOptionPane.showMessageDialog(this, "Employee Added Successfully!");
        refreshTable();
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (idField.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter an ID to delete!");
        return;
    }

    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "Frozenflower90");

        String sql = "DELETE FROM employees WHERE id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setInt(1, Integer.parseInt(idField.getText()));
        int rowsAffected = pstmt.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Record deleted successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "No record found with the given ID.");
        }

        conn.close();
    } catch (SQLException | NumberFormatException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
    }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
          if (idField.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter an ID to update!");
        return;
    }

    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "Frozenflower90");

        String sql = "UPDATE employees SET name = ?, position = ?, department = ?, salary =?, email=?, phone=?, hire_date=? WHERE id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setString(1, nameField.getText());
        pstmt.setString(2, positionField.getText());
        pstmt.setString(3, deptField.getText());
        pstmt.setDouble(4, Double.parseDouble(salaryField.getText()));
        pstmt.setString(5, emailField.getText());
        pstmt.setString(6, phoneField.getText());
        pstmt.setString(7, hiredateField.getText());
        pstmt.setInt(8, Integer.parseInt(idField.getText()));

        int rowsAffected = pstmt.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Record updated successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "No record found with the given ID.");
        }

        conn.close();
    } catch (SQLException | NumberFormatException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
    }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
             if (idField.getText().isEmpty() && searchField.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter either an ID or a Name to search!");
        return;
    }

    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "Frozenflower90");
        String sql;
        PreparedStatement pstmt;

        if (!idField.getText().isEmpty()) {
            // Search by ID
            sql = "SELECT * FROM employees WHERE id=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, Integer.parseInt(idField.getText()));
        } else {
            // Search by Name
            sql = "SELECT * FROM employees WHERE name LIKE ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "%" + searchField.getText() + "%");
        }

        ResultSet rs = pstmt.executeQuery();

        // Update JTable
        DefaultTableModel model = (DefaultTableModel) employeeTable.getModel();
        model.setRowCount(0); // Clear existing rows

        boolean recordFound = false;
        while (rs.next()) {
            recordFound = true;

            // Add the record to the JTable
            model.addRow(new Object[]{
                rs.getInt("id"),
                rs.getString("name"),
                rs.getString("position"),
                rs.getString("department"),
                rs.getDouble("salary"),
                rs.getString("email"),
                rs.getString("phone"),
                rs.getString("hire_date")
            });
        }

        if (!recordFound) {
            JOptionPane.showMessageDialog(this, "No record found with the given ID or Name.");
        }

        conn.close();
    } catch (SQLException | NumberFormatException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
    }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllActionPerformed
         try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "Frozenflower90")) {
        String sql = "SELECT * FROM employees";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        populateTable(rs);
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    }//GEN-LAST:event_btnShowAllActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        refreshTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // Clear all JTextFields
    idField.setText("");
    nameField.setText("");
    positionField.setText("");
    deptField.setText("");
    salaryField.setText("");
    emailField.setText("");
    phoneField.setText("");
    hiredateField.setText("");
    searchField.setText("");

    // Optionally clear the JTable
    DefaultTableModel model = (DefaultTableModel) employeeTable.getModel();
    model.setRowCount(0);

    JOptionPane.showMessageDialog(this, "All fields and table have been cleared!");
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeManageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeManageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeManageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeManageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeManageGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnShowAll;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField deptField;
    private javax.swing.JTextField emailField;
    private javax.swing.JTable employeeTable;
    private javax.swing.JTextField hiredateField;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField phoneField;
    private javax.swing.JTextField positionField;
    private javax.swing.JTextField salaryField;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables
}
