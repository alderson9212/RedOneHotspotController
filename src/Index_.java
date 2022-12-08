
import util.leerArchivo;
import util.MetodosMikrotik;
import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import modelos.HotspotUser;
import ImpresionFichas.Visual;
import jTableDiseño.GestionEncabezadoTabla;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import modelos.IpBinding;
import modelos.PerfilHotspotUser;
import org.apache.commons.io.FileUtils;
import util.MetodosValidar;


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
        //leerPerfilesTable();
        leerUsuariosHotspot("");
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Hotspot = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbPerfiles = new javax.swing.JTable();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        txtPerfilSearch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        totProfiles = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbActives = new javax.swing.JTable();
        jButton17 = new javax.swing.JButton();
        txtActivosSearch = new javax.swing.JTextField();
        jButton20 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        totActivos = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbBindings = new javax.swing.JTable();
        txtBindingSearch = new javax.swing.JTextField();
        jButton19 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
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
        JDialogIpBindings = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtMacAddres = new javax.swing.JTextField();
        cbServer = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        cbType = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        txtComment = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsersHotspot = new javax.swing.JTable();
        txtTotFichas = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        spTotalFichas = new javax.swing.JSpinner();
        cbPerfiles = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        cbPerfilesBusqueda = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbPerfiles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tbPerfiles);

        jButton13.setText("Crear");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("Borrar");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Total activos :");

        totProfiles.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jButton13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton14))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(txtPerfilSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totProfiles, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPerfilSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totProfiles, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13)
                    .addComponent(jButton14))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("User Profile", jPanel2);

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbActives.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(tbActives);

        jButton17.setText("Buscar");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton20.setText("Borrar");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Total activos :");

        totActivos.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(txtActivosSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton17))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton20)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtActivosSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totActivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton20)
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Active", jPanel4);

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbBindings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tbBindings);

        jButton19.setText("Buscar");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txtBindingSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBindingSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        jButton10.setText("Añadir");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Borrar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton16.setText("Desabilitar");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton16)
                .addContainerGap(264, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(299, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton11)
                    .addComponent(jButton16))
                .addGap(39, 39, 39))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(19, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jTabbedPane1.addTab("IP Bindings", jPanel5);

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
        jLabel5.setText("Name:");

        jLabel6.setText("Iddle Timeout:");

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
        jLabel7.setText("Keelalive Timeout:");

        txtKeepAliveTimeout.setText("00:00:00");
        txtKeepAliveTimeout.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKeepAliveTimeoutKeyTyped(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Status Autorefresh:");

        txtStatusAutorefresh.setText("00:00:00");
        txtStatusAutorefresh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStatusAutorefreshKeyTyped(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("ad MAC Cookie:");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("MAC Cookie Timeout:");

        txtMacCookieTimeout.setText("00:00:00");
        txtMacCookieTimeout.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMacCookieTimeoutKeyTyped(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Rate Limit (rx/tx):");

        txtRate.setText("512k/512k");
        txtRate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRateKeyTyped(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Shared Users:");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRate, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCrearPerfil)
                    .addComponent(jCheckBox1)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtStatusAutorefresh, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtKeepAliveTimeout, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtIdleTimeout, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(spSharedUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97))
                            .addComponent(txtMacCookieTimeout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btnCrearPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout addProfileLayout = new javax.swing.GroupLayout(addProfile.getContentPane());
        addProfile.getContentPane().setLayout(addProfileLayout);
        addProfileLayout.setHorizontalGroup(
            addProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addProfileLayout.setVerticalGroup(
            addProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuItem5.setText("jMenuItem5");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel16.setText("MAC Address :");

        jLabel17.setText("Server :");

        cbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "bypassed", "regular", "blocked" }));

        jLabel18.setText("Type :");

        btnAdd.setText("Añadir");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel19.setText("Comment :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAdd))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtComment, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbServer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMacAddres)
                            .addComponent(cbType, 0, 131, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMacAddres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdd)
                .addContainerGap())
        );

        javax.swing.GroupLayout JDialogIpBindingsLayout = new javax.swing.GroupLayout(JDialogIpBindings.getContentPane());
        JDialogIpBindings.getContentPane().setLayout(JDialogIpBindingsLayout);
        JDialogIpBindingsLayout.setHorizontalGroup(
            JDialogIpBindingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDialogIpBindingsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        JDialogIpBindingsLayout.setVerticalGroup(
            JDialogIpBindingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDialogIpBindingsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/white.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CREACION DE FICHAS");

        jTableUsersHotspot.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(jTableUsersHotspot);

        txtTotFichas.setBackground(new java.awt.Color(0, 102, 102));
        txtTotFichas.setForeground(new java.awt.Color(255, 255, 255));
        txtTotFichas.setText("200");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Total fichas:");

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        spTotalFichas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                spTotalFichasKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                spTotalFichasKeyTyped(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Perfil");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total ");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-imprimir-30.png"))); // NOI18N
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jButton4.setText("Editar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        cbPerfilesBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPerfilesBusquedaActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Perfil :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 941, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbPerfilesBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotFichas)
                                .addGap(6, 6, 6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(8, 8, 8))))
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotFichas)
                    .addComponent(jLabel14)
                    .addComponent(cbPerfilesBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/procesos.png"))); // NOI18N
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

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

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

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked

    }//GEN-LAST:event_jMenu2MouseClicked

    private void btnCrearPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPerfilActionPerformed

        try {
            int op = JOptionPane.showConfirmDialog(null, "¿Guardar perfil?", "", JOptionPane.YES_NO_OPTION);
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
                leerPerfilesConexion();
                leerPerfiles("");

            }
        } catch (Exception e) {
            System.out.println("Error al crear perfil:" + e.getMessage());
        }


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
        leerPerfiles("");
        leerUsuariosActivos("");
        leerIpBindings("");
        try {
            Hotspot.setSize(520, 405);
            Hotspot.setTitle("Hotspot Controller");
            Hotspot.setLocationRelativeTo(null);
            Hotspot.setModal(true);
            Hotspot.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL INTENTAR CONTROLAR MIKROTIK", "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        List<HotspotUser> lista = metodos.crearHotspotUsuariosFicha(Integer.parseInt(spTotalFichas.getValue().toString()), cbPerfiles.getSelectedItem().toString());
        Visual visual = new Visual(generarHTML(lista));
        visual.setVisible(true);
        /*JDialog jdialog = new JDialog(visual, "GESTION DE FICHAS CREADAS", true);
        jdialog.setSize(600, 520);
        jdialog.setModal(true);
        jdialog.setContentPane(visual.getContentPane());
        jdialog.setLocationRelativeTo(null);
        jdialog.setUndecorated(true);
        jdialog.setVisible(true);*/


    }//GEN-LAST:event_jButton2ActionPerformed

    private void spTotalFichasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spTotalFichasKeyTyped
        new MetodosValidar().soloNumeros(((JSpinner.DefaultEditor) spTotalFichas.getEditor()).getTextField(), 4);
    }//GEN-LAST:event_spTotalFichasKeyTyped

    private void spTotalFichasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spTotalFichasKeyPressed
        new MetodosValidar().soloNumeros(((JSpinner.DefaultEditor) spTotalFichas.getEditor()).getTextField(), 4);
    }//GEN-LAST:event_spTotalFichasKeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JFileChooser guardar = new JFileChooser();
        guardar.setApproveButtonText("Guardar");
        guardar.showSaveDialog(null);
        String ruta = guardar.getSelectedFile().getPath();
        ImageIcon image = new ImageIcon(ruta);
        lblImage.setIcon(image);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cbPerfilesBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPerfilesBusquedaActionPerformed
        leerUsuariosHotspot(cbPerfilesBusqueda.getSelectedItem().toString().trim());
    }//GEN-LAST:event_cbPerfilesBusquedaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        llenarComboServers();
        JDialog dialogo = new JDialog(JDialogIpBindings, "Add Ip Biniding", true);
        dialogo.setSize(250, 229);
        dialogo.setContentPane(JDialogIpBindings.getContentPane());
        dialogo.setModal(true);
        dialogo.setLocationRelativeTo(null);
        dialogo.setVisible(true);


    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        int filaSeleccionada = tbBindings.getSelectedRow();
        if (filaSeleccionada >= 0) {
            new MetodosMikrotik().eliminarBindings(tbBindings.getValueAt(filaSeleccionada, 0).toString());
        }
        leerIpBindings("");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        JDialog dialog = new JDialog(addProfile, "Fichas", true);
        dialog.setSize(329, 387);
        dialog.setContentPane(addProfile.getContentPane());
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        dialog.setModal(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        int filaSeleccionada = tbPerfiles.getSelectedRow();
        if (filaSeleccionada >= 0) {
            new MetodosMikrotik().eliminarPerfilHotspot(tbPerfiles.getValueAt(filaSeleccionada, 0).toString());
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        leerUsuariosActivos(txtActivosSearch.getText());
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        leerIpBindings(txtBindingSearch.getText());
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        leerPerfiles(txtPerfilSearch.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            int op = JOptionPane.showConfirmDialog(null, "¿Guardar MAC?", "", JOptionPane.YES_NO_OPTION);
            if (op == JOptionPane.YES_OPTION) {
                IpBinding binding = new IpBinding();
                binding.setMac(txtMacAddres.getText());
                binding.setServer(cbServer.getSelectedItem().toString());
                binding.setType(cbType.getSelectedItem().toString());
                binding.setComment(txtComment.getText());

                List<Map<String, String>> results = metodos.crearIpBindingHotspot(binding);
            }
        } catch (Exception e) {
            System.out.println("Error al añadir mac:" + e.getMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        int filaSeleccionada = tbBindings.getSelectedRow();
        if (filaSeleccionada >= 0) {
            if (!tbBindings.getValueAt(filaSeleccionada, 4).toString().equals("true")) {
                new MetodosMikrotik().deasbilitarBindings(tbBindings.getValueAt(filaSeleccionada, 0).toString());
            } else {
                JOptionPane.showMessageDialog(null, "La MAC ya esta desabilidata", "", JOptionPane.WARNING_MESSAGE);
            }
        }
        leerIpBindings("");
    }//GEN-LAST:event_jButton16ActionPerformed

    public void leerPerfilesConexion() {
        if (cbPerfiles.getItemCount() > 0) {
            cbPerfiles.removeAllItems();
            cbPerfilesBusqueda.removeAllItems();
            //ScbPerfilesBusqueda.addItem("Todos");
        }
        List<Map<String, String>> perfiles = metodos.leerHotspotPerfiles();
        for (Map<String, String> result : perfiles) {
            cbPerfiles.addItem(result.get("name"));            
            cbPerfilesBusqueda.addItem(result.get("name"));
            
        }
    }

    public void hablitarUISP() {
        //((JSpinner.DefaultEditor) spTotalFichas.getEditor()).getTextField().setEditable(false);
        //((JSpinner.DefaultEditor) spTotalFichas.getEditor()).getTextField().setEditable(false);
        //((JSpinner.DefaultEditor) spTotalFichas.getEditor()).getTextField().setEditable(false);
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

    public void leerPerfiles(String busqueda) {
        DefaultTableModel dtm1 = new DefaultTableModel();
        List<Map<String, String>> perfiles = metodos.leerHotspotPerfiles();
        String titulos[] = {"No.Perfil", "Nombre perfil", "Tiempo de conexion"};
        dtm1.setColumnIdentifiers(titulos);
        for (Map<String, String> result : perfiles) {
            Object[] fila = new Object[result.size()];
            if (!"".equals(busqueda)) {
                if (result.get("name").contains(busqueda)) {
                    fila[0] = result.get(".id");
                    fila[1] = result.get("name");
                    fila[2] = result.get("keepalive-timeout");
                    dtm1.addRow(fila);
                }
            } else {
                fila[0] = result.get(".id");
                fila[1] = result.get("name");
                fila[2] = result.get("keepalive-timeout");
                dtm1.addRow(fila);
            }

        }
        tbPerfiles.setModel(dtm1);

        tbPerfiles.getTableHeader().setReorderingAllowed(false);
        tbPerfiles.setRowHeight(20);//tamaño de las celdas
        tbPerfiles.setGridColor(new java.awt.Color(0, 0, 0));
        //personaliza el encabezado
        JTableHeader jtableHeader = tbPerfiles.getTableHeader();
        jtableHeader.setDefaultRenderer(new GestionEncabezadoTabla());
        tbPerfiles.setTableHeader(jtableHeader);
        totProfiles.setText(String.valueOf(dtm1.getRowCount()));
    }

    public void llenarComboServers() {
        List<Map<String, String>> servers = metodos.leerServersHotspot();
        cbServer.removeAllItems();
        if (servers != null) {
            cbServer.addItem("all");
            for (Map<String, String> result : servers) {
                cbServer.addItem(result.get("name"));
            }
        }
    }

    public void leerPerfilesTable() {
        if (cbPerfilesBusqueda.getItemCount() > 0) {
            System.out.println("leer perfiles table");
            cbPerfilesBusqueda.removeAllItems();
        }
        List<Map<String, String>> perfiles = metodos.leerHotspotPerfiles();
        cbPerfilesBusqueda.addItem("Todos");
        for (Map<String, String> result : perfiles) {
            cbPerfilesBusqueda.addItem(result.get("name"));
        }

    }

    public void leerUsuariosHotspot(String perfil) {
        DefaultTableModel dtm2 = new DefaultTableModel();
        List<Map<String, String>> usuarios = metodos.leerHotspotUsuarios();
        String titulos[] = {"Id.", "Servidor", "Nombre usuario", "Perfil de conexion"};
        dtm2.setColumnIdentifiers(titulos);
        int j = 0;
        for (Map<String, String> result : usuarios) {
            Object[] fila = new Object[result.size()];
            fila[0] = result.get(".id");
            if (result.get("server") != null) {
                fila[1] = result.get("server");
            } else {
                fila[1] = "all";
            }
            fila[2] = result.get("name");
            fila[3] = result.get("profile");
            if (!perfil.equals("") && !perfil.equals("Todos")) {
                if (perfil.equals(result.get("profile"))) {
                    dtm2.addRow(fila);
                }
            } else {
                dtm2.addRow(fila);
            }

        }
        jTableUsersHotspot.setModel(dtm2);
        jTableUsersHotspot.getTableHeader().setReorderingAllowed(false);
        jTableUsersHotspot.setRowHeight(25);//tamaño de las celdas
        jTableUsersHotspot.setGridColor(new java.awt.Color(0, 0, 0));

        //personaliza el encabezado
        JTableHeader jtableHeader = jTableUsersHotspot.getTableHeader();
        jtableHeader.setDefaultRenderer(new GestionEncabezadoTabla());
        jTableUsersHotspot.setTableHeader(jtableHeader);
        txtTotFichas.setText(String.valueOf(dtm2.getRowCount()));
    }

    public void leerUsuariosActivos(String busqueda) {
        DefaultTableModel dtm2 = new DefaultTableModel();
        List<Map<String, String>> usuariosActives = metodos.userActivesHotspot();
        String titulos[] = {"Id.", "Usuario", "IP", "Tiempo Usado"};
        dtm2.setColumnIdentifiers(titulos);
        int j = 0;
        for (Map<String, String> result : usuariosActives) {
            Object[] fila = new Object[result.size()];
            if (!"".equals(busqueda)) {
                if (result.get("user").contains(busqueda)) {
                    fila[0] = result.get(".id");
                    fila[1] = result.get("user");
                    fila[2] = result.get("address");
                    fila[3] = result.get("uptime");
                    dtm2.addRow(fila);
                }
            } else {
                fila[0] = result.get(".id");
                fila[1] = result.get("user");
                fila[2] = result.get("address");
                fila[3] = result.get("uptime");
                dtm2.addRow(fila);
            }

        }
        tbActives.setModel(dtm2);
        tbActives.getTableHeader().setReorderingAllowed(false);
        tbActives.setRowHeight(20);//tamaño de las celdas
        tbActives.setGridColor(new java.awt.Color(0, 0, 0));

        //personaliza el encabezado
        JTableHeader jtableHeader = tbActives.getTableHeader();
        jtableHeader.setDefaultRenderer(new GestionEncabezadoTabla());
        tbActives.setTableHeader(jtableHeader);
        totActivos.setText(String.valueOf(dtm2.getRowCount()));
        System.out.println("El commit");
    }

    public void leerIpBindings(String busqueda) {
        DefaultTableModel dtm2 = new DefaultTableModel();
        List<Map<String, String>> bindings = metodos.leerHotspotBindings();
        String titulos[] = {"Id", "Name", "Mac-Address", "Type", "Disabled"};
        dtm2.setColumnIdentifiers(titulos);
        int j = 0;
        for (Map<String, String> result : bindings) {
            Object[] fila = new Object[result.size()];
            if (!"".equals(busqueda)) {
                if (result.get("comment").contains(busqueda)) {
                    fila[0] = result.get(".id");
                    fila[1] = result.get("comment");
                    fila[2] = result.get("mac-address");
                    fila[3] = result.get("type");
                    fila[4] = result.get("disabled");
                    dtm2.addRow(fila);
                }
            } else {
                fila[0] = result.get(".id");
                fila[1] = result.get("comment");
                fila[2] = result.get("mac-address");
                fila[3] = result.get("type");
                fila[4] = result.get("disabled");
                if (fila[4].equals("true")) {

                }
                dtm2.addRow(fila);
            }

        }
        tbBindings.setModel(dtm2);
        tbBindings.getTableHeader().setReorderingAllowed(false);
        tbBindings.setRowHeight(20);//tamaño de las celdas
        tbBindings.setGridColor(new java.awt.Color(0, 0, 0));

        //personaliza el encabezado
        JTableHeader jtableHeader = tbBindings.getTableHeader();
        jtableHeader.setDefaultRenderer(new GestionEncabezadoTabla());
        tbBindings.setTableHeader(jtableHeader);
        totActivos.setText(String.valueOf(dtm2.getRowCount()));
    }

    public File generarHTML(List<HotspotUser> users) {
        File fileIm = null;
        try {
            //leemos el html que contiene la estructura del pdf
            String ruta = ruta();
            File fileHtml = new File(ruta + "fichas.html");
            FileReader frHtml = new FileReader(fileHtml);
            BufferedReader brHtml = new BufferedReader(frHtml);

            //Creamos el nuevo arichivo para convertirlo a pdf
            File fileHTMLPDF = new File(ruta + "HtmlToPDF.html");
            if (!fileHTMLPDF.exists()) {
                fileHTMLPDF.createNewFile();
            } else {
                fileHTMLPDF.delete();
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

                if (linea.contains(" background-image:")) {
                    linea = " background-image: url('" + lblImage.getIcon().toString() + "');";
                }
                contenidoPrincipal = contenidoPrincipal + linea + "\n";
            }
            int count = 0;
            for (int i = 0; i < users.size(); i++) {
                count = count + 1;
                if (count == 1) {
                    contenidoTr = "<tr>";
                }
                contenido_td = contenido_td + "<td>" + users.get(i).getPerfil() + "<br>user:" + users.get(i).getUsername() + "<br>pass:" + users.get(i).getPassword() + "</td>";
                if (count == 8 || i == users.size() - 1) {
                    contenidoTr = "<tr>" + contenido_td + "</tr>";
                    c = c + contenidoTr;
                    contenidoTr = "";
                    contenido_td = "";
                    count = 0;
                }
            }
            contenido_replace = contenido_replace + c;
            contenido_replace = "<br>" + contenido_replace + "</table>";
            bw.write(contenidoPrincipal.replace("@table@", contenido_replace));
            bw.close();
            //String url = new File(ficheroHTML).toURI().toURL().toString();
            File filPdf = new File(ruta + "ficha.pdf");
            ConverterProperties converterProperties = new ConverterProperties();
            HtmlConverter.convertToPdf(new FileInputStream(fileHTMLPDF), new FileOutputStream(filPdf),
                    converterProperties);
            byte[] fileBytes = FileUtils.readFileToByteArray(filPdf);

            fileIm = null;
            try {
                FileOutputStream fileImpr = new FileOutputStream(ruta() + "file.pdf");
                fileImpr.write(fileBytes);
                fileImpr.close();
                fileIm = new File(ruta() + "file.pdf");
            } catch (Exception e) {
                FileOutputStream fileImpr = new FileOutputStream(ruta() + "file1.pdf");
                fileImpr.write(fileBytes);
                fileImpr.close();
                fileIm = new File(ruta() + "file1.pdf");
            }

        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("Error al leer archivo:" + e.getMessage());
        }
        return fileIm;
    }

    public String ruta() {
        System.out.println("Ruta:"+getClass().getResource("").toString().replace("/build/classes",""));
        String ruta = getClass().getResource("").toString().replace(getSeparator()+"build"+getSeparator()+"classes","")+"src"+getSeparator()+"files"+getSeparator();
        return "/home/wilmer/Documentos/HotspotContrller/RedOneHotspotController/src/files/";//getClass().getResource("/files/").toString().replace("/", getSeparator()).replace("file:\\", "");
    }

    private String getSeparator() {
        return System.getProperty("file.separator");
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
    private javax.swing.JDialog JDialogIpBindings;
    private javax.swing.JDialog addProfile;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCrearPerfil;
    private javax.swing.JComboBox<String> cbPerfiles;
    private javax.swing.JComboBox<String> cbPerfilesBusqueda;
    private javax.swing.JComboBox<String> cbServer;
    private javax.swing.JComboBox<String> cbType;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
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
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableUsersHotspot;
    private javax.swing.JLabel lblImage;
    private javax.swing.JSpinner spSharedUsers;
    private javax.swing.JSpinner spTotalFichas;
    private javax.swing.JTable tbActives;
    private javax.swing.JTable tbBindings;
    private javax.swing.JTable tbPerfiles;
    private javax.swing.JLabel totActivos;
    private javax.swing.JLabel totProfiles;
    private javax.swing.JTextField txtActivosSearch;
    private javax.swing.JTextField txtBindingSearch;
    private javax.swing.JTextField txtComment;
    private javax.swing.JTextField txtIdleTimeout;
    private javax.swing.JTextField txtKeepAliveTimeout;
    private javax.swing.JTextField txtMacAddres;
    private javax.swing.JTextField txtMacCookieTimeout;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPerfilSearch;
    private javax.swing.JTextField txtRate;
    private javax.swing.JTextField txtStatusAutorefresh;
    private javax.swing.JLabel txtTotFichas;
    // End of variables declaration//GEN-END:variables
}
