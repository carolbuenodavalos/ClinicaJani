/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import dao.AgendamentoDao;
import dao.CadastroDao;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import models.AgendamentoModel;
import models.CadastroModel;

/**
 *
 * @author marcu
 */
public class Relatorio extends javax.swing.JFrame {

    /**
     * Creates new form Relatorio
     */
    public Relatorio() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(255, 204,255));
        tHeader();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaRelatorio = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CampoNome = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jVoltar1 = new javax.swing.JButton();
        CampoData = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        TabelaRelatorio.setBackground(new java.awt.Color(204, 204, 255));
        TabelaRelatorio.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        TabelaRelatorio.setForeground(new java.awt.Color(102, 102, 102));
        TabelaRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome do Cliente", "Data", "Horário"
            }
        ));
        TabelaRelatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TabelaRelatorio.setGridColor(new java.awt.Color(153, 153, 153));
        TabelaRelatorio.setSelectionBackground(new java.awt.Color(255, 204, 255));
        TabelaRelatorio.setSelectionForeground(new java.awt.Color(51, 51, 51));
        TabelaRelatorio.setShowGrid(true);
        TabelaRelatorio.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(TabelaRelatorio);

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("RELATÓRIO");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel2.setText("Data :");

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel4.setText("Nome :");

        CampoNome.setBackground(new java.awt.Color(255, 255, 255));
        CampoNome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 255), 3, true));
        CampoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeActionPerformed(evt);
            }
        });
        CampoNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoNomeKeyTyped(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 102, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BUSCAR");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 255), 4));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jVoltar1.setBackground(new java.awt.Color(204, 102, 255));
        jVoltar1.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jVoltar1.setForeground(new java.awt.Color(255, 255, 255));
        jVoltar1.setText("VOLTAR");
        jVoltar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 255), 5, true));
        jVoltar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jVoltar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jVoltar1MouseClicked(evt);
            }
        });
        jVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVoltar1ActionPerformed(evt);
            }
        });

        CampoData.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 255), 3, true));
        CampoData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jVoltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(CampoData, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(168, 168, 168)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jLabel1)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jVoltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoNomeKeyTyped
        
    }//GEN-LAST:event_CampoNomeKeyTyped

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        //int vld=0;
        if(!CampoNome.getText().trim().isEmpty()){
            //vld=1;
            AgendamentoDao cadastroPDao = new AgendamentoDao();        
        buscarNome(cadastroPDao);

       } else if(!CampoData.getText().trim().isEmpty()){
           //vld=1;
        AgendamentoDao cadastroPDao = new AgendamentoDao();        
        buscarData(cadastroPDao);
       }else{
           JOptionPane.showMessageDialog(null, "Nenhum dado idendificado");
       }

    }//GEN-LAST:event_jButton1MouseClicked

 
        
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        AgendamentoDao cadastroPessoaP = new AgendamentoDao();
        atualizaTabela(cadastroPessoaP);
    }//GEN-LAST:event_formWindowOpened

    private void jVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVoltar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jVoltar1ActionPerformed

    private void jVoltar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVoltar1MouseClicked
            
        Inicio frameInicio = new Inicio();
        frameInicio.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jVoltar1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CampoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNomeActionPerformed

    private void CampoDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoDataActionPerformed
    
    private void atualizaTabela(AgendamentoDao cadastroPDao){
        try{
                   // limparTabela();

                    ArrayList<AgendamentoModel> listaCadastros;
                    listaCadastros = cadastroPDao.consultar();        
                    DefaultTableModel modeloTabela = (DefaultTableModel) TabelaRelatorio.getModel();

                    for (AgendamentoModel cadastroP : listaCadastros) {
    modeloTabela.addRow(new String[]{
        String.valueOf(cadastroP.getIdAgendamento()),
        cadastroP.getNome(),
        cadastroP.getDataAgendamento(),
        cadastroP.getHorario(),
        cadastroP.getServico(),    
        String.valueOf(cadastroP.getIdServico()),
        String.valueOf(cadastroP.getIdCliente())
    });

                }
        }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado na linha 275:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
                }
     
    }
            
    private void limparTabela(){
        while(TabelaRelatorio.getRowCount() > 0){
            DefaultTableModel dm = (DefaultTableModel) TabelaRelatorio.getModel();
            dm.getDataVector().removeAllElements();
        }
    }
    
        private void buscarNome(AgendamentoDao cadastroPDao)
    {
            try
            {

                limparTabela();

                ArrayList<AgendamentoModel> listaUsuariosStr;
                listaUsuariosStr = cadastroPDao.consultar(CampoNome.getText()); 

                //Resgata o modelo da tabela            
                DefaultTableModel modeloTabela = (DefaultTableModel) TabelaRelatorio.getModel();

                for(AgendamentoModel cadastroP : listaUsuariosStr)
                {
                modeloTabela.addRow(new String[]{Integer.toString(cadastroP.getIdAgendamento()), 
                                                                      cadastroP.getNome(), 
                                                                      cadastroP.getDataAgendamento(), 
                                                                      cadastroP.getHorario()});
                }

            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
            }
      
    }
private void buscarData(AgendamentoDao cadastroPDao) {
    try {
        limparTabela();

        // Obtém a data do JTextField como string
        String dataString = CampoData.getText();

        ArrayList<AgendamentoModel> listaUsuariosStr;
        listaUsuariosStr = cadastroPDao.consultarPorData(dataString);

        // Resgata o modelo da tabela
        DefaultTableModel modeloTabela = (DefaultTableModel) TabelaRelatorio.getModel();

        for (AgendamentoModel cadastroP : listaUsuariosStr) {

            modeloTabela.addRow(new String[]{
                Integer.toString(cadastroP.getIdAgendamento()), 
                cadastroP.getNome(), 
                cadastroP.getDataAgendamento(),
                cadastroP.getHorario()
            });
        }

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
    }
}

         private void tHeader(){
    
        JTableHeader thead = TabelaRelatorio.getTableHeader();
        thead.setOpaque(true);
        thead.setBorder(BorderFactory.createLineBorder(Color.black));

        thead.setBackground(new Color(144,5,178));
        thead.setForeground(Color.black);
        
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setOpaque(false);
        headerRenderer.setForeground(Color.WHITE);

        headerRenderer.setBackground(new Color(204,102,255));

        headerRenderer.setBorder(BorderFactory.createLineBorder(Color.black));

        for (int i = 0; i < TabelaRelatorio.getModel().getColumnCount(); i++) {
    TabelaRelatorio.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
}
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
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoData;
    private javax.swing.JTextField CampoNome;
    private javax.swing.JTable TabelaRelatorio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jVoltar1;
    // End of variables declaration//GEN-END:variables
}
