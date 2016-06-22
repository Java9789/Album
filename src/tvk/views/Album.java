package tvk.views;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Album extends JFrame {

    public Album(){
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(51, 51, 51));
        lblFoto.setIcon(new ImageIcon(getClass().getResource("/tvk/images/1.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFoto = new javax.swing.JLabel();
        btnDisminuir = new javax.swing.JButton();
        btnAumentar = new javax.swing.JButton();
        lblContador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFoto.setPreferredSize(new java.awt.Dimension(400, 292));

        btnDisminuir.setBackground(new java.awt.Color(51, 51, 51));
        btnDisminuir.setForeground(new java.awt.Color(255, 255, 255));
        btnDisminuir.setText("<<<");
        btnDisminuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisminuirActionPerformed(evt);
            }
        });

        btnAumentar.setBackground(new java.awt.Color(51, 51, 51));
        btnAumentar.setForeground(new java.awt.Color(255, 255, 255));
        btnAumentar.setText(">>>");
        btnAumentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAumentarActionPerformed(evt);
            }
        });

        lblContador.setForeground(new java.awt.Color(255, 255, 255));
        lblContador.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDisminuir)
                        .addGap(131, 131, 131)
                        .addComponent(lblContador)
                        .addGap(142, 142, 142)
                        .addComponent(btnAumentar))
                    .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDisminuir)
                    .addComponent(btnAumentar)
                    .addComponent(lblContador))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAumentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAumentarActionPerformed
        // TODO add your handling code here:        
        int XD = Integer.parseInt(lblContador.getText());
        int aa = XD + 1;
        lblContador.setText(String.valueOf(aa));
        switch(XD){
            case 0:
                lblFoto.setIcon(new ImageIcon(getClass().getResource("/tvk/images/1.png")));
                lblFoto.setPreferredSize(new Dimension(400, 292));                
                //lblContador.setText(String.valueOf(aa));
                break;
            case 1:
                lblFoto.setIcon(new ImageIcon(getClass().getResource("/tvk/images/2.jpg")));
                lblFoto.setPreferredSize(new Dimension(400, 292));                
                //lblContador.setText(String.valueOf(aa));
                break;
            case 2:
                lblFoto.setIcon(new ImageIcon(getClass().getResource("/tvk/images/3.jpg")));
                lblFoto.setPreferredSize(new Dimension(400, 292));                
                //lblContador.setText(String.valueOf(aa));
                break;
            case 3:
                lblFoto.setIcon(new ImageIcon(getClass().getResource("/tvk/images/4.jpg")));
                lblFoto.setPreferredSize(new Dimension(400, 292));                
                //lblContador.setText(String.valueOf(aa));
                break;
            case 4:
                lblFoto.setIcon(new ImageIcon(getClass().getResource("/tvk/images/5.jpg")));
                lblFoto.setPreferredSize(new Dimension(400, 292));                
                //lblContador.setText(String.valueOf(aa));
                // btnAumentar.setEnabled(false);
                break;
            case 5:
                lblFoto.setIcon(new ImageIcon(getClass().getResource("/tvk/images/6.png")));
                lblFoto.setPreferredSize(new Dimension(400, 292));                
                //lblContador.setText(String.valueOf(aa));                
                break;
        }        
    }//GEN-LAST:event_btnAumentarActionPerformed

    private void btnDisminuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisminuirActionPerformed
        // TODO add your handling code here:
        int XD = Integer.parseInt(lblContador.getText());
        int aa = XD - 1;
        switch(XD){
            case 0:
                lblFoto.setIcon(new ImageIcon(getClass().getResource("/tvk/images/1.png")));
                lblFoto.setPreferredSize(new Dimension(400, 292));                
                lblContador.setText(String.valueOf(aa));
                break;
            case 1:
                lblFoto.setIcon(new ImageIcon(getClass().getResource("/tvk/images/2.jpg")));
                lblFoto.setPreferredSize(new Dimension(400, 292));                
                lblContador.setText(String.valueOf(aa));
                break;
            case 2:
                lblFoto.setIcon(new ImageIcon(getClass().getResource("/tvk/images/3.jpg")));
                lblFoto.setPreferredSize(new Dimension(400, 292));                
                lblContador.setText(String.valueOf(aa));
                break;
            case 3:
                lblFoto.setIcon(new ImageIcon(getClass().getResource("/tvk/images/4.jpg")));
                lblFoto.setPreferredSize(new Dimension(400, 292));                
                lblContador.setText(String.valueOf(aa));
                break;
            case 4:
                lblFoto.setIcon(new ImageIcon(getClass().getResource("/tvk/images/5.jpg")));
                lblFoto.setPreferredSize(new Dimension(400, 292));                
                lblContador.setText(String.valueOf(aa));
                // btnAumentar.setEnabled(false);
                break;
            case 5:
                lblFoto.setIcon(new ImageIcon(getClass().getResource("/tvk/images/6.png")));
                lblFoto.setPreferredSize(new Dimension(400, 292));                
                lblContador.setText(String.valueOf(aa));                
                break;
        }        
    }//GEN-LAST:event_btnDisminuirActionPerformed

    public void XD(){
        
    }
    
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
            java.util.logging.Logger.getLogger(Album.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Album.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Album.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Album.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
                new Album().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAumentar;
    private javax.swing.JButton btnDisminuir;
    private javax.swing.JLabel lblContador;
    private javax.swing.JLabel lblFoto;
    // End of variables declaration//GEN-END:variables
}