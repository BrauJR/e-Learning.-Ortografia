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
public class APconjunciones extends javax.swing.JInternalFrame {
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
    public APconjunciones() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel13 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("\n\n       La conjunción es una parte de la oración, vacía de contenido significativo, cuya función es, la de enlazar dos o más palabras o dos o más \n\n       oraciones.\n\n       Existen dos clases de conjunciones: coordinantes y subordinantes.\n\n         Las conjunciones coordinantes\n \n        Copulativas: Su función es sumar elementos. y, e, ni.\n\n        Ejemplos:\n\n           •Quiero una empanada y una bebida.\n\n           •Carla es simpática e inteligente.\n\n           •Ni lo uno ni lo otro.\n\n       Se usa Y para enlazar palabras, ideas o cláusulas.\n\n       Se usa E en vez de Y para evitar el hiato en palabras que comienzan con \"i\" o \"hi\". Pero no se puede reemplazar la Y por E cuando va al principio, \n\n       una interrogación ni cuando la palabra siguiente comienza por \"y\" o \"hie\".\n\n         Ejemplos: ¿Y Isidora?; Aluminio y hierro.\n\n       Se usa Ni para unir palabras u oraciones expresando negación.\n\n         Disyuntivas: Sirven para excluir una de las dos afirmaciones que se hacen en una oración. o, u, o bien. \n\n         Ejemplos:\n\n           •Deseas vino tinto o blanco.\n\n           •Estaré aquí entre siete u ocho meses.\n\n           •Llámalo o bien mándale un correo electrónico.\n\n       Se usa O para denotar alternativa o diferencia. La vocal O lleva acento cuando va entre números.\n\n           •Voy a España por 2 ó 3 meses (la O con acento)\n\n           •Voy a España por dos o tres meses (números en palabras; la O sin acento).\n\n       Se usa U en vez de O cuando la siguiente palabra comienza con \"o\" o \"ho\".\n\n         Ejemplos: Tigre u oso; Chile u Holanda.\n\n          Distributivas: Presentan acciones alternativas pero que no se excluyen. ya... ya, bien... bien, o... o, uno... otro, tanto... como. \n\n         Ejemplos:\n\n           •Ese día ya salía el sol, ya se escondía.\n\n           •Uno paga el desayuno el otro paga el almuerzo. \n\n           •Tanto tú como yo estudiamos los mismos temas.\n\n          Adversativas: Tienen la función de negar el primer elemento y afirmar el segundo. pero, mas, aunque, sin embargo, no obstante, antes, antes \n\n          bien, por lo demás, sino, excepto, antes bien. \n\n         Ejemplos:\n\n           •Es una película larga pero muy entretenida.\n\n           •Ha realizado muchas exposiciones, no obstante ninguna en Santiago.\n  \n           •Está todo listo sin embargo, siento que algo falta.\n\n          Explicativas: El primer elemento de la coordinación es aclarado o explicado por el segundo. es decir, esto es.\n\n         Ejemplos:\n\n           •Tiene 18 años, es decir, es mayor de edad en Chile.\n\n           •Ese traje no sólo se usa de noche, esto es, que lo puedes usar para cualquier ocasión.\n\n           •Seré el nuevo presidente de la compañía, es decir, presidiré la compañía.\n\n       Las conjunciones subordinantes\n\n      Causales: Desempeñan la función de indicar la causa expresada en la proposición principal. porque, pues, puesto que, ya que, como.\n\n         Ejemplos:\n\n           •Daniel es el presidente de esta compañía ya que es muy inteligente.\n\n           •Espérame 5 minutos por favor porque tengo que enviar este correo.\n\n           •Puesto que es muy estudiosa, aprende rápido español.\n\n          Comparativa: Denota idea de comparación. que.\n\n         Ejemplos:\n\n           •Angélica es más joven que Roberto.\n\n           •Tengo más trabajo que ayer, pero menos que mañana.\n\n           •Chile es más largo que Nueva Zelandia.\n\n          Concesivas: Expresan una dificultad para lo que se expresa en la proposición principal. aunque, bien que, por más que, si bien.\n\n         Ejemplos:\n\n           •Por más que insistas, no iras.\n\n           •Si bien no habla rápido español, habla perfecto.\n \n           •Iré a tu casa aunque llueva.\n\n          Condicionales: Denotan condición o necesidad de que se verifique alguna circunstancia. si, con tal que, siempre que, como.\n\n         Ejemplos:\n\n           •Si hace calor, enciende el aire acondicionado.\n\n           •Con tal que te levantes temprano, no importa la hora que te duermas.\n     \n           •Vamos a la playa, siempre que haya buen clima.\n\n\n          Consecutivas: Indican una consecuencia de lo que se expresa en la proposición principal. pues luego, así que, de modo que, conque.\n  \n         Ejemplos:\n\n           •Así que si estudias te irá muy bien.\n\n           •Llegaré más temprano, de modo que espérame para que comamos juntos. \n\n           •El clima se puso del lado de los agricultores, pues luego de varios días de lluvia, podrán cosechar.\n\n          Finales: Denota el fin u objeto de lo manifestado en la oración principal. para que, a fin de que.\n\n         Ejemplos:\n\n           •A fin de que no hayan confusiones lo explicaré dos veces.\n\n           •Algunas sugerencias para que aprendas español.\n \n           •Para que practiques y aprendas vocabulario revisa nuestro sito de internet.\n\n          Temporales: Dan idea de tiempo. mientras, cuando.\n\n         Ejemplos:\n\n           •Mientras siga viniendo a la misma hora de siempre, no habrá problema.\n\n           •Nos vemos en el restaurante cuando terminen tus clases en Woodward.\n\n           •Cuando abran el banco haré el depósito.\n   ___________________________________________________________________________________________________________________________\n\n       Bibliografía: \n   \n       http://ortografía.es.mx\n");
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setCaretPosition(0);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1170, 590));

        jPanel13.setBackground(new java.awt.Color(0, 153, 153));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Conjunciones");
        jPanel13.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 190, 60));

        getContentPane().add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}