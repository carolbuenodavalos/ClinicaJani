/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import dao.AgendamentoDao;
import dao.CadastroDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.table.DefaultTableModel;
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
        CampoData = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CampoNome = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jVoltar = new javax.swing.JButton();
        jVoltar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        TabelaRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID do agendamento", "Nome do Cliente", "Data", "Horario", "Serviço"
            }
        ));
        jScrollPane1.setViewportView(TabelaRelatorio);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Relatorio Kowalski");

        CampoData.setBackground(new java.awt.Color(153, 153, 153));
        CampoData.setText("  /  /    ");
        CampoData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDataActionPerformed(evt);
            }
        });

        jLabel2.setText("Data (WIP)");

        jLabel4.setText("Nome");

        CampoNome.setBackground(new java.awt.Color(153, 153, 153));
        CampoNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoNomeKeyTyped(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jVoltar.setBackground(new java.awt.Color(255, 255, 255));
        jVoltar.setForeground(new java.awt.Color(0, 51, 51));
        jVoltar.setText("Voltar");

        jVoltar1.setBackground(new java.awt.Color(255, 255, 255));
        jVoltar1.setForeground(new java.awt.Color(0, 51, 51));
        jVoltar1.setText("Voltar");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CampoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jVoltar1))
                            .addComponent(jLabel2))))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jVoltar)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jVoltar1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jVoltar)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoDataActionPerformed

    private void CampoNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoNomeKeyTyped
        
    }//GEN-LAST:event_CampoNomeKeyTyped

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        AgendamentoDao cadastroPDao = new AgendamentoDao();        
        buscarNome(cadastroPDao);
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
        cadastroP.getCpf(),
        cadastroP.getTelefone(),
        cadastroP.getDataAgendamento(),
        cadastroP.getHorario(),     
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
                    //adiciona em cada linha da tabela da tela o conteúdo de cada posição da listaCadastro
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
    private javax.swing.JFormattedTextField CampoData;
    private javax.swing.JTextField CampoNome;
    private javax.swing.JTable TabelaRelatorio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jVoltar;
    private javax.swing.JButton jVoltar1;
    // End of variables declaration//GEN-END:variables
}
