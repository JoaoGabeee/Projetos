package evangelismoCrud.main;

public class JanelaPrincipalJFrame extends javax.swing.JFrame {

    private UsuariosJInternalFrame usuariosJInternalFrame;

    /**
     * Creates new form JanelaPrincipalJFrame
     */
    public JanelaPrincipalJFrame() {
        usuariosJInternalFrame = new UsuariosJInternalFrame(this);
        initComponents();
        painelPrincipal.add(usuariosJInternalFrame);
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        jMenuBar = new javax.swing.JMenuBar();
        arquivoMenu = new javax.swing.JMenu();
        sairMNI = new javax.swing.JMenuItem();
        servicoesMenu = new javax.swing.JMenu();
        usuariosMNI = new javax.swing.JMenuItem();
        funcoesMenu = new javax.swing.JMenu();
        medicoMNI = new javax.swing.JMenuItem();

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        arquivoMenu.setText("Outros");

        sairMNI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/log-out.png"))); // NOI18N
        sairMNI.setText("Sair");
        sairMNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairMNIActionPerformed(evt);
            }
        });
        arquivoMenu.add(sairMNI);

        jMenuBar.add(arquivoMenu);

        servicoesMenu.setText("Serviços");

        usuariosMNI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        usuariosMNI.setText("Usuários");
        usuariosMNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariosMNIActionPerformed(evt);
            }
        });
        servicoesMenu.add(usuariosMNI);

        funcoesMenu.setText("Serviços");

        medicoMNI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        medicoMNI.setText("Medico");
        medicoMNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicoMNIActionPerformed(evt);
            }
        });
        funcoesMenu.add(medicoMNI);

        servicoesMenu.add(funcoesMenu);

        jMenuBar.add(servicoesMenu);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairMNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairMNIActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairMNIActionPerformed

    private void medicoMNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicoMNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicoMNIActionPerformed

    private void usuariosMNIActionPerformed(
            java.awt.event.ActionEvent evt) { // GEN-FIRST:event_usuariosMIActionPerformed
        usuariosJInternalFrame.setVisible(true);
        this.pack();
        setExtendedState(MAXIMIZED_BOTH);
    } // GEN-LAST:event_usuariosMIActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu arquivoMenu;
    private javax.swing.JMenu funcoesMenu;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem medicoMNI;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JMenuItem sairMNI;
    private javax.swing.JMenu servicoesMenu;
    private javax.swing.JMenuItem usuariosMNI;
    // End of variables declaration//GEN-END:variables
}
