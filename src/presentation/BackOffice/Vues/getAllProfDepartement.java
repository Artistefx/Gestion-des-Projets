
package presentation.BackOffice.Vues;

import Metier.MetierGestion.GestionnaireDepartement;
import Metier.MetierGestion.GestionnaireProfesseur;
import Metier.MetierPOJO.Departement;
import Metier.MetierPOJO.Etudiant;
import Metier.MetierPOJO.Professeur;
import presentation.BackOffice.Controlleur.ControlleurDepartement;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class getAllProfDepartement extends javax.swing.JFrame {
    GestionnaireDepartement etdG = new GestionnaireDepartement();
        Departement etd = new Departement();
        GestionnaireProfesseur pr = new GestionnaireProfesseur();
        DefaultTableModel model ;



    public getAllProfDepartement(ControlleurDepartement c) {

        initComponents();
        TableProduit();
        this.controlleurdepartement = c;        }
    
         public void Table( JTable tableDepartement){
        tableDepartement.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tableDepartement.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOM ", "PRENOM", "GRADE" 
            }
        ));
        jScrollPane1.setViewportView(tableDepartement);}

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableProfesseur = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        NomDepartement = new javax.swing.JTextField();
        EntrerDepartement = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation/img/clipboard.png"))); // NOI18N
        jLabel1.setText(" LISTE PROFESSEUR / DEPARTEMENT");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LISTE PROFESSEUR");

        TableProfesseur.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOM", "PRENOM", "GRADE"
            }
        ));
        jScrollPane1.setViewportView(TableProfesseur);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ENTRER LE NOM DE LA DEPARTEMENT");

        NomDepartement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomDepartementActionPerformed(evt);
            }
        });

        EntrerDepartement.setBackground(new java.awt.Color(255, 102, 102));
        EntrerDepartement.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        EntrerDepartement.setText("ENTRER");
        EntrerDepartement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrerDepartementActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 102, 102));
        exit.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(EntrerDepartement, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomDepartement, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NomDepartement, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EntrerDepartement, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 841, 497);
    }// </editor-fold>//GEN-END:initComponents

    private void NomDepartementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomDepartementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomDepartementActionPerformed

    private void EntrerDepartementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrerDepartementActionPerformed
        String NOM_Departement = NomDepartement.getText();

        // Utiliser le nom du département récupéré pour récupérer la liste des professeurs
        ArrayList<Professeur> prof = etdG.getAllProfesseur(NOM_Departement);// À remplacer par votre propre méthode de récupération de données

        // Créer un modèle de tableau pour la liste des professeurs récupérée
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NOM");
        model.addColumn("PRENOM");
        model.addColumn("GRADE");
        for (Professeur etd : prof) {
            model.addRow(new Object[]{etd.getNom() , etd.getPrenom() , etd.getgrade()});
        }

        // Définir le modèle de tableau de la JTable pour afficher la liste des professeurs
        TableProfesseur.setModel(model);
        /*        etd.setNom_departement(nomDepartement.getText());
        etdG.getAllProfesseur(etd.getNom_departement());*/
        Actualiser();
        /*Table(TableProfesseur);
        TableProduit();*/
    }//GEN-LAST:event_EntrerDepartementActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EntrerDepartement;
    private javax.swing.JTextField NomDepartement;
    private javax.swing.JTable TableProfesseur;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private ControlleurDepartement controlleurdepartement;

     private void TableProduit() {
    ArrayList<Professeur> lis =pr.getAllProfesseur();
        model =(DefaultTableModel)TableProfesseur.getModel();
        Object[] ob = new Object[6];
        for (int i = 0 ; i<lis.size() ; i++){
            ob[0] = lis.get(i).getNom();
            ob[1] = lis.get(i).getPrenom();
            ob[2] = lis.get(i).getgrade();
           // ob[3] = lis.get(i).getgrade();

            model.addRow(ob);    }
    }


    private void Actualiser() {
        NomDepartement.setText(null);
        
     }
     }