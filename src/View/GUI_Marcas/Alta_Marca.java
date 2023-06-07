
package View.GUI_Marcas;

import ConectionSQL.Marcas_DB;
import Model.Marca;
import javax.swing.JOptionPane;

/**
 *
 * @author alexis
 */
public class Alta_Marca extends javax.swing.JFrame {
    Marcas_DB marca_db = new Marcas_DB();

    /**
     * Creates new form Alta_Marca
     */
    public Alta_Marca() {
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
        regresarMenuMarcas = new javax.swing.JButton();
        altaMarca = new javax.swing.JButton();
        altaSitioWeb = new javax.swing.JTextField();
        altaNombre = new javax.swing.JTextField();
        altaClaveMarca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regresarMenuMarcas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Regresar.png"))); // NOI18N
        regresarMenuMarcas.setText("Regresar a Menú Marcas");
        regresarMenuMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarMenuMarcasActionPerformed(evt);
            }
        });
        jPanel1.add(regresarMenuMarcas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        altaMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/GuardarTodo.png"))); // NOI18N
        altaMarca.setText("Dar de alta");
        altaMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaMarcaActionPerformed(evt);
            }
        });
        jPanel1.add(altaMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));
        jPanel1.add(altaSitioWeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 150, -1));
        jPanel1.add(altaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 150, -1));
        jPanel1.add(altaClaveMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 150, -1));

        jLabel5.setText("Sitio Web:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        jLabel4.setText("Nombre de la marca:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jLabel3.setText("Clave de la marca:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        jLabel2.setText("Alta de marca registrada");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/home_wallpaper_0.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 350));

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

    private void regresarMenuMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarMenuMarcasActionPerformed
        new Menu_Marcas().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarMenuMarcasActionPerformed

    private void altaMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaMarcaActionPerformed
        if (!"".equals(altaClaveMarca.getText()) && !"".equals(altaNombre.getText()) && !"".equals(altaSitioWeb.getText())) {
            boolean banMarca;
            banMarca = marca_db.buscaMarca(altaClaveMarca.getText());
            if (banMarca) {
                JOptionPane.showMessageDialog(null, "La marca con la clave proporcionada ya existe","",JOptionPane.ERROR_MESSAGE);
            } else {
                Marca m = new Marca();
                m.setClaveMarca(altaClaveMarca.getText());
                m.setNombre(altaNombre.getText());
                m.setSitioWeb(altaSitioWeb.getText());
                marca_db.altaMarca(m);
                JOptionPane.showMessageDialog(null, "La marca fue dada de alta con éxito","",JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Porfavor, ingresa toda la información","",JOptionPane.ERROR_MESSAGE);
        }
        altaClaveMarca.setText("");
        altaNombre.setText("");
        altaSitioWeb.setText("");
    }//GEN-LAST:event_altaMarcaActionPerformed

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
            java.util.logging.Logger.getLogger(Alta_Marca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alta_Marca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alta_Marca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alta_Marca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alta_Marca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField altaClaveMarca;
    private javax.swing.JButton altaMarca;
    private javax.swing.JTextField altaNombre;
    private javax.swing.JTextField altaSitioWeb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton regresarMenuMarcas;
    // End of variables declaration//GEN-END:variables
}
