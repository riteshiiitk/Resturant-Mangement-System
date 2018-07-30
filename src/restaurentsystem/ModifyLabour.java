/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package restaurentsystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Ritesh
 */
public class ModifyLabour extends javax.swing.JFrame {
    private MdfLabour m;
    private String srcName;
    private String modName;
    private String modPrice;
    private String ModQuantity;
    
    /**
     * Creates new form ModifyLabour
     */
    public ModifyLabour() {
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

        mPrice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        mQuantity = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        modText = new javax.swing.JTextField();
        view = new javax.swing.JButton();
        modifyButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        mName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 255));

        jLabel3.setText("Enter New Name");

        text.setEditable(false);
        text.setColumns(20);
        text.setRows(5);
        jScrollPane1.setViewportView(text);

        jLabel4.setText("Enter New Salary");

        jLabel1.setText("Which labour id want to modify");

        view.setText("View");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });

        modifyButton.setText("Modify");
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter New ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(view)
                                .addGap(96, 96, 96)
                                .addComponent(modifyButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(backButton))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(40, 40, 40)
                                    .addComponent(mName, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(28, 28, 28)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(modText)
                                        .addComponent(mPrice)
                                        .addComponent(mQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(modText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(mQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(view)
                    .addComponent(modifyButton)
                    .addComponent(backButton))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void performFileRelatedTask()
    {
        m = new MdfLabour();
    }
    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:
        m = new MdfLabour();
                
            text.setText(m.getFullNames().toString());
        
    }//GEN-LAST:event_viewActionPerformed

    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
        // TODO add your handling code here:
        
        srcName=modText.getText();
        m.setSrchName(srcName);
        modName= mName.getText();
        m.setName(modName);
        modPrice =mPrice.getText();
        m.setPrice(modPrice);
        ModQuantity=mQuantity.getText();
        m.setQuantity(ModQuantity);
        m.ModifyItem();
        modText.setText("");
        mName.setText("");
        mPrice.setText("");
        mQuantity.setText("");
         JOptionPane.showMessageDialog(this, "Item has been Modified");
    }//GEN-LAST:event_modifyButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ModifyLabour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyLabour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyLabour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyLabour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyLabour().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mName;
    private javax.swing.JTextField mPrice;
    private javax.swing.JTextField mQuantity;
    private javax.swing.JTextField modText;
    private javax.swing.JButton modifyButton;
    private javax.swing.JTextArea text;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
class MdfLabour {
    
    private Scanner scan;
    private String srchName;
    
    
    
    private String name;
    
    
    private String price;
    private String quantity;
    private StringBuilder fullnames;
    private String itemName [];
    
    public MdfLabour()
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
    
    public void setSrchName(String srchName) {
        this.srchName = srchName;
    }
    public String getSrchName() {
        return srchName;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    
    public String getPrice() {
        return price;
    }
    
    public String getQuantity() {
        return quantity;
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
    
    public  void ModifyItem(){
        
        String srcKey = getSrchName();
        
        System.out.println(srcKey+"will be modified");
        
        
        int c=0,track, cnt=0,temp=0;
        
        try{
            Scanner sc = new Scanner(new FileInputStream("labour.txt"));
            while(sc.hasNextLine()){
                cnt++;
                sc.nextLine();
                
            }
            itemName= new String[cnt];
            sc.close();
            sc = new Scanner(new FileInputStream("labour.txt"));
            while(sc.hasNextLine()){
                itemName[c]=sc.nextLine();
                if(itemName[c].equalsIgnoreCase(srcKey)){
                    temp=c;
                    System.out.println("Index will be deleted" +c);
                }
                c++;
                
            }
            
            
        }
        catch(Exception e){
            System.out.println(e);
            
        }
        
        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream("labour.txt"));
            for (int i = 0; i < c; i++) {
                if(i==temp ||i==temp+1 ||i==temp+2){
                    pw.println(getName());
                    pw.println(getPrice());
                    pw.println(getQuantity());
                    i+=2;
                }
                else{
                    pw.println(itemName[i]);
                }
                
            }
            System.out.println("Your item has been deleted.");
            pw.close();
        }
        catch (Exception e) {
        }
        
        
        
        
        
    }
    
    
    
    
}
