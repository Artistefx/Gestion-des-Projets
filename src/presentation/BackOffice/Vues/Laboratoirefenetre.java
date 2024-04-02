/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentation.BackOffice.Vues;

import Metier.MetierGestion.GestionnaireLabo;
import Metier.MetierPOJO.Laboratoire;
import presentation.BackOffice.Controlleur.ControlleurLaboratoire;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MERYEM
 */


public class Laboratoirefenetre extends javax.swing.JFrame {
    GestionnaireLabo laboGestionnaire = new GestionnaireLabo();
    Laboratoire labo = new Laboratoire();
     DefaultTableModel model ;

    /**
     * Creates new form Laboratoirefenetre
     */
    public Laboratoirefenetre(ControlleurLaboratoire c ) {
        initComponents();
        Table(jTablelabo);
        jTablelabo();
        this.controlleurlaboratoire = c;
        
    }
   
    public Laboratoirefenetre(ControlleurLaboratoire c , Laboratoire labo){
        this(c);
        this.nomLabo.setText(labo.getNom_labo());
        this.emailLabo.setText(labo.getEmail());
        this.ResponsableLabo.setText(labo.getResponsable());
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablelabo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Ajouterlabo = new javax.swing.JButton();
        ModifierBoutton = new javax.swing.JButton();
        Supprimerboutton = new javax.swing.JButton();
        ExitBoutton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nomLabo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        emailLabo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ResponsableLabo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        jTablelabo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 153), 1, true));
        jTablelabo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_Laboratoire", "Nom laboratoire", "email Laboratoire", "Responsable Laboratoire"
            }
        ));
        jScrollPane3.setViewportView(jTablelabo);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setText("      Laboratoire");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Ajouterlabo.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        Ajouterlabo.setForeground(new java.awt.Color(255, 0, 153));
        Ajouterlabo.setText("AJOUTER");
        Ajouterlabo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjouterlaboActionPerformed(evt);
            }
        });

        ModifierBoutton.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        ModifierBoutton.setForeground(new java.awt.Color(204, 0, 153));
        ModifierBoutton.setText("MODIFIER");
        ModifierBoutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifierBouttonActionPerformed(evt);
            }
        });

        Supprimerboutton.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        Supprimerboutton.setForeground(new java.awt.Color(153, 0, 153));
        Supprimerboutton.setText("Supprimer");
        Supprimerboutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupprimerbouttonActionPerformed(evt);
            }
        });

        ExitBoutton.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        ExitBoutton.setText("Exit");
        ExitBoutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBouttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Ajouterlabo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ModifierBoutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Supprimerboutton, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(ExitBoutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Ajouterlabo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ModifierBoutton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Supprimerboutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ExitBoutton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nom");

        nomLabo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomLaboActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email");

        emailLabo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailLaboActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Responsable");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nomLabo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                    .addComponent(emailLabo)
                    .addComponent(ResponsableLabo))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomLabo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(45, 45, 45))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(emailLabo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResponsableLabo, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(37, 37, 37))
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation/img/icons8-laboratoire-50.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(154, 154, 154)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(144, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(124, 124, 124)))
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(131, 131, 131))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

/* private void AjouterEtudiantActionPerformed(java.awt.event.ActionEvent evt) {                                                
        etd.setNom_etudiant(NomEtudiant.getText());
        etd.setPrenom_etudiant(PrenomEtudiant.getText());
        etd.setEmail(emailEtudiant.getText());
        etd.setCNE(cneEtudiant.getText());
        etd.setNiveau(NiveauEtudiant.getText());
        etd.setFiliere(FiliereEtudiant.getText()); 
        etdGestionnaire.inseretEtudiant(etd.getCNE(), etd.getNom_etudiant(), etd.getPrenom_etudiant(), etd.getEmail(), etd.getNiveau(), etd.getFiliere());
        Actualiser();
        Table(tableEtudiant);
        TableProduit();
    }       */

    private void AjouterlaboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjouterlaboActionPerformed
        labo.setNom_labo(nomLabo.getText());
        labo.setEmail(emailLabo.getText());
        labo.setResponsable(ResponsableLabo.getText());
        laboGestionnaire.insertLaboratoire(labo.getNom_labo(), labo.getEmail(), labo.getResponsable());
        Actualiser();
        Table(jTablelabo);
        jTablelabo();
        
    }//GEN-LAST:event_AjouterlaboActionPerformed

    private void SupprimerbouttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupprimerbouttonActionPerformed
        // TODO add your handling code here:
        controlleurlaboratoire.afficherPageSupp();
    }//GEN-LAST:event_SupprimerbouttonActionPerformed

    private void ModifierBouttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifierBouttonActionPerformed
        // TODO add your handling code here:
        controlleurlaboratoire.afficherPageMod();
    }//GEN-LAST:event_ModifierBouttonActionPerformed

    private void nomLaboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomLaboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomLaboActionPerformed

    private void emailLaboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailLaboActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_emailLaboActionPerformed

    private void ExitBouttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBouttonActionPerformed
        
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitBouttonActionPerformed
    
  private void Table(JTable jTablelabo){
        jTablelabo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
              /*  {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}*/
            },
            new String [] {
                "id_Laboratoire", " nom Laboratoire", " email","Responsable"
            }
        ));
        jScrollPane3.setViewportView(jTablelabo);
   }
  
   
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ajouterlabo;
    private javax.swing.JButton ExitBoutton;
    private javax.swing.JButton ModifierBoutton;
    private javax.swing.JTextField ResponsableLabo;
    private javax.swing.JButton Supprimerboutton;
    private javax.swing.JTextField emailLabo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTablelabo;
    private javax.swing.JTextField nomLabo;
    // End of variables declaration//GEN-END:variables
    private ControlleurLaboratoire controlleurlaboratoire;
    
   
     private void Actualiser() {
       nomLabo.setText(null);
       emailLabo.setText(null);
       ResponsableLabo.setText(null);
        jTablelabo.setModel(new DefaultTableModel());   
    }
     private void jTablelabo() {
        
        ArrayList<Laboratoire> lis =laboGestionnaire.getAllLaboratoire();
        model =(DefaultTableModel)jTablelabo.getModel();
        Object[] ob = new Object[6];
        for (int i = 0 ; i<lis.size() ; i++){
        
        ob[0] = lis.get(i).getId_laboratoire();
        ob[1] = lis.get(i).getNom_labo();
        ob[2] = lis.get(i).getEmail();
        ob[3] = lis.get(i).getResponsable();
        model.addRow(ob);
            
            
        }
     }}
