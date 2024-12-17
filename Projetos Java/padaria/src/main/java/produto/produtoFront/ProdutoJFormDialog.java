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
        salvarBT = new javax.swing.JButton();
        dataVencimentoLB = new javax.swing.JLabel();
        cancelarBT = new javax.swing.JButton();
        dadosObrigatoriosLB = new javax.swing.JLabel();
        precoLB = new javax.swing.JLabel();
        dataFabricacaoLB = new javax.swing.JLabel();
        marcaLB = new javax.swing.JLabel();
        nomeTF = new javax.swing.JTextField();
        marcaTF = new javax.swing.JTextField();
        dataFabricacaoFTF = new javax.swing.JFormattedTextField();
        dataVencimentoFTF1 = new javax.swing.JFormattedTextField();
        dadosLB1 = new javax.swing.JLabel();
        precoFTF1 = new javax.swing.JFormattedTextField();
        nomeLB1 = new javax.swing.JLabel();
        salvarBT1 = new javax.swing.JButton();
        dataVencimentoLB1 = new javax.swing.JLabel();
        cancelarBT1 = new javax.swing.JButton();
        dadosObrigatoriosLB1 = new javax.swing.JLabel();
        precoLB1 = new javax.swing.JLabel();
        dataFabricacaoLB1 = new javax.swing.JLabel();
        marcaLB1 = new javax.swing.JLabel();
        nomeTF1 = new javax.swing.JTextField();
        marcaTF1 = new javax.swing.JTextField();
        dataFabricacaoFTF1 = new javax.swing.JFormattedTextField();

        dataVencimentoFTF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        dadosLB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dadosLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dadosLB.setText("Dados do Produto");

        precoFTF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        nomeLB.setText("*Nome:");

        salvarBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        salvarBT.setText("Salvar");

        dataVencimentoLB.setText("*Data de vencimento: ");

        cancelarBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x-circle.png"))); // NOI18N
        cancelarBT.setText("Cancelar");

        dadosObrigatoriosLB.setForeground(new java.awt.Color(255, 102, 102));
        dadosObrigatoriosLB.setText("*Dados obrigatorios");

        precoLB.setText("*Preco:");

        dataFabricacaoLB.setText("*Data de fabricação:");

        marcaLB.setText("*Marca:");

        dataFabricacaoFTF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        dataVencimentoFTF1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        dadosLB1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dadosLB1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dadosLB1.setText("Dados do Produto");

        precoFTF1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        nomeLB1.setText("*Nome:");

        salvarBT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        salvarBT1.setText("Salvar");
        salvarBT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarBT1ActionPerformed(evt);
            }
        });

        dataVencimentoLB1.setText("*Data de vencimento: ");

        cancelarBT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x-circle.png"))); // NOI18N
        cancelarBT1.setText("Cancelar");
        cancelarBT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBT1ActionPerformed(evt);
            }
        });

        dadosObrigatoriosLB1.setForeground(new java.awt.Color(255, 102, 102));
        dadosObrigatoriosLB1.setText("*Dados obrigatorios");

        precoLB1.setText("*Preco:");

        dataFabricacaoLB1.setText("*Data de fabricação:");

        marcaLB1.setText("*Marca:");

        dataFabricacaoFTF1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dadosLB1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(precoLB1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dadosObrigatoriosLB1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dataFabricacaoLB1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(dataVencimentoLB1)
                    .addComponent(marcaLB1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(nomeLB1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeTF1)
                            .addComponent(marcaTF1)
                            .addComponent(dataFabricacaoFTF1)
                            .addComponent(dataVencimentoFTF1)
                            .addComponent(precoFTF1)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelarBT1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(salvarBT1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dadosLB1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLB1)
                    .addComponent(nomeTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marcaLB1)
                    .addComponent(marcaTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataFabricacaoLB1)
                    .addComponent(dataFabricacaoFTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataVencimentoLB1)
                    .addComponent(dataVencimentoFTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precoLB1)
                    .addComponent(precoFTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dadosObrigatoriosLB1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(salvarBT1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cancelarBT1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarBT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarBT1ActionPerformed
        if (!formularioValido()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Formulario inválido, por favor verifique os campos em vermelho",
                    "ERRO DE VALIDAÇAO",
                    JOptionPane.ERROR_MESSAGE
            );

            formularioObjeto();

            if(produto.getId() == 0) {
                produtoDAO.create(produto);
                JOptionPane.showMessageDialog(
                        null,
                        "Produto cadastrado com sucesso!",
                        "SUCESSO",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } else {
                produtoDAO.update(produto);
                JOptionPane.showMessageDialog(
                        null,
                        "Produto atualizado com sucesso!",
                        "SUCESSO",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
            this.dispose();
        }
    }

    private void cancelarBT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBT1ActionPerformed
        this.dispose();
        limparCampos();
    }//GEN-LAST:event_cancelarBT1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarBT;
    private javax.swing.JButton cancelarBT1;
    private javax.swing.JLabel dadosLB;
    private javax.swing.JLabel dadosLB1;
    private javax.swing.JLabel dadosObrigatoriosLB;
    private javax.swing.JLabel dadosObrigatoriosLB1;
    private javax.swing.JFormattedTextField dataFabricacaoFTF;
    private javax.swing.JFormattedTextField dataFabricacaoFTF1;
    private javax.swing.JLabel dataFabricacaoLB;
    private javax.swing.JLabel dataFabricacaoLB1;
    private javax.swing.JFormattedTextField dataVencimentoFTF;
    private javax.swing.JFormattedTextField dataVencimentoFTF1;
    private javax.swing.JLabel dataVencimentoLB;
    private javax.swing.JLabel dataVencimentoLB1;
    private javax.swing.JLabel marcaLB;
    private javax.swing.JLabel marcaLB1;
    private javax.swing.JTextField marcaTF;
    private javax.swing.JTextField marcaTF1;
    private javax.swing.JLabel nomeLB;
    private javax.swing.JLabel nomeLB1;
    private javax.swing.JTextField nomeTF;
    private javax.swing.JTextField nomeTF1;
    private javax.swing.JFormattedTextField precoFTF;
    private javax.swing.JFormattedTextField precoFTF1;
    private javax.swing.JLabel precoLB;
    private javax.swing.JLabel precoLB1;
    private javax.swing.JButton salvarBT;
    private javax.swing.JButton salvarBT1;
    // End of variables declaration//GEN-END:variables
}
