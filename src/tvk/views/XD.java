package tvk.views;

import java.awt.Image;
import java.io.File;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class XD extends javax.swing.JFrame {
    Image foto; 
    Vector imagenes = new Vector(); 
    int index = 0; 
    String folder = "/tvk/images/";
    //String folder = "F:\\Java\\Album\\src\\tvk\\images";
    
    public XD(){
        initComponents();
        cargarAlbum();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblFoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Adelante");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 286, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        fotoAtras();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        fotoAdelante();
    }//GEN-LAST:event_jButton2ActionPerformed

    //Cargamos el album de imagenes de la carpeta donde se encuentran...
    void cargarAlbum(){ 
        imagenes.clear(); 
        index = 0; 
        String album = ("F:\\Java\\Album\\src\\tvk\\images"); 
        File albumCarpeta = new File (album);  
        folder = albumCarpeta.getName(); 
        System.out.println(albumCarpeta.getName()); 
        File[] fotos = albumCarpeta.listFiles(); 
        for (File foto1 : fotos) {
            if (foto1.isFile()) {
                imagenes.add(foto1.getName());
                System.out.println(foto1.getName());
            } 
        }
        // lblFoto.setIcon(new javax.swing.ImageIcon(folder+"\\"+(String)imagenes.elementAt(0))); 
        lblFoto.setIcon(new ImageIcon(getClass().getResource("tvk/images/" + imagenes.elementAt(0))));
        System.out.println("._.");
        System.out.println(imagenes.elementAt(0));
    }
 
    // Despues agregamos lo dos procedimiento del movimiento..
    void fotoAdelante(){ 
        System.out.println("Adelante .."); 
        if((index+1) < imagenes.size()){ 
            index++; 
            ImageIcon imagen = new ImageIcon(folder+"\\"+(String)imagenes.elementAt(index)); 
            lblFoto.setIcon(imagen); 
            System.out.println(index + " : " + folder+"\\"+(String)imagenes.elementAt(index)); 
        } else { 
            JOptionPane.showMessageDialog(null, "Fin de las Fotos del Album","Atencion",JOptionPane.OK_OPTION);      
        } 
    }  
  
    void fotoAtras(){ 
        System.out.println("Atras .."); 
        if((index-1) > -1){ 
            index--; 
            ImageIcon imagen = new ImageIcon(folder+"\\"+(String)imagenes.elementAt(index)); 
            lblFoto.setIcon(imagen); 
            System.out.println(index + " : " + folder+"\\"+(String)imagenes.elementAt(index)); 
        } else { 
            JOptionPane.showMessageDialog(null, "Fin de las Fotos del Album","Atencion",JOptionPane.OK_OPTION );      
        } 
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(XD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lblFoto;
    // End of variables declaration//GEN-END:variables
}
