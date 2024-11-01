/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import dao.AgendamentoDao;
import dao.CadastroDao;
import dao.ServicosDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.table.DefaultTableModel;
import models.AgendamentoModel;
import models.CadastroModel;
import models.ServicosModel;

/**
 *
 * @author marcu
 */
public class Agendamento extends javax.swing.JFrame {

    /**
     * Creates new form Agendamento
     */
    public Agendamento() {
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

        jLabel1 = new javax.swing.JLabel();
        CampoID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CampoTelefone = new javax.swing.JTextField();
        butaoCadastrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        CampoCPF = new javax.swing.JFormattedTextField();
        butaoLimpar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaAgendamento = new javax.swing.JTable();
        testarSQL = new javax.swing.JButton();
        CampoHorario = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        CampoData = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        CampoNome = new javax.swing.JComboBox<>();
        CampoServico = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("ID do Cliente");

        CampoID.setEditable(false);
        CampoID.setBackground(new java.awt.Color(51, 51, 51));
        CampoID.setForeground(new java.awt.Color(153, 153, 153));
        CampoID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CampoID.setBorder(null);

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Nome");

        CampoTelefone.setEditable(false);
        CampoTelefone.setBackground(new java.awt.Color(153, 153, 153));
        CampoTelefone.setForeground(new java.awt.Color(153, 153, 153));

        butaoCadastrar.setBackground(new java.awt.Color(153, 153, 153));
        butaoCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butaoCadastrar.setText("Cadastrar");
        butaoCadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 5, true));
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

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Telefone");

        CampoCPF.setEditable(false);
        CampoCPF.setBackground(new java.awt.Color(153, 153, 153));
        CampoCPF.setForeground(new java.awt.Color(153, 153, 153));
        try {
            CampoCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CampoCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoCPFKeyTyped(evt);
            }
        });

        butaoLimpar.setBackground(new java.awt.Color(153, 153, 153));
        butaoLimpar.setText("Limpa os campos");
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

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Horario");

        jLabel11.setBackground(new java.awt.Color(102, 102, 102));
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("CPF");

        TabelaAgendamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "Telefone", "Data", "Horario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaAgendamento);
        if (TabelaAgendamento.getColumnModel().getColumnCount() > 0) {
            TabelaAgendamento.getColumnModel().getColumn(0).setResizable(false);
            TabelaAgendamento.getColumnModel().getColumn(1).setResizable(false);
            TabelaAgendamento.getColumnModel().getColumn(2).setResizable(false);
            TabelaAgendamento.getColumnModel().getColumn(3).setResizable(false);
            TabelaAgendamento.getColumnModel().getColumn(4).setResizable(false);
            TabelaAgendamento.getColumnModel().getColumn(5).setResizable(false);
        }

        testarSQL.setBackground(new java.awt.Color(153, 153, 153));
        testarSQL.setText("testar SQL");
        testarSQL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                testarSQLMouseClicked(evt);
            }
        });
        testarSQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testarSQLActionPerformed(evt);
            }
        });

        CampoHorario.setBackground(new java.awt.Color(153, 153, 153));
        try {
            CampoHorario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Data de Agendamento");

        CampoData.setBackground(new java.awt.Color(153, 153, 153));
        try {
            CampoData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Agendamento de Clientes");

        CampoNome.setBackground(new java.awt.Color(153, 153, 153));

        jLabel6.setText("Serviço");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(butaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(testarSQL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(butaoLimpar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(CampoData, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(CampoHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(CampoID, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28))
                    .addComponent(CampoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CampoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CampoID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CampoHorario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(28, 28, 28)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butaoCadastrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(testarSQL)
                        .addComponent(butaoLimpar)))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //vo arruma depois
    private void butaoCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butaoCadastrarMouseClicked
       if((CampoNome.getText().trim().isEmpty()) || ((CampoQuantidade.getText().trim().isEmpty())|| CampoPreco.getText().trim().isEmpty()|| (CampoDesc.getText().trim().isEmpty()))){
                   JOptionPane.showMessageDialog(null, "Nenhum dado idendificado");
                   CampoNome.requestFocus();
       }else{
            if (contador == 0) {            
                try{    
                   modeloEstoque cadastroP = new modeloEstoque();
                   
                  cadastroP.setNomeProd(CampoNome.getText());
                  cadastroP.setPreco(Float.parseFloat(CampoPreco.getText()));
                  cadastroP.setQtdProd(Integer.parseInt(CampoQuantidade.getText()));   
                  //cadastroP.setidCategoriaProduto(Integer.parseInt(CampoCategoria.getSelectedItem().toString()));  
                  cadastroP.setDescProduto(CampoDesc.getText());     
                  EstoqueDao cadastroPDao = new EstoqueDao();
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
                modeloEstoque cadastroP = new modeloEstoque();
                cadastroP.setIdProd(Integer.parseInt(CampoID.getText()));
                cadastroP.setNomeProd(CampoNome.getText());
                cadastroP.setPreco(Float.parseFloat(CampoPreco.getText()));
                cadastroP.setQtdProd(Integer.parseInt(CampoQuantidade.getText()));  
                //cadastroP.setidCategoriaProduto(Integer.parseInt(CampoCategoria.getSelectedItem().toString()));
                cadastroP.setDescProduto(CampoDesc.getText());

                EstoqueDao cadastroPDao = new EstoqueDao();
                cadastroPDao.alterar(cadastroP);
                limparTabela();
                atualizaTabela(cadastroPDao);
                JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso!", "", INFORMATION_MESSAGE);
                CampoNome.requestFocus();
                limparCampos();
                
                contador = 0;
                TabelaEstoque.setVisible(true);
                butaoCadastrar.setText("Cadastrar");                
            }    

       }
       
    }//GEN-LAST:event_butaoCadastrarMouseClicked

    private void butaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaoCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butaoCadastrarActionPerformed

    private void CampoCPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoCPFKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CampoCPFKeyTyped

    private void butaoLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butaoLimparMouseClicked
        limparCampos();
    }//GEN-LAST:event_butaoLimparMouseClicked
    
    private void limparUser(){
        CampoNome.removeAllItems();
    }
    
    private void limparServico(){
        CampoServico.removeAllItems();
    }
    
    private void limparCampos(){
        this.CampoNome.setSelectedIndex(-1);
        this.CampoID.setText("");
        this.CampoCPF.setText("");
        this.CampoTelefone.setText("");
        this.CampoData.setText("");
        this.CampoHorario.setText("");
    }
  
    private void limparTabela(){
        //percorre a tabela e exclui todas as linhas
        while(TabelaAgendamento.getRowCount() > 0){
            DefaultTableModel dm = (DefaultTableModel) TabelaAgendamento.getModel();
            dm.getDataVector().removeAllElements();
        }
    }
    
    private void atualizaTabela(AgendamentoDao cadastroPDao){
        try{
                    limparTabela();

                    ArrayList<AgendamentoModel> listaCadastros;
                    listaCadastros = cadastroPDao.consultar();        
                    DefaultTableModel modeloTabela = (DefaultTableModel) TabelaAgendamento.getModel();

                    for (AgendamentoModel cadastroP : listaCadastros) {
    modeloTabela.addRow(new String[]{
        String.valueOf(cadastroP.getIdAgendamento()),
        cadastroP.getNome(),
        cadastroP.getCpf(),
        cadastroP.getTelefone(),
        cadastroP.getDataAgendamento(),
        cadastroP.getHorario(),        // Incluindo o horário, caso seja necessário
        String.valueOf(cadastroP.getIdServico()),
        String.valueOf(cadastroP.getIdCliente())
    });
                    } 
                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
                }
     
        }
    
    
    private void atualizaTabelaUsers(CadastroDao DaoFunc){
        try{
              limparUser();
              ArrayList<CadastroModel> listarFunc;
              listarFunc = DaoFunc.consultar();

              for(CadastroModel func : listarFunc){
                  CampoNome.addItem(func.getNome());
               }
                    CampoNome.setSelectedIndex(-1);
                    }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
                    }
                
    }
    
    private void atualizaTabelaServicos(ServicosDao DaoFunc){
        try{
              limparServico();
              ArrayList<ServicosModel> listarFunc;
              listarFunc = DaoFunc.consultar();

              for(ServicosModel func : listarFunc){
                  CampoServico.addItem(func.getServico());
               }
                    CampoServico.setSelectedIndex(-1);
                    }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
                    }
                
    }

    private void butaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaoLimparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butaoLimparActionPerformed

    private void testarSQLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_testarSQLMouseClicked
//        try{
//            new dao.ConexaoBanco().conectar();
//            JOptionPane.showMessageDialog(null, "Banco de dados conectado");
//        } catch (Exception ex){
//            JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado: " + ex.getMessage(), "Erro!",ERROR_MESSAGE);
//        }

    }//GEN-LAST:event_testarSQLMouseClicked

    private void testarSQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testarSQLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testarSQLActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        AgendamentoDao attagenda = new AgendamentoDao();
        atualizaTabela(attagenda);
        
        ServicosDao attServicos = new ServicosDao();
        atualizaTabelaServicos(attServicos);
        
        CadastroDao attUsers = new CadastroDao();
        atualizaTabelaUsers(attUsers); 
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agendamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField CampoCPF;
    private javax.swing.JFormattedTextField CampoData;
    private javax.swing.JFormattedTextField CampoHorario;
    private javax.swing.JTextField CampoID;
    private javax.swing.JComboBox<String> CampoNome;
    private javax.swing.JComboBox<String> CampoServico;
    private javax.swing.JTextField CampoTelefone;
    private javax.swing.JTable TabelaAgendamento;
    private javax.swing.JButton butaoCadastrar;
    private javax.swing.JButton butaoLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton testarSQL;
    // End of variables declaration//GEN-END:variables
}
