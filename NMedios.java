
import java.awt.Color;
import java.beans.PropertyVetoException;
import java.awt.Color;
import java.beans.PropertyVetoException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.beans.PropertyVetoException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JComponent;
import javax.swing.border.LineBorder;
public class NMedios extends javax.swing.JInternalFrame {
private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
	private Dimension dimBarra = null; 
	private JTextField textField;
	private JPasswordField passwordField;
        
        public void ocultarBarraTitulo()
	{ 
	Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane(); 
	dimBarra = Barra.getPreferredSize(); 
	Barra.setSize(0,0); 
	Barra.setPreferredSize(new Dimension(0,0)); 
	repaint(); 
	}
    
    public NMedios() {
         ocultarBarraTitulo();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel13 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(0, 153, 153));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Menu.png"))); // NOI18N
        jLabel11.setToolTipText("Menú principal");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
        });
        jPanel13.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 0, 100, 60));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Referencias de medios audiovisuales");
        jPanel13.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 380, 60));

        getContentPane().add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 1170, 60));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jLabel1.setText("8.3 Episodio de una serie de televisión o radio");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 370, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jLabel2.setText("8.2 Grabación de música");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 220, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jLabel3.setText("8.1 Película");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 120, -1));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("\n\n       Incluimos en este apartado películas, emisiones de audio o televisión (incluyendo podcasts), mapas, material gráfico o fotografías.\n\n  .\n  \n              Apellido, A. A. (Productor), & Apellido, B. B. (Director). (Año). Título de la película [Película]. País de origen: Estudio.\n\n      \n\n              Escritor, A. (Año de Copyright). Título de la canción [Grabada por B. B Artista si es distinto del escritor]. En Título del álbum\n\n              [Medio de grabación: CD, disco, casete, etc.] Lugar: Sello discográfico. (Fecha de grabación si es distinta de la fecha de copyright\n\n              de la canción).\n\n       En las citas del texto, incluya lado y banda o número de canción. Ejemplo: Shadow and the Frame” (Nang, 2008, canción 10).\n\n      \n\n              Utilice el mismo formato que el que emplearía con un capítulo de libro, pero liste al guionista y al director en el lugar del autor y al \n\n              productor en el lugar del editor.\n\n\n");
        jTextArea2.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1170, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed
        Inicio.logo.setVisible(false);
        Inicio.ANormas.setVisible(false);
        Inicio.SNormas.setVisible(false);

        Menú abrir1 = new Menú();
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
    }//GEN-LAST:event_jLabel11MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}