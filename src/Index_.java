
import com.redone.modelos.HotspotUser;
import examples.ImpresionFichas;

import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;
import modelos.PerfilHotspotUser;
import org.xhtmlrenderer.pdf.ITextRenderer;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Elliot
 */
public class Index_ extends javax.swing.JFrame {

    leerArchivo leerArchivo = new leerArchivo();
    MetodosMikrotik metodos = new MetodosMikrotik();
    DefaultTableModel dtm = new DefaultTableModel();

    public Index_() {
        initComponents();
        hablitarUISP();
        spTotalFichas.setValue(10);
        spSharedUsers.setValue(1);
        leerPerfilesConexion();
        leerUsuariosHotspot();
        this.setLocationRelativeTo(null);
        lblImage.getIcon().getClass().getResource("");
        generarPDF("", "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Hotspot = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPerfiles = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        addProfile = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtIdleTimeout = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtKeepAliveTimeout = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtStatusAutorefresh = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        txtMacCookieTimeout = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtRate = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        spSharedUsers = new javax.swing.JSpinner();
        btnCrearPerfil = new javax.swing.JButton();
        jMenuItem5 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsersHotspot = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtTotFichas = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        spTotalFichas = new javax.swing.JSpinner();
        cbPerfiles = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        tbPerfiles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbPerfiles);

        jButton3.setText("crear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("eliminar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");

        jButton6.setText("Salir");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton6))
                    .addComponent(jTextField1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton6)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Perfiles de conexion", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Usuarios ficha", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Fichas activas", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Usuarios directos", jPanel5);

        javax.swing.GroupLayout HotspotLayout = new javax.swing.GroupLayout(Hotspot.getContentPane());
        Hotspot.getContentPane().setLayout(HotspotLayout);
        HotspotLayout.setHorizontalGroup(
            HotspotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        HotspotLayout.setVerticalGroup(
            HotspotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos perfil conexion"));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Nombre :");

        jLabel6.setText("Tiempo inactividad :");

        txtIdleTimeout.setText("00:00:00");
        txtIdleTimeout.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdleTimeoutKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdleTimeoutKeyTyped(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Tiempo de conexion :");

        txtKeepAliveTimeout.setText("00:00:00");
        txtKeepAliveTimeout.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKeepAliveTimeoutKeyTyped(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Actualizacion cada:");

        txtStatusAutorefresh.setText("00:00:00");
        txtStatusAutorefresh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStatusAutorefreshKeyTyped(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Guardar mac:");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Tiempo guardar mac:");

        txtMacCookieTimeout.setText("00:00:00");
        txtMacCookieTimeout.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMacCookieTimeoutKeyTyped(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Velocidad navegacion:");

        txtRate.setText("512k/512k");
        txtRate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRateKeyTyped(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Usuarios compartidos:");

        btnCrearPerfil.setText("Crear");
        btnCrearPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPerfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(spSharedUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtKeepAliveTimeout, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                .addComponent(txtIdleTimeout, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtRate, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStatusAutorefresh)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnCrearPerfil)
                                    .addComponent(txtMacCookieTimeout, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(85, 85, 85))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdleTimeout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKeepAliveTimeout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStatusAutorefresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtMacCookieTimeout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spSharedUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCrearPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout addProfileLayout = new javax.swing.GroupLayout(addProfile.getContentPane());
        addProfile.getContentPane().setLayout(addProfileLayout);
        addProfileLayout.setHorizontalGroup(
            addProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
        );
        addProfileLayout.setVerticalGroup(
            addProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/wifi.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CREACION DE FICHAS");

        jTableUsersHotspot.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableUsersHotspot);

        jButton1.setText("Salir");

        txtTotFichas.setBackground(new java.awt.Color(0, 102, 102));
        txtTotFichas.setForeground(new java.awt.Color(255, 255, 255));
        txtTotFichas.setText("200");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Total fichas:");

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Perfil");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total ");

        jButton2.setText("Crear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbPerfiles, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spTotalFichas)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPerfiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spTotalFichas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jButton2))
        );

        jButton4.setText("Editar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotFichas))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblImage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotFichas)
                            .addComponent(jLabel14)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenu2.setText("Hotspot");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });

        jMenuItem6.setText("Administrar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            JDialog dialogov = new JDialog(addProfile, "CREAR PERFIL", true);
            dialogov.add(addProfile.getContentPane());
            dialogov.setSize(323, 396);
            dialogov.setLocationRelativeTo(null);
            dialogov.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL CREAR PERFIL", "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked

    }//GEN-LAST:event_jMenu2MouseClicked

    private void btnCrearPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPerfilActionPerformed

        try {
            int op = JOptionPane.showConfirmDialog(null, "¿Guardar perfil?");
            if (op == JOptionPane.YES_OPTION) {
                PerfilHotspotUser profile = new PerfilHotspotUser();
                profile.setName(txtName.getText().toLowerCase());
                profile.setIdle_timeout(txtIdleTimeout.getText().toLowerCase());
                profile.setKeepalive_timeout(txtKeepAliveTimeout.getText().toLowerCase());
                if (jCheckBox1.isSelected()) {
                    profile.setAdd_mac_cookie(true);
                } else {
                    profile.setAdd_mac_cookie(false);
                }
                profile.setMac_cookie_timeout(txtMacCookieTimeout.getText().toLowerCase());
                profile.setShared_users(Integer.parseInt(spSharedUsers.getValue().toString()));
                profile.setRate_limit(txtRate.getText().toLowerCase());

                profile.setStatus_autorefresh(txtStatusAutorefresh.getText().toLowerCase());
                List<Map<String, String>> results = metodos.crearPerfilHotspot(profile);
            }
        } catch (Exception e) {
            System.out.println("Error al crear perfil:" + e.getMessage());
        }

        leerPerfiles();
    }//GEN-LAST:event_btnCrearPerfilActionPerformed

    private void txtIdleTimeoutKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdleTimeoutKeyPressed

    }//GEN-LAST:event_txtIdleTimeoutKeyPressed

    private void txtIdleTimeoutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdleTimeoutKeyTyped
        leerEntradas(evt);
    }//GEN-LAST:event_txtIdleTimeoutKeyTyped

    private void txtKeepAliveTimeoutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKeepAliveTimeoutKeyTyped
        leerEntradas(evt);
    }//GEN-LAST:event_txtKeepAliveTimeoutKeyTyped

    private void txtStatusAutorefreshKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStatusAutorefreshKeyTyped
        leerEntradas(evt);
    }//GEN-LAST:event_txtStatusAutorefreshKeyTyped

    private void txtMacCookieTimeoutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMacCookieTimeoutKeyTyped
        leerEntradas(evt);
    }//GEN-LAST:event_txtMacCookieTimeoutKeyTyped

    private void txtRateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRateKeyTyped
        char[] p = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '/', 'k', 'm', 'g', 'K', 'M', 'G'};
        int b = 0;
        boolean bandera = false;
        for (int i = 0; i <= 15; i++) {
            if (evt.getKeyChar() == p[i]) {
                bandera = true;
            }
        }

        if (!bandera) {
            evt.consume();
        }
    }//GEN-LAST:event_txtRateKeyTyped

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        leerPerfiles();
        try {
            Hotspot.setSize(469, 365);
            Hotspot.setTitle("Hotspot Controller");
            Hotspot.setLocationRelativeTo(null);
            Hotspot.setModal(true);
            Hotspot.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL INTENTAR CONTROLAR MIKROTIK", "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int fila = tbPerfiles.getSelectedRow();
        try {
            int op = JOptionPane.showConfirmDialog(null, "¿Eliminar perfil?");
            if (op == JOptionPane.YES_NO_OPTION) {
                metodos.eliminarPerfilHotspot(Integer.parseInt(tbPerfiles.getValueAt(fila, 0).toString()));

            }
        } catch (Exception e) {
            System.out.println("Error al eliminar perfil:" + e.getMessage());
        }

        leerPerfiles();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        List<HotspotUser> lista = metodos.crearHotspotUsuariosFicha(Integer.parseInt(spTotalFichas.getValue().toString()), cbPerfiles.getSelectedItem().toString());
        ImpresionFichas impr = new ImpresionFichas(lista, (ImageIcon) lblImage.getIcon());
        JDialog jdialog = new JDialog(impr, "GESTION DE FICHAS CREADAS", true);
        jdialog.setSize(600, 520);
        jdialog.setModal(true);
        jdialog.setContentPane(impr.getContentPane());
        jdialog.setLocationRelativeTo(null);
        jdialog.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    public void leerPerfilesConexion() {
        List<Map<String, String>> perfiles = metodos.leerHotspotPerfiles();
        for (Map<String, String> result : perfiles) {
            cbPerfiles.addItem(result.get("name"));
        }
    }

    public void hablitarUISP() {
        ((JSpinner.DefaultEditor) spTotalFichas.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) spTotalFichas.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) spTotalFichas.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) spSharedUsers.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) spSharedUsers.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) spSharedUsers.getEditor()).getTextField().setEditable(false);
    }

    public void leerEntradas(KeyEvent evt) {
        char[] p = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', ':', 'd'};
        int b = 0;
        boolean bandera = false;
        for (int i = 0; i <= 11; i++) {
            if (evt.getKeyChar() == p[i]) {
                bandera = true;
            }
        }

        if (!bandera) {
            evt.consume();
        }
    }

    public void leerPerfiles() {
        DefaultTableModel dtm1 = new DefaultTableModel();
        List<Map<String, String>> perfiles = metodos.leerHotspotPerfiles();
        String titulos[] = {"No.Perfil", "Nombre perfil", "Tiempo de conexion"};
        dtm1.setColumnIdentifiers(titulos);
        int j = 0;
        for (Map<String, String> result : perfiles) {
            Object[] fila = new Object[result.size()];
            fila[0] = j++;
            fila[1] = result.get("name");
            fila[2] = result.get("keepalive-timeout");;
            dtm1.addRow(fila);
        }
        tbPerfiles.setModel(dtm1);
    }

    public void leerUsuariosHotspot() {
        DefaultTableModel dtm2 = new DefaultTableModel();
        List<Map<String, String>> usuarios = metodos.leerHotspotUsuarios();
        String titulos[] = {"Numero", "Servidor", "Nombre usuario", "Perfil de conexion"};
        dtm2.setColumnIdentifiers(titulos);
        int j = 0;
        for (Map<String, String> result : usuarios) {
            Object[] fila = new Object[result.size()];
            fila[0] = j++;
            if (result.get("server") != null) {
                fila[1] = result.get("server");
            } else {
                fila[1] = "all";
            }
            fila[2] = result.get("name");
            fila[3] = result.get("profile");
            dtm2.addRow(fila);
        }
        jTableUsersHotspot.setModel(dtm2);
        txtTotFichas.setText(String.valueOf(dtm2.getRowCount()));
    }

    public File generarPDF(String ruta_imagen, String perfil) {
        File file = null;
        try {
            //leemos el html que contiene la estructura del pdf
            String ruta = getClass().getResource("/files/").toString().replace("/", "\\").replace("file:", "");
            File fileHtml = new File(ruta + "fichas.html");
            FileReader frHtml = new FileReader(fileHtml);
            BufferedReader brHtml = new BufferedReader(frHtml);

            //Creamos el nuevo arichivo para convertirlo a pdf
            File fileHTMLPDF = new File(ruta + "HtmlToPDF.html");
            if (!fileHTMLPDF.exists()) {
                fileHTMLPDF.createNewFile();
            }
            FileWriter fw = new FileWriter(fileHTMLPDF);
            BufferedWriter bw = new BufferedWriter(fw);

            String linea;
            String contenidoPrincipal = "";
            String contenidoTr = "";
            String contenido_td = "";
            String c = "";
            String contenido_replace = "<table cellpadding=\"0px\" cellspacing=\"0px\" border=\"1\">";
            while ((linea = brHtml.readLine()) != null) {
                contenidoPrincipal = contenidoPrincipal + linea + "\n";
            }
            for (int i = 0; i < 20; i++) {
                contenidoTr = "";
                contenido_td = "";
                for (int x = 0; x < 8; x++) {
                    contenido_td = contenido_td + "<td>" + perfil + "<br>username:" + x + "<br>password:" + x + "</td>";
                }
                contenidoTr = "<tr>" + contenido_td + "</tr>";
                c = c + contenidoTr;
            }
            contenido_replace = contenido_replace + c;
            contenido_replace = "<br>" + contenido_replace + "</table>";
            bw.write(contenidoPrincipal.replace("@table@", contenido_replace));
            bw.close();

            String ficheroHTML = "C:\\Users\\Elliot\\Documents\\NetBeansProjects\\ApiMikrotik\\build\\classes\\files\\fichas1.html";
            //String url = new File(ficheroHTML).toURI().toURL().toString();
            String ficheroPDF = ruta+"plantilla.pdf";
            OutputStream os = new FileOutputStream(ficheroPDF);
            ITextRenderer renderer = new ITextRenderer();
            renderer.setDocumentFromString("<html><body><strong>Hello</strong> <em>world</em>!</body></html>");
            renderer.layout();
            renderer.createPDF(os);
            os.close();

        } catch (Exception e) {
            System.out.println("Error al leer archio:" + e.getMessage());
        }
        return file;
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Index_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index_().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Hotspot;
    private javax.swing.JDialog addProfile;
    private javax.swing.JButton btnCrearPerfil;
    private javax.swing.JComboBox<String> cbPerfiles;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableUsersHotspot;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JSpinner spSharedUsers;
    private javax.swing.JSpinner spTotalFichas;
    private javax.swing.JTable tbPerfiles;
    private javax.swing.JTextField txtIdleTimeout;
    private javax.swing.JTextField txtKeepAliveTimeout;
    private javax.swing.JTextField txtMacCookieTimeout;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRate;
    private javax.swing.JTextField txtStatusAutorefresh;
    private javax.swing.JLabel txtTotFichas;
    // End of variables declaration//GEN-END:variables
}
