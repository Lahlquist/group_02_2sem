package presentation;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import domain.Controller;
import domain.Gaest;

/**
 * Semesterprojekt - "Casablanca Holiday Center" 2. semester 2014
 *
 * Udarbejdet af: Emil, Anders, Søren og Laura
 *
 * Torsdag den 1. maj 2014 #Part 1
 */
public class GUIMedarbejder extends javax.swing.JFrame
{

    private String roomTypeChoosen;
    private Controller c = new Controller();
    int count = 0;

    public GUIMedarbejder()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jTextField1 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField5 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        GaesteListen = new javax.swing.JTable();
        jButtonGetGuestList = new javax.swing.JButton();
        jLabelInfoOversigt = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextFieldFornavn = new javax.swing.JTextField();
        jTextFieldEfternavn = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldLand = new javax.swing.JTextField();
        jTextFieldTelefonnummer = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextfieldBynavn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        SingleRumBtn = new javax.swing.JRadioButton();
        FamilieRumBtn = new javax.swing.JRadioButton();
        DobbeltRumBtn = new javax.swing.JRadioButton();
        jButtonBekræftBooking = new javax.swing.JButton();
        jTextfieldRejsebureau = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabelInfo = new javax.swing.JLabel();
        jTextfieldPostnummer = new javax.swing.JTextField();
        jTextfieldVejnavn = new javax.swing.JTextField();
        jTextfieldVejnummer = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButtonCheckudsigt = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButtonHentOversigt = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jTextFieldEfternavnRSG = new javax.swing.JTextField();
        jTextFieldFornavnRSG = new javax.swing.JTextField();
        jTextFieldLandRSG = new javax.swing.JTextField();
        jTextFieldEmailRSG = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jTextFieldTelefonnummerRSG = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jButtonRedigerGaest = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTextfieldPostnummerRSG = new javax.swing.JTextField();
        jTextfieldRejsebureauRSG = new javax.swing.JTextField();
        jTextfieldVejnavnRSG = new javax.swing.JTextField();
        jDateChooserCheckind1 = new com.toedter.calendar.JDateChooser();
        jLabelInfo2 = new javax.swing.JLabel();
        jDateChooserCheckud1 = new com.toedter.calendar.JDateChooser();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jTextfieldVejnummerRSG = new javax.swing.JTextField();
        jTextFieldLejlighedsIDRSG = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jTextfieldBynavnRSG = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jButtonSletGaest = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        jTextFieldGaestID = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabelHentGaest = new javax.swing.JLabel();
        jLabelGaestRedigeret = new javax.swing.JLabel();
        jLabelGaestSlettet = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextfieldBynavn1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextfieldRejsebureau1 = new javax.swing.JTextField();
        jTextfieldPostnummer1 = new javax.swing.JTextField();
        jLabelInfo1 = new javax.swing.JLabel();
        jTextfieldVejnavn1 = new javax.swing.JTextField();
        jTextfieldVejnummer1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextFieldTelefonnummer1 = new javax.swing.JTextField();
        jTextFieldLand1 = new javax.swing.JTextField();
        jTextFieldEmail1 = new javax.swing.JTextField();
        jTextFieldEfternavn1 = new javax.swing.JTextField();
        jTextFieldFornavn1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextFieldLejlighedsID = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jDateChooserCheckind = new com.toedter.calendar.JDateChooser();
        jDateChooserCheckud = new com.toedter.calendar.JDateChooser();
        jLabel29 = new javax.swing.JLabel();
        jButtonOpretGæst = new javax.swing.JButton();
        jLabelGæstoprettetinfo = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String []
            {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        GaesteListen.setAutoCreateRowSorter(true);
        GaesteListen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "GæstID", "Fornavn(e)", "Efternavn", "Telefonnummer", "Email", "Vejnavn", "Vejnummer", "Postnummer", "Bynavn", "Land", "Rejsebureau"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, true, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(GaesteListen);

        jButtonGetGuestList.setText("Hent Gæsteliste");
        jButtonGetGuestList.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonGetGuestListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabelInfoOversigt))
                    .addComponent(jButtonGetGuestList)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInfoOversigt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jButtonGetGuestList)
                .addGap(31, 31, 31))
        );

        jTabbedPane1.addTab("Gæst Oversigt", jPanel1);

        jTextFieldFornavn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldFornavnActionPerformed(evt);
            }
        });

        jLabel1.setText("Fornavn:");

        jLabel2.setText("Efternavn:");

        jLabel3.setText("Land:");

        jLabel4.setText("E-mail:");

        jLabel5.setText("Telefonnummer:");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("Adresse:");

        jLabel7.setText("Check Ind:");

        jLabel8.setText("Check Ud:");

        buttonGroup1.add(SingleRumBtn);
        SingleRumBtn.setText("Single Rum");
        SingleRumBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                SingleRumBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(FamilieRumBtn);
        FamilieRumBtn.setText("Familie Rum (5 pers)");
        FamilieRumBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                FamilieRumBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(DobbeltRumBtn);
        DobbeltRumBtn.setText("Dobbelt Rum");
        DobbeltRumBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                DobbeltRumBtnActionPerformed(evt);
            }
        });

        jButtonBekræftBooking.setText("Bekræft Booking");
        jButtonBekræftBooking.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonBekræftBookingActionPerformed(evt);
            }
        });

        jLabel9.setText("Rejsebureau:");

        jLabel10.setText("Bynavn:");

        jLabel11.setText("Vejnavn:");

        jLabel12.setText("Postnummer:");

        jLabel13.setText("Vejnummer:");

        jButtonCheckudsigt.setText("Check dato");
        jButtonCheckudsigt.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonCheckudsigtActionPerformed(evt);
            }
        });

        jLabel14.setText("ledige lejligheder");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldEfternavn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldLand, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldFornavn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextfieldBynavn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextfieldVejnavn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(SingleRumBtn))
                                .addGap(73, 73, 73)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(FamilieRumBtn)
                                        .addGap(76, 76, 76)
                                        .addComponent(DobbeltRumBtn))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(134, 134, 134)
                                        .addComponent(jLabel8))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(78, 78, 78)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTelefonnummer, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextfieldRejsebureau, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextfieldPostnummer, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextfieldVejnummer, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(259, 259, 259))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonBekræftBooking)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCheckudsigt)
                                .addGap(33, 33, 33)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCheckudsigt)
                            .addComponent(jLabel14))
                        .addGap(224, 224, 224)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldTelefonnummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextfieldRejsebureau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextfieldPostnummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextfieldVejnummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(2, 2, 2)
                        .addComponent(jButtonBekræftBooking)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SingleRumBtn)
                            .addComponent(FamilieRumBtn)
                            .addComponent(DobbeltRumBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldFornavn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEfternavn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextfieldBynavn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextfieldVejnavn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );

        jTabbedPane1.addTab("Booking af Værelse", jPanel3);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "ID", "Type", "Status", "Personer", "Dato ind", "Dato Ud"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable2);

        jButtonHentOversigt.setText("Hent Oversigt");
        jButtonHentOversigt.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonHentOversigtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonHentOversigt))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(jButtonHentOversigt)
                .addGap(42, 42, 42))
        );

        jTabbedPane1.addTab("Værelse Oversigt", jPanel4);

        jLabel30.setText("Lejligheds ID: ");

        jLabel31.setText("Tilknyt Gæst til en Lejlighed");

        jLabel32.setText("Efternavn:");

        jLabel33.setText("Fornavn:");

        jTextFieldFornavnRSG.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldFornavnRSGActionPerformed(evt);
            }
        });

        jLabel34.setText("Postnummer:");

        jLabel35.setText("Vejnummer:");

        jButtonRedigerGaest.setText("Rediger Gæst");
        jButtonRedigerGaest.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonRedigerGaestActionPerformed(evt);
            }
        });

        jLabel36.setText("Rejsebureau:");

        jLabel37.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel37.setText("Adresse:");

        jLabel38.setText("Bynavn:");

        jLabel39.setText("E-mail:");

        jLabel40.setText("Check Ud:");

        jLabel41.setText("Vejnavn:");

        jLabel42.setText("Check Ind:");

        jLabel43.setText("Telefonnummer:");

        jLabel44.setText("Land:");

        jButtonSletGaest.setText("Slet Gæst");
        jButtonSletGaest.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSletGaestActionPerformed(evt);
            }
        });

        jLabel45.setText("Gæst ID:");

        jButton1.setText("Hent Gæst");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(724, 2292, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addComponent(jDateChooserCheckind1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel44)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel45))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldEfternavnRSG, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(jTextFieldLandRSG, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(jTextFieldFornavnRSG, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(jTextfieldBynavnRSG, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(jTextfieldVejnavnRSG, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(jTextFieldGaestID))))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(290, 290, 290)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel43)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel36)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel40))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateChooserCheckud1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabelGaestSlettet)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldEmailRSG, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                            .addComponent(jTextFieldTelefonnummerRSG, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                            .addComponent(jTextfieldRejsebureauRSG, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                            .addComponent(jTextfieldPostnummerRSG, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                            .addComponent(jTextfieldVejnummerRSG, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))))
                            .addComponent(jLabel31)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addGap(48, 48, 48)
                                .addComponent(jTextFieldLejlighedsIDRSG, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1501, 1501, 1501))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabelHentGaest)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabelInfo2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(734, 734, 734))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabelGaestRedigeret)
                                .addGap(218, 218, 218)
                                .addComponent(jButtonRedigerGaest)
                                .addGap(68, 68, 68)
                                .addComponent(jButtonSletGaest)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooserCheckind1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooserCheckud1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel31)
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel45)
                        .addComponent(jTextFieldGaestID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldLejlighedsIDRSG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel30)))
                .addGap(52, 52, 52)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFornavnRSG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(jTextFieldEmailRSG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEfternavnRSG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(jTextFieldTelefonnummerRSG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLandRSG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44)
                    .addComponent(jTextfieldRejsebureauRSG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addGap(26, 26, 26)
                .addComponent(jLabel37)
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextfieldBynavnRSG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextfieldPostnummerRSG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)
                    .addComponent(jLabel34))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextfieldVejnavnRSG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextfieldVejnummerRSG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelInfo2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonRedigerGaest)
                            .addComponent(jButtonSletGaest)
                            .addComponent(jLabelHentGaest)
                            .addComponent(jLabelGaestRedigeret))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabelGaestSlettet)
                        .addGap(46, 46, 46))))
        );

        jTabbedPane1.addTab("Redigering / Sletning af Gæst", jPanel5);

        jLabel15.setText("E-mail:");

        jLabel16.setText("Telefonnummer:");

        jLabel17.setText("Land:");

        jLabel18.setText("Vejnummer:");

        jLabel19.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel19.setText("Adresse:");

        jLabel20.setText("Rejsebureau:");

        jLabel21.setText("Bynavn:");

        jLabel22.setText("Vejnavn:");

        jLabel23.setText("Postnummer:");

        jTextFieldFornavn1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldFornavn1ActionPerformed(evt);
            }
        });

        jLabel24.setText("Efternavn:");

        jLabel25.setText("Fornavn:");

        jLabel26.setText("Lejligheds ID: ");

        jLabel27.setText("Tilknyt Gæst til en Lejlighed");

        jLabel28.setText("Check Iind:");

        jLabel29.setText("Check Ud:");

        jButtonOpretGæst.setText("Opret Gæst");
        jButtonOpretGæst.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonOpretGæstActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel28)
                            .addGap(35, 35, 35)
                            .addComponent(jDateChooserCheckind, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel25)
                                .addComponent(jLabel24)
                                .addComponent(jLabel17)
                                .addComponent(jLabel21)
                                .addComponent(jLabel22))
                            .addGap(38, 38, 38)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldEfternavn1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                .addComponent(jTextFieldLand1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                .addComponent(jTextFieldFornavn1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                .addComponent(jTextfieldBynavn1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                .addComponent(jTextfieldVejnavn1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                .addComponent(jTextFieldLejlighedsID))))
                    .addComponent(jLabel26)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabelInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel19)
                    .addComponent(jLabel27))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelGæstoprettetinfo)
                        .addGap(231, 231, 231))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(435, 435, 435)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel20)
                            .addComponent(jLabel23)
                            .addComponent(jLabel18)
                            .addComponent(jLabel29))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooserCheckud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldEmail1)
                            .addComponent(jTextFieldTelefonnummer1)
                            .addComponent(jTextfieldRejsebureau1)
                            .addComponent(jTextfieldPostnummer1)
                            .addComponent(jTextfieldVejnummer1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(415, 415, 415)
                .addComponent(jButtonOpretGæst)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooserCheckind, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel26)
                            .addComponent(jTextFieldLejlighedsID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldFornavn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEfternavn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldLand1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel19)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextfieldBynavn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextfieldVejnavn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooserCheckud, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(124, 124, 124)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldTelefonnummer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextfieldRejsebureau1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextfieldPostnummer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextfieldVejnummer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOpretGæst)
                    .addComponent(jLabelGæstoprettetinfo))
                .addGap(33, 33, 33))
        );

        jTabbedPane1.addTab("Tilføjelse af Gæst", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldFornavnRSGActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextFieldFornavnRSGActionPerformed
    {//GEN-HEADEREND:event_jTextFieldFornavnRSGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFornavnRSGActionPerformed

    private void jButtonHentOversigtActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonHentOversigtActionPerformed
    {//GEN-HEADEREND:event_jButtonHentOversigtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonHentOversigtActionPerformed

    private void jButtonCheckudsigtActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonCheckudsigtActionPerformed
    {//GEN-HEADEREND:event_jButtonCheckudsigtActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        Date x = jDateChooser1.getDate();
        Date y = jDateChooser2.getDate();

        String xFormat = format.format(x);
        String yFormat = format.format(y);

        jLabel14.setText(Integer.toString(c.getRoomsList(xFormat, yFormat, roomTypeChoosen)));
    }//GEN-LAST:event_jButtonCheckudsigtActionPerformed

    private void jButtonBekræftBookingActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonBekræftBookingActionPerformed
    {//GEN-HEADEREND:event_jButtonBekræftBookingActionPerformed
        int tlfno = Integer.parseInt(jTextFieldTelefonnummer.getText());
        int vno = Integer.parseInt(jTextfieldVejnummer.getText());
        int pno = Integer.parseInt(jTextfieldPostnummer.getText());
        //     jTextFieldFornavn.getText();
        //     jTextFieldEfternavn.getText();
        //     jTextFieldLand.getText();
        //     jTextFieldEmail.getText();
        //     jTextfieldAntalnætter.getText();

        Gaest status = c.createNewBooking(count, jTextFieldFornavn.getText(), jTextFieldEfternavn.getText(), tlfno, jTextFieldEmail.getText(), jTextfieldVejnavn.getText(), vno, pno, jTextfieldBynavn.getText(), jTextFieldLand.getText(), jTextfieldRejsebureau.getText());
        jLabelInfo.setText("Gæst Oprettet!");
    }//GEN-LAST:event_jButtonBekræftBookingActionPerformed

    private void DobbeltRumBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_DobbeltRumBtnActionPerformed
    {//GEN-HEADEREND:event_DobbeltRumBtnActionPerformed
        roomTypeChoosen = "DOBBELT";
    }//GEN-LAST:event_DobbeltRumBtnActionPerformed

    private void FamilieRumBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_FamilieRumBtnActionPerformed
    {//GEN-HEADEREND:event_FamilieRumBtnActionPerformed
        roomTypeChoosen = "FAMILIE";
    }//GEN-LAST:event_FamilieRumBtnActionPerformed

    private void SingleRumBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SingleRumBtnActionPerformed
    {//GEN-HEADEREND:event_SingleRumBtnActionPerformed
        roomTypeChoosen = "SINGLE";
    }//GEN-LAST:event_SingleRumBtnActionPerformed

    private void jTextFieldFornavnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextFieldFornavnActionPerformed
    {//GEN-HEADEREND:event_jTextFieldFornavnActionPerformed
        // FEJL - SKAL SLETTES HVIS DET KAN LADE SIG GØRE!
    }//GEN-LAST:event_jTextFieldFornavnActionPerformed

    private void jButtonGetGuestListActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonGetGuestListActionPerformed
    {//GEN-HEADEREND:event_jButtonGetGuestListActionPerformed

        jLabelInfoOversigt.setText("Oversigt hentet!");
        DefaultTableModel Gaesteliste = (DefaultTableModel) GaesteListen.getModel();
        List<Gaest> gaesteListe = c.getGaesteListe();
        for (Gaest g : gaesteListe)
        {
            Gaesteliste.addRow(new Object[]
            {
                g.getGaestid(),
                g.getFornavn(),
                g.getEfternavn(),
                g.getTelefonnummer(),
                g.getEmail(),
                g.getVejnavn(),
                g.getVejnummer(),
                g.getPostnummer(),
                g.getBynavn(),
                g.getLand(),
                g.getRejsebureau()
            });

        }

    }//GEN-LAST:event_jButtonGetGuestListActionPerformed

    private void jButtonRedigerGaestActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonRedigerGaestActionPerformed
    {//GEN-HEADEREND:event_jButtonRedigerGaestActionPerformed
       int tlfno = Integer.parseInt(jTextFieldTelefonnummerRSG.getText());
        int vno = Integer.parseInt(jTextfieldVejnummerRSG.getText());
        int pno = Integer.parseInt(jTextfieldPostnummerRSG.getText());
        int giid = Integer.parseInt(jTextFieldGaestID.getText());
        boolean status = c.UpdateGaest(giid,jTextFieldFornavnRSG.getText(), jTextFieldEfternavnRSG.getText(), tlfno, jTextFieldEmailRSG.getText(), jTextfieldVejnavnRSG.getText(), vno, pno, jTextfieldBynavnRSG.getText(), jTextFieldLandRSG.getText(), jTextfieldRejsebureauRSG.getText());
        jLabelGaestRedigeret.setText("Gæst opdateret!");
    }//GEN-LAST:event_jButtonRedigerGaestActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        int gid = Integer.parseInt(jTextFieldGaestID.getText());
        Gaest giid = c.GetGaest(gid);
        if (giid != null)
        {
            jTextFieldFornavnRSG.setText(giid.getFornavn());
            jTextFieldEfternavnRSG.setText(giid.getEfternavn());
            jTextFieldEmailRSG.setText(giid.getEmail());
            jTextFieldLandRSG.setText(giid.getLand());
            jTextFieldTelefonnummerRSG.setText(giid.getTelefonnummer()+"");
            jTextfieldBynavnRSG.setText(giid.getBynavn());
            jTextfieldPostnummerRSG.setText(giid.getPostnummer()+"");
            jTextfieldRejsebureauRSG.setText(giid.getRejsebureau());
            jTextfieldVejnavnRSG.setText(giid.getVejnavn());
            jTextfieldVejnummerRSG.setText(giid.getVejnummer()+"");   
        }
        else 
            jLabelHentGaest.setText("Ingen Gæst med dette ID er fundet");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonOpretGæstActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonOpretGæstActionPerformed
    {//GEN-HEADEREND:event_jButtonOpretGæstActionPerformed
        int tlfno = Integer.parseInt(jTextFieldTelefonnummer1.getText());
        int vno = Integer.parseInt(jTextfieldVejnummer1.getText());
        int pno = Integer.parseInt(jTextfieldPostnummer1.getText());
        //     jTextFieldFornavn.getText();
        //     jTextFieldEfternavn.getText();
        //     jTextFieldLand.getText();
        //     jTextFieldEmail.getText();
        //     jTextfieldAntalnætter.getText();

        Gaest status = c.createNewGaest(count, jTextFieldFornavn1.getText(), jTextFieldEfternavn1.getText(), tlfno, jTextFieldEmail1.getText(), jTextfieldVejnavn1.getText(), vno, pno, jTextfieldBynavn1.getText(), jTextFieldLand1.getText(), jTextfieldRejsebureau1.getText());
        jLabelGæstoprettetinfo.setText("Gæst Oprettet!");
    }//GEN-LAST:event_jButtonOpretGæstActionPerformed

    private void jTextFieldFornavn1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextFieldFornavn1ActionPerformed
    {//GEN-HEADEREND:event_jTextFieldFornavn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFornavn1ActionPerformed

    private void jButtonSletGaestActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonSletGaestActionPerformed
    {//GEN-HEADEREND:event_jButtonSletGaestActionPerformed
        int tlfno = Integer.parseInt(jTextFieldTelefonnummerRSG.getText());
        int vno = Integer.parseInt(jTextfieldVejnummerRSG.getText());
        int pno = Integer.parseInt(jTextfieldPostnummerRSG.getText());
        int giid = Integer.parseInt(jTextFieldGaestID.getText());
        Gaest status = c.SletGaest(giid,jTextFieldFornavnRSG.getText(), jTextFieldEfternavnRSG.getText(), tlfno, jTextFieldEmailRSG.getText(), jTextfieldVejnavnRSG.getText(), vno, pno, jTextfieldBynavnRSG.getText(), jTextFieldLandRSG.getText(), jTextfieldRejsebureauRSG.getText());
        jLabelGaestSlettet.setText("Gæst Slettet!");
    }//GEN-LAST:event_jButtonSletGaestActionPerformed

    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(GUIMedarbejder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(GUIMedarbejder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(GUIMedarbejder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(GUIMedarbejder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new GUIMedarbejder().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton DobbeltRumBtn;
    private javax.swing.JRadioButton FamilieRumBtn;
    private javax.swing.JTable GaesteListen;
    private javax.swing.JRadioButton SingleRumBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBekræftBooking;
    private javax.swing.JButton jButtonCheckudsigt;
    private javax.swing.JButton jButtonGetGuestList;
    private javax.swing.JButton jButtonHentOversigt;
    private javax.swing.JButton jButtonOpretGæst;
    private javax.swing.JButton jButtonRedigerGaest;
    private javax.swing.JButton jButtonSletGaest;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooserCheckind;
    private com.toedter.calendar.JDateChooser jDateChooserCheckind1;
    private com.toedter.calendar.JDateChooser jDateChooserCheckud;
    private com.toedter.calendar.JDateChooser jDateChooserCheckud1;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelGaestRedigeret;
    private javax.swing.JLabel jLabelGaestSlettet;
    private javax.swing.JLabel jLabelGæstoprettetinfo;
    private javax.swing.JLabel jLabelHentGaest;
    private javax.swing.JLabel jLabelInfo;
    private javax.swing.JLabel jLabelInfo1;
    private javax.swing.JLabel jLabelInfo2;
    private javax.swing.JLabel jLabelInfoOversigt;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextFieldEfternavn;
    private javax.swing.JTextField jTextFieldEfternavn1;
    private javax.swing.JTextField jTextFieldEfternavnRSG;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEmail1;
    private javax.swing.JTextField jTextFieldEmailRSG;
    private javax.swing.JTextField jTextFieldFornavn;
    private javax.swing.JTextField jTextFieldFornavn1;
    private javax.swing.JTextField jTextFieldFornavnRSG;
    private javax.swing.JTextField jTextFieldGaestID;
    private javax.swing.JTextField jTextFieldLand;
    private javax.swing.JTextField jTextFieldLand1;
    private javax.swing.JTextField jTextFieldLandRSG;
    private javax.swing.JTextField jTextFieldLejlighedsID;
    private javax.swing.JTextField jTextFieldLejlighedsIDRSG;
    private javax.swing.JTextField jTextFieldTelefonnummer;
    private javax.swing.JTextField jTextFieldTelefonnummer1;
    private javax.swing.JTextField jTextFieldTelefonnummerRSG;
    private javax.swing.JTextField jTextfieldBynavn;
    private javax.swing.JTextField jTextfieldBynavn1;
    private javax.swing.JTextField jTextfieldBynavnRSG;
    private javax.swing.JTextField jTextfieldPostnummer;
    private javax.swing.JTextField jTextfieldPostnummer1;
    private javax.swing.JTextField jTextfieldPostnummerRSG;
    private javax.swing.JTextField jTextfieldRejsebureau;
    private javax.swing.JTextField jTextfieldRejsebureau1;
    private javax.swing.JTextField jTextfieldRejsebureauRSG;
    private javax.swing.JTextField jTextfieldVejnavn;
    private javax.swing.JTextField jTextfieldVejnavn1;
    private javax.swing.JTextField jTextfieldVejnavnRSG;
    private javax.swing.JTextField jTextfieldVejnummer;
    private javax.swing.JTextField jTextfieldVejnummer1;
    private javax.swing.JTextField jTextfieldVejnummerRSG;
    // End of variables declaration//GEN-END:variables
}
