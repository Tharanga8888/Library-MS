package View.MemberViews;

import Controller.AddItemController;

public class NewMember extends javax.swing.JFrame {

    public NewMember() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txt_name = new app.bolivia.swing.JCTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_stid = new app.bolivia.swing.JCTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_contact = new app.bolivia.swing.JCTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        CMB_faculty = new javax.swing.JComboBox<>();
        rSMaterialButtonCircle4 = new rojerusan.RSMaterialButtonCircle();
        rSMaterialButtonCircle5 = new rojerusan.RSMaterialButtonCircle();
        rSMaterialButtonCircle6 = new rojerusan.RSMaterialButtonCircle();
        jPanel13 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_intake = new app.bolivia.swing.JCTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        CMB_gender = new javax.swing.JComboBox<>();
        jPanel15 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txt_age = new app.bolivia.swing.JCTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bodoni MT Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADD Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 0, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Name : ");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        txt_name.setBackground(new java.awt.Color(255, 0, 0));
        txt_name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 6, 0, new java.awt.Color(255, 255, 255)));
        txt_name.setForeground(new java.awt.Color(255, 255, 255));
        txt_name.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jPanel6.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 370, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/ANBIcons/icons8_Moleskine_26px.png"))); // NOI18N
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, 40));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 480, 60));

        jPanel5.setBackground(new java.awt.Color(255, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/ANBIcons/icons8_Unit_26px.png"))); // NOI18N
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Student ID : ");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        txt_stid.setBackground(new java.awt.Color(255, 0, 0));
        txt_stid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 6, 0, new java.awt.Color(255, 255, 255)));
        txt_stid.setForeground(new java.awt.Color(255, 255, 255));
        txt_stid.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jPanel5.add(txt_stid, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 370, 40));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 480, 60));

        jPanel7.setBackground(new java.awt.Color(255, 0, 0));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/ANBIcons/icons8_Contact_26px.png"))); // NOI18N
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, 40));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Contact : ");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        txt_contact.setBackground(new java.awt.Color(255, 0, 0));
        txt_contact.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 6, 0, new java.awt.Color(255, 255, 255)));
        txt_contact.setForeground(new java.awt.Color(255, 255, 255));
        txt_contact.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jPanel7.add(txt_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 370, 40));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 480, 60));

        jPanel8.setBackground(new java.awt.Color(255, 0, 0));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/adminIcons/icons8_Library_32px.png"))); // NOI18N
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, 40));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Faculty : ");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        CMB_faculty.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        CMB_faculty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IT", "Education", "Management", "Science", "Law", "Technology", "ELTU" }));
        jPanel8.add(CMB_faculty, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 370, 40));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 480, 60));

        rSMaterialButtonCircle4.setBackground(new java.awt.Color(0, 0, 255));
        rSMaterialButtonCircle4.setText("ADD");
        rSMaterialButtonCircle4.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        rSMaterialButtonCircle4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle4ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonCircle4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 260, 100));

        rSMaterialButtonCircle5.setBackground(new java.awt.Color(0, 0, 255));
        rSMaterialButtonCircle5.setText("Reset");
        rSMaterialButtonCircle5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle5ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonCircle5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 160, 50));

        rSMaterialButtonCircle6.setBackground(new java.awt.Color(0, 0, 255));
        rSMaterialButtonCircle6.setText("Cancel");
        rSMaterialButtonCircle6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle6ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonCircle6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, 160, 50));

        jPanel13.setBackground(new java.awt.Color(255, 0, 0));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/adminIcons/icons8_Exit_26px_2.png"))); // NOI18N
        jPanel13.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, 40));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Intake : ");
        jPanel13.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        txt_intake.setBackground(new java.awt.Color(255, 0, 0));
        txt_intake.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 6, 0, new java.awt.Color(255, 255, 255)));
        txt_intake.setForeground(new java.awt.Color(255, 255, 255));
        txt_intake.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jPanel13.add(txt_intake, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 120, 40));

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 230, 60));

        jPanel14.setBackground(new java.awt.Color(255, 0, 0));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/ANBIcons/icons8_Collaborator_Male_26px.png"))); // NOI18N
        jPanel14.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, 40));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Gender : ");
        jPanel14.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        CMB_gender.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        CMB_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel14.add(CMB_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 370, 40));

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 480, 60));

        jPanel15.setBackground(new java.awt.Color(255, 0, 0));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/ANBIcons/icons8_Moleskine_26px.png"))); // NOI18N
        jPanel15.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, 40));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Age : ");
        jPanel15.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        txt_age.setBackground(new java.awt.Color(255, 0, 0));
        txt_age.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 6, 0, new java.awt.Color(255, 255, 255)));
        txt_age.setForeground(new java.awt.Color(255, 255, 255));
        txt_age.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jPanel15.add(txt_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 120, 40));

        jPanel1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 230, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 550));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/icons/undraw_building_websites_i78t.png"))); // NOI18N
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 140));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/myicon/Newmember.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, 560, 550));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 500, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rSMaterialButtonCircle6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle6ActionPerformed
        this.dispose();
    }//GEN-LAST:event_rSMaterialButtonCircle6ActionPerformed

    public void clearfield()
   {
        txt_name.setText("");
        txt_stid.setText("");
        txt_age.setText("");
        txt_contact.setText("");
        txt_intake.setText("");
        CMB_faculty.setSelectedItem(null);
        CMB_gender.setSelectedItem(null);
    }
    
    private void rSMaterialButtonCircle4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle4ActionPerformed
        String faculty = CMB_faculty.getSelectedItem().toString();
        String gender = CMB_gender.getSelectedItem().toString();
        
        String StriIntake = txt_intake.getText().toString();
        int InIntake = Integer.parseInt(StriIntake);
        
        String StriAge = txt_age.getText().toString();
        int InAge = Integer.parseInt(StriAge);
        
        AddItemController.mForm(txt_name.getText(), txt_stid.getText(), faculty, InIntake, txt_contact.getText(), InAge, gender);
        clearfield();
    }//GEN-LAST:event_rSMaterialButtonCircle4ActionPerformed

    private void rSMaterialButtonCircle5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle5ActionPerformed
        clearfield();
    }//GEN-LAST:event_rSMaterialButtonCircle5ActionPerformed

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
            java.util.logging.Logger.getLogger(NewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CMB_faculty;
    private javax.swing.JComboBox<String> CMB_gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle4;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle5;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle6;
    private app.bolivia.swing.JCTextField txt_age;
    private app.bolivia.swing.JCTextField txt_contact;
    private app.bolivia.swing.JCTextField txt_intake;
    private app.bolivia.swing.JCTextField txt_name;
    private app.bolivia.swing.JCTextField txt_stid;
    // End of variables declaration//GEN-END:variables
}
