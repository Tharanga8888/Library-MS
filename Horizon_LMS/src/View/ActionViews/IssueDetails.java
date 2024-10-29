package View.ActionViews;

import Controller.DeleteItemController;
import Controller.UpdateItemController;
import Model.DBToTable;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class IssueDetails extends javax.swing.JFrame {

    public IssueDetails() {
        initComponents();
        tableLoad();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        closeBtn = new rojerusan.RSMaterialButtonCircle();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        IssueDetailsTable = new rojeru_san.complementos.RSTableMetro();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txt_SID = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txt_BID = new javax.swing.JTextField();
        resetBtn = new rojerusan.RSMaterialButtonCircle();
        jPanel7 = new javax.swing.JPanel();
        DC_issuedate = new rojeru_san.componentes.RSDateChooser();
        jLabel8 = new javax.swing.JLabel();
        DC_returndate = new rojeru_san.componentes.RSDateChooser();
        jLabel9 = new javax.swing.JLabel();
        updateBtn = new rojerusan.RSMaterialButtonCircle();
        deleteBtn = new rojerusan.RSMaterialButtonCircle();
        jLabel10 = new javax.swing.JLabel();
        lab_issueID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1250, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 510));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeBtn.setBackground(new java.awt.Color(255, 0, 0));
        closeBtn.setText("X");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        jPanel2.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 0, 40, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/adminIcons/icons8_menu_48px_1.png"))); // NOI18N
        jLabel3.setText("Horizon Library Management System");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 40));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/ANBIcons/icons8_Edit_Property_50px.png"))); // NOI18N
        jLabel4.setText("Issue Details");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 210, -1));

        IssueDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        IssueDetailsTable.setColorBackgoundHead(new java.awt.Color(0, 0, 255));
        IssueDetailsTable.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        IssueDetailsTable.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        IssueDetailsTable.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        IssueDetailsTable.setColorSelBackgound(new java.awt.Color(255, 0, 0));
        IssueDetailsTable.setRowHeight(20);
        IssueDetailsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IssueDetailsTableMouseClicked(evt);
            }
        });
        IssueDetailsTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                IssueDetailsTableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(IssueDetailsTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 930, 370));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 5, 0, new java.awt.Color(255, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("SID");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 40, 34));

        txt_SID.setEditable(false);
        txt_SID.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        txt_SID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_SID.setAlignmentX(2.0F);
        jPanel5.add(txt_SID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1, 59, 34));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 110, 40));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 5, 0, new java.awt.Color(255, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("BID");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 40, 34));

        txt_BID.setEditable(false);
        txt_BID.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        txt_BID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_BID.setAlignmentX(2.0F);
        jPanel6.add(txt_BID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1, 59, 34));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 110, 40));

        resetBtn.setBackground(new java.awt.Color(255, 0, 0));
        resetBtn.setText("R");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        jPanel3.add(resetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 40, 40));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 5, 0, new java.awt.Color(255, 0, 0)));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DC_issuedate.setColorBackground(new java.awt.Color(0, 0, 255));
        DC_issuedate.setColorButtonHover(new java.awt.Color(102, 102, 255));
        DC_issuedate.setColorDiaActual(new java.awt.Color(255, 0, 0));
        DC_issuedate.setColorForeground(new java.awt.Color(0, 51, 153));
        DC_issuedate.setPlaceholder("Select Issue Date");
        jPanel7.add(DC_issuedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Issue Date :");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 2, 90, 34));

        DC_returndate.setColorBackground(new java.awt.Color(0, 0, 255));
        DC_returndate.setColorButtonHover(new java.awt.Color(102, 102, 255));
        DC_returndate.setColorDiaActual(new java.awt.Color(255, 0, 0));
        DC_returndate.setColorForeground(new java.awt.Color(0, 51, 153));
        DC_returndate.setPlaceholder("Select Return Date");
        jPanel7.add(DC_returndate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Due Date :");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 90, 34));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 260, 180));

        updateBtn.setBackground(new java.awt.Color(0, 0, 255));
        updateBtn.setText("Update");
        updateBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 17)); // NOI18N
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel3.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 200, 50));

        deleteBtn.setBackground(new java.awt.Color(0, 0, 255));
        deleteBtn.setText("Delete");
        deleteBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 17)); // NOI18N
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel3.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 200, 50));

        jLabel10.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Details");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 90, 34));

        lab_issueID.setBackground(new java.awt.Color(255, 255, 255));
        lab_issueID.setFont(new java.awt.Font("Yu Gothic", 1, 20)); // NOI18N
        lab_issueID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_issueID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        jPanel3.add(lab_issueID, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 40, 300, 460));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, -1));

        setSize(new java.awt.Dimension(1250, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        clearFields();
    }//GEN-LAST:event_resetBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        
        int isID = Integer.parseInt(lab_issueID.getText());
        
        Date utillIssueDate = DC_issuedate.getDatoFecha();
        Long L1 = utillIssueDate.getTime();
        java.sql.Date sqlIssueDate = new java.sql.Date(L1);
        
        Date utillReturnDate = DC_returndate.getDatoFecha();
        Long L2 = utillReturnDate.getTime();       
        java.sql.Date sqlDueDate = new java.sql.Date(L2);
        
        int check = JOptionPane.showConfirmDialog(null, "Do want to update!");
        
        if(check==0){
            UpdateItemController.issueUPForm(isID, sqlIssueDate, sqlDueDate);
        }        
        
        clearFields();
        tableLoad();        
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int isID = Integer.parseInt(lab_issueID.getText());
        int bID = Integer.parseInt(txt_BID.getText());
        
        int check = JOptionPane.showConfirmDialog(null, "Do want to delete!");
        
        if(check==0){
            DeleteItemController.issueDeleteForm(isID);
            UpdateItemController.QuantityInUPForm(bID);
        }
        
        clearFields();
        tableLoad();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void IssueDetailsTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IssueDetailsTableKeyPressed
        tabledataIsD();
    }//GEN-LAST:event_IssueDetailsTableKeyPressed

    private void IssueDetailsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IssueDetailsTableMouseClicked
        tabledataIsD();
    }//GEN-LAST:event_IssueDetailsTableMouseClicked

    public void tabledataIsD(){
        int r = IssueDetailsTable.getSelectedRow();
        
        String isid = IssueDetailsTable.getValueAt(r, 0).toString();
        String bid = IssueDetailsTable.getValueAt(r,1).toString();
        String sid = IssueDetailsTable.getValueAt(r,3).toString();
        Date issueDate = (Date) IssueDetailsTable.getValueAt(r,5);
        Date dueDate = (Date)IssueDetailsTable.getValueAt(r,6);
        
        txt_BID.setText(bid);
        txt_SID.setText(sid);
        lab_issueID.setText(isid);
        DC_issuedate.setDatoFecha(issueDate);
        DC_returndate.setDatoFecha(dueDate);
   }
    
    public void tableLoad(){
        ResultSet s =new DBToTable().tableIssueDetails();
        IssueDetailsTable.setModel(DbUtils.resultSetToTableModel(s));
    }
    
    public void clearFields(){
        txt_BID.setText("");
        txt_SID.setText("");
        lab_issueID.setText("");
        DC_issuedate.setDatoFecha(null);
        DC_returndate.setDatoFecha(null);
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
            java.util.logging.Logger.getLogger(IssueDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.componentes.RSDateChooser DC_issuedate;
    private rojeru_san.componentes.RSDateChooser DC_returndate;
    private rojeru_san.complementos.RSTableMetro IssueDetailsTable;
    private rojerusan.RSMaterialButtonCircle closeBtn;
    private rojerusan.RSMaterialButtonCircle deleteBtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lab_issueID;
    private rojerusan.RSMaterialButtonCircle resetBtn;
    private javax.swing.JTextField txt_BID;
    private javax.swing.JTextField txt_SID;
    private rojerusan.RSMaterialButtonCircle updateBtn;
    // End of variables declaration//GEN-END:variables
}
