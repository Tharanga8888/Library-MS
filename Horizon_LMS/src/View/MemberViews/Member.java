package View.MemberViews;

import Controller.DeleteItemController;
import Controller.UpdateItemController;
import Model.DBSearch;
import Model.DBSearchBar;
import Model.DBToTable;
import View.BookViews.NewBook;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Member extends javax.swing.JFrame {

    public Member() {
        initComponents();
        tableLoad();
    }

    public void clearfields(){
        txt_mname.setText("");
        txt_stid.setText("");
        txt_intake.setText("");
        txt_contact.setText("");
        txt_age.setText("");
        lab_lid.setText("");
        CMB_faculty.setSelectedItem(null);
        CMB_gender.setSelectedItem(null);
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        mbSearchbox = new app.bolivia.swing.JCTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        addBtn = new rojerusan.RSMaterialButtonCircle();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        manageMembersTable = new rojeru_san.complementos.RSTableMetro();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_mname = new app.bolivia.swing.JCTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txt_stid = new app.bolivia.swing.JCTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lab_lid = new javax.swing.JLabel();
        updateBtn = new rojerusan.RSMaterialButtonCircle();
        deleteBtn = new rojerusan.RSMaterialButtonCircle();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        CMB_faculty = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txt_age = new app.bolivia.swing.JCTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        CMB_gender = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txt_intake = new app.bolivia.swing.JCTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txt_contact = new app.bolivia.swing.JCTextField();
        resetBtn = new rojerusan.RSMaterialButtonCircle();
        exitBtn = new rojerusan.RSMaterialButtonCircle();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1275, 550));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1275, 550));
        setSize(new java.awt.Dimension(1275, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(930, 170));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(0, 0, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 7, new java.awt.Color(255, 0, 0)));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/adminIcons/icons8_menu_48px_1.png"))); // NOI18N
        jLabel2.setText("Horizon Library Management System");
        jPanel13.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 40));

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 40));

        jPanel14.setBackground(new java.awt.Color(255, 0, 0));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true), "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mbSearchbox.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        mbSearchbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbSearchboxActionPerformed(evt);
            }
        });
        mbSearchbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mbSearchboxKeyReleased(evt);
            }
        });
        jPanel14.add(mbSearchbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 260, -1));

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 280, 80));

        jPanel15.setBackground(new java.awt.Color(255, 0, 0));
        jPanel15.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 15, 0, new java.awt.Color(0, 0, 255)));

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Manage members");
        jPanel15.add(jLabel3);

        jPanel1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 300, 60));

        addBtn.setBackground(new java.awt.Color(0, 0, 255));
        addBtn.setText("ADD NEW Member");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, 192, 63));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 140));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageMembersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Library ID", "Name", "Student ID", "Faculty", "Intake", "Age", "Gender", "Contact"
            }
        ));
        manageMembersTable.setColorBackgoundHead(new java.awt.Color(0, 0, 255));
        manageMembersTable.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        manageMembersTable.setColorSelBackgound(new java.awt.Color(255, 0, 0));
        manageMembersTable.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        manageMembersTable.setFuenteFilas(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        manageMembersTable.setFuenteFilasSelect(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        manageMembersTable.setFuenteHead(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        manageMembersTable.setRowHeight(40);
        manageMembersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageMembersTableMouseClicked(evt);
            }
        });
        manageMembersTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                manageMembersTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(manageMembersTable);

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

        txt_mname.setToolTipText("Enter name");
        txt_mname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel5.add(txt_mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 230, 40));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 310, 40));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel6.setText("Student ID :");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        txt_stid.setToolTipText("Enter student ID");
        txt_stid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel6.add(txt_stid, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 230, 40));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 310, 40));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel7.setText("Library ID : ");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        lab_lid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel7.add(lab_lid, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 30, 20));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 150, 40));

        updateBtn.setBackground(new java.awt.Color(255, 0, 0));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel3.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 160, 70));

        deleteBtn.setBackground(new java.awt.Color(255, 0, 0));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel3.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 160, 70));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel8.setText("Faculty : ");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        CMB_faculty.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CMB_faculty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IT", "Education", "Management", "Science", "Law", "Technology", "ELTU" }));
        jPanel8.add(CMB_faculty, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 230, 40));

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 310, 40));

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel9.setText("Age : ");
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txt_age.setToolTipText("Enter age");
        txt_age.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel9.add(txt_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 70, 40));

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 150, 40));

        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel10.setText("Gender : ");
        jPanel10.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        CMB_gender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CMB_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel10.add(CMB_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 80, 40));

        jPanel3.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 150, 40));

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel11.setText("Intake : ");
        jPanel11.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txt_intake.setToolTipText("Enter Intake");
        txt_intake.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel11.add(txt_intake, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 70, 40));

        jPanel3.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 150, 40));

        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel12.setText("Contact no : ");
        jPanel12.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        txt_contact.setToolTipText("Enter phone number");
        txt_contact.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel12.add(txt_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 230, 40));

        jPanel3.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 310, 40));

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
    
    private void tabledataMM(){
        int r = manageMembersTable.getSelectedRow();
        
        String lid = manageMembersTable.getValueAt(r,0).toString();
        String mName = manageMembersTable.getValueAt(r,1).toString();
        String stID = manageMembersTable.getValueAt(r,2).toString();
        String faculty = manageMembersTable.getValueAt(r,3).toString();
        String intake = manageMembersTable.getValueAt(r,4).toString();
        String mage = manageMembersTable.getValueAt(r,6).toString();
        String mgender = manageMembersTable.getValueAt(r,7).toString();
        String mcontact = manageMembersTable.getValueAt(r,5).toString();        
        
        txt_mname.setText(mName);
        txt_stid.setText(stID);
        txt_intake.setText(intake);
        txt_contact.setText(mcontact);
        txt_age.setText(mage);
        lab_lid.setText(lid);
        CMB_faculty.setSelectedItem(faculty);
        CMB_gender.setSelectedItem(mgender);
    }
    private void manageMembersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageMembersTableMouseClicked
        tabledataMM();
    }//GEN-LAST:event_manageMembersTableMouseClicked

    private void manageMembersTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_manageMembersTableKeyReleased
        tabledataMM();
    }//GEN-LAST:event_manageMembersTableKeyReleased

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        clearfields();
        tableLoad();
    }//GEN-LAST:event_resetBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        String faculty = CMB_faculty.getSelectedItem().toString();
        String gender = CMB_gender.getSelectedItem().toString();
        
        String Lid = lab_lid.getText();
        int inLid = Integer.parseInt(Lid);
        
        String StriIntake = txt_intake.getText();
        int Inntake = Integer.parseInt(StriIntake);
        
        String StriAge = txt_age.getText();
        int InAge = Integer.parseInt(StriAge);
        
        int check = JOptionPane.showConfirmDialog(null, "Do want to update!");
        
        if (check==0){
            UpdateItemController.mUPForm(txt_mname.getText(), txt_stid.getText(), faculty, Inntake, txt_contact.getText(), InAge, gender, inLid);
        }
        
        clearfields();
        tableLoad();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        String Lid = lab_lid.getText();
        int inLid = Integer.parseInt(Lid);        

        int check = JOptionPane.showConfirmDialog(null, "Do want to delete!");
        
        if(check==0){
            DeleteItemController.mDeleteForm(inLid);
        }
        
        clearfields();
        tableLoad();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        NewMember NM = new NewMember();
        NM.setVisible(true);
    }//GEN-LAST:event_addBtnActionPerformed

    private void mbSearchboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbSearchboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mbSearchboxActionPerformed

    private void mbSearchboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mbSearchboxKeyReleased
        String srch = mbSearchbox.getText();
        ResultSet r = new DBSearchBar().searchBarMember(srch);
        manageMembersTable.setModel(DbUtils.resultSetToTableModel(r));
    }//GEN-LAST:event_mbSearchboxKeyReleased

    public void tableLoad(){
        ResultSet s =new DBToTable().tableMember();
        manageMembersTable.setModel(DbUtils.resultSetToTableModel(s));
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
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Member().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CMB_faculty;
    private javax.swing.JComboBox<String> CMB_gender;
    private rojerusan.RSMaterialButtonCircle addBtn;
    private rojerusan.RSMaterialButtonCircle deleteBtn;
    private rojerusan.RSMaterialButtonCircle exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lab_lid;
    private rojeru_san.complementos.RSTableMetro manageMembersTable;
    private app.bolivia.swing.JCTextField mbSearchbox;
    private rojerusan.RSMaterialButtonCircle resetBtn;
    private app.bolivia.swing.JCTextField txt_age;
    private app.bolivia.swing.JCTextField txt_contact;
    private app.bolivia.swing.JCTextField txt_intake;
    private app.bolivia.swing.JCTextField txt_mname;
    private app.bolivia.swing.JCTextField txt_stid;
    private rojerusan.RSMaterialButtonCircle updateBtn;
    // End of variables declaration//GEN-END:variables
}
