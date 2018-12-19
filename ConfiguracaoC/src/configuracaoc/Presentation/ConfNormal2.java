/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracaoc.Presentation;

import configuracaoc.Business.ConfiguraFacil;
import configuracaoc.Business.Configuracao;

/**
 *
 * @author PedroRibeiro
 */
public class ConfNormal2 extends javax.swing.JFrame {
    
    private ConfiguraFacil cf;
    private Configuracao configuracao;
    /**
     * Creates new form ConfNormal2
     */
    public ConfNormal2() {
        initComponents();
    }
    
    public ConfNormal2(ConfiguraFacil cf, Configuracao c) {
        initComponents();
        this.cf = cf;
        this.configuracao = c;
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
        cancelOpBut = new javax.swing.JButton();
        avancBut = new javax.swing.JButton();
        retrocBut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pacoteCB = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ConfiguraFácil");

        jPanel1.setBackground(new java.awt.Color(201, 241, 253));

        cancelOpBut.setBackground(new java.awt.Color(255, 93, 85));
        cancelOpBut.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        cancelOpBut.setText("Cancelar Configuração");
        cancelOpBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelOpButActionPerformed(evt);
            }
        });

        avancBut.setBackground(new java.awt.Color(114, 187, 83));
        avancBut.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        avancBut.setText("Avançar");
        avancBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avancButActionPerformed(evt);
            }
        });

        retrocBut.setBackground(new java.awt.Color(254, 198, 61));
        retrocBut.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        retrocBut.setText("Retroceder");
        retrocBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrocButActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        jLabel1.setText("Deseja adicionar à sua Configuração um Pacote?");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel2.setText("Pacote");

        pacoteCB.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        pacoteCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Escolher-", "Desportivo M", "Confort", "Line Luxury", "Line Advantage", "Line Urban" }));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setText("preco");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setText("€");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(retrocBut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(avancBut, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pacoteCB, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cancelOpBut)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancelOpBut, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pacoteCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avancBut, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(retrocBut, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(617, 384));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void retrocButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrocButActionPerformed
        // TODO add your handling code here:
        dispose();
        ConfNormal cn = new ConfNormal();
        cn.setVisible(true);
    }//GEN-LAST:event_retrocButActionPerformed

    private void cancelOpButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelOpButActionPerformed
        // TODO add your handling code here:
        dispose();
        FuncHome fh = new FuncHome();
        fh.setVisible(true);
    }//GEN-LAST:event_cancelOpButActionPerformed

    private void avancButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avancButActionPerformed
        // TODO add your handling code here:
        String pacote = (String) pacoteCB.getSelectedItem();
        configuracao.setPacote(pacote);
        dispose();
        ConfNormal3 cn3 = new ConfNormal3(cf, configuracao);
        cn3.setVisible(true);
    }//GEN-LAST:event_avancButActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avancBut;
    private javax.swing.JButton cancelOpBut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> pacoteCB;
    private javax.swing.JButton retrocBut;
    // End of variables declaration//GEN-END:variables
}
