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

public class DiagnósticoSignos extends javax.swing.JInternalFrame {

       private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension dimBarra = null;
    private JTextField textField;
    private JPasswordField passwordField;

    public void ocultarBarraTitulo() {
        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        dimBarra = Barra.getPreferredSize();
        Barra.setSize(0, 0);
        Barra.setPreferredSize(new Dimension(0, 0));
        repaint();
    }
    
    public DiagnósticoSignos() {
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
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cima = new javax.swing.JRadioButton();
        sima = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        vaya = new javax.swing.JRadioButton();
        baya = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        ajito = new javax.swing.JRadioButton();
        agito = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        honda = new javax.swing.JRadioButton();
        onda = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        enpírico = new javax.swing.JRadioButton();
        empírico = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        quilogramo = new javax.swing.JRadioButton();
        kilogramo = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        rábano = new javax.swing.JRadioButton();
        rrábano = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        rallado = new javax.swing.JRadioButton();
        rayado = new javax.swing.JRadioButton();

        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(0, 153, 153));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Examen diagnóstico de signos de puntuación");
        jPanel13.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 430, 60));

        getContentPane().add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/calificarp.png"))); // NOI18N
        jButton1.setText("Calificar");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/calificarp.png"))); // NOI18N
        jButton1.setFocusPainted(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/calificarg.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/calificarg.png"))); // NOI18N
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 500, 90, 90));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setText("Selecciona la respuesta que consideres correcta");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 490, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel7.setText("1. ¿Qué oración está escrita correctamente?");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 450, 30));

        cima.setBackground(new java.awt.Color(255, 255, 255));
        cima.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        cima.setText("La tarde era gris, fría y lluviosa.");
        cima.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cima.setFocusable(false);
        cima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cimaActionPerformed(evt);
            }
        });
        jPanel1.add(cima, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 290, -1));

        sima.setBackground(new java.awt.Color(255, 255, 255));
        sima.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        sima.setText("La tarde era gris y fría y lluviosa.");
        sima.setFocusable(false);
        sima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simaActionPerformed(evt);
            }
        });
        jPanel1.add(sima, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 280, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setText("2. Los signos de admiración se colocan _____________________.");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 490, 30));

        vaya.setBackground(new java.awt.Color(255, 255, 255));
        vaya.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        vaya.setText("Solamente al final de palabras o frases.");
        vaya.setFocusable(false);
        jPanel1.add(vaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        baya.setBackground(new java.awt.Color(255, 255, 255));
        baya.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        baya.setText("Al principio y al final de palabras o frases.");
        baya.setFocusable(false);
        jPanel1.add(baya, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel9.setText("3. Selecciona la oración con los signos utilizados correctamente.");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 490, 30));

        ajito.setBackground(new java.awt.Color(255, 255, 255));
        ajito.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ajito.setText("¿Fuego, fuego gritó el joven, aterrorizado?");
        ajito.setFocusable(false);
        jPanel1.add(ajito, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        agito.setBackground(new java.awt.Color(255, 255, 255));
        agito.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        agito.setText("¡Fuego, fuego gritó el joven, aterrorizado!");
        agito.setFocusable(false);
        jPanel1.add(agito, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel11.setText("4. El punto y coma sirve para...");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 490, 30));

        honda.setBackground(new java.awt.Color(255, 255, 255));
        honda.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        honda.setText("Separar oraciones consecutivas.");
        honda.setFocusable(false);
        jPanel1.add(honda, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, -1, -1));

        onda.setBackground(new java.awt.Color(255, 255, 255));
        onda.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        onda.setText("Dar fin a un texto.");
        onda.setFocusable(false);
        jPanel1.add(onda, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel8.setText("5. Después de una abreviatura se coloca un __________ .");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, 450, 30));

        enpírico.setBackground(new java.awt.Color(255, 255, 255));
        enpírico.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        enpírico.setText("paréntesis");
        enpírico.setFocusable(false);
        enpírico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enpíricoActionPerformed(evt);
            }
        });
        jPanel1.add(enpírico, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, -1, -1));

        empírico.setBackground(new java.awt.Color(255, 255, 255));
        empírico.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empírico.setText("punto");
        empírico.setFocusable(false);
        jPanel1.add(empírico, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel12.setText("6. Qué signos faltan en esta oración");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 490, 30));

        quilogramo.setBackground(new java.awt.Color(255, 255, 255));
        quilogramo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        quilogramo.setText("¡ !");
        quilogramo.setFocusable(false);
        quilogramo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quilogramoActionPerformed(evt);
            }
        });
        jPanel1.add(quilogramo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, -1, -1));

        kilogramo.setBackground(new java.awt.Color(255, 255, 255));
        kilogramo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        kilogramo.setText("¿ ?");
        kilogramo.setFocusable(false);
        kilogramo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kilogramoActionPerformed(evt);
            }
        });
        jPanel1.add(kilogramo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel13.setText("7. ¿Cuál es la opción correcta?");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 340, 490, 30));

        rábano.setBackground(new java.awt.Color(255, 255, 255));
        rábano.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        rábano.setText("Pero hijo, ¿donde te has metido?");
        rábano.setFocusable(false);
        rábano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rábanoActionPerformed(evt);
            }
        });
        jPanel1.add(rábano, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, -1, -1));

        rrábano.setBackground(new java.awt.Color(255, 255, 255));
        rrábano.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        rrábano.setText("Pero, hijo , ¿donde te has metido?");
        rrábano.setFocusable(false);
        rrábano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rrábanoActionPerformed(evt);
            }
        });
        jPanel1.add(rrábano, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel14.setText("8. Hola ¿cómo estas.  Selecciona los signos que hacen falta.");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, 490, 30));

        rallado.setBackground(new java.awt.Color(255, 255, 255));
        rallado.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        rallado.setText("coma, diéresis, punto.");
        rallado.setFocusable(false);
        jPanel1.add(rallado, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 500, -1, -1));

        rayado.setBackground(new java.awt.Color(255, 255, 255));
        rayado.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        rayado.setText("coma, acento, signo de interrogación.");
        rayado.setFocusable(false);
        rayado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rayadoActionPerformed(evt);
            }
        });
        jPanel1.add(rayado, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 540, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1170, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (cima.isSelected() && baya.isSelected() && agito.isSelected() && honda.isSelected() && empírico.isSelected()  && kilogramo.isSelected() && rrábano.isSelected() && rayado.isSelected()) {
           
        }

        // 1
        if (cima.isSelected()) {
            cima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/palomita.jpg")));
        } else if (sima.isSelected()) {
            sima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/eqis.gif")));
            cima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/palomita.jpg")));
        }
        // 2
        if (baya.isSelected()) {
            baya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/palomita.jpg")));
        } else if (vaya.isSelected()) {
            vaya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/eqis.gif")));
            baya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/palomita.jpg")));
        }
        //3
        if (ajito.isSelected()) {
            ajito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/eqis.gif")));
            agito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/palomita.jpg")));
        } else if (agito.isSelected()) {
            agito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/palomita.jpg")));
        }
        //4
        if (honda.isSelected()) {
            honda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/palomita.jpg")));
        } else if (onda.isSelected()) {
            onda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/eqis.gif")));
            honda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/palomita.jpg")));
        }
        //5
        if (enpírico.isSelected()) {
            enpírico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/eqis.gif")));
            empírico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/palomita.jpg")));
        } else if (empírico.isSelected()) {
            empírico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/palomita.jpg")));
        }
        //6
        if (quilogramo.isSelected()) {
            quilogramo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/eqis.gif")));
            kilogramo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/palomita.jpg")));
        } else if (kilogramo.isSelected()) {
            kilogramo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/palomita.jpg")));
        }
        //7
        if (rábano.isSelected()) {
            rábano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/eqis.gif")));
            rrábano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/palomita.jpg")));
        } else if (rrábano.isSelected()) {
            rrábano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/palomita.jpg")));
        }
        //8
        if (rallado.isSelected()) {
            rallado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/eqis.gif")));
            rayado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/palomita.jpg")));
        } else if (rayado.isSelected()) {
            rayado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/palomita.jpg")));
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void cimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cimaActionPerformed

    }//GEN-LAST:event_cimaActionPerformed

    private void simaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_simaActionPerformed

    private void enpíricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enpíricoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enpíricoActionPerformed

    private void quilogramoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quilogramoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quilogramoActionPerformed

    private void rábanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rábanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rábanoActionPerformed

    private void kilogramoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kilogramoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kilogramoActionPerformed

    private void rrábanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rrábanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rrábanoActionPerformed

    private void rayadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rayadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rayadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton agito;
    private javax.swing.JRadioButton ajito;
    private javax.swing.JRadioButton baya;
    private javax.swing.JRadioButton cima;
    private javax.swing.JRadioButton empírico;
    private javax.swing.JRadioButton enpírico;
    private javax.swing.JRadioButton honda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JRadioButton kilogramo;
    private javax.swing.JRadioButton onda;
    private javax.swing.JRadioButton quilogramo;
    private javax.swing.JRadioButton rallado;
    private javax.swing.JRadioButton rayado;
    private javax.swing.JRadioButton rrábano;
    private javax.swing.JRadioButton rábano;
    private javax.swing.JRadioButton sima;
    private javax.swing.JRadioButton vaya;
    // End of variables declaration//GEN-END:variables
}
