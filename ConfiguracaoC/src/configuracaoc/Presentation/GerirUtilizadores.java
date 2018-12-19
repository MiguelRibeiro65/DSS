/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracaoc.Presentation;

import configuracaoc.Business.ConfiguraFacil;
import configuracaoc.Business.Utilizador;
import configuracaoc.Data.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author PedroRibeiro
 */
public class GerirUtilizadores extends javax.swing.JFrame {
    
    private ConfiguraFacil cf;
    private Connection conn;
    private DefaultTableModel table;
    /**
     * Creates new form GerirUtilizadores
     */
    public GerirUtilizadores() {
        initComponents();
        //doTable();
    }
    
    
    
    public GerirUtilizadores(ConfiguraFacil cf) {
        
        initComponents();
        this.cf = cf;
        doTable();

    }
    
    public void doTable() {
        String colunas[] = {"ID", "Tipo", "Nome", "Mail", "Username", "Password", "Contacto"};
        table = new DefaultTableModel(colunas,0);
        
        tableUtilizadores.setModel(table);
        
        ArrayList<Utilizador> utilizadores = cf.getUsers();
        for(Utilizador u : utilizadores){
            int id = u.getID();
            String tipo = u.getTipo();
            String nome = u.getNome();
            String mail = u.getMail();
            String username = u.getUsername();
            String password = u.getPassword();
            String contacto = u.getContacto();
            
            table.addRow(new Object[]{id,tipo,nome,mail,username,password,contacto});
            
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
        jLabel1 = new javax.swing.JLabel();
        logoutBut = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableUtilizadores = new javax.swing.JTable();
        menuPrincipalBut = new javax.swing.JButton();
        remBut = new javax.swing.JButton();
        addUserBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ConfiguraFácil");
        setBackground(new java.awt.Color(201, 241, 253));

        jPanel1.setBackground(new java.awt.Color(201, 241, 253));

        jLabel1.setFont(new java.awt.Font("Menlo", 0, 24)); // NOI18N
        jLabel1.setText("ConfiguraFácil");

        logoutBut.setBackground(new java.awt.Color(85, 174, 255));
        logoutBut.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        logoutBut.setText("Logout");
        logoutBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(85, 174, 255));

        tableUtilizadores.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tableUtilizadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "tipo", "nome", "mail", "contacto"
            }
        ));
        tableUtilizadores.setSelectionForeground(new java.awt.Color(85, 174, 255));
        jScrollPane2.setViewportView(tableUtilizadores);

        menuPrincipalBut.setBackground(new java.awt.Color(254, 198, 61));
        menuPrincipalBut.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        menuPrincipalBut.setText("Menu Principal");
        menuPrincipalBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPrincipalButActionPerformed(evt);
            }
        });

        remBut.setBackground(new java.awt.Color(255, 93, 85));
        remBut.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        remBut.setText("Remover Utilizador");
        remBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remButActionPerformed(evt);
            }
        });

        addUserBut.setBackground(new java.awt.Color(114, 187, 83));
        addUserBut.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        addUserBut.setText("Adicionar Utilizador");
        addUserBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutBut)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(menuPrincipalBut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(remBut)
                        .addGap(43, 43, 43)
                        .addComponent(addUserBut)
                        .addGap(34, 34, 34))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(logoutBut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menuPrincipalBut, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(remBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addUserBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(655, 366));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuPrincipalButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPrincipalButActionPerformed
        // TODO add your handling code here:
        dispose();
        
    }//GEN-LAST:event_menuPrincipalButActionPerformed

    private void addUserButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserButActionPerformed
        // TODO add your handling code here:
        dispose();
        AdicionarUtilizador au = new AdicionarUtilizador(cf);
        au.setVisible(true);
    }//GEN-LAST:event_addUserButActionPerformed

    private void logoutButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButActionPerformed
        // TODO add your handling code here:
        dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_logoutButActionPerformed

    private void remButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remButActionPerformed
        // TODO add your handling code here:
        //tableUtilizadores.getSelectedRow();
        System.out.println("cheguei ao gerirutilizadores");
        dispose();
        JDialog ru = new RemoverUtilizadorD(this,true,cf);
        ru.setVisible(true);
    }//GEN-LAST:event_remButActionPerformed

    /**
     * @param args the command line arguments
     */
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUserBut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logoutBut;
    private javax.swing.JButton menuPrincipalBut;
    private javax.swing.JButton remBut;
    private javax.swing.JTable tableUtilizadores;
    // End of variables declaration//GEN-END:variables
}