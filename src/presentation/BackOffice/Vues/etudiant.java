package presentation.BackOffice.Vues;
import Metier.MetierPOJO.Etudiant;
import presentation.BackOffice.Controlleur.ControlleurEtudiant;
import Metier.MetierGestion.GestionnaireEtudiant;
import Metier.MetierGestion.GestionnaireLabo;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class etudiant extends javax.swing.JFrame {
        GestionnaireEtudiant etdGestionnaire = new GestionnaireEtudiant();
        Etudiant etd = new Etudiant();
        DefaultTableModel model ;
        GestionnaireLabo laboG = new GestionnaireLabo();
        
        
        
        public etudiant(ControlleurEtudiant c) {
         initComponents();
         TableProduit();
        this.controlleuretudiant = c;
    }
 
  
        public etudiant(ControlleurEtudiant  c, Etudiant etd){
		this(c);
		this.NomEtudiant.setText(etd.getNom_etudiant());
		this.cneEtudiant.setText(etd.getCNE());
                this.PrenomEtudiant.setText(etd.getPrenom_etudiant());
                this.emailEtudiant.setText(etd.getEmail());
                this.FiliereEtudiant.setText(etd.getFiliere());
               //this.NiveauEtudiant.setText(etd.getNiveau());
                
		
	}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEtudiant = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        AjouterEtudiant = new javax.swing.JButton();
        SupprimerEtudiant = new javax.swing.JButton();
        modifierEtudiant = new javax.swing.JButton();
        retourMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        NomEtudiant = new javax.swing.JTextField();
        cneEtudiant = new javax.swing.JTextField();
        PrenomEtudiant = new javax.swing.JTextField();
        emailEtudiant = new javax.swing.JTextField();
        FiliereEtudiant = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        nomLabo = new javax.swing.JTextField();
        NiveauEtudiant = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        tableEtudiant.setBackground(new java.awt.Color(204, 204, 204));
        tableEtudiant.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        tableEtudiant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CNE", "NOM", "PRENOM", "EMAIL", "NIVEAU", "FILIERE"
            }
        ));
        tableEtudiant.setRowMargin(1);
        jScrollPane1.setViewportView(tableEtudiant);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        AjouterEtudiant.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        AjouterEtudiant.setForeground(new java.awt.Color(255, 0, 153));
        AjouterEtudiant.setText("AJOUTER");
        AjouterEtudiant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjouterEtudiantActionPerformed(evt);
            }
        });

        SupprimerEtudiant.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        SupprimerEtudiant.setForeground(new java.awt.Color(153, 0, 153));
        SupprimerEtudiant.setText("SUPPRIMER");
        SupprimerEtudiant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupprimerEtudiantActionPerformed(evt);
            }
        });

        modifierEtudiant.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        modifierEtudiant.setForeground(new java.awt.Color(204, 0, 153));
        modifierEtudiant.setText("MODIFIER");
        modifierEtudiant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierEtudiantActionPerformed(evt);
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
                    .addComponent(SupprimerEtudiant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AjouterEtudiant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modifierEtudiant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(retourMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AjouterEtudiant, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modifierEtudiant, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SupprimerEtudiant, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(retourMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation/img/9023992_student_fill_icon.png"))); // NOI18N
        jLabel1.setText("             AJOUTER UN ETUDIANT");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NOM");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("PRENOM");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CNE");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("EMAIL");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NIVEAU");

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("FILIERE");

        NomEtudiant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomEtudiantActionPerformed(evt);
            }
        });

        cneEtudiant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cneEtudiantActionPerformed(evt);
            }
        });

        PrenomEtudiant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrenomEtudiantActionPerformed(evt);
            }
        });

        emailEtudiant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailEtudiantActionPerformed(evt);
            }
        });

        FiliereEtudiant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiliereEtudiantActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Laboratoire ");

        nomLabo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomLaboActionPerformed(evt);
            }
        });

        NiveauEtudiant.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doctorant", "3eme année", "2éme année", " " }));
        NiveauEtudiant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NiveauEtudiantActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(cneEtudiant, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(PrenomEtudiant, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(NomEtudiant, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nomLabo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(62, 62, 62)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(FiliereEtudiant))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(NiveauEtudiant, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(emailEtudiant, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(41, 41, 41)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NomEtudiant, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PrenomEtudiant, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cneEtudiant, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nomLabo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailEtudiant, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NiveauEtudiant, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(FiliereEtudiant, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))))
                        .addGap(13, 13, 13)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        setSize(new java.awt.Dimension(896, 393));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Table(JTable tableEtudiant) {
        tableEtudiant.setBackground(new java.awt.Color(204, 204, 204));
        tableEtudiant.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        tableEtudiant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CNE", "NOM", "PRENOM", "EMAIL", "NIVEAU", "FILIERE"
            }
        ));
        tableEtudiant.setRowMargin(1);
        jScrollPane1.setViewportView(tableEtudiant);

    }


    private void NomEtudiantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomEtudiantActionPerformed

    }//GEN-LAST:event_NomEtudiantActionPerformed

    private void cneEtudiantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cneEtudiantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cneEtudiantActionPerformed

    private void PrenomEtudiantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrenomEtudiantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrenomEtudiantActionPerformed

    private void emailEtudiantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailEtudiantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailEtudiantActionPerformed

    private void FiliereEtudiantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiliereEtudiantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FiliereEtudiantActionPerformed

    private void modifierEtudiantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierEtudiantActionPerformed

        controlleuretudiant.afficherPageModif();
    }//GEN-LAST:event_modifierEtudiantActionPerformed

    private void retourMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retourMenuActionPerformed
        this.dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_retourMenuActionPerformed

    private void AjouterEtudiantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjouterEtudiantActionPerformed
     // Récupérer les données saisies par l'utilisateur
    etd.setNom_etudiant(NomEtudiant.getText());
    etd.setPrenom_etudiant(PrenomEtudiant.getText());
    etd.setEmail(emailEtudiant.getText());
    etd.setCNE(cneEtudiant.getText());
    etd.setNiveau(NiveauEtudiant.getSelectedItem().toString());
    etd.setFiliere(FiliereEtudiant.getText()); 

    // Vérifier si le niveau est "Doctorant" et si le nom du laboratoire a été saisi
    if (NiveauEtudiant.getSelectedItem().toString().equals("Doctorant")) {
        // Vérifier si le nom du laboratoire a été saisi
        if (nomLabo.getText().isEmpty()) {
            // Afficher un message d'erreur si le nom du laboratoire n'a pas été saisi
            JOptionPane.showMessageDialog(this, "Le nom du laboratoire doit être saisi pour un étudiant de niveau doctorant.", "Erreur", JOptionPane.ERROR_MESSAGE);
        } else {
            // Récupérer le nom du laboratoire choisi
            String nomLabor = nomLabo.getText();

            // Créer un objet Etudiant
            etdGestionnaire.inseretEtudiant(etd.getCNE(), etd.getNom_etudiant(), etd.getPrenom_etudiant(), etd.getEmail(), etd.getNiveau(), etd.getFiliere());

            // Récupérer l'ID de l'étudiant nouvellement inséré
            int etudiantId = etdGestionnaire.getEtudiantIdByCNE(cneEtudiant.getText());
            // Récupérer l'ID du laboratoire choisi
            int labId = laboG.getIDByNom(nomLabor);

            // Insérer le nouveau membre dans la table Membre_Laboratoire_doctorants
            laboG.ajouterMembreLaboDoctorant(etudiantId, labId);

            // Actualiser la liste des étudiants affichée dans la fenêtre principale
            Actualiser();
             Table(tableEtudiant);
        TableProduit();
                 
        }
    } else {
        // Si le niveau n'est pas "Doctorant", ajouter l'étudiant sans le nom du laboratoire
        etdGestionnaire.inseretEtudiant(etd.getCNE(), etd.getNom_etudiant(), etd.getPrenom_etudiant(), etd.getEmail(), etd.getNiveau(), etd.getFiliere());

        // Actualiser la liste des étudiants affichée dans la fenêtre principale
        Actualiser();
        Table(tableEtudiant);
        TableProduit();
    }


        
       /* Actualiser();
        
        Table(tableEtudiant);
        TableProduit();*/
         
    }//GEN-LAST:event_AjouterEtudiantActionPerformed

    private void SupprimerEtudiantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupprimerEtudiantActionPerformed
        // TODO add your handling code here:
        controlleuretudiant.afficherPageSupp();
       
        
        
    }//GEN-LAST:event_SupprimerEtudiantActionPerformed

    private void nomLaboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomLaboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomLaboActionPerformed

    private void NiveauEtudiantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NiveauEtudiantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NiveauEtudiantActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AjouterEtudiant;
    private javax.swing.JTextField FiliereEtudiant;
    private javax.swing.JComboBox<String> NiveauEtudiant;
    private javax.swing.JTextField NomEtudiant;
    private javax.swing.JTextField PrenomEtudiant;
    private javax.swing.JButton SupprimerEtudiant;
    private javax.swing.JTextField cneEtudiant;
    private javax.swing.JTextField emailEtudiant;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifierEtudiant;
    private javax.swing.JTextField nomLabo;
    private javax.swing.JButton retourMenu;
    private javax.swing.JTable tableEtudiant;
    // End of variables declaration//GEN-END:variables
    private ControlleurEtudiant controlleuretudiant;
   private void Actualiser() {
        NomEtudiant.setText(null);
        PrenomEtudiant.setText(null);
        cneEtudiant.setText(null);
  
        FiliereEtudiant.setText(null);
        emailEtudiant.setText(null);
        tableEtudiant.setModel(new DefaultTableModel());   
    }

    private void TableProduit() {
        ArrayList<Etudiant> lis =etdGestionnaire.getAll();
        model =(DefaultTableModel)tableEtudiant.getModel();
        Object[] ob = new Object[6];
        for (int i = 0 ; i<lis.size() ; i++){
            ob[0] = lis.get(i).getCNE();
            ob[1] = lis.get(i).getNom_etudiant();
            ob[2] = lis.get(i).getPrenom_etudiant();
            ob[3] = lis.get(i).getEmail();
            ob[4] = lis.get(i).getNiveau();
            ob[5] = lis.get(i).getFiliere();
            model.addRow(ob);
            
            
        }
    }
}
