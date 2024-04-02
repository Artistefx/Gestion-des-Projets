
package presentation.BackOffice.Vues;

import Metier.MetierGestion.GestionnaireDepartement;
import Metier.MetierGestion.GestionnaireProfesseur;
import Metier.MetierPOJO.Professeur;
import presentation.BackOffice.Controlleur.ControlleurProfesseur;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class professeur extends javax.swing.JFrame {
    GestionnaireProfesseur etdGestionnaire = new GestionnaireProfesseur();
        Professeur etd = new Professeur();
        DefaultTableModel model ;
        //GestionnaireDepartement laboG = new GestionnaireDepartement();
        ControlleurProfesseur controlleurprofesseur;
        
        
    public professeur(ControlleurProfesseur c) {
        initComponents();
         TableProduit();
        this.controlleurprofesseur = c;
    }    

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProf = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        AjouterProfesseur = new javax.swing.JButton();
        SupprimerProfesseur = new javax.swing.JButton();
        modifierProfesseur = new javax.swing.JButton();
        retourMenu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        NomProf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PrenomProf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        emailProf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        departementProf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        gradeProf = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation/img/9023992_student_fill_icon.png"))); // NOI18N
        jLabel1.setText("             AJOUTER UN PROFESSEUR");

        tableProf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOM", "PRENOM", "EMAIL", "GRADE"
            }
        ));
        jScrollPane1.setViewportView(tableProf);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        AjouterProfesseur.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        AjouterProfesseur.setForeground(new java.awt.Color(255, 0, 153));
        AjouterProfesseur.setText("AJOUTER");
        AjouterProfesseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjouterProfesseurActionPerformed(evt);
            }
        });

        SupprimerProfesseur.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        SupprimerProfesseur.setForeground(new java.awt.Color(153, 0, 153));
        SupprimerProfesseur.setText("SUPPRIMER");
        SupprimerProfesseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupprimerProfesseurActionPerformed(evt);
            }
        });

        modifierProfesseur.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        modifierProfesseur.setForeground(new java.awt.Color(204, 0, 153));
        modifierProfesseur.setText("MODIFIER");
        modifierProfesseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierProfesseurActionPerformed(evt);
            }
        });

        retourMenu.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        retourMenu.setForeground(new java.awt.Color(51, 0, 51));
        retourMenu.setText("EXIT");
        retourMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retourMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SupprimerProfesseur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AjouterProfesseur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modifierProfesseur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(retourMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AjouterProfesseur, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modifierProfesseur, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SupprimerProfesseur, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(retourMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NOM");

        NomProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomProfActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("PRENOM");

        PrenomProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrenomProfActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("EMAIL");

        emailProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailProfActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DEPARTEMENT");

        departementProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departementProfActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("GRADE");

        gradeProf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PH", "PES", "PA", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(193, 193, 193))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NomProf, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PrenomProf, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(gradeProf, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(emailProf, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(departementProf, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111)))
                        .addGap(42, 42, 42)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NomProf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailProf, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PrenomProf, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gradeProf, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(departementProf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(864, 512));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   private void Table(JTable tableProfesseur) {
        tableProfesseur.setBackground(new java.awt.Color(204, 204, 204));
        tableProfesseur.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        tableProfesseur.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOM", "PRENOM", "EMAIL", "GRADE", "DEPARTEMENT"
            }
        ));
        tableProf.setRowMargin(1);
        jScrollPane1.setViewportView(tableProfesseur);

    }
    private void AjouterProfesseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjouterProfesseurActionPerformed
        // Récupérer les données saisies par l'utilisateur
        etd.setNom(NomProf.getText());
        etd.setPrenom(PrenomProf.getText());
        etd.setEmail(emailProf.getText());
        etd.setgrade(gradeProf.getSelectedItem().toString());
        etd.setDepartement(departementProf.getText());
        JTable tableEtudiant;
        // Vérifier si le niveau est "Doctorant" et si le nom du laboratoire a été saisi
            // Vérifier si le nom du laboratoire a été saisi
            if (NomProf.getText().isEmpty() || PrenomProf.getText().isEmpty() || emailProf.getText().isEmpty() || departementProf.getText().isEmpty()) {
                // Afficher un message d'erreur si le nom du laboratoire n'a pas été saisi
                JOptionPane.showMessageDialog(this, "Enterer tout les champs !! ", "Erreur", JOptionPane.ERROR_MESSAGE);
            } else {
            

                // Créer un objet Professeur
                etdGestionnaire.insertProfesseur(etd.getNom() , etd.getPrenom(), etd.getEmail(), etd.getgrade(), etd.getDepartement());
                // Récupérer l'ID du prof nouvellement inséré
                int profId =etdGestionnaire.getIDByNom(NomProf.getText());
                // Récupérer l'ID du departement choisi
                int departId = etdGestionnaire.getDepartementBynom(departementProf.getText());
                

                // Insérer le nouveau membre dans la table Membre_Laboratoire_doctorants
                etdGestionnaire.ajouterMembreDepartement(profId, departId);

                // Actualiser la liste des étudiants affichée dans la fenêtre principale
                Actualiser();
                Table(tableProf);
                TableProduit();

            
        
        }

        /* Actualiser();

        Table(tableEtudiant);
        TableProduit();*/

    }//GEN-LAST:event_AjouterProfesseurActionPerformed

    private void SupprimerProfesseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupprimerProfesseurActionPerformed
        // TODO add your handling code here:
        controlleurprofesseur.afficherPageSupp();

    }//GEN-LAST:event_SupprimerProfesseurActionPerformed

    private void modifierProfesseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierProfesseurActionPerformed

        controlleurprofesseur.afficherPageModif();
    }//GEN-LAST:event_modifierProfesseurActionPerformed

    private void retourMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retourMenuActionPerformed
        this.dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_retourMenuActionPerformed

    private void NomProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomProfActionPerformed

    }//GEN-LAST:event_NomProfActionPerformed

    private void PrenomProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrenomProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrenomProfActionPerformed

    private void emailProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailProfActionPerformed

    private void departementProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departementProfActionPerformed

    }//GEN-LAST:event_departementProfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AjouterProfesseur;
    private javax.swing.JTextField NomProf;
    private javax.swing.JTextField PrenomProf;
    private javax.swing.JButton SupprimerProfesseur;
    private javax.swing.JTextField departementProf;
    private javax.swing.JTextField emailProf;
    private javax.swing.JComboBox<String> gradeProf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifierProfesseur;
    private javax.swing.JButton retourMenu;
    private javax.swing.JTable tableProf;
    // End of variables declaration//GEN-END:variables

   private void Actualiser() {
        NomProf.setText(null);
        PrenomProf.setText(null);
        departementProf.setText(null);
  
        emailProf.setText(null);
        
        tableProf.setModel(new DefaultTableModel());   
    }

    private void TableProduit() {
        ArrayList<Professeur> lis =etdGestionnaire.getAllProfesseur();
        model =(DefaultTableModel)tableProf.getModel();
        Object[] ob = new Object[6];
        for (int i = 0 ; i<lis.size() ; i++){
            ob[0] = lis.get(i).getNom();
            ob[1] = lis.get(i).getPrenom();
            ob[2] = lis.get(i).getEmail();
            ob[3] = lis.get(i).getgrade();
            
            model.addRow(ob);
            
            
        }
    }
}
