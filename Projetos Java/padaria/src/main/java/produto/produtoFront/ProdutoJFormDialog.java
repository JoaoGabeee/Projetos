/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package produto.produtoFront;

import produto.produtoBack.Produto;
import produto.produtoBack.ProdutoDAO;

import java.awt.Color;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;


public class ProdutoJFormDialog extends javax.swing.JDialog {

     private final ProdutoDAO produtoDAO;
    private final DateTimeFormatter dateTimeFormatter;
    private final Border bordaOriginal;
    private final Border bordaErro;
    private Produto produto;
    
    public ProdutoJFormDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        bordaOriginal = nomeTF.getBorder();
        bordaErro = BorderFactory.createLineBorder(Color.RED);
        dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        produtoDAO = new ProdutoDAO();
    }

     public void setProduto(Produto produto) {
        this.produto = produto;
    }

    private boolean formularioValido() {
        boolean valido = true;

        if (nomeTF.getText().strip().isBlank()) {
            nomeTF.setBorder(bordaErro);
            valido = false;
        } else {
            nomeTF.setBorder(bordaOriginal);
        }

        if (marcaTF.getText().strip().isBlank()) {
            marcaTF.setBorder(bordaErro);
            valido = false;
        } else {
            marcaTF.setBorder(bordaOriginal);
        }

        if (dataFabricacaoFTF.getText().strip().isBlank()) {
            dataFabricacaoFTF.setBorder(bordaErro);
            valido = false;
        } else {
            dataFabricacaoFTF.setBorder(bordaOriginal);
        }

        if (dataVencimentoFTF.getText().strip().isBlank()) {
            dataVencimentoFTF.setBorder(bordaErro);
            valido = false;
        } else {
            dataVencimentoFTF.setBorder(bordaOriginal);
        }

        if (precoFTF.getText().strip().isBlank()) {
            precoFTF.setBorder(bordaErro);
            valido = false;
        } else {
            precoFTF.setBorder(bordaOriginal);
        }

        return valido;

    }

    public void formularioObjeto() {
        produto.setNome(nomeTF.getText());
        produto.setMarca(marcaTF.getText());
        produto.setDataFabricacao(LocalDate.parse(dataFabricacaoFTF.getText(), dateTimeFormatter));
        produto.setDataVencimento(LocalDate.parse(dataVencimentoFTF.getText(), dateTimeFormatter));
        produto.setPreco(new BigDecimal(precoFTF.getText()));
    }

    public void objetoFormulario() {
        nomeTF.setText(produto.getNome());
        marcaTF.setText(produto.getMarca());
        dataFabricacaoFTF.setText(produto.getDataFabricacao().format(dateTimeFormatter));
        dataVencimentoFTF.setText(produto.getDataVencimento().format(dateTimeFormatter));
        precoFTF.setText(produto.getPreco().toString());
    }

    public void limparCampos() {
        nomeTF.setText("");
        nomeTF.setBorder(bordaOriginal);
        marcaTF.setText("");
        marcaTF.setBorder(bordaOriginal);
        dataFabricacaoFTF.setText("");
        dataFabricacaoFTF.setValue(null);
        dataFabricacaoFTF.setBorder(bordaOriginal);
        dataVencimentoFTF.setText("");
        dataVencimentoFTF.setValue(null);
        dataVencimentoFTF.setBorder(bordaOriginal);
        precoFTF.setText("");
        precoFTF.setValue(null);
        precoFTF.setBorder(bordaOriginal);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dataVencimentoFTF = new javax.swing.JFormattedTextField();
        dadosLB = new javax.swing.JLabel();
        precoFTF = new javax.swing.JFormattedTextField();
        nomeLB = new javax.swing.JLabel();
        dataVencimentoLB = new javax.swing.JLabel();
        cancelarBT = new javax.swing.JButton();
        dadosObrigatoriosLB = new javax.swing.JLabel();
        precoLB = new javax.swing.JLabel();
        dataFabricacaoLB = new javax.swing.JLabel();
        marcaLB = new javax.swing.JLabel();
        marcaTF = new javax.swing.JTextField();
        dataFabricacaoFTF = new javax.swing.JFormattedTextField();
        salvarBT = new javax.swing.JButton();
        nomeTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        try {
            dataVencimentoFTF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataVencimentoFTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataVencimentoFTFActionPerformed(evt);
            }
        });

        dadosLB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dadosLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dadosLB.setText("Dados do Produto");

        precoFTF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        nomeLB.setText("*Nome:");

        dataVencimentoLB.setText("*Data de vencimento: ");

        cancelarBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x-circle.png"))); // NOI18N
        cancelarBT.setText("Cancelar");
        cancelarBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBTActionPerformed(evt);
            }
        });

        dadosObrigatoriosLB.setForeground(new java.awt.Color(255, 102, 102));
        dadosObrigatoriosLB.setText("*Dados obrigatorios");

        precoLB.setText("*Preco:");

        dataFabricacaoLB.setText("*Data de fabricação:");

        marcaLB.setText("*Marca:");

        marcaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaTFActionPerformed(evt);
            }
        });

        try {
            dataFabricacaoFTF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataFabricacaoFTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataFabricacaoFTFActionPerformed(evt);
            }
        });

        salvarBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        salvarBT.setText("Salvar");
        salvarBT.setToolTipText("");
        salvarBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarBTActionPerformed(evt);
            }
        });

        nomeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dadosLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(precoLB, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dadosObrigatoriosLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dataFabricacaoLB, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(dataVencimentoLB)
                            .addComponent(marcaLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nomeLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(marcaTF)
                                    .addComponent(dataFabricacaoFTF)
                                    .addComponent(dataVencimentoFTF)
                                    .addComponent(precoFTF)
                                    .addComponent(nomeTF)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addComponent(cancelarBT, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(salvarBT, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dadosLB, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLB)
                    .addComponent(nomeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marcaLB)
                    .addComponent(marcaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataFabricacaoLB)
                    .addComponent(dataFabricacaoFTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataVencimentoLB)
                    .addComponent(dataVencimentoFTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precoLB)
                    .addComponent(precoFTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dadosObrigatoriosLB, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cancelarBT, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(salvarBT, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBTActionPerformed
        this.dispose();
        limparCampos();
    }//GEN-LAST:event_cancelarBTActionPerformed

    private void dataFabricacaoFTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataFabricacaoFTFActionPerformed
    }//GEN-LAST:event_dataFabricacaoFTFActionPerformed

    private void dataVencimentoFTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataVencimentoFTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataVencimentoFTFActionPerformed

    private void salvarBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarBTActionPerformed
        if (!formularioValido()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Formulario inválido, por favor verifique os campos em vermelho",
                    "ERRO DE VALIDAÇAO",
                    JOptionPane.ERROR_MESSAGE);

            formularioObjeto();

            if (produto.getId() == 0) {
                produtoDAO.create(produto);
                JOptionPane.showMessageDialog(
                        null,
                        "Produto cadastrado com sucesso!",
                        "SUCESSO",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                produtoDAO.update(produto);
                JOptionPane.showMessageDialog(
                        null,
                        "Produto atualizado com sucesso!",
                        "SUCESSO",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            this.dispose();
        }
    }//GEN-LAST:event_salvarBTActionPerformed

    private void marcaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaTFActionPerformed

    private void nomeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTFActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarBT;
    private javax.swing.JLabel dadosLB;
    private javax.swing.JLabel dadosObrigatoriosLB;
    private javax.swing.JFormattedTextField dataFabricacaoFTF;
    private javax.swing.JLabel dataFabricacaoLB;
    private javax.swing.JFormattedTextField dataVencimentoFTF;
    private javax.swing.JLabel dataVencimentoLB;
    private javax.swing.JLabel marcaLB;
    private javax.swing.JTextField marcaTF;
    private javax.swing.JLabel nomeLB;
    private javax.swing.JTextField nomeTF;
    private javax.swing.JFormattedTextField precoFTF;
    private javax.swing.JLabel precoLB;
    private javax.swing.JButton salvarBT;
    // End of variables declaration//GEN-END:variables
}
