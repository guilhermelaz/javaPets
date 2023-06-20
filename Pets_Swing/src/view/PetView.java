package view;

import javax.swing.JOptionPane;
import model.DaoPet;
import model.Pet;

public class PetView extends javax.swing.JFrame {
    
    Pet pet;
    DaoPet daoPet;
    
    public PetView() {
        initComponents();
        daoPet = new DaoPet();
        this.atualizarTabela();
    }
    
    public void atualizarTabela(){
        tbPets.setModel(new PetTableModel(daoPet.findAll()));
        btnExcluir.setEnabled(false);
    }

    public void limparCampos(){
        tfId.setText("");
        tfNome.setText("");
        tfIdade.setText("");
        tfTipo.setSelectedIndex(0);
        tfPeso.setText("");
        tfCor.setText("");
        tfFiltro.setText("");
        buttonGroup1.clearSelection();
        
        tfFiltro.setEditable(false);
        
        btnExcluir.setEnabled(false);
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        tfTipo = new javax.swing.JComboBox<>();
        tfNome = new javax.swing.JTextField();
        tfIdade = new javax.swing.JTextField();
        tfPeso = new javax.swing.JTextField();
        tfCor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPets = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        limparCampos = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        rbNome = new javax.swing.JRadioButton();
        rbCor = new javax.swing.JRadioButton();
        tfFiltro = new javax.swing.JTextField();
        btnProcurar = new javax.swing.JButton();
        btnListarTodos = new javax.swing.JButton();
        Bob = new javax.swing.JLabel();
        val = new javax.swing.JLabel();
        On = new javax.swing.JLabel();
        rbTipo = new javax.swing.JRadioButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Java Pets");

        jLabel2.setText("Id:");

        jLabel3.setText("Nome:");

        jLabel4.setText("Idade:");

        jLabel5.setText("Tipo:");

        jLabel6.setText("Peso:");

        jLabel7.setText("Cor:");

        tfId.setEditable(false);
        tfId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdActionPerformed(evt);
            }
        });

        tfTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Cachorro", "Gato", "Ave", "Peixe", "Réptil", "Outros" }));

        tbPets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbPets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPetsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPets);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.setActionCommand("");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        limparCampos.setText("Limpar tudo");
        limparCampos.setActionCommand("");
        limparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparCamposActionPerformed(evt);
            }
        });

        jLabel8.setText("Pesquisar por:");

        buttonGroup1.add(rbNome);
        rbNome.setText("Nome");
        rbNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbNomeMouseClicked(evt);
            }
        });
        rbNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNomeActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbCor);
        rbCor.setText("Cor");
        rbCor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbCorMouseClicked(evt);
            }
        });

        tfFiltro.setEditable(false);
        tfFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFiltroActionPerformed(evt);
            }
        });

        btnProcurar.setText("Procurar");
        btnProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarActionPerformed(evt);
            }
        });

        btnListarTodos.setText("Listar tudo");
        btnListarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarTodosActionPerformed(evt);
            }
        });

        Bob.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bob.png"))); // NOI18N

        val.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/val.png"))); // NOI18N

        On.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/on.png"))); // NOI18N

        buttonGroup1.add(rbTipo);
        rbTipo.setText("Tipo");
        rbTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbTipoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel7)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbNome)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(rbCor)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbTipo)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnProcurar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tfCor)
                                            .addComponent(tfTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSalvar)
                            .addComponent(limparCampos)
                            .addComponent(btnExcluir))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bob)
                            .addComponent(val)
                            .addComponent(On)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListarTodos)))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(limparCampos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tfTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(tfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbCor)
                            .addComponent(jLabel8)
                            .addComponent(rbNome)
                            .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProcurar)
                            .addComponent(rbTipo)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Bob)
                        .addGap(0, 36, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(val)
                        .addGap(18, 18, 18)
                        .addComponent(On)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnListarTodos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdActionPerformed

    private void limparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparCamposActionPerformed
        this.limparCampos();
    }//GEN-LAST:event_limparCamposActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        try{
        if(tfNome.getText().equals("") || tfIdade.getText().equals("") || tfTipo.getSelectedItem().toString().equals("Selecione") || tfPeso.getText().equals("") || tfCor.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos.");
        } else {
            pet = new Pet();
            pet.setNome(tfNome.getText());
            pet.setIdade(Integer.parseInt(tfIdade.getText()));
            pet.setTipo(tfTipo.getSelectedItem().toString());
            pet.setPeso(Double.parseDouble(tfPeso.getText()));
            pet.setCor(tfCor.getText());
        }
        
        
        
        if(tfId.getText().equals("")){
            daoPet.inserir(pet);
        } else {
            daoPet.alterar(Integer.parseInt(tfId.getText()), pet);
        }} catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Faz direito!\n Exemplo:\n Nome: Bob\n Idade: 12\nTipo: Cachorro\nCor: Branco\nPeso: 6.25 <- Deve ser utilizado ponto!");
        }
        
        this.atualizarTabela();
        this.limparCampos();
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int confirma = JOptionPane.showConfirmDialog(null, "Confirmar?", "exclusão de pet :(", JOptionPane.YES_NO_OPTION);
        System.out.println("confirma = " + confirma);
        
        if(confirma == 0){
            daoPet.excluir(Integer.parseInt(tfId.getText()));
            this.atualizarTabela();
            this.limparCampos();
        }
        if(confirma == 1){
            this.atualizarTabela();
            this.limparCampos();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tbPetsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPetsMouseClicked
       tfId.setText(tbPets.getValueAt(tbPets.getSelectedRow(), PetTableModel.COL_ID).toString());
       tfNome.setText(tbPets.getValueAt(tbPets.getSelectedRow(), PetTableModel.COL_NOME).toString());
       tfIdade.setText(tbPets.getValueAt(tbPets.getSelectedRow(), PetTableModel.COL_IDADE).toString());
       tfCor.setText(tbPets.getValueAt(tbPets.getSelectedRow(), PetTableModel.COL_COR).toString());
       tfPeso.setText(tbPets.getValueAt(tbPets.getSelectedRow(), PetTableModel.COL_PESO).toString());
       tfTipo.setSelectedItem(tbPets.getValueAt(tbPets.getSelectedRow(), PetTableModel.COL_TIPO).toString());
       btnExcluir.setEnabled(true);
    }//GEN-LAST:event_tbPetsMouseClicked

    private void rbNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbNomeActionPerformed

    private void tfFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFiltroActionPerformed

    private void btnProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarActionPerformed
        
        String opc = null;
        
        if(rbCor.isSelected()){
            opc = "cor";
            System.out.println("Cor selecionado.");
        }
        if(rbNome.isSelected()){
            opc = "nome";
            System.out.println("Nome selecionado.");
        }
        if(rbTipo.isSelected()){
            opc = "tipo";
            System.out.println("Tipo selecionado.");
        }

        if(!rbCor.isSelected() && !rbNome.isSelected() && !rbTipo.isSelected()){
            JOptionPane.showMessageDialog(null, "Selecione alguma das opções para pesquisa...");
        }
        try{
            tbPets.setModel(new PetTableModel(daoPet.pesquisa(opc, tfFiltro.getText())));
            this.limparCampos();
        } catch (Exception e) {
            System.out.println("Erro: Nenhuma das opções selecionadas ao pesquisar.");
        } finally {
        }
    }//GEN-LAST:event_btnProcurarActionPerformed

    private void btnListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarTodosActionPerformed
        this.limparCampos();
        this.atualizarTabela();
    }//GEN-LAST:event_btnListarTodosActionPerformed

    private void rbNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbNomeMouseClicked
        tfFiltro.setEditable(true);
    }//GEN-LAST:event_rbNomeMouseClicked

    private void rbCorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbCorMouseClicked
        tfFiltro.setEditable(true);
    }//GEN-LAST:event_rbCorMouseClicked

    private void rbTipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbTipoMouseClicked
        tfFiltro.setEditable(true);
    }//GEN-LAST:event_rbTipoMouseClicked

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
            java.util.logging.Logger.getLogger(PetView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PetView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PetView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PetView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PetView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bob;
    private javax.swing.JLabel On;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnListarTodos;
    private javax.swing.JButton btnProcurar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limparCampos;
    private javax.swing.JRadioButton rbCor;
    private javax.swing.JRadioButton rbNome;
    private javax.swing.JRadioButton rbTipo;
    private javax.swing.JTable tbPets;
    private javax.swing.JTextField tfCor;
    private javax.swing.JTextField tfFiltro;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfIdade;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPeso;
    private javax.swing.JComboBox<String> tfTipo;
    private javax.swing.JLabel val;
    // End of variables declaration//GEN-END:variables
}
