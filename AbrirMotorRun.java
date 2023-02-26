
public class AbrirMotorRun {
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

    // Variables declaration - do not modify                     
    // End of variables declaration                   
}
