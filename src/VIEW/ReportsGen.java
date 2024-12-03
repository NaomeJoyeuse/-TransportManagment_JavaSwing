/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import DAO.Assignment;
import MODEL.AssignmentModel;
import MODEL.Bus;
import MODEL.Route;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;




/**
 *
 * @author Naome
 */
public class ReportsGen extends javax.swing.JInternalFrame {

    /**
     * Creates new form Reports
     */
    DefaultTableModel tableModel = new DefaultTableModel();
    public ReportsGen() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
           ui.setNorthPane(null);
           addTableColumn();
         populateTable();
        
    }
 private void addTableColumn(){
       tableModel.addColumn("Plate Number");
        tableModel.addColumn("Bus Name");
        tableModel.addColumn("Driver");
        tableModel.addColumn("Bus Company");
        tableModel.addColumn("Route ID");
        tableModel.addColumn("Route Name");
        tableModel.addColumn("Starting Point");
        tableModel.addColumn("Ending Point");
      tableModel.addColumn("Passengers");
       
         infoTABLE.setModel(tableModel);
     }
 private void populateTable() {
    // Call the function from DAO to retrieve the data
    Assignment assignmentDAO = new Assignment();
    List<AssignmentModel> assignedBuses = assignmentDAO.displayAllAssignedBuses();

    DefaultTableModel tableModel = (DefaultTableModel) infoTABLE.getModel();
    tableModel.setRowCount(0);

    if (assignedBuses != null) {
        for (AssignmentModel assignment : assignedBuses) {
            Bus bus = assignment.getBus();
            Route route = assignment.getRoute();

            tableModel.addRow(new Object[] {
               bus.getPlate_nbr(),
            bus.getBus_name(),
            bus.getDriver(),
            bus.getBus_company(),
            route.getRoute_id(),
            route.getRoute_name(),
            route.getStarting_point(),
            route.getEnding_point(),
            assignment.getPassengers()
            });
        }
    }
 }


//
//private void populateTable(List<AssignmentModel> assignedBuses) {
//    DefaultTableModel tableModel = (DefaultTableModel) infoTABLE.getModel();
//    tableModel.setRowCount(0);
//
//    for (AssignmentModel assignment : assignedBuses) {
//        Bus bus = assignment.getBus();
//        Route route = assignment.getRoute();
//
//        tableModel.addRow(new Object[] {
//            bus.getPlate_nbr(),
//            bus.getBus_name(),
//            bus.getDriver(),
//            bus.getBus_company(),
//            route.getRoute_id(),
//            route.getRoute_name(),
//            route.getStarting_point(),
//            route.getEnding_point(),
//            assignment.getPassengers()
//        });
//    }
//}

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoTABLE = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        ViewBTN = new javax.swing.JButton();
        pdfBTN = new javax.swing.JButton();
        pdfCompany = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        infoTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(infoTABLE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("REPORT GENERATION");

        ViewBTN.setText("VIEW");
        ViewBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBTNActionPerformed(evt);
            }
        });

        pdfBTN.setText("PDF FILE");
        pdfBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdfBTNActionPerformed(evt);
            }
        });

        pdfCompany.setText("company report");
        pdfCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdfCompanyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pdfCompany, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                        .addGap(83, 83, 83)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pdfBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(ViewBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(ViewBTN))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pdfBTN)
                    .addComponent(pdfCompany))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBTNActionPerformed
      populateTable();
    }//GEN-LAST:event_ViewBTNActionPerformed

    private void pdfBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfBTNActionPerformed

    String reportsDirectory ="C:\\Users\\Naome\\Desktop\\Reports";

    String path = "";
        JFileChooser j = new JFileChooser(reportsDirectory);
    j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    j.setFileHidingEnabled(false);
   // JFileChooser j = new JFileChooser();
   // j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    int x = j.showSaveDialog(this);
    if (x == JFileChooser.APPROVE_OPTION) {
        // Get the selected directory
        File selectedDirectory = j.getSelectedFile();
        
        // Ensure the "Reports" directory exists, and create it if it doesn't
        File reportsDir = new File(selectedDirectory, "Reports");
        if (!reportsDir.exists()) {
            reportsDir.mkdirs();
        }
        
        // Prompt the user for the PDF file name
        String pdfFileName = JOptionPane.showInputDialog(this, "Enter PDF file name (without extension):");

        if (pdfFileName != null && !pdfFileName.isEmpty()) {
            // Create the full path for the PDF file in the "Reports" directory
            path = reportsDir.getPath() + File.separator + pdfFileName + ".pdf";
            Document doc = new Document();
            try {
                PdfWriter.getInstance(doc, new FileOutputStream(path));
                doc.open();

                // Header
                Paragraph header = new Paragraph("Bus Information", new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD));
                doc.add(header);

                // Data
                Paragraph data = new Paragraph();
                for (int i = 0; i < infoTABLE.getRowCount(); i++) {
                    String rowText = "Plate Number: " + infoTABLE.getValueAt(i, 0) + "\n"
                            + "Bus Name: " + infoTABLE.getValueAt(i, 1) + "\n"
                            + "Driver: " + infoTABLE.getValueAt(i, 2) + "\n"
                            + "Bus Company: " + infoTABLE.getValueAt(i, 3) + "\n"
                            + "Route ID: " + infoTABLE.getValueAt(i, 4) + "\n"
                            + "Route Name: " + infoTABLE.getValueAt(i, 5) + "\n"
                            + "Starting Point: " + infoTABLE.getValueAt(i, 6) + "\n"
                            + "Ending Point: " + infoTABLE.getValueAt(i, 7) + "\n"
                            + "Passengers: " + infoTABLE.getValueAt(i, 8) + "\n\n";
                    data.add(new Paragraph(rowText, new Font(Font.FontFamily.HELVETICA, 12)));
                }
                doc.add(data);

                doc.close();
                JOptionPane.showMessageDialog(this, "PDF file saved successfully.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error while saving PDF: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    
}

        
    }//GEN-LAST:event_pdfBTNActionPerformed

    private void pdfCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfCompanyActionPerformed
        // TODO add your handling code here:
        String selectedCompany = JOptionPane.showInputDialog(this, "Enter the name of the company:");

    String reportsDirectory = "C:\\Users\\Naome\\Desktop\\Reports";



if (selectedCompany != null && !selectedCompany.isEmpty()) {
    // Prompt the user for the PDF file name
    String pdfFileName = JOptionPane.showInputDialog(this, "Enter PDF file name (without extension):");

    if (pdfFileName != null && !pdfFileName.isEmpty()) {
        String path = reportsDirectory + "\\" + pdfFileName + ".pdf";
        Document doc = new Document();
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path));
            doc.open();

            // here, create the header of the PDF
            Paragraph header = new Paragraph(selectedCompany + " Information", new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD));
            doc.add(header);

            Paragraph data = new Paragraph();

            int count = 0; 
            for (int i = 0; i < infoTABLE.getRowCount(); i++) {
                if (selectedCompany.equals(infoTABLE.getValueAt(i, 3))) { 
                    String rowText = "Plate Number: " + infoTABLE.getValueAt(i, 0) + "\n"
                            + "Bus Name: " + infoTABLE.getValueAt(i, 1) + "\n"
                            + "Driver: " + infoTABLE.getValueAt(i, 2) + "\n"
                            + "Bus Company: " + infoTABLE.getValueAt(i, 3) + "\n"
                            + "Route ID: " + infoTABLE.getValueAt(i, 4) + "\n"
                            + "Route Name: " + infoTABLE.getValueAt(i, 5) + "\n"
                            + "Starting Point: " + infoTABLE.getValueAt(i, 6) + "\n"
                            + "Ending Point: " + infoTABLE.getValueAt(i, 7) + "\n"
                            + "Passengers: " + infoTABLE.getValueAt(i, 8) + "\n\n";
                    data.add(new Paragraph(rowText, new Font(Font.FontFamily.HELVETICA, 12)));
                    count++;
                }
            }

            if (count > 0) {
                data.add(new Paragraph("Total " + count + " buses from " + selectedCompany, new Font(Font.FontFamily.HELVETICA, 12)));
                doc.add(data);
                doc.close();
                JOptionPane.showMessageDialog(this, "PDF file saved successfully.");
            } else {
                doc.close();
                JOptionPane.showMessageDialog(this, "No data found for the selected company.", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error while saving PDF: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }
    }//GEN-LAST:event_pdfCompanyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ViewBTN;
    private javax.swing.JTable infoTABLE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pdfBTN;
    private javax.swing.JButton pdfCompany;
    // End of variables declaration//GEN-END:variables
}
