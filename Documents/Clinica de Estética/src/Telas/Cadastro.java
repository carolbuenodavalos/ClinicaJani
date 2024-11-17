/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import dao.CadastroDao;
import dao.ServicosDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.table.DefaultTableModel;
import models.CadastroModel;

/**
 *
 * @author marcu
 */
public class Cadastro extends javax.swing.JFrame {
    int contador = 0;
    /**
     * Creates new form Cadastro
     */
    public Cadastro() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(255, 204,255));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CampoNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CampoCPF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CampoTelefone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaUsuarios = new javax.swing.JTable();
        butaoCadastrar = new javax.swing.JButton();
        butaoLimpar = new javax.swing.JButton();
        CampoID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoBuscar = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("ID");

        CampoNome.setBackground(new java.awt.Color(255, 255, 255));
        CampoNome.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 255)));
        CampoNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel2.setText("Nome");

        CampoCPF.setBackground(new java.awt.Color(255, 255, 255));
        CampoCPF.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 255)));
        CampoCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCPFActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel3.setText("CPF");

        CampoTelefone.setBackground(new java.awt.Color(255, 255, 255));
        CampoTelefone.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 255)));
        CampoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoTelefoneActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel4.setText("Telefone");

        TabelaUsuarios.setBackground(new java.awt.Color(204, 204, 255));
        TabelaUsuarios.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        TabelaUsuarios.setForeground(new java.awt.Color(102, 102, 102));
        TabelaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "Telefone"
            }
        ));
        TabelaUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TabelaUsuarios.setSelectionBackground(new java.awt.Color(255, 204, 255));
        TabelaUsuarios.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(TabelaUsuarios);

        butaoCadastrar.setBackground(new java.awt.Color(204, 102, 255));
        butaoCadastrar.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        butaoCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        butaoCadastrar.setText("CADASTRAR");
        butaoCadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 255), 5, true));
        butaoCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butaoCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butaoCadastrarMouseClicked(evt);
            }
        });
        butaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaoCadastrarActionPerformed(evt);
            }
        });

        butaoLimpar.setBackground(new java.awt.Color(204, 102, 255));
        butaoLimpar.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        butaoLimpar.setForeground(new java.awt.Color(255, 255, 255));
        butaoLimpar.setText("LIMPAR CAMPOS");
        butaoLimpar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 255), 3, true));
        butaoLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butaoLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butaoLimparMouseClicked(evt);
            }
        });
        butaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaoLimparActionPerformed(evt);
            }
        });

        CampoID.setEditable(false);
        CampoID.setBackground(new java.awt.Color(204, 153, 255));
        CampoID.setForeground(new java.awt.Color(204, 204, 204));
        CampoID.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 255)));
        CampoID.setFocusable(false);

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 2, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("CADASTRO DE CLIENTES");
        jLabel5.setToolTipText("");

        campoBuscar.setBackground(new java.awt.Color(255, 255, 255));
        campoBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 255)));
        campoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBuscarActionPerformed(evt);
            }
        });
        campoBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoBuscarKeyPressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel12.setText("Buscar");

        jVoltar.setBackground(new java.awt.Color(204, 102, 255));
        jVoltar.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jVoltar.setForeground(new java.awt.Color(255, 255, 255));
        jVoltar.setText("VOLTAR");
        jVoltar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 255), 3, true));
        jVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jVoltarMouseClicked(evt);
            }
        });
        jVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(campoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(170, 170, 170))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(361, 361, 361)))
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(butaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CampoID, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CampoNome)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 32, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(CampoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(butaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CampoID)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CampoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CampoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(butaoLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(butaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel12)
                .addGap(2, 2, 2)
                .addComponent(campoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        CampoNome.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void atualizaTabela(CadastroDao cadastroPDao){
        try{
                   // limparTabela();

                    ArrayList<CadastroModel> listaCadastros;
                    listaCadastros = cadastroPDao.consultar();        
                    DefaultTableModel modeloTabela = (DefaultTableModel) TabelaUsuarios.getModel();

                    for(CadastroModel cadastroP : listaCadastros){
                        modeloTabela.addRow(new String[]{Integer.toString(cadastroP.getID()),cadastroP.getNome(),cadastroP.getCPF(),cadastroP.getTel()});
                    }

                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado na linha 275:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
                }
     
    }
            
    private void limparTabela(){
        while(TabelaUsuarios.getRowCount() > 0){
            DefaultTableModel dm = (DefaultTableModel) TabelaUsuarios.getModel();
            dm.getDataVector().removeAllElements();
        }
    }
    
        private void buscarNome(CadastroDao cadastroPDao)
    {
            try
            {

                limparTabela();

                ArrayList<CadastroModel> listaUsuariosStr;
                listaUsuariosStr = cadastroPDao.consultar(campoBuscar.getText()); 

                //Resgata o modelo da tabela            
                DefaultTableModel modeloTabela = (DefaultTableModel) TabelaUsuarios.getModel();

                for(CadastroModel cadastroP : listaUsuariosStr)
                {
                    //adiciona em cada linha da tabela da tela o conteúdo de cada posição da listaCadastro
                    modeloTabela.addRow(new String[]{Integer.toString(cadastroP.getID()), 
                                                                      cadastroP.getNome(), 
                                                                      cadastroP.getCPF(), 
                                                                      cadastroP.getTel()});
                }

            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
            }
      
    }
    
    
    
    
    private void butaoCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butaoCadastrarMouseClicked
         if(((CampoNome.getText().trim().isEmpty()))){
            JOptionPane.showMessageDialog(null, "Nenhum dado idendificado");
            CampoNome.requestFocus();
        }else{
            if (contador == 0) {
                try{
                    CadastroModel cadastroP = new CadastroModel();

                    cadastroP.setNome(CampoNome.getText());
                    cadastroP.setCPF(CampoCPF.getText());
                    cadastroP.setTel(CampoTelefone.getText());
                    
                    CadastroDao cadastroPDao = new CadastroDao();
                    cadastroPDao.inserir(cadastroP);
                    limparTabela();
                    atualizaTabela(cadastroPDao);
                    JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso!", "", INFORMATION_MESSAGE);
                    limparCampos();
                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
                }
            }else{
                CadastroModel cadastroP = new CadastroModel();
                //cadastroP.setID(Integer.parseInt(CampoID.getText()));
                cadastroP.setNome(CampoNome.getText());
                cadastroP.setCPF(CampoCPF.getText());
                cadastroP.setTel(CampoTelefone.getText());

                ServicosDao cadastroPDao = new ServicosDao();
                //cadastroPDao.alterar(cadastroP);
                //limparTabela();
                //atualizaTabela(cadastroPDao);
                JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso!", "", INFORMATION_MESSAGE);
                //CampoServico.requestFocus();
                limparCampos();

                contador = 0;
                //TabelaServicos.setVisible(true);
                butaoCadastrar.setText("Cadastrar");
            }

        }
      
    }//GEN-LAST:event_butaoCadastrarMouseClicked

    private void butaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaoCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butaoCadastrarActionPerformed

    private void butaoLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butaoLimparMouseClicked
        limparCampos();
    }//GEN-LAST:event_butaoLimparMouseClicked

    private void butaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaoLimparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butaoLimparActionPerformed

    private void campoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoBuscarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        CadastroDao attUsuarios = new CadastroDao();
        atualizaTabela(attUsuarios);
    }//GEN-LAST:event_formWindowOpened

    private void campoBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoBuscarKeyPressed
        // TODO add your handling code here:
        CadastroDao cadastroPDao = new CadastroDao();        
        buscarNome(cadastroPDao);
    }//GEN-LAST:event_campoBuscarKeyPressed

    private void jVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVoltarMouseClicked
        Inicio frameInicio = new Inicio();
        frameInicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jVoltarMouseClicked

    private void jVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jVoltarActionPerformed

    private void CampoCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCPFActionPerformed

    private void CampoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoTelefoneActionPerformed
    
    private void limparCampos(){
        this.CampoID.setText("");
        this.CampoNome.setText("");
        this.CampoCPF.setText("");
        this.CampoTelefone.setText("");
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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoCPF;
    private javax.swing.JTextField CampoID;
    private javax.swing.JTextField CampoNome;
    private javax.swing.JTextField CampoTelefone;
    private javax.swing.JTable TabelaUsuarios;
    private javax.swing.JButton butaoCadastrar;
    private javax.swing.JButton butaoLimpar;
    private javax.swing.JTextField campoBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jVoltar;
    // End of variables declaration//GEN-END:variables
}
