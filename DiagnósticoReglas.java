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

public class DiagnósticoReglas extends javax.swing.JInternalFrame {

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

    public DiagnósticoReglas() {
        ocultarBarraTitulo();
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo1 = new javax.swing.ButtonGroup();
        Grupo2 = new javax.swing.ButtonGroup();
        Grupo3 = new javax.swing.ButtonGroup();
        Grupo4 = new javax.swing.ButtonGroup();
        Grupo5 = new javax.swing.ButtonGroup();
        Grupo6 = new javax.swing.ButtonGroup();
        Grupo7 = new javax.swing.ButtonGroup();
        Grupo8 = new javax.swing.ButtonGroup();
        jPanel13 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sima = new javax.swing.JRadioButton();
        cima = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        baya = new javax.swing.JRadioButton();
        vaya = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ajito = new javax.swing.JRadioButton();
        agito = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        honda = new javax.swing.JRadioButton();
        onda = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        quilogramo = new javax.swing.JRadioButton();
        kilogramo = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        rábano = new javax.swing.JRadioButton();
        rrábano = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        rallado = new javax.swing.JRadioButton();
        rayado = new javax.swing.JRadioButton();
        enpírico = new javax.swing.JRadioButton();
        empírico = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setFocusable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(0, 153, 153));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Examen diagnóstico de reglas ortográficas");
        jPanel13.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 430, 60));

        getContentPane().add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setText("Selecciona la respuesta que consideres correcta");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 490, 30));

        sima.setBackground(new java.awt.Color(255, 255, 255));
        Grupo1.add(sima);
        sima.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        sima.setText("sima");
        sima.setFocusable(false);
        sima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simaActionPerformed(evt);
            }
        });
        getContentPane().add(sima, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 100, -1));

        cima.setBackground(new java.awt.Color(255, 255, 255));
        Grupo1.add(cima);
        cima.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        cima.setText("cima");
        cima.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cima.setFocusable(false);
        cima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cimaActionPerformed(evt);
            }
        });
        getContentPane().add(cima, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 100, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setText("2. ¡Cuidado! esas ____________ son venenosas");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 490, 30));

        baya.setBackground(new java.awt.Color(255, 255, 255));
        Grupo2.add(baya);
        baya.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        baya.setText("bayas");
        baya.setFocusable(false);
        getContentPane().add(baya, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        vaya.setBackground(new java.awt.Color(255, 255, 255));
        Grupo2.add(vaya);
        vaya.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        vaya.setText("vayas");
        vaya.setFocusable(false);
        getContentPane().add(vaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel7.setText("1. Ese cantante se encuentra en la ___________ del éxito.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 450, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel9.setText("3. Si ____________ el refresco se puede derramar.");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 490, 30));

        ajito.setBackground(new java.awt.Color(255, 255, 255));
        Grupo3.add(ajito);
        ajito.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ajito.setText("ajito");
        ajito.setFocusable(false);
        getContentPane().add(ajito, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, -1));

        agito.setBackground(new java.awt.Color(255, 255, 255));
        Grupo3.add(agito);
        agito.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        agito.setText("agito");
        agito.setFocusable(false);
        getContentPane().add(agito, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel11.setText("4. Es una piscina muy ____________ ; así que ten cuidado.");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 490, 30));

        honda.setBackground(new java.awt.Color(255, 255, 255));
        Grupo4.add(honda);
        honda.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        honda.setText("honda");
        honda.setFocusable(false);
        getContentPane().add(honda, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, -1, -1));

        onda.setBackground(new java.awt.Color(255, 255, 255));
        Grupo4.add(onda);
        onda.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        onda.setText("onda");
        onda.setFocusable(false);
        getContentPane().add(onda, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel8.setText("5. ¿Cuál de las siguientes palabras está escita correctamente?");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 450, 30));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel12.setText("6. Encuentra la palabra escrita correctamente");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 490, 30));

        quilogramo.setBackground(new java.awt.Color(255, 255, 255));
        Grupo6.add(quilogramo);
        quilogramo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        quilogramo.setText("quilogramo");
        quilogramo.setFocusable(false);
        quilogramo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quilogramoActionPerformed(evt);
            }
        });
        getContentPane().add(quilogramo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, -1, -1));

        kilogramo.setBackground(new java.awt.Color(255, 255, 255));
        Grupo6.add(kilogramo);
        kilogramo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        kilogramo.setText("kilogramo");
        kilogramo.setFocusable(false);
        getContentPane().add(kilogramo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel13.setText("7. ¿Cuál de las siguientes palabras esta escrita incorrectamente?");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, 490, 30));

        rábano.setBackground(new java.awt.Color(255, 255, 255));
        Grupo7.add(rábano);
        rábano.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        rábano.setText("rábano");
        rábano.setFocusable(false);
        rábano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rábanoActionPerformed(evt);
            }
        });
        getContentPane().add(rábano, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, -1, -1));

        rrábano.setBackground(new java.awt.Color(255, 255, 255));
        Grupo7.add(rrábano);
        rrábano.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        rrábano.setText("rrábano");
        rrábano.setFocusable(false);
        getContentPane().add(rrábano, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 460, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel14.setText("8. Mi madre me ha encargado que compre queso ___________ .");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 500, 490, 30));

        rallado.setBackground(new java.awt.Color(255, 255, 255));
        rallado.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        rallado.setText("rallado");
        rallado.setFocusable(false);
        getContentPane().add(rallado, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 540, -1, -1));

        rayado.setBackground(new java.awt.Color(255, 255, 255));
        rayado.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        rayado.setText("rayado");
        rayado.setFocusable(false);
        getContentPane().add(rayado, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 580, -1, -1));

        enpírico.setBackground(new java.awt.Color(255, 255, 255));
        Grupo5.add(enpírico);
        enpírico.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        enpírico.setText("enpírico");
        enpírico.setFocusable(false);
        enpírico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enpíricoActionPerformed(evt);
            }
        });
        getContentPane().add(enpírico, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, -1, -1));

        empírico.setBackground(new java.awt.Color(255, 255, 255));
        Grupo5.add(empírico);
        empírico.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        empírico.setText("empírico");
        empírico.setFocusable(false);
        getContentPane().add(empírico, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 220, -1, -1));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1170, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_simaActionPerformed

    private void cimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cimaActionPerformed

    }//GEN-LAST:event_cimaActionPerformed

    private void enpíricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enpíricoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enpíricoActionPerformed

    private void quilogramoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quilogramoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quilogramoActionPerformed

    private void rábanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rábanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rábanoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

     
  if (cima.isSelected() && baya.isSelected() && agito.isSelected() && honda.isSelected() && empírico.isSelected()  && kilogramo.isSelected() && rrábano.isSelected() && rayado.isSelected()) {
    JOptionPane.showMessageDialog(null, "Eres grande bro");
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Grupo1;
    private javax.swing.ButtonGroup Grupo2;
    private javax.swing.ButtonGroup Grupo3;
    private javax.swing.ButtonGroup Grupo4;
    private javax.swing.ButtonGroup Grupo5;
    private javax.swing.ButtonGroup Grupo6;
    private javax.swing.ButtonGroup Grupo7;
    private javax.swing.ButtonGroup Grupo8;
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
