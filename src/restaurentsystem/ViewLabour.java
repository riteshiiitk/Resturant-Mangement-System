/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurentsystem;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Ritesh
 */
public class ViewLabour extends javax.swing.JFrame {
     private vLabour v ;
    /**
     * Creates new form ViewLabour
     */
    public ViewLabour() {
        initComponents();
        performFileRelatedTask();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        read = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 204));

        read.setText("View Labour");
        read.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readActionPerformed(evt);
            }
        });

        text.setEditable(false);
        text.setColumns(20);
        text.setRows(5);
        jScrollPane1.setViewportView(text);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("iD");

        jLabel2.setText("Name");

        jLabel3.setText("Salary");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(read)
                        .addGap(31, 31, 31)
                        .addComponent(backButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel1)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel2)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(read)
                    .addComponent(backButton))
                .addGap(50, 50, 50))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     private void performFileRelatedTask()
    {
        v = new vLabour();
    }
    private void readActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readActionPerformed
        // TODO add your handling code here:
       
            text.setText(v.getFullNames().toString());
        

    }//GEN-LAST:event_readActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        LabourManagement lm = new LabourManagement();
        lm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ViewLabour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewLabour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewLabour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewLabour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewLabour().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton read;
    private javax.swing.JTextArea text;
    // End of variables declaration//GEN-END:variables
}
class vLabour {

    private Scanner scan;
    private String name;
    private String price;
    private String quantity;
    private StringBuilder fullnames;

    public vLabour()
    {
        fullnames = new StringBuilder();
        openFile();
        readFile();
        closeFile();
    }

    public StringBuilder getFullNames()
    {
        return fullnames;
    }

    private void openFile()
    {
        try
        {
            scan = new Scanner(new File("labour.txt"));
            System.out.println("File found!");
        }

        catch(Exception e)
        {
            System.out.println("File not found");
        }
    }

    private void readFile()
    {
        try{
        while(scan.hasNextLine())
        {
            name = scan.nextLine();
            price = scan.nextLine();
            quantity=scan.nextLine();
            fullnames.append(name + " \t" + price + " \t"+quantity+"\n");
        }
        
    }
        catch(Exception e){
            System.out.println(e);
        }
    }

    private void closeFile()
    {
        scan.close();
    }
}

