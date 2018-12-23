/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracaoc.Presentation;

import configuracaoc.Business.ConfiguraFacil;

/**
 *
 * @author PedroRibeiro
 */
public class FuncHome extends javax.swing.JFrame {
    
    private ConfiguraFacil cf;
    /**
     * Creates new form FuncHome
     */
    public FuncHome() {
        initComponents();
    }
    
    public FuncHome(ConfiguraFacil cf){
        initComponents();
        this.cf = cf;
    }
    
    public FuncHome(ConfiguraFacil cf, String nome, String mail, String contacto){
        initComponents();
        this.cf = cf;
        
        nomeLabel.setText(nome);
        mailLabel.setText(mail);
        contactLabel.setText(contacto);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mailLabel = new javax.swing.JLabel();
        nomeLabel = new javax.swing.JLabel();
        contactLabel = new javax.swing.JLabel();
        logoutBut = new javax.swing.JButton();
        confNormalBut = new javax.swing.JButton();
        confOtiBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ConfiguraFácil");

        jPanel1.setBackground(new java.awt.Color(201, 241, 253));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel1.setText("ConfiguraFácil");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/configuracaoc/Presentation/lowicon.png"))); // NOI18N

        mailLabel.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        mailLabel.setText("Email");

        nomeLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        nomeLabel.setText("Nome");

        contactLabel.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        contactLabel.setText("Contacto");

        logoutBut.setBackground(new java.awt.Color(85, 174, 255));
        logoutBut.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        logoutBut.setText("Logout");
        logoutBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButActionPerformed(evt);
            }
        });

        confNormalBut.setBackground(new java.awt.Color(114, 187, 83));
        confNormalBut.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        confNormalBut.setText("Configuração Costumizada");
        confNormalBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confNormalButActionPerformed(evt);
            }
        });

        confOtiBut.setBackground(new java.awt.Color(254, 198, 61));
        confOtiBut.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        confOtiBut.setText("Configuração Ótima");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mailLabel)
                            .addComponent(contactLabel)
                            .addComponent(nomeLabel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(logoutBut)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(confOtiBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(confNormalBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logoutBut)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(nomeLabel)
                                .addGap(11, 11, 11)
                                .addComponent(mailLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(contactLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(confNormalBut, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(confOtiBut, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel2)))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(649, 366));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confNormalButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confNormalButActionPerformed
        // TODO add your handling code here:
        
        ConfNormal cn = new ConfNormal(cf);
        cn.setVisible(true);
    }//GEN-LAST:event_confNormalButActionPerformed

    private void logoutButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButActionPerformed
        // TODO add your handling code here:
        dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_logoutButActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confNormalBut;
    private javax.swing.JButton confOtiBut;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutBut;
    private javax.swing.JLabel mailLabel;
    private javax.swing.JLabel nomeLabel;
    // End of variables declaration//GEN-END:variables
}
