/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracaoc.Presentation;

import configuracaoc.Business.Cliente;
import configuracaoc.Business.ConfiguraFacil;
import configuracaoc.Business.Configuracao;
import configuracaoc.Business.Pacote;
import java.util.ArrayList;

/**
 *
 * @author PedroRibeiro
 */
public class ConfNormal6 extends javax.swing.JFrame {
    private ConfiguraFacil cf;
    private Configuracao configuracao;
    private Cliente cliente = new Cliente();
    private ArrayList<Integer> confitems;
    private Pacote pacote;
    /**
     * Creates new form ConfNormal6
     */
    public ConfNormal6() {
        initComponents();
    }
    
    public ConfNormal6(ConfiguraFacil cf, Configuracao c, ArrayList<Integer> confitems, Pacote pacote){
        initComponents();
        this.cf = cf;
        this.configuracao = c;
        this.confitems = confitems;
        this.pacote = pacote;
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
        jLabel2 = new javax.swing.JLabel();
        nomeTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        moradaTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nifTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        contactoTF = new javax.swing.JTextField();
        retroBut = new javax.swing.JButton();
        avancarBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ConfiguraFácil");

        jPanel1.setBackground(new java.awt.Color(201, 241, 253));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setText("Preencha os campos com os seus dados:");

        cancelOpBut.setBackground(new java.awt.Color(255, 93, 85));
        cancelOpBut.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        cancelOpBut.setText("Cancelar Configuração");
        cancelOpBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelOpButActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel2.setText("Nome");

        nomeTF.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel3.setText("Morada");

        moradaTF.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel4.setText("NIF");

        nifTF.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel5.setText("Contacto");

        contactoTF.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N

        retroBut.setBackground(new java.awt.Color(254, 198, 61));
        retroBut.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        retroBut.setText("Retroceder");
        retroBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retroButActionPerformed(evt);
            }
        });

        avancarBut.setBackground(new java.awt.Color(114, 187, 83));
        avancarBut.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        avancarBut.setText("Avançar");
        avancarBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avancarButActionPerformed(evt);
            }
        });

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(retroBut)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(nomeTF)
                                            .addComponent(moradaTF)
                                            .addComponent(nifTF)
                                            .addComponent(contactoTF, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE))))))
                        .addGap(0, 75, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(avancarBut, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancelOpBut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moradaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nifTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(contactoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retroBut, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avancarBut, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
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

        setSize(new java.awt.Dimension(616, 384));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelOpButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelOpButActionPerformed
        // TODO add your handling code here:
        dispose();
        FuncHome fh = new FuncHome(cf);
        fh.setVisible(true);
    }//GEN-LAST:event_cancelOpButActionPerformed

    private void retroButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retroButActionPerformed
        // TODO add your handling code here:
        dispose();
        ConfNormal5 cn5 = new ConfNormal5(cf, configuracao, confitems, pacote);
        cn5.setVisible(true);
    }//GEN-LAST:event_retroButActionPerformed

    private void avancarButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avancarButActionPerformed
        // TODO add your handling code here:
        String nome = nomeTF.getText();
        String morada = moradaTF.getText();
        String contacto = contactoTF.getText();
        String nif = nifTF.getText();
        
        cliente.setNome(nome);
        cliente.setMorada(morada);
        cliente.setContacto(contacto);
        cliente.setNif(nif);
        
        dispose();
        ConfNormal7 cn7 = new ConfNormal7(cf,configuracao, confitems ,cliente, pacote);
        cn7.setVisible(true);
    }//GEN-LAST:event_avancarButActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avancarBut;
    private javax.swing.JButton cancelOpBut;
    private javax.swing.JTextField contactoTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField moradaTF;
    private javax.swing.JTextField nifTF;
    private javax.swing.JTextField nomeTF;
    private javax.swing.JButton retroBut;
    // End of variables declaration//GEN-END:variables
}
