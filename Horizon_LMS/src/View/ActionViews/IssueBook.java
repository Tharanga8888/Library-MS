package View.ActionViews;

import Controller.AddItemController;
import Controller.UpdateItemController;
import Model.DBSearchBar;
import Model.IssueBookDetails;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;


public class IssueBook extends javax.swing.JFrame {

    public IssueBook() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lam_mid1 = new javax.swing.JLabel();
        lam_mname1 = new javax.swing.JLabel();
        lam_faculty = new javax.swing.JLabel();
        lam_intake = new javax.swing.JLabel();
        lam_valid1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lab_bvalid = new javax.swing.JLabel();
        lab_byear = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lab_bid = new javax.swing.JLabel();
        lab_bname = new javax.swing.JLabel();
        lab_bauthor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lab_quantity = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        closeBtn = new rojerusan.RSMaterialButtonCircle();
        resetBtn = new rojerusan.RSMaterialButtonCircle();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_memberid = new app.bolivia.swing.JCTextField();
        DC_due = new rojeru_san.componentes.RSDateChooser();
        txt_bookid = new app.bolivia.swing.JCTextField();
        DC_issue = new rojeru_san.componentes.RSDateChooser();
        issueThisBookBtn = new rojerusan.RSMaterialButtonCircle();
        txt_bookname = new app.bolivia.swing.JCTextField();
        jLabel19 = new javax.swing.JLabel();
        lab_bid1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/ANBIcons/icons8_Student_Registration_100px_2.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 100, 100));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Member Details");
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 250, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ID :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Name :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Faculty :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Intake :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        lam_mid1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lam_mid1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lam_mid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 220, 21));

        lam_mname1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lam_mname1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lam_mname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 290, 21));

        lam_faculty.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lam_faculty.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lam_faculty, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 290, 21));

        lam_intake.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lam_intake.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lam_intake, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 220, 21));

        lam_valid1.setBackground(new java.awt.Color(255, 255, 0));
        lam_valid1.setFont(new java.awt.Font("Britannic Bold", 1, 18)); // NOI18N
        lam_valid1.setForeground(new java.awt.Color(255, 255, 0));
        jPanel1.add(lam_valid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 160, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 275, 400, 275));

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_bvalid.setFont(new java.awt.Font("Britannic Bold", 1, 18)); // NOI18N
        lab_bvalid.setForeground(new java.awt.Color(255, 255, 0));
        jPanel2.add(lab_bvalid, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 130, 30));

        lab_byear.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lab_byear.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lab_byear, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 90, 21));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Author :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Year :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        lab_bid.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lab_bid.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lab_bid, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 220, 21));

        lab_bname.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lab_bname.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lab_bname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 280, 21));

        lab_bauthor.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lab_bauthor.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lab_bauthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 280, 21));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Book Details");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 250, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/ANBIcons/icons8_Literature_100px_1.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 100, 100));

        lab_quantity.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lab_quantity.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lab_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 90, 21));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Quantity :");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 70, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 275));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeBtn.setBackground(new java.awt.Color(255, 0, 0));
        closeBtn.setText("X");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        jPanel3.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 40, 40));

        resetBtn.setBackground(new java.awt.Color(255, 0, 0));
        resetBtn.setText("R");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        jPanel3.add(resetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 60, 60));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/ANBIcons/icons8_Books_52px_1.png"))); // NOI18N
        jLabel13.setText("Issue Book");
        jLabel13.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(255, 51, 0)));
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 300, 60));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 51, 0));
        jLabel14.setText("Student ID :");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 110, 40));

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 51, 0));
        jLabel15.setText("Book ID :");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 110, 40));

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 51, 0));
        jLabel16.setText("Issue Date :");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 110, 40));

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 51, 0));
        jLabel17.setText("Due Date :");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 110, 40));

        txt_memberid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0), 2));
        txt_memberid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_memberid.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        txt_memberid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_memberidFocusLost(evt);
            }
        });
        jPanel3.add(txt_memberid, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 320, 40));

        DC_due.setColorBackground(new java.awt.Color(255, 51, 0));
        DC_due.setColorButtonHover(new java.awt.Color(255, 102, 0));
        DC_due.setColorForeground(new java.awt.Color(0, 0, 0));
        DC_due.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        DC_due.setFuente(new java.awt.Font("Yu Gothic", 1, 20)); // NOI18N
        DC_due.setPlaceholder("Select Due Date");
        jPanel3.add(DC_due, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 320, 40));

        txt_bookid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0), 2));
        txt_bookid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_bookid.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        txt_bookid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_bookidFocusLost(evt);
            }
        });
        jPanel3.add(txt_bookid, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 50, 40));

        DC_issue.setColorBackground(new java.awt.Color(255, 51, 0));
        DC_issue.setColorButtonHover(new java.awt.Color(255, 102, 0));
        DC_issue.setColorForeground(new java.awt.Color(0, 0, 0));
        DC_issue.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        DC_issue.setFuente(new java.awt.Font("Yu Gothic", 1, 20)); // NOI18N
        DC_issue.setPlaceholder("Select Issue Date");
        jPanel3.add(DC_issue, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 320, 40));

        issueThisBookBtn.setBackground(new java.awt.Color(255, 51, 0));
        issueThisBookBtn.setText("ISSUE THIS BOOK");
        issueThisBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueThisBookBtnActionPerformed(evt);
            }
        });
        jPanel3.add(issueThisBookBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 320, 60));

        txt_bookname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0), 2));
        txt_bookname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_bookname.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        txt_bookname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_booknameFocusLost(evt);
            }
        });
        jPanel3.add(txt_bookname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 320, 40));

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 51, 0));
        jLabel19.setText("Book Name :");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 120, 40));

        lab_bid1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lab_bid1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(lab_bid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 220, 21));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 600, 550));

        setSize(new java.awt.Dimension(1000, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        clearfields();
    }//GEN-LAST:event_resetBtnActionPerformed

    private void txt_memberidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_memberidFocusLost
        getMemberDetails();
    }//GEN-LAST:event_txt_memberidFocusLost

    private void issueThisBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueThisBookBtnActionPerformed
        issueTheBook();
    }//GEN-LAST:event_issueThisBookBtnActionPerformed

    private void txt_booknameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_booknameFocusLost
        getBookDetails();
    }//GEN-LAST:event_txt_booknameFocusLost

    private void txt_bookidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_bookidFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bookidFocusLost

    int bookAllowToIssue = 0;
    int memberAllowToIssue = 0;
    
    public void issueTheBook(){
        int bookID = Integer.parseInt(txt_bookid.getText());
        int memberID = Integer.parseInt(txt_memberid.getText());
        String bookName = txt_bookname.getText();
        
        
        Date utillIssueDate = DC_issue.getDatoFecha();
        Long L1 = utillIssueDate.getTime();
        java.sql.Date sqlIssueDate = new java.sql.Date(L1);
        
        Date utillDueDate = DC_due.getDatoFecha();
        Long L2 = utillDueDate.getTime();       
        java.sql.Date sqlDueDate = new java.sql.Date(L2);  
        
        try {
            
            //ResultSet rs = new IssueBookDetails().bookDetails(bookID);
            //ResultSet rs = new IssueBookDetails().bookDetailsName(bookName);
            String srch = txt_bookname.getText();
            ResultSet r = new DBSearchBar().searchBarBook(srch);
        
            if(bookAllowToIssue==1){
                JOptionPane.showMessageDialog(null, "Book is out of Stock", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(bookAllowToIssue==2&&memberAllowToIssue==2) {
                AddItemController.issueForm(bookID, memberID, sqlIssueDate, sqlDueDate);
                UpdateItemController.QuantityUPForm(bookID);
                getBookDetails();
                bookAllowToIssue = 0;
                memberAllowToIssue = 0;
            }
            else {
                JOptionPane.showMessageDialog(null, "Invalid Operation!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            clearfields();
        } catch (Exception e) {
            e.printStackTrace();
        }   
    }
    
    public void getBookDetails(){
        int bookID = Integer.parseInt(txt_bookid.getText());
        String bookName = txt_bookname.getText();
        
        
        try {
            //ResultSet rs = new IssueBookDetails().bookDetails(bookID);
            //ResultSet rs = new IssueBookDetails().bookDetailsName(bookName);
            String srch = txt_bookname.getText();
            ResultSet rs = new DBSearchBar().searchBarBook(srch);
            
            if(rs.next()){
                if(rs.getInt("Quantity")==0){
                    lab_bvalid.setText("Not Available");
                    bookAllowToIssue = 1;
                }
                else{
                    lab_bvalid.setText("");
                    bookAllowToIssue = 2;
                } 
                
                lab_bid.setText(rs.getString("BID"));
                lab_bid1.setText(rs.getString("BID"));
                lab_bauthor.setText(rs.getString("Bauthor"));
                lab_bname.setText(rs.getString("Bname"));
                lab_byear.setText(rs.getString("Byear"));
                lab_quantity.setText(rs.getString("Quantity"));
                
            }
            else{
                lab_bvalid.setText("Invalid Book!");
                lab_bid.setText("");
                lab_bauthor.setText("");
                lab_bname.setText("");
                lab_byear.setText("");
                lab_quantity.setText("");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void getMemberDetails(){
        int memberID = Integer.parseInt(txt_memberid.getText());
        
        try {
            ResultSet rs = new IssueBookDetails().memberDetails(memberID);
            
            if(rs.next()){
                lam_valid1.setText("");
                lam_mid1.setText(rs.getString("LibraryID"));
                lam_faculty.setText(rs.getString("Faculty"));
                lam_mname1.setText(rs.getString("Name"));
                lam_intake.setText(rs.getString("Intake"));
                memberAllowToIssue = 2;
            }
            else{
                lam_valid1.setText("Invalid Member!");  
                lam_mid1.setText("");
                lam_faculty.setText("");
                lam_mname1.setText("");
                lam_intake.setText("");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clearfields(){
                lab_bvalid.setText("");
                lab_bid.setText("");
                lab_bauthor.setText("");
                lab_bname.setText("");
                lab_byear.setText("");
                lam_valid1.setText("");
                lam_mid1.setText("");
                lam_faculty.setText("");
                lam_mname1.setText("");
                lam_intake.setText("");
                txt_bookid.setText("");
                txt_memberid.setText("");
                lab_quantity.setText("");
                DC_due.setDatoFecha(null);
                DC_issue.setDatoFecha(null);
    }
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.componentes.RSDateChooser DC_due;
    private rojeru_san.componentes.RSDateChooser DC_issue;
    private rojerusan.RSMaterialButtonCircle closeBtn;
    private rojerusan.RSMaterialButtonCircle issueThisBookBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lab_bauthor;
    private javax.swing.JLabel lab_bid;
    private javax.swing.JLabel lab_bid1;
    private javax.swing.JLabel lab_bname;
    private javax.swing.JLabel lab_bvalid;
    private javax.swing.JLabel lab_byear;
    private javax.swing.JLabel lab_quantity;
    private javax.swing.JLabel lam_faculty;
    private javax.swing.JLabel lam_intake;
    private javax.swing.JLabel lam_mid1;
    private javax.swing.JLabel lam_mname1;
    private javax.swing.JLabel lam_valid1;
    private rojerusan.RSMaterialButtonCircle resetBtn;
    private app.bolivia.swing.JCTextField txt_bookid;
    private app.bolivia.swing.JCTextField txt_bookname;
    private app.bolivia.swing.JCTextField txt_memberid;
    // End of variables declaration//GEN-END:variables
}
