package View;

import Model.DBSearch;
import Model.DBToTable;
import View.ActionViews.IssueBook;
import View.ActionViews.IssueDetails;
import View.ActionViews.ReturnBook;
import View.ActionViews.ReturnDetails;
import View.BookViews.Books;
import View.BookViews.NewBook;
import View.MemberViews.Member;
import View.MemberViews.NewMember;
import View.StaffViews.NewStaff;
import View.StaffViews.Staff;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;

public class Home extends javax.swing.JFrame {

    Color mouseEnterColor1 = new Color(255,95,31);
    Color mouseEnterColor2 = new Color(255,0,0);
    Color mouseExitColor1 = new Color(51,51,51);
    Color mouseExitColor2 = new Color(102,102,102);
    Color mouseExitColor3 = new Color(0,0,0);
    Color mouseExitColor4 = new Color(255,255,255);
    
    public Home() {
        initComponents();
        countLabels();
        tableIssueLoad();
        tableOverDueLoad();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pan_horizonLMS = new javax.swing.JPanel();
        lab_menu = new javax.swing.JLabel();
        pan_menudec = new javax.swing.JPanel();
        lab_welcome = new javax.swing.JLabel();
        lab_horizonLMS = new javax.swing.JLabel();
        resetBtn1 = new rojerusan.RSMaterialButtonCircle();
        pan_menu = new javax.swing.JPanel();
        pan_homepage = new javax.swing.JPanel();
        lab_homepage = new javax.swing.JLabel();
        pan_action = new javax.swing.JPanel();
        lab_action = new javax.swing.JLabel();
        pan_issuebook = new javax.swing.JPanel();
        lab_issuebook = new javax.swing.JLabel();
        pan_returnbook = new javax.swing.JPanel();
        lab_returnbook = new javax.swing.JLabel();
        pan_manager = new javax.swing.JPanel();
        lab_manager = new javax.swing.JLabel();
        pan_mbook = new javax.swing.JPanel();
        lab_mbook = new javax.swing.JLabel();
        pan_bup = new javax.swing.JPanel();
        lab_bup = new javax.swing.JLabel();
        pan_badd = new javax.swing.JPanel();
        lab_badd = new javax.swing.JLabel();
        pan_bdelete = new javax.swing.JPanel();
        lab_bdelete = new javax.swing.JLabel();
        pan_mstaff = new javax.swing.JPanel();
        lab_mstaff = new javax.swing.JLabel();
        pan_sdelete = new javax.swing.JPanel();
        lab_sdelete = new javax.swing.JLabel();
        pan_sup = new javax.swing.JPanel();
        lab_sup = new javax.swing.JLabel();
        pan_sadd = new javax.swing.JPanel();
        lab_sadd = new javax.swing.JLabel();
        pan_mmember = new javax.swing.JPanel();
        lab_mmember = new javax.swing.JLabel();
        pan_mdelete = new javax.swing.JPanel();
        lab_mdelete = new javax.swing.JLabel();
        pan_mup = new javax.swing.JPanel();
        lab_mup = new javax.swing.JLabel();
        pan_madd = new javax.swing.JPanel();
        lab_madd = new javax.swing.JLabel();
        pan_logout = new javax.swing.JPanel();
        lab_logout = new javax.swing.JLabel();
        pan_mid = new javax.swing.JPanel();
        lab_mid = new javax.swing.JLabel();
        pan_mrd = new javax.swing.JPanel();
        lab_mrd = new javax.swing.JLabel();
        pan_stats = new javax.swing.JPanel();
        pan_nos = new javax.swing.JPanel();
        lab_nos = new javax.swing.JLabel();
        lab_staffCount = new javax.swing.JLabel();
        pan_nob = new javax.swing.JPanel();
        lab_nob = new javax.swing.JLabel();
        lab_bookCount = new javax.swing.JLabel();
        pan_nom = new javax.swing.JPanel();
        lab_nom = new javax.swing.JLabel();
        lab_memberCount = new javax.swing.JLabel();
        resetBtn = new rojerusan.RSMaterialButtonCircle();
        pan_overdue = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        overduetable = new rojeru_san.complementos.RSTableMetro();
        pan_odbtotal = new javax.swing.JPanel();
        lab_odbtotal = new javax.swing.JLabel();
        lab_overCount = new javax.swing.JLabel();
        lab_odb = new javax.swing.JLabel();
        pan_issue = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        issuetable = new rojeru_san.complementos.RSTableMetro();
        pan_ibtotal = new javax.swing.JPanel();
        lab_ibtotal = new javax.swing.JLabel();
        lab_issueCount = new javax.swing.JLabel();
        lab_ib = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1300, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pan_horizonLMS.setBackground(new java.awt.Color(0, 0, 0));
        pan_horizonLMS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/adminIcons/icons8_menu_48px_1.png"))); // NOI18N
        pan_horizonLMS.add(lab_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 50));

        pan_menudec.setBackground(new java.awt.Color(255, 255, 255));
        pan_horizonLMS.add(pan_menudec, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 3, 5, 45));

        lab_welcome.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lab_welcome.setForeground(new java.awt.Color(255, 255, 255));
        lab_welcome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/adminIcons/male_user_50px.png"))); // NOI18N
        lab_welcome.setText("Welcome Admin");
        pan_horizonLMS.add(lab_welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, 200, 50));

        lab_horizonLMS.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lab_horizonLMS.setForeground(new java.awt.Color(255, 255, 255));
        lab_horizonLMS.setText("Horizon Library Management System");
        pan_horizonLMS.add(lab_horizonLMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 310, 50));

        resetBtn1.setBackground(new java.awt.Color(255, 0, 0));
        resetBtn1.setText("X");
        resetBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtn1ActionPerformed(evt);
            }
        });
        pan_horizonLMS.add(resetBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 5, 40, 40));

        getContentPane().add(pan_horizonLMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 50));

        pan_menu.setBackground(new java.awt.Color(255, 255, 255));
        pan_menu.setMinimumSize(new java.awt.Dimension(300, 600));
        pan_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pan_homepage.setBackground(new java.awt.Color(0, 0, 0));
        pan_homepage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_homepage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lab_homepage.setForeground(new java.awt.Color(255, 255, 255));
        lab_homepage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/adminIcons/icons8_Home_26px_2.png"))); // NOI18N
        lab_homepage.setText("Home Page");
        pan_homepage.add(lab_homepage, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 110, 40));

        pan_menu.add(pan_homepage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 300, 40));

        pan_action.setBackground(new java.awt.Color(0, 0, 0));
        pan_action.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_action.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lab_action.setForeground(new java.awt.Color(255, 255, 255));
        lab_action.setText("Actions");
        pan_action.add(lab_action, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 60, 40));

        pan_issuebook.setBackground(new java.awt.Color(51, 51, 51));
        pan_issuebook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_issuebook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lab_issuebook.setForeground(new java.awt.Color(255, 255, 255));
        lab_issuebook.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_issuebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/adminIcons/icons8_Sell_26px.png"))); // NOI18N
        lab_issuebook.setText("Issue Book");
        lab_issuebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_issuebookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab_issuebookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab_issuebookMouseExited(evt);
            }
        });
        pan_issuebook.add(lab_issuebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 5, 150, 30));

        pan_action.add(pan_issuebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 300, 40));

        pan_returnbook.setBackground(new java.awt.Color(102, 102, 102));
        pan_returnbook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_returnbook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lab_returnbook.setForeground(new java.awt.Color(255, 255, 255));
        lab_returnbook.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_returnbook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/adminIcons/icons8_Return_Purchase_26px.png"))); // NOI18N
        lab_returnbook.setText("Return Book");
        lab_returnbook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_returnbookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab_returnbookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab_returnbookMouseExited(evt);
            }
        });
        pan_returnbook.add(lab_returnbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 5, 150, 30));

        pan_action.add(pan_returnbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 300, 40));

        pan_menu.add(pan_action, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 300, 120));

        pan_manager.setBackground(new java.awt.Color(0, 0, 0));
        pan_manager.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_manager.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lab_manager.setForeground(new java.awt.Color(255, 255, 255));
        lab_manager.setText("Manager");
        pan_manager.add(lab_manager, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 70, 40));

        pan_menu.add(pan_manager, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 300, 40));

        pan_mbook.setBackground(new java.awt.Color(0, 0, 0));
        pan_mbook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_mbook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lab_mbook.setForeground(new java.awt.Color(255, 255, 255));
        lab_mbook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/adminIcons/icons8_Book_26px.png"))); // NOI18N
        lab_mbook.setText("Manage Books");
        pan_mbook.add(lab_mbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 130, 40));

        pan_bup.setBackground(new java.awt.Color(51, 51, 51));
        pan_bup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_bup.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lab_bup.setForeground(new java.awt.Color(255, 255, 255));
        lab_bup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_bup.setText("Update");
        lab_bup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_bupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab_bupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab_bupMouseExited(evt);
            }
        });
        pan_bup.add(lab_bup, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 50, 30));

        pan_mbook.add(pan_bup, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 100, 50));

        pan_badd.setBackground(new java.awt.Color(102, 102, 102));
        pan_badd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_badd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lab_badd.setForeground(new java.awt.Color(255, 255, 255));
        lab_badd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_badd.setText("ADD");
        lab_badd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_baddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab_baddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab_baddMouseExited(evt);
            }
        });
        pan_badd.add(lab_badd, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 50, 30));

        pan_mbook.add(pan_badd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 100, 50));

        pan_bdelete.setBackground(new java.awt.Color(102, 102, 102));
        pan_bdelete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_bdelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lab_bdelete.setForeground(new java.awt.Color(255, 255, 255));
        lab_bdelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_bdelete.setText("Delete");
        lab_bdelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_bdeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab_bdeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab_bdeleteMouseExited(evt);
            }
        });
        pan_bdelete.add(lab_bdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 50, 30));

        pan_mbook.add(pan_bdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 100, 50));

        pan_menu.add(pan_mbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 300, 90));

        pan_mstaff.setBackground(new java.awt.Color(0, 0, 0));
        pan_mstaff.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_mstaff.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lab_mstaff.setForeground(new java.awt.Color(255, 255, 255));
        lab_mstaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/adminIcons/icons8_Library_26px_1.png"))); // NOI18N
        lab_mstaff.setText("Manage Staff");
        pan_mstaff.add(lab_mstaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 120, 40));

        pan_sdelete.setBackground(new java.awt.Color(102, 102, 102));
        pan_sdelete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_sdelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lab_sdelete.setForeground(new java.awt.Color(255, 255, 255));
        lab_sdelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_sdelete.setText("Delete");
        lab_sdelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_sdeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab_sdeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab_sdeleteMouseExited(evt);
            }
        });
        pan_sdelete.add(lab_sdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 50, 30));

        pan_mstaff.add(pan_sdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 100, 50));

        pan_sup.setBackground(new java.awt.Color(51, 51, 51));
        pan_sup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_sup.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lab_sup.setForeground(new java.awt.Color(255, 255, 255));
        lab_sup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_sup.setText("Update");
        lab_sup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_supMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab_supMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab_supMouseExited(evt);
            }
        });
        pan_sup.add(lab_sup, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 50, 30));

        pan_mstaff.add(pan_sup, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 100, 50));

        pan_sadd.setBackground(new java.awt.Color(102, 102, 102));
        pan_sadd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_sadd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lab_sadd.setForeground(new java.awt.Color(255, 255, 255));
        lab_sadd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_sadd.setText("ADD");
        lab_sadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_saddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab_saddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab_saddMouseExited(evt);
            }
        });
        pan_sadd.add(lab_sadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 50, 30));

        pan_mstaff.add(pan_sadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 100, 50));

        pan_menu.add(pan_mstaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 300, 90));

        pan_mmember.setBackground(new java.awt.Color(0, 0, 0));
        pan_mmember.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_mmember.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lab_mmember.setForeground(new java.awt.Color(255, 255, 255));
        lab_mmember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/adminIcons/icons8_Read_Online_26px.png"))); // NOI18N
        lab_mmember.setText("Manage Member");
        pan_mmember.add(lab_mmember, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 140, 40));

        pan_mdelete.setBackground(new java.awt.Color(102, 102, 102));
        pan_mdelete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_mdelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lab_mdelete.setForeground(new java.awt.Color(255, 255, 255));
        lab_mdelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_mdelete.setText("Delete");
        lab_mdelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_mdeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab_mdeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab_mdeleteMouseExited(evt);
            }
        });
        pan_mdelete.add(lab_mdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 50, 30));

        pan_mmember.add(pan_mdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 100, 50));

        pan_mup.setBackground(new java.awt.Color(51, 51, 51));
        pan_mup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_mup.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lab_mup.setForeground(new java.awt.Color(255, 255, 255));
        lab_mup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_mup.setText("Update");
        lab_mup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_mupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab_mupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab_mupMouseExited(evt);
            }
        });
        pan_mup.add(lab_mup, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 50, 30));

        pan_mmember.add(pan_mup, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 100, 50));

        pan_madd.setBackground(new java.awt.Color(102, 102, 102));
        pan_madd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_madd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lab_madd.setForeground(new java.awt.Color(255, 255, 255));
        lab_madd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_madd.setText("ADD");
        lab_madd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_maddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab_maddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab_maddMouseExited(evt);
            }
        });
        pan_madd.add(lab_madd, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 50, 30));

        pan_mmember.add(pan_madd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 100, 50));

        pan_menu.add(pan_mmember, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 300, 90));

        pan_logout.setBackground(new java.awt.Color(0, 0, 0));
        pan_logout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_logout.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lab_logout.setForeground(new java.awt.Color(255, 255, 255));
        lab_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/adminIcons/icons8_Exit_26px_2.png"))); // NOI18N
        lab_logout.setText("Logout");
        lab_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab_logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab_logoutMouseExited(evt);
            }
        });
        pan_logout.add(lab_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 110, 40));

        pan_menu.add(pan_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 300, 40));

        pan_mid.setBackground(new java.awt.Color(102, 102, 102));
        pan_mid.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_mid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lab_mid.setForeground(new java.awt.Color(255, 255, 255));
        lab_mid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_mid.setText("Manage Issue Details");
        lab_mid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_midMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab_midMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab_midMouseExited(evt);
            }
        });
        pan_mid.add(lab_mid, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 5, 150, 30));

        pan_menu.add(pan_mid, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 300, 40));

        pan_mrd.setBackground(new java.awt.Color(51, 51, 51));
        pan_mrd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_mrd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lab_mrd.setForeground(new java.awt.Color(255, 255, 255));
        lab_mrd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_mrd.setText("Manage Return Details");
        lab_mrd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_mrdMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab_mrdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab_mrdMouseExited(evt);
            }
        });
        pan_mrd.add(lab_mrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 5, 150, 30));

        pan_menu.add(pan_mrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 300, 40));

        getContentPane().add(pan_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 300, 610));

        pan_stats.setBackground(new java.awt.Color(255, 255, 255));
        pan_stats.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        pan_stats.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pan_nos.setBackground(new java.awt.Color(255, 255, 255));
        pan_nos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 15, 1, new java.awt.Color(0, 0, 255)));
        pan_nos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_nos.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lab_nos.setText("No. of Staff");
        pan_nos.add(lab_nos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 20));

        lab_staffCount.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        lab_staffCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_staffCount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/adminIcons/icons8_People_50px.png"))); // NOI18N
        lab_staffCount.setText("0000");
        pan_nos.add(lab_staffCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 150, 70));

        pan_stats.add(pan_nos, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 200, 140));

        pan_nob.setBackground(new java.awt.Color(255, 255, 255));
        pan_nob.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 15, 1, new java.awt.Color(0, 0, 255)));
        pan_nob.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_nob.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lab_nob.setText("No. of Books");
        pan_nob.add(lab_nob, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 20));

        lab_bookCount.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        lab_bookCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_bookCount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/adminIcons/icons8_Book_Shelf_50px.png"))); // NOI18N
        lab_bookCount.setText("0000");
        pan_nob.add(lab_bookCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 150, 70));

        pan_stats.add(pan_nob, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 200, 140));

        pan_nom.setBackground(new java.awt.Color(255, 255, 255));
        pan_nom.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 15, 1, new java.awt.Color(255, 0, 0)));
        pan_nom.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_nom.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        lab_nom.setText("No. of Members");
        pan_nom.add(lab_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 30));

        lab_memberCount.setFont(new java.awt.Font("Segoe UI Black", 0, 40)); // NOI18N
        lab_memberCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_memberCount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/ANBIcons/icons8_Student_Male_100px.png"))); // NOI18N
        lab_memberCount.setText("0000");
        pan_nom.add(lab_memberCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 220, 100));

        pan_stats.add(pan_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 300, 160));

        resetBtn.setBackground(new java.awt.Color(255, 0, 0));
        resetBtn.setText("R");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        pan_stats.add(resetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, 40, 40));

        getContentPane().add(pan_stats, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 1000, 190));

        pan_overdue.setBackground(new java.awt.Color(255, 255, 255));
        pan_overdue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        pan_overdue.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        overduetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Book Name", "Member ID", "Member Name", "Due Date"
            }
        ));
        overduetable.setColorBackgoundHead(new java.awt.Color(0, 0, 255));
        overduetable.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        overduetable.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        overduetable.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        overduetable.setColorSelBackgound(new java.awt.Color(255, 0, 0));
        overduetable.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        overduetable.setFuenteFilas(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        overduetable.setFuenteFilasSelect(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        overduetable.setFuenteHead(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        overduetable.setRowHeight(22);
        jScrollPane2.setViewportView(overduetable);

        pan_overdue.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 770, 190));

        pan_odbtotal.setBackground(new java.awt.Color(255, 255, 255));
        pan_odbtotal.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 15, 1, new java.awt.Color(0, 0, 0)));
        pan_odbtotal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_odbtotal.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lab_odbtotal.setText("Total");
        pan_odbtotal.add(lab_odbtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 120, 30));

        lab_overCount.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lab_overCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_overCount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/ANBIcons/icons8_Edit_Property_50px.png"))); // NOI18N
        lab_overCount.setText("0000");
        pan_odbtotal.add(lab_overCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 120, 70));

        pan_overdue.add(pan_odbtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 140, 120));

        lab_odb.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lab_odb.setText("Overdue Books");
        pan_overdue.add(lab_odb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 40));

        getContentPane().add(pan_overdue, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 1000, 210));

        pan_issue.setBackground(new java.awt.Color(255, 255, 255));
        pan_issue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        pan_issue.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        issuetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Name", "Member ID", "Member Name", "Issued Date", "Due Date"
            }
        ));
        issuetable.setColorBackgoundHead(new java.awt.Color(0, 0, 255));
        issuetable.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        issuetable.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        issuetable.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        issuetable.setColorSelBackgound(new java.awt.Color(255, 0, 0));
        issuetable.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        issuetable.setFuenteFilas(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        issuetable.setFuenteFilasSelect(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        issuetable.setFuenteHead(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        issuetable.setRowHeight(22);
        jScrollPane1.setViewportView(issuetable);

        pan_issue.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 770, 190));

        pan_ibtotal.setBackground(new java.awt.Color(255, 255, 255));
        pan_ibtotal.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 15, 1, new java.awt.Color(0, 0, 0)));
        pan_ibtotal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_ibtotal.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lab_ibtotal.setText("Total");
        pan_ibtotal.add(lab_ibtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 120, 30));

        lab_issueCount.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lab_issueCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_issueCount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/ANBIcons/icons8_Books_52px_1.png"))); // NOI18N
        lab_issueCount.setText("0000");
        pan_ibtotal.add(lab_issueCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 120, 70));

        pan_issue.add(pan_ibtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 140, 120));

        lab_ib.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lab_ib.setText("Issued Books");
        pan_issue.add(lab_ib, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 40));

        getContentPane().add(pan_issue, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 1000, 210));

        setSize(new java.awt.Dimension(1300, 650));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lab_issuebookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_issuebookMouseEntered
        pan_issuebook.setBackground(mouseEnterColor1);
    }//GEN-LAST:event_lab_issuebookMouseEntered

    private void lab_issuebookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_issuebookMouseExited
        pan_issuebook.setBackground(mouseExitColor1);
    }//GEN-LAST:event_lab_issuebookMouseExited

    private void lab_midMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_midMouseEntered
        pan_mid.setBackground(mouseEnterColor1);
    }//GEN-LAST:event_lab_midMouseEntered

    private void lab_midMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_midMouseExited
        pan_mid.setBackground(mouseExitColor2);
    }//GEN-LAST:event_lab_midMouseExited

    private void lab_returnbookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_returnbookMouseEntered
        pan_returnbook.setBackground(mouseEnterColor1);
    }//GEN-LAST:event_lab_returnbookMouseEntered

    private void lab_returnbookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_returnbookMouseExited
        pan_returnbook.setBackground(mouseExitColor2);
    }//GEN-LAST:event_lab_returnbookMouseExited

    private void lab_mrdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_mrdMouseEntered
        pan_mrd.setBackground(mouseEnterColor1);
    }//GEN-LAST:event_lab_mrdMouseEntered

    private void lab_mrdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_mrdMouseExited
        pan_mrd.setBackground(mouseExitColor1);
    }//GEN-LAST:event_lab_mrdMouseExited

    private void lab_baddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_baddMouseEntered
        pan_badd.setBackground(mouseEnterColor1);
    }//GEN-LAST:event_lab_baddMouseEntered

    private void lab_baddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_baddMouseExited
        pan_badd.setBackground(mouseExitColor2);
    }//GEN-LAST:event_lab_baddMouseExited

    private void lab_bupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_bupMouseEntered
        pan_bup.setBackground(mouseEnterColor1);
    }//GEN-LAST:event_lab_bupMouseEntered

    private void lab_bupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_bupMouseExited
        pan_bup.setBackground(mouseExitColor1);
    }//GEN-LAST:event_lab_bupMouseExited

    private void lab_bdeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_bdeleteMouseEntered
        pan_bdelete.setBackground(mouseEnterColor2);
    }//GEN-LAST:event_lab_bdeleteMouseEntered

    private void lab_bdeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_bdeleteMouseExited
        pan_bdelete.setBackground(mouseExitColor2);
    }//GEN-LAST:event_lab_bdeleteMouseExited

    private void lab_maddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_maddMouseEntered
        pan_madd.setBackground(mouseEnterColor1);
    }//GEN-LAST:event_lab_maddMouseEntered

    private void lab_maddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_maddMouseExited
        pan_madd.setBackground(mouseExitColor2);
    }//GEN-LAST:event_lab_maddMouseExited

    private void lab_mupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_mupMouseEntered
        pan_mup.setBackground(mouseEnterColor1);
    }//GEN-LAST:event_lab_mupMouseEntered

    private void lab_mupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_mupMouseExited
        pan_mup.setBackground(mouseExitColor1);
    }//GEN-LAST:event_lab_mupMouseExited

    private void lab_mdeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_mdeleteMouseEntered
        pan_mdelete.setBackground(mouseEnterColor2);
    }//GEN-LAST:event_lab_mdeleteMouseEntered

    private void lab_mdeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_mdeleteMouseExited
        pan_mdelete.setBackground(mouseExitColor2);
    }//GEN-LAST:event_lab_mdeleteMouseExited

    private void lab_saddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_saddMouseEntered
        pan_sadd.setBackground(mouseEnterColor1);
    }//GEN-LAST:event_lab_saddMouseEntered

    private void lab_saddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_saddMouseExited
        pan_sadd.setBackground(mouseExitColor2);
    }//GEN-LAST:event_lab_saddMouseExited

    private void lab_supMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_supMouseEntered
        pan_sup.setBackground(mouseEnterColor1);
    }//GEN-LAST:event_lab_supMouseEntered

    private void lab_supMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_supMouseExited
        pan_sup.setBackground(mouseExitColor1);
    }//GEN-LAST:event_lab_supMouseExited

    private void lab_sdeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_sdeleteMouseEntered
        pan_sdelete.setBackground(mouseEnterColor2);
    }//GEN-LAST:event_lab_sdeleteMouseEntered

    private void lab_sdeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_sdeleteMouseExited
        pan_sdelete.setBackground(mouseExitColor2);
    }//GEN-LAST:event_lab_sdeleteMouseExited

    private void lab_logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_logoutMouseEntered
        pan_logout.setBackground(mouseEnterColor2);
    }//GEN-LAST:event_lab_logoutMouseEntered

    private void lab_logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_logoutMouseExited
        pan_logout.setBackground(mouseExitColor3);
    }//GEN-LAST:event_lab_logoutMouseExited

    private void lab_baddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_baddMouseClicked
        NewBook NB = new NewBook();
        NB.setVisible(true);
    }//GEN-LAST:event_lab_baddMouseClicked

    private void lab_maddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_maddMouseClicked
        NewMember NM = new NewMember();
        NM.setVisible(true);
    }//GEN-LAST:event_lab_maddMouseClicked

    private void lab_saddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_saddMouseClicked
        NewStaff NS = new NewStaff();
        NS.setVisible(true);
    }//GEN-LAST:event_lab_saddMouseClicked

    private void lab_bupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_bupMouseClicked
        Books Bk = new Books();
        Bk.setVisible(true);
    }//GEN-LAST:event_lab_bupMouseClicked

    private void lab_bdeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_bdeleteMouseClicked
        Books Bk = new Books();
        Bk.setVisible(true);
    }//GEN-LAST:event_lab_bdeleteMouseClicked

    private void lab_mupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_mupMouseClicked
        Member mem = new Member();
        mem.setVisible(true);
    }//GEN-LAST:event_lab_mupMouseClicked

    private void lab_mdeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_mdeleteMouseClicked
        Member mem = new Member();
        mem.setVisible(true);
    }//GEN-LAST:event_lab_mdeleteMouseClicked

    private void lab_supMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_supMouseClicked
        Staff staf = new Staff();
        staf.setVisible(true);
    }//GEN-LAST:event_lab_supMouseClicked

    private void lab_sdeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_sdeleteMouseClicked
        Staff staf = new Staff();
        staf.setVisible(true);
    }//GEN-LAST:event_lab_sdeleteMouseClicked

    private void lab_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_logoutMouseClicked
        LoginForm login = new LoginForm();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lab_logoutMouseClicked

    private void lab_issuebookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_issuebookMouseClicked
        IssueBook isbook = new IssueBook();
        isbook.setVisible(true);
    }//GEN-LAST:event_lab_issuebookMouseClicked

    private void lab_returnbookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_returnbookMouseClicked
        ReturnBook rebook = new ReturnBook();
        rebook.setVisible(true);
    }//GEN-LAST:event_lab_returnbookMouseClicked

    private void lab_midMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_midMouseClicked
        IssueDetails issueData = new IssueDetails();
        issueData.setVisible(true);
    }//GEN-LAST:event_lab_midMouseClicked

    private void lab_mrdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_mrdMouseClicked
        ReturnDetails returnData = new ReturnDetails();
        returnData.setVisible(true);
    }//GEN-LAST:event_lab_mrdMouseClicked

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        tableIssueLoad();
        tableOverDueLoad();
        countLabels();
    }//GEN-LAST:event_resetBtnActionPerformed

    private void resetBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtn1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_resetBtn1ActionPerformed
    
    public void countLabels(){
        
        try {
            
            ResultSet member = new DBSearch().searchMember();
            member.last();
            lab_memberCount.setText(Integer.toString(member.getRow()));
            
            ResultSet book = new DBSearch().searchBook();
            book.last();
            lab_bookCount.setText(Integer.toString(book.getRow()));
            
            ResultSet staff = new DBSearch().searchStaff();
            staff.last();
            lab_staffCount.setText(Integer.toString(staff.getRow()));
            
            ResultSet issue = new DBSearch().searchIssueBook();
            issue.last();
            lab_issueCount.setText(Integer.toString(issue.getRow()));
            
            ResultSet overDue = new DBSearch().searchOverDueBook();
            overDue.last();
            lab_overCount.setText(Integer.toString(overDue.getRow()));            
            
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void tableIssueLoad(){
        ResultSet s =new DBToTable().tableHomeIssueDetails();
        issuetable.setModel(DbUtils.resultSetToTableModel(s));
    }

    public void tableOverDueLoad(){
        ResultSet s =new DBToTable().tableHomeOverDueDetails();
        overduetable.setModel(DbUtils.resultSetToTableModel(s));
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSTableMetro issuetable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lab_action;
    private javax.swing.JLabel lab_badd;
    private javax.swing.JLabel lab_bdelete;
    private javax.swing.JLabel lab_bookCount;
    private javax.swing.JLabel lab_bup;
    private javax.swing.JLabel lab_homepage;
    private javax.swing.JLabel lab_horizonLMS;
    private javax.swing.JLabel lab_ib;
    private javax.swing.JLabel lab_ibtotal;
    private javax.swing.JLabel lab_issueCount;
    private javax.swing.JLabel lab_issuebook;
    private javax.swing.JLabel lab_logout;
    private javax.swing.JLabel lab_madd;
    private javax.swing.JLabel lab_manager;
    private javax.swing.JLabel lab_mbook;
    private javax.swing.JLabel lab_mdelete;
    private javax.swing.JLabel lab_memberCount;
    private javax.swing.JLabel lab_menu;
    private javax.swing.JLabel lab_mid;
    private javax.swing.JLabel lab_mmember;
    private javax.swing.JLabel lab_mrd;
    private javax.swing.JLabel lab_mstaff;
    private javax.swing.JLabel lab_mup;
    private javax.swing.JLabel lab_nob;
    private javax.swing.JLabel lab_nom;
    private javax.swing.JLabel lab_nos;
    private javax.swing.JLabel lab_odb;
    private javax.swing.JLabel lab_odbtotal;
    private javax.swing.JLabel lab_overCount;
    private javax.swing.JLabel lab_returnbook;
    private javax.swing.JLabel lab_sadd;
    private javax.swing.JLabel lab_sdelete;
    private javax.swing.JLabel lab_staffCount;
    private javax.swing.JLabel lab_sup;
    private javax.swing.JLabel lab_welcome;
    private rojeru_san.complementos.RSTableMetro overduetable;
    private javax.swing.JPanel pan_action;
    private javax.swing.JPanel pan_badd;
    private javax.swing.JPanel pan_bdelete;
    private javax.swing.JPanel pan_bup;
    private javax.swing.JPanel pan_homepage;
    private javax.swing.JPanel pan_horizonLMS;
    private javax.swing.JPanel pan_ibtotal;
    private javax.swing.JPanel pan_issue;
    private javax.swing.JPanel pan_issuebook;
    private javax.swing.JPanel pan_logout;
    private javax.swing.JPanel pan_madd;
    private javax.swing.JPanel pan_manager;
    private javax.swing.JPanel pan_mbook;
    private javax.swing.JPanel pan_mdelete;
    private javax.swing.JPanel pan_menu;
    private javax.swing.JPanel pan_menudec;
    private javax.swing.JPanel pan_mid;
    private javax.swing.JPanel pan_mmember;
    private javax.swing.JPanel pan_mrd;
    private javax.swing.JPanel pan_mstaff;
    private javax.swing.JPanel pan_mup;
    private javax.swing.JPanel pan_nob;
    private javax.swing.JPanel pan_nom;
    private javax.swing.JPanel pan_nos;
    private javax.swing.JPanel pan_odbtotal;
    private javax.swing.JPanel pan_overdue;
    private javax.swing.JPanel pan_returnbook;
    private javax.swing.JPanel pan_sadd;
    private javax.swing.JPanel pan_sdelete;
    private javax.swing.JPanel pan_stats;
    private javax.swing.JPanel pan_sup;
    private rojerusan.RSMaterialButtonCircle resetBtn;
    private rojerusan.RSMaterialButtonCircle resetBtn1;
    // End of variables declaration//GEN-END:variables
}
