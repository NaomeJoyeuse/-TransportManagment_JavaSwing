/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import DAO.CompanyDAO;
import MODEL.company;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Naome
 */
public class Company extends javax.swing.JInternalFrame {

   DefaultTableModel tableModel = new DefaultTableModel();
    public Company() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        addTableColumn();
        populateTable();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameBOX = new javax.swing.JTextField();
        ownerBOX = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        companyTable = new javax.swing.JTable();
        registerBTN = new javax.swing.JButton();
        viewBTN = new javax.swing.JButton();
        removeBTN = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        idBOX = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(660, 340));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(470, 340));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("COMPANY REGISTRATION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel1.setText("Company Name");

        jLabel3.setText("Owner");

        companyTable.setModel(new javax.swing.table.DefaultTableModel(
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
        companyTable.setPreferredSize(new java.awt.Dimension(250, 64));
        companyTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                companyTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(companyTable);

        registerBTN.setText("REGISTER");
        registerBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBTNActionPerformed(evt);
            }
        });

        viewBTN.setText("VIEW");
        viewBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBTNActionPerformed(evt);
            }
        });

        removeBTN.setText("REMOVE");
        removeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBTNActionPerformed(evt);
            }
        });

        jLabel4.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(registerBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ownerBOX)
                        .addComponent(nameBOX)
                        .addComponent(jLabel1)
                        .addComponent(idBOX, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(idBOX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nameBOX, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(removeBTN)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ownerBOX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerBTN)
                    .addComponent(viewBTN))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(437, 437, 437))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void addTableColumn(){
        tableModel.addColumn("comp_id");
        tableModel.addColumn("company_name");
        tableModel.addColumn("owner");
        companyTable.setModel(tableModel);
     }
     public void populateTable(){
      tableModel.setRowCount(0);
         CompanyDAO compDAO=new CompanyDAO();
        List<company> companies = compDAO.displayCompany();
        for(company camp:companies){
          tableModel.addRow(new Object[]{
                camp.getComp_id(),
                camp.getCompany_name(),
                camp.getOwner()
            });
        }
     
     }
    
    private void registerBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBTNActionPerformed
          
 if(nameBOX.getText().trim().isEmpty() 
          || ownerBOX.getText().trim().isEmpty())
       {
           JOptionPane.showMessageDialog(this, "all Field are required");
       }else if (nameBOX.getText().length() > 50) {
    JOptionPane.showMessageDialog(this, "Name is too long. It should be 50 characters or less.");
       
       }else{
           
     company camp=new company();
    camp.setCompany_name(nameBOX.getText());
    camp.setOwner(ownerBOX.getText());
    CompanyDAO compDAO=new CompanyDAO();
    String message= compDAO.registerCompany(camp);
    JOptionPane.showMessageDialog(this, message);
     if (message.equals("successful data saved")) {
            JOptionPane.showMessageDialog(this, "Registration successful.");
        } else {
            JOptionPane.showMessageDialog(this, "Registration failed. Please try again.");
        }
       }
 
    }//GEN-LAST:event_registerBTNActionPerformed

    private void viewBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBTNActionPerformed
        populateTable();
    }//GEN-LAST:event_viewBTNActionPerformed

    private void companyTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_companyTableMouseClicked
      int row=companyTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(this, "select record from this table to delete or to update");
        }else {  
            String comp_id = companyTable.getValueAt(row, 0).toString();
        String company_name = companyTable.getValueAt(row, 1).toString();
        String owner = companyTable.getValueAt(row, 2).toString();
        idBOX.setText(comp_id);
        nameBOX.setText(company_name);
        ownerBOX.setText(owner);
        }
    }//GEN-LAST:event_companyTableMouseClicked

    private void removeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBTNActionPerformed
         if(idBOX.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Student Id is mandatory");}
         
         else{
             company camp=new company();
              camp.setComp_id(Integer.parseInt(idBOX.getText()));
              
    int confirmation = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this company?", "Confirmation", JOptionPane.YES_NO_OPTION);
    if (confirmation == JOptionPane.YES_OPTION) {
        CompanyDAO compDAO = new CompanyDAO();
        String message = compDAO.removeCompany(camp);
        JOptionPane.showMessageDialog(this, message);
        
        }
         }
    
    }//GEN-LAST:event_removeBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable companyTable;
    private javax.swing.JTextField idBOX;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameBOX;
    private javax.swing.JTextField ownerBOX;
    private javax.swing.JButton registerBTN;
    private javax.swing.JButton removeBTN;
    private javax.swing.JButton viewBTN;
    // End of variables declaration//GEN-END:variables
}
