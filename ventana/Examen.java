package ventana;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class Examen extends javax.swing.JInternalFrame {

    /**
     * Creates new form Examen
     */
    public Examen() {
        initComponents();
        question.setText(p.getPregunta(posicion));
        String[] a = r.setRespuestas(posicion);
        buttonGroup1.clearSelection(); // Borrar selecciones
        opc1.setText(a[0]);
        opc2.setText(a[1]);
        opc1.requestFocus();
        
    }

    int posicion = 0;
    Respuestas r = new Respuestas();
    Preguntas p = new Preguntas();
    Object[] select = {"", ""};

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        opc1 = new javax.swing.JRadioButton();
        opc2 = new javax.swing.JRadioButton();
        fin = new javax.swing.JButton();
        avanzar = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        question = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(opc1);
        opc1.setText("jRadioButton1");
        opc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc1ActionPerformed(evt);
            }
        });
        getContentPane().add(opc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 139, -1, -1));

        buttonGroup1.add(opc2);
        opc2.setText("jRadioButton2");
        opc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc2ActionPerformed(evt);
            }
        });
        getContentPane().add(opc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        fin.setText("Fin");
        fin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finActionPerformed(evt);
            }
        });
        getContentPane().add(fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, -1, -1));

        avanzar.setText("Avanzar");
        avanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avanzarActionPerformed(evt);
            }
        });
        getContentPane().add(avanzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 160, -1, -1));

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, -1, -1));

        question.setText("Pre 1");
        getContentPane().add(question, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void finActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finActionPerformed

        int calificacion = 0;
        for (int i = 0; i < 2; i++) {
            if (select[i].equals(r.getRespuesta(i))) {
                calificacion = calificacion + 1;

            }
        }
        calificacion = calificacion * 2;
        JOptionPane.showMessageDialog(null, "Your calificacion es" + calificacion);
    }//GEN-LAST:event_finActionPerformed

    private void opc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc1ActionPerformed
        select[posicion] = opc1.getLabel();
    }//GEN-LAST:event_opc1ActionPerformed

    private void opc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc2ActionPerformed
        select[posicion] = opc2.getLabel();
    }//GEN-LAST:event_opc2ActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        if (posicion > 0) {
            posicion--;
        }else{

        }
        if(posicion == 0) {
            regresar.setEnabled(false);
        }

        if (posicion > -1) {
            avanzar.setEnabled(true);
            question.setText(p.getPregunta(posicion));
            String[] a = r.setRespuestas(posicion);
            buttonGroup1.clearSelection(); // Borrar selecciones
            opc1.setText(a[0]);
            opc2.setText(a[1]);

            opc1.requestFocus();
        }
    }//GEN-LAST:event_regresarActionPerformed

    private void avanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avanzarActionPerformed

        if (posicion == 2) {
            avanzar.setEnabled(false);
            fin.setEnabled(true);
        }

        if (posicion < 5) {
            regresar.setEnabled(true);
            posicion++;
            question.setText(p.getPregunta(posicion));
            String[] a = r.setRespuestas(posicion);
            buttonGroup1.clearSelection(); // Borrar selecciones
            opc1.setText(a[0]);
            opc1.setText(a[1]);

            opc1.requestFocus();
        } else {
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_avanzarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avanzar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton fin;
    private javax.swing.JRadioButton opc1;
    private javax.swing.JRadioButton opc2;
    private javax.swing.JLabel question;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}
