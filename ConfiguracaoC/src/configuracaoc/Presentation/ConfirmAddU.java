/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracaoc.Presentation;

import configuracaoc.Business.ConfiguraFacil;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PedroRibeiro
 */
public class ConfirmAddU extends javax.swing.JFrame {

    private ConfiguraFacil cf;
    private int id;
    private String tipo;
    private String nome;
    private String mail;
    private String password;
    private String username;
    private String contacto;
    /**
     * Creates new form ConfirmAddU
     */
    public ConfirmAddU() {
        initComponents();
    }
    
    public ConfirmAddU(ConfiguraFacil cf, String tipo, String nome, String mail, String password, String username, String contacto){
        initComponents();
        this.cf = cf;
        this.id = id;
        this.tipo = tipo;
        this.nome = nome;
        this.mail = mail;
        this.password = password;
        this.username = username;
        this.contacto = contacto;
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
        noBut = new javax.swing.JButton();
        yesBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ConfiguraFácil");

        jPanel1.setBackground(new java.awt.Color(201, 241, 253));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel1.setText("Tem a certeza que quer adicionar este Utilizador");

        noBut.setBackground(new java.awt.Color(255, 93, 85));
        noBut.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        noBut.setText("Não");
        noBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noButActionPerformed(evt);
            }
        });

        yesBut.setBackground(new java.awt.Color(114, 187, 83));
        yesBut.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        yesBut.setText("Sim");
        yesBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(noBut)
                        .addGap(78, 78, 78)
                        .addComponent(yesBut)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noBut)
                    .addComponent(yesBut))
                .addContainerGap(21, Short.MAX_VALUE))
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

        setSize(new java.awt.Dimension(401, 128));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void noButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noButActionPerformed
        // TODO add your handling code here:
        dispose();
        AdicionarUtilizador au = new AdicionarUtilizador();
        au.setVisible(true);
    }//GEN-LAST:event_noButActionPerformed

    private void yesButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesButActionPerformed
        // TODO add your handling code here:
        cf.adicionarUtilizador(tipo, nome, mail, username, password, contacto);
        this.dispose();
        
        GerirUtilizadores gu;
        
        gu = new GerirUtilizadores(cf);
        
        gu.setVisible(true);
    }//GEN-LAST:event_yesButActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton noBut;
    private javax.swing.JButton yesBut;
    // End of variables declaration//GEN-END:variables
}
