
import java.awt.Color;
import java.beans.PropertyVetoException;

//33,175,156
public class Inicio extends javax.swing.JFrame {

    // Entered
    public void chage_to_entered() {
        PanelBotones4.setBackground(Color.WHITE);
        btnCrear.setBackground(Color.white);
        btnIniciar.setBackground(Color.white);
        btnAcerca.setBackground(Color.white);
        btnCrear.setForeground(new java.awt.Color(0, 153, 153));
        btnIniciar.setForeground(new java.awt.Color(0, 153, 153));
        btnAcerca.setForeground(new java.awt.Color(0, 153, 153));

    }

    // Exited
    public void chage_to_exited() {
        PanelBotones4.setBackground(new java.awt.Color(0, 153, 153));
        btnCrear.setBackground(new java.awt.Color(0, 153, 153));
        btnIniciar.setBackground(new java.awt.Color(0, 153, 153));
        btnAcerca.setBackground(new java.awt.Color(0, 153, 153));
        btnCrear.setForeground(Color.white);
        btnIniciar.setForeground(Color.white);
        btnAcerca.setForeground(Color.white);
    }

    public Inicio() {
        initComponents();
        version.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setExtendedState(Principal.MAXIMIZED_BOTH);
        logo.setVisible(false);
        Atrás.setVisible(false);
        ASignos.setVisible(false);
        AAcentuación.setVisible(false);
        AReGra.setVisible(false);
        AGra.setVisible(false);
        ANormas.setVisible(false);
        ADiccionario.setVisible(false);
        ATest.setVisible(false);
        AReglas.setVisible(false);
        Siguiente.setVisible(false);
        SSignos.setVisible(false);
        SAcentuación.setVisible(false);
        SReGra.setVisible(false);
        SGra.setVisible(false);
        SNormas.setVisible(false);
        SDiccionario.setVisible(false);
        STest.setVisible(false);
        SReglas.setVisible(false);

        Menú1.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        version = new javax.swing.JLabel();
        max_min = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panelLOGOBO = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        Atrás = new javax.swing.JLabel();
        ASignos = new javax.swing.JLabel();
        AAcentuación = new javax.swing.JLabel();
        AReGra = new javax.swing.JLabel();
        AGra = new javax.swing.JLabel();
        ANormas = new javax.swing.JLabel();
        ADiccionario = new javax.swing.JLabel();
        ATest = new javax.swing.JLabel();
        AReglas = new javax.swing.JLabel();
        Siguiente = new javax.swing.JLabel();
        SSignos = new javax.swing.JLabel();
        SAcentuación = new javax.swing.JLabel();
        SReGra = new javax.swing.JLabel();
        SGra = new javax.swing.JLabel();
        SNormas = new javax.swing.JLabel();
        SDiccionario = new javax.swing.JLabel();
        STest = new javax.swing.JLabel();
        SReglas = new javax.swing.JLabel();
        Menú1 = new javax.swing.JLabel();
        btnAcerca = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        PanelBotones4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0, 100));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 1, 19)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Eres la mejor arma contra la ignorancia y el ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 19, -1, 25));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 19)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("mejor amigo del escritor, tan clara que puedes ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 55, -1, 25));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 19)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("navegar en altamar; dentro de este mar de  ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 91, -1, 25));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 19)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Olaya, L.");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 152, -1, 25));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 19)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("sabiduría.");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 134, -1, 25));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/presentacion1.jpg"))); // NOI18N

        escritorio.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(885, Short.MAX_VALUE))
            .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(escritorioLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(291, Short.MAX_VALUE))
            .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(escritorioLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1370, 650));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        version.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        version.setText("Versión 2. 1. 1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(1078, Short.MAX_VALUE)
                .addComponent(version)
                .addGap(179, 179, 179))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(version)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 720, 1370, 60));

        max_min.setBackground(new java.awt.Color(255, 255, 255));
        max_min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                max_minMouseEntered(evt);
            }
        });
        max_min.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("-");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        max_min.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 20, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("X");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        max_min.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, -1, 20));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("-");
        jButton1.setToolTipText("Minimizar");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        max_min.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, 60, 20));

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("X");
        jButton2.setToolTipText("Cerrar");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        max_min.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 0, 60, 20));

        getContentPane().add(max_min, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 20));

        panelLOGOBO.setBackground(new java.awt.Color(255, 255, 255));
        panelLOGOBO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/logo.png"))); // NOI18N
        panelLOGOBO.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 110, 50));

        Atrás.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Atrás.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras1p.png"))); // NOI18N
        Atrás.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Atrás.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AtrásMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AtrásMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AtrásMousePressed(evt);
            }
        });
        panelLOGOBO.add(Atrás, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 80, 50));

        ASignos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ASignos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras1p.png"))); // NOI18N
        ASignos.setToolTipText("Reglas ortográficas");
        ASignos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ASignos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ASignosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ASignosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ASignosMousePressed(evt);
            }
        });
        panelLOGOBO.add(ASignos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 80, 50));

        AAcentuación.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AAcentuación.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras1p.png"))); // NOI18N
        AAcentuación.setToolTipText("Signos de puntuación");
        AAcentuación.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AAcentuación.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AAcentuaciónMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AAcentuaciónMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AAcentuaciónMousePressed(evt);
            }
        });
        panelLOGOBO.add(AAcentuación, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 80, 50));

        AReGra.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AReGra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras1p.png"))); // NOI18N
        AReGra.setToolTipText("Acentuación");
        AReGra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AReGra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AReGraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AReGraMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AReGraMousePressed(evt);
            }
        });
        panelLOGOBO.add(AReGra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 80, 50));

        AGra.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AGra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras1p.png"))); // NOI18N
        AGra.setToolTipText("Reglas gramaticales");
        AGra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AGra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AGraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AGraMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AGraMousePressed(evt);
            }
        });
        panelLOGOBO.add(AGra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 80, 50));

        ANormas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ANormas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras1p.png"))); // NOI18N
        ANormas.setToolTipText("Apuntes gramaticales");
        ANormas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ANormas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ANormasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ANormasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ANormasMousePressed(evt);
            }
        });
        panelLOGOBO.add(ANormas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 80, 50));

        ADiccionario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ADiccionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras1p.png"))); // NOI18N
        ADiccionario.setToolTipText("Normas APA");
        ADiccionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ADiccionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ADiccionarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ADiccionarioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ADiccionarioMousePressed(evt);
            }
        });
        panelLOGOBO.add(ADiccionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 80, 50));

        ATest.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ATest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras1p.png"))); // NOI18N
        ATest.setToolTipText("Diccionario");
        ATest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ATest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ATestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ATestMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ATestMousePressed(evt);
            }
        });
        panelLOGOBO.add(ATest, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 80, 50));

        AReglas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AReglas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras1p.png"))); // NOI18N
        AReglas.setToolTipText("Test");
        AReglas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AReglas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AReglasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AReglasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AReglasMousePressed(evt);
            }
        });
        panelLOGOBO.add(AReglas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 80, 50));

        Siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras2p.png"))); // NOI18N
        Siguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Siguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SiguienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SiguienteMouseExited(evt);
            }
        });
        panelLOGOBO.add(Siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 80, 50));

        SSignos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras2p.png"))); // NOI18N
        SSignos.setToolTipText("Acentuación");
        SSignos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SSignos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SSignosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SSignosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SSignosMousePressed(evt);
            }
        });
        panelLOGOBO.add(SSignos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 80, 50));

        SAcentuación.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras2p.png"))); // NOI18N
        SAcentuación.setToolTipText("Reglas gramaticales");
        SAcentuación.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SAcentuación.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SAcentuaciónMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SAcentuaciónMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SAcentuaciónMousePressed(evt);
            }
        });
        panelLOGOBO.add(SAcentuación, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 80, 50));

        SReGra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras2p.png"))); // NOI18N
        SReGra.setToolTipText("Apuntes gramaticales");
        SReGra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SReGra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SReGraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SReGraMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SReGraMousePressed(evt);
            }
        });
        panelLOGOBO.add(SReGra, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 80, 50));

        SGra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras2p.png"))); // NOI18N
        SGra.setToolTipText("Normas APA");
        SGra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SGra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SGraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SGraMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SGraMousePressed(evt);
            }
        });
        panelLOGOBO.add(SGra, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 80, 50));

        SNormas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras2p.png"))); // NOI18N
        SNormas.setToolTipText("Diccionario");
        SNormas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SNormas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SNormasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SNormasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SNormasMousePressed(evt);
            }
        });
        panelLOGOBO.add(SNormas, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 80, 50));

        SDiccionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras2p.png"))); // NOI18N
        SDiccionario.setToolTipText("Test");
        SDiccionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SDiccionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SDiccionarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SDiccionarioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SDiccionarioMousePressed(evt);
            }
        });
        panelLOGOBO.add(SDiccionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 80, 50));

        STest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras2p.png"))); // NOI18N
        STest.setToolTipText("Reglas ortográficas");
        STest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        STest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                STestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                STestMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                STestMousePressed(evt);
            }
        });
        panelLOGOBO.add(STest, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 80, 50));

        SReglas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras2p.png"))); // NOI18N
        SReglas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SReglas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SReglasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SReglasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SReglasMousePressed(evt);
            }
        });
        panelLOGOBO.add(SReglas, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 80, 50));

        Menú1.setFocusable(false);
        panelLOGOBO.add(Menú1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 0, 80, 50));

        btnAcerca.setBackground(new java.awt.Color(0, 153, 153));
        btnAcerca.setFont(new java.awt.Font("Arial", 0, 19)); // NOI18N
        btnAcerca.setForeground(new java.awt.Color(255, 255, 255));
        btnAcerca.setText("Acerca de");
        btnAcerca.setBorder(null);
        btnAcerca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAcerca.setFocusable(false);
        btnAcerca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAcercaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAcercaMouseExited(evt);
            }
        });
        btnAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcercaActionPerformed(evt);
            }
        });
        panelLOGOBO.add(btnAcerca, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 140, 50));

        btnCrear.setBackground(new java.awt.Color(0, 153, 153));
        btnCrear.setFont(new java.awt.Font("Arial", 0, 19)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(255, 255, 255));
        btnCrear.setText("Crear cuenta");
        btnCrear.setBorder(null);
        btnCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrear.setFocusable(false);
        btnCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCrearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCrearMouseExited(evt);
            }
        });
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        panelLOGOBO.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1213, 0, 160, 50));

        btnIniciar.setBackground(new java.awt.Color(0, 153, 153));
        btnIniciar.setFont(new java.awt.Font("Arial", 0, 19)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("Iniciar sesión");
        btnIniciar.setBorder(null);
        btnIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciar.setFocusable(false);
        btnIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIniciarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnIniciarMousePressed(evt);
            }
        });
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        panelLOGOBO.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 0, 140, 50));

        PanelBotones4.setBackground(new java.awt.Color(0, 153, 153));
        PanelBotones4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelBotones4PanelBotones4PanelBotonesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelBotones4PanelBotones4PanelBotonesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PanelBotones4Layout = new javax.swing.GroupLayout(PanelBotones4);
        PanelBotones4.setLayout(PanelBotones4Layout);
        PanelBotones4Layout.setHorizontalGroup(
            PanelBotones4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        PanelBotones4Layout.setVerticalGroup(
            PanelBotones4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panelLOGOBO.add(PanelBotones4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 50));

        getContentPane().add(panelLOGOBO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1370, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void max_minMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_max_minMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_max_minMouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jButton1ActionPerformed

    //MINIMIZAR
    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabel2MousePressed

    //CERRAR
    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        //  jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setForeground(Color.white);
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        //  jButton2.setBackground(Color.white);
        jButton2.setForeground(Color.white);
    }//GEN-LAST:event_jButton2MouseExited

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
version.setVisible(false);
        Crear_cuenta abrir = new Crear_cuenta();
        Inicio.escritorio.add(abrir);
        abrir.toFront();
        abrir.setVisible(true);
//MAXIMIZAR EN TODA LA PANTALLA LOS INTERNALFRAME
        try {
            abrir.setMaximum(true);
        } catch (PropertyVetoException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
version.setVisible(false);
        Iniciar_sesión abrir = new Iniciar_sesión();
        Inicio.escritorio.add(abrir);
        abrir.toFront();
        abrir.setVisible(true);
//MAXIMIZAR EN TODA LA PANTALLA LOS INTERNALFRAME
        try {
            abrir.setMaximum(true);
        } catch (PropertyVetoException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnAcercaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcercaMouseEntered
        chage_to_entered();
    }//GEN-LAST:event_btnAcercaMouseEntered

    private void btnIniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseEntered
        chage_to_entered();
    }//GEN-LAST:event_btnIniciarMouseEntered

    private void btnCrearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearMouseEntered
        chage_to_entered();
    }//GEN-LAST:event_btnCrearMouseEntered

    private void btnAcercaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcercaMouseExited
        chage_to_exited();
    }//GEN-LAST:event_btnAcercaMouseExited

    private void btnIniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseExited
        chage_to_exited();
    }//GEN-LAST:event_btnIniciarMouseExited

    private void btnCrearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearMouseExited
        chage_to_exited();
    }//GEN-LAST:event_btnCrearMouseExited

    private void btnIniciarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMousePressed

    }//GEN-LAST:event_btnIniciarMousePressed

    private void PanelBotones4PanelBotones4PanelBotonesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelBotones4PanelBotones4PanelBotonesMouseEntered
        chage_to_entered();
    }//GEN-LAST:event_PanelBotones4PanelBotones4PanelBotonesMouseEntered

    private void PanelBotones4PanelBotones4PanelBotonesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelBotones4PanelBotones4PanelBotonesMouseExited
        chage_to_exited();
    }//GEN-LAST:event_PanelBotones4PanelBotones4PanelBotonesMouseExited

    private void AtrásMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrásMousePressed

    }//GEN-LAST:event_AtrásMousePressed

    private void AtrásMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrásMouseEntered
        Atrás.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras1.png")));         // TODO add your handling code here:
    }//GEN-LAST:event_AtrásMouseEntered

    private void AtrásMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrásMouseExited
        Atrás.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras1p.png")));        // TODO add your handling code here:
    }//GEN-LAST:event_AtrásMouseExited

    private void SiguienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SiguienteMouseEntered
        Siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras2.png")));              // TODO add your handling code here:
    }//GEN-LAST:event_SiguienteMouseEntered

    private void SiguienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SiguienteMouseExited
        Siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras2p.png")));
    }//GEN-LAST:event_SiguienteMouseExited

    private void ASignosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ASignosMouseEntered
        ASignos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras1.png")));
    }//GEN-LAST:event_ASignosMouseEntered

    private void ASignosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ASignosMouseExited
        ASignos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras1p.png")));
    }//GEN-LAST:event_ASignosMouseExited

    private void ASignosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ASignosMousePressed
        Inicio.logo.setVisible(true);
        Inicio.ASignos.setVisible(false);
        Inicio.SSignos.setVisible(false);
        Inicio.AReglas.setVisible(true);
        Inicio.SReglas.setVisible(true);
        Inicio.Menú1.setVisible(true);

        SubReglas abrir1 = new SubReglas();
        Inicio.escritorio.add(abrir1);
        abrir1.toFront();
        abrir1.setVisible(true);
//MAXIMIZAR EN TODA LA PANTALLA LOS INTERNALFRAME
        try {
            abrir1.setMaximum(true);
        } catch (PropertyVetoException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }//GEN-LAST:event_ASignosMousePressed

    private void AAcentuaciónMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AAcentuaciónMouseEntered
        AAcentuación.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras1.png")));
    }//GEN-LAST:event_AAcentuaciónMouseEntered

    private void AAcentuaciónMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AAcentuaciónMouseExited
        AAcentuación.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras1p.png")));
    }//GEN-LAST:event_AAcentuaciónMouseExited

    private void AAcentuaciónMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AAcentuaciónMousePressed

        Inicio.logo.setVisible(true);
        Inicio.AAcentuación.setVisible(false);
        Inicio.SAcentuación.setVisible(false);
        Inicio.ASignos.setVisible(true);
        Inicio.SSignos.setVisible(true);
        Inicio.Menú1.setVisible(true);

        SubSignos abrir = new SubSignos();
        Inicio.escritorio.add(abrir);
        abrir.toFront();
        abrir.setVisible(true);
//MAXIMIZAR EN TODA LA PANTALLA LOS INTERNALFRAME
        try {
            abrir.setMaximum(true);
        } catch (PropertyVetoException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }//GEN-LAST:event_AAcentuaciónMousePressed

    private void AReGraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AReGraMouseEntered
        AReGra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras1.png")));
    }//GEN-LAST:event_AReGraMouseEntered

    private void AReGraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AReGraMouseExited
        AReGra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras1p.png")));
    }//GEN-LAST:event_AReGraMouseExited

    private void AReGraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AReGraMousePressed

        Inicio.logo.setVisible(true);
        Inicio.AReGra.setVisible(false);
        Inicio.SReGra.setVisible(false);
        Inicio.AAcentuación.setVisible(true);
        Inicio.SAcentuación.setVisible(true);
        Inicio.Menú1.setVisible(true);

        SubAcentuación abrir2 = new SubAcentuación();
        Inicio.escritorio.add(abrir2);
        abrir2.toFront();
        abrir2.setVisible(true);
//MAXIMIZAR EN TODA LA PANTALLA LOS INTERNALFRAME
        try {
            abrir2.setMaximum(true);
        } catch (PropertyVetoException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }//GEN-LAST:event_AReGraMousePressed

    private void AGraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AGraMouseEntered
        AGra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras1.png")));
    }//GEN-LAST:event_AGraMouseEntered

    private void AGraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AGraMouseExited
        AGra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras1p.png")));
    }//GEN-LAST:event_AGraMouseExited

    private void AGraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AGraMousePressed

        Inicio.logo.setVisible(true);
        Inicio.AGra.setVisible(false);
        Inicio.Siguiente.setVisible(false);
        Inicio.AReGra.setVisible(true);
        Inicio.SReGra.setVisible(true);
        Inicio.Menú1.setVisible(true);

        SubReGramaticáles abrir2 = new SubReGramaticáles();
        Inicio.escritorio.add(abrir2);
        abrir2.toFront();
        abrir2.setVisible(true);
//MAXIMIZAR EN TODA LA PANTALLA LOS INTERNALFRAME
        try {
            abrir2.setMaximum(true);
        } catch (PropertyVetoException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }//GEN-LAST:event_AGraMousePressed

    private void ANormasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ANormasMouseEntered
        ANormas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras1.png")));
    }//GEN-LAST:event_ANormasMouseEntered

    private void ANormasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ANormasMouseExited
        ANormas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras1p.png")));
    }//GEN-LAST:event_ANormasMouseExited

    private void ANormasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ANormasMousePressed

        Inicio.logo.setVisible(true);
        Inicio.ANormas.setVisible(false);
        Inicio.SNormas.setVisible(false);
        Inicio.AGra.setVisible(true);
        Inicio.SGra.setVisible(true);
        Inicio.Menú1.setVisible(true);

        SubApuntes abrir2 = new SubApuntes();
        Inicio.escritorio.add(abrir2);
        abrir2.toFront();
        abrir2.setVisible(true);
//MAXIMIZAR EN TODA LA PANTALLA LOS INTERNALFRAME
        try {
            abrir2.setMaximum(true);
        } catch (PropertyVetoException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }//GEN-LAST:event_ANormasMousePressed

    private void ADiccionarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADiccionarioMouseEntered
        ADiccionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras1.png")));
    }//GEN-LAST:event_ADiccionarioMouseEntered

    private void ADiccionarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADiccionarioMouseExited
        ADiccionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras1p.png")));
    }//GEN-LAST:event_ADiccionarioMouseExited

    private void ADiccionarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADiccionarioMousePressed

        Inicio.logo.setVisible(true);
        Inicio.ADiccionario.setVisible(false);
        Inicio.SDiccionario.setVisible(false);
        Inicio.ANormas.setVisible(true);
        Inicio.SNormas.setVisible(true);
        Inicio.Menú1.setVisible(true);

        Normas abrir2 = new Normas();
        Inicio.escritorio.add(abrir2);
        abrir2.toFront();
        abrir2.setVisible(true);
//MAXIMIZAR EN TODA LA PANTALLA LOS INTERNALFRAME
        try {
            abrir2.setMaximum(true);
        } catch (PropertyVetoException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }//GEN-LAST:event_ADiccionarioMousePressed

    private void ATestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ATestMouseEntered
        ATest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras1.png")));
    }//GEN-LAST:event_ATestMouseEntered

    private void ATestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ATestMouseExited
        ATest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras1p.png")));
    }//GEN-LAST:event_ATestMouseExited

    private void ATestMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ATestMousePressed

        Inicio.logo.setVisible(true);
        Inicio.ATest.setVisible(false);
        Inicio.STest.setVisible(false);
        Inicio.ADiccionario.setVisible(true);
        Inicio.SDiccionario.setVisible(true);
        Inicio.Menú1.setVisible(true);

        Diccionario abrir3 = new Diccionario();
        Inicio.escritorio.add(abrir3);
        abrir3.toFront();
        abrir3.setVisible(true);
//MAXIMIZAR EN TODA LA PANTALLA LOS INTERNALFRAME
        try {
            abrir3.setMaximum(true);
        } catch (PropertyVetoException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }//GEN-LAST:event_ATestMousePressed

    private void AReglasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AReglasMouseEntered
        AReglas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras1.png")));
    }//GEN-LAST:event_AReglasMouseEntered

    private void AReglasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AReglasMouseExited
        AReglas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras1p.png")));
    }//GEN-LAST:event_AReglasMouseExited

    private void AReglasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AReglasMousePressed

        Inicio.logo.setVisible(true);
        Inicio.AReglas.setVisible(false);
        Inicio.SReglas.setVisible(false);
        Inicio.ATest.setVisible(true);
        Inicio.STest.setVisible(true);
        Inicio.Menú1.setVisible(true);

        Test abrir2 = new Test();
        Inicio.escritorio.add(abrir2);
        abrir2.toFront();
        abrir2.setVisible(true);
//MAXIMIZAR EN TODA LA PANTALLA LOS INTERNALFRAME
        try {
            abrir2.setMaximum(true);
        } catch (PropertyVetoException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }//GEN-LAST:event_AReglasMousePressed

    private void SSignosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SSignosMouseEntered
        SSignos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras2.png")));
    }//GEN-LAST:event_SSignosMouseEntered

    private void SSignosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SSignosMouseExited
        SSignos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras2p.png")));
    }//GEN-LAST:event_SSignosMouseExited

    private void SAcentuaciónMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SAcentuaciónMouseEntered
        SAcentuación.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras2.png")));
    }//GEN-LAST:event_SAcentuaciónMouseEntered

    private void SAcentuaciónMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SAcentuaciónMouseExited
        SAcentuación.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras2p.png")));
    }//GEN-LAST:event_SAcentuaciónMouseExited

    private void SReGraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SReGraMouseEntered
        SReGra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras2.png")));
    }//GEN-LAST:event_SReGraMouseEntered

    private void SReGraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SReGraMouseExited
        SReGra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras2p.png")));
    }//GEN-LAST:event_SReGraMouseExited

    private void SGraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SGraMouseEntered
        SGra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras2.png")));
    }//GEN-LAST:event_SGraMouseEntered

    private void SGraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SGraMouseExited
        SGra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras2p.png")));
    }//GEN-LAST:event_SGraMouseExited

    private void SNormasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SNormasMouseEntered
        SNormas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras2.png")));
    }//GEN-LAST:event_SNormasMouseEntered

    private void SNormasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SNormasMouseExited
        SNormas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras2p.png")));
    }//GEN-LAST:event_SNormasMouseExited

    private void SDiccionarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SDiccionarioMouseEntered
        SDiccionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras2.png")));
    }//GEN-LAST:event_SDiccionarioMouseEntered

    private void SDiccionarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SDiccionarioMouseExited
        SDiccionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras2p.png")));
    }//GEN-LAST:event_SDiccionarioMouseExited

    private void STestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STestMouseEntered
        STest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras2.png")));
    }//GEN-LAST:event_STestMouseEntered

    private void STestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STestMouseExited
        STest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras2p.png")));
    }//GEN-LAST:event_STestMouseExited

    private void SReglasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SReglasMouseEntered
        SReglas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras2.png")));
    }//GEN-LAST:event_SReglasMouseEntered

    private void SReglasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SReglasMouseExited
        SReglas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/atras2p.png")));
    }//GEN-LAST:event_SReglasMouseExited

    private void SSignosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SSignosMousePressed

        Inicio.logo.setVisible(true);
        Inicio.ASignos.setVisible(false);
        Inicio.SSignos.setVisible(false);
        Inicio.AAcentuación.setVisible(true);
        Inicio.SAcentuación.setVisible(true);
        Inicio.Menú1.setVisible(true);

        SubAcentuación abrir2 = new SubAcentuación();
        Inicio.escritorio.add(abrir2);
        abrir2.toFront();
        abrir2.setVisible(true);
//MAXIMIZAR EN TODA LA PANTALLA LOS INTERNALFRAME
        try {
            abrir2.setMaximum(true);
        } catch (PropertyVetoException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }//GEN-LAST:event_SSignosMousePressed

    private void SAcentuaciónMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SAcentuaciónMousePressed

        Inicio.logo.setVisible(true);
        Inicio.AAcentuación.setVisible(false);
        Inicio.SAcentuación.setVisible(false);
        Inicio.AReGra.setVisible(true);
        Inicio.SReGra.setVisible(true);
        Inicio.Menú1.setVisible(true);

        SubReGramaticáles abrir2 = new SubReGramaticáles();
        Inicio.escritorio.add(abrir2);
        abrir2.toFront();
        abrir2.setVisible(true);
//MAXIMIZAR EN TODA LA PANTALLA LOS INTERNALFRAME
        try {
            abrir2.setMaximum(true);
        } catch (PropertyVetoException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }//GEN-LAST:event_SAcentuaciónMousePressed

    private void SReGraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SReGraMousePressed
        Inicio.logo.setVisible(true);
        Inicio.AReGra.setVisible(false);
        Inicio.SReGra.setVisible(false);
        Inicio.AGra.setVisible(true);
        Inicio.SGra.setVisible(true);
        Inicio.Menú1.setVisible(true);

        SubApuntes abrir2 = new SubApuntes();
        Inicio.escritorio.add(abrir2);
        abrir2.toFront();
        abrir2.setVisible(true);
//MAXIMIZAR EN TODA LA PANTALLA LOS INTERNALFRAME
        try {
            abrir2.setMaximum(true);
        } catch (PropertyVetoException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }//GEN-LAST:event_SReGraMousePressed

    private void SGraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SGraMousePressed

        Inicio.logo.setVisible(true);
        Inicio.AGra.setVisible(false);
        Inicio.SGra.setVisible(false);
        Inicio.ANormas.setVisible(true);
        Inicio.SNormas.setVisible(true);
        Inicio.Menú1.setVisible(true);

        Normas abrir2 = new Normas();
        Inicio.escritorio.add(abrir2);
        abrir2.toFront();
        abrir2.setVisible(true);
//MAXIMIZAR EN TODA LA PANTALLA LOS INTERNALFRAME
        try {
            abrir2.setMaximum(true);
        } catch (PropertyVetoException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }//GEN-LAST:event_SGraMousePressed

    private void SNormasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SNormasMousePressed

        Inicio.logo.setVisible(true);
        Inicio.ANormas.setVisible(false);
        Inicio.SNormas.setVisible(false);
        Inicio.ADiccionario.setVisible(true);
        Inicio.SDiccionario.setVisible(true);
        Inicio.Menú1.setVisible(true);

        Diccionario abrir3 = new Diccionario();
        Inicio.escritorio.add(abrir3);
        abrir3.toFront();
        abrir3.setVisible(true);
//MAXIMIZAR EN TODA LA PANTALLA LOS INTERNALFRAME
        try {
            abrir3.setMaximum(true);
        } catch (PropertyVetoException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }//GEN-LAST:event_SNormasMousePressed

    private void SDiccionarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SDiccionarioMousePressed

        Inicio.logo.setVisible(true);
        Inicio.ADiccionario.setVisible(false);
        Inicio.SDiccionario.setVisible(false);
        Inicio.ATest.setVisible(true);
        Inicio.STest.setVisible(true);
        Inicio.Menú1.setVisible(true);

        Test abrir2 = new Test();
        Inicio.escritorio.add(abrir2);
        abrir2.toFront();
        abrir2.setVisible(true);
//MAXIMIZAR EN TODA LA PANTALLA LOS INTERNALFRAME
        try {
            abrir2.setMaximum(true);
        } catch (PropertyVetoException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }//GEN-LAST:event_SDiccionarioMousePressed

    private void STestMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STestMousePressed

        Inicio.logo.setVisible(true);
        Inicio.ATest.setVisible(false);
        Inicio.STest.setVisible(false);
        Inicio.AReglas.setVisible(true);
        Inicio.SReglas.setVisible(true);
        Inicio.Menú1.setVisible(true);

        SubReglas abrir1 = new SubReglas();
        Inicio.escritorio.add(abrir1);
        abrir1.toFront();
        abrir1.setVisible(true);
//MAXIMIZAR EN TODA LA PANTALLA LOS INTERNALFRAME
        try {
            abrir1.setMaximum(true);
        } catch (PropertyVetoException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }//GEN-LAST:event_STestMousePressed

    private void SReglasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SReglasMousePressed

        Inicio.logo.setVisible(true);
        Inicio.AReglas.setVisible(false);
        Inicio.SReglas.setVisible(false);
        Inicio.ASignos.setVisible(true);
        Inicio.SSignos.setVisible(true);
        Inicio.Menú1.setVisible(true);

        SubSignos abrir = new SubSignos();
        Inicio.escritorio.add(abrir);
        abrir.toFront();
        abrir.setVisible(true);
//MAXIMIZAR EN TODA LA PANTALLA LOS INTERNALFRAME
        try {
            abrir.setMaximum(true);
        } catch (PropertyVetoException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }//GEN-LAST:event_SReglasMousePressed

    private void btnAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcercaActionPerformed
version.setVisible(true);
        Acerca_de abrir = new Acerca_de();
        Inicio.escritorio.add(abrir);
        abrir.toFront();
        abrir.setVisible(true);
//MAXIMIZAR EN TODA LA PANTALLA LOS INTERNALFRAME
        try {
            abrir.setMaximum(true);
        } catch (PropertyVetoException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }//GEN-LAST:event_btnAcercaActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel AAcentuación;
    public static javax.swing.JLabel ADiccionario;
    public static javax.swing.JLabel AGra;
    public static javax.swing.JLabel ANormas;
    public static javax.swing.JLabel AReGra;
    public static javax.swing.JLabel AReglas;
    public static javax.swing.JLabel ASignos;
    public static javax.swing.JLabel ATest;
    public static javax.swing.JLabel Atrás;
    public static javax.swing.JLabel Menú1;
    public static javax.swing.JPanel PanelBotones4;
    public static javax.swing.JLabel SAcentuación;
    public static javax.swing.JLabel SDiccionario;
    public static javax.swing.JLabel SGra;
    public static javax.swing.JLabel SNormas;
    public static javax.swing.JLabel SReGra;
    public static javax.swing.JLabel SReglas;
    public static javax.swing.JLabel SSignos;
    public static javax.swing.JLabel STest;
    public static javax.swing.JLabel Siguiente;
    public static javax.swing.JButton btnAcerca;
    public static javax.swing.JButton btnCrear;
    public static javax.swing.JButton btnIniciar;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanel4;
    public static javax.swing.JLabel logo;
    private javax.swing.JPanel max_min;
    public static javax.swing.JPanel panelLOGOBO;
    private javax.swing.JLabel version;
    // End of variables declaration//GEN-END:variables
}
