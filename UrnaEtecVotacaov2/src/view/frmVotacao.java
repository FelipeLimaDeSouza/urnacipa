/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.CandidatoBean;
import controller.CandidatoController;
import controller.EleitorController;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author user
 */
public class frmVotacao extends javax.swing.JFrame {

    /**
     * Creates new form frmVotacao
     */
    private int aluno_id;
    private int eleicao_id;
    private int cand_id;
    public frmVotacao() {
        initComponents();
        
    }
    
    public void recebeId(int id, int eleicao){
        this.aluno_id = id;
        this.eleicao_id = eleicao;
    }
    
    public void insereLbl(String num){
    
        String total = lblNumeroFinal.getText();
        
        if(total.length()<2){
        
            lblNumeroFinal.setText(total+num);
            
            if(lblNumeroFinal.getText().length() == 2){
            
                try {
                
                    CandidatoController cc = new CandidatoController();

                    CandidatoBean cb = cc.controllerSelecionaCandidato(lblNumeroFinal.getText(), eleicao_id);

                    lblApelidoCandidato.setText(cb.getNome());
                    
                    cand_id = cb.getId();
                    
                    String caminho = "../../UrnaEtecAdmV2/dist/";
                    
                    ImageIcon image = new ImageIcon(caminho+cb.getImagem());
                    
                    Image img = image.getImage().getScaledInstance(lblImagemCandidato.getWidth(), 
                        lblImagemCandidato.getHeight(), Image.SCALE_SMOOTH);

                    lblImagemCandidato.setIcon(new ImageIcon(img));

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            
            }
            
            
        }
            
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNumero0 = new javax.swing.JLabel();
        lblNumero8 = new javax.swing.JLabel();
        lblNumero4 = new javax.swing.JLabel();
        lblNumero2 = new javax.swing.JLabel();
        lblConfirma = new javax.swing.JLabel();
        lblNumero1 = new javax.swing.JLabel();
        lblNumero9 = new javax.swing.JLabel();
        lblNumero7 = new javax.swing.JLabel();
        lblNumeroFinal = new javax.swing.JLabel();
        lblNumero5 = new javax.swing.JLabel();
        lblNumero6 = new javax.swing.JLabel();
        lblBranco = new javax.swing.JLabel();
        lblNumero3 = new javax.swing.JLabel();
        lblImagemCandidato = new javax.swing.JLabel();
        lblApelidoCandidato = new javax.swing.JLabel();
        lblCorrige = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        lblNumero0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNumero0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNumero0MouseClicked(evt);
            }
        });
        getContentPane().add(lblNumero0);
        lblNumero0.setBounds(308, 466, 110, 116);

        lblNumero8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNumero8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNumero8MouseClicked(evt);
            }
        });
        getContentPane().add(lblNumero8);
        lblNumero8.setBounds(308, 340, 110, 116);

        lblNumero4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNumero4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNumero4MouseClicked(evt);
            }
        });
        getContentPane().add(lblNumero4);
        lblNumero4.setBounds(186, 212, 110, 116);

        lblNumero2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNumero2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNumero2MouseClicked(evt);
            }
        });
        getContentPane().add(lblNumero2);
        lblNumero2.setBounds(308, 84, 110, 116);

        lblConfirma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblConfirma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblConfirmaMouseClicked(evt);
            }
        });
        getContentPane().add(lblConfirma);
        lblConfirma.setBounds(426, 596, 110, 116);

        lblNumero1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNumero1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNumero1MouseClicked(evt);
            }
        });
        getContentPane().add(lblNumero1);
        lblNumero1.setBounds(186, 84, 110, 116);

        lblNumero9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNumero9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNumero9MouseClicked(evt);
            }
        });
        getContentPane().add(lblNumero9);
        lblNumero9.setBounds(428, 340, 110, 116);

        lblNumero7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNumero7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNumero7MouseClicked(evt);
            }
        });
        getContentPane().add(lblNumero7);
        lblNumero7.setBounds(186, 340, 110, 116);

        lblNumeroFinal.setFont(new java.awt.Font("SansSerif", 0, 52)); // NOI18N
        lblNumeroFinal.setForeground(new java.awt.Color(88, 88, 88));
        lblNumeroFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblNumeroFinal);
        lblNumeroFinal.setBounds(680, 460, 320, 94);

        lblNumero5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNumero5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNumero5MouseClicked(evt);
            }
        });
        getContentPane().add(lblNumero5);
        lblNumero5.setBounds(308, 212, 110, 116);

        lblNumero6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNumero6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNumero6MouseClicked(evt);
            }
        });
        getContentPane().add(lblNumero6);
        lblNumero6.setBounds(428, 212, 110, 116);

        lblBranco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBranco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBrancoMouseClicked(evt);
            }
        });
        getContentPane().add(lblBranco);
        lblBranco.setBounds(308, 596, 110, 116);

        lblNumero3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNumero3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNumero3MouseClicked(evt);
            }
        });
        getContentPane().add(lblNumero3);
        lblNumero3.setBounds(428, 84, 110, 116);
        getContentPane().add(lblImagemCandidato);
        lblImagemCandidato.setBounds(680, 80, 320, 366);

        lblApelidoCandidato.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lblApelidoCandidato.setForeground(new java.awt.Color(88, 88, 88));
        lblApelidoCandidato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblApelidoCandidato);
        lblApelidoCandidato.setBounds(680, 560, 320, 30);

        lblCorrige.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCorrige.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCorrigeMouseClicked(evt);
            }
        });
        getContentPane().add(lblCorrige);
        lblCorrige.setBounds(186, 596, 110, 116);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pu_votacao.png"))); // NOI18N
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, 0, 1200, 800);

        setSize(new java.awt.Dimension(1196, 797));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblNumero1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNumero1MouseClicked
        insereLbl("1");
    }//GEN-LAST:event_lblNumero1MouseClicked

    private void lblNumero2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNumero2MouseClicked
        insereLbl("2");
    }//GEN-LAST:event_lblNumero2MouseClicked

    private void lblNumero3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNumero3MouseClicked
        insereLbl("3");
    }//GEN-LAST:event_lblNumero3MouseClicked

    private void lblNumero4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNumero4MouseClicked
        insereLbl("4");
    }//GEN-LAST:event_lblNumero4MouseClicked

    private void lblNumero5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNumero5MouseClicked
        insereLbl("5");
    }//GEN-LAST:event_lblNumero5MouseClicked

    private void lblNumero6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNumero6MouseClicked
        insereLbl("6");
    }//GEN-LAST:event_lblNumero6MouseClicked

    private void lblNumero7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNumero7MouseClicked
        insereLbl("7");
    }//GEN-LAST:event_lblNumero7MouseClicked

    private void lblNumero8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNumero8MouseClicked
        insereLbl("8");
    }//GEN-LAST:event_lblNumero8MouseClicked

    private void lblNumero9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNumero9MouseClicked
        insereLbl("9");
    }//GEN-LAST:event_lblNumero9MouseClicked

    private void lblNumero0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNumero0MouseClicked
        insereLbl("0");
    }//GEN-LAST:event_lblNumero0MouseClicked

    private void lblBrancoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBrancoMouseClicked
        try {
            
            CandidatoController cc = new CandidatoController();
            
            int retorna = cc.controllerVotar(0, eleicao_id, aluno_id);
            
            if(retorna == 1){
            
                frmVotoRealizado frm = new frmVotoRealizado();
                frm.setVisible(true);
                this.dispose();
            
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_lblBrancoMouseClicked

    private void lblConfirmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConfirmaMouseClicked
        
        if((lblNumeroFinal.getText().length() == 2) && (cand_id != 0)){
        
            try {
                
                EleitorController ec = new EleitorController();
                
                int valida = ec.controllerVotar(aluno_id, eleicao_id, Integer.parseInt(lblNumeroFinal.getText()));
                
                if(valida == 1){
                
                    frmVotoRealizado frm = new frmVotoRealizado();
                    frm.setVisible(true);
                    this.dispose();
                
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_lblConfirmaMouseClicked

    private void lblCorrigeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCorrigeMouseClicked
        lblNumeroFinal.setText("");
        lblImagemCandidato.setIcon(null);
        lblApelidoCandidato.setText("");
        cand_id = 0;
    }//GEN-LAST:event_lblCorrigeMouseClicked

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
            java.util.logging.Logger.getLogger(frmVotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVotacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblApelidoCandidato;
    private javax.swing.JLabel lblBranco;
    private javax.swing.JLabel lblConfirma;
    private javax.swing.JLabel lblCorrige;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblImagemCandidato;
    private javax.swing.JLabel lblNumero0;
    private javax.swing.JLabel lblNumero1;
    private javax.swing.JLabel lblNumero2;
    private javax.swing.JLabel lblNumero3;
    private javax.swing.JLabel lblNumero4;
    private javax.swing.JLabel lblNumero5;
    private javax.swing.JLabel lblNumero6;
    private javax.swing.JLabel lblNumero7;
    private javax.swing.JLabel lblNumero8;
    private javax.swing.JLabel lblNumero9;
    private javax.swing.JLabel lblNumeroFinal;
    // End of variables declaration//GEN-END:variables
}
