package View.StaffViews;

import Controller.DeleteItemController;
import Controller.UpdateItemController;
import com.mysql.jdbc.PreparedStatement;
import Model.DBSearch;
import Model.DBSearchBar;
import Model.DBToTable;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class Staff extends javax.swing.JFrame {

    public Staff() {
        initComponents();
        tableLoad();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        mbSearchbox = new app.bolivia.swing.JCTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        addBtn = new rojerusan.RSMaterialButtonCircle();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        manageStaffsTable = new rojeru_san.complementos.RSTableMetro();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_sname = new app.bolivia.swing.JCTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txt_sage = new app.bolivia.swing.JCTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txt_scon = new app.bolivia.swing.JCTextField();
        updateBtn = new rojerusan.RSMaterialButtonCircle();
        deleteBtn = new rojerusan.RSMaterialButtonCircle();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lab_sid = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        CMB_posi = new javax.swing.JComboBox<>();
        resetBtn = new rojerusan.RSMaterialButtonCircle();
        exitBtn = new rojerusan.RSMaterialButtonCircle();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1275, 550));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(980, 170));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(0, 0, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 7, new java.awt.Color(255, 0, 0)));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/adminIcons/icons8_menu_48px_1.png"))); // NOI18N
        jLabel2.setText("Horizon Library Management System");
        jPanel11.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 40));

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 40));

        jPanel10.setBackground(new java.awt.Color(255, 0, 0));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true), "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mbSearchbox.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        mbSearchbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mbSearchboxKeyReleased(evt);
            }
        });
        jPanel10.add(mbSearchbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 260, -1));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 280, 80));

        jPanel12.setBackground(new java.awt.Color(255, 0, 0));
        jPanel12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 15, 0, new java.awt.Color(0, 0, 255)));

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Manage Staff");
        jPanel12.add(jLabel3);

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 300, 60));

        addBtn.setBackground(new java.awt.Color(0, 0, 255));
        addBtn.setText("ADD NEW Staff");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, 192, 63));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 140));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageStaffsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Staff ID", "Name", "Age", "Contact", "Position"
            }
        ));
        manageStaffsTable.setColorBackgoundHead(new java.awt.Color(0, 0, 255));
        manageStaffsTable.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        manageStaffsTable.setColorSelBackgound(new java.awt.Color(255, 0, 0));
        manageStaffsTable.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        manageStaffsTable.setFuenteFilas(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        manageStaffsTable.setFuenteFilasSelect(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        manageStaffsTable.setFuenteHead(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        manageStaffsTable.setRowHeight(40);
        manageStaffsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageStaffsTableMouseClicked(evt);
            }
        });
        manageStaffsTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                manageStaffsTableKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                manageStaffsTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(manageStaffsTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 910, 390));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 930, 410));

        jPanel3.setBackground(new java.awt.Color(0, 0, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bodoni MT Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Details");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel5.setText("Name : ");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txt_sname.setToolTipText("Enter name");
        txt_sname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel5.add(txt_sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 230, 40));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 310, 40));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel6.setText("Age :");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txt_sage.setToolTipText("Enter age");
        txt_sage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel6.add(txt_sage, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 230, 40));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 310, 40));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel7.setText("Contact no : ");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        txt_scon.setToolTipText("Enter phone number");
        txt_scon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel7.add(txt_scon, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 230, 40));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 310, 40));

        updateBtn.setBackground(new java.awt.Color(255, 0, 0));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel3.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 160, 70));

        deleteBtn.setBackground(new java.awt.Color(255, 0, 0));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel3.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 160, 70));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel8.setText("Staff ID :");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lab_sid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel8.add(lab_sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 90, 40));

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 310, 40));

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel9.setText("Position : ");
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        CMB_posi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CMB_posi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Assistant Librarian", "Officer", "Librarrian" }));
        jPanel9.add(CMB_posi, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 230, 40));

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 310, 40));

        resetBtn.setBackground(new java.awt.Color(255, 0, 0));
        resetBtn.setText("R");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        jPanel3.add(resetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        exitBtn.setBackground(new java.awt.Color(255, 0, 0));
        exitBtn.setText("X");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        jPanel3.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 40, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 350, 550));

        setSize(new java.awt.Dimension(1275, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void manageStaffsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageStaffsTableMouseClicked
        tabledataMS();
    }//GEN-LAST:event_manageStaffsTableMouseClicked

    private void manageStaffsTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_manageStaffsTableKeyReleased
        tabledataMS();
    }//GEN-LAST:event_manageStaffsTableKeyReleased

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        clearfields();
        tableLoad();
    }//GEN-LAST:event_resetBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed
        
    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        String pos = CMB_posi.getSelectedItem().toString();

        int IAge = Integer.parseInt(txt_sage.getText());
        int Isid = Integer.parseInt(lab_sid.getText());
        
        int check = JOptionPane.showConfirmDialog(null, "Do want to delete!");
        
        if(check==0){
            UpdateItemController.sUPForm(txt_sname.getText(), IAge, txt_scon.getText(), pos, Isid);
        }
        
        clearfields();
        tableLoad();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int Isid = Integer.parseInt(lab_sid.getText());        

        int check = JOptionPane.showConfirmDialog(null, "Do want to delete!");
        
        if(check==0){
            DeleteItemController.sDeleteForm(Isid);
        }
        
        clearfields();
        tableLoad();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        NewStaff NS = new NewStaff();
        NS.setVisible(true);
    }//GEN-LAST:event_addBtnActionPerformed

    private void mbSearchboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mbSearchboxKeyReleased
        String srch = mbSearchbox.getText();
        ResultSet r = new DBSearchBar().searchBarStaff(srch);
        manageStaffsTable.setModel(DbUtils.resultSetToTableModel(r));
    }//GEN-LAST:event_mbSearchboxKeyReleased

    private void manageStaffsTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_manageStaffsTableKeyPressed
        tabledataMS();
    }//GEN-LAST:event_manageStaffsTableKeyPressed

    public void clearfields(){
        txt_sname.setText("");
        txt_sage.setText("");
        txt_scon.setText("");
        lab_sid.setText("");
        CMB_posi.setSelectedItem("Assistant Librarian");
    }
    
    public void tableLoad(){
        ResultSet s =new DBToTable().tableStaff();
        manageStaffsTable.setModel(DbUtils.resultSetToTableModel(s));
    }    
    
    private void tabledataMS(){
        int r = manageStaffsTable.getSelectedRow();
        
        String sID = manageStaffsTable.getValueAt(r,0).toString();
        String sName = manageStaffsTable.getValueAt(r,1).toString();
        String age = manageStaffsTable.getValueAt(r,2).toString();
        String scontact = manageStaffsTable.getValueAt(r,3).toString();
        String position = manageStaffsTable.getValueAt(r,4).toString();       
        
        txt_sname.setText(sName);
        txt_sage.setText(age);
        txt_scon.setText(scontact);
        lab_sid.setText(sID);
        CMB_posi.setSelectedItem(position);
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
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Staff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CMB_posi;
    private rojerusan.RSMaterialButtonCircle addBtn;
    private rojerusan.RSMaterialButtonCircle deleteBtn;
    private rojerusan.RSMaterialButtonCircle exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lab_sid;
    private rojeru_san.complementos.RSTableMetro manageStaffsTable;
    private app.bolivia.swing.JCTextField mbSearchbox;
    private rojerusan.RSMaterialButtonCircle resetBtn;
    private app.bolivia.swing.JCTextField txt_sage;
    private app.bolivia.swing.JCTextField txt_scon;
    private app.bolivia.swing.JCTextField txt_sname;
    private rojerusan.RSMaterialButtonCircle updateBtn;
    // End of variables declaration//GEN-END:variables
}
