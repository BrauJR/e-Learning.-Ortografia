
public class AbrirMotor extends javax.swing.JFrame {

    /**
     * Creates new form AbrirMotor
     */
    public AbrirMotor() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    
  
    
            
    public static void main(String args[]) {
        Abrir abrir=new Abrir();
    abrir.setVisible(true);
    Inicio aparecer = new Inicio();
    try {
        for (int i = 0; i < 100; i++) {
        Thread.sleep(20);
        abrir.cargandonum.setText(Integer.toString(i)+"%");
        abrir.cargando.setValue(i);
        if(i==100){
            abrir.setVisible(false);
            aparecer.setVisible(true);
        }
    }
    }catch (Exception e){
        
    }
         
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 aparecer.setVisible(true);
                 abrir.setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
