/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.ClassificadosBean;
import bean.EleicaoBean;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import controller.ClassificadosController;
import controller.EleicaoController;
import java.awt.Desktop;
import java.io.File;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 *
 * @author user
 */
public class frmRelatoriosInterno extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmInternoRelatorios
     */
    private static frmDiaEleicaoEncerrada frmFilhoEnc;
    private static frmDiaEleicaoJaEncerrada frmFilhoEleJaEnc;
    public frmRelatoriosInterno() {
        initComponents();
    }
    
    public void carregaDados(){
    
        try {
            
            if(cmbEleicao.getSelectedIndex()>0){
                
                EleicaoController ec = new EleicaoController();
            
                ClassificadosController cc = new ClassificadosController();
                
                int index = cmbEleicao.getSelectedIndex();
                
                ArrayList<EleicaoBean> list = ec.controllerSelecionarEleicoesRel();
                int id = list.get(index-1).getEleicao_id();
                int eleitores = cc.controllerSelecionarTotalEleitores();
                
                if(eleitores>0){
                
                    lblQtdEleitores.setText(String.valueOf(eleitores));
                }else{
                
                    lblQtdEleitores.setText("0");
                    
                }
                int total = cc.controllerSelecionarTotal(id);

                if(total>0){

                    lblTotal.setText(String.valueOf(total));

                }else{

                    lblTotal.setText("0");

                }
                int total_validos = cc.controllerSelecionarTotalValidos(id);
                lblTotalValidos.setText(String.valueOf(total_validos));

                int brancos = cc.controllerSelecionarTotalBrancos(id);
                if(brancos>0){

                    lblVotosNulos.setText(String.valueOf(brancos));

                }else{

                    lblVotosNulos.setText("0");

                }

                if((total == 0)&&(brancos>=total)){

                    lblApelidoVencedor.setText("");

                }

                ArrayList<ClassificadosBean> classificados = cc.controllerSelecionarCandidato(list.get(index-1).getEleicao_id());
                DefaultTableModel dtm = (DefaultTableModel) tblVencedor.getModel();
                dtm.setNumRows(0);
                if(classificados.size()>0){

                    for (int i = 0; i < classificados.size(); i++) {
                        dtm.addRow(new Object[]{classificados.get(i).getChapa(),
                                    classificados.get(i).getApelido(), 
                                    classificados.get(i).getQtd_votos()});
                    }

                    if(classificados.get(0).getQtd_votos()>0){

                        lblApelidoVencedor.setText(classificados.get(0).getApelido());

                    }else{

                        lblApelidoVencedor.setText("");

                    }

                }else{
                
                    lblApelidoVencedor.setText("");
                
                }
                    
                
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void carregaCombos(){
    
        try {
            
            cmbEleicao.removeAllItems();
            
            EleicaoController ec = new EleicaoController();
            ArrayList<EleicaoBean> list = ec.controllerSelecionarEleicoesRel();
            
            cmbEleicao.addItem("Selecione uma Eleição");
            
            if(list.size()>=0){
            
                for (int i = 0; i < list.size(); i++) {

                    cmbEleicao.addItem(list.get(i).getEleicao_data());

                }
                
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
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

        cmbEleicao = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVencedor = new javax.swing.JTable();
        lblImprimir = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblQtdEleitores = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTotalValidos = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblApelidoVencedor = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblVotosNulos = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblEncerrarEleicao = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setBorder(null);
        getContentPane().setLayout(null);

        cmbEleicao.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cmbEleicao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma eleição" }));
        cmbEleicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEleicaoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbEleicao);
        cmbEleicao.setBounds(210, 30, 256, 34);

        tblVencedor.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tblVencedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Chapa", "Apelido", "Quantidade de Votos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVencedor.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tblVencedor);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 94, 398, 256);

        lblImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImprimirMouseClicked(evt);
            }
        });
        getContentPane().add(lblImprimir);
        lblImprimir.setBounds(258, 404, 194, 30);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setText("Número total de eleitores atuais: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(460, 110, 210, 19);

        lblQtdEleitores.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblQtdEleitores.setText("0");
        getContentPane().add(lblQtdEleitores);
        lblQtdEleitores.setBounds(460, 130, 210, 19);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Total de Votos validos:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(460, 210, 210, 19);

        lblTotalValidos.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblTotalValidos.setText("0");
        getContentPane().add(lblTotalValidos);
        lblTotalValidos.setBounds(460, 230, 210, 19);

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Vencedor:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(260, 360, 190, 19);

        lblApelidoVencedor.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblApelidoVencedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApelidoVencedor.setText("Jovi");
        getContentPane().add(lblApelidoVencedor);
        lblApelidoVencedor.setBounds(260, 380, 190, 19);

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Votos Brancos/Nulos:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(460, 260, 210, 19);

        lblVotosNulos.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblVotosNulos.setText("0");
        getContentPane().add(lblVotosNulos);
        lblVotosNulos.setBounds(460, 280, 210, 19);

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("Total de Votos: ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(460, 160, 210, 19);

        lblTotal.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblTotal.setText("0");
        getContentPane().add(lblTotal);
        lblTotal.setBounds(460, 180, 210, 19);

        lblEncerrarEleicao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEncerrarEleicao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEncerrarEleicaoMouseClicked(evt);
            }
        });
        getContentPane().add(lblEncerrarEleicao);
        lblEncerrarEleicao.setBounds(546, 334, 112, 26);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pu_adm_relatorios.png"))); // NOI18N
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, 0, 700, 459);

        setBounds(3, -24, 697, 479);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbEleicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEleicaoActionPerformed
        if(cmbEleicao.getSelectedIndex()==0){
            lblApelidoVencedor.setText("");
            lblQtdEleitores.setText("0");
            lblTotalValidos.setText("0");
            lblTotal.setText("0");
            lblVotosNulos.setText("0");
            DefaultTableModel dtm = (DefaultTableModel) tblVencedor.getModel();
            dtm.setNumRows(0);
        }else{
            carregaDados();
        }
    }//GEN-LAST:event_cmbEleicaoActionPerformed

    private void lblImprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImprimirMouseClicked
        
        SimpleDateFormat sdt = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss aa");
        
        if(cmbEleicao.getSelectedIndex()>0){
        
            Document documento = new Document();

            try {
                PdfWriter.getInstance(documento, new FileOutputStream("relatorios/Dados da eleição de "+
                        cmbEleicao.getSelectedItem()+".pdf"));
                documento.open();
                Font fonte = new Font(FontFamily.TIMES_ROMAN, 22, Font.BOLD);
                documento.add(new Paragraph("Relatório da Eleição do dia "+cmbEleicao.getSelectedItem(),
                        fonte));
                documento.add(new Paragraph(" "));
                documento.add(new Paragraph(" "));
                documento.add(new Paragraph("Quantidade de eleitores: "+lblQtdEleitores.getText()));
                documento.add(new Paragraph("Total de Votos: "+lblTotal.getText()));
                documento.add(new Paragraph("Total de Votos Validos: "+lblTotalValidos.getText()));
                documento.add(new Paragraph("Votos brancos/nulos: "+lblVotosNulos.getText()));
                documento.add(new Paragraph("Vencedor: "+lblApelidoVencedor.getText()));
                documento.add(new Paragraph("Data e hora: "+sdt.format(System.currentTimeMillis())));
                documento.add(new Paragraph(" "));
                documento.add(new Paragraph(" "));
                PdfPTable tabela = new PdfPTable(3);
                tabela.addCell(new Paragraph("Chapa"));
                tabela.addCell(new Paragraph("Apelido"));
                tabela.addCell(new Paragraph("Quantidade de Votos"));
                DefaultTableModel dtm = (DefaultTableModel) tblVencedor.getModel();
                for (int i = 0; i < dtm.getRowCount(); i++) {
                    String chapa = String.valueOf(dtm.getValueAt(i, 0));
                    tabela.addCell(new Paragraph(chapa));
                    String apelido = String.valueOf(dtm.getValueAt(i, 1));
                    tabela.addCell(new Paragraph(apelido));
                    String qtd = String.valueOf(dtm.getValueAt(i, 2));
                    tabela.addCell(new Paragraph(qtd));
                }
                
                documento.add(tabela);
                
            } catch (DocumentException | FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            }finally{

                documento.close();

            }

            try {
                Desktop.getDesktop().open(new File("relatorios/Dados da eleição de "+
                    cmbEleicao.getSelectedItem()+".pdf"));
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            
        }
    }//GEN-LAST:event_lblImprimirMouseClicked

    private void lblEncerrarEleicaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEncerrarEleicaoMouseClicked
        int index = cmbEleicao.getSelectedIndex();
        if(index > 0){
        
            try {
                
                EleicaoController ec = new EleicaoController();
                ClassificadosController cc = new ClassificadosController();
                ArrayList<EleicaoBean> list = ec.controllerSelecionarEleicoesRel();
                
                int id = list.get(index-1).getEleicao_id();
                
                int retornaStatus = cc.controllerValidaStatus(id);
                
                if(retornaStatus == 1){
                    
                    int valida = ec.controllerEncerraEleicao(id);
                    
                    if(valida == 1){
                    
                        int retorna = ec.controllerFinalizaEleitores();

                        if(retorna == 1){

                            frmFilhoEnc = new frmDiaEleicaoEncerrada(null, true);
                            frmFilhoEnc.setVisible(true);
                            cmbEleicao.setSelectedIndex(0);

                        }else{
                        
                            cmbEleicao.setSelectedIndex(0);
                        
                        }
                    }
                
                }else{

                    frmFilhoEleJaEnc = new frmDiaEleicaoJaEncerrada(null, true);
                    frmFilhoEleJaEnc.setVisible(true);
                    
                    cmbEleicao.setSelectedIndex(0);

                }
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            
        
        }
    }//GEN-LAST:event_lblEncerrarEleicaoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbEleicao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApelidoVencedor;
    private javax.swing.JLabel lblEncerrarEleicao;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblImprimir;
    private javax.swing.JLabel lblQtdEleitores;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalValidos;
    private javax.swing.JLabel lblVotosNulos;
    private javax.swing.JTable tblVencedor;
    // End of variables declaration//GEN-END:variables
}
