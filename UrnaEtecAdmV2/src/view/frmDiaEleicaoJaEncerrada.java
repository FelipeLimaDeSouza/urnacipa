/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author user
 */
public class frmDiaEleicaoJaEncerrada extends javax.swing.JDialog {

    /**
     * Creates new form frmDiaEleicaoJaEncerrada
     */
    private static frmRelatoriosInterno frmPai;
    public frmDiaEleicaoJaEncerrada(frmRelatoriosInterno parent, boolean modal) {
        this.frmPai = parent;
        this.setModal(modal);
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

        lblOk = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        lblOk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOkMouseClicked(evt);
            }
        });
        getContentPane().add(lblOk);
        lblOk.setBounds(136, 188, 92, 28);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/eleicaojaencerrada.png"))); // NOI18N
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, 0, 358, 248);

        setSize(new java.awt.Dimension(359, 245));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOkMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblOkMouseClicked

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
            java.util.logging.Logger.getLogger(frmDiaEleicaoJaEncerrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDiaEleicaoJaEncerrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDiaEleicaoJaEncerrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDiaEleicaoJaEncerrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmDiaEleicaoJaEncerrada dialog = new frmDiaEleicaoJaEncerrada(frmPai, true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblOk;
    // End of variables declaration//GEN-END:variables
}
