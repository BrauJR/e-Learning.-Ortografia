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
public class GDiálogo extends javax.swing.JInternalFrame {
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
    public GDiálogo() {
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
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(0, 153, 153));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Diálogo-Puntuación");
        jPanel13.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 190, 60));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Menu.png"))); // NOI18N
        jLabel10.setToolTipText("Menú principal");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });
        jPanel13.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 0, 100, 60));

        getContentPane().add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 60));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("\n    \n       Los diálogos en español comienzan con un guión largo (raya) no un guión corto (guión). \n\n       En este artículo, simplemente llamaremos al guión largo, un guión. \n\n          –Estoy listo. (= \"Estoy listo\") \n\n       Observe que no hay espacio entre el guión y la primera letra. \n\n       Los diálogos no terminan en un guión (-), solo el signo de puntuación normal (normalmente un punto, un signo de interrogación o un signo de \n\n       exclamación). \n\n       Puntuación con atributos.\n\n       Un guión también se utiliza para introducir un atributo. Un atributivo en un diálogo acredita el discurso a la persona que lo dijo. Se refiere a un verbo \n\n       o acción asociada con hablar y quién lo dijo. \n\n          –Dijo él. (= dijo) \n\n          –Respondió ella. (= ella respondió) \n\n          –Preguntó. (= preguntó él / ella) \n\n       Una vez más, el guión se une a la primera letra de la primera palabra. Observe también cómo esa primera palabra, normalmente un verbo \"hablar\" \n\n       comienza con una letra minúscula. \n\n       Más ejemplos de verbos de \"hablar\" en español son: \n\n          aceptó (aceptado), aconsejó (aconsejado), admitió (admitido), mantener (afirmado / afirmado), amenazó (amenazado), bromeó (bromeado), \n\n          comentó (comentó), concluyó (concluyó), dijo (dijo), gritó (gritó ), mintió (mintió), preguntó (preguntó), prometió (prometió), repitió (repetido), \n\n          respondió (respondió), rogó (suplicó), sugirió (sugirió), susurró (susurró). \n\n       Ahora veamos las dos partes juntas: el discurso y el atributivo. \n\n          –Estoy lista –dijo ella. \n\n       No hay período (punto final) al final de la primera parte, ya que se continúa con un atributo. Solo podemos poner un signo de interrogación, un signo \n\n       de explicación o puntos suspensivos (tres puntos) en la parte del discurso cuando está seguido de un atributo. \n\n       Vea cómo hay un espacio entre lo que se dice y el guión que se une al atributo. \n\n       Recuerde, el atributo del orador comienza con una letra minúscula. \n\n          –¿Estás bien? –Preguntó diego. \n\n          –Sí, estoy bien –le contestó Angélica con una sonrisa. \n\n       El discurso de cada persona se escribe una línea separada. \n\n       El primer discurso tiene los signos de interrogación directamente después de las palabras. El segundo discurso NO tiene el punto (punto final) \n\n       directamente después de lo que se dice. \n\n       Aquí aparece al final de la atributiva. \n\n       ¿Qué pasa si hay más diálogo después del atributivo?\n \n          –Estoy lista –dijo ella–. Me voy a la fiesta. \n\n       Primero agregamos un guión al final del atributo. A esto le sigue el signo de puntuación final de la primera parte del discurso. En el ejemplo anterior, \n\n       Estoy lista debería terminar en un período (punto final) pero en su lugar, va después del guión al final del atributo. Como es una oración nueva, la \n\n       segunda parte comienza con una letra mayúscula. \n\n       Si ayuda, puedes pensar en los guiones en –dijo ella– como paréntesis. \n\n       Pero mira lo siguiente:\n \n          –Estoy lista –dijo ella–, y nadie me va a parar. \n\n       Aquí el diálogo es una oración más larga que es interrumpida por el atributivo. Dado que el signo de puntuación es una coma, la segunda parte \n\n       continúa con una letra minúscula. \n\n       Sin embargo, si la primera parte termina en un signo de interrogación, signo de exclamación o puntos suspensivos (tres puntos), esto va al final de \n\n       la primera parte. \n\n          –¡Estás loco! –Gritó Daniel–. Tienes que parar inmediatamente. \n\n       Si el comentario del narrador no tiene nada que ver con un verbo hablar o pensar (incluidas las acciones relacionadas, como gritar, susurrar, etc.), \n\n       la oración del narrador comienza con una letra mayúscula. \n\n          -Me voy. –Cerró la puerta y salió. \n\n       Usando los dos puntos en el diálogo \n\n       Hasta ahora, solo hemos visto el atributo (verbo) después de lo que se dice. Sin embargo, a veces tienes lo que dice el narrador antes del discurso. \n       En este caso usamos dos puntos después del \"verbo que habla\". \n\n          Mi madre dijo: \n\n          –Vamos en diez minutos. \n\n          Le pregunté al doctor: \n\n          –¿Estaré bien? \n\n       El diálogo pasa a la siguiente línea. \n\n       Puntuación al pensar. \n\n       Cuando una persona está PENSANDO directamente en lugar de hablar, entonces se usa la puntuación «» (comillas) en lugar del guión. \n\n       Estas son conocidas como comillas angulares , comillas latinas y también comillas españolas . \n\n          «¡Qué aburrido!», Pensé. Pero no me atreví a decirlo. \n\n          «Hay algo raro aquí», pensó el detective. \n\n          –Puedes llegar a ser un buen jugador –le expliqué y pensé, aunque nunca tan bueno como yo ”. \n\n       Observe la posición del período (punto final) y la coma después del cierre final de Comilla. \n\n       Puntuación al citar\n \n       Las comillas, o repitiendo lo que alguien más ha dicho, están encerradas en comillas. \n\n       Fue Descartes quien dijo: «Pienso, luego existo» . \n\n       Sus últimas palabras fueron: «No pasará nada» . .\n\n    ___________________________________________________________________________________________________________________________\n\n       Bibliografía: \n   \n       http://ortografía.es.mx\n");
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setCaretPosition(0);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1170, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
        Inicio.logo.setVisible(false);
        Inicio.AReGra.setVisible(false);
        Inicio.SReGra.setVisible(false);

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
    }//GEN-LAST:event_jLabel10MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
