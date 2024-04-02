
package presentation.BackOffice.Vues;

import Metier.MetierGestion.GestionnaireFiliere;
import Metier.MetierPOJO.Filiere;
import presentation.BackOffice.Controlleur.ControlleurFiliere;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class filiere extends javax.swing.JFrame {
    GestionnaireFiliere etdGestionnaire = new GestionnaireFiliere();
        Filiere etd = new Filiere();
        DefaultTableModel model ;
        ControlleurFiliere controlleurfiliere;
    public filiere(ControlleurFiliere c) {
        initComponents();
         TableProduit();
        this.controlleurfiliere = c;
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFiliere = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        AjouterFiliere = new javax.swing.JButton();
        SupprimerFiliere = new javax.swing.JButton();
        modifierFiliere = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        NomFiliere = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Departement = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        coordinateur = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation/img/9023992_student_fill_icon.png"))); // NOI18N
        jLabel1.setText("             AJOUTER UNE FILIERE");

        tableFiliere.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID FILIERE", "NOM FILIERE", "DEPARTEMENT", "COORDINATEUR"
            }
        ));
        jScrollPane1.setViewportView(tableFiliere);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        AjouterFiliere.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        AjouterFiliere.setForeground(new java.awt.Color(255, 0, 153));
        AjouterFiliere.setText("AJOUTER");
        AjouterFiliere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjouterFiliereActionPerformed(evt);
            }
        });

        SupprimerFiliere.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        SupprimerFiliere.setForeground(new java.awt.Color(153, 0, 153));
        SupprimerFiliere.setText("SUPPRIMER");
        SupprimerFiliere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupprimerFiliereActionPerformed(evt);
            }
        });

        modifierFiliere.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        modifierFiliere.setForeground(new java.awt.Color(204, 0, 153));
        modifierFiliere.setText("MODIFIER");
        modifierFiliere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierFiliereActionPerformed(evt);
            }
        });

        EXIT.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        EXIT.setForeground(new java.awt.Color(51, 0, 51));
        EXIT.setText("EXIT");
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SupprimerFiliere, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(AjouterFiliere, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modifierFiliere, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EXIT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AjouterFiliere, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modifierFiliere, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SupprimerFiliere, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOM FILIERE ");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DEPARTEMENT");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("COORDINATEUR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(223, 223, 223))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NomFiliere)
                                    .addComponent(Departement)
                                    .addComponent(coordinateur, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NomFiliere, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Departement, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(coordinateur, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                        .addGap(29, 29, 29)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(871, 549));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Table(JTable tableEtudiant) {
        tableEtudiant.setBackground(new java.awt.Color(204, 204, 204));
        tableEtudiant.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        tableEtudiant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID FILIERE", "NOM FILIERE ", "DEPARTEMENT", "COORDINATEUR"
            }
        ));
        tableEtudiant.setRowMargin(1);
        jScrollPane1.setViewportView(tableEtudiant);

    }

    private void AjouterFiliereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjouterFiliereActionPerformed
    // Récupérer les données saisies par l'utilisateur
        etd.setNom_filiere(NomFiliere.getText());
        etd.setDepartement(Departement.getText());
        etd.setCoordinateur(coordinateur.getText());

       if(!etdGestionnaire.checkCoordinateurDepartement(etd.getCoordinateur(), etd.getDepartement())) {
            JOptionPane.showMessageDialog(null, "Le coordinateur ne peut pas être ajouté à cette filière car il n'appartient pas au département sélectionné.");
        }
        else {
            etdGestionnaire.insertFiliere(etd.getNom_filiere(), etd.getDepartement(), etd.getCoordinateur());
         
            // Actualiser la liste des Filieres affichée dans la fenêtre principale
            Actualiser();
            Table(tableFiliere);
            TableProduit();
       }   
 
    }//GEN-LAST:event_AjouterFiliereActionPerformed

    private void SupprimerFiliereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupprimerFiliereActionPerformed
        // TODO add your handling code here:
        controlleurfiliere.afficherPageSupp();

    }//GEN-LAST:event_SupprimerFiliereActionPerformed

    private void modifierFiliereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierFiliereActionPerformed

        controlleurfiliere.afficherPageModif();
    }//GEN-LAST:event_modifierFiliereActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        this.dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_EXITActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AjouterFiliere;
    private javax.swing.JTextField Departement;
    private javax.swing.JButton EXIT;
    private javax.swing.JTextField NomFiliere;
    private javax.swing.JButton SupprimerFiliere;
    private javax.swing.JTextField coordinateur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifierFiliere;
    private javax.swing.JTable tableFiliere;
    // End of variables declaration//GEN-END:variables

   private void Actualiser() {
        NomFiliere.setText(null);
        coordinateur.setText(null);
        Departement.setText(null);       
        tableFiliere.setModel(new DefaultTableModel());   
    }

    private void TableProduit() {
        ArrayList<Filiere> lis =etdGestionnaire.getAllFiliere();
        model =(DefaultTableModel)tableFiliere.getModel();
        Object[] ob = new Object[6];
        for (int i = 0 ; i<lis.size() ; i++){
            ob[0] = lis.get(i).getId_filiere();
            ob[1] = lis.get(i).getNom_filiere();
            ob[2] = lis.get(i).getDepartement();
            ob[3] = lis.get(i).getCoordinateur();
            
            model.addRow(ob);
            
            
        }
    }
}
