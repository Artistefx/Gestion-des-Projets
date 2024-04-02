
package presentation.BackOffice.Vues;

import Metier.MetierGestion.GestionnaireEtudiant;
import Metier.MetierGestion.GestionnaireFiliere;
import Metier.MetierPOJO.Etudiant;
import Metier.MetierPOJO.Filiere;
import presentation.BackOffice.Controlleur.ControlleurFiliere;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GetAllEtd extends javax.swing.JFrame {
    GestionnaireFiliere etdG = new GestionnaireFiliere();
        Filiere etd = new Filiere();
        GestionnaireEtudiant pr = new GestionnaireEtudiant();
        DefaultTableModel model ;
    

   
    public GetAllEtd(ControlleurFiliere c) {
      
        initComponents();
        TableProduit();
        this.controlleurfiliere = c; 
    }

       public void Table( JTable tableDepartement){
        tableDepartement.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tableDepartement.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CNE ", "NOM", "PRENOM" 
            }
        ));
        jScrollPane1.setViewportView(tableDepartement);}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableEtudiant = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NomFiliere = new javax.swing.JTextField();
        EntrerDepartement = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation/img/clipboard.png"))); // NOI18N
        jLabel1.setText("      LISTE ETUDIANT / FILIERE");

        TableEtudiant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CNE", "NOM", "PRENOM"
            }
        ));
        jScrollPane1.setViewportView(TableEtudiant);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LISTE ETUDIANT");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ENTRER LE NOM DE LA FILIERE");

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(EntrerDepartement, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106)
                                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(NomFiliere, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NomFiliere, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EntrerDepartement, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(10, Short.MAX_VALUE))
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

        setSize(new java.awt.Dimension(847, 462));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EntrerDepartementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrerDepartementActionPerformed
        String NOM_FILIERE = NomFiliere.getText();

        // Utiliser le nom du département récupéré pour récupérer la liste des professeurs
        ArrayList<Etudiant> etudiant = etdG.getAllEtudiant(NOM_FILIERE); // À remplacer par votre propre méthode de récupération de données

        // Créer un modèle de tableau pour la liste des professeurs récupérée
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("CNE");
        model.addColumn("NOM");
        model.addColumn("PRENOM");
        for (Etudiant etd : etudiant) {
            model.addRow(new Object[]{etd.getCNE(), etd.getNom_etudiant() , etd.getPrenom_etudiant()});
        }

        // Définir le modèle de tableau de la JTable pour afficher la liste des professeurs
        TableEtudiant.setModel(model);
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
    private javax.swing.JTextField NomFiliere;
    private javax.swing.JTable TableEtudiant;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private ControlleurFiliere controlleurfiliere ;
    private void TableProduit() {
    ArrayList<Etudiant> lis =pr.getAll();
        model =(DefaultTableModel)TableEtudiant.getModel();
        Object[] ob = new Object[6];
        for (int i = 0 ; i<lis.size() ; i++){
            ob[0] = lis.get(i).getCNE();
            ob[1] = lis.get(i).getNom_etudiant();
            ob[2] = lis.get(i).getPrenom_etudiant();
           // ob[3] = lis.get(i).getgrade();

            model.addRow(ob);    }
    }


    private void Actualiser() {
        NomFiliere.setText(null);
        
     }
}
