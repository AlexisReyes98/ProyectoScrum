
package View.GUI_AssignmentMobile;

import ConectionSQL.AssigMobile_DB;
import ConectionSQL.Marcas_DB;
import ConectionSQL.Mobile_DB;
import Model.Assignment;
import javax.swing.JOptionPane;

/**
 *
 * @author alexis
 */
public class Alta_Mobile_Marca extends javax.swing.JFrame {
    AssigMobile_DB assigMobile_db = new AssigMobile_DB();
    Marcas_DB marca_db = new Marcas_DB();
    Mobile_DB mobile_db = new Mobile_DB();

    /**
     * Creates new form Alta_Mobile_Marca
     */
    public Alta_Mobile_Marca() {
        initComponents();
        this.setTitle("Asignación de Móviles a una Marca");
        this.setLocationRelativeTo(null);
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
        regresar_MenuAssig = new javax.swing.JButton();
        alta_Mobile = new javax.swing.JButton();
        claveMarca = new javax.swing.JTextField();
        claveMobile = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regresar_MenuAssig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Regresar.png"))); // NOI18N
        regresar_MenuAssig.setText("Regresar a Menú Aisgnación");
        regresar_MenuAssig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresar_MenuAssigActionPerformed(evt);
            }
        });
        jPanel1.add(regresar_MenuAssig, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        alta_Mobile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/GuardarTodo.png"))); // NOI18N
        alta_Mobile.setText("Dar de alta");
        alta_Mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alta_MobileActionPerformed(evt);
            }
        });
        jPanel1.add(alta_Mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, 40));
        jPanel1.add(claveMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 120, -1));
        jPanel1.add(claveMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 120, -1));

        jLabel4.setText("Clave de la marca:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jLabel3.setText("Clave del móvil:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        jLabel2.setText("Alta de un móvil en una marca");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/home_wallpaper_0.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 330));

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

    private void alta_MobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alta_MobileActionPerformed
        boolean banMarca;
        boolean banMobil;
        boolean banAssigMobile;
        if (!"".equals(claveMobile.getText()) && !"".equals(claveMarca.getText())) {
            String clave_marca = claveMarca.getText();
            banMarca = marca_db.buscaMarca(clave_marca);
            if (banMarca) {
                int clave_mobile = Integer.parseInt(claveMobile.getText());
                banMobil = mobile_db.buscaMobile(clave_mobile);
                if (banMobil) {
                    banAssigMobile = assigMobile_db.buscaMobileMarca(clave_mobile);
                    if (banAssigMobile) {
                        JOptionPane.showMessageDialog(null, "El móvil ya estaba asignado","",JOptionPane.ERROR_MESSAGE);
                    } else {
                        Assignment a = new Assignment();
                        a.setClaveMobile(clave_mobile);
                        a.setClaveMarca(clave_marca);
                        assigMobile_db.altaAssignmentMobile(a);
                        JOptionPane.showMessageDialog(null, "Se asignó el móvil a la marca","",JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No existe un móvil con esa clave","",JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay marca con la clave proporcionada","",JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Porfavor, ingresa toda la información","",JOptionPane.ERROR_MESSAGE);
        }
        claveMobile.setText("");
        claveMarca.setText("");
    }//GEN-LAST:event_alta_MobileActionPerformed

    private void regresar_MenuAssigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresar_MenuAssigActionPerformed
        new Menu_AssignmentMobie().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresar_MenuAssigActionPerformed

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
            java.util.logging.Logger.getLogger(Alta_Mobile_Marca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alta_Mobile_Marca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alta_Mobile_Marca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alta_Mobile_Marca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alta_Mobile_Marca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alta_Mobile;
    private javax.swing.JTextField claveMarca;
    private javax.swing.JTextField claveMobile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton regresar_MenuAssig;
    // End of variables declaration//GEN-END:variables
}
