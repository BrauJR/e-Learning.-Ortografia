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
public class APimperfecto extends javax.swing.JInternalFrame {
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
    public APimperfecto() {
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
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(0, 153, 153));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Imperfecto de indicativo");
        jPanel13.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 240, 60));

        getContentPane().add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 60));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("\n\n       Existen dos formas comunes para expresar el pasado en español. El pretérito indefinido y el Imperfecto de Indicativo. Existe una diferencia entre \n\n       ambos y ahora aclararemos el Imperfecto de Indicativo.\n\n       Comenzaremos por explicar la formación (conjugación) del Imperfecto de Indicativo:\n\n\t                                                                Verbos Regulares \n\n              Pronombre \t                       -AR \t              -ER \t              -IR \n\n           Yo\t                                   -  amaba\t      -  aprendía \t    -  vivía\n\n           Tú \t                                  -  amabas                          -  aprendías\t    -  vivías \n\n           Él / Ella / Usted \t               -  amaba                            -  aprendía \t    -  vivía \n\n           Nosotros/as \t                    -  amábamos                      -  aprendíamos                     -  vivíamos \n\n           Vosotros/as \t                    -  amabais \t  -  aprendíais                         -  vivíais \n\n           Ellos / Ellas / Ustedes \t     -  amaban \t   -  aprendían                          -  vivían \n\n\n       Si te das cuenta en la terminación de los verbos verás que se repiten en la primera persona y tercera persona singular.\n\n\n       Ahora revisemos los verbos irregulares:\n\n                                                                 \tVerbos Irregulares\n \n                  Pronombre \t                     IR \t         SER \t           VER \n\n            Yo\t                                      -  iba\t        -  era\t        -  veía \n\n            Tú \t                                     -  ibas \t     -  eras\t      -  veías \n\n            Él / Ella / Usted       \t            -  iba \t      -  era \t       -  veía \n\n            Nosotros/as      \t                  -  íbamos \t-  éramos\t -  veíamos \n\n            Vosotros/as      \t                  -  ibais \t    -  erais                           -  veíais \n\n            Ellos / Ellas / Ustedes         \t-  iban  \t   -  eran\t      -  veían \n\n       \n       ¿Cuándo se usa el Imperfecto de Indicativo? \n\n       El Imperfecto de Indicativo es usado cuando expresa una acción o estado que es continua en el pasado pero sin aclarar su fin.\n\n      También es usado cuando:\n\n      Una acción que sucedía en el pasado al mismo tiempo que otra acción. Ejemplo:\n\n              •Mi hermana cantaba mientras mi padre hablaba.\n\n              •Esperaba en la fila y nadie atendía.\n\n              •Jugaba en el jardín donde habían más árboles.\n\n       Una acción que sucedía en el pasado cuando otra acción interrumpe. Ejemplo:\n\n              •Mi hermana veía televisión cuando yo llegué.\n\n              •Cuando estaba en la cocina mi marido tocó la puerta.\n\n              •Yo bajaba de la escalera cuando me caí.\n\n       Una acción o actividad que una persona hace en el pasado habitualmente. Ejemplo:\n\n              •Cuando era pequeña jugaba todas las tardes con mis muñecas.\n\n              •Cuando estábamos en chile íbamos todos los fines de semana a la playa.\n\n       Una descripción de condición física, mental o emocional en el pasado. Ejemplo:\n\n              •Yo quería estar contigo (descripción mental).\n\n              •Deseaba verte pero no estabas.\n\n       Verbos comunes en esta descripción son creer, desear, pensar, poder, preferir, querer, saber y sentir.\n\n              •Estaba triste sin ti (descripción emocional).\n\n              •Mi mamá era hermosa cuando era joven (descripción física). \n\n       El tiempo del día en el pasado. Ejemplo:\n\n              •¿Qué hora era? - Eran las tres.\n\n              •¿A qué hora era la inauguración?\n\n       Estilo indirecto en pasado. Ejemplo:\n\n              •Dice que quiere venir a mi casa\n\n              •Marta comenta a Juana que tiene que llegar temprano a casa.\n\n\n\n\n");
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setCaretPosition(0);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1170, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}