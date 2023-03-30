/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.EmpresaDAO;
import dao.FornecedorDAO;
import dto.EmpresaDTO;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author f.do.nascimento
 */
public class FormEmpresaView extends javax.swing.JFrame {

    /**
     * Creates new form formEmpresaView
     */
    public FormEmpresaView() {
        initComponents();
        listarEmpresas();
        restaurarDadosComboBoxFornecedor();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCEP = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEmpresas = new javax.swing.JTable();
        btnCadastrar = new javax.swing.JButton();
        btnPesquisarEmpresas = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnCarregarCamposEmpresa = new javax.swing.JButton();
        btnLimparCampos = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnAlterarEmpresa = new javax.swing.JButton();
        btnExcluirEmpresa = new javax.swing.JButton();
        cbxFornecedor = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnTelaInicial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CNPJ");

        jLabel2.setText("Nome Fantasia");

        jLabel3.setText("CEP");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCEPActionPerformed(evt);
            }
        });

        tabelaEmpresas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "CNPJ", "NOME", "CEP", "Nome_Fornecedor"
            }
        ));
        jScrollPane1.setViewportView(tabelaEmpresas);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnPesquisarEmpresas.setText("Listar Empresas");
        btnPesquisarEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarEmpresasActionPerformed(evt);
            }
        });

        jLabel5.setText("ID");

        txtID.setEnabled(false);
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        btnCarregarCamposEmpresa.setText("Carregar Campos");
        btnCarregarCamposEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarCamposEmpresaActionPerformed(evt);
            }
        });

        btnLimparCampos.setText("Limpar Campos");
        btnLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposActionPerformed(evt);
            }
        });

        btnAlterarEmpresa.setText("Alterar Empresa");
        btnAlterarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarEmpresaActionPerformed(evt);
            }
        });

        btnExcluirEmpresa.setText("Excluir Empresa");
        btnExcluirEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirEmpresaActionPerformed(evt);
            }
        });

        cbxFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o Fornecedor" }));
        cbxFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFornecedorActionPerformed(evt);
            }
        });

        jLabel4.setText("Fornecedor");

        btnTelaInicial.setText("Voltar Para Tela Inicial");
        btnTelaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaInicialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCarregarCamposEmpresa)
                .addGap(107, 107, 107)
                .addComponent(btnLimparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtCNPJ))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(331, 331, 331)
                                .addComponent(btnTelaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnPesquisarEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(btnAlterarEmpresa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluirEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(4, 4, 4)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTelaInicial)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar))
                .addGap(60, 60, 60)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirEmpresa)
                    .addComponent(btnAlterarEmpresa)
                    .addComponent(btnPesquisarEmpresas))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCarregarCamposEmpresa)
                    .addComponent(btnLimparCampos))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        CadastrarEmpresa();
        listarEmpresas();
        LimparCampos();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnPesquisarEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarEmpresasActionPerformed
        // TODO add your handling code here:
        listarEmpresas();
    }//GEN-LAST:event_btnPesquisarEmpresasActionPerformed

    private void txtCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCEPActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void btnCarregarCamposEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarCamposEmpresaActionPerformed
        // TODO add your handling code here:
        CarregarCamposEmpresa();
    }//GEN-LAST:event_btnCarregarCamposEmpresaActionPerformed

    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
        LimparCampos();
    }//GEN-LAST:event_btnLimparCamposActionPerformed

    private void btnAlterarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarEmpresaActionPerformed
        if (txtNome.getText().equals("") || txtCNPJ.getText().equals("")
                || txtCEP.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Antes de alterar, selecione a empresa na tebela e clique em CARREGAR CAMPOS!");

        } else {
            AlterarEmpresa();
            listarEmpresas();

            JOptionPane.showMessageDialog(null, "Empresa alterada com sucesso!");
        }
    }//GEN-LAST:event_btnAlterarEmpresaActionPerformed

    private void btnExcluirEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirEmpresaActionPerformed
        if (txtNome.getText().equals("") || txtCNPJ.getText().equals("")
                || txtCEP.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Antes de excluir, selecione a empresa na tebela e clique em CARREGAR CAMPOS!");

        } else {
            ExcluirEmpresa();
            listarEmpresas();
            LimparCampos();
            JOptionPane.showMessageDialog(null, "Empresa excluída com sucesso!");
        }
    }//GEN-LAST:event_btnExcluirEmpresaActionPerformed

    private void cbxFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxFornecedorActionPerformed

    private void btnTelaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaInicialActionPerformed
        FormMainView objformmainview = new FormMainView();
        objformmainview.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnTelaInicialActionPerformed

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
            java.util.logging.Logger.getLogger(FormEmpresaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEmpresaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEmpresaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEmpresaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEmpresaView().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarEmpresa;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCarregarCamposEmpresa;
    private javax.swing.JButton btnExcluirEmpresa;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JButton btnPesquisarEmpresas;
    private javax.swing.JButton btnTelaInicial;
    private javax.swing.JComboBox<String> cbxFornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabelaEmpresas;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtCNPJ;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

    private void listarEmpresas() {

        try {

            EmpresaDAO objempresadao = new EmpresaDAO();
            DefaultTableModel model = (DefaultTableModel) tabelaEmpresas.getModel();
            model.setNumRows(0);

            ArrayList<EmpresaDTO> lista = objempresadao.PesquisarEmpresa();

            for (int num = 0; num < lista.size(); num++) {

                model.addRow(new Object[]{
                    lista.get(num).getId_empresa(),
                    lista.get(num).getCnpj_empresa(),
                    lista.get(num).getNome_empresa(),
                    lista.get(num).getCep_empresa(),
                    lista.get(num).getNome_fornecedor()

                });
            }

        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "Listar Empresas View: " + error);
        }
    }

    private void CarregarCamposEmpresa() {

        int setar = tabelaEmpresas.getSelectedRow();

        txtID.setText(tabelaEmpresas.getModel().getValueAt(setar, 0).toString());
        txtCNPJ.setText(tabelaEmpresas.getModel().getValueAt(setar, 1).toString());
        txtNome.setText(tabelaEmpresas.getModel().getValueAt(setar, 2).toString());
        txtCEP.setText(tabelaEmpresas.getModel().getValueAt(setar, 3).toString());
        cbxFornecedor.setSelectedItem(tabelaEmpresas.getModel().getValueAt(setar, 4).toString());

    }

    private void CadastrarEmpresa() {

        String cnpj_empresa, nome_empresa, cep_empresa, nome_forneced;
        int cod_fornecedor;

        cnpj_empresa = txtCNPJ.getText();
        nome_empresa = txtNome.getText();
        cep_empresa = txtCEP.getText();
        cod_fornecedor = id_fornecedor.get(cbxFornecedor.getSelectedIndex() - 1);
        nome_forneced = nome_fornecedor.get(cbxFornecedor.getSelectedIndex() - 1  );

        EmpresaDTO objempresadto = new EmpresaDTO();
        objempresadto.setNome_empresa(nome_empresa);
        objempresadto.setCnpj_empresa(cnpj_empresa);
        objempresadto.setCep_empresa(cep_empresa);
        objempresadto.setId_fornecedor(cod_fornecedor);
        objempresadto.setNome_fornecedor(nome_forneced);
        
        EmpresaDAO objempresadao = new EmpresaDAO();
        objempresadao.cadastrarEmpresa(objempresadto);
    }

    private void LimparCampos() {
        txtID.setText("");
        txtNome.setText("");
        txtCEP.setText("");
        txtCNPJ.setText("");
        cbxFornecedor.setSelectedIndex(0);
        txtCNPJ.requestFocus();

    }

    private void AlterarEmpresa() {
        int id_empresa;
        String cnpj_empresa, nome_empresa, cep_empresa;

        id_empresa = Integer.parseInt(txtID.getText());
        cnpj_empresa = txtCNPJ.getText();
        nome_empresa = txtNome.getText();
        cep_empresa = txtCEP.getText();

        EmpresaDTO objempresadto = new EmpresaDTO();
        objempresadto.setId_empresa(id_empresa);
        objempresadto.setNome_empresa(nome_empresa);
        objempresadto.setCnpj_empresa(cnpj_empresa);
        objempresadto.setCep_empresa(cep_empresa);

        EmpresaDAO objempresadao = new EmpresaDAO();
        objempresadao.AlterarEmpresa(objempresadto);
    }

    private void ExcluirEmpresa() {

        int id_empresa;

        id_empresa = Integer.parseInt(txtID.getText());

        EmpresaDTO objempresadto = new EmpresaDTO();
        objempresadto.setId_empresa(id_empresa);

        EmpresaDAO objempresadao = new EmpresaDAO();
        objempresadao.ExcluirEmpresa(objempresadto);
    }

    Vector<Integer> id_fornecedor = new Vector<Integer>();
    Vector<String> nome_fornecedor = new Vector<String>();

    public void restaurarDadosComboBoxFornecedor() {

        try {

            FornecedorDAO objfornecedordao = new FornecedorDAO();
            ResultSet rs = objfornecedordao.fornecedoresCBX();

            while (rs.next()) {
                id_fornecedor.addElement(rs.getInt(1));
                nome_fornecedor.addElement(rs.getString(3));
                cbxFornecedor.addItem(rs.getString(3));
            }
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "ComboBox: " + error);
        }
    }
}
