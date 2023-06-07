
package View.GUI_Marcas;

import ConectionSQL.Marcas_DB;
import javax.swing.JOptionPane;

/**
 *
 * @author alexis
 */
public class Baja_Marca extends javax.swing.JFrame {
    Marcas_DB marca_db = new Marcas_DB();

    /**
     * Creates new form Baja_Marca
     */
    public Baja_Marca() {
        initComponents();
        this.setTitle("Control de Marcas");
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
        regresaMenuMarcas = new javax.swing.JButton();
        bajaMarca = new javax.swing.JButton();
        claveMarca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regresaMenuMarcas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Regresar.png"))); // NOI18N
        regresaMenuMarcas.setText("Regresar a Menú Marcas");
        regresaMenuMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresaMenuMarcasActionPerformed(evt);
            }
        });
        jPanel1.add(regresaMenuMarcas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        bajaMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Borrar.png"))); // NOI18N
        bajaMarca.setText("Dar de baja");
        bajaMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaMarcaActionPerformed(evt);
            }
        });
        jPanel1.add(bajaMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));
        jPanel1.add(claveMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 170, -1));

        jLabel3.setText("Clave de la marca:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel2.setText("Baja de Marca Registrada");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/home_wallpaper_0.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresaMenuMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresaMenuMarcasActionPerformed
        new Menu_Marcas().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresaMenuMarcasActionPerformed

    private void bajaMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaMarcaActionPerformed
        if (!"".equals(claveMarca.getText())) {
            boolean ban;
            ban = marca_db.buscaMarca(claveMarca.getText());
            if (ban) {
                marca_db.bajaMarca(claveMarca.getText());
                JOptionPane.showMessageDialog(null, "La marca fue dado de baja con éxito","",JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null, "No se encontró una marca con la clave proporcionada","",JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Porfavor, ingresa toda la información","",JOptionPane.ERROR_MESSAGE);
        }
        claveMarca.setText("");
    }//GEN-LAST:event_bajaMarcaActionPerformed

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
            java.util.logging.Logger.getLogger(Baja_Marca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Baja_Marca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Baja_Marca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Baja_Marca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Baja_Marca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bajaMarca;
    private javax.swing.JTextField claveMarca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton regresaMenuMarcas;
    // End of variables declaration//GEN-END:variables
}
