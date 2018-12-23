/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracaoc.Presentation;

import configuracaoc.Business.ConfiguraFacil;
import configuracaoc.Business.Pacote;
import configuracaoc.Business.Utilizador;
import configuracaoc.Presentation.RemoverPacote;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PedroRibeiro
 */
public class GerirPacotesConf extends javax.swing.JFrame {

    private ConfiguraFacil cf;
    private DefaultTableModel table;
    /**
     * Creates new form GerirPacotesConf
     */
    public GerirPacotesConf() {
        initComponents();
    }
    
    public GerirPacotesConf(ConfiguraFacil cf){
        initComponents();
        this.cf = cf;
        doTable();
    }
    
    public void doTable() {
        String colunas[] = {"ID", "Nome", "Desconto"};
        table = new DefaultTableModel(colunas,0);
        
        pacotesTable.setModel(table);
        
        ArrayList<Pacote> pacotes = cf.getPacotes();
        for(Pacote p : pacotes){
            int id = p.getID();
            String nome = p.getNome();
            String desconto = p.getDesconto();
            
            table.addRow(new Object[]{id, nome, desconto});
            
        }
        
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
        logoutBut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pacotesTable = new javax.swing.JTable();
        menuPrincipalBut = new javax.swing.JButton();
        adicionarPacBut = new javax.swing.JButton();
        removerPacBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ConfiguraFácil");

        jPanel1.setBackground(new java.awt.Color(201, 241, 253));

        logoutBut.setBackground(new java.awt.Color(85, 174, 255));
        logoutBut.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        logoutBut.setText("Logout");
        logoutBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setText("ConfiguraFácil");

        jScrollPane2.setBackground(new java.awt.Color(85, 174, 255));

        pacotesTable.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        pacotesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Pacote", "Preço", "Desconto(%)"
            }
        ));
        pacotesTable.setSelectionForeground(new java.awt.Color(85, 174, 255));
        jScrollPane2.setViewportView(pacotesTable);

        menuPrincipalBut.setBackground(new java.awt.Color(254, 198, 61));
        menuPrincipalBut.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        menuPrincipalBut.setText("Menu Principal");
        menuPrincipalBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPrincipalButActionPerformed(evt);
            }
        });

        adicionarPacBut.setBackground(new java.awt.Color(114, 187, 83));
        adicionarPacBut.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        adicionarPacBut.setText("Adicionar Pacote");
        adicionarPacBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarPacButActionPerformed(evt);
            }
        });

        removerPacBut.setBackground(new java.awt.Color(255, 93, 85));
        removerPacBut.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        removerPacBut.setText("Remover Pacote");
        removerPacBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerPacButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutBut)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(menuPrincipalBut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(removerPacBut)
                        .addGap(52, 52, 52)
                        .addComponent(adicionarPacBut)
                        .addGap(31, 31, 31))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logoutBut))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adicionarPacBut, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removerPacBut, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(menuPrincipalBut, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

        setSize(new java.awt.Dimension(616, 383));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButActionPerformed
        // TODO add your handling code here:
        dispose();
        Login login = new Login(cf);
        login.setVisible(true);
    }//GEN-LAST:event_logoutButActionPerformed

    private void menuPrincipalButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPrincipalButActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_menuPrincipalButActionPerformed

    private void removerPacButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerPacButActionPerformed
        // TODO add your handling code here:
        //dispose();
        RemoverPacote rm = new RemoverPacote();
        rm.setVisible(true);
    }//GEN-LAST:event_removerPacButActionPerformed

    private void adicionarPacButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarPacButActionPerformed
        // TODO add your handling code here:
        dispose();
        AdicionarPacote ap = new AdicionarPacote();
        ap.setVisible(true);
    }//GEN-LAST:event_adicionarPacButActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarPacBut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logoutBut;
    private javax.swing.JButton menuPrincipalBut;
    private javax.swing.JTable pacotesTable;
    private javax.swing.JButton removerPacBut;
    // End of variables declaration//GEN-END:variables
}

