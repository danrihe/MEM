/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elena
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;
import java.io.File;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

public class MainFrame extends java.awt.Frame {

    /**
     * Creates new form MainFrame
     */
    private ArrayList<Member> memberList;
    private ArrayList<Member> coachList;
    private ArrayList<Session> practiceList;
    private Calendar calendar;
    private SimpleDateFormat sdf;
    //private JButton[] calendarButtons;
    int coachMessageButtonCounter = 0;
    int coachNotificationButtonCounter = 0;
    int memberButtonCounter = 0;
    int memberNotificationButtonCounter = 0;
    int memberCalendarButtonCounter = 0;
    int financesButtonCounter = 0;
    int manageButtonCounter = 0;
    int treasurerNotifButtonCounter = 0;
    String memberMessage = "";
    String messages = "";
    final String USERFILE = "resources/userDatabase_2.txt";
    final String MESSAGESFILE = "resources/messages.txt";
    final String FINANCESFILE = "resources/finances.txt";
    final String FINANCESHISTORYFILE = "resources/financesHistory.txt";
    final String SESSIONSFILE = "resources/sessions.txt";
    final String EXPENSESFILE = "resources/expenses.txt";
    final String REVENUESFILE = "resources/revenues.txt";
    String accountType = "", memName = "";
    Object[][] financesTable = new Object[12][4];
    Object[][] incomeStatement = new Object[18][3];
    Object[][] membersTable;
    
    boolean member;
    Member curMem;
    
    ActionListener listener1 = new CreateListener1(),
                listener2 = new CreateListener2(),
                listener3 = new CreateListener3(),
                listener4 = new CreateListener4(),
                listener5 = new CreateListener5(),
                listener6 = new CreateListener6(),
                listener7 = new CreateListener7(),
                listener8 = new CreateListener8(),
                listener9 = new CreateListener9(),
                listener10 = new CreateListener10(),
                listener11 = new CreateListener11(),
                listener12 = new CreateListener12(),
                listener13 = new CreateListener13(),
                listener14 = new CreateListener14(),
                listener15 = new CreateListener15(),
                listener16 = new CreateListener16(),
                listener17 = new CreateListener17(),
                listener18 = new CreateListener18(),
                listener19 = new CreateListener19(),
                listener20 = new CreateListener20(),
                listener21 = new CreateListener21(),
                listener22 = new CreateListener22(),
                listener23 = new CreateListener23(),
                listener24 = new CreateListener24(),
                listener25 = new CreateListener25(),
                listener26 = new CreateListener26(),
                listener27 = new CreateListener27(),
                listener28 = new CreateListener28(),
                listener29 = new CreateListener29(),
                listener30 = new CreateListener30(),
                listener31 = new CreateListener31();
    
    public MainFrame() {
        initComponents();
        
        calendar = Calendar.getInstance();
        sdf = new SimpleDateFormat("EEE, MMM dd, yyyy");    //declare simpledateformat object
        dateLabel.setText(sdf.format(this.calendar.getTime()));
        passwordField.setText("");
        
        practiceList = new ArrayList<>();
        
        CoachHomePanel.setVisible(false);
        TreasurerHomePanel.setVisible(false);
        memberHomePanel.setVisible(false);
        membersPanel.setVisible(false);
        messagePanel.setVisible(false);
        treasurerNotificationsPanel.setVisible(false);
        incomeStatementPanel.setVisible(false);
        financesPanel.setVisible(false);
        calendarPanel.setVisible(false);
        addMemberPanel.setVisible(false);
        tNotifBackButton.setVisible(false);
        coachNotificationPanel.setVisible(false);
        paymentPanel.setVisible(false);
        coachesPanel.setVisible(false);
        scheduledTextArea.setEditable(false);
        
        calendarPanel.setEnabled(false);
        CoachHomePanel.setEnabled(false);
        TreasurerHomePanel.setEnabled(false);
        memberHomePanel.setEnabled(false);
        membersPanel.setEnabled(false);
        messagePanel.setEnabled(false);
        treasurerNotificationsPanel.setEnabled(false);
        incomeStatementPanel.setEnabled(false);
        financesPanel.setEnabled(false);
        calendarPanel.setEnabled(false);
        addMemberPanel.setEnabled(false);
        tNotifBackButton.setEnabled(false);
        paymentPanel.setEnabled(false);
        coachesPanel.setEnabled(false);

        whiteOut();  
        //resetFinances();  
        
        boolean addressFirstClick = true;
        if (addressFirstClick)
        {
            addressFirstClick = false;
            mailingAddressTextbox.addMouseListener(new MouseAdapter(){
                @Override
            public void mouseClicked(MouseEvent e){
                mailingAddressTextbox.setText("");
                }
            });
        }
        
        
        financesTable[1][1] = "Test";
        jTable2.getModel().setValueAt(financesTable[1][1], 1, 1);
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paymentMethodbuttonGroup = new javax.swing.ButtonGroup();
        CoachHomePanel = new javax.swing.JPanel();
        membersButton = new javax.swing.JButton();
        messageButton = new javax.swing.JButton();
        coachNotificationsButton = new javax.swing.JButton();
        coachLogoutButton = new javax.swing.JButton();
        coachCalendarButton = new javax.swing.JButton();
        coachCornerBanner = new javax.swing.JLabel();
        coachMessagePicture = new javax.swing.JLabel();
        coachNoNotifPic = new javax.swing.JLabel();
        memberButtonPic = new javax.swing.JLabel();
        calendarButtonPic = new javax.swing.JLabel();
        logoutButtonPic = new javax.swing.JLabel();
        MainFramePanel = new javax.swing.JPanel();
        userNameLable = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        passwordLable = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        dateLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        TreasurerHomePanel = new javax.swing.JPanel();
        financesButton = new javax.swing.JButton();
        manageButton = new javax.swing.JButton();
        TreasurerNotifButton = new javax.swing.JButton();
        treasurerLogoutButton = new javax.swing.JButton();
        treasurerCalendarButton = new javax.swing.JButton();
        treasurerBannerPic = new javax.swing.JLabel();
        treasurerLogoutButtonPic = new javax.swing.JLabel();
        treasurerCalendarButtonPic = new javax.swing.JLabel();
        treasurerNotifButtonPic = new javax.swing.JLabel();
        treasurerManageButtonPic = new javax.swing.JLabel();
        treasurerFinancesButtonPic = new javax.swing.JLabel();
        memberHomePanel = new javax.swing.JPanel();
        memberNotificationsButton = new javax.swing.JButton();
        memberLogoutButton = new javax.swing.JButton();
        memberCalendarButton = new javax.swing.JButton();
        memberBannerPic = new javax.swing.JLabel();
        memberLogoutButtonPic = new javax.swing.JLabel();
        memberNotifButtonPic = new javax.swing.JLabel();
        memberCalendarPic = new javax.swing.JLabel();
        memberPaymentButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        financesPanel = new javax.swing.JPanel();
        tabbedPane = new javax.swing.JTabbedPane();
        incomeStatementPanel = new javax.swing.JPanel();
        expensesLabel = new javax.swing.JLabel();
        tableScrollPane = new javax.swing.JScrollPane();
        incomeStatementTable = new javax.swing.JTable();
        monthExpenseLabel = new javax.swing.JLabel();
        yearExpenseLabel = new javax.swing.JLabel();
        hallExpenseLabel = new javax.swing.JLabel();
        coachExpenseLabel = new javax.swing.JLabel();
        inputExpensesButton = new javax.swing.JButton();
        monthTableLabel = new javax.swing.JLabel();
        yearTableLabel = new javax.swing.JLabel();
        displayButton = new javax.swing.JButton();
        monthTableComboBox = new javax.swing.JComboBox<>();
        yearTableComboBox = new javax.swing.JComboBox<>();
        otherExpenseLabel = new javax.swing.JLabel();
        monthExpenseComboBox = new javax.swing.JComboBox<>();
        YearExpenseComboBox = new javax.swing.JComboBox<>();
        hallExpenseTextField = new javax.swing.JTextField();
        coachExpenseTextField = new javax.swing.JTextField();
        otherExpenseTextField = new javax.swing.JTextField();
        memberFeesTextField = new javax.swing.JTextField();
        yearRevenueComboBox = new javax.swing.JComboBox<>();
        otherRevenueLabel = new javax.swing.JLabel();
        inputRevenueButton = new javax.swing.JButton();
        accountsPayableLabel = new javax.swing.JLabel();
        memberFeesLabel = new javax.swing.JLabel();
        yearRevenueLabel = new javax.swing.JLabel();
        monthRevenueLabel = new javax.swing.JLabel();
        otherRevenueTextField = new javax.swing.JTextField();
        accountsPayableTextField = new javax.swing.JTextField();
        RevenueLabel = new javax.swing.JLabel();
        monthRevenueComboBox = new javax.swing.JComboBox<>();
        historyPane = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        financesBackButton = new javax.swing.JButton();
        backLabel = new javax.swing.JLabel();
        financesLabel = new javax.swing.JLabel();
        treasurerNotificationsPanel = new javax.swing.JPanel();
        tNotifBackButton = new javax.swing.JButton();
        membersPanel = new javax.swing.JPanel();
        membersScrollPane = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        sortLabel = new javax.swing.JLabel();
        sortOptions = new javax.swing.JComboBox<>();
        addMemberButton = new javax.swing.JButton();
        removeMember = new javax.swing.JButton();
        removeMemberLabel = new javax.swing.JLabel();
        removeMemberComboBox = new javax.swing.JComboBox<>();
        membersBackButton = new javax.swing.JButton();
        messagePanel = new javax.swing.JPanel();
        toLabel = new javax.swing.JLabel();
        allMembersButton = new javax.swing.JButton();
        mailingAddressTextbox = new javax.swing.JTextField();
        messageScrollPane = new javax.swing.JScrollPane();
        MessageTextArea = new javax.swing.JTextArea();
        sendButton = new javax.swing.JButton();
        subjectLabel = new javax.swing.JLabel();
        subjectLineTextbox = new javax.swing.JTextField();
        addMemberPanel = new javax.swing.JPanel();
        addMemberLabel = new javax.swing.JLabel();
        addMemberDescriptionLabel = new javax.swing.JLabel();
        addPasswordLabel = new javax.swing.JLabel();
        addFirstLabel = new javax.swing.JLabel();
        addLastLabel = new javax.swing.JLabel();
        addPhoneLabel = new javax.swing.JLabel();
        addAddressLabel = new javax.swing.JLabel();
        addUsernameLabel = new javax.swing.JLabel();
        addAddressTextField = new javax.swing.JTextField();
        addUsernameTextField = new javax.swing.JTextField();
        addFirstNameTextField = new javax.swing.JTextField();
        addLastNameTextField = new javax.swing.JTextField();
        addPhoneTextField = new javax.swing.JTextField();
        addMemberButtonConfirm = new javax.swing.JButton();
        addPasswordField = new javax.swing.JPasswordField();
        calendarPanel = new javax.swing.JPanel();
        monthLabel = new javax.swing.JLabel();
        nextMonthButton = new javax.swing.JButton();
        previousMonthButton = new javax.swing.JButton();
        calButton2 = new javax.swing.JButton();
        calButton3 = new javax.swing.JButton();
        calButton1 = new javax.swing.JButton();
        calButton4 = new javax.swing.JButton();
        calButton5 = new javax.swing.JButton();
        calButton6 = new javax.swing.JButton();
        calButton7 = new javax.swing.JButton();
        calButton8 = new javax.swing.JButton();
        calButton9 = new javax.swing.JButton();
        calButton10 = new javax.swing.JButton();
        calButton11 = new javax.swing.JButton();
        calButton12 = new javax.swing.JButton();
        calButton13 = new javax.swing.JButton();
        calButton14 = new javax.swing.JButton();
        calButton15 = new javax.swing.JButton();
        calButton16 = new javax.swing.JButton();
        calButton17 = new javax.swing.JButton();
        calButton18 = new javax.swing.JButton();
        calButton19 = new javax.swing.JButton();
        calButton20 = new javax.swing.JButton();
        calButton21 = new javax.swing.JButton();
        calButton22 = new javax.swing.JButton();
        calButton23 = new javax.swing.JButton();
        calButton24 = new javax.swing.JButton();
        calButton25 = new javax.swing.JButton();
        calButton26 = new javax.swing.JButton();
        calButton27 = new javax.swing.JButton();
        calButton28 = new javax.swing.JButton();
        calButton29 = new javax.swing.JButton();
        calButton30 = new javax.swing.JButton();
        calButton31 = new javax.swing.JButton();
        calButton32 = new javax.swing.JButton();
        calButton33 = new javax.swing.JButton();
        calButton35 = new javax.swing.JButton();
        calButton34 = new javax.swing.JButton();
        calButton36 = new javax.swing.JButton();
        calButton37 = new javax.swing.JButton();
        calButton38 = new javax.swing.JButton();
        calButton39 = new javax.swing.JButton();
        calButton40 = new javax.swing.JButton();
        calButton41 = new javax.swing.JButton();
        calButton42 = new javax.swing.JButton();
        sundayLabel = new javax.swing.JLabel();
        mondayLabel = new javax.swing.JLabel();
        tuesdayLabel = new javax.swing.JLabel();
        wednesdayLabel = new javax.swing.JLabel();
        thursdayLabel = new javax.swing.JLabel();
        fridayLabel = new javax.swing.JLabel();
        saturdayLabel = new javax.swing.JLabel();
        scheduledScrollPane = new javax.swing.JScrollPane();
        scheduledTextArea = new javax.swing.JTextArea();
        selectedDateLabel = new javax.swing.JLabel();
        classTypeLabel = new javax.swing.JLabel();
        coachLabel = new javax.swing.JLabel();
        hourLabel = new javax.swing.JLabel();
        selectedClassComboBox = new javax.swing.JComboBox<>();
        classesComboBox = new javax.swing.JComboBox<>();
        coachesComboBox = new javax.swing.JComboBox<>();
        hourComboBox = new javax.swing.JComboBox<>();
        minuteLabel = new javax.swing.JLabel();
        minuteComboBox = new javax.swing.JComboBox<>();
        removeScheduledClassButton = new javax.swing.JButton();
        attendingLabel = new javax.swing.JLabel();
        memberAttendingButton = new javax.swing.JButton();
        memberNotAttendingButton = new javax.swing.JButton();
        addClassButton = new javax.swing.JButton();
        calendarBackButton = new javax.swing.JButton();
        calendarBackButtonLabel = new javax.swing.JLabel();
        calendarBanner = new javax.swing.JLabel();
        coachNotificationPanel = new javax.swing.JPanel();
        notifLabel = new javax.swing.JLabel();
        notifScrollPane = new javax.swing.JScrollPane();
        notifTextArea = new javax.swing.JTextArea();
        paymentPanel = new javax.swing.JPanel();
        paymentTotalLabel = new javax.swing.JLabel();
        paymentTotal = new javax.swing.JLabel();
        shoppingCartScrollPane = new javax.swing.JScrollPane();
        shoppingCartTextArea = new javax.swing.JTextArea();
        paymentClassesLabel = new javax.swing.JLabel();
        paymentMethodLabel = new javax.swing.JLabel();
        masterCardRadioButton = new javax.swing.JRadioButton();
        visaRadioButton = new javax.swing.JRadioButton();
        amexRadioButton = new javax.swing.JRadioButton();
        cardNumberLabel = new javax.swing.JLabel();
        cardNumberTextField = new javax.swing.JTextField();
        expiryLabel = new javax.swing.JLabel();
        cvvLabel = new javax.swing.JLabel();
        cvvTextField = new javax.swing.JTextField();
        monthComboBox = new javax.swing.JComboBox<>();
        slashLabel = new javax.swing.JLabel();
        yearComboBox = new javax.swing.JComboBox<>();
        checkOutButton = new javax.swing.JButton();
        removeClassLabel = new javax.swing.JLabel();
        removeClassComboBox = new javax.swing.JComboBox<>();
        removeClassButton = new javax.swing.JButton();
        paymentBackButton = new javax.swing.JButton();
        paymentBackButtonLabel = new javax.swing.JLabel();
        paymentBannerLabel = new javax.swing.JLabel();
        discountCodeLabel = new javax.swing.JLabel();
        discountTextField = new javax.swing.JTextField();
        applyDiscountButton = new javax.swing.JButton();
        coachesPanel = new javax.swing.JPanel();
        coachesScrollPane = new javax.swing.JScrollPane();
        coachesTextArea = new javax.swing.JTextArea();
        addCoachLabel = new javax.swing.JLabel();
        coachUsernameLabel = new javax.swing.JLabel();
        coachPassLabel = new javax.swing.JLabel();
        coachFnameLabel = new javax.swing.JLabel();
        coachLnameLabel = new javax.swing.JLabel();
        coachPhoneLabel = new javax.swing.JLabel();
        coachAddressLabel = new javax.swing.JLabel();
        coachUsernameTextField = new javax.swing.JTextField();
        coachPassTextField = new javax.swing.JTextField();
        coachFnameTextField = new javax.swing.JTextField();
        coachPhoneTextField = new javax.swing.JTextField();
        coachLnameTextField = new javax.swing.JTextField();
        coachAddressTextField = new javax.swing.JTextField();
        removeCoachLabel = new javax.swing.JLabel();
        removeCoachComboBox = new javax.swing.JComboBox<>();
        removeCoachButton = new javax.swing.JButton();
        addCoachButton = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        CoachHomePanel.setBackground(new java.awt.Color(255, 255, 255));
        CoachHomePanel.setMinimumSize(new java.awt.Dimension(800, 650));
        CoachHomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        membersButton.setBackground(new java.awt.Color(255, 255, 255));
        membersButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        membersButton.setText("Members");
        membersButton.setBorder(null);
        membersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                membersButtonActionPerformed(evt);
            }
        });
        CoachHomePanel.add(membersButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 130, 50));

        messageButton.setBackground(new java.awt.Color(255, 255, 255));
        messageButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        messageButton.setText("Message");
        messageButton.setBorder(null);
        messageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageButtonActionPerformed(evt);
            }
        });
        CoachHomePanel.add(messageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 130, 50));

        coachNotificationsButton.setBackground(new java.awt.Color(255, 255, 255));
        coachNotificationsButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        coachNotificationsButton.setText("Notifications");
        coachNotificationsButton.setBorder(null);
        coachNotificationsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coachNotificationsButtonActionPerformed(evt);
            }
        });
        CoachHomePanel.add(coachNotificationsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 130, 50));

        coachLogoutButton.setBackground(new java.awt.Color(255, 255, 255));
        coachLogoutButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        coachLogoutButton.setText("Logout");
        coachLogoutButton.setBorder(null);
        coachLogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coachLogoutButtonActionPerformed(evt);
            }
        });
        CoachHomePanel.add(coachLogoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 130, 50));

        coachCalendarButton.setBackground(new java.awt.Color(255, 255, 255));
        coachCalendarButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        coachCalendarButton.setText("Calendar");
        coachCalendarButton.setBorder(null);
        coachCalendarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coachCalendarButtonActionPerformed(evt);
            }
        });
        CoachHomePanel.add(coachCalendarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 130, 50));

        coachCornerBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/coachBannerPic.png"))); // NOI18N
        CoachHomePanel.add(coachCornerBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 170));

        coachMessagePicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/messageButton.png"))); // NOI18N
        CoachHomePanel.add(coachMessagePicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        coachNoNotifPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/nonotifButton.png"))); // NOI18N
        CoachHomePanel.add(coachNoNotifPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        memberButtonPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/membersButton.png"))); // NOI18N
        CoachHomePanel.add(memberButtonPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        calendarButtonPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/calendarButton.png"))); // NOI18N
        CoachHomePanel.add(calendarButtonPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, -1, -1));

        logoutButtonPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/logoutButton.png"))); // NOI18N
        CoachHomePanel.add(logoutButtonPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, -1, -1));

        MainFramePanel.setBackground(new java.awt.Color(255, 255, 255));
        MainFramePanel.setPreferredSize(new java.awt.Dimension(800, 650));
        MainFramePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userNameLable.setText("Username: ");
        MainFramePanel.add(userNameLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 276, -1, 20));

        usernameTextField.setToolTipText("");
        usernameTextField.setPreferredSize(new java.awt.Dimension(100, 26));
        MainFramePanel.add(usernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, -1));

        passwordLable.setText("Password: ");
        MainFramePanel.add(passwordLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        MainFramePanel.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, -1, -1));

        dateLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        MainFramePanel.add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 270, 40));

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        MainFramePanel.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 98, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/titlescreen.png"))); // NOI18N
        MainFramePanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 650));

        TreasurerHomePanel.setBackground(new java.awt.Color(255, 255, 255));
        TreasurerHomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        financesButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        financesButton.setText("Finances");
        financesButton.setBorder(null);
        financesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                financesButtonActionPerformed(evt);
            }
        });
        TreasurerHomePanel.add(financesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 130, 50));

        manageButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        manageButton.setText("Manage");
        manageButton.setBorder(null);
        manageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageButtonActionPerformed(evt);
            }
        });
        TreasurerHomePanel.add(manageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 130, 50));

        TreasurerNotifButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        TreasurerNotifButton.setText("Notifications");
        TreasurerNotifButton.setBorder(null);
        TreasurerNotifButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TreasurerNotifButtonActionPerformed(evt);
            }
        });
        TreasurerHomePanel.add(TreasurerNotifButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 130, 50));

        treasurerLogoutButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        treasurerLogoutButton.setText("Logout");
        treasurerLogoutButton.setBorder(null);
        treasurerLogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treasurerLogoutButtonActionPerformed(evt);
            }
        });
        TreasurerHomePanel.add(treasurerLogoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 130, 50));

        treasurerCalendarButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        treasurerCalendarButton.setText("Calendar");
        treasurerCalendarButton.setBorder(null);
        treasurerCalendarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treasurerCalendarButtonActionPerformed(evt);
            }
        });
        TreasurerHomePanel.add(treasurerCalendarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 130, 50));

        treasurerBannerPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/treasurerBannerPic 2.png"))); // NOI18N
        TreasurerHomePanel.add(treasurerBannerPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, -1));

        treasurerLogoutButtonPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/logoutButton.png"))); // NOI18N
        TreasurerHomePanel.add(treasurerLogoutButtonPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, -1, -1));

        treasurerCalendarButtonPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/calendarButton.png"))); // NOI18N
        TreasurerHomePanel.add(treasurerCalendarButtonPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

        treasurerNotifButtonPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/nonotifButton.png"))); // NOI18N
        TreasurerHomePanel.add(treasurerNotifButtonPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, -1));

        treasurerManageButtonPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/manageButton.png"))); // NOI18N
        TreasurerHomePanel.add(treasurerManageButtonPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        treasurerFinancesButtonPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/financeButton.png"))); // NOI18N
        TreasurerHomePanel.add(treasurerFinancesButtonPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        memberHomePanel.setBackground(new java.awt.Color(255, 255, 255));
        memberHomePanel.setMinimumSize(new java.awt.Dimension(800, 650));
        memberHomePanel.setPreferredSize(new java.awt.Dimension(800, 650));
        memberHomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        memberNotificationsButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        memberNotificationsButton.setText("Notifications");
        memberNotificationsButton.setBorder(null);
        memberNotificationsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberNotificationsButtonActionPerformed(evt);
            }
        });
        memberHomePanel.add(memberNotificationsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 130, 50));

        memberLogoutButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        memberLogoutButton.setText("Logout");
        memberLogoutButton.setBorder(null);
        memberLogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberLogoutButtonActionPerformed(evt);
            }
        });
        memberHomePanel.add(memberLogoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 130, 50));

        memberCalendarButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        memberCalendarButton.setText("Calendar");
        memberCalendarButton.setBorder(null);
        memberCalendarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberCalendarButtonActionPerformed(evt);
            }
        });
        memberHomePanel.add(memberCalendarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 130, 50));

        memberBannerPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/memberBannerPic.png"))); // NOI18N
        memberHomePanel.add(memberBannerPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        memberLogoutButtonPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/logoutButton.png"))); // NOI18N
        memberHomePanel.add(memberLogoutButtonPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, -1, -1));

        memberNotifButtonPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/nonotifButton.png"))); // NOI18N
        memberHomePanel.add(memberNotifButtonPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        memberCalendarPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/calendarButton.png"))); // NOI18N
        memberHomePanel.add(memberCalendarPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        memberPaymentButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        memberPaymentButton.setText("Payment");
        memberPaymentButton.setBorder(null);
        memberPaymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberPaymentButtonActionPerformed(evt);
            }
        });
        memberHomePanel.add(memberPaymentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 130, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/paymentButton.png"))); // NOI18N
        memberHomePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        financesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabbedPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        expensesLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        expensesLabel.setText("Expenses:");

        incomeStatementTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableScrollPane.setViewportView(incomeStatementTable);

        monthExpenseLabel.setText("Month: ");

        yearExpenseLabel.setText("Year: ");

        hallExpenseLabel.setText("Hall: ");

        coachExpenseLabel.setText("Coach: ");

        inputExpensesButton.setText("Input");
        inputExpensesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputExpensesButtonActionPerformed(evt);
            }
        });

        monthTableLabel.setText("Month: ");

        yearTableLabel.setText("Year: ");

        displayButton.setText("Display");
        displayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayButtonActionPerformed(evt);
            }
        });

        monthTableComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        yearTableComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));

        otherExpenseLabel.setText("Other: ");

        monthExpenseComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        YearExpenseComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021", "2022" }));

        yearRevenueComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));

        otherRevenueLabel.setText("Other: ");

        inputRevenueButton.setText("Input");
        inputRevenueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputRevenueButtonActionPerformed(evt);
            }
        });

        accountsPayableLabel.setText("Accounts Payable: ");
        accountsPayableLabel.setToolTipText("");

        memberFeesLabel.setText("Member Fees:");

        yearRevenueLabel.setText("Year: ");

        monthRevenueLabel.setText("Month: ");

        RevenueLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        RevenueLabel.setText("Revenue: ");

        monthRevenueComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        javax.swing.GroupLayout incomeStatementPanelLayout = new javax.swing.GroupLayout(incomeStatementPanel);
        incomeStatementPanel.setLayout(incomeStatementPanelLayout);
        incomeStatementPanelLayout.setHorizontalGroup(
            incomeStatementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(incomeStatementPanelLayout.createSequentialGroup()
                .addGroup(incomeStatementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(incomeStatementPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(incomeStatementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(monthExpenseLabel)
                            .addGroup(incomeStatementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(hallExpenseLabel)
                                .addComponent(yearExpenseLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(incomeStatementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(monthExpenseComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(incomeStatementPanelLayout.createSequentialGroup()
                                .addGroup(incomeStatementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(YearExpenseComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(incomeStatementPanelLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(hallExpenseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(incomeStatementPanelLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(expensesLabel))
                    .addGroup(incomeStatementPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(incomeStatementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(incomeStatementPanelLayout.createSequentialGroup()
                                .addComponent(otherExpenseLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(incomeStatementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputExpensesButton)
                                    .addComponent(otherExpenseTextField)))
                            .addGroup(incomeStatementPanelLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(incomeStatementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(incomeStatementPanelLayout.createSequentialGroup()
                                        .addComponent(accountsPayableLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(accountsPayableTextField))
                                    .addGroup(incomeStatementPanelLayout.createSequentialGroup()
                                        .addComponent(otherRevenueLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(incomeStatementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(inputRevenueButton)
                                            .addComponent(otherRevenueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(incomeStatementPanelLayout.createSequentialGroup()
                                .addGroup(incomeStatementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(incomeStatementPanelLayout.createSequentialGroup()
                                        .addComponent(coachExpenseLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(coachExpenseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(incomeStatementPanelLayout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addComponent(RevenueLabel))
                                    .addGroup(incomeStatementPanelLayout.createSequentialGroup()
                                        .addComponent(memberFeesLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(memberFeesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(incomeStatementPanelLayout.createSequentialGroup()
                                        .addComponent(monthRevenueLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(monthRevenueComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(incomeStatementPanelLayout.createSequentialGroup()
                                        .addComponent(yearRevenueLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(yearRevenueComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(incomeStatementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, incomeStatementPanelLayout.createSequentialGroup()
                        .addComponent(monthTableLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(monthTableComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(yearTableLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yearTableComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(displayButton)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, incomeStatementPanelLayout.createSequentialGroup()
                        .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        incomeStatementPanelLayout.setVerticalGroup(
            incomeStatementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(incomeStatementPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(expensesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(incomeStatementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monthExpenseLabel)
                    .addComponent(monthExpenseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(incomeStatementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yearExpenseLabel)
                    .addComponent(YearExpenseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(incomeStatementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hallExpenseLabel)
                    .addComponent(hallExpenseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(incomeStatementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(coachExpenseLabel)
                    .addComponent(coachExpenseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(incomeStatementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(otherExpenseLabel)
                    .addComponent(otherExpenseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputExpensesButton)
                .addGap(18, 18, 18)
                .addComponent(RevenueLabel)
                .addGap(9, 9, 9)
                .addGroup(incomeStatementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monthRevenueLabel)
                    .addComponent(monthRevenueComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(incomeStatementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearRevenueComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearRevenueLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(incomeStatementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(memberFeesLabel)
                    .addComponent(memberFeesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(incomeStatementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accountsPayableLabel)
                    .addComponent(accountsPayableTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(incomeStatementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(otherRevenueLabel)
                    .addComponent(otherRevenueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputRevenueButton)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, incomeStatementPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(incomeStatementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monthTableLabel)
                    .addComponent(yearTableLabel)
                    .addComponent(displayButton)
                    .addComponent(monthTableComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearTableComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        tabbedPane.addTab("Income Statement", incomeStatementPanel);

        jTable2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"January", null, null, null},
                {"February", null, null, null},
                {"March", null, null, null},
                {"April", null, null, null},
                {"May", null, null, null},
                {"June", null, null, null},
                {"July", null, null, null},
                {"August", null, null, null},
                {"September", null, null, null},
                {"October", null, null, null},
                {"November", null, null, null},
                {"December", null, null, null}
            },
            new String [] {
                "Month", "Revenue", "Expense", "Total"
            }
        ));
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable2.setMinimumSize(new java.awt.Dimension(50, 480));
        jTable2.setRowHeight(40);
        historyPane.setViewportView(jTable2);

        tabbedPane.addTab("History", historyPane);

        financesPanel.add(tabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 790, 570));
        tabbedPane.getAccessibleContext().setAccessibleName("Income Statement");

        financesBackButton.setBorder(null);
        financesBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                financesBackButtonActionPerformed(evt);
            }
        });
        financesPanel.add(financesBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        backLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/backButton 2.png"))); // NOI18N
        financesPanel.add(backLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        financesLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/financesBanner.png"))); // NOI18N
        financesPanel.add(financesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        tNotifBackButton.setText("<-");
        tNotifBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNotifBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout treasurerNotificationsPanelLayout = new javax.swing.GroupLayout(treasurerNotificationsPanel);
        treasurerNotificationsPanel.setLayout(treasurerNotificationsPanelLayout);
        treasurerNotificationsPanelLayout.setHorizontalGroup(
            treasurerNotificationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(treasurerNotificationsPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tNotifBackButton)
                .addContainerGap(695, Short.MAX_VALUE))
        );
        treasurerNotificationsPanelLayout.setVerticalGroup(
            treasurerNotificationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(treasurerNotificationsPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(tNotifBackButton)
                .addContainerGap(589, Short.MAX_VALUE))
        );

        membersPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Members", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Address", "Phone Number", "Paid"
            }
        ));
        membersScrollPane.setViewportView(jTable1);

        sortLabel.setText("Sort by: ");

        sortOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Frequency ", "Paid" }));
        sortOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortOptionsActionPerformed(evt);
            }
        });

        addMemberButton.setText("Add Member");
        addMemberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMemberButtonActionPerformed(evt);
            }
        });

        removeMember.setText("Remove");
        removeMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeMemberActionPerformed(evt);
            }
        });

        removeMemberLabel.setText("Remove Member: ");

        membersBackButton.setText("<-");

        javax.swing.GroupLayout membersPanelLayout = new javax.swing.GroupLayout(membersPanel);
        membersPanel.setLayout(membersPanelLayout);
        membersPanelLayout.setHorizontalGroup(
            membersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(membersPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(membersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(membersPanelLayout.createSequentialGroup()
                        .addComponent(membersBackButton)
                        .addGap(210, 210, 210)
                        .addComponent(sortLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sortOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(addMemberButton))
                    .addComponent(membersScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, membersPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(removeMemberLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeMemberComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeMember)
                .addGap(228, 228, 228))
        );
        membersPanelLayout.setVerticalGroup(
            membersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(membersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(membersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sortLabel)
                    .addComponent(sortOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addMemberButton)
                    .addComponent(membersBackButton))
                .addGap(18, 18, 18)
                .addComponent(membersScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(membersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeMember)
                    .addComponent(removeMemberLabel)
                    .addComponent(removeMemberComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        messagePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Messenger", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        toLabel.setText("To: ");

        allMembersButton.setText("All Members");
        allMembersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allMembersButtonActionPerformed(evt);
            }
        });

        mailingAddressTextbox.setText("Enter recipient(s) username here");
        mailingAddressTextbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailingAddressTextboxActionPerformed(evt);
            }
        });

        MessageTextArea.setColumns(20);
        MessageTextArea.setRows(5);
        messageScrollPane.setViewportView(MessageTextArea);

        sendButton.setText("Send");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        subjectLabel.setText("Subject: ");

        subjectLineTextbox.setText("       ");

        javax.swing.GroupLayout messagePanelLayout = new javax.swing.GroupLayout(messagePanel);
        messagePanel.setLayout(messagePanelLayout);
        messagePanelLayout.setHorizontalGroup(
            messagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(messagePanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(messagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(messageScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(messagePanelLayout.createSequentialGroup()
                        .addGroup(messagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(subjectLabel)
                            .addComponent(toLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(messagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mailingAddressTextbox, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                            .addComponent(subjectLineTextbox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(allMembersButton)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, messagePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(330, 330, 330))
        );
        messagePanelLayout.setVerticalGroup(
            messagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(messagePanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(messagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mailingAddressTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toLabel)
                    .addComponent(allMembersButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(messagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subjectLineTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subjectLabel))
                .addGap(13, 13, 13)
                .addComponent(messageScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addMemberPanel.setBackground(new java.awt.Color(255, 255, 255));
        addMemberPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(199, 80, 60), 5, true));
        addMemberPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addMemberLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/addMemberBanner.png"))); // NOI18N
        addMemberPanel.add(addMemberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 460, -1));

        addMemberDescriptionLabel.setText("Request the new member to fill out this form:");
        addMemberPanel.add(addMemberDescriptionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        addPasswordLabel.setText("Password: ");
        addMemberPanel.add(addPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        addFirstLabel.setText("First Name:");
        addMemberPanel.add(addFirstLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        addLastLabel.setText("Last Name: ");
        addMemberPanel.add(addLastLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        addPhoneLabel.setText("Phone Number:");
        addMemberPanel.add(addPhoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        addAddressLabel.setText("Address: ");
        addMemberPanel.add(addAddressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        addUsernameLabel.setText("Username: ");
        addMemberPanel.add(addUsernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));
        addMemberPanel.add(addAddressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 160, -1));
        addMemberPanel.add(addUsernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 160, -1));
        addMemberPanel.add(addFirstNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 160, -1));
        addMemberPanel.add(addLastNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 160, -1));
        addMemberPanel.add(addPhoneTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 160, -1));

        addMemberButtonConfirm.setText("Add Member");
        addMemberButtonConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMemberButtonConfirmActionPerformed(evt);
            }
        });
        addMemberPanel.add(addMemberButtonConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, -1, -1));

        addPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPasswordFieldActionPerformed(evt);
            }
        });
        addMemberPanel.add(addPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 160, -1));

        calendarPanel.setBackground(new java.awt.Color(255, 255, 255));
        calendarPanel.setPreferredSize(new java.awt.Dimension(800, 650));
        calendarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        monthLabel.setText("Month");
        calendarPanel.add(monthLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));
        monthLabel.getAccessibleContext().setAccessibleName("currentDate");
        monthLabel.getAccessibleContext().setAccessibleDescription("");

        nextMonthButton.setLabel("Next");
        nextMonthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextMonthButtonActionPerformed(evt);
            }
        });
        calendarPanel.add(nextMonthButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 60, -1));
        nextMonthButton.getAccessibleContext().setAccessibleName("jButton1");
        nextMonthButton.getAccessibleContext().setAccessibleDescription("");

        previousMonthButton.setText("Prev");
        previousMonthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousMonthButtonActionPerformed(evt);
            }
        });
        calendarPanel.add(previousMonthButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 60, 30));

        calButton2.setText("02");
        calendarPanel.add(calButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 51, 51));

        calButton3.setText("03");
        calendarPanel.add(calButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 51, 51));

        calButton1.setText("01");
        calendarPanel.add(calButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 51, 51));

        calButton4.setText("04");
        calButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calButton4ActionPerformed(evt);
            }
        });
        calendarPanel.add(calButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 51, 51));

        calButton5.setText("05");
        calendarPanel.add(calButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 51, 51));

        calButton6.setText("06");
        calendarPanel.add(calButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 51, 51));

        calButton7.setText("07");
        calendarPanel.add(calButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 51, 51));

        calButton8.setText("08");
        calendarPanel.add(calButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 51, 51));

        calButton9.setText("09");
        calendarPanel.add(calButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 51, 51));

        calButton10.setText("10");
        calendarPanel.add(calButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 51, 51));

        calButton11.setText("11");
        calendarPanel.add(calButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 51, 51));

        calButton12.setText("12");
        calendarPanel.add(calButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 51, 51));

        calButton13.setText("13");
        calendarPanel.add(calButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 51, 51));

        calButton14.setText("14");
        calendarPanel.add(calButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 51, 51));

        calButton15.setText("15");
        calendarPanel.add(calButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 51, 51));

        calButton16.setText("16");
        calendarPanel.add(calButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 51, 51));

        calButton17.setText("17");
        calendarPanel.add(calButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 51, 51));

        calButton18.setText("18");
        calendarPanel.add(calButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 51, 51));

        calButton19.setText("19");
        calendarPanel.add(calButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 51, 51));

        calButton20.setText("20");
        calendarPanel.add(calButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 51, 51));

        calButton21.setText("21");
        calendarPanel.add(calButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 51, 51));

        calButton22.setText("22");
        calendarPanel.add(calButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 51, 51));

        calButton23.setText("23");
        calendarPanel.add(calButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 51, 51));

        calButton24.setText("24");
        calendarPanel.add(calButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 51, 51));

        calButton25.setText("25");
        calendarPanel.add(calButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 51, 51));

        calButton26.setText("26");
        calendarPanel.add(calButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 51, 51));

        calButton27.setText("27");
        calendarPanel.add(calButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 51, 51));

        calButton28.setText("28");
        calendarPanel.add(calButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 51, 51));

        calButton29.setText("29");
        calendarPanel.add(calButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 51, 51));

        calButton30.setText("30");
        calendarPanel.add(calButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 51, 51));

        calButton31.setText("31");
        calendarPanel.add(calButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 51, 51));

        calButton32.setText("00");
        calendarPanel.add(calButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 51, 51));

        calButton33.setText("00");
        calendarPanel.add(calButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 51, 51));

        calButton35.setText("00");
        calendarPanel.add(calButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 51, 51));

        calButton34.setText("00");
        calendarPanel.add(calButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 51, 51));

        calButton36.setText("00");
        calendarPanel.add(calButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 51, 51));

        calButton37.setText("00");
        calendarPanel.add(calButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 51, 51));

        calButton38.setText("00");
        calendarPanel.add(calButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 51, 51));

        calButton39.setText("00");
        calendarPanel.add(calButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 51, 51));

        calButton40.setText("00");
        calendarPanel.add(calButton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 51, 51));

        calButton41.setText("00");
        calendarPanel.add(calButton41, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 51, 51));

        calButton42.setText("00");
        calendarPanel.add(calButton42, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 51, 51));

        sundayLabel.setText("SUN");
        calendarPanel.add(sundayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        mondayLabel.setText("MON");
        calendarPanel.add(mondayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        tuesdayLabel.setText("TUE");
        calendarPanel.add(tuesdayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 30, -1));

        wednesdayLabel.setText("WED");
        calendarPanel.add(wednesdayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        thursdayLabel.setText("THURS");
        calendarPanel.add(thursdayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        fridayLabel.setText("FRI");
        calendarPanel.add(fridayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        saturdayLabel.setText("SAT");
        calendarPanel.add(saturdayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        scheduledTextArea.setColumns(20);
        scheduledTextArea.setRows(5);
        scheduledScrollPane.setViewportView(scheduledTextArea);

        calendarPanel.add(scheduledScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 380, 176));

        selectedDateLabel.setText("SELECTED DATE");
        calendarPanel.add(selectedDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, -1, -1));

        classTypeLabel.setText("Type of class: ");
        calendarPanel.add(classTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, -1, -1));

        coachLabel.setText("Coach: ");
        calendarPanel.add(coachLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, -1, -1));

        hourLabel.setText("Hour: ");
        calendarPanel.add(hourLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, -1, -1));

        calendarPanel.add(selectedClassComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, -1, -1));

        classesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boxing", "Muay Thai", "Swimming", "Dance", "Yoga", "Spinning", "Zumba" }));
        calendarPanel.add(classesComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, -1, -1));

        coachesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coachesComboBoxActionPerformed(evt);
            }
        });
        calendarPanel.add(coachesComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 90, -1));

        hourComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        hourComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hourComboBoxActionPerformed(evt);
            }
        });
        calendarPanel.add(hourComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, -1, -1));

        minuteLabel.setText("Minute: ");
        calendarPanel.add(minuteLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, -1, -1));

        minuteComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "30" }));
        calendarPanel.add(minuteComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, -1, -1));

        removeScheduledClassButton.setText("Remove Class");
        removeScheduledClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeScheduledClassButtonActionPerformed(evt);
            }
        });
        calendarPanel.add(removeScheduledClassButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, -1, -1));

        attendingLabel.setText("Will you be attending this class?");
        calendarPanel.add(attendingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, -1, -1));

        memberAttendingButton.setText("Yes");
        memberAttendingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberAttendingButtonActionPerformed(evt);
            }
        });
        calendarPanel.add(memberAttendingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, -1, -1));

        memberNotAttendingButton.setText("No");
        memberNotAttendingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberNotAttendingButtonActionPerformed(evt);
            }
        });
        calendarPanel.add(memberNotAttendingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, -1, -1));

        addClassButton.setText("Add Class");
        addClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClassButtonActionPerformed(evt);
            }
        });
        calendarPanel.add(addClassButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, -1, -1));

        calendarBackButton.setBorder(null);
        calendarBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calendarBackButtonActionPerformed(evt);
            }
        });
        calendarPanel.add(calendarBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 50, 40));

        calendarBackButtonLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/backButton 2.png"))); // NOI18N
        calendarPanel.add(calendarBackButtonLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 50, 60));

        calendarBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/calendarButton2.png"))); // NOI18N
        calendarPanel.add(calendarBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        notifLabel.setText("Notifications");

        notifTextArea.setColumns(20);
        notifTextArea.setRows(5);
        notifScrollPane.setViewportView(notifTextArea);

        javax.swing.GroupLayout coachNotificationPanelLayout = new javax.swing.GroupLayout(coachNotificationPanel);
        coachNotificationPanel.setLayout(coachNotificationPanelLayout);
        coachNotificationPanelLayout.setHorizontalGroup(
            coachNotificationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coachNotificationPanelLayout.createSequentialGroup()
                .addGroup(coachNotificationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(coachNotificationPanelLayout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(notifLabel))
                    .addGroup(coachNotificationPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(notifScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        coachNotificationPanelLayout.setVerticalGroup(
            coachNotificationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coachNotificationPanelLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(notifLabel)
                .addGap(18, 18, 18)
                .addComponent(notifScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        paymentPanel.setBackground(new java.awt.Color(255, 255, 255));
        paymentPanel.setPreferredSize(new java.awt.Dimension(800, 650));
        paymentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paymentTotalLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        paymentTotalLabel.setText("Your total: ");
        paymentPanel.add(paymentTotalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, 30));

        paymentTotal.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        paymentTotal.setText("$");
        paymentPanel.add(paymentTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        shoppingCartTextArea.setColumns(20);
        shoppingCartTextArea.setRows(5);
        shoppingCartScrollPane.setViewportView(shoppingCartTextArea);

        paymentPanel.add(shoppingCartScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 310, 170));

        paymentClassesLabel.setText("Shopping cart:");
        paymentPanel.add(paymentClassesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        paymentMethodLabel.setText("Payment Method:");
        paymentPanel.add(paymentMethodLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 110, 40));

        paymentMethodbuttonGroup.add(masterCardRadioButton);
        masterCardRadioButton.setText("MasterCard");
        paymentPanel.add(masterCardRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, -1, -1));

        paymentMethodbuttonGroup.add(visaRadioButton);
        visaRadioButton.setText("Visa");
        paymentPanel.add(visaRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, -1, -1));

        paymentMethodbuttonGroup.add(amexRadioButton);
        amexRadioButton.setText("AMEX");
        paymentPanel.add(amexRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, -1, -1));

        cardNumberLabel.setText("Card Number: ");
        paymentPanel.add(cardNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, -1, 30));
        paymentPanel.add(cardNumberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 257, -1));

        expiryLabel.setText("Expiry: ");
        paymentPanel.add(expiryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, -1, 20));

        cvvLabel.setText("CVV: ");
        paymentPanel.add(cvvLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, -1, 30));
        paymentPanel.add(cvvTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 106, -1));

        monthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        paymentPanel.add(monthComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, -1, -1));

        slashLabel.setText("/");
        paymentPanel.add(slashLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, -1, -1));

        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        paymentPanel.add(yearComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, -1, -1));

        checkOutButton.setText("Checkout");
        paymentPanel.add(checkOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, -1, -1));

        removeClassLabel.setText("Remove class: ");
        paymentPanel.add(removeClassLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        paymentPanel.add(removeClassComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 133, -1));

        removeClassButton.setText("Remove");
        paymentPanel.add(removeClassButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, -1, -1));

        paymentBackButton.setBorder(null);
        paymentBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentBackButtonActionPerformed(evt);
            }
        });
        paymentPanel.add(paymentBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 50, 50));

        paymentBackButtonLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/backButton 2.png"))); // NOI18N
        paymentPanel.add(paymentBackButtonLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        paymentBannerLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/paymentBanner.png"))); // NOI18N
        paymentPanel.add(paymentBannerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        discountCodeLabel.setText("Discount code: ");
        paymentPanel.add(discountCodeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, -1, 20));
        paymentPanel.add(discountTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 506, 130, 30));

        applyDiscountButton.setText("Apply");
        applyDiscountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyDiscountButtonActionPerformed(evt);
            }
        });
        paymentPanel.add(applyDiscountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 509, -1, 30));

        coachesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Coaches", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        coachesPanel.setPreferredSize(new java.awt.Dimension(786, 398));

        coachesTextArea.setColumns(20);
        coachesTextArea.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        coachesTextArea.setRows(5);
        coachesScrollPane.setViewportView(coachesTextArea);

        addCoachLabel.setText("Add Coach");

        coachUsernameLabel.setText("Username: ");

        coachPassLabel.setText("Password: ");

        coachFnameLabel.setText("First Name: ");

        coachLnameLabel.setText("Last Name: ");

        coachPhoneLabel.setText("Phone Number:");

        coachAddressLabel.setText("Address: ");

        coachPhoneTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coachPhoneTextFieldActionPerformed(evt);
            }
        });

        removeCoachLabel.setText("Remove Coach: ");

        removeCoachComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        removeCoachButton.setText("Remove");

        addCoachButton.setText("Add Coach");
        addCoachButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCoachButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout coachesPanelLayout = new javax.swing.GroupLayout(coachesPanel);
        coachesPanel.setLayout(coachesPanelLayout);
        coachesPanelLayout.setHorizontalGroup(
            coachesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coachesPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(coachesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(coachesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(coachesPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(coachesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(coachesPanelLayout.createSequentialGroup()
                                .addComponent(removeCoachLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removeCoachComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(removeCoachButton))
                            .addGroup(coachesPanelLayout.createSequentialGroup()
                                .addComponent(coachUsernameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(coachUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(coachesPanelLayout.createSequentialGroup()
                                .addComponent(coachLnameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(coachLnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(coachesPanelLayout.createSequentialGroup()
                                .addComponent(coachPhoneLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(coachPhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(coachesPanelLayout.createSequentialGroup()
                                .addComponent(coachFnameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(coachFnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(coachesPanelLayout.createSequentialGroup()
                                .addComponent(coachAddressLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(coachAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(coachesPanelLayout.createSequentialGroup()
                                .addComponent(coachPassLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(coachPassTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, coachesPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addCoachButton)
                        .addGap(122, 122, 122))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, coachesPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addCoachLabel)
                .addGap(156, 156, 156))
        );
        coachesPanelLayout.setVerticalGroup(
            coachesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coachesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addCoachLabel)
                .addGroup(coachesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(coachesPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(coachesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(coachesPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(coachesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(coachUsernameLabel)
                            .addComponent(coachUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(coachesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(coachPassLabel)
                            .addComponent(coachPassTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(coachesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(coachFnameLabel)
                            .addComponent(coachFnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(coachesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(coachLnameLabel)
                            .addComponent(coachLnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(coachesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(coachPhoneLabel)
                            .addComponent(coachPhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(coachesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(coachAddressLabel)
                            .addComponent(coachAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(addCoachButton)
                        .addGap(27, 27, 27)
                        .addGroup(coachesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(removeCoachComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeCoachLabel)
                            .addComponent(removeCoachButton))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainFramePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(TreasurerHomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(CoachHomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(memberHomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(financesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(treasurerNotificationsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(membersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 4, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 7, Short.MAX_VALUE)
                    .addComponent(messagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 7, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 170, Short.MAX_VALUE)
                    .addComponent(addMemberPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 170, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(calendarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 16, Short.MAX_VALUE)
                    .addComponent(coachNotificationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 17, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(paymentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 7, Short.MAX_VALUE)
                    .addComponent(coachesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 7, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainFramePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(TreasurerHomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(CoachHomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(memberHomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(financesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(treasurerNotificationsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(membersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(messagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(addMemberPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(calendarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(coachNotificationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(paymentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(coachesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
     
        try (Scanner parse = new Scanner(new File(USERFILE));)
        {
            while (parse.hasNextLine())
            {
                String current = parse.nextLine();
                if (current.equals(usernameTextField.getText()))
                        {
                          String password = parse.nextLine();
                          if (password.equals(passwordField.getText()))
                          {
                              accountType = parse.nextLine();
                              memberMessage = parse.nextLine();
                              {
                                  
                                  switch (accountType)
                                  {
                                      case "Coach":
                                          CoachHomePanel.setVisible(true);
                                          memName = parse.nextLine() + " " + parse.nextLine();
                                          member = false;
                                          login();
                                          MessageTextArea.setText(memberMessage);
                                          break;
                                      case "Member":
                                          memberHomePanel.setVisible(true);
                                          memName = parse.nextLine() + " " + parse.nextLine();
                                          member = true;
                                          login();
                                          break;
                                      case "Treasurer":
                                          TreasurerHomePanel.setVisible(true);
                                          memName = parse.nextLine() + " " + parse.nextLine();
                                          member = false;
                                          login();
                                          break;
                                      default:
                                          MainFrame.msgBox("There was an error identifying your account type.", "Error");
                                          break;
                                  }
                              }
                              
                          }
                          else
                          {
                              MainFrame.msgBox("Incorrect login/password.", "Error");
                              passwordField.setText("");
                          }
                        }
                else if (usernameTextField.getText().equals(""))
                {
                    MainFrame.msgBox("Invalid username entered.", "Error");
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        memberList = new ArrayList<>();
        membersPopulate();
        coachList = new ArrayList<>();
        for(int i = 0; i < memberList.size(); i++){
            if("Coach".equals(memberList.get(i).getType()))
                coachList.add(memberList.get(i));
        }
        findSessions();
        
    }//GEN-LAST:event_loginButtonActionPerformed

    private void initializeIncomeStatement(String year, String month)
    {
        incomeStatement[0][1] = "Income Statement";
        incomeStatement[1][1] = month + " " + year;
        incomeStatement[3][0] = "Operating Expenses";
        incomeStatement[4][0] = "Hall";
        incomeStatement[5][0] = "Coaches";
        incomeStatement[6][0] = "Other";
        incomeStatement[7][0] = "Total Expenses";
        incomeStatement[9][0] = "Revenues";
        incomeStatement[10][0] = "Member Fees";
        incomeStatement[11][0] = "Accounts Receivables";
        incomeStatement[12][0] = "Other";
        incomeStatement[13][0] = "Total Revenues";
        incomeStatement[15][0] = "Profit Before Income Tax";
        incomeStatement[16][0] = "Income Tax";
        incomeStatement[16][2] = 22.72;
        incomeStatement[17][0] = "Net Income";
        Scanner parse, expensesParse;
        FileWriter writer;
        
        int totalRevenues = 0;
        int totalExpenses = 0;
        
        try{
            parse = new Scanner(new File(REVENUESFILE));
            writer = new FileWriter(FINANCESHISTORYFILE, true);
            while (parse.hasNextLine())
            {
                //System.out.println(parse.nextInt());
                 if (year.equals(parse.nextLine()))
                 {
                    if (month.equals(parse.nextLine()))
                    {
                        totalRevenues = 0;
                        int[] revenues = new int[3];
                        for (int i = 0; i < 3; i++)
                        {
                            revenues[i] = parse.nextInt();
                            //System.out.println(revenues[i]);
                            totalRevenues += revenues[i];
                            //System.out.println(totalRevenues);
                        }
                        for (int i = 10; i < 13; i++)
                        {
                            incomeStatement[i][2] = revenues[i-10];
                        }
                    
                        incomeStatement[13][2] = totalRevenues;
                    }
                }
            }
           
            writer.write(year);
            writer.write(System.lineSeparator());
            writer.write(month);
            writer.write(System.lineSeparator());
            writer.write(Integer.toString(totalRevenues));
            writer.write(System.lineSeparator());
            
            expensesParse = new Scanner(new File(EXPENSESFILE));
            while (expensesParse.hasNextLine())
            {
                if (year.equals(expensesParse.nextLine()))
                {
                    if (month.equals(expensesParse.nextLine()))
                    {
                        totalExpenses = 0;
                        int[] expenses = new int[3];
                        for (int i = 0; i < 3; i++)
                        {
                            expenses[i] = expensesParse.nextInt();
                            totalExpenses += expenses[i];
                            //System.out.println(totalExpenses);
                        }
                        for (int i = 4; i < 7; i++)
                        {
                            incomeStatement[i][2] = expenses[i-4];
                        }
                        incomeStatement[7][2] = totalExpenses;
                    }
                }
            }
            writer.write(Integer.toString(totalExpenses));
            writer.write(System.lineSeparator());
            writer.close();
            System.out.println(totalRevenues);
            System.out.println(totalExpenses);
            incomeStatement[15][2] = totalRevenues - totalExpenses;
            incomeStatement[17][2] = ((totalRevenues - totalExpenses)*(1 - 0.2272));
            
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        
        incomeStatementTable.getModel().setValueAt(incomeStatement[0][1], 0, 1);
        incomeStatementTable.getModel().setValueAt(incomeStatement[1][1], 1, 1);
        
        for (int i = 0; i < 18; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                incomeStatementTable.getModel().setValueAt(incomeStatement[i][j], i, j);
            }
        }
        
    }
   
    private void initializeFinanceHistory()
    {
        String[] months = new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        
        for (int i = 0; i < 12; i++)
        {
            financesTable[i][0] = months[i];
        }
        Scanner parse;
        
        try
        {
            parse = new Scanner(new File(FINANCESHISTORYFILE));
            while (parse.hasNextLine())
            {
                if ("2018".equals(parse.nextLine()))
                {
                    int revenues = 0;
                    int expenses = 0;
                    switch(parse.nextLine())
                    {
                        case "January":
                            revenues = parse.nextInt();
                            financesTable[0][1] = revenues;
                            expenses = parse.nextInt();
                            financesTable[0][2] = expenses;
                            financesTable[0][3] = revenues - expenses;
                            break;
                        case "February":
                            revenues = parse.nextInt();
                            financesTable[1][1] = revenues;
                            expenses = parse.nextInt();
                            financesTable[1][2] = expenses;
                            financesTable[1][3] = revenues - expenses;
                            break;
                        case "March":
                            revenues = parse.nextInt();
                            financesTable[2][1] = revenues;
                            expenses = parse.nextInt();
                            financesTable[2][2] = expenses;
                            financesTable[2][3] = revenues - expenses;
                            break;
                        case "April":
                            revenues = parse.nextInt();
                            financesTable[3][1] = revenues;
                            expenses = parse.nextInt();
                            financesTable[3][2] = expenses;
                            financesTable[3][3] = revenues - expenses;
                            break;
                        case "May":
                            revenues = parse.nextInt();
                            financesTable[4][1] = revenues;
                            expenses = parse.nextInt();
                            financesTable[4][2] = expenses;
                            financesTable[4][3] = revenues - expenses;
                            break;
                        case "June":
                            revenues = parse.nextInt();
                            financesTable[5][1] = revenues;
                            expenses = parse.nextInt();
                            financesTable[5][2] = expenses;
                            financesTable[5][3] = revenues - expenses;
                            break;
                        case "July":
                            revenues = parse.nextInt();
                            financesTable[6][1] = revenues;
                            expenses = parse.nextInt();
                            financesTable[6][2] = expenses;
                            financesTable[6][3] = revenues - expenses;
                            break;
                        case "August":
                            revenues = parse.nextInt();
                            financesTable[7][1] = revenues;
                            expenses = parse.nextInt();
                            financesTable[7][2] = expenses;
                            financesTable[7][3] = revenues - expenses;
                            break;
                        case "September":
                            revenues = parse.nextInt();
                            financesTable[8][1] = revenues;
                            expenses = parse.nextInt();
                            financesTable[8][2] = expenses;
                            financesTable[8][3] = revenues - expenses;
                            break;
                        case "October":
                            revenues = parse.nextInt();
                            financesTable[9][1] = revenues;
                            expenses = parse.nextInt();
                            financesTable[9][2] = expenses;
                            financesTable[9][3] = revenues - expenses;
                            break;
                        case "November":
                            revenues = parse.nextInt();
                            financesTable[10][1] = revenues;
                            expenses = parse.nextInt();
                            financesTable[10][2] = expenses;
                            financesTable[10][3] = revenues - expenses;
                            break;
                        case "December":
                            revenues = parse.nextInt();
                            financesTable[11][1] = revenues;
                            expenses = parse.nextInt();
                            financesTable[11][2] = expenses;
                            financesTable[11][3] = revenues - expenses;
                            break;
                    }
                }
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        
        for (int i = 0; i < 12; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                jTable2.getModel().setValueAt(financesTable[i][j], i, j);
            }
        }
    }
    
    private void login()
    {
        loginButton.setVisible(false);
        userNameLable.setVisible(false);
        usernameTextField.setVisible(false);
        passwordLable.setVisible(false);
        passwordField.setVisible(false);
        MainFramePanel.setVisible(false);
        
        loginButton.setEnabled(false);
        usernameTextField.setEnabled(false);
        passwordField.setEnabled(false);
    }
    
    private void logout()
    {
        loginButton.setVisible(true);
        userNameLable.setVisible(true);
        usernameTextField.setVisible(true);
        passwordLable.setVisible(true);
        passwordField.setVisible(true);
        MainFramePanel.setVisible(true);
        
        usernameTextField.setText("");
        passwordField.setText("");
        
        loginButton.setEnabled(true);
        usernameTextField.setEnabled(true);
        passwordField.setEnabled(true);
        messages = "";
        
        if (accountType.equals("Coach"))
        {
            coachNotificationPanel.setVisible(false);
            MessageTextArea.setText("");
            messagePanel.setVisible(false);
            membersPanel.setVisible(false);
            calendarPanel.setVisible(false);
        }
        else if (accountType.equals("Member"))
        {
            coachNotificationPanel.setVisible(false);
            MessageTextArea.setText("");
            calendarPanel.setVisible(false);
        }
        else if (accountType.equals("Treasurer"))
        {
            financesPanel.setVisible(false);
            coachNotificationPanel.setVisible(false);
            MessageTextArea.setText("");
            calendarPanel.setVisible(false);
        }
            
    }
    
    private void nextMonthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextMonthButtonActionPerformed
        // TODO add your handling code here:
        if(calendar.get(Calendar.MONTH) >= 0 && calendar.get(Calendar.MONTH) < 11){
            calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH)+1);
            calendar.set(Calendar.DAY_OF_MONTH, 1);
            buildCal(calendar.get(Calendar.DAY_OF_WEEK), calendar.get(Calendar.MONTH)-1);
        }
        else if(calendar.get(Calendar.MONTH) == 11){
            calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR)+1);
            calendar.set(Calendar.MONTH, 0);
            calendar.set(Calendar.DAY_OF_MONTH, 1);
            buildCal(calendar.get(Calendar.DAY_OF_WEEK), 11);
        }
        else{
            //error message here
        }
        selectedDateLabel.setText(sdf.format(calendar.getTime()));
        
    }//GEN-LAST:event_nextMonthButtonActionPerformed

    private void financesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_financesButtonActionPerformed
        // TODO add your handling code here:
        financesButtonCounter++;
        manageButtonCounter = 0;
        treasurerNotifButtonCounter = 0;
        //initializeIncomeStatement(yearTableComboBox.getSelectedItem().toString(), monthTableComboBox.getSelectedItem().toString());
        treasurerCloseAll();
        initializeFinanceHistory();
        financesPanel.setVisible(true);
        financesPanel.setEnabled(true);
        TreasurerHomePanel.setVisible(false);
        TreasurerHomePanel.setEnabled(false);
    }//GEN-LAST:event_financesButtonActionPerformed

    private void manageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageButtonActionPerformed
        // TODO add your handling code here:
        manageButtonCounter++;
        financesButtonCounter = 0;
        treasurerNotifButtonCounter = 0;
        treasurerCloseAll();
        bannerClick(coachesPanel, manageButtonCounter);
    }//GEN-LAST:event_manageButtonActionPerformed

    private void TreasurerNotifButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TreasurerNotifButtonActionPerformed
        // TODO add your handling code here:
        treasurerNotifButtonCounter++;
        financesButtonCounter = 0;
        manageButtonCounter = 0;
        treasurerCloseAll();
        readMessages(usernameTextField.getText());
        bannerClick(coachNotificationPanel, treasurerNotifButtonCounter);
        TreasurerHomePanel.setVisible(false);
        TreasurerHomePanel.setEnabled(false);
    }//GEN-LAST:event_TreasurerNotifButtonActionPerformed

    private void treasurerCloseAll()
    {
        financesPanel.setVisible(false);
        treasurerNotificationsPanel.setVisible(false);
        messages = "";
    }
    
    private void memberNotificationsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberNotificationsButtonActionPerformed
        // TODO add your handling code here:
        memberNotificationButtonCounter++;
        memberCalendarButtonCounter = 0;
        memberCloseAll();
        readMessages(usernameTextField.getText());
        bannerClick(coachNotificationPanel, memberNotificationButtonCounter);
        
    }//GEN-LAST:event_memberNotificationsButtonActionPerformed

    private void memberCloseAll()
    {
        //coachNotificationPanel.setVisible(false);
        membersPanel.setVisible(false);
        
        calendarPanel.setVisible(false);
        messages = "";
    }
    
    private void membersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membersButtonActionPerformed
        // TODO add your handling code here:
        memberButtonCounter++;
        coachNotificationButtonCounter = 0;
        coachMessageButtonCounter = 0;
        coachCloseAll();
        printMembers();
        membersComboBoxGenerate();
        bannerClick(membersPanel, memberButtonCounter);
        jTable1.setDefaultEditor(Object.class, null);
        
    }//GEN-LAST:event_membersButtonActionPerformed
	
    private void membersComboBoxGenerate()
    {
        for (int i = 0; i < memberList.size(); i++)
        {
            removeMemberComboBox.insertItemAt(memberList.get(i).getName(), i);
        }
        removeMemberComboBox.setSelectedIndex(0);
    }
   
    
    private void removeMember(String name)
    {
        for (int i = 0; i < memberList.size(); i++)
        {
            if (name.equals(memberList.get(i).getName()))
            {
                memberList.remove(i);
            }
        }
        MainFrame.msgBox(name + " has been removed.", "Member Removed");
        
        printMembers();
        membersComboBoxGenerate();
    }
    
    private void printMembers(){
        //membersText.setText(" First Name Last Name                               Address                              Phone                            Paid\n");
        //Collections.sort(memberList);
        membersTable = new Object[memberList.size()][4];
        //for(int x =0; x<memberList.size(); x++){
            //membersText.append(memberList.get(x).toString()+ "\n");
        //}
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for (int i = 0; i < memberList.size(); i++)
        {
            membersTable[i][0] = memberList.get(i).getName();
            membersTable[i][1] = memberList.get(i).getAdd();
            membersTable[i][2] = memberList.get(i).getPhone();
            membersTable[i][3] = memberList.get(i).getPaid();
        }
        
        for (int i = 0; i< memberList.size(); i++)
        {
            for (int j = 0; j < 4; j++)
            {
                model.setRowCount(memberList.size());
                jTable1.getModel().setValueAt(membersTable[i][j], i, j);
            }
        }
        
        /*jTable1.getModel().setValueAt(membersTable[0][0], 0, 0);
        jTable1.getModel().setValueAt(membersTable[0][1], 0, 1);
        jTable1.getModel().setValueAt(membersTable[0][2], 0, 2);
        jTable1.getModel().setValueAt(membersTable[0][3], 0, 3);*/
    }
	
    private void membersPopulate(){
        try (Scanner parse = new Scanner(new File(USERFILE));){
            while(parse.hasNextLine()){
                parse.nextLine();
                parse.nextLine();
                String type = parse.nextLine();
                parse.nextLine();
                String name = parse.nextLine();
                name = name + " " + parse.nextLine();
                String phone = parse.nextLine();
                String address = parse.nextLine();
                parse.nextLine();
                String paid=parse.nextLine();
                memberList.add(new Member(type, name,address,phone,paid));
                if(name.equals(memName))
                    curMem = memberList.get(memberList.size()-1);
            }
            Collections.sort(memberList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        
    private void findSessions(){
        
        try (Scanner parse = new Scanner(new File(SESSIONSFILE));){
            while(parse.hasNextLine()){
                String pDate = parse.nextLine();
                String pTime = parse.nextLine();
                String pType = parse.nextLine();
                String pCoach = parse.nextLine();
                int members = Integer.parseInt(parse.nextLine());
                String names[] = new String[members];
                boolean paid[] = new boolean[members];
                for(int i = 0; i < members; i++){
                    names[i] = parse.nextLine();
                    String temp = parse.nextLine();
                    switch (temp) {
                        case "true":
                            paid[i] = true;
                            break;
                        case "false":
                            paid[i] = false;
                            break;
                        default:
                            //error message
                            break;
                    }
                }
                Member coach = new Member("","","","","");
                for(int i = 0; i < coachList.size(); i++){
                    if(pCoach.equals(coachList.get(i).getName())){
                        coach = coachList.get(i);
                        break;
                    }
                }
                if(coach.getAdd().equals("")){
                    //error message
                }
                Calendar sessionDay = Calendar.getInstance();
                char month = pDate.charAt(5);
                switch (month) {
                    case 'J':
                        month = pDate.charAt(6);
                        switch (month) {
                            case 'a':
                                sessionDay.set(Calendar.MONTH, 0);
                                break;
                            case 'u':
                                month = pDate.charAt(7);
                                switch (month) {
                                    case 'n':
                                        sessionDay.set(Calendar.MONTH, 5);
                                        break;
                                    case 'l':
                                        sessionDay.set(Calendar.MONTH, 6);
                                        break;
                                    default:
                                        JFrame errorFrame = new JFrame();
                                        errorFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                                        errorFrame.setTitle("ERROR");
                                        errorFrame.setVisible(true);
                                        errorFrame.add(new JLabel("June/July"));
                                        errorFrame.setSize(200,200);
                                        break;
                                }
                                break;
                            default:
                                JFrame errorFrame = new JFrame();
                            errorFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            errorFrame.setTitle("ERROR");
                            errorFrame.setVisible(true);
                            errorFrame.add(new JLabel("J Month"));
                            errorFrame.setSize(200,200);
                                break;
                        }
                        break;
                    case 'F':
                        sessionDay.set(Calendar.MONTH, 1);
                        break;
                    case 'M':
                        month = pDate.charAt(7);
                        switch (month) {
                            case 'r':
                                sessionDay.set(Calendar.MONTH, 2);
                                break;
                            case 'y':
                                sessionDay.set(Calendar.MONTH, 4);
                                break;
                            default:
                                JFrame errorFrame = new JFrame();
                            errorFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            errorFrame.setTitle("ERROR");
                            errorFrame.setVisible(true);
                            errorFrame.add(new JLabel("M Month"));
                            errorFrame.setSize(200,200);
                                break;
                        }
                        break;
                    case 'A':
                        month = pDate.charAt(6);
                        switch (month) {
                            case 'p':
                                sessionDay.set(Calendar.MONTH, 3);
                                break;
                            case 'u':
                                sessionDay.set(Calendar.MONTH, 7);
                                break;
                            default:
                                JFrame errorFrame = new JFrame();
                            errorFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            errorFrame.setTitle("ERROR");
                            errorFrame.setVisible(true);
                            errorFrame.add(new JLabel("A Month"));
                            errorFrame.setSize(200,200);
                                break;
                        }
                        break;
                    case 'S':
                        sessionDay.set(Calendar.MONTH, 8);
                        break;
                    case 'O':
                        sessionDay.set(Calendar.MONTH, 9);
                        break;
                    case 'N':
                        sessionDay.set(Calendar.MONTH, 10);
                        break;
                    case 'D':
                        sessionDay.set(Calendar.MONTH, 11);
                        break;
                    default:
                        JFrame errorFrame = new JFrame();
                            errorFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            errorFrame.setTitle("ERROR");
                            errorFrame.setVisible(true);
                            errorFrame.add(new JLabel("Month set"));
                            errorFrame.setSize(200,200);
                        break;
                }
                sessionDay.set(Calendar.DAY_OF_MONTH, Integer.parseInt(pDate.substring(9, 11)));
                sessionDay.set(Calendar.YEAR, Integer.parseInt(pDate.substring(13, 17)));
                String hour = pTime.substring(0, 2);
                String minute = pTime.substring(2, 4);
                practiceList.add(new Session(coach, sessionDay, pType, hour, minute));
                for (int i = 0; i < names.length; i++) {
                    for (int j = 0; j < memberList.size(); j++) {
                        if (memberList.get(j).getName().equals(names[i])) {
                            practiceList.get(practiceList.size()-1).addMember(memberList.get(j));
                            practiceList.get(practiceList.size()-1).changePaid(i, paid[i]);
                            break;
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    private void messageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageButtonActionPerformed
        // TODO add your handling code here:
        coachMessageButtonCounter++;
        coachNotificationButtonCounter = 0;
        memberButtonCounter = 0;
        coachCloseAll();
        bannerClick(messagePanel, coachMessageButtonCounter);
    }//GEN-LAST:event_messageButtonActionPerformed

    private void coachNotificationsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coachNotificationsButtonActionPerformed
        // TODO add your handling code here:
        coachNotificationButtonCounter++;
        memberButtonCounter = 0;
        coachMessageButtonCounter = 0;
        coachCloseAll();
        readMessages(usernameTextField.getText());
        bannerClick(coachNotificationPanel, coachNotificationButtonCounter);
    }//GEN-LAST:event_coachNotificationsButtonActionPerformed

    private void coachCloseAll()
    {
        messagePanel.setVisible(false);
        coachNotificationPanel.setVisible(false);
        calendarPanel.setVisible(false);
        membersPanel.setVisible(false);
        messages = "";
    }
    
    private void coachLogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coachLogoutButtonActionPerformed
        // TODO add your handling code here:
        CoachHomePanel.setVisible(false);
        logout();
    }//GEN-LAST:event_coachLogoutButtonActionPerformed

    private void coachCalendarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coachCalendarButtonActionPerformed
        // TODO add your handling code here:
        coachNotificationButtonCounter = 0;
        memberButtonCounter = 0;
        coachMessageButtonCounter = 0;
        coachCloseAll();
        int temp = calendar.get(Calendar.DAY_OF_MONTH);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        
        buildCal(calendar.get(Calendar.DAY_OF_WEEK), -1);
        calendar.set(Calendar.DAY_OF_MONTH, temp);
        selectedDateLabel.setText(sdf.format(calendar.getTime()));
        
        setCoachCalendar();
        calendarPanel.setVisible(true);
        coachCalendarButton.setVisible(false);
        CoachHomePanel.setVisible(false);
        CoachHomePanel.setEnabled(false);
    }//GEN-LAST:event_coachCalendarButtonActionPerformed

    private void treasurerLogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_treasurerLogoutButtonActionPerformed
        // TODO add your handling code here:
        TreasurerHomePanel.setVisible(false);
        //treasurerLogoutButton.setVisible(false);
        logout();
    }//GEN-LAST:event_treasurerLogoutButtonActionPerformed

    private void memberLogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberLogoutButtonActionPerformed
        // TODO add your handling code here:
        memberHomePanel.setVisible(false);
        //memberLogoutButton.setVisible(false);
        logout();
    }//GEN-LAST:event_memberLogoutButtonActionPerformed

    private void treasurerCalendarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_treasurerCalendarButtonActionPerformed
        // TODO add your handling code here:
        int temp = calendar.get(Calendar.DAY_OF_MONTH);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        
        for(int i = 0; i < coachList.size(); i++){
            coachesComboBox.addItem(coachList.get(i).getName());
        }
        
        buildCal(calendar.get(Calendar.DAY_OF_WEEK), -1);
        
        calendar.set(Calendar.DAY_OF_MONTH, temp);
        selectedDateLabel.setText(sdf.format(calendar.getTime()));
        
        setTreasurerCalendar();
        calendarPanel.setVisible(true);
        treasurerCalendarButton.setVisible(false);
        TreasurerHomePanel.setVisible(false);
        TreasurerHomePanel.setEnabled(false);
    }//GEN-LAST:event_treasurerCalendarButtonActionPerformed

    private void checkSessions(){
        
        Collections.sort(practiceList);
        scheduledTextArea.setText("");
        selectedClassComboBox.removeAllItems();
        boolean hasClass = false;
        for(int i = 0; i < practiceList.size(); i++){
            if(practiceList.get(i).getDate().get(Calendar.MONTH) == calendar.get(Calendar.MONTH)
                    && practiceList.get(i).getDate().get(Calendar.DAY_OF_MONTH) == calendar.get(Calendar.DAY_OF_MONTH)
                    && practiceList.get(i).getDate().get(Calendar.YEAR) == calendar.get(Calendar.YEAR)){
                scheduledTextArea.append(practiceList.get(i).toString() + "\n");
                hasClass = true;
                if(member){
                    selectedClassComboBox.addItem(practiceList.get(i).getTime() + " - " + practiceList.get(i).getType());
                    practiceList.get(i);
                }
            }
        }
        if(!hasClass)
            selectedClassComboBox.addItem("No Classes");
        
    }
    
    private void memberCalendarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberCalendarButtonActionPerformed
        // TODO add your handling code here:
        memberCloseAll();
        int temp = calendar.get(Calendar.DAY_OF_MONTH);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        
        buildCal(calendar.get(Calendar.DAY_OF_WEEK), -1);
        calendar.set(Calendar.DAY_OF_MONTH, temp);
        selectedDateLabel.setText(sdf.format(calendar.getTime()));
        
        setMemberCalendar();
        calendarPanel.setVisible(true);
        calendarPanel.setEnabled(true);
        memberCalendarButton.setVisible(false);
        memberHomePanel.setVisible(false);
        memberHomePanel.setEnabled(false);
    }//GEN-LAST:event_memberCalendarButtonActionPerformed

    class CreateListener1 implements ActionListener{
                        @Override
			public void actionPerformed(ActionEvent event){
				calendar.set(Calendar.DAY_OF_MONTH, 1);
                                selectedDateLabel.setText(sdf.format(calendar.getTime()));
                                checkSessions();
			}
		}
    
    class CreateListener2 implements ActionListener{
                        @Override
			public void actionPerformed(ActionEvent event){
				calendar.set(Calendar.DAY_OF_MONTH, 2);
                                selectedDateLabel.setText(sdf.format(calendar.getTime()));
                                checkSessions();
			}
		}
    
    class CreateListener3 implements ActionListener{
                        @Override
			public void actionPerformed(ActionEvent event){
				calendar.set(Calendar.DAY_OF_MONTH, 3);
                                selectedDateLabel.setText(sdf.format(calendar.getTime()));
                                checkSessions();
			}
		}
    
    class CreateListener4 implements ActionListener{
                        @Override
			public void actionPerformed(ActionEvent event){
				calendar.set(Calendar.DAY_OF_MONTH, 4);
                                selectedDateLabel.setText(sdf.format(calendar.getTime()));
                                checkSessions();
			}
		}
    
    class CreateListener5 implements ActionListener{
                        @Override
			public void actionPerformed(ActionEvent event){
				calendar.set(Calendar.DAY_OF_MONTH, 5);
                                selectedDateLabel.setText(sdf.format(calendar.getTime()));
                                checkSessions();
			}
		}
    
    class CreateListener6 implements ActionListener{
                        @Override
			public void actionPerformed(ActionEvent event){
				calendar.set(Calendar.DAY_OF_MONTH, 6);
                                selectedDateLabel.setText(sdf.format(calendar.getTime()));
                                checkSessions();
			}
		}
    
    class CreateListener7 implements ActionListener{
                        @Override
			public void actionPerformed(ActionEvent event){
				calendar.set(Calendar.DAY_OF_MONTH, 7);
                                selectedDateLabel.setText(sdf.format(calendar.getTime()));
                                checkSessions();
			}
		}
    
    class CreateListener8 implements ActionListener{
                        @Override
			public void actionPerformed(ActionEvent event){
				calendar.set(Calendar.DAY_OF_MONTH, 8);
                                selectedDateLabel.setText(sdf.format(calendar.getTime()));
                                checkSessions();
			}
		}
    
    class CreateListener9 implements ActionListener{
                        @Override
			public void actionPerformed(ActionEvent event){
				calendar.set(Calendar.DAY_OF_MONTH, 9);
                                selectedDateLabel.setText(sdf.format(calendar.getTime()));
                                checkSessions();
			}
		}
    
    class CreateListener10 implements ActionListener{
                        @Override
			public void actionPerformed(ActionEvent event){
				calendar.set(Calendar.DAY_OF_MONTH, 10);
                                selectedDateLabel.setText(sdf.format(calendar.getTime()));
                                checkSessions();
			}
		}
    
    class CreateListener11 implements ActionListener{
                        @Override
			public void actionPerformed(ActionEvent event){
				calendar.set(Calendar.DAY_OF_MONTH, 11);
                                selectedDateLabel.setText(sdf.format(calendar.getTime()));
                                checkSessions();
			}
		}
    
    class CreateListener12 implements ActionListener{
                        @Override
			public void actionPerformed(ActionEvent event){
				calendar.set(Calendar.DAY_OF_MONTH, 12);
                                selectedDateLabel.setText(sdf.format(calendar.getTime()));
                                checkSessions();
			}
		}
    
    class CreateListener13 implements ActionListener{
                        @Override
			public void actionPerformed(ActionEvent event){
				calendar.set(Calendar.DAY_OF_MONTH, 13);
                                selectedDateLabel.setText(sdf.format(calendar.getTime()));
                                checkSessions();
			}
		}
    
    class CreateListener14 implements ActionListener{
                        @Override
			public void actionPerformed(ActionEvent event){
				calendar.set(Calendar.DAY_OF_MONTH, 14);
                                selectedDateLabel.setText(sdf.format(calendar.getTime()));
                                checkSessions();
			}
		}
    
    class CreateListener15 implements ActionListener{
                        @Override
			public void actionPerformed(ActionEvent event){
				calendar.set(Calendar.DAY_OF_MONTH, 15);
                                selectedDateLabel.setText(sdf.format(calendar.getTime()));
                                checkSessions();
			}
		}
    
    class CreateListener16 implements ActionListener{
                        @Override
			public void actionPerformed(ActionEvent event){
				calendar.set(Calendar.DAY_OF_MONTH, 16);
                                selectedDateLabel.setText(sdf.format(calendar.getTime()));
                                checkSessions();
			}
		}
    
    class CreateListener17 implements ActionListener{
                        @Override
			public void actionPerformed(ActionEvent event){
				calendar.set(Calendar.DAY_OF_MONTH, 17);
                                selectedDateLabel.setText(sdf.format(calendar.getTime()));
                                checkSessions();
			}
		}
    
    class CreateListener18 implements ActionListener{
                        @Override
			public void actionPerformed(ActionEvent event){
				calendar.set(Calendar.DAY_OF_MONTH, 18);
                                selectedDateLabel.setText(sdf.format(calendar.getTime()));
                                checkSessions();
			}
		}
    
    class CreateListener19 implements ActionListener{
                        @Override
			public void actionPerformed(ActionEvent event){
				calendar.set(Calendar.DAY_OF_MONTH, 19);
                                selectedDateLabel.setText(sdf.format(calendar.getTime()));
                                checkSessions();
			}
		}
    
    class CreateListener20 implements ActionListener{
                        @Override
			public void actionPerformed(ActionEvent event){
				calendar.set(Calendar.DAY_OF_MONTH, 20);
                                selectedDateLabel.setText(sdf.format(calendar.getTime()));
                                checkSessions();
			}
		}
    
    class CreateListener21 implements ActionListener{
                        @Override
			public void actionPerformed(ActionEvent event){
				calendar.set(Calendar.DAY_OF_MONTH, 21);
                                selectedDateLabel.setText(sdf.format(calendar.getTime()));
                                checkSessions();
			}
		}
    
    class CreateListener22 implements ActionListener{
                        @Override
			public void actionPerformed(ActionEvent event){
				calendar.set(Calendar.DAY_OF_MONTH, 22);
                                selectedDateLabel.setText(sdf.format(calendar.getTime()));
                                checkSessions();
			}
		}
    
    class CreateListener23 implements ActionListener{
                        @Override
			public void actionPerformed(ActionEvent event){
				calendar.set(Calendar.DAY_OF_MONTH, 23);
                                selectedDateLabel.setText(sdf.format(calendar.getTime()));
                                checkSessions();
			}
		}
    
    class CreateListener24 implements ActionListener{
                        @Override
			public void actionPerformed(ActionEvent event){
				calendar.set(Calendar.DAY_OF_MONTH, 24);
                                selectedDateLabel.setText(sdf.format(calendar.getTime()));
                                checkSessions();
			}
		}
    
    class CreateListener25 implements ActionListener{
                        @Override
			public void actionPerformed(ActionEvent event){
				calendar.set(Calendar.DAY_OF_MONTH, 25);
                                selectedDateLabel.setText(sdf.format(calendar.getTime()));
                                checkSessions();
			}
		}
    
    class CreateListener26 implements ActionListener{
                        @Override
			public void actionPerformed(ActionEvent event){
				calendar.set(Calendar.DAY_OF_MONTH, 26);
                                selectedDateLabel.setText(sdf.format(calendar.getTime()));
                                checkSessions();
			}
		}
    
    class CreateListener27 implements ActionListener{
                        @Override
			public void actionPerformed(ActionEvent event){
				calendar.set(Calendar.DAY_OF_MONTH, 27);
                                selectedDateLabel.setText(sdf.format(calendar.getTime()));
                                checkSessions();
			}
		}
    
     class CreateListener28 implements ActionListener{
                        @Override
			public void actionPerformed(ActionEvent event){
				calendar.set(Calendar.DAY_OF_MONTH, 28);
                                selectedDateLabel.setText(sdf.format(calendar.getTime()));
                                checkSessions();
			}
     }
     
     class CreateListener29 implements ActionListener{
                        @Override
			public void actionPerformed(ActionEvent event){
				calendar.set(Calendar.DAY_OF_MONTH, 29);
                                selectedDateLabel.setText(sdf.format(calendar.getTime()));
                                checkSessions();
			}
		}
    
    class CreateListener30 implements ActionListener{
                        @Override
			public void actionPerformed(ActionEvent event){
				calendar.set(Calendar.DAY_OF_MONTH, 30);
                                selectedDateLabel.setText(sdf.format(calendar.getTime()));
                                checkSessions();
			}
		}
    
    class CreateListener31 implements ActionListener{
                        @Override
			public void actionPerformed(ActionEvent event){
				calendar.set(Calendar.DAY_OF_MONTH, 31);
                                selectedDateLabel.setText(sdf.format(calendar.getTime()));
                                checkSessions();
			}
		}
        
    private void buildCal(int weekday, int lastMonth){             //gets first day of month & builds calendar depending on which day of week
        
        checkSessions();
        switch (calendar.get(Calendar.MONTH)) {
            case 0:
                monthLabel.setText("January");
                month31(weekday);
                break;
            case 1:
                monthLabel.setText("February");
                month28(weekday);
                break;
            case 2:
                monthLabel.setText("March");
                month31(weekday);
                break;
            case 3:
                monthLabel.setText("April");
                month30(weekday);
                break;
            case 4:
                monthLabel.setText("May");
                month31(weekday);
                break;
            case 5:
                monthLabel.setText("June");
                month30(weekday);
                break;
            case 6:
                monthLabel.setText("July");
                month31(weekday);
                break;
            case 7:
                monthLabel.setText("August");
                month31(weekday);
                break;
            case 8:
                monthLabel.setText("September");
                month30(weekday);
                break;
            case 9:
                monthLabel.setText("October");
                month31(weekday);
                break;
            case 10:
                monthLabel.setText("November");
                month30(weekday);
                break;
            case 11:
                monthLabel.setText("December");
                month31(weekday);
                break;
        //error message here
            default:
                break;
        }
        
        if(lastMonth != -1){
            
            int tempDay = calendar.get(Calendar.DAY_OF_MONTH);
            calendar.set(Calendar.DAY_OF_MONTH, 1);
            int tempMonth = calendar.get(Calendar.MONTH);
            calendar.set(Calendar.MONTH, lastMonth);
            int lastWeekday = calendar.get(Calendar.DAY_OF_WEEK);
            calendar.set(Calendar.DAY_OF_MONTH, tempDay);
            calendar.set(Calendar.MONTH, tempMonth);
            
        switch (lastWeekday) {
            case 1:
                calButton1.removeActionListener(listener1);
                calButton2.removeActionListener(listener2);
                calButton3.removeActionListener(listener3);
                calButton4.removeActionListener(listener4);
                calButton5.removeActionListener(listener5);
                calButton6.removeActionListener(listener6);
                calButton7.removeActionListener(listener7);
                calButton8.removeActionListener(listener8);
                calButton9.removeActionListener(listener9);
                calButton10.removeActionListener(listener10);
                calButton11.removeActionListener(listener11);
                calButton12.removeActionListener(listener12);
                calButton13.removeActionListener(listener13);
                calButton14.removeActionListener(listener14);
                calButton15.removeActionListener(listener15);
                calButton16.removeActionListener(listener16);
                calButton17.removeActionListener(listener17);
                calButton18.removeActionListener(listener18);
                calButton19.removeActionListener(listener19);
                calButton20.removeActionListener(listener20);
                calButton21.removeActionListener(listener21);
                calButton22.removeActionListener(listener22);
                calButton23.removeActionListener(listener23);
                calButton24.removeActionListener(listener24);
                calButton25.removeActionListener(listener25);
                calButton26.removeActionListener(listener26);
                calButton27.removeActionListener(listener27);
                calButton28.removeActionListener(listener28);
                calButton29.removeActionListener(listener29);
                calButton30.removeActionListener(listener30);
                calButton31.removeActionListener(listener31);
                break;
            case 2:
                calButton2.removeActionListener(listener1);
                calButton3.removeActionListener(listener2);
                calButton4.removeActionListener(listener3);
                calButton5.removeActionListener(listener4);
                calButton6.removeActionListener(listener5);
                calButton7.removeActionListener(listener6);
                calButton8.removeActionListener(listener7);
                calButton9.removeActionListener(listener8);
                calButton10.removeActionListener(listener9);
                calButton11.removeActionListener(listener10);
                calButton12.removeActionListener(listener11);
                calButton13.removeActionListener(listener12);
                calButton14.removeActionListener(listener13);
                calButton15.removeActionListener(listener14);
                calButton16.removeActionListener(listener15);
                calButton17.removeActionListener(listener16);
                calButton18.removeActionListener(listener17);
                calButton19.removeActionListener(listener18);
                calButton20.removeActionListener(listener19);
                calButton21.removeActionListener(listener20);
                calButton22.removeActionListener(listener21);
                calButton23.removeActionListener(listener22);
                calButton24.removeActionListener(listener23);
                calButton25.removeActionListener(listener24);
                calButton26.removeActionListener(listener25);
                calButton27.removeActionListener(listener26);
                calButton28.removeActionListener(listener27);
                calButton29.removeActionListener(listener28);
                calButton30.removeActionListener(listener29);
                calButton31.removeActionListener(listener30);
                calButton32.removeActionListener(listener31);
                break;
            case 3:
                calButton3.removeActionListener(listener1);
                calButton4.removeActionListener(listener2);
                calButton5.removeActionListener(listener3);
                calButton6.removeActionListener(listener4);
                calButton7.removeActionListener(listener5);
                calButton8.removeActionListener(listener6);
                calButton9.removeActionListener(listener7);
                calButton10.removeActionListener(listener8);
                calButton11.removeActionListener(listener9);
                calButton12.removeActionListener(listener10);
                calButton13.removeActionListener(listener11);
                calButton14.removeActionListener(listener12);
                calButton15.removeActionListener(listener13);
                calButton16.removeActionListener(listener14);
                calButton17.removeActionListener(listener15);
                calButton18.removeActionListener(listener16);
                calButton19.removeActionListener(listener17);
                calButton20.removeActionListener(listener18);
                calButton21.removeActionListener(listener19);
                calButton22.removeActionListener(listener20);
                calButton23.removeActionListener(listener21);
                calButton24.removeActionListener(listener22);
                calButton25.removeActionListener(listener23);
                calButton26.removeActionListener(listener24);
                calButton27.removeActionListener(listener25);
                calButton28.removeActionListener(listener26);
                calButton29.removeActionListener(listener27);
                calButton30.removeActionListener(listener28);
                calButton31.removeActionListener(listener29);
                calButton32.removeActionListener(listener30);
                calButton33.removeActionListener(listener31);
                break;
            case 4:
                calButton4.removeActionListener(listener1);
                calButton5.removeActionListener(listener2);
                calButton6.removeActionListener(listener3);
                calButton7.removeActionListener(listener4);
                calButton8.removeActionListener(listener5);
                calButton9.removeActionListener(listener6);
                calButton10.removeActionListener(listener7);
                calButton11.removeActionListener(listener8);
                calButton12.removeActionListener(listener9);
                calButton13.removeActionListener(listener10);
                calButton14.removeActionListener(listener11);
                calButton15.removeActionListener(listener12);
                calButton16.removeActionListener(listener13);
                calButton17.removeActionListener(listener14);
                calButton18.removeActionListener(listener15);
                calButton19.removeActionListener(listener16);
                calButton20.removeActionListener(listener17);
                calButton21.removeActionListener(listener18);
                calButton22.removeActionListener(listener19);
                calButton23.removeActionListener(listener20);
                calButton24.removeActionListener(listener21);
                calButton25.removeActionListener(listener22);
                calButton26.removeActionListener(listener23);
                calButton27.removeActionListener(listener24);
                calButton28.removeActionListener(listener25);
                calButton29.removeActionListener(listener26);
                calButton30.removeActionListener(listener27);
                calButton31.removeActionListener(listener28);
                calButton32.removeActionListener(listener29);
                calButton33.removeActionListener(listener30);
                calButton34.removeActionListener(listener31);
                break;
            case 5:
                calButton5.removeActionListener(listener1);
                calButton6.removeActionListener(listener2);
                calButton7.removeActionListener(listener3);
                calButton8.removeActionListener(listener4);
                calButton9.removeActionListener(listener5);
                calButton10.removeActionListener(listener6);
                calButton11.removeActionListener(listener7);
                calButton12.removeActionListener(listener8);
                calButton13.removeActionListener(listener9);
                calButton14.removeActionListener(listener10);
                calButton15.removeActionListener(listener11);
                calButton16.removeActionListener(listener12);
                calButton17.removeActionListener(listener13);
                calButton18.removeActionListener(listener14);
                calButton19.removeActionListener(listener15);
                calButton20.removeActionListener(listener16);
                calButton21.removeActionListener(listener17);
                calButton22.removeActionListener(listener18);
                calButton23.removeActionListener(listener19);
                calButton24.removeActionListener(listener20);
                calButton25.removeActionListener(listener21);
                calButton26.removeActionListener(listener22);
                calButton27.removeActionListener(listener23);
                calButton28.removeActionListener(listener24);
                calButton29.removeActionListener(listener25);
                calButton30.removeActionListener(listener26);
                calButton31.removeActionListener(listener27);
                calButton32.removeActionListener(listener28);
                calButton33.removeActionListener(listener29);
                calButton34.removeActionListener(listener30);
                calButton35.removeActionListener(listener31);
                break;
            case 6:
                calButton6.removeActionListener(listener1);
                calButton7.removeActionListener(listener2);
                calButton8.removeActionListener(listener3);
                calButton9.removeActionListener(listener4);
                calButton10.removeActionListener(listener5);
                calButton11.removeActionListener(listener6);
                calButton12.removeActionListener(listener7);
                calButton13.removeActionListener(listener8);
                calButton14.removeActionListener(listener9);
                calButton15.removeActionListener(listener10);
                calButton16.removeActionListener(listener11);
                calButton17.removeActionListener(listener12);
                calButton18.removeActionListener(listener13);
                calButton19.removeActionListener(listener14);
                calButton20.removeActionListener(listener15);
                calButton21.removeActionListener(listener16);
                calButton22.removeActionListener(listener17);
                calButton23.removeActionListener(listener18);
                calButton24.removeActionListener(listener19);
                calButton25.removeActionListener(listener20);
                calButton26.removeActionListener(listener21);
                calButton27.removeActionListener(listener22);
                calButton28.removeActionListener(listener23);
                calButton29.removeActionListener(listener24);
                calButton30.removeActionListener(listener25);
                calButton31.removeActionListener(listener26);
                calButton32.removeActionListener(listener27);
                calButton33.removeActionListener(listener28);
                calButton34.removeActionListener(listener29);
                calButton35.removeActionListener(listener30);
                calButton36.removeActionListener(listener31);
                break;
            case 7:
                calButton7.removeActionListener(listener1);
                calButton8.removeActionListener(listener2);
                calButton9.removeActionListener(listener3);
                calButton10.removeActionListener(listener4);
                calButton11.removeActionListener(listener5);
                calButton12.removeActionListener(listener6);
                calButton13.removeActionListener(listener7);
                calButton14.removeActionListener(listener8);
                calButton15.removeActionListener(listener9);
                calButton16.removeActionListener(listener10);
                calButton17.removeActionListener(listener11);
                calButton18.removeActionListener(listener12);
                calButton19.removeActionListener(listener13);
                calButton20.removeActionListener(listener14);
                calButton21.removeActionListener(listener15);
                calButton22.removeActionListener(listener16);
                calButton23.removeActionListener(listener17);
                calButton24.removeActionListener(listener18);
                calButton25.removeActionListener(listener19);
                calButton26.removeActionListener(listener20);
                calButton27.removeActionListener(listener21);
                calButton28.removeActionListener(listener22);
                calButton29.removeActionListener(listener23);
                calButton30.removeActionListener(listener24);
                calButton31.removeActionListener(listener25);
                calButton32.removeActionListener(listener26);
                calButton33.removeActionListener(listener27);
                calButton34.removeActionListener(listener28);
                calButton35.removeActionListener(listener29);
                calButton36.removeActionListener(listener30);
                calButton37.removeActionListener(listener31);
                break;
            default:
                break;
        }
        }
        
    }
    
    private void month31(int weekday){
        
        switch (weekday) {
            case 1:
                calButton1.setText("01");
		calButton1.addActionListener(listener1);
                calButton1.setVisible(true);
                calButton2.setText("02");
		calButton2.addActionListener(listener2);                
                calButton2.setVisible(true);
                calButton3.setText("03");
		calButton3.addActionListener(listener3); 
                calButton3.setVisible(true);
                calButton4.setText("04");
		calButton4.addActionListener(listener4); 
                calButton4.setVisible(true);
                calButton5.setText("05");
		calButton5.addActionListener(listener5); 
                calButton5.setVisible(true);
                calButton6.setText("06");
		calButton6.addActionListener(listener6); 
                calButton6.setVisible(true);
                calButton7.setText("07");
		calButton7.addActionListener(listener7); 
                calButton7.setVisible(true);
                calButton8.setText("08");
		calButton8.addActionListener(listener8); 
                calButton8.setVisible(true);
                calButton9.setText("09");
		calButton9.addActionListener(listener9); 
                calButton9.setVisible(true);
                calButton10.setText("10");
		calButton10.addActionListener(listener10); 
                calButton10.setVisible(true);
                calButton11.setText("11");
		calButton11.addActionListener(listener11); 
                calButton11.setVisible(true);
                calButton12.setText("12");
		calButton12.addActionListener(listener12); 
                calButton12.setVisible(true);
                calButton13.setText("13");
		calButton13.addActionListener(listener13); 
                calButton13.setVisible(true);
                calButton14.setText("14");
		calButton14.addActionListener(listener14); 
                calButton14.setVisible(true);
                calButton15.setText("15");
		calButton15.addActionListener(listener15); 
                calButton15.setVisible(true);
                calButton16.setText("16");
		calButton16.addActionListener(listener16); 
                calButton16.setVisible(true);
                calButton17.setText("17");
		calButton17.addActionListener(listener17); 
                calButton17.setVisible(true);
                calButton18.setText("18");
		calButton18.addActionListener(listener18); 
                calButton18.setVisible(true);
                calButton19.setText("19");
		calButton19.addActionListener(listener19); 
                calButton19.setVisible(true);
                calButton20.setText("20");
		calButton20.addActionListener(listener20); 
                calButton20.setVisible(true);
                calButton21.setText("21");
		calButton21.addActionListener(listener21); 
                calButton21.setVisible(true);
                calButton22.setText("22");
		calButton22.addActionListener(listener22); 
                calButton22.setVisible(true);
                calButton23.setText("23");
		calButton23.addActionListener(listener23); 
                calButton23.setVisible(true);
                calButton24.setText("24");
		calButton24.addActionListener(listener24); 
                calButton24.setVisible(true);
                calButton25.setText("25");
		calButton25.addActionListener(listener25); 
                calButton25.setVisible(true);
                calButton26.setText("26");
		calButton26.addActionListener(listener26); 
                calButton26.setVisible(true);
                calButton27.setText("27");
		calButton27.addActionListener(listener27); 
                calButton27.setVisible(true);
                calButton28.setText("28");
		calButton28.addActionListener(listener28); 
                calButton28.setVisible(true);
                calButton29.setText("29");
		calButton29.addActionListener(listener29); 
                calButton29.setVisible(true);
                calButton30.setText("30");
		calButton30.addActionListener(listener30); 
                calButton30.setVisible(true);
                calButton31.setText("31");
		calButton31.addActionListener(listener31); 
                calButton31.setVisible(true);
                calButton32.setVisible(false);
                calButton33.setVisible(false);
                calButton34.setVisible(false);
                calButton35.setVisible(false);
                calButton36.setVisible(false);
                calButton37.setVisible(false);
                calButton38.setVisible(false);
                calButton39.setVisible(false);
                calButton40.setVisible(false);
                calButton41.setVisible(false);
                calButton42.setVisible(false);
                break;
            case 2:
                calButton1.setVisible(false);
                calButton2.setText("01");
		calButton2.addActionListener(listener1);                
                calButton2.setVisible(true);
                calButton3.setText("02");
		calButton3.addActionListener(listener2);   
                calButton3.setVisible(true);
                calButton4.setText("03");
		calButton4.addActionListener(listener3);   
                calButton4.setVisible(true);
                calButton5.setText("04");
		calButton5.addActionListener(listener4);   
                calButton5.setVisible(true);
                calButton6.setText("05");
		calButton6.addActionListener(listener5);   
                calButton6.setVisible(true);
                calButton7.setText("06");
		calButton7.addActionListener(listener6);   
                calButton7.setVisible(true);
                calButton8.setText("07");
		calButton8.addActionListener(listener7);   
                calButton8.setVisible(true);
                calButton9.setText("08");
		calButton9.addActionListener(listener8);   
                calButton9.setVisible(true);
                calButton10.setText("09");
		calButton10.addActionListener(listener9);   
                calButton10.setVisible(true);
                calButton11.setText("10");
		calButton11.addActionListener(listener10);   
                calButton11.setVisible(true);
                calButton12.setText("11");
		calButton12.addActionListener(listener11);   
                calButton12.setVisible(true);
                calButton13.setText("12");
		calButton13.addActionListener(listener12);   
                calButton13.setVisible(true);
                calButton14.setText("13");
		calButton13.addActionListener(listener13);   
                calButton14.setVisible(true);
                calButton15.setText("14");
		calButton14.addActionListener(listener14);   
                calButton15.setVisible(true);
                calButton16.setText("15");
		calButton16.addActionListener(listener15);   
                calButton16.setVisible(true);
                calButton17.setText("16");
		calButton17.addActionListener(listener16);   
                calButton17.setVisible(true);
                calButton18.setText("17");
		calButton18.addActionListener(listener17);   
                calButton18.setVisible(true);
                calButton19.setText("18");
		calButton19.addActionListener(listener18);   
                calButton19.setVisible(true);
                calButton20.setText("19");
		calButton20.addActionListener(listener19);   
                calButton20.setVisible(true);
                calButton21.setText("20");
		calButton21.addActionListener(listener20);   
                calButton21.setVisible(true);
                calButton22.setText("21");
		calButton22.addActionListener(listener21);   
                calButton22.setVisible(true);
                calButton23.setText("22");
		calButton23.addActionListener(listener22);   
                calButton23.setVisible(true);
                calButton24.setText("23");
		calButton24.addActionListener(listener23);   
                calButton24.setVisible(true);
                calButton25.setText("24");
		calButton25.addActionListener(listener24);   
                calButton25.setVisible(true);
                calButton26.setText("25");
		calButton26.addActionListener(listener25);   
                calButton26.setVisible(true);
                calButton27.setText("26");
		calButton27.addActionListener(listener26);   
                calButton27.setVisible(true);
                calButton28.setText("27");
		calButton28.addActionListener(listener27);   
                calButton28.setVisible(true);
                calButton29.setText("28");
		calButton29.addActionListener(listener28);   
                calButton29.setVisible(true);
                calButton30.setText("29");
		calButton30.addActionListener(listener29);   
                calButton30.setVisible(true);
                calButton31.setText("30");
		calButton31.addActionListener(listener30);   
                calButton31.setVisible(true);
                calButton32.setText("31");
		calButton32.addActionListener(listener31);   
                calButton32.setVisible(true);
                calButton33.setVisible(false);
                calButton34.setVisible(false);
                calButton35.setVisible(false);
                calButton36.setVisible(false);
                calButton37.setVisible(false);
                calButton38.setVisible(false);
                calButton39.setVisible(false);
                calButton40.setVisible(false);
                calButton41.setVisible(false);
                calButton42.setVisible(false);
                break;
            case 3:
                calButton1.setVisible(false);
                calButton2.setVisible(false);
                calButton3.setText("01");
		calButton3.addActionListener(listener1);  
                calButton3.setVisible(true);
                calButton4.setText("02");
		calButton4.addActionListener(listener2);  
                calButton4.setVisible(true);
                calButton5.setText("03");
		calButton5.addActionListener(listener3);  
                calButton5.setVisible(true);
                calButton6.setText("04");
		calButton6.addActionListener(listener4);  
                calButton6.setVisible(true);
                calButton7.setText("05");
		calButton7.addActionListener(listener5);  
                calButton7.setVisible(true);
                calButton8.setText("06");
		calButton8.addActionListener(listener6);  
                calButton8.setVisible(true);
                calButton9.setText("07");
		calButton9.addActionListener(listener7);  
                calButton9.setVisible(true);
                calButton10.setText("08");
		calButton10.addActionListener(listener8);  
                calButton10.setVisible(true);
                calButton11.setText("09");
		calButton11.addActionListener(listener9);  
                calButton11.setVisible(true);
                calButton12.setText("10");
		calButton12.addActionListener(listener10);  
                calButton12.setVisible(true);
                calButton13.setText("11");
		calButton13.addActionListener(listener11);  
                calButton13.setVisible(true);
                calButton14.setText("12");
		calButton14.addActionListener(listener12);  
                calButton14.setVisible(true);
                calButton15.setText("13");
		calButton15.addActionListener(listener13);  
                calButton15.setVisible(true);
                calButton16.setText("14");
		calButton16.addActionListener(listener14);  
                calButton16.setVisible(true);
                calButton17.setText("15");
		calButton17.addActionListener(listener15);  
                calButton17.setVisible(true);
                calButton18.setText("16");
		calButton18.addActionListener(listener16);  
                calButton18.setVisible(true);
                calButton19.setText("17");
		calButton19.addActionListener(listener17);  
                calButton19.setVisible(true);
                calButton20.setText("18");
		calButton20.addActionListener(listener18);  
                calButton20.setVisible(true);
                calButton21.setText("19");
		calButton21.addActionListener(listener19);  
                calButton21.setVisible(true);
                calButton22.setText("20");
		calButton22.addActionListener(listener20);  
                calButton22.setVisible(true);
                calButton23.setText("21");
		calButton23.addActionListener(listener21);  
                calButton23.setVisible(true);
                calButton24.setText("22");
		calButton24.addActionListener(listener22);  
                calButton24.setVisible(true);
                calButton25.setText("23");
		calButton25.addActionListener(listener23);  
                calButton25.setVisible(true);
                calButton26.setText("24");
		calButton26.addActionListener(listener24);  
                calButton26.setVisible(true);
                calButton27.setText("25");
		calButton27.addActionListener(listener25);  
                calButton27.setVisible(true);
                calButton28.setText("26");
		calButton28.addActionListener(listener26);  
                calButton28.setVisible(true);
                calButton29.setText("27");
		calButton29.addActionListener(listener27);  
                calButton29.setVisible(true);
                calButton30.setText("28");
		calButton30.addActionListener(listener28);  
                calButton30.setVisible(true);
                calButton31.setText("29");
		calButton31.addActionListener(listener29);  
                calButton31.setVisible(true);
                calButton32.setText("30");
		calButton32.addActionListener(listener30);                  
                calButton32.setVisible(true);               
                calButton33.setText("31");
		calButton33.addActionListener(listener31);  
                calButton33.setVisible(true);
                calButton34.setVisible(false);
                calButton35.setVisible(false);
                calButton36.setVisible(false);
                calButton37.setVisible(false);
                calButton38.setVisible(false);
                calButton39.setVisible(false);
                calButton40.setVisible(false);
                calButton41.setVisible(false);
                calButton42.setVisible(false);
                break;
            case 4:
                calButton1.setVisible(false);
                calButton2.setVisible(false);
                calButton3.setVisible(false);
                calButton4.setText("01");
		calButton4.addActionListener(listener1);  
                calButton4.setVisible(true);
                calButton5.setText("02");
		calButton5.addActionListener(listener2);  
                calButton5.setVisible(true);
                calButton6.setText("03");
		calButton6.addActionListener(listener3);  
                calButton6.setVisible(true);
                calButton7.setText("04");
		calButton7.addActionListener(listener4);  
                calButton7.setVisible(true);
                calButton8.setText("05");
		calButton8.addActionListener(listener5);  
                calButton8.setVisible(true);
                calButton9.setText("06");
		calButton9.addActionListener(listener6);  
                calButton9.setVisible(true);
                calButton10.setText("07");
		calButton10.addActionListener(listener7);  
                calButton10.setVisible(true);
                calButton11.setText("08");
		calButton11.addActionListener(listener8);  
                calButton11.setVisible(true);
                calButton12.setText("09");
		calButton12.addActionListener(listener9);  
                calButton12.setVisible(true);
                calButton13.setText("10");
		calButton13.addActionListener(listener10);  
                calButton13.setVisible(true);
                calButton14.setText("11");
		calButton14.addActionListener(listener11);  
                calButton14.setVisible(true);
                calButton15.setText("12");
		calButton15.addActionListener(listener12);  
                calButton15.setVisible(true);
                calButton16.setText("13");
		calButton16.addActionListener(listener13);  
                calButton16.setVisible(true);
                calButton17.setText("14");
		calButton17.addActionListener(listener14);  
                calButton17.setVisible(true);
                calButton18.setText("15");
		calButton18.addActionListener(listener15);  
                calButton18.setVisible(true);
                calButton19.setText("16");
		calButton19.addActionListener(listener16);  
                calButton19.setVisible(true);
                calButton20.setText("17");
		calButton20.addActionListener(listener17);  
                calButton20.setVisible(true);
                calButton21.setText("18");
		calButton21.addActionListener(listener18);  
                calButton21.setVisible(true);
                calButton22.setText("19");
		calButton22.addActionListener(listener19);  
                calButton22.setVisible(true);
                calButton23.setText("20");
		calButton23.addActionListener(listener20);  
                calButton23.setVisible(true);
                calButton24.setText("21");
		calButton24.addActionListener(listener21);  
                calButton24.setVisible(true);
                calButton25.setText("22");
		calButton25.addActionListener(listener22);  
                calButton25.setVisible(true);
                calButton26.setText("23");
		calButton26.addActionListener(listener23);  
                calButton26.setVisible(true);
                calButton27.setText("24");
		calButton27.addActionListener(listener24);  
                calButton27.setVisible(true);
                calButton28.setText("25");
		calButton28.addActionListener(listener25);  
                calButton28.setVisible(true);
                calButton29.setText("26");
		calButton29.addActionListener(listener26);  
                calButton29.setVisible(true);
                calButton30.setText("27");
		calButton30.addActionListener(listener27);  
                calButton30.setVisible(true);
                calButton31.setText("28");
		calButton31.addActionListener(listener28);  
                calButton31.setVisible(true);
                calButton32.setText("29");
		calButton32.addActionListener(listener29);  
                calButton32.setVisible(true);
                calButton33.setText("30");
		calButton33.addActionListener(listener30);  
                calButton33.setVisible(true);
                calButton34.setText("31");
		calButton34.addActionListener(listener31);  
                calButton34.setVisible(true);
                calButton35.setVisible(false);
                calButton36.setVisible(false);
                calButton37.setVisible(false);
                calButton38.setVisible(false);
                calButton39.setVisible(false);
                calButton40.setVisible(false);
                calButton41.setVisible(false);
                calButton42.setVisible(false);
                break;
            case 5:
                calButton1.setVisible(false);
                calButton2.setVisible(false);
                calButton3.setVisible(false);
                calButton4.setVisible(false);
                calButton5.setText("01");
		calButton5.addActionListener(listener1);  
                calButton5.setVisible(true);
                calButton6.setText("02");
		calButton6.addActionListener(listener2);  
                calButton6.setVisible(true);
                calButton7.setText("03");
		calButton7.addActionListener(listener3);  
                calButton7.setVisible(true);
                calButton8.setText("04");
		calButton8.addActionListener(listener4);  
                calButton8.setVisible(true);
                calButton9.setText("05");
		calButton9.addActionListener(listener5);  
                calButton9.setVisible(true);
                calButton10.setText("06");
		calButton10.addActionListener(listener6);  
                calButton10.setVisible(true);
                calButton11.setText("07");
		calButton11.addActionListener(listener7);  
                calButton11.setVisible(true);
                calButton12.setText("08");
		calButton12.addActionListener(listener8);  
                calButton12.setVisible(true);
                calButton13.setText("09");
		calButton13.addActionListener(listener9);  
                calButton13.setVisible(true);
                calButton14.setText("10");
		calButton14.addActionListener(listener10);  
                calButton14.setVisible(true);
                calButton15.setText("11");
		calButton15.addActionListener(listener11);  
                calButton15.setVisible(true);
                calButton16.setText("12");
		calButton16.addActionListener(listener12);  
                calButton16.setVisible(true);
                calButton17.setText("13");
		calButton17.addActionListener(listener13);  
                calButton17.setVisible(true);
                calButton18.setText("14");
		calButton18.addActionListener(listener14);  
                calButton18.setVisible(true);
                calButton19.setText("15");
		calButton19.addActionListener(listener15);  
                calButton19.setVisible(true);
                calButton20.setText("16");
		calButton20.addActionListener(listener16);  
                calButton20.setVisible(true);
                calButton21.setText("17");
		calButton21.addActionListener(listener17);  
                calButton21.setVisible(true);
                calButton22.setText("18");
		calButton22.addActionListener(listener18);  
                calButton22.setVisible(true);
                calButton23.setText("19");
		calButton23.addActionListener(listener19);  
                calButton23.setVisible(true);
                calButton24.setText("20");
		calButton24.addActionListener(listener20);  
                calButton24.setVisible(true);
                calButton25.setText("21");
		calButton25.addActionListener(listener21);  
                calButton25.setVisible(true);
                calButton26.setText("22");
		calButton26.addActionListener(listener22);  
                calButton26.setVisible(true);
                calButton27.setText("23");
		calButton27.addActionListener(listener23);  
                calButton27.setVisible(true);
                calButton28.setText("24");
		calButton28.addActionListener(listener24);  
                calButton28.setVisible(true);
                calButton29.setText("25");
		calButton29.addActionListener(listener25);  
                calButton29.setVisible(true);
                calButton30.setText("26");
		calButton30.addActionListener(listener26);  
                calButton30.setVisible(true);
                calButton31.setText("27");
		calButton31.addActionListener(listener27);  
                calButton31.setVisible(true);
                calButton32.setText("28");
		calButton32.addActionListener(listener28);  
                calButton32.setVisible(true);
                calButton33.setText("29");
		calButton33.addActionListener(listener29);  
                calButton33.setVisible(true);
                calButton34.setText("30");
		calButton34.addActionListener(listener30);  
                calButton34.setVisible(true);
                calButton35.setText("31");
		calButton35.addActionListener(listener31);  
                calButton35.setVisible(true);
                calButton36.setVisible(false);
                calButton37.setVisible(false);
                calButton38.setVisible(false);
                calButton39.setVisible(false);
                calButton40.setVisible(false);
                calButton41.setVisible(false);
                calButton42.setVisible(false);
                break;
            case 6:
                calButton1.setVisible(false);
                calButton2.setVisible(false);
                calButton3.setVisible(false);
                calButton4.setVisible(false);
                calButton5.setVisible(false);
                calButton6.setText("01");
		calButton6.addActionListener(listener1);  
                calButton6.setVisible(true);
                calButton7.setText("02");
		calButton7.addActionListener(listener2);  
                calButton7.setVisible(true);
                calButton8.setText("03");
		calButton8.addActionListener(listener3);  
                calButton8.setVisible(true);
                calButton9.setText("04");
		calButton9.addActionListener(listener4);  
                calButton9.setVisible(true);
                calButton10.setText("05");
		calButton10.addActionListener(listener5);  
                calButton10.setVisible(true);
                calButton11.setText("06");
		calButton11.addActionListener(listener6);  
                calButton11.setVisible(true);
                calButton12.setText("07");
		calButton12.addActionListener(listener7);  
                calButton12.setVisible(true);
                calButton13.setText("08");
		calButton13.addActionListener(listener8);  
                calButton13.setVisible(true);
                calButton14.setText("09");
		calButton14.addActionListener(listener9);  
                calButton14.setVisible(true);
                calButton15.setText("10");
		calButton15.addActionListener(listener10);  
                calButton15.setVisible(true);
                calButton16.setText("11");
		calButton16.addActionListener(listener11);  
                calButton16.setVisible(true);
                calButton17.setText("12");
		calButton17.addActionListener(listener12);  
                calButton17.setVisible(true);
                calButton18.setText("13");
		calButton18.addActionListener(listener13);  
                calButton18.setVisible(true);
                calButton19.setText("14");
		calButton19.addActionListener(listener14);  
                calButton19.setVisible(true);
                calButton20.setText("15");
		calButton20.addActionListener(listener15);  
                calButton20.setVisible(true);
                calButton21.setText("16");
		calButton21.addActionListener(listener16);  
                calButton21.setVisible(true);
                calButton22.setText("17");
		calButton22.addActionListener(listener17);  
                calButton22.setVisible(true);
                calButton23.setText("18");
		calButton23.addActionListener(listener18);  
                calButton23.setVisible(true);
                calButton24.setText("19");
		calButton24.addActionListener(listener19);  
                calButton24.setVisible(true);
                calButton25.setText("20");
		calButton25.addActionListener(listener20);  
                calButton25.setVisible(true);
                calButton26.setText("21");
		calButton26.addActionListener(listener21);  
                calButton26.setVisible(true);
                calButton27.setText("22");
		calButton27.addActionListener(listener22);  
                calButton27.setVisible(true);
                calButton28.setText("23");
		calButton28.addActionListener(listener23);  
                calButton28.setVisible(true);
                calButton29.setText("24");
		calButton29.addActionListener(listener24);  
                calButton29.setVisible(true);
                calButton30.setText("25");
		calButton30.addActionListener(listener25);  
                calButton30.setVisible(true);
                calButton31.setText("26");
		calButton31.addActionListener(listener26);  
                calButton31.setVisible(true);
                calButton32.setText("27");
		calButton32.addActionListener(listener27);  
                calButton32.setVisible(true);
                calButton33.setText("28");
		calButton33.addActionListener(listener28);  
                calButton33.setVisible(true);
                calButton34.setText("29");
		calButton34.addActionListener(listener29);  
                calButton34.setVisible(true);
                calButton35.setText("30");
		calButton35.addActionListener(listener30);  
                calButton35.setVisible(true);
                calButton36.setText("31");
		calButton36.addActionListener(listener31);  
                calButton36.setVisible(true);
                calButton37.setVisible(false);
                calButton38.setVisible(false);
                calButton39.setVisible(false);
                calButton40.setVisible(false);
                calButton41.setVisible(false);
                calButton42.setVisible(false);
                break;
            case 7:
                calButton1.setVisible(false);
                calButton2.setVisible(false);
                calButton3.setVisible(false);
                calButton4.setVisible(false);
                calButton5.setVisible(false);
                calButton6.setVisible(false);
                calButton7.setText("01");
		calButton7.addActionListener(listener1);  
                calButton7.setVisible(true);
                calButton8.setText("02");
		calButton8.addActionListener(listener2);  
                calButton8.setVisible(true);
                calButton9.setText("03");
		calButton9.addActionListener(listener3);  
                calButton9.setVisible(true);
                calButton10.setText("04");
		calButton10.addActionListener(listener4);  
                calButton10.setVisible(true);
                calButton11.setText("05");
		calButton11.addActionListener(listener5);  
                calButton11.setVisible(true);
                calButton12.setText("06");
		calButton12.addActionListener(listener6);  
                calButton12.setVisible(true);
                calButton13.setText("07");
		calButton13.addActionListener(listener7);  
                calButton13.setVisible(true);
                calButton14.setText("08");
		calButton14.addActionListener(listener8);  
                calButton14.setVisible(true);
                calButton15.setText("09");
		calButton15.addActionListener(listener9);  
                calButton15.setVisible(true);
                calButton16.setText("10");
		calButton16.addActionListener(listener10);  
                calButton16.setVisible(true);
                calButton17.setText("11");
		calButton17.addActionListener(listener11);  
                calButton17.setVisible(true);
                calButton18.setText("12");
		calButton18.addActionListener(listener12);  
                calButton18.setVisible(true);
                calButton19.setText("13");
		calButton19.addActionListener(listener13);  
                calButton19.setVisible(true);
                calButton20.setText("14");
		calButton20.addActionListener(listener14);  
                calButton20.setVisible(true);
                calButton21.setText("15");
		calButton21.addActionListener(listener15);  
                calButton21.setVisible(true);
                calButton22.setText("16");
		calButton22.addActionListener(listener16);  
                calButton22.setVisible(true);
                calButton23.setText("17");
                calButton23.addActionListener(listener17);
                calButton23.setVisible(true);		  
                calButton24.setText("18");
		calButton24.addActionListener(listener18);  
                calButton24.setVisible(true);
                calButton25.setText("19");
		calButton25.addActionListener(listener19);  
                calButton25.setVisible(true);
                calButton26.setText("20");
		calButton26.addActionListener(listener20);  
                calButton26.setVisible(true);
                calButton27.setText("21");
		calButton27.addActionListener(listener21);  
                calButton27.setVisible(true);
                calButton28.setText("22");
		calButton28.addActionListener(listener22);  
                calButton28.setVisible(true);
                calButton29.setText("23");
		calButton29.addActionListener(listener23);  
                calButton29.setVisible(true);
                calButton30.setText("24");
		calButton30.addActionListener(listener24);  
                calButton30.setVisible(true);
                calButton31.setText("25");
		calButton31.addActionListener(listener25);  
                calButton31.setVisible(true);
                calButton32.setText("26");
		calButton32.addActionListener(listener26);  
                calButton32.setVisible(true);
                calButton33.setText("27");
		calButton33.addActionListener(listener27);  
                calButton33.setVisible(true);
                calButton34.setText("28");
		calButton34.addActionListener(listener28);  
                calButton34.setVisible(true);
                calButton35.setText("29");
		calButton35.addActionListener(listener29);  
                calButton35.setVisible(true);
                calButton36.setText("30");
		calButton36.addActionListener(listener30);  
                calButton36.setVisible(true);
                calButton37.setText("31");
		calButton37.addActionListener(listener31);  
                calButton37.setVisible(true);
                calButton38.setVisible(false);
                calButton39.setVisible(false);
                calButton40.setVisible(false);
                calButton41.setVisible(false);
                calButton42.setVisible(false);
                break;
            default:
                //put error message
                break;
        }
        
    }

    private void month30(int weekday){
        
        switch (weekday) {
            case 1:
                calButton1.setText("01");
		calButton1.addActionListener(listener1);
                calButton1.setVisible(true);
                calButton2.setText("02");
		calButton2.addActionListener(listener2);                
                calButton2.setVisible(true);
                calButton3.setText("03");
		calButton3.addActionListener(listener3); 
                calButton3.setVisible(true);
                calButton4.setText("04");
		calButton4.addActionListener(listener4); 
                calButton4.setVisible(true);
                calButton5.setText("05");
		calButton5.addActionListener(listener5); 
                calButton5.setVisible(true);
                calButton6.setText("06");
		calButton6.addActionListener(listener6); 
                calButton6.setVisible(true);
                calButton7.setText("07");
		calButton7.addActionListener(listener7); 
                calButton7.setVisible(true);
                calButton8.setText("08");
		calButton8.addActionListener(listener8); 
                calButton8.setVisible(true);
                calButton9.setText("09");
		calButton9.addActionListener(listener9); 
                calButton9.setVisible(true);
                calButton10.setText("10");
		calButton10.addActionListener(listener10); 
                calButton10.setVisible(true);
                calButton11.setText("11");
		calButton11.addActionListener(listener11); 
                calButton11.setVisible(true);
                calButton12.setText("12");
		calButton12.addActionListener(listener12); 
                calButton12.setVisible(true);
                calButton13.setText("13");
		calButton13.addActionListener(listener13); 
                calButton13.setVisible(true);
                calButton14.setText("14");
		calButton14.addActionListener(listener14); 
                calButton14.setVisible(true);
                calButton15.setText("15");
		calButton15.addActionListener(listener15); 
                calButton15.setVisible(true);
                calButton16.setText("16");
		calButton16.addActionListener(listener16); 
                calButton16.setVisible(true);
                calButton17.setText("17");
		calButton17.addActionListener(listener17); 
                calButton17.setVisible(true);
                calButton18.setText("18");
		calButton18.addActionListener(listener18); 
                calButton18.setVisible(true);
                calButton19.setText("19");
		calButton19.addActionListener(listener19); 
                calButton19.setVisible(true);
                calButton20.setText("20");
		calButton20.addActionListener(listener20); 
                calButton20.setVisible(true);
                calButton21.setText("21");
		calButton21.addActionListener(listener21); 
                calButton21.setVisible(true);
                calButton22.setText("22");
		calButton22.addActionListener(listener22); 
                calButton22.setVisible(true);
                calButton23.setText("23");
		calButton23.addActionListener(listener23); 
                calButton23.setVisible(true);
                calButton24.setText("24");
		calButton24.addActionListener(listener24); 
                calButton24.setVisible(true);
                calButton25.setText("25");
		calButton25.addActionListener(listener25); 
                calButton25.setVisible(true);
                calButton26.setText("26");
		calButton26.addActionListener(listener26); 
                calButton26.setVisible(true);
                calButton27.setText("27");
		calButton27.addActionListener(listener27); 
                calButton27.setVisible(true);
                calButton28.setText("28");
		calButton28.addActionListener(listener28); 
                calButton28.setVisible(true);
                calButton29.setText("29");
		calButton29.addActionListener(listener29); 
                calButton29.setVisible(true);
                calButton30.setText("30");
		calButton30.addActionListener(listener30); 
                calButton30.setVisible(true);
                calButton31.setText("31");
		calButton31.addActionListener(listener31); 
                calButton31.setVisible(false);
                calButton32.setVisible(false);
                calButton33.setVisible(false);
                calButton34.setVisible(false);
                calButton35.setVisible(false);
                calButton36.setVisible(false);
                calButton37.setVisible(false);
                calButton38.setVisible(false);
                calButton39.setVisible(false);
                calButton40.setVisible(false);
                calButton41.setVisible(false);
                calButton42.setVisible(false);
                break;
            case 2:
                calButton1.setVisible(false);
                calButton2.setText("01");
		calButton2.addActionListener(listener1);                
                calButton2.setVisible(true);
                calButton3.setText("02");
		calButton3.addActionListener(listener2);   
                calButton3.setVisible(true);
                calButton4.setText("03");
		calButton4.addActionListener(listener3);   
                calButton4.setVisible(true);
                calButton5.setText("04");
		calButton5.addActionListener(listener4);   
                calButton5.setVisible(true);
                calButton6.setText("05");
		calButton6.addActionListener(listener5);   
                calButton6.setVisible(true);
                calButton7.setText("06");
		calButton7.addActionListener(listener6);   
                calButton7.setVisible(true);
                calButton8.setText("07");
		calButton8.addActionListener(listener7);   
                calButton8.setVisible(true);
                calButton9.setText("08");
		calButton9.addActionListener(listener8);   
                calButton9.setVisible(true);
                calButton10.setText("09");
		calButton10.addActionListener(listener9);   
                calButton10.setVisible(true);
                calButton11.setText("10");
		calButton11.addActionListener(listener10);   
                calButton11.setVisible(true);
                calButton12.setText("11");
		calButton12.addActionListener(listener11);   
                calButton12.setVisible(true);
                calButton13.setText("12");
		calButton13.addActionListener(listener12);   
                calButton13.setVisible(true);
                calButton14.setText("13");
		calButton13.addActionListener(listener13);   
                calButton14.setVisible(true);
                calButton15.setText("14");
		calButton14.addActionListener(listener14);   
                calButton15.setVisible(true);
                calButton16.setText("15");
		calButton16.addActionListener(listener15);   
                calButton16.setVisible(true);
                calButton17.setText("16");
		calButton17.addActionListener(listener16);   
                calButton17.setVisible(true);
                calButton18.setText("17");
		calButton18.addActionListener(listener17);   
                calButton18.setVisible(true);
                calButton19.setText("18");
		calButton19.addActionListener(listener18);   
                calButton19.setVisible(true);
                calButton20.setText("19");
		calButton20.addActionListener(listener19);   
                calButton20.setVisible(true);
                calButton21.setText("20");
		calButton21.addActionListener(listener20);   
                calButton21.setVisible(true);
                calButton22.setText("21");
		calButton22.addActionListener(listener21);   
                calButton22.setVisible(true);
                calButton23.setText("22");
		calButton23.addActionListener(listener22);   
                calButton23.setVisible(true);
                calButton24.setText("23");
		calButton24.addActionListener(listener23);   
                calButton24.setVisible(true);
                calButton25.setText("24");
		calButton25.addActionListener(listener24);   
                calButton25.setVisible(true);
                calButton26.setText("25");
		calButton26.addActionListener(listener25);   
                calButton26.setVisible(true);
                calButton27.setText("26");
		calButton27.addActionListener(listener26);   
                calButton27.setVisible(true);
                calButton28.setText("27");
		calButton28.addActionListener(listener27);   
                calButton28.setVisible(true);
                calButton29.setText("28");
		calButton29.addActionListener(listener28);   
                calButton29.setVisible(true);
                calButton30.setText("29");
		calButton30.addActionListener(listener29);   
                calButton30.setVisible(true);
                calButton31.setText("30");
		calButton31.addActionListener(listener30);   
                calButton31.setVisible(true);
                calButton32.setText("31");
		calButton32.addActionListener(listener31);   
                calButton32.setVisible(false);
                calButton33.setVisible(false);
                calButton34.setVisible(false);
                calButton35.setVisible(false);
                calButton36.setVisible(false);
                calButton37.setVisible(false);
                calButton38.setVisible(false);
                calButton39.setVisible(false);
                calButton40.setVisible(false);
                calButton41.setVisible(false);
                calButton42.setVisible(false);
                break;
            case 3:
                calButton1.setVisible(false);
                calButton2.setVisible(false);
                calButton3.setText("01");
		calButton3.addActionListener(listener1);  
                calButton3.setVisible(true);
                calButton4.setText("02");
		calButton4.addActionListener(listener2);  
                calButton4.setVisible(true);
                calButton5.setText("03");
		calButton5.addActionListener(listener3);  
                calButton5.setVisible(true);
                calButton6.setText("04");
		calButton6.addActionListener(listener4);  
                calButton6.setVisible(true);
                calButton7.setText("05");
		calButton7.addActionListener(listener5);  
                calButton7.setVisible(true);
                calButton8.setText("06");
		calButton8.addActionListener(listener6);  
                calButton8.setVisible(true);
                calButton9.setText("07");
		calButton9.addActionListener(listener7);  
                calButton9.setVisible(true);
                calButton10.setText("08");
		calButton10.addActionListener(listener8);  
                calButton10.setVisible(true);
                calButton11.setText("09");
		calButton11.addActionListener(listener9);  
                calButton11.setVisible(true);
                calButton12.setText("10");
		calButton12.addActionListener(listener10);  
                calButton12.setVisible(true);
                calButton13.setText("11");
		calButton13.addActionListener(listener11);  
                calButton13.setVisible(true);
                calButton14.setText("12");
		calButton14.addActionListener(listener12);  
                calButton14.setVisible(true);
                calButton15.setText("13");
		calButton15.addActionListener(listener13);  
                calButton15.setVisible(true);
                calButton16.setText("14");
		calButton16.addActionListener(listener14);  
                calButton16.setVisible(true);
                calButton17.setText("15");
		calButton17.addActionListener(listener15);  
                calButton17.setVisible(true);
                calButton18.setText("16");
		calButton18.addActionListener(listener16);  
                calButton18.setVisible(true);
                calButton19.setText("17");
		calButton19.addActionListener(listener17);  
                calButton19.setVisible(true);
                calButton20.setText("18");
		calButton20.addActionListener(listener18);  
                calButton20.setVisible(true);
                calButton21.setText("19");
		calButton21.addActionListener(listener19);  
                calButton21.setVisible(true);
                calButton22.setText("20");
		calButton22.addActionListener(listener20);  
                calButton22.setVisible(true);
                calButton23.setText("21");
		calButton23.addActionListener(listener21);  
                calButton23.setVisible(true);
                calButton24.setText("22");
		calButton24.addActionListener(listener22);  
                calButton24.setVisible(true);
                calButton25.setText("23");
		calButton25.addActionListener(listener23);  
                calButton25.setVisible(true);
                calButton26.setText("24");
		calButton26.addActionListener(listener24);  
                calButton26.setVisible(true);
                calButton27.setText("25");
		calButton27.addActionListener(listener25);  
                calButton27.setVisible(true);
                calButton28.setText("26");
		calButton28.addActionListener(listener26);  
                calButton28.setVisible(true);
                calButton29.setText("27");
		calButton29.addActionListener(listener27);  
                calButton29.setVisible(true);
                calButton30.setText("28");
		calButton30.addActionListener(listener28);  
                calButton30.setVisible(true);
                calButton31.setText("29");
		calButton31.addActionListener(listener29);  
                calButton31.setVisible(true);
                calButton32.setText("30");
		calButton32.addActionListener(listener30);                  
                calButton32.setVisible(true);               
                calButton33.setText("31");
		calButton33.addActionListener(listener31);  
                calButton33.setVisible(false);
                calButton34.setVisible(false);
                calButton35.setVisible(false);
                calButton36.setVisible(false);
                calButton37.setVisible(false);
                calButton38.setVisible(false);
                calButton39.setVisible(false);
                calButton40.setVisible(false);
                calButton41.setVisible(false);
                calButton42.setVisible(false);
                break;
            case 4:
                calButton1.setVisible(false);
                calButton2.setVisible(false);
                calButton3.setVisible(false);
                calButton4.setText("01");
		calButton4.addActionListener(listener1);  
                calButton4.setVisible(true);
                calButton5.setText("02");
		calButton5.addActionListener(listener2);  
                calButton5.setVisible(true);
                calButton6.setText("03");
		calButton6.addActionListener(listener3);  
                calButton6.setVisible(true);
                calButton7.setText("04");
		calButton7.addActionListener(listener4);  
                calButton7.setVisible(true);
                calButton8.setText("05");
		calButton8.addActionListener(listener5);  
                calButton8.setVisible(true);
                calButton9.setText("06");
		calButton9.addActionListener(listener6);  
                calButton9.setVisible(true);
                calButton10.setText("07");
		calButton10.addActionListener(listener7);  
                calButton10.setVisible(true);
                calButton11.setText("08");
		calButton11.addActionListener(listener8);  
                calButton11.setVisible(true);
                calButton12.setText("09");
		calButton12.addActionListener(listener9);  
                calButton12.setVisible(true);
                calButton13.setText("10");
		calButton13.addActionListener(listener10);  
                calButton13.setVisible(true);
                calButton14.setText("11");
		calButton14.addActionListener(listener11);  
                calButton14.setVisible(true);
                calButton15.setText("12");
		calButton15.addActionListener(listener12);  
                calButton15.setVisible(true);
                calButton16.setText("13");
		calButton16.addActionListener(listener13);  
                calButton16.setVisible(true);
                calButton17.setText("14");
		calButton17.addActionListener(listener14);  
                calButton17.setVisible(true);
                calButton18.setText("15");
		calButton18.addActionListener(listener15);  
                calButton18.setVisible(true);
                calButton19.setText("16");
		calButton19.addActionListener(listener16);  
                calButton19.setVisible(true);
                calButton20.setText("17");
		calButton20.addActionListener(listener17);  
                calButton20.setVisible(true);
                calButton21.setText("18");
		calButton21.addActionListener(listener18);  
                calButton21.setVisible(true);
                calButton22.setText("19");
		calButton22.addActionListener(listener19);  
                calButton22.setVisible(true);
                calButton23.setText("20");
		calButton23.addActionListener(listener20);  
                calButton23.setVisible(true);
                calButton24.setText("21");
		calButton24.addActionListener(listener21);  
                calButton24.setVisible(true);
                calButton25.setText("22");
		calButton25.addActionListener(listener22);  
                calButton25.setVisible(true);
                calButton26.setText("23");
		calButton26.addActionListener(listener23);  
                calButton26.setVisible(true);
                calButton27.setText("24");
		calButton27.addActionListener(listener24);  
                calButton27.setVisible(true);
                calButton28.setText("25");
		calButton28.addActionListener(listener25);  
                calButton28.setVisible(true);
                calButton29.setText("26");
		calButton29.addActionListener(listener26);  
                calButton29.setVisible(true);
                calButton30.setText("27");
		calButton30.addActionListener(listener27);  
                calButton30.setVisible(true);
                calButton31.setText("28");
		calButton31.addActionListener(listener28);  
                calButton31.setVisible(true);
                calButton32.setText("29");
		calButton32.addActionListener(listener29);  
                calButton32.setVisible(true);
                calButton33.setText("30");
		calButton33.addActionListener(listener30);  
                calButton33.setVisible(true);
                calButton34.setText("31");
		calButton34.addActionListener(listener31);  
                calButton34.setVisible(false);
                calButton35.setVisible(false);
                calButton36.setVisible(false);
                calButton37.setVisible(false);
                calButton38.setVisible(false);
                calButton39.setVisible(false);
                calButton40.setVisible(false);
                calButton41.setVisible(false);
                calButton42.setVisible(false);
                break;
            case 5:
                calButton1.setVisible(false);
                calButton2.setVisible(false);
                calButton3.setVisible(false);
                calButton4.setVisible(false);
                calButton5.setText("01");
		calButton5.addActionListener(listener1);  
                calButton5.setVisible(true);
                calButton6.setText("02");
		calButton6.addActionListener(listener2);  
                calButton6.setVisible(true);
                calButton7.setText("03");
		calButton7.addActionListener(listener3);  
                calButton7.setVisible(true);
                calButton8.setText("04");
		calButton8.addActionListener(listener4);  
                calButton8.setVisible(true);
                calButton9.setText("05");
		calButton9.addActionListener(listener5);  
                calButton9.setVisible(true);
                calButton10.setText("06");
		calButton10.addActionListener(listener6);  
                calButton10.setVisible(true);
                calButton11.setText("07");
		calButton11.addActionListener(listener7);  
                calButton11.setVisible(true);
                calButton12.setText("08");
		calButton12.addActionListener(listener8);  
                calButton12.setVisible(true);
                calButton13.setText("09");
		calButton13.addActionListener(listener9);  
                calButton13.setVisible(true);
                calButton14.setText("10");
		calButton14.addActionListener(listener10);  
                calButton14.setVisible(true);
                calButton15.setText("11");
		calButton15.addActionListener(listener11);  
                calButton15.setVisible(true);
                calButton16.setText("12");
		calButton16.addActionListener(listener12);  
                calButton16.setVisible(true);
                calButton17.setText("13");
		calButton17.addActionListener(listener13);  
                calButton17.setVisible(true);
                calButton18.setText("14");
		calButton18.addActionListener(listener14);  
                calButton18.setVisible(true);
                calButton19.setText("15");
		calButton19.addActionListener(listener15);  
                calButton19.setVisible(true);
                calButton20.setText("16");
		calButton20.addActionListener(listener16);  
                calButton20.setVisible(true);
                calButton21.setText("17");
		calButton21.addActionListener(listener17);  
                calButton21.setVisible(true);
                calButton22.setText("18");
		calButton22.addActionListener(listener18);  
                calButton22.setVisible(true);
                calButton23.setText("19");
		calButton23.addActionListener(listener19);  
                calButton23.setVisible(true);
                calButton24.setText("20");
		calButton24.addActionListener(listener20);  
                calButton24.setVisible(true);
                calButton25.setText("21");
		calButton25.addActionListener(listener21);  
                calButton25.setVisible(true);
                calButton26.setText("22");
		calButton26.addActionListener(listener22);  
                calButton26.setVisible(true);
                calButton27.setText("23");
		calButton27.addActionListener(listener23);  
                calButton27.setVisible(true);
                calButton28.setText("24");
		calButton28.addActionListener(listener24);  
                calButton28.setVisible(true);
                calButton29.setText("25");
		calButton29.addActionListener(listener25);  
                calButton29.setVisible(true);
                calButton30.setText("26");
		calButton30.addActionListener(listener26);  
                calButton30.setVisible(true);
                calButton31.setText("27");
		calButton31.addActionListener(listener27);  
                calButton31.setVisible(true);
                calButton32.setText("28");
		calButton32.addActionListener(listener28);  
                calButton32.setVisible(true);
                calButton33.setText("29");
		calButton33.addActionListener(listener29);  
                calButton33.setVisible(true);
                calButton34.setText("30");
		calButton34.addActionListener(listener30);  
                calButton34.setVisible(true);
                calButton35.setText("31");
		calButton35.addActionListener(listener31);  
                calButton35.setVisible(false);
                calButton36.setVisible(false);
                calButton37.setVisible(false);
                calButton38.setVisible(false);
                calButton39.setVisible(false);
                calButton40.setVisible(false);
                calButton41.setVisible(false);
                calButton42.setVisible(false);
                break;
            case 6:
                calButton1.setVisible(false);
                calButton2.setVisible(false);
                calButton3.setVisible(false);
                calButton4.setVisible(false);
                calButton5.setVisible(false);
                calButton6.setText("01");
		calButton6.addActionListener(listener1);  
                calButton6.setVisible(true);
                calButton7.setText("02");
		calButton7.addActionListener(listener2);  
                calButton7.setVisible(true);
                calButton8.setText("03");
		calButton8.addActionListener(listener3);  
                calButton8.setVisible(true);
                calButton9.setText("04");
		calButton9.addActionListener(listener4);  
                calButton9.setVisible(true);
                calButton10.setText("05");
		calButton10.addActionListener(listener5);  
                calButton10.setVisible(true);
                calButton11.setText("06");
		calButton11.addActionListener(listener6);  
                calButton11.setVisible(true);
                calButton12.setText("07");
		calButton12.addActionListener(listener7);  
                calButton12.setVisible(true);
                calButton13.setText("08");
		calButton13.addActionListener(listener8);  
                calButton13.setVisible(true);
                calButton14.setText("09");
		calButton14.addActionListener(listener9);  
                calButton14.setVisible(true);
                calButton15.setText("10");
		calButton15.addActionListener(listener10);  
                calButton15.setVisible(true);
                calButton16.setText("11");
		calButton16.addActionListener(listener11);  
                calButton16.setVisible(true);
                calButton17.setText("12");
		calButton17.addActionListener(listener12);  
                calButton17.setVisible(true);
                calButton18.setText("13");
		calButton18.addActionListener(listener13);  
                calButton18.setVisible(true);
                calButton19.setText("14");
		calButton19.addActionListener(listener14);  
                calButton19.setVisible(true);
                calButton20.setText("15");
		calButton20.addActionListener(listener15);  
                calButton20.setVisible(true);
                calButton21.setText("16");
		calButton21.addActionListener(listener16);  
                calButton21.setVisible(true);
                calButton22.setText("17");
		calButton22.addActionListener(listener17);  
                calButton22.setVisible(true);
                calButton23.setText("18");
		calButton23.addActionListener(listener18);  
                calButton23.setVisible(true);
                calButton24.setText("19");
		calButton24.addActionListener(listener19);  
                calButton24.setVisible(true);
                calButton25.setText("20");
		calButton25.addActionListener(listener20);  
                calButton25.setVisible(true);
                calButton26.setText("21");
		calButton26.addActionListener(listener21);  
                calButton26.setVisible(true);
                calButton27.setText("22");
		calButton27.addActionListener(listener22);  
                calButton27.setVisible(true);
                calButton28.setText("23");
		calButton28.addActionListener(listener23);  
                calButton28.setVisible(true);
                calButton29.setText("24");
		calButton29.addActionListener(listener24);  
                calButton29.setVisible(true);
                calButton30.setText("25");
		calButton30.addActionListener(listener25);  
                calButton30.setVisible(true);
                calButton31.setText("26");
		calButton31.addActionListener(listener26);  
                calButton31.setVisible(true);
                calButton32.setText("27");
		calButton32.addActionListener(listener27);  
                calButton32.setVisible(true);
                calButton33.setText("28");
		calButton33.addActionListener(listener28);  
                calButton33.setVisible(true);
                calButton34.setText("29");
		calButton34.addActionListener(listener29);  
                calButton34.setVisible(true);
                calButton35.setText("30");
		calButton35.addActionListener(listener30);  
                calButton35.setVisible(true);
                calButton36.setText("31");
		calButton36.addActionListener(listener31);  
                calButton36.setVisible(false);
                calButton37.setVisible(false);
                calButton38.setVisible(false);
                calButton39.setVisible(false);
                calButton40.setVisible(false);
                calButton41.setVisible(false);
                calButton42.setVisible(false);
                break;
            case 7:
                calButton1.setVisible(false);
                calButton2.setVisible(false);
                calButton3.setVisible(false);
                calButton4.setVisible(false);
                calButton5.setVisible(false);
                calButton6.setVisible(false);
                calButton7.setText("01");
		calButton7.addActionListener(listener1);  
                calButton7.setVisible(true);
                calButton8.setText("02");
		calButton8.addActionListener(listener2);  
                calButton8.setVisible(true);
                calButton9.setText("03");
		calButton9.addActionListener(listener3);  
                calButton9.setVisible(true);
                calButton10.setText("04");
		calButton10.addActionListener(listener4);  
                calButton10.setVisible(true);
                calButton11.setText("05");
		calButton11.addActionListener(listener5);  
                calButton11.setVisible(true);
                calButton12.setText("06");
		calButton12.addActionListener(listener6);  
                calButton12.setVisible(true);
                calButton13.setText("07");
		calButton13.addActionListener(listener7);  
                calButton13.setVisible(true);
                calButton14.setText("08");
		calButton14.addActionListener(listener8);  
                calButton14.setVisible(true);
                calButton15.setText("09");
		calButton15.addActionListener(listener9);  
                calButton15.setVisible(true);
                calButton16.setText("10");
		calButton16.addActionListener(listener10);  
                calButton16.setVisible(true);
                calButton17.setText("11");
		calButton17.addActionListener(listener11);  
                calButton17.setVisible(true);
                calButton18.setText("12");
		calButton18.addActionListener(listener12);  
                calButton18.setVisible(true);
                calButton19.setText("13");
		calButton19.addActionListener(listener13);  
                calButton19.setVisible(true);
                calButton20.setText("14");
		calButton20.addActionListener(listener14);  
                calButton20.setVisible(true);
                calButton21.setText("15");
		calButton21.addActionListener(listener15);  
                calButton21.setVisible(true);
                calButton22.setText("16");
		calButton22.addActionListener(listener16);  
                calButton22.setVisible(true);
                calButton23.setText("17");
                calButton23.addActionListener(listener17);
                calButton23.setVisible(true);		  
                calButton24.setText("18");
		calButton24.addActionListener(listener18);  
                calButton24.setVisible(true);
                calButton25.setText("19");
		calButton25.addActionListener(listener19);  
                calButton25.setVisible(true);
                calButton26.setText("20");
		calButton26.addActionListener(listener20);  
                calButton26.setVisible(true);
                calButton27.setText("21");
		calButton27.addActionListener(listener21);  
                calButton27.setVisible(true);
                calButton28.setText("22");
		calButton28.addActionListener(listener22);  
                calButton28.setVisible(true);
                calButton29.setText("23");
		calButton29.addActionListener(listener23);  
                calButton29.setVisible(true);
                calButton30.setText("24");
		calButton30.addActionListener(listener24);  
                calButton30.setVisible(true);
                calButton31.setText("25");
		calButton31.addActionListener(listener25);  
                calButton31.setVisible(true);
                calButton32.setText("26");
		calButton32.addActionListener(listener26);  
                calButton32.setVisible(true);
                calButton33.setText("27");
		calButton33.addActionListener(listener27);  
                calButton33.setVisible(true);
                calButton34.setText("28");
		calButton34.addActionListener(listener28);  
                calButton34.setVisible(true);
                calButton35.setText("29");
		calButton35.addActionListener(listener29);  
                calButton35.setVisible(true);
                calButton36.setText("30");
		calButton36.addActionListener(listener30);  
                calButton36.setVisible(true);
                calButton37.setText("31");
		calButton37.addActionListener(listener31);  
                calButton37.setVisible(false);
                calButton38.setVisible(false);
                calButton39.setVisible(false);
                calButton40.setVisible(false);
                calButton41.setVisible(false);
                calButton42.setVisible(false);
                break;
            default:
                //put error message
                break;
        }
        
    }
    
    private void month28(int weekday){
        
        switch (weekday) {
            case 1:
                calButton1.setText("01");
		calButton1.addActionListener(listener1);
                calButton1.setVisible(true);
                calButton2.setText("02");
		calButton2.addActionListener(listener2);                
                calButton2.setVisible(true);
                calButton3.setText("03");
		calButton3.addActionListener(listener3); 
                calButton3.setVisible(true);
                calButton4.setText("04");
		calButton4.addActionListener(listener4); 
                calButton4.setVisible(true);
                calButton5.setText("05");
		calButton5.addActionListener(listener5); 
                calButton5.setVisible(true);
                calButton6.setText("06");
		calButton6.addActionListener(listener6); 
                calButton6.setVisible(true);
                calButton7.setText("07");
		calButton7.addActionListener(listener7); 
                calButton7.setVisible(true);
                calButton8.setText("08");
		calButton8.addActionListener(listener8); 
                calButton8.setVisible(true);
                calButton9.setText("09");
		calButton9.addActionListener(listener9); 
                calButton9.setVisible(true);
                calButton10.setText("10");
		calButton10.addActionListener(listener10); 
                calButton10.setVisible(true);
                calButton11.setText("11");
		calButton11.addActionListener(listener11); 
                calButton11.setVisible(true);
                calButton12.setText("12");
		calButton12.addActionListener(listener12); 
                calButton12.setVisible(true);
                calButton13.setText("13");
		calButton13.addActionListener(listener13); 
                calButton13.setVisible(true);
                calButton14.setText("14");
		calButton14.addActionListener(listener14); 
                calButton14.setVisible(true);
                calButton15.setText("15");
		calButton15.addActionListener(listener15); 
                calButton15.setVisible(true);
                calButton16.setText("16");
		calButton16.addActionListener(listener16); 
                calButton16.setVisible(true);
                calButton17.setText("17");
		calButton17.addActionListener(listener17); 
                calButton17.setVisible(true);
                calButton18.setText("18");
		calButton18.addActionListener(listener18); 
                calButton18.setVisible(true);
                calButton19.setText("19");
		calButton19.addActionListener(listener19); 
                calButton19.setVisible(true);
                calButton20.setText("20");
		calButton20.addActionListener(listener20); 
                calButton20.setVisible(true);
                calButton21.setText("21");
		calButton21.addActionListener(listener21); 
                calButton21.setVisible(true);
                calButton22.setText("22");
		calButton22.addActionListener(listener22); 
                calButton22.setVisible(true);
                calButton23.setText("23");
		calButton23.addActionListener(listener23); 
                calButton23.setVisible(true);
                calButton24.setText("24");
		calButton24.addActionListener(listener24); 
                calButton24.setVisible(true);
                calButton25.setText("25");
		calButton25.addActionListener(listener25); 
                calButton25.setVisible(true);
                calButton26.setText("26");
		calButton26.addActionListener(listener26); 
                calButton26.setVisible(true);
                calButton27.setText("27");
		calButton27.addActionListener(listener27); 
                calButton27.setVisible(true);
                calButton28.setText("28");
		calButton28.addActionListener(listener28); 
                calButton28.setVisible(true);
                calButton29.setText("29");
		calButton29.addActionListener(listener29); 
                calButton29.setVisible(false);
                calButton30.setText("30");
		calButton30.addActionListener(listener30); 
                calButton30.setVisible(false);
                calButton31.setText("31");
		calButton31.addActionListener(listener31); 
                calButton31.setVisible(false);
                calButton32.setVisible(false);
                calButton33.setVisible(false);
                calButton34.setVisible(false);
                calButton35.setVisible(false);
                calButton36.setVisible(false);
                calButton37.setVisible(false);
                calButton38.setVisible(false);
                calButton39.setVisible(false);
                calButton40.setVisible(false);
                calButton41.setVisible(false);
                calButton42.setVisible(false);
                break;
            case 2:
                calButton1.setVisible(false);
                calButton2.setText("01");
		calButton2.addActionListener(listener1);                
                calButton2.setVisible(true);
                calButton3.setText("02");
		calButton3.addActionListener(listener2);   
                calButton3.setVisible(true);
                calButton4.setText("03");
		calButton4.addActionListener(listener3);   
                calButton4.setVisible(true);
                calButton5.setText("04");
		calButton5.addActionListener(listener4);   
                calButton5.setVisible(true);
                calButton6.setText("05");
		calButton6.addActionListener(listener5);   
                calButton6.setVisible(true);
                calButton7.setText("06");
		calButton7.addActionListener(listener6);   
                calButton7.setVisible(true);
                calButton8.setText("07");
		calButton8.addActionListener(listener7);   
                calButton8.setVisible(true);
                calButton9.setText("08");
		calButton9.addActionListener(listener8);   
                calButton9.setVisible(true);
                calButton10.setText("09");
		calButton10.addActionListener(listener9);   
                calButton10.setVisible(true);
                calButton11.setText("10");
		calButton11.addActionListener(listener10);   
                calButton11.setVisible(true);
                calButton12.setText("11");
		calButton12.addActionListener(listener11);   
                calButton12.setVisible(true);
                calButton13.setText("12");
		calButton13.addActionListener(listener12);   
                calButton13.setVisible(true);
                calButton14.setText("13");
		calButton13.addActionListener(listener13);   
                calButton14.setVisible(true);
                calButton15.setText("14");
		calButton14.addActionListener(listener14);   
                calButton15.setVisible(true);
                calButton16.setText("15");
		calButton16.addActionListener(listener15);   
                calButton16.setVisible(true);
                calButton17.setText("16");
		calButton17.addActionListener(listener16);   
                calButton17.setVisible(true);
                calButton18.setText("17");
		calButton18.addActionListener(listener17);   
                calButton18.setVisible(true);
                calButton19.setText("18");
		calButton19.addActionListener(listener18);   
                calButton19.setVisible(true);
                calButton20.setText("19");
		calButton20.addActionListener(listener19);   
                calButton20.setVisible(true);
                calButton21.setText("20");
		calButton21.addActionListener(listener20);   
                calButton21.setVisible(true);
                calButton22.setText("21");
		calButton22.addActionListener(listener21);   
                calButton22.setVisible(true);
                calButton23.setText("22");
		calButton23.addActionListener(listener22);   
                calButton23.setVisible(true);
                calButton24.setText("23");
		calButton24.addActionListener(listener23);   
                calButton24.setVisible(true);
                calButton25.setText("24");
		calButton25.addActionListener(listener24);   
                calButton25.setVisible(true);
                calButton26.setText("25");
		calButton26.addActionListener(listener25);   
                calButton26.setVisible(true);
                calButton27.setText("26");
		calButton27.addActionListener(listener26);   
                calButton27.setVisible(true);
                calButton28.setText("27");
		calButton28.addActionListener(listener27);   
                calButton28.setVisible(true);
                calButton29.setText("28");
		calButton29.addActionListener(listener28);   
                calButton29.setVisible(true);
                calButton30.setText("29");
		calButton30.addActionListener(listener29);   
                calButton30.setVisible(false);
                calButton31.setText("30");
		calButton31.addActionListener(listener30);   
                calButton31.setVisible(false);
                calButton32.setText("31");
		calButton32.addActionListener(listener31);   
                calButton32.setVisible(false);
                calButton33.setVisible(false);
                calButton34.setVisible(false);
                calButton35.setVisible(false);
                calButton36.setVisible(false);
                calButton37.setVisible(false);
                calButton38.setVisible(false);
                calButton39.setVisible(false);
                calButton40.setVisible(false);
                calButton41.setVisible(false);
                calButton42.setVisible(false);
                break;
            case 3:
                calButton1.setVisible(false);
                calButton2.setVisible(false);
                calButton3.setText("01");
		calButton3.addActionListener(listener1);  
                calButton3.setVisible(true);
                calButton4.setText("02");
		calButton4.addActionListener(listener2);  
                calButton4.setVisible(true);
                calButton5.setText("03");
		calButton5.addActionListener(listener3);  
                calButton5.setVisible(true);
                calButton6.setText("04");
		calButton6.addActionListener(listener4);  
                calButton6.setVisible(true);
                calButton7.setText("05");
		calButton7.addActionListener(listener5);  
                calButton7.setVisible(true);
                calButton8.setText("06");
		calButton8.addActionListener(listener6);  
                calButton8.setVisible(true);
                calButton9.setText("07");
		calButton9.addActionListener(listener7);  
                calButton9.setVisible(true);
                calButton10.setText("08");
		calButton10.addActionListener(listener8);  
                calButton10.setVisible(true);
                calButton11.setText("09");
		calButton11.addActionListener(listener9);  
                calButton11.setVisible(true);
                calButton12.setText("10");
		calButton12.addActionListener(listener10);  
                calButton12.setVisible(true);
                calButton13.setText("11");
		calButton13.addActionListener(listener11);  
                calButton13.setVisible(true);
                calButton14.setText("12");
		calButton14.addActionListener(listener12);  
                calButton14.setVisible(true);
                calButton15.setText("13");
		calButton15.addActionListener(listener13);  
                calButton15.setVisible(true);
                calButton16.setText("14");
		calButton16.addActionListener(listener14);  
                calButton16.setVisible(true);
                calButton17.setText("15");
		calButton17.addActionListener(listener15);  
                calButton17.setVisible(true);
                calButton18.setText("16");
		calButton18.addActionListener(listener16);  
                calButton18.setVisible(true);
                calButton19.setText("17");
		calButton19.addActionListener(listener17);  
                calButton19.setVisible(true);
                calButton20.setText("18");
		calButton20.addActionListener(listener18);  
                calButton20.setVisible(true);
                calButton21.setText("19");
		calButton21.addActionListener(listener19);  
                calButton21.setVisible(true);
                calButton22.setText("20");
		calButton22.addActionListener(listener20);  
                calButton22.setVisible(true);
                calButton23.setText("21");
		calButton23.addActionListener(listener21);  
                calButton23.setVisible(true);
                calButton24.setText("22");
		calButton24.addActionListener(listener22);  
                calButton24.setVisible(true);
                calButton25.setText("23");
		calButton25.addActionListener(listener23);  
                calButton25.setVisible(true);
                calButton26.setText("24");
		calButton26.addActionListener(listener24);  
                calButton26.setVisible(true);
                calButton27.setText("25");
		calButton27.addActionListener(listener25);  
                calButton27.setVisible(true);
                calButton28.setText("26");
		calButton28.addActionListener(listener26);  
                calButton28.setVisible(true);
                calButton29.setText("27");
		calButton29.addActionListener(listener27);  
                calButton29.setVisible(true);
                calButton30.setText("28");
		calButton30.addActionListener(listener28);  
                calButton30.setVisible(true);
                calButton31.setText("29");
		calButton31.addActionListener(listener29);  
                calButton31.setVisible(false);
                calButton32.setText("30");
		calButton32.addActionListener(listener30);                  
                calButton32.setVisible(false);               
                calButton33.setText("31");
		calButton33.addActionListener(listener31);  
                calButton33.setVisible(false);
                calButton34.setVisible(false);
                calButton35.setVisible(false);
                calButton36.setVisible(false);
                calButton37.setVisible(false);
                calButton38.setVisible(false);
                calButton39.setVisible(false);
                calButton40.setVisible(false);
                calButton41.setVisible(false);
                calButton42.setVisible(false);
                break;
            case 4:
                calButton1.setVisible(false);
                calButton2.setVisible(false);
                calButton3.setVisible(false);
                calButton4.setText("01");
		calButton4.addActionListener(listener1);  
                calButton4.setVisible(true);
                calButton5.setText("02");
		calButton5.addActionListener(listener2);  
                calButton5.setVisible(true);
                calButton6.setText("03");
		calButton6.addActionListener(listener3);  
                calButton6.setVisible(true);
                calButton7.setText("04");
		calButton7.addActionListener(listener4);  
                calButton7.setVisible(true);
                calButton8.setText("05");
		calButton8.addActionListener(listener5);  
                calButton8.setVisible(true);
                calButton9.setText("06");
		calButton9.addActionListener(listener6);  
                calButton9.setVisible(true);
                calButton10.setText("07");
		calButton10.addActionListener(listener7);  
                calButton10.setVisible(true);
                calButton11.setText("08");
		calButton11.addActionListener(listener8);  
                calButton11.setVisible(true);
                calButton12.setText("09");
		calButton12.addActionListener(listener9);  
                calButton12.setVisible(true);
                calButton13.setText("10");
		calButton13.addActionListener(listener10);  
                calButton13.setVisible(true);
                calButton14.setText("11");
		calButton14.addActionListener(listener11);  
                calButton14.setVisible(true);
                calButton15.setText("12");
		calButton15.addActionListener(listener12);  
                calButton15.setVisible(true);
                calButton16.setText("13");
		calButton16.addActionListener(listener13);  
                calButton16.setVisible(true);
                calButton17.setText("14");
		calButton17.addActionListener(listener14);  
                calButton17.setVisible(true);
                calButton18.setText("15");
		calButton18.addActionListener(listener15);  
                calButton18.setVisible(true);
                calButton19.setText("16");
		calButton19.addActionListener(listener16);  
                calButton19.setVisible(true);
                calButton20.setText("17");
		calButton20.addActionListener(listener17);  
                calButton20.setVisible(true);
                calButton21.setText("18");
		calButton21.addActionListener(listener18);  
                calButton21.setVisible(true);
                calButton22.setText("19");
		calButton22.addActionListener(listener19);  
                calButton22.setVisible(true);
                calButton23.setText("20");
		calButton23.addActionListener(listener20);  
                calButton23.setVisible(true);
                calButton24.setText("21");
		calButton24.addActionListener(listener21);  
                calButton24.setVisible(true);
                calButton25.setText("22");
		calButton25.addActionListener(listener22);  
                calButton25.setVisible(true);
                calButton26.setText("23");
		calButton26.addActionListener(listener23);  
                calButton26.setVisible(true);
                calButton27.setText("24");
		calButton27.addActionListener(listener24);  
                calButton27.setVisible(true);
                calButton28.setText("25");
		calButton28.addActionListener(listener25);  
                calButton28.setVisible(true);
                calButton29.setText("26");
		calButton29.addActionListener(listener26);  
                calButton29.setVisible(true);
                calButton30.setText("27");
		calButton30.addActionListener(listener27);  
                calButton30.setVisible(true);
                calButton31.setText("28");
		calButton31.addActionListener(listener28);  
                calButton31.setVisible(true);
                calButton32.setText("29");
		calButton32.addActionListener(listener29);  
                calButton32.setVisible(false);
                calButton33.setText("30");
		calButton33.addActionListener(listener30);  
                calButton33.setVisible(false);
                calButton34.setText("31");
		calButton34.addActionListener(listener31);  
                calButton34.setVisible(false);
                calButton35.setVisible(false);
                calButton36.setVisible(false);
                calButton37.setVisible(false);
                calButton38.setVisible(false);
                calButton39.setVisible(false);
                calButton40.setVisible(false);
                calButton41.setVisible(false);
                calButton42.setVisible(false);
                break;
            case 5:
                calButton1.setVisible(false);
                calButton2.setVisible(false);
                calButton3.setVisible(false);
                calButton4.setVisible(false);
                calButton5.setText("01");
		calButton5.addActionListener(listener1);  
                calButton5.setVisible(true);
                calButton6.setText("02");
		calButton6.addActionListener(listener2);  
                calButton6.setVisible(true);
                calButton7.setText("03");
		calButton7.addActionListener(listener3);  
                calButton7.setVisible(true);
                calButton8.setText("04");
		calButton8.addActionListener(listener4);  
                calButton8.setVisible(true);
                calButton9.setText("05");
		calButton9.addActionListener(listener5);  
                calButton9.setVisible(true);
                calButton10.setText("06");
		calButton10.addActionListener(listener6);  
                calButton10.setVisible(true);
                calButton11.setText("07");
		calButton11.addActionListener(listener7);  
                calButton11.setVisible(true);
                calButton12.setText("08");
		calButton12.addActionListener(listener8);  
                calButton12.setVisible(true);
                calButton13.setText("09");
		calButton13.addActionListener(listener9);  
                calButton13.setVisible(true);
                calButton14.setText("10");
		calButton14.addActionListener(listener10);  
                calButton14.setVisible(true);
                calButton15.setText("11");
		calButton15.addActionListener(listener11);  
                calButton15.setVisible(true);
                calButton16.setText("12");
		calButton16.addActionListener(listener12);  
                calButton16.setVisible(true);
                calButton17.setText("13");
		calButton17.addActionListener(listener13);  
                calButton17.setVisible(true);
                calButton18.setText("14");
		calButton18.addActionListener(listener14);  
                calButton18.setVisible(true);
                calButton19.setText("15");
		calButton19.addActionListener(listener15);  
                calButton19.setVisible(true);
                calButton20.setText("16");
		calButton20.addActionListener(listener16);  
                calButton20.setVisible(true);
                calButton21.setText("17");
		calButton21.addActionListener(listener17);  
                calButton21.setVisible(true);
                calButton22.setText("18");
		calButton22.addActionListener(listener18);  
                calButton22.setVisible(true);
                calButton23.setText("19");
		calButton23.addActionListener(listener19);  
                calButton23.setVisible(true);
                calButton24.setText("20");
		calButton24.addActionListener(listener20);  
                calButton24.setVisible(true);
                calButton25.setText("21");
		calButton25.addActionListener(listener21);  
                calButton25.setVisible(true);
                calButton26.setText("22");
		calButton26.addActionListener(listener22);  
                calButton26.setVisible(true);
                calButton27.setText("23");
		calButton27.addActionListener(listener23);  
                calButton27.setVisible(true);
                calButton28.setText("24");
		calButton28.addActionListener(listener24);  
                calButton28.setVisible(true);
                calButton29.setText("25");
		calButton29.addActionListener(listener25);  
                calButton29.setVisible(true);
                calButton30.setText("26");
		calButton30.addActionListener(listener26);  
                calButton30.setVisible(true);
                calButton31.setText("27");
		calButton31.addActionListener(listener27);  
                calButton31.setVisible(true);
                calButton32.setText("28");
		calButton32.addActionListener(listener28);  
                calButton32.setVisible(true);
                calButton33.setText("29");
		calButton33.addActionListener(listener29);  
                calButton33.setVisible(false);
                calButton34.setText("30");
		calButton34.addActionListener(listener30);  
                calButton34.setVisible(false);
                calButton35.setText("31");
		calButton35.addActionListener(listener31);  
                calButton35.setVisible(false);
                calButton36.setVisible(false);
                calButton37.setVisible(false);
                calButton38.setVisible(false);
                calButton39.setVisible(false);
                calButton40.setVisible(false);
                calButton41.setVisible(false);
                calButton42.setVisible(false);
                break;
            case 6:
                calButton1.setVisible(false);
                calButton2.setVisible(false);
                calButton3.setVisible(false);
                calButton4.setVisible(false);
                calButton5.setVisible(false);
                calButton6.setText("01");
		calButton6.addActionListener(listener1);  
                calButton6.setVisible(true);
                calButton7.setText("02");
		calButton7.addActionListener(listener2);  
                calButton7.setVisible(true);
                calButton8.setText("03");
		calButton8.addActionListener(listener3);  
                calButton8.setVisible(true);
                calButton9.setText("04");
		calButton9.addActionListener(listener4);  
                calButton9.setVisible(true);
                calButton10.setText("05");
		calButton10.addActionListener(listener5);  
                calButton10.setVisible(true);
                calButton11.setText("06");
		calButton11.addActionListener(listener6);  
                calButton11.setVisible(true);
                calButton12.setText("07");
		calButton12.addActionListener(listener7);  
                calButton12.setVisible(true);
                calButton13.setText("08");
		calButton13.addActionListener(listener8);  
                calButton13.setVisible(true);
                calButton14.setText("09");
		calButton14.addActionListener(listener9);  
                calButton14.setVisible(true);
                calButton15.setText("10");
		calButton15.addActionListener(listener10);  
                calButton15.setVisible(true);
                calButton16.setText("11");
		calButton16.addActionListener(listener11);  
                calButton16.setVisible(true);
                calButton17.setText("12");
		calButton17.addActionListener(listener12);  
                calButton17.setVisible(true);
                calButton18.setText("13");
		calButton18.addActionListener(listener13);  
                calButton18.setVisible(true);
                calButton19.setText("14");
		calButton19.addActionListener(listener14);  
                calButton19.setVisible(true);
                calButton20.setText("15");
		calButton20.addActionListener(listener15);  
                calButton20.setVisible(true);
                calButton21.setText("16");
		calButton21.addActionListener(listener16);  
                calButton21.setVisible(true);
                calButton22.setText("17");
		calButton22.addActionListener(listener17);  
                calButton22.setVisible(true);
                calButton23.setText("18");
		calButton23.addActionListener(listener18);  
                calButton23.setVisible(true);
                calButton24.setText("19");
		calButton24.addActionListener(listener19);  
                calButton24.setVisible(true);
                calButton25.setText("20");
		calButton25.addActionListener(listener20);  
                calButton25.setVisible(true);
                calButton26.setText("21");
		calButton26.addActionListener(listener21);  
                calButton26.setVisible(true);
                calButton27.setText("22");
		calButton27.addActionListener(listener22);  
                calButton27.setVisible(true);
                calButton28.setText("23");
		calButton28.addActionListener(listener23);  
                calButton28.setVisible(true);
                calButton29.setText("24");
		calButton29.addActionListener(listener24);  
                calButton29.setVisible(true);
                calButton30.setText("25");
		calButton30.addActionListener(listener25);  
                calButton30.setVisible(true);
                calButton31.setText("26");
		calButton31.addActionListener(listener26);  
                calButton31.setVisible(true);
                calButton32.setText("27");
		calButton32.addActionListener(listener27);  
                calButton32.setVisible(true);
                calButton33.setText("28");
		calButton33.addActionListener(listener28);  
                calButton33.setVisible(true);
                calButton34.setText("29");
		calButton34.addActionListener(listener29);  
                calButton34.setVisible(false);
                calButton35.setText("30");
		calButton35.addActionListener(listener30);  
                calButton35.setVisible(false);
                calButton36.setText("31");
		calButton36.addActionListener(listener31);  
                calButton36.setVisible(false);
                calButton37.setVisible(false);
                calButton38.setVisible(false);
                calButton39.setVisible(false);
                calButton40.setVisible(false);
                calButton41.setVisible(false);
                calButton42.setVisible(false);
                break;
            case 7:
                calButton1.setVisible(false);
                calButton2.setVisible(false);
                calButton3.setVisible(false);
                calButton4.setVisible(false);
                calButton5.setVisible(false);
                calButton6.setVisible(false);
                calButton7.setText("01");
		calButton7.addActionListener(listener1);  
                calButton7.setVisible(true);
                calButton8.setText("02");
		calButton8.addActionListener(listener2);  
                calButton8.setVisible(true);
                calButton9.setText("03");
		calButton9.addActionListener(listener3);  
                calButton9.setVisible(true);
                calButton10.setText("04");
		calButton10.addActionListener(listener4);  
                calButton10.setVisible(true);
                calButton11.setText("05");
		calButton11.addActionListener(listener5);  
                calButton11.setVisible(true);
                calButton12.setText("06");
		calButton12.addActionListener(listener6);  
                calButton12.setVisible(true);
                calButton13.setText("07");
		calButton13.addActionListener(listener7);  
                calButton13.setVisible(true);
                calButton14.setText("08");
		calButton14.addActionListener(listener8);  
                calButton14.setVisible(true);
                calButton15.setText("09");
		calButton15.addActionListener(listener9);  
                calButton15.setVisible(true);
                calButton16.setText("10");
		calButton16.addActionListener(listener10);  
                calButton16.setVisible(true);
                calButton17.setText("11");
		calButton17.addActionListener(listener11);  
                calButton17.setVisible(true);
                calButton18.setText("12");
		calButton18.addActionListener(listener12);  
                calButton18.setVisible(true);
                calButton19.setText("13");
		calButton19.addActionListener(listener13);  
                calButton19.setVisible(true);
                calButton20.setText("14");
		calButton20.addActionListener(listener14);  
                calButton20.setVisible(true);
                calButton21.setText("15");
		calButton21.addActionListener(listener15);  
                calButton21.setVisible(true);
                calButton22.setText("16");
		calButton22.addActionListener(listener16);  
                calButton22.setVisible(true);
                calButton23.setText("17");
                calButton23.addActionListener(listener17);
                calButton23.setVisible(true);		  
                calButton24.setText("18");
		calButton24.addActionListener(listener18);  
                calButton24.setVisible(true);
                calButton25.setText("19");
		calButton25.addActionListener(listener19);  
                calButton25.setVisible(true);
                calButton26.setText("20");
		calButton26.addActionListener(listener20);  
                calButton26.setVisible(true);
                calButton27.setText("21");
		calButton27.addActionListener(listener21);  
                calButton27.setVisible(true);
                calButton28.setText("22");
		calButton28.addActionListener(listener22);  
                calButton28.setVisible(true);
                calButton29.setText("23");
		calButton29.addActionListener(listener23);  
                calButton29.setVisible(true);
                calButton30.setText("24");
		calButton30.addActionListener(listener24);  
                calButton30.setVisible(true);
                calButton31.setText("25");
		calButton31.addActionListener(listener25);  
                calButton31.setVisible(true);
                calButton32.setText("26");
		calButton32.addActionListener(listener26);  
                calButton32.setVisible(true);
                calButton33.setText("27");
		calButton33.addActionListener(listener27);  
                calButton33.setVisible(true);
                calButton34.setText("28");
		calButton34.addActionListener(listener28);  
                calButton34.setVisible(true);
                calButton35.setText("29");
		calButton35.addActionListener(listener29);  
                calButton35.setVisible(false);
                calButton36.setText("30");
		calButton36.addActionListener(listener30);  
                calButton36.setVisible(false);
                calButton37.setText("31");
		calButton37.addActionListener(listener31);  
                calButton37.setVisible(false);
                calButton38.setVisible(false);
                calButton39.setVisible(false);
                calButton40.setVisible(false);
                calButton41.setVisible(false);
                calButton42.setVisible(false);
                break;
            default:
                //put error message
                break;
        }
        
    }
    
    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void setMemberCalendar()
    {
        classTypeLabel.setVisible(false);
        classesComboBox.setVisible(false);
        coachLabel.setVisible(false);
        coachesComboBox.setVisible(false);
        selectedClassComboBox.setVisible(true);
        hourLabel.setVisible(false);
        hourComboBox.setVisible(false);
        minuteLabel.setVisible(false);
        minuteComboBox.setVisible(false);
        removeScheduledClassButton.setVisible(false);
        calendarBackButton.setVisible(true);
        calendarBackButton.setEnabled(true);
        addClassButton.setVisible(false);
        addClassButton.setEnabled(false);
        
        selectedClassComboBox.setEnabled(true);
        classesComboBox.setEnabled(false);
        coachesComboBox.setEnabled(false);
        hourComboBox.setEnabled(false);
        minuteComboBox.setEnabled(false);
        removeScheduledClassButton.setEnabled(false);
        
        attendingLabel.setVisible(true);
        memberAttendingButton.setVisible(true);
        memberNotAttendingButton.setVisible(true);
        memberAttendingButton.setEnabled(true);
        memberNotAttendingButton.setEnabled(true);
    }
    
    private void setTreasurerCalendar()
    {
        classTypeLabel.setVisible(true);
        classesComboBox.setVisible(true);
        coachLabel.setVisible(true);
        coachesComboBox.setVisible(true);
        selectedClassComboBox.setVisible(false);
        hourLabel.setVisible(true);
        hourComboBox.setVisible(true);
        minuteLabel.setVisible(true);
        minuteComboBox.setVisible(true);
        removeScheduledClassButton.setVisible(true);
        calendarBackButton.setVisible(true);
        calendarBackButton.setEnabled(true);
        
        selectedClassComboBox.setEnabled(false);
        classesComboBox.setEnabled(true);
        coachesComboBox.setEnabled(true);
        hourComboBox.setEnabled(true);
        minuteComboBox.setEnabled(true);
        removeScheduledClassButton.setEnabled(true);
        
        attendingLabel.setVisible(false);
        memberAttendingButton.setVisible(false);
        memberNotAttendingButton.setVisible(false);
        memberAttendingButton.setEnabled(false);
        memberNotAttendingButton.setEnabled(false);
    }
    
    private void setCoachCalendar()
    {
        classTypeLabel.setVisible(false);
        classesComboBox.setVisible(false);
        coachLabel.setVisible(false);
        coachesComboBox.setVisible(false);
        selectedClassComboBox.setVisible(false);
        hourLabel.setVisible(false);
        hourComboBox.setVisible(false);
        minuteLabel.setVisible(false);
        minuteComboBox.setVisible(false);
        removeScheduledClassButton.setVisible(false);
        addClassButton.setVisible(false);
        calendarBackButton.setVisible(true);
        calendarBackButton.setEnabled(true);
        
        selectedClassComboBox.setEnabled(false);
        classesComboBox.setEnabled(false);
        coachesComboBox.setEnabled(false);
        hourComboBox.setEnabled(false);
        minuteComboBox.setEnabled(false);
        removeScheduledClassButton.setEnabled(false);
        
        attendingLabel.setVisible(false);
        memberAttendingButton.setVisible(false);
        memberNotAttendingButton.setVisible(false);
        memberAttendingButton.setEnabled(false);
        memberNotAttendingButton.setEnabled(false);
    }
    
    private void resetMemberHome()
    {
        memberHomePanel.setVisible(true);
        memberBannerPic.setVisible(true);
        memberNotificationsButton.setVisible(true);
        memberCalendarButton.setVisible(true);
        memberLogoutButton.setVisible(true);
        
        memberNotificationsButton.setEnabled(true);
        memberCalendarButton.setEnabled(true);
        memberLogoutButton.setEnabled(true);
        
    }
    
    private void resetTreasurerHome()
    {
        TreasurerHomePanel.setVisible(true);
        financesButton.setVisible(true);
        manageButton.setVisible(true);
        TreasurerNotifButton.setVisible(true);
        treasurerLogoutButton.setVisible(true);
        treasurerCalendarButton.setVisible(true);
        
        TreasurerNotifButton.setEnabled(true);
        treasurerLogoutButton.setEnabled(true);
        treasurerCalendarButton.setEnabled(true);
        manageButton.setEnabled(true);
        financesButton.setEnabled(true);
    }
    
    private void resetCoachHome()
    {
        CoachHomePanel.setVisible(true);
        membersButton.setVisible(true);
        coachNotificationsButton.setVisible(true);
        coachLogoutButton.setVisible(true);
        coachCalendarButton.setVisible(true);
        messageButton.setVisible(true);
        messageButton.setEnabled(true);
        
        membersButton.setEnabled(true);
        coachNotificationsButton.setEnabled(true);
        coachLogoutButton.setEnabled(true);
        coachCalendarButton.setEnabled(true);
        
        
    }
    private void tNotifBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNotifBackButtonActionPerformed
        // TODO add your handling code here:
       resetTreasurerHome();
       tNotifBackButton.setVisible(false);
       tNotifBackButton.setEnabled(false);
    }//GEN-LAST:event_tNotifBackButtonActionPerformed

    private void financesBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_financesBackButtonActionPerformed
        // TODO add your handling code here:
        resetTreasurerHome();
        financesPanel.setVisible(false);
        financesPanel.setEnabled(false);
    }//GEN-LAST:event_financesBackButtonActionPerformed

    private void mailingAddressTextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailingAddressTextboxActionPerformed
        // TODO add your handling code here:
        mailingAddressTextbox.setText("");

    }//GEN-LAST:event_mailingAddressTextboxActionPerformed

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        // TODO add your handling code here:
        String address = mailingAddressTextbox.getText();
        String message = MessageTextArea.getText();
        String subject = subjectLineTextbox.getText();
        Scanner addressCheck = new Scanner(address);
        String sender = usernameTextField.getText();
        String line = addressCheck.nextLine();
        String recipients[] = line.split("; ");
        
        FileWriter writer;
        
        try
        {
            //BufferedWriter writer = new BufferedWriter(new FileWriter(messagesFile));
            writer = new FileWriter(MESSAGESFILE, true);
            for (int i = 0; i < recipients.length; i++)
            {
                System.out.println(sender);
                System.out.println(recipients[i]);
                System.out.println(subject);
                System.out.println(message);
                writer.write("To: " + recipients[i]);
                writer.write(System.lineSeparator());
                writer.write("From: " + sender);
                writer.write(System.lineSeparator());
                writer.write("Sent On: " + sdf.format(this.calendar.getTime()));
                writer.write(System.lineSeparator());
                writer.write(subject);
                writer.write(System.lineSeparator());
                writer.write(message);
                writer.write(System.lineSeparator());
            }
            writer.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        mailingAddressTextbox.setText("");
        MessageTextArea.setText("");
        subjectLineTextbox.setText("");
        
        MainFrame.msgBox("Your message has been sent.", "Sent");
    }//GEN-LAST:event_sendButtonActionPerformed

    private void readMessages(String currentUser)
    {
            try (Scanner read = new Scanner(new File(MESSAGESFILE));)
            {
                while (read.hasNextLine())
                {
                    String currentLine = read.nextLine();
                    if (currentLine.equals("To: " + currentUser) || currentLine.equals("To: All Members"))
                    {
                        for (int i = 0; i < 3; i++)
                        {
                            messages = messages + read.nextLine() + "\n";
                        }
                        
                        messages = messages + "_________________________________ \n \n";
                    }
                }
                
                notifTextArea.setText(messages);
            }catch(IOException e)
            {
                e.printStackTrace();
            }           
    }
    
    private void allMembersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allMembersButtonActionPerformed
        // TODO add your handling code here:
        mailingAddressTextbox.setText("All Members");
    }//GEN-LAST:event_allMembersButtonActionPerformed

    private void calButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calButton4ActionPerformed

    private void hourComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hourComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hourComboBoxActionPerformed

    private void coachPhoneTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coachPhoneTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coachPhoneTextFieldActionPerformed

    private void memberPaymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberPaymentButtonActionPerformed
        // TODO add your handling code here:
        paymentPanel.setVisible(true);
        paymentPanel.setEnabled(true);
        memberHomePanel.setVisible(false);
        memberHomePanel.setEnabled(false);
        /*for(int i = 0; i < practiceList.size(); i++){
            for(int j = 0; j < practiceList.get(i).getMembers(); j++){
                if(curMem.getName().equals(practiceList.get(i).getMemberAt(i).getName())){
                    shoppingCartTextArea.setText("");
                    shoppingCartTextArea.append(sdf.format(practiceList.get(i).getDate().getTime()) + "\n");
                    shoppingCartTextArea.append(practiceList.get(i).getTime() + "  -  " + practiceList.get(i).getType() + " with " + practiceList.get(i).getCoach().getName() + " + \"\\n\"\n\n");
                }
            }
        }*/
        paymentTotal.setText("$" + calculatePayment(usernameTextField.getText()));
    }//GEN-LAST:event_memberPaymentButtonActionPerformed
    
    private void checkOutButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (checkPayment())
        {
            payment(usernameTextField.getText());
            MainFrame.msgBox("Thank you for your payment of $" + calculatePayment(usernameTextField.getText()), "Thank You");
        }
        else
        {
            MainFrame.msgBox("Declined.", "Declined");
        }
    }
    
    private void removeScheduledClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeScheduledClassButtonActionPerformed
        // TODO add your handling code here:
        
        boolean exists = false;
        
        for(int i = 0; i < practiceList.size(); i++){
            if(practiceList.get(i).getDate().get(Calendar.DAY_OF_MONTH) == calendar.get(Calendar.DAY_OF_MONTH)
                    && practiceList.get(i).getDate().get(Calendar.MONTH) == calendar.get(Calendar.MONTH)
                    && practiceList.get(i).getDate().get(Calendar.YEAR) == calendar.get(Calendar.YEAR)
                    && practiceList.get(i).getTime().equals((String)hourComboBox.getSelectedItem() + (String)minuteComboBox.getSelectedItem())
                    && practiceList.get(i).getType().equals((String)classesComboBox.getSelectedItem())
                    && practiceList.get(i).getCoach().getName().equals((String)coachesComboBox.getSelectedItem())){
                practiceList.remove(i);
                buildSessions();
                exists = true;
            }
        }
        if(!exists)
            MainFrame.msgBox("There is no practice with the specified Coach, class, and time on this date.", "Error");
        
    }//GEN-LAST:event_removeScheduledClassButtonActionPerformed

    private void buildSessions() {
        
        Collections.sort(practiceList);
        try (PrintWriter writer = new PrintWriter(SESSIONSFILE)) {
            for(int i = 0; i < practiceList.size(); i++){
                writer.println(sdf.format(practiceList.get(i).getDate().getTime()));
                writer.println(practiceList.get(i).getTime());
                writer.println(practiceList.get(i).getType());
                writer.println(practiceList.get(i).getCoach().getName());
                int temp = practiceList.get(i).getMembers();
                if(temp == 0 && i == practiceList.size()-1)
                    writer.print(temp);
                else{
                    writer.println(temp);
                    for(int j = 0; j < temp; j++){
                        writer.println(practiceList.get(i).getMemberAt(j).getName());
                        if(practiceList.get(i).hasPaid(j)){
                            if(j != temp-1 || i != practiceList.size()-1)
                                writer.println("true");
                            else
                                writer.print("true");
                        }
                        else{
                            if(j != temp-1 || i != practiceList.size()-1)
                                writer.println("false");
                            else
                                writer.print("false");
                        }
                    }
                }
            }
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        checkSessions();
        
    }
    
    private void previousMonthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousMonthButtonActionPerformed
        // TODO add your handling code here:
        
        if(calendar.get(Calendar.MONTH) > 0 && calendar.get(Calendar.MONTH) <= 11){
            calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH)-1);
            calendar.set(Calendar.DAY_OF_MONTH, 1);
            buildCal(calendar.get(Calendar.DAY_OF_WEEK), calendar.get(Calendar.MONTH)+1);
        }
        else if(calendar.get(Calendar.MONTH) == 0){
            calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR)-1);
            calendar.set(Calendar.MONTH, 11);
            calendar.set(Calendar.DAY_OF_MONTH, 1);
            buildCal(calendar.get(Calendar.DAY_OF_WEEK), 0);
        }
        else{
            //error message here
        }
        selectedDateLabel.setText(sdf.format(calendar.getTime()));
        
    }//GEN-LAST:event_previousMonthButtonActionPerformed

    private void coachesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coachesComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coachesComboBoxActionPerformed

    private void addClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClassButtonActionPerformed
        // TODO add your handling code here:
        try(Scanner parse = new Scanner(new File(SESSIONSFILE));)
        {            
            while (parse.hasNextLine())
            {
                boolean taken = false;
                String temp = parse.nextLine();
                for(int i = 0; i < practiceList.size(); i++){
                    
                    if(!temp.equals(sdf.format(practiceList.get(i).getDate().getTime()))){
                        for(int j = 0; j < 3; j++){
                            parse.nextLine();
                        }
                        int k = Integer.parseInt(parse.nextLine());
                        for(int j = 0; j < k; j++){
                            parse.nextLine();
                            parse.nextLine();
                        }
                    }
                    else{
                        if(parse.nextLine().equals((String) hourComboBox.getSelectedItem() + (String) minuteComboBox.getSelectedItem()) && parse.nextLine().equals((String) classesComboBox.getSelectedItem())){
                            MainFrame.msgBox("Class already exists.", "Error");
                            taken = true;
                        }
                        break;
                    }
                }
                if(!taken){
                    Calendar sessionDay = Calendar.getInstance();
                    sessionDay.set(Calendar.YEAR, calendar.get(Calendar.YEAR));
                    sessionDay.set(Calendar.MONTH, calendar.get(Calendar.MONTH));
                    sessionDay.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH));
                    practiceList.add(new Session(coachList.get(coachesComboBox.getSelectedIndex()), sessionDay, (String) classesComboBox.getSelectedItem(), (String) hourComboBox.getSelectedItem(), (String) minuteComboBox.getSelectedItem()));
                    buildSessions();
                    break;
                }
                else
                    break;
            }
            
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_addClassButtonActionPerformed

    private void inputExpensesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputExpensesButtonActionPerformed
        FileWriter writer;
        if ("".equals(hallExpenseTextField.getText()) || "".equals(coachExpenseTextField.getText()) || "".equals(otherExpenseTextField.getText()))
        {
            MainFrame.msgBox("Please enter values for all fields.", "Error");
        }
        else
        {
            try
            {
                System.out.println("INPUT");
                writer = new FileWriter(EXPENSESFILE, true);
                writer.write(YearExpenseComboBox.getSelectedItem().toString());
                writer.write(System.lineSeparator());
                writer.write(monthExpenseComboBox.getSelectedItem().toString());
                writer.write(System.lineSeparator());
                writer.write(hallExpenseTextField.getText());
                writer.write(System.lineSeparator());
                writer.write(coachExpenseTextField.getText());
                writer.write(System.lineSeparator());
                writer.write(otherExpenseTextField.getText());
                writer.write(System.lineSeparator());
                writer.close();
            } catch(IOException e)
            {
                e.printStackTrace();
            }
            
            hallExpenseTextField.setText("");
            coachExpenseTextField.setText("");
            otherExpenseTextField.setText("");
        }
    }//GEN-LAST:event_inputExpensesButtonActionPerformed

    private void inputRevenueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputRevenueButtonActionPerformed
        // TODO add your handling code here:
        FileWriter writer;
        try
        {
            writer = new FileWriter(REVENUESFILE, true);
            writer.write(yearRevenueComboBox.getSelectedItem().toString());
            writer.write(System.lineSeparator());
            writer.write(monthRevenueComboBox.getSelectedItem().toString());
            writer.write(System.lineSeparator());
            writer.write(memberFeesTextField.getText());
            writer.write(System.lineSeparator());
            writer.write(accountsPayableTextField.getText());
            writer.write(System.lineSeparator());
            writer.write(otherRevenueTextField.getText());
            writer.write(System.lineSeparator());
            writer.close();
        } catch(IOException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_inputRevenueButtonActionPerformed

    private void displayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayButtonActionPerformed
        // TODO add your handling code here:
        initializeIncomeStatement(yearTableComboBox.getSelectedItem().toString(), monthTableComboBox.getSelectedItem().toString());
        initializeFinanceHistory();
    }//GEN-LAST:event_displayButtonActionPerformed

    private void removeMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeMemberActionPerformed
        // TODO add your handling code here:
        removeMember((String)removeMemberComboBox.getSelectedItem());
        
    }//GEN-LAST:event_removeMemberActionPerformed

    private void addMemberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMemberButtonActionPerformed
        // TODO add your handling code here:
        addMemberPanel.setVisible(true);
        membersPanel.setVisible(false);
    }//GEN-LAST:event_addMemberButtonActionPerformed

    private void addMemberButtonConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMemberButtonConfirmActionPerformed
        // TODO add your handling code here:
        FileWriter writer;
        if (addUsernameTextField.getText().isEmpty() == false && addPasswordField.getText().isEmpty() == false 
                && addFirstNameTextField.getText().isEmpty() == false && addLastNameTextField.getText().isEmpty() == false 
                && addPhoneTextField.getText().isEmpty() == false && addAddressTextField.getText().isEmpty() == false)
        {
            try
            {
                writer = new FileWriter(USERFILE, true);
                writer.write(addUsernameTextField.getText());
                writer.write(System.lineSeparator());
                writer.write(addPasswordField.getText());
                writer.write(System.lineSeparator());
                writer.write("Member");
                writer.write(System.lineSeparator());
                writer.write("No Messages");
                writer.write(System.lineSeparator());
                writer.write(addFirstNameTextField.getText());
                writer.write(System.lineSeparator());
                writer.write(addLastNameTextField.getText());
                writer.write(System.lineSeparator());
                writer.write(addPhoneTextField.getText());
                writer.write(System.lineSeparator());
                writer.write(addAddressTextField.getText());
                writer.write(System.lineSeparator());
                writer.write("0");
                writer.write(System.lineSeparator());
                writer.write("yes");
                writer.write(System.lineSeparator());
                writer.close();
                
                memberList.add(new Member("Member", addFirstNameTextField.getText() + " " + addLastNameTextField.getText(),addAddressTextField.getText(),addPhoneTextField.getText(),"yes"));
            } catch (IOException e)
            {
                e.printStackTrace();
            }
            
            //removeMemberComboBox.removeAllItems();
            //jTable1.removeAll();
            //membersPopulate();
            printMembers();
            membersComboBoxGenerate();
            
            membersPanel.setVisible(true);
            addMemberPanel.setVisible(false);
            
        }
        else
        {
            MainFrame.msgBox("Please enter valid input for all fields.", "Invalid Application");
        }
        
    }//GEN-LAST:event_addMemberButtonConfirmActionPerformed

    private void addPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addPasswordFieldActionPerformed

    private void memberAttendingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberAttendingButtonActionPerformed
        // TODO add your handling code here:
        
        if(((String)selectedClassComboBox.getSelectedItem()).equals("No Classes"))
            MainFrame.msgBox("There are no classes on this day.", "Error");
        else{
            for(int i = 0; i < practiceList.size(); i++){
                if(((String)selectedClassComboBox.getSelectedItem()).equals(practiceList.get(i).getTime() + " - " + practiceList.get(i).getType())
                        && practiceList.get(i).getDate().get(Calendar.MONTH) == calendar.get(Calendar.MONTH)
                        && practiceList.get(i).getDate().get(Calendar.DAY_OF_MONTH) == calendar.get(Calendar.DAY_OF_MONTH)
                        && practiceList.get(i).getDate().get(Calendar.YEAR) == calendar.get(Calendar.YEAR)){
                    if(practiceList.get(i).getMembers() == 0){
                        practiceList.get(i).addMember(curMem);
                        MainFrame.msgBox("You are now enrolled in the class.", "Success!");
                        break;
                    }
                    else {
                        boolean enrolled = false;
                        for(int j = 0; j < practiceList.get(i).getMembers(); j++){
                            if(practiceList.get(i).getMemberAt(j).getName().equals(curMem.getName())){
                                MainFrame.msgBox("You are already enrolled in the class.", "Error");
                                enrolled = true;
                                break;
                            }
                        }
                        if(!enrolled){
                            if(practiceList.get(i).addMember(curMem))
                                MainFrame.msgBox("You are now enrolled in the class.", "Success!");
                            else
                                MainFrame.msgBox("Sorry, the selected class if full.", "Error");
                        }
                        break;
                    }
                }
            }
            buildSessions();
        }
        
    }//GEN-LAST:event_memberAttendingButtonActionPerformed

    private void memberNotAttendingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberNotAttendingButtonActionPerformed
        // TODO add your handling code here:
        
        if(((String)selectedClassComboBox.getSelectedItem()).equals("No Classes"))
            MainFrame.msgBox("There are no classes on this day.", "Error");
        else{
            for(int i = 0; i < practiceList.size(); i++){
                if(((String)selectedClassComboBox.getSelectedItem()).equals(practiceList.get(i).getTime() + " - " + practiceList.get(i).getType())
                    && practiceList.get(i).getDate().get(Calendar.MONTH) == calendar.get(Calendar.MONTH)
                    && practiceList.get(i).getDate().get(Calendar.DAY_OF_MONTH) == calendar.get(Calendar.DAY_OF_MONTH)
                    && practiceList.get(i).getDate().get(Calendar.YEAR) == calendar.get(Calendar.YEAR)){
                    if(practiceList.get(i).getMembers() == 0)
                        MainFrame.msgBox("You are not enrolled in the class.", "Error");
                    else {
                        if(practiceList.get(i).removeMember(curMem))
                            MainFrame.msgBox("You have been withdrawn from the class.", "Error");
                        else
                            MainFrame.msgBox("You are not enrolled in the class.", "Error");
                    }
                }
            }
            buildSessions();
        }
        
    }//GEN-LAST:event_memberNotAttendingButtonActionPerformed

    private void calendarBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calendarBackButtonActionPerformed
        // TODO add your handling code here:
        
        switch (curMem.getType()) {
            case "Coach":
                resetCoachHome();
                break;
            case "Treasurer":
                resetTreasurerHome();
                break;
            case "Member":
                resetMemberHome();
                break;
            default:
                break;
        }
        
        calendarPanel.setVisible(false);
        calendarPanel.setEnabled(false);
        
        calendarBackButton.setVisible(false);
        calendarBackButton.setEnabled(false);
        
    }//GEN-LAST:event_calendarBackButtonActionPerformed

    private void sortOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortOptionsActionPerformed
       JComboBox cb = (JComboBox)evt.getSource();
        String optionSel = (String)cb.getSelectedItem();
        if("Paid".equals(optionSel)){
            Collections.sort(memberList, (a, b) -> a.getPaid().compareTo(b.getPaid()));
        }
       //else if("Frequency ".equals(optionSel)){
       //    Collections.sort(memberList, (a,b) -> a.getFrequency().compareTo(b.getFrequency()));
       //}
        else {
            Collections.sort(memberList);
        }
        printMembers();
        System.out.println(optionSel);
                
        
    
    }//GEN-LAST:event_sortOptionsActionPerformed

    private void paymentBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentBackButtonActionPerformed
        // TODO add your handling code here:
        
        paymentPanel.setVisible(false);
        paymentPanel.setEnabled(false);
        memberHomePanel.setVisible(true);
        memberHomePanel.setEnabled(true);
        
    }//GEN-LAST:event_paymentBackButtonActionPerformed

    /*private void populateCoaches()
    {
        try (Scanner parse = new Scanner(new File(USERFILE));){
            while(parse.hasNextLine()){
                parse.nextLine();
                parse.nextLine();
                String type = parse.nextLine();
                parse.nextLine();
                String name = parse.nextLine();
                name = name + " " + parse.nextLine();
                String phone = parse.nextLine();
                String address = parse.nextLine();
                parse.nextLine();
                String paid=parse.nextLine();
                if("coach".equals(type)){
                coachList.add(new Member(type, name,address,phone,paid));
                if(name.equals(memName))
                    curMem = coachList.get(coachList.size()-1);
                }
            }
            Collections.sort(coachList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
    
    private void addCoachButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCoachButtonActionPerformed
        // TODO add your handling code here:
        FileWriter writer;
        if (coachUsernameTextField.getText().isEmpty() == false && coachPassTextField.getText().isEmpty() == false 
                && coachFnameTextField.getText().isEmpty() == false && coachLnameTextField.getText().isEmpty() == false 
                && coachPhoneTextField.getText().isEmpty() == false && coachAddressTextField.getText().isEmpty() == false)
        {
            try
            {
                writer = new FileWriter(USERFILE, true);
                writer.write(coachUsernameTextField.getText());
                writer.write(System.lineSeparator());
                writer.write(coachPassTextField.getText());
                writer.write(System.lineSeparator());
                writer.write("Coach");
                writer.write(System.lineSeparator());
                writer.write("No Messages");
                writer.write(System.lineSeparator());
                writer.write(coachFnameTextField.getText());
                writer.write(System.lineSeparator());
                writer.write(coachLnameTextField.getText());
                writer.write(System.lineSeparator());
                writer.write(coachPhoneTextField.getText());
                writer.write(System.lineSeparator());
                writer.write(coachAddressTextField.getText());
                writer.write(System.lineSeparator());
                writer.write("0");
                writer.write(System.lineSeparator());
                writer.write("yes");
                writer.write(System.lineSeparator());
                writer.close();
                
                memberList.add(new Member("Coach", coachFnameTextField.getText() + " " + 
                        coachLnameTextField.getText(),coachAddressTextField.getText(),
                        coachPhoneTextField.getText(),"yes"));
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_addCoachButtonActionPerformed

    private void applyDiscountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyDiscountButtonActionPerformed
        // TODO add your handling code here:
        if (discountTextField.getText().equals("LOYALTY10"))
        {
            paymentTotal.setText("$" + calculatePayment(usernameTextField.getText()) * 0.9);
        }
    }//GEN-LAST:event_applyDiscountButtonActionPerformed


    
    /**
     * @param args the command line arguments
     */
    
    private void bannerClick(JPanel actionPanel, int targetCount)
    {
        if (targetCount % 2 == 1)
        {
            actionPanel.setVisible(true);
            actionPanel.setEnabled(true);
        }
        else
        {
            actionPanel.setVisible(false);
            actionPanel.setEnabled(false);
        }
    }
    
    private void whiteOut()
    {
        CoachHomePanel.setBackground(Color.white);
        MainFramePanel.setBackground(Color.white);
        TreasurerHomePanel.setBackground(Color.white);
        memberHomePanel.setBackground(Color.white);
        financesPanel.setBackground(Color.white);
        treasurerNotificationsPanel.setBackground(Color.white);
        membersPanel.setBackground(Color.white);
        messagePanel.setBackground(Color.white);
        addMemberPanel.setBackground(Color.white);
        calendarPanel.setBackground(Color.white);
        coachNotificationPanel.setBackground(Color.white);
    }
    
    public void resetFinances()
    {
        FileWriter writer;
        
        try(Scanner parse = new Scanner(new File(USERFILE));)
        {
            writer = new FileWriter(FINANCESFILE, true);
            
            while (parse.hasNextLine())
            {
                writer.write(parse.nextLine());
                //System.out.println(parse.nextLine());
                writer.write(System.lineSeparator());
                writer.write("0");
                writer.write(System.lineSeparator());
                //System.out.println("Balance");
                for (int i = 0; i < 9; i++)
                {
                    parse.nextLine();
                }
            }
            
            writer.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public void payment(String currentUser)
    {
        int balance = 0;
        
        try
        {
            Scanner parse = new Scanner(new File(FINANCESFILE));
            FileWriter writer = new FileWriter(FINANCESFILE, true);
            while (parse.hasNextLine())
            {
                if (parse.nextLine().equals(currentUser))
                {
                    balance = parse.nextInt();
                    System.out.println("Balance: " + balance);
                }
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
    private int calculatePayment(String currentUser)
    {
        int sessionsOutstanding = 0;
        
        try
        {
            Scanner userParse = new Scanner(new File(USERFILE));
            while (userParse.hasNextLine())
            {
                if (userParse.nextLine().equals(currentUser))
                {
                    for (int i = 0; i < 7; i++)
                    {
                        userParse.nextLine();
                    }
                    sessionsOutstanding = userParse.nextInt();
                    return (sessionsOutstanding * 25);
                }
            }
        } catch (IOException e)
        {
            e. printStackTrace();
        }
        return 0;
    }
    
    private boolean checkPayment() //function to check if payment criteria is met
    {
        if (cardNumberTextField.getText().equals(""))
        {
            MainFrame.msgBox("Please enter valid payment credentials.", "Invalid Payment");
            return false;
        }
        else if (cvvTextField.getText().equals(""))
        {
            MainFrame.msgBox("Please enter valid payment credentials.", "Invalid Payment");
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);

            }
        });
        
        
        
    }

    public static void msgBox(String message, String title)
    {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CoachHomePanel;
    private javax.swing.JPanel MainFramePanel;
    private javax.swing.JTextArea MessageTextArea;
    private javax.swing.JLabel RevenueLabel;
    private javax.swing.JPanel TreasurerHomePanel;
    private javax.swing.JButton TreasurerNotifButton;
    private javax.swing.JComboBox<String> YearExpenseComboBox;
    private javax.swing.JLabel accountsPayableLabel;
    private javax.swing.JTextField accountsPayableTextField;
    private javax.swing.JLabel addAddressLabel;
    private javax.swing.JTextField addAddressTextField;
    private javax.swing.JButton addClassButton;
    private javax.swing.JButton addCoachButton;
    private javax.swing.JLabel addCoachLabel;
    private javax.swing.JLabel addFirstLabel;
    private javax.swing.JTextField addFirstNameTextField;
    private javax.swing.JLabel addLastLabel;
    private javax.swing.JTextField addLastNameTextField;
    private javax.swing.JButton addMemberButton;
    private javax.swing.JButton addMemberButtonConfirm;
    private javax.swing.JLabel addMemberDescriptionLabel;
    private javax.swing.JLabel addMemberLabel;
    private javax.swing.JPanel addMemberPanel;
    private javax.swing.JPasswordField addPasswordField;
    private javax.swing.JLabel addPasswordLabel;
    private javax.swing.JLabel addPhoneLabel;
    private javax.swing.JTextField addPhoneTextField;
    private javax.swing.JLabel addUsernameLabel;
    private javax.swing.JTextField addUsernameTextField;
    private javax.swing.JButton allMembersButton;
    private javax.swing.JRadioButton amexRadioButton;
    private javax.swing.JButton applyDiscountButton;
    private javax.swing.JLabel attendingLabel;
    private javax.swing.JLabel backLabel;
    private javax.swing.JButton calButton1;
    private javax.swing.JButton calButton10;
    private javax.swing.JButton calButton11;
    private javax.swing.JButton calButton12;
    private javax.swing.JButton calButton13;
    private javax.swing.JButton calButton14;
    private javax.swing.JButton calButton15;
    private javax.swing.JButton calButton16;
    private javax.swing.JButton calButton17;
    private javax.swing.JButton calButton18;
    private javax.swing.JButton calButton19;
    private javax.swing.JButton calButton2;
    private javax.swing.JButton calButton20;
    private javax.swing.JButton calButton21;
    private javax.swing.JButton calButton22;
    private javax.swing.JButton calButton23;
    private javax.swing.JButton calButton24;
    private javax.swing.JButton calButton25;
    private javax.swing.JButton calButton26;
    private javax.swing.JButton calButton27;
    private javax.swing.JButton calButton28;
    private javax.swing.JButton calButton29;
    private javax.swing.JButton calButton3;
    private javax.swing.JButton calButton30;
    private javax.swing.JButton calButton31;
    private javax.swing.JButton calButton32;
    private javax.swing.JButton calButton33;
    private javax.swing.JButton calButton34;
    private javax.swing.JButton calButton35;
    private javax.swing.JButton calButton36;
    private javax.swing.JButton calButton37;
    private javax.swing.JButton calButton38;
    private javax.swing.JButton calButton39;
    private javax.swing.JButton calButton4;
    private javax.swing.JButton calButton40;
    private javax.swing.JButton calButton41;
    private javax.swing.JButton calButton42;
    private javax.swing.JButton calButton5;
    private javax.swing.JButton calButton6;
    private javax.swing.JButton calButton7;
    private javax.swing.JButton calButton8;
    private javax.swing.JButton calButton9;
    private javax.swing.JButton calendarBackButton;
    private javax.swing.JLabel calendarBackButtonLabel;
    private javax.swing.JLabel calendarBanner;
    private javax.swing.JLabel calendarButtonPic;
    private javax.swing.JPanel calendarPanel;
    private javax.swing.JLabel cardNumberLabel;
    private javax.swing.JTextField cardNumberTextField;
    private javax.swing.JButton checkOutButton;
    private javax.swing.JLabel classTypeLabel;
    private javax.swing.JComboBox<String> classesComboBox;
    private javax.swing.JLabel coachAddressLabel;
    private javax.swing.JTextField coachAddressTextField;
    private javax.swing.JButton coachCalendarButton;
    private javax.swing.JLabel coachCornerBanner;
    private javax.swing.JLabel coachExpenseLabel;
    private javax.swing.JTextField coachExpenseTextField;
    private javax.swing.JLabel coachFnameLabel;
    private javax.swing.JTextField coachFnameTextField;
    private javax.swing.JLabel coachLabel;
    private javax.swing.JLabel coachLnameLabel;
    private javax.swing.JTextField coachLnameTextField;
    private javax.swing.JButton coachLogoutButton;
    private javax.swing.JLabel coachMessagePicture;
    private javax.swing.JLabel coachNoNotifPic;
    private javax.swing.JPanel coachNotificationPanel;
    private javax.swing.JButton coachNotificationsButton;
    private javax.swing.JLabel coachPassLabel;
    private javax.swing.JTextField coachPassTextField;
    private javax.swing.JLabel coachPhoneLabel;
    private javax.swing.JTextField coachPhoneTextField;
    private javax.swing.JLabel coachUsernameLabel;
    private javax.swing.JTextField coachUsernameTextField;
    private javax.swing.JComboBox<String> coachesComboBox;
    private javax.swing.JPanel coachesPanel;
    private javax.swing.JScrollPane coachesScrollPane;
    private javax.swing.JTextArea coachesTextArea;
    private javax.swing.JLabel cvvLabel;
    private javax.swing.JTextField cvvTextField;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel discountCodeLabel;
    private javax.swing.JTextField discountTextField;
    private javax.swing.JButton displayButton;
    private javax.swing.JLabel expensesLabel;
    private javax.swing.JLabel expiryLabel;
    private javax.swing.JButton financesBackButton;
    private javax.swing.JButton financesButton;
    private javax.swing.JLabel financesLabel;
    private javax.swing.JPanel financesPanel;
    private javax.swing.JLabel fridayLabel;
    private javax.swing.JLabel hallExpenseLabel;
    private javax.swing.JTextField hallExpenseTextField;
    private javax.swing.JScrollPane historyPane;
    private javax.swing.JComboBox<String> hourComboBox;
    private javax.swing.JLabel hourLabel;
    private javax.swing.JPanel incomeStatementPanel;
    private javax.swing.JTable incomeStatementTable;
    private javax.swing.JButton inputExpensesButton;
    private javax.swing.JButton inputRevenueButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel logoutButtonPic;
    private javax.swing.JTextField mailingAddressTextbox;
    private javax.swing.JButton manageButton;
    private javax.swing.JRadioButton masterCardRadioButton;
    private javax.swing.JButton memberAttendingButton;
    private javax.swing.JLabel memberBannerPic;
    private javax.swing.JLabel memberButtonPic;
    private javax.swing.JButton memberCalendarButton;
    private javax.swing.JLabel memberCalendarPic;
    private javax.swing.JLabel memberFeesLabel;
    private javax.swing.JTextField memberFeesTextField;
    private javax.swing.JPanel memberHomePanel;
    private javax.swing.JButton memberLogoutButton;
    private javax.swing.JLabel memberLogoutButtonPic;
    private javax.swing.JButton memberNotAttendingButton;
    private javax.swing.JLabel memberNotifButtonPic;
    private javax.swing.JButton memberNotificationsButton;
    private javax.swing.JButton memberPaymentButton;
    private javax.swing.JButton membersBackButton;
    private javax.swing.JButton membersButton;
    private javax.swing.JPanel membersPanel;
    private javax.swing.JScrollPane membersScrollPane;
    private javax.swing.JButton messageButton;
    private javax.swing.JPanel messagePanel;
    private javax.swing.JScrollPane messageScrollPane;
    private javax.swing.JComboBox<String> minuteComboBox;
    private javax.swing.JLabel minuteLabel;
    private javax.swing.JLabel mondayLabel;
    private javax.swing.JComboBox<String> monthComboBox;
    private javax.swing.JComboBox<String> monthExpenseComboBox;
    private javax.swing.JLabel monthExpenseLabel;
    private javax.swing.JLabel monthLabel;
    private javax.swing.JComboBox<String> monthRevenueComboBox;
    private javax.swing.JLabel monthRevenueLabel;
    private javax.swing.JComboBox<String> monthTableComboBox;
    private javax.swing.JLabel monthTableLabel;
    private javax.swing.JButton nextMonthButton;
    private javax.swing.JLabel notifLabel;
    private javax.swing.JScrollPane notifScrollPane;
    private javax.swing.JTextArea notifTextArea;
    private javax.swing.JLabel otherExpenseLabel;
    private javax.swing.JTextField otherExpenseTextField;
    private javax.swing.JLabel otherRevenueLabel;
    private javax.swing.JTextField otherRevenueTextField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLable;
    private javax.swing.JButton paymentBackButton;
    private javax.swing.JLabel paymentBackButtonLabel;
    private javax.swing.JLabel paymentBannerLabel;
    private javax.swing.JLabel paymentClassesLabel;
    private javax.swing.JLabel paymentMethodLabel;
    private javax.swing.ButtonGroup paymentMethodbuttonGroup;
    private javax.swing.JPanel paymentPanel;
    private javax.swing.JLabel paymentTotal;
    private javax.swing.JLabel paymentTotalLabel;
    private javax.swing.JButton previousMonthButton;
    private javax.swing.JButton removeClassButton;
    private javax.swing.JComboBox<String> removeClassComboBox;
    private javax.swing.JLabel removeClassLabel;
    private javax.swing.JButton removeCoachButton;
    private javax.swing.JComboBox<String> removeCoachComboBox;
    private javax.swing.JLabel removeCoachLabel;
    private javax.swing.JButton removeMember;
    private javax.swing.JComboBox<String> removeMemberComboBox;
    private javax.swing.JLabel removeMemberLabel;
    private javax.swing.JButton removeScheduledClassButton;
    private javax.swing.JLabel saturdayLabel;
    private javax.swing.JScrollPane scheduledScrollPane;
    private javax.swing.JTextArea scheduledTextArea;
    private javax.swing.JComboBox<String> selectedClassComboBox;
    private javax.swing.JLabel selectedDateLabel;
    private javax.swing.JButton sendButton;
    private javax.swing.JScrollPane shoppingCartScrollPane;
    private javax.swing.JTextArea shoppingCartTextArea;
    private javax.swing.JLabel slashLabel;
    private javax.swing.JLabel sortLabel;
    private javax.swing.JComboBox<String> sortOptions;
    private javax.swing.JLabel subjectLabel;
    private javax.swing.JTextField subjectLineTextbox;
    private javax.swing.JLabel sundayLabel;
    private javax.swing.JButton tNotifBackButton;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JLabel thursdayLabel;
    private javax.swing.JLabel toLabel;
    private javax.swing.JLabel treasurerBannerPic;
    private javax.swing.JButton treasurerCalendarButton;
    private javax.swing.JLabel treasurerCalendarButtonPic;
    private javax.swing.JLabel treasurerFinancesButtonPic;
    private javax.swing.JButton treasurerLogoutButton;
    private javax.swing.JLabel treasurerLogoutButtonPic;
    private javax.swing.JLabel treasurerManageButtonPic;
    private javax.swing.JLabel treasurerNotifButtonPic;
    private javax.swing.JPanel treasurerNotificationsPanel;
    private javax.swing.JLabel tuesdayLabel;
    private javax.swing.JLabel userNameLable;
    private javax.swing.JTextField usernameTextField;
    private javax.swing.JRadioButton visaRadioButton;
    private javax.swing.JLabel wednesdayLabel;
    private javax.swing.JComboBox<String> yearComboBox;
    private javax.swing.JLabel yearExpenseLabel;
    private javax.swing.JComboBox<String> yearRevenueComboBox;
    private javax.swing.JLabel yearRevenueLabel;
    private javax.swing.JComboBox<String> yearTableComboBox;
    private javax.swing.JLabel yearTableLabel;
    // End of variables declaration//GEN-END:variables
}
