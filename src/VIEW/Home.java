/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/**
 *
 * @author Naome
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        loadingbar = new javax.swing.JProgressBar();
        loadinglabel = new javax.swing.JLabel();
        titlelabel = new javax.swing.JLabel();
        loadingvalue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(600, 500));

        backgroundPanel.setBackground(new java.awt.Color(0, 102, 102));
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/todoall.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        backgroundPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 500, 100));
        backgroundPanel.add(loadingbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 470, -1));

        loadinglabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        loadinglabel.setText("loading...");
        backgroundPanel.add(loadinglabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 270, -1));

        titlelabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        titlelabel.setText("KIMIRONKO BUS STATION");
        backgroundPanel.add(titlelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 480, -1));

        loadingvalue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loadingvalue.setText("0%");
        backgroundPanel.add(loadingvalue, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 40, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                Home hp=new Home();
//                hp.setVisible(true);
//                //new Home().setVisible(true);
//                
//                
//                try{
//                    for(int i=0;i<=100;i++){
//                    Thread.sleep(100);
//                    hp.loadingvalue.setText(i+"%");
//                    if(i==10){
//                    hp.loadinglabel.setText("loading data...");
//                    }
//                      if(i==20){
//                    hp.loadinglabel.setText("turning on modules...");
//                      }  if(i==50){
//                    hp.loadinglabel.setText("turning database...");
//                      } if(i==70){
//                    hp.loadinglabel.setText("connection sucessful...");
//                      } if(i==80){
//                    hp.loadinglabel.setText("launching the application...");
//                      }
//                      hp.loadingbar.setValue(i);
//                    }
//                }catch(Exception e) {
//                 JOptionPane.showMessageDialog(null,e);
//                }
//            }
       
                Home hp = new Home();
                hp.setVisible(true);

                SwingWorker<Void, Integer> worker = new SwingWorker<Void, Integer>() {
                    @Override
                    protected Void doInBackground() throws Exception {
                        for (int i = 0; i <= 100; i++) {
                            Thread.sleep(100); // Simulate work

                            publish(i); // Send progress updates to process()
                        }
                        return null;
                    }
 @Override
                    protected void process(List<Integer> chunks) {
                        int progress = chunks.get(chunks.size() - 1); // Get the latest progress value
                        hp.loadingvalue.setText(progress + "%");

                        if (progress == 10) {
                            hp.loadinglabel.setText("Loading data...");
                        } else if (progress == 20) {
                            hp.loadinglabel.setText("Turning on modules...");
                        } else if (progress == 50) {
                            hp.loadinglabel.setText("Turning on database...");
                        } else if (progress == 70) {
                            hp.loadinglabel.setText("Connection successful...");
                        } else if (progress == 80) {
                            hp.loadinglabel.setText("Launching the application...");
                        }

                        hp.loadingbar.setValue(progress);
                    }
                     protected void done() {
                        // Loading is complete, open the register form
                        register registerForm = new register();
                        registerForm.setVisible(true);
                    
                    }
                };

                worker.execute(); // Start the SwingWorker
            }
            });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar loadingbar;
    private javax.swing.JLabel loadinglabel;
    private javax.swing.JLabel loadingvalue;
    private javax.swing.JLabel titlelabel;
    // End of variables declaration//GEN-END:variables
}
