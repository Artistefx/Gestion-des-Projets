
package presentation.BackOffice.Vues;

import Metier.MetierGestion.GestionnaireDepartement;
import Metier.MetierPOJO.Departement;
import Metier.MetierPOJO.Etudiant;
import presentation.BackOffice.Controlleur.ControlleurDepartement;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class getAllDepartement extends javax.swing.JFrame {
        GestionnaireDepartement etdG = new GestionnaireDepartement();
        Departement etd = new Departement();
        DefaultTableModel model ;
        ControlleurDepartement controlleurdepartement ;

    public getAllDepartement(ControlleurDepartement c) {

        initComponents();
        TableProduit();
        this.controlleurdepartement = c;     }
    public void Table( JTable tableDepartement){
        tableDepartement.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tableDepartement.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id ", "Nom departement", "Chef departement" 
            }
        ));
        jScrollPane1.setViewportView(tableDepartement);}

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDepartement = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        nomDepartement = new javax.swing.JTextField();
        entrer = new javax.swing.JButton();
        retourMenu = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation/img/9023992_student_fill_icon.png"))); // NOI18N
        jLabel1.setText("LISTE DEPARTEMENT");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" DEPARTEMENTS :");

        tableDepartement.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nom departement"
            }
        ));
        jScrollPane1.setViewportView(tableDepartement);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ENTRER LE NOM DE DEPARTEMENT ");

        nomDepartement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomDepartementActionPerformed(evt);
            }
        });

        entrer.setBackground(new java.awt.Color(255, 102, 102));
        entrer.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        entrer.setText("ENTRER ");
        entrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrerActionPerformed(evt);
            }
        });

        retourMenu.setBackground(new java.awt.Color(255, 102, 102));
        retourMenu.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        retourMenu.setForeground(new java.awt.Color(51, 0, 51));
        retourMenu.setText("EXIT");
        retourMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retourMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nomDepartement, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(entrer)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(retourMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nomDepartement, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(entrer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(retourMenu)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(772, 444));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomDepartementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomDepartementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomDepartementActionPerformed

    private void retourMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retourMenuActionPerformed
        this.dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_retourMenuActionPerformed

    private void entrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrerActionPerformed
       String nom_Departement = nomDepartement.getText();

    // Utiliser le nom du département récupéré pour récupérer la liste des professeurs
    Departement departement = etdG.getDepartement(nom_Departement); // À remplacer par votre propre méthode de récupération de données

    if (departement != null) {
        // Créer un modèle de tableau pour la liste des professeurs récupérée
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nom_departement");
        model.addColumn("Chef_departement");
        model.addRow(new Object[]{departement.getId_departement(), departement.getNom_departement(), departement.getChef_département()});

        // Définir le modèle de tableau de la JTable pour afficher la liste des professeurs
        tableDepartement.setModel(model);

        Actualiser();
    } else {
        // Gérer le cas où le département n'a pas été trouvé
        JOptionPane.showMessageDialog(null, "Le département " + nom_Departement + " n'existe pas.");
    }
                                               
    }//GEN-LAST:event_entrerActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton entrer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomDepartement;
    private javax.swing.JButton retourMenu;
    private javax.swing.JTable tableDepartement;
    // End of variables declaration//GEN-END:variables

private void TableProduit() {
    ArrayList<Departement> lis = etdG.getAllDepartement();
    DefaultTableModel model = new DefaultTableModel(); // réinitialiser le modèle de la table
    model.addColumn("ID");
    model.addColumn("Nom");
    model.addColumn("Chef de département");
    for (int i = 0 ; i<lis.size() ; i++){
        Object[] ob = new Object[3];
        ob[0] = lis.get(i).getId_departement();
        ob[1] = lis.get(i).getNom_departement();
        ob[2] = lis.get(i).getChef_département();
        model.addRow(ob);
    }
    tableDepartement.setModel(model); // définir le nouveau modèle de la table
}


      private void Actualiser() {
        nomDepartement.setText(null);
        
     }
}
