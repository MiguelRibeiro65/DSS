/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracaoc.Presentation;

import configuracaoc.Business.ConfiguraFacil;
import configuracaoc.Business.Configuracao;
import configuracaoc.Business.ConfiguracaoNormal;
import configuracaoc.Business.Item;
import java.util.ArrayList;

/**
 *
 * @author PedroRibeiro
 */
public class ConfNormal5 extends javax.swing.JFrame {
    
    private ConfiguraFacil cf;
    private Configuracao configuracao;
    private ArrayList<Integer> confitems;
    /**
     * Creates new form ConfNormal5
     */
    public ConfNormal5() {
        initComponents();
    }
    
    public ConfNormal5(ConfiguraFacil cf, Configuracao c, ArrayList<Integer> confitems) {
        initComponents();
        this.cf = cf;
        this.configuracao = c;
        this.confitems = confitems;
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
        cancelOpBut = new javax.swing.JButton();
        funcTVcheck = new javax.swing.JCheckBox();
        consolaTrascheck = new javax.swing.JCheckBox();
        sistemaSomcheck = new javax.swing.JCheckBox();
        spoilercheck = new javax.swing.JCheckBox();
        vidrossolarcheck = new javax.swing.JCheckBox();
        travoesDespCheck = new javax.swing.JCheckBox();
        volanteAqCheck = new javax.swing.JCheckBox();
        vidrosLaminadosCheck = new javax.swing.JCheckBox();
        escovasCheck = new javax.swing.JCheckBox();
        retroBut = new javax.swing.JButton();
        avancarBut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ConfiguraFácil");

        jPanel1.setBackground(new java.awt.Color(201, 241, 253));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setText("Deseja adicionar outros componentes extra?");

        cancelOpBut.setBackground(new java.awt.Color(255, 93, 85));
        cancelOpBut.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        cancelOpBut.setText("Cancelar Configuração");
        cancelOpBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelOpButActionPerformed(evt);
            }
        });

        funcTVcheck.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        funcTVcheck.setText("Função de TV");

        consolaTrascheck.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        consolaTrascheck.setText("Consola traseira");

        sistemaSomcheck.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        sistemaSomcheck.setText("Sistema de som Surrond");

        spoilercheck.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        spoilercheck.setText("Spoiler traseiro");

        vidrossolarcheck.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        vidrossolarcheck.setText("Vidros com proteção solar");

        travoesDespCheck.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        travoesDespCheck.setText("Travões desportivos");

        volanteAqCheck.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        volanteAqCheck.setText("Volante aquecido");

        vidrosLaminadosCheck.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        vidrosLaminadosCheck.setText("Vidros laminados");

        escovasCheck.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        escovasCheck.setText("Escovas faróis");

        retroBut.setBackground(new java.awt.Color(254, 198, 61));
        retroBut.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        retroBut.setText("Retroceder");
        retroBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retroButActionPerformed(evt);
            }
        });

        avancarBut.setBackground(new java.awt.Color(114, 187, 83));
        avancarBut.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        avancarBut.setText("Avançar");
        avancarBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avancarButActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("€");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setText("preco");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelOpBut))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(funcTVcheck)
                                    .addComponent(consolaTrascheck)
                                    .addComponent(sistemaSomcheck)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(retroBut)))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vidrossolarcheck)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(travoesDespCheck))
                                    .addComponent(spoilercheck))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vidrosLaminadosCheck)
                                    .addComponent(volanteAqCheck)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(avancarBut, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(escovasCheck)))
                                .addGap(39, 39, 39))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancelOpBut, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(funcTVcheck)
                    .addComponent(spoilercheck)
                    .addComponent(volanteAqCheck))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consolaTrascheck)
                    .addComponent(vidrossolarcheck)
                    .addComponent(vidrosLaminadosCheck))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sistemaSomcheck)
                    .addComponent(travoesDespCheck)
                    .addComponent(escovasCheck))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retroBut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avancarBut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
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

        setSize(new java.awt.Dimension(620, 398));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void retroButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retroButActionPerformed
        // TODO add your handling code here:
        dispose();
        ConfNormal4 cn4 = new ConfNormal4(cf, configuracao, confitems);
        cn4.setVisible(true);
    }//GEN-LAST:event_retroButActionPerformed

    private void cancelOpButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelOpButActionPerformed
        // TODO add your handling code here:
        dispose();
        FuncHome fh = new FuncHome(cf);
        fh.setVisible(true);
    }//GEN-LAST:event_cancelOpButActionPerformed

    private void avancarButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avancarButActionPerformed
        // TODO add your handling code here:
        ArrayList<Integer> extras = new ArrayList<Integer>();
        if(funcTVcheck.isSelected())
            confitems.add(cf.getItem("Função de TV"));
        if(consolaTrascheck.isSelected())
            confitems.add(cf.getItem("Consola traseira"));
        if(sistemaSomcheck.isSelected())
            confitems.add(cf.getItem("Sistema de som Surrond"));
        if(spoilercheck.isSelected())
            confitems.add(cf.getItem("Spoiler traseiro"));
        if(vidrossolarcheck.isSelected())
            confitems.add(cf.getItem("Vidros com proteção solar"));
        if(travoesDespCheck.isSelected())
            confitems.add(cf.getItem("Travões desportivos"));
        if(volanteAqCheck.isSelected())
            confitems.add(cf.getItem("Volante aquecido"));
        if(vidrosLaminadosCheck.isSelected())
            confitems.add(cf.getItem("Vidros laminados"));
        if(escovasCheck.isSelected())
            confitems.add(cf.getItem("Escovas faróis"));
        

        dispose();
        ConfNormal6 cn6 = new ConfNormal6(cf,configuracao, confitems);
        cn6.setVisible(true);
    }//GEN-LAST:event_avancarButActionPerformed

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
            java.util.logging.Logger.getLogger(ConfNormal5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfNormal5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfNormal5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfNormal5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfNormal5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avancarBut;
    private javax.swing.JButton cancelOpBut;
    private javax.swing.JCheckBox consolaTrascheck;
    private javax.swing.JCheckBox escovasCheck;
    private javax.swing.JCheckBox funcTVcheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton retroBut;
    private javax.swing.JCheckBox sistemaSomcheck;
    private javax.swing.JCheckBox spoilercheck;
    private javax.swing.JCheckBox travoesDespCheck;
    private javax.swing.JCheckBox vidrosLaminadosCheck;
    private javax.swing.JCheckBox vidrossolarcheck;
    private javax.swing.JCheckBox volanteAqCheck;
    // End of variables declaration//GEN-END:variables
}
