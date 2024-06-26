
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.DeleteResult;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import org.bson.Document;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Ali
 */
public class Report extends javax.swing.JFrame {

    /**
     * Creates new form Report
     */
    public Report() {
        initComponents();
        Connect();
        refreshDocumentDisplay();
        
    }
    
    MongoClient mongo;
    MongoDatabase dbconnection;
    MongoCollection<org.bson.Document> collection;
    
public void Connect(){
    mongo = new MongoClient("localhost",27017);
    dbconnection = mongo.getDatabase("Snapchat");
    collection = dbconnection.getCollection("Reports");
    System.out.println("connected");
  
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtreportid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtuserid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtentity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtentityid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtreason = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txttime = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DocumentViewer = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 51));

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 330));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Report ID");

        txtreportid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtreportid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtreportidActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("User ID");

        txtuserid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtuserid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuseridActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Entity Type");

        txtentity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtentity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtentityActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Entity ID");

        txtentityid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtentityid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtentityidActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Reason");

        txtreason.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtreason.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtreasonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Timestamp");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 51));
        jLabel7.setText("Reports");

        txttime.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txttime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttimeActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(241, 241, 127));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(241, 241, 127));
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(241, 241, 127));
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(241, 241, 127));
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        DocumentViewer.setColumns(20);
        DocumentViewer.setRows(5);
        jScrollPane1.setViewportView(DocumentViewer);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(216, 216, 216))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtreportid, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton5))
                                    .addComponent(txtuserid, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtentity, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtentityid, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtreason, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txttime, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(75, 75, 75))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 16, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(txtreportid, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtuserid, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(txtentity, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtentityid, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtreason, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttime, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
        
    private void txtreportidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtreportidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtreportidActionPerformed

    private void txtuseridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuseridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuseridActionPerformed

    private void txtentityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtentityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtentityActionPerformed

    private void txtentityidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtentityidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtentityidActionPerformed

    private void txtreasonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtreasonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtreasonActionPerformed

    private void txttimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttimeActionPerformed
private void refreshDocumentDisplay() {
    StringBuilder sb = new StringBuilder();

    for (Document doc : collection.find()) {
        sb.append("Report ID: ").append(doc.getInteger("reportId")).append("\n");
        sb.append("User ID: ").append(doc.getInteger("userId")).append("\n");
        sb.append("Entity Type: ").append(doc.getString("entityType")).append("\n");
        sb.append("Entity ID: ").append(doc.getInteger("entityId")).append("\n");
        sb.append("Reason: ").append(doc.getString("reason")).append("\n");
        sb.append("Timestamp: ").append(doc.getString("timestamp")).append("\n");
        sb.append("--------------------------------------------------\n");
    }
    DocumentViewer.setText(sb.toString());
}
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        int reportId = Integer.parseInt(txtreportid.getText());
        int userId = Integer.parseInt(txtuserid.getText());
       int entityId = Integer.parseInt(txtentityid.getText());
        String entityType = txtentity.getText();
        String reason = txtreason.getText();
        String timestamp = txttime.getText();
        Document d = new Document("reportId",reportId);
        d.append("userId", userId);
        d.append("entityType",entityType);
        d.append("entityId",entityId);
        d.append("reason", reason);
        d.append("timestamp",timestamp);
        collection.insertOne(d);
        JOptionPane.showMessageDialog(this, "inserted successfuly");
        refreshDocumentDisplay();
        
    }//GEN-LAST:event_jButton1ActionPerformed


    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int reportId = Integer.parseInt(txtreportid.getText());
        int userId = Integer.parseInt(txtuserid.getText());
        int entityId = Integer.parseInt(txtentityid.getText());
        String entityType = txtentity.getText();
        String reason = txtreason.getText();
        String timestamp = txttime.getText();


      Document query = new Document("reportId", reportId);
      Document update = new Document("$set", new Document("userId", userId)
                                            .append("entityType", entityType)
                                            .append("entityId", entityId)
                                            .append("reason", reason)
                                            .append("timestamp", timestamp));

// Debugging output
System.out.println("Query: " + query.toJson());
System.out.println("Update: " + update.toJson());

long modifiedCount = collection.updateOne(query, update).getModifiedCount();

// Check if the document was updated
if (modifiedCount > 0) {
    JOptionPane.showMessageDialog(this, "Updated successfully");
} else {
    JOptionPane.showMessageDialog(this, "No document found with Report ID: " + txtreportid.getText());
}
refreshDocumentDisplay();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void searchReportById(int reportId) {
    // Define the search query
    Document query = new Document("reportId", reportId);
    
    // Perform the search
    Document foundReport = collection.find(query).first();
    
    // Check if a report with the given ID exists
    if (foundReport != null) {
        // Populate the text fields with the found report data
        txtreportid.setText(String.valueOf(foundReport.getInteger("reportId")));
        txtuserid.setText(String.valueOf(foundReport.getInteger("userId")));
        txtentityid.setText(String.valueOf(foundReport.getInteger("entityId")));
        txtentity.setText(foundReport.getString("entityType"));
        txtreason.setText(foundReport.getString("reason"));
        txttime.setText(foundReport.getString("timestamp"));
    } else {
        
        txtuserid.setText("");
        txtentityid.setText("");
        txtentity.setText("");
        txtreason.setText("");
        txttime.setText("");
        // If no report found with the given ID, display a message
        JOptionPane.showMessageDialog(this, "No report found with Report ID: " + reportId);
        
    }
}
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
          int reportId = Integer.parseInt(txtreportid.getText());
        // Call the search function
        searchReportById(reportId);
        refreshDocumentDisplay();
    }//GEN-LAST:event_jButton3ActionPerformed
private void deleteReportById(int reportId) {
    // Define the query to find the report by its ID
    Document query = new Document("reportId", reportId);
    
    // Perform the deletion operation
    DeleteResult result = collection.deleteOne(query);
    
    // Check if any report was deleted
    if (result.getDeletedCount() > 0) {
        JOptionPane.showMessageDialog(this, "Report with Report ID " + reportId + " deleted successfully.");
        txtuserid.setText("");
        txtentityid.setText("");
        txtentity.setText("");
        txtreason.setText("");
        txttime.setText("");
        
    } else {
        JOptionPane.showMessageDialog(this, "No report found with Report ID: " + reportId);
        txtreportid.setText("");
        txtuserid.setText("");
        txtentityid.setText("");
        txtentity.setText("");
        txtreason.setText("");
        txttime.setText("");
    }
}

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int reportId = Integer.parseInt(txtreportid.getText());
        int confirmDelete = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this friend?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
        if (confirmDelete == JOptionPane.YES_OPTION) {
         deleteReportById(reportId);
    }else
        {
        txtreportid.setText("");
        txtuserid.setText("");
        txtentityid.setText("");
        txtentity.setText("");
        txtreason.setText("");
        txttime.setText("");
        
        
        }
        refreshDocumentDisplay();
    }//GEN-LAST:event_jButton5ActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Metal".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//           
//            @Override
//            public void run() {
//                new Report().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea DocumentViewer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtentity;
    private javax.swing.JTextField txtentityid;
    private javax.swing.JTextField txtreason;
    private javax.swing.JTextField txtreportid;
    private javax.swing.JTextField txttime;
    private javax.swing.JTextField txtuserid;
    // End of variables declaration//GEN-END:variables
}
