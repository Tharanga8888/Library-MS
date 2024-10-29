package View.ActionViews;

import Controller.AddItemController;
import Controller.DeleteItemController;
import Controller.UpdateItemController;
import Model.DBToTable;
import java.sql.ResultSet;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class ReturnBook extends javax.swing.JFrame {

    public ReturnBook() {
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
        DC_duedate = new rojeru_san.componentes.RSDateChooser();
        jLabel8 = new javax.swing.JLabel();
        DC_returndate = new rojeru_san.componentes.RSDateChooser();
        jLabel9 = new javax.swing.JLabel();
        returnBtn = new rojerusan.RSMaterialButtonCircle();
        jLabel10 = new javax.swing.JLabel();
        lab_issueID = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lab_fineInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
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
        jLabel4.setText("Return Book");
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
        IssueDetailsTable.setRowHeight(25);
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
        jLabel6.setText("MID");
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

        DC_duedate.setColorBackground(new java.awt.Color(0, 0, 255));
        DC_duedate.setColorButtonHover(new java.awt.Color(102, 102, 255));
        DC_duedate.setColorDiaActual(new java.awt.Color(255, 0, 0));
        DC_duedate.setColorForeground(new java.awt.Color(0, 51, 153));
        DC_duedate.setPlaceholder("Due Date");
        jPanel7.add(DC_duedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Due Date :");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 2, 90, 34));

        DC_returndate.setColorBackground(new java.awt.Color(0, 0, 255));
        DC_returndate.setColorButtonHover(new java.awt.Color(102, 102, 255));
        DC_returndate.setColorDiaActual(new java.awt.Color(255, 0, 0));
        DC_returndate.setColorForeground(new java.awt.Color(0, 51, 153));
        DC_returndate.setEnabled(false);
        DC_returndate.setPlaceholder("Select Return Date");
        jPanel7.add(DC_returndate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Return Date :");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 90, 34));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 260, 180));

        returnBtn.setBackground(new java.awt.Color(0, 0, 255));
        returnBtn.setText("Return the Book");
        returnBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 17)); // NOI18N
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });
        jPanel3.add(returnBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 300, 250, 75));

        jLabel10.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Details");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 90, 34));

        lab_issueID.setBackground(new java.awt.Color(255, 255, 255));
        lab_issueID.setFont(new java.awt.Font("Yu Gothic", 1, 20)); // NOI18N
        lab_issueID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_issueID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        jPanel3.add(lab_issueID, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 5, 1, new java.awt.Color(255, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Fine (Rs) :");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 99, 54));

        lab_fineInfo.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        lab_fineInfo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lab_fineInfo.setText("0");
        jPanel4.add(lab_fineInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 1, 70, 54));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 390, 210, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 40, 300, 460));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, -1));

        setSize(new java.awt.Dimension(1250, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeBtnActionPerformed

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
        int isID = Integer.parseInt(lab_issueID.getText());
        int bID = Integer.parseInt(txt_BID.getText());
        String status = "Returned";
        
        Date utillDueDate = DC_duedate.getDatoFecha();
        Long L1 = utillDueDate.getTime();       
        java.sql.Date sqlDueDate = new java.sql.Date(L1);
        
        Date utillreturnDate = DC_returndate.getDatoFecha();
        Long L2 = utillreturnDate.getTime();       
        java.sql.Date sqlreturnDate = new java.sql.Date(L2);
        
        int checkFine = (int)dayCount(utillreturnDate, utillDueDate);
        int fine=0;
        
        int check = JOptionPane.showConfirmDialog(null, "Do want to return the book!");

        if(check==0){
           
            if (checkFine>0) {               
                fine = checkFine*5;
            }
            
            AddItemController.returnForm(isID, sqlreturnDate, sqlDueDate, fine);
            UpdateItemController.QuantityInUPForm(bID);
            UpdateItemController.issueStatusUPForm(isID, status);
        }

        clearFields();
        tableLoad();
    }//GEN-LAST:event_returnBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        clearFields();
    }//GEN-LAST:event_resetBtnActionPerformed

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
        String mid = IssueDetailsTable.getValueAt(r,3).toString();
        Date dueDate = (Date)IssueDetailsTable.getValueAt(r,6);
        Date today = new Date();
        
        int numOfDays = (int)dayCount(today, dueDate);
        float totalFine= numOfDays*5;
        float decrement;
        if(numOfDays<=5){
            decrement=(totalFine*10)/100;
            totalFine=totalFine-decrement;
        }
        String count = String.valueOf(totalFine);
        
        txt_BID.setText(bid);
        txt_SID.setText(mid);
        lab_issueID.setText(isid);
        DC_duedate.setDatoFecha(dueDate);
        DC_returndate.setDatoFecha(today);
        
        if(numOfDays>0){
            lab_fineInfo.setText(count);
        }
        else{
            lab_fineInfo.setText("0");
        }
   }
    
    public void tableLoad(){
        ResultSet s =new DBToTable().tableIssueDetails();
        IssueDetailsTable.setModel(DbUtils.resultSetToTableModel(s));
    }
    
    public void clearFields(){
        txt_BID.setText("");
        txt_SID.setText("");
        lab_issueID.setText("");
        lab_fineInfo.setText("0");
        DC_duedate.setDatoFecha(null);
        DC_returndate.setDatoFecha(null);
    }  
    
    public long dayCount(Date t_day, Date d_day){
    
        long difference = t_day.getTime() - d_day.getTime();
        long convert = TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
        
    return convert;
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
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.componentes.RSDateChooser DC_duedate;
    private rojeru_san.componentes.RSDateChooser DC_returndate;
    private rojeru_san.complementos.RSTableMetro IssueDetailsTable;
    private rojerusan.RSMaterialButtonCircle closeBtn;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lab_fineInfo;
    private javax.swing.JLabel lab_issueID;
    private rojerusan.RSMaterialButtonCircle resetBtn;
    private rojerusan.RSMaterialButtonCircle returnBtn;
    private javax.swing.JTextField txt_BID;
    private javax.swing.JTextField txt_SID;
    // End of variables declaration//GEN-END:variables
}
