/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebausuarios.Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class Juego extends javax.swing.JFrame {
    

    public int intentos = 3;
    public int aleatorio = (int) (Math.random()*11);
    public int numero = 0;
    
    public Juego() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnJuego = new javax.swing.JButton();
        txtIntento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(750, 500));
        setMinimumSize(new java.awt.Dimension(750, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(750, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(750, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(15, 96, 137));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebausuarios/Imagenes/TextoJuego1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 693, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebausuarios/Imagenes/TextoJuego2.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        jLabel2.setBackground(new java.awt.Color(25, 161, 229));
        jLabel2.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(15, 96, 137));
        jLabel2.setText("Intentos: ");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 160, 60));

        jLabel4.setBackground(new java.awt.Color(25, 161, 229));
        jLabel4.setForeground(new java.awt.Color(25, 161, 229));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebausuarios/Imagenes/TextoJuego3.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 212, -1, 60));

        txtNumero.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtNumero.setMaximumSize(new java.awt.Dimension(100, 28));
        txtNumero.setMinimumSize(new java.awt.Dimension(100, 28));
        txtNumero.setPreferredSize(new java.awt.Dimension(100, 28));
        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });
        jPanel1.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, -1, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/pruebausuarios/Imagenes/TextoJuego1.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, -10, 700, 130));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/pruebausuarios/Imagenes/TextoJuego3.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 530, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/pruebausuarios/Imagenes/TextoJuego2.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 480, 50));

        btnJuego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/pruebausuarios/Imagenes/BotonJuego1.png"))); // NOI18N
        btnJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJuegoActionPerformed(evt);
            }
        });
        jPanel1.add(btnJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 300, 90));

        txtIntento.setFont(new java.awt.Font("Felix Titling", 0, 24)); // NOI18N
        txtIntento.setForeground(new java.awt.Color(15, 96, 137));
        jPanel1.add(txtIntento, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void btnJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJuegoActionPerformed
                // TODO add your handling code here:
        numero=Integer.parseInt(txtNumero.getText());
        intentos--;
        if(intentos>0){ 
            if (numero==aleatorio){
                this.setEnabled(false);
                this.setVisible(false);
               
            }
            else{
                if(numero<aleatorio){
                    JOptionPane.showMessageDialog(null, "Es muy bajo\nIntenta otra vez");
                }
                else{
                   JOptionPane.showMessageDialog(null, "Es muy alto\nIntenta otra vez"); 
                }
            }
            txtIntento.setText(String.valueOf(intentos));
            txtNumero.setText("");
        }
        else{
            this.setEnabled(false);
            this.setVisible(false);
            
        }
        
    }  
        
        
    }//GEN-LAST:event_btnJuegoActionPerformed

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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJuego;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtIntento;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
