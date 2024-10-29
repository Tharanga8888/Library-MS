package View.BookViews;

import Controller.DeleteItemController;
import Controller.UpdateItemController;
import com.mysql.jdbc.PreparedStatement;
import Model.DBSearch;
import Model.DBSearchBar;
import Model.DBToTable;
import View.ActionViews.IssueBook;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class Books extends javax.swing.JFrame {

    public Books() {
        initComponents();
        tableLoad();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        mbSearchbox = new app.bolivia.swing.JCTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        addBtn = new rojerusan.RSMaterialButtonCircle();
        jPanel12 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        manageBooksTable = new rojeru_san.complementos.RSTableMetro();
        jPanel3 = new javax.swing.JPanel();
        issueBtn = new rojerusan.RSMaterialButtonCircle();
        updateBtn = new rojerusan.RSMaterialButtonCircle();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_quantity = new app.bolivia.swing.JCTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_bname = new app.bolivia.swing.JCTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txt_aname = new app.bolivia.swing.JCTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txt_year = new app.bolivia.swing.JCTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        CBM_cat = new javax.swing.JComboBox<>();
        deleteBtn = new rojerusan.RSMaterialButtonCircle();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lab_bid = new javax.swing.JLabel();
        resetBtn = new rojerusan.RSMaterialButtonCircle();
        exitBtn = new rojerusan.RSMaterialButtonCircle();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1275, 550));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1275, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(255, 0, 0));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true), "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel10.add(mbSearchbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 260, -1));

        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 280, 80));

        jPanel11.setBackground(new java.awt.Color(0, 0, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 7, new java.awt.Color(255, 0, 0)));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/adminIcons/icons8_menu_48px_1.png"))); // NOI18N
        jLabel2.setText("Horizon Library Management System");
        jPanel11.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 40));

        jPanel2.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 40));

        addBtn.setBackground(new java.awt.Color(0, 0, 255));
        addBtn.setText("ADD NEW BOOK");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel2.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, 192, 63));

        jPanel12.setBackground(new java.awt.Color(255, 0, 0));
        jPanel12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 15, 0, new java.awt.Color(0, 0, 255)));

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Manage Books");
        jPanel12.add(jLabel3);

        jPanel2.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 300, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 140));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageBooksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Book Name", "Author", "Year", "Category", "Quantity"
            }
        ));
        manageBooksTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        manageBooksTable.setColorBackgoundHead(new java.awt.Color(0, 0, 255));
        manageBooksTable.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        manageBooksTable.setColorSelBackgound(new java.awt.Color(255, 0, 0));
        manageBooksTable.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        manageBooksTable.setFuenteFilas(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        manageBooksTable.setFuenteFilasSelect(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        manageBooksTable.setFuenteHead(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        manageBooksTable.setRowHeight(40);
        manageBooksTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageBooksTableMouseClicked(evt);
            }
        });
        manageBooksTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                manageBooksTableKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                manageBooksTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(manageBooksTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 910, 390));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 930, 410));

        jPanel3.setBackground(new java.awt.Color(0, 0, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        issueBtn.setBackground(new java.awt.Color(255, 0, 0));
        issueBtn.setText("Issue Book");
        issueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueBtnActionPerformed(evt);
            }
        });
        jPanel3.add(issueBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 330, 60));

        updateBtn.setBackground(new java.awt.Color(255, 0, 0));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel3.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 160, 70));

        jLabel1.setFont(new java.awt.Font("Bodoni MT Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Details");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel4.setText("Quantity : ");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txt_quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_quantity.setToolTipText("Enter quantity");
        txt_quantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel4.add(txt_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 70, 40));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 150, 40));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel5.setText("Name : ");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txt_bname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_bname.setToolTipText("Enter book name");
        txt_bname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel5.add(txt_bname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 230, 40));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 310, 40));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel6.setText("Author :");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txt_aname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_aname.setToolTipText("Enter author's name");
        txt_aname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel6.add(txt_aname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 230, 40));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 310, 40));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel7.setText("Year : ");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txt_year.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_year.setToolTipText("Enter published year");
        txt_year.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel7.add(txt_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 230, 40));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 310, 40));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel8.setText("Category : ");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        CBM_cat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CBM_cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "000 - IT", "100 - Philosophy", "200 - Mathematic", "300 - Social", "400 - Language", "500 - Science", "600 - Technology", "700 - Art", "800 - English", "900 - Geography and History", "1000 - Other" }));
        jPanel8.add(CBM_cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 230, 40));

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 310, 40));

        deleteBtn.setBackground(new java.awt.Color(255, 0, 0));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel3.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 160, 70));

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel9.setText("Book ID : ");
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lab_bid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lab_bid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(lab_bid, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 50, 40));

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 150, 40));

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

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        clearBookfields();
        tableLoad();
    }//GEN-LAST:event_resetBtnActionPerformed
    
    private void manageBooksTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageBooksTableMouseClicked
        tabledataMB();
    }//GEN-LAST:event_manageBooksTableMouseClicked

    private void manageBooksTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_manageBooksTableKeyPressed
        tabledataMB();
    }//GEN-LAST:event_manageBooksTableKeyPressed

    private void manageBooksTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_manageBooksTableKeyReleased
        tabledataMB();
    }//GEN-LAST:event_manageBooksTableKeyReleased

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed
    
    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        String category = CBM_cat.getSelectedItem().toString();
        
        int InYear = Integer.parseInt(txt_year.getText());
        int InID = Integer.parseInt(lab_bid.getText());
        int InQuantity = Integer.parseInt(txt_quantity.getText());
        
        int check = JOptionPane.showConfirmDialog(null, "Do want to update!");
        
        if(check==0){
            UpdateItemController.bUPForm(txt_bname.getText(), txt_aname.getText(), InYear, category, InQuantity, InID);
        }        
        
        clearBookfields();
        tableLoad();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int InID = Integer.parseInt(lab_bid.getText());
        
        int check = JOptionPane.showConfirmDialog(null, "Do want to delete!");
        
        if(check==0){
            DeleteItemController.bDeleteForm(InID);
        }

        clearBookfields();
        tableLoad();
    }//GEN-LAST:event_deleteBtnActionPerformed
    
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        NewBook NB = new NewBook();
        NB.setVisible(true);
    }//GEN-LAST:event_addBtnActionPerformed

    private void mbSearchboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mbSearchboxKeyReleased
        String srch = mbSearchbox.getText();
        ResultSet r = new DBSearchBar().searchBarBook(srch);
        manageBooksTable.setModel(DbUtils.resultSetToTableModel(r)); 
    }//GEN-LAST:event_mbSearchboxKeyReleased

    private void issueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueBtnActionPerformed
        IssueBook IB = new IssueBook();
        IB.setVisible(true);
    }//GEN-LAST:event_issueBtnActionPerformed

    private void mbSearchboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbSearchboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mbSearchboxActionPerformed
    
    public void tableLoad(){
        ResultSet s =new DBToTable().tableBook();
        manageBooksTable.setModel(DbUtils.resultSetToTableModel(s));
    }    
    
    public void clearBookfields(){
        txt_bname.setText("");
        txt_aname.setText("");
        txt_year.setText("");
        txt_quantity.setText("");
        lab_bid.setText("");
        CBM_cat.setSelectedItem(null);
    }
    
    private void tabledataMB(){
        int r = manageBooksTable.getSelectedRow();
        
        String id = manageBooksTable.getValueAt(r,0).toString();
        String bName = manageBooksTable.getValueAt(r,1).toString();
        String bAuthor = manageBooksTable.getValueAt(r,2).toString();
        String byear = manageBooksTable.getValueAt(r,3).toString();
        String bCat = manageBooksTable.getValueAt(r,4).toString();
        String bQuan = manageBooksTable.getValueAt(r,5).toString();
        
        txt_bname.setText(bName);
        txt_aname.setText(bAuthor);
        txt_year.setText(byear);
        txt_quantity.setText(bQuan);
        lab_bid.setText(id);
        CBM_cat.setSelectedItem(bCat);
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
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Books().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBM_cat;
    private rojerusan.RSMaterialButtonCircle addBtn;
    private rojerusan.RSMaterialButtonCircle deleteBtn;
    private rojerusan.RSMaterialButtonCircle exitBtn;
    private rojerusan.RSMaterialButtonCircle issueBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lab_bid;
    private rojeru_san.complementos.RSTableMetro manageBooksTable;
    private app.bolivia.swing.JCTextField mbSearchbox;
    private rojerusan.RSMaterialButtonCircle resetBtn;
    private app.bolivia.swing.JCTextField txt_aname;
    private app.bolivia.swing.JCTextField txt_bname;
    private app.bolivia.swing.JCTextField txt_quantity;
    private app.bolivia.swing.JCTextField txt_year;
    private rojerusan.RSMaterialButtonCircle updateBtn;
    // End of variables declaration//GEN-END:variables
}
