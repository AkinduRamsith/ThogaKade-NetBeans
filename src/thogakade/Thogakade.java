/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package thogakade;

import icet.thogakade.view.AddCustomerForm;
import icet.thogakade.view.AddItemForm;
import icet.thogakade.view.DeleteCustomerForm;
import icet.thogakade.view.DeleteItemForm;
import icet.thogakade.view.SearchCustomerForm;
import icet.thogakade.view.SearchItemForm;
import icet.thogakade.view.UpdateCustomerForm;
import icet.thogakade.view.UpdateItemForm;
import icet.thogakade.view.ViewCustomerForm;
import icet.thogakade.view.ViewItemForm;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Acer
 */
public class Thogakade extends javax.swing.JFrame {
    private AddItemForm addItemForm;
    private SearchItemForm searchItemForm; 
    private UpdateItemForm updateItemForm;
    private DeleteItemForm deleteItemForm;
    private ViewItemForm viewItemForm;
    
    private AddCustomerForm addCustomerForm;
    private UpdateCustomerForm updateCustomerForm;
    private DeleteCustomerForm deleteCustomerForm;
    private SearchCustomerForm searchCustomerForm;
    private ViewCustomerForm viewCustomerForm;
    
            
    /**
     * Creates new form Thogakade
     */
    public Thogakade() {
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

        lblHead = new javax.swing.JLabel();
        btnSearchCustomerForm = new javax.swing.JButton();
        btnUpdateCustomerForm = new javax.swing.JButton();
        btnAddCustomerForm = new javax.swing.JButton();
        btnViewItemForm = new javax.swing.JButton();
        btnDeleteCustomerForm = new javax.swing.JButton();
        btnAddItemForm = new javax.swing.JButton();
        btnUpdateItemForm = new javax.swing.JButton();
        btnDeleteItemForm = new javax.swing.JButton();
        btnSearchItemForm = new javax.swing.JButton();
        btnViewCustomerForm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHead.setBackground(new java.awt.Color(255, 255, 153));
        lblHead.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        lblHead.setForeground(new java.awt.Color(255, 51, 51));
        lblHead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHead.setText("THOGAKADE");
        lblHead.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSearchCustomerForm.setText("Search Item Form");
        btnSearchCustomerForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCustomerFormActionPerformed(evt);
            }
        });

        btnUpdateCustomerForm.setText("Update Customer Form");
        btnUpdateCustomerForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCustomerFormActionPerformed(evt);
            }
        });

        btnAddCustomerForm.setText("Add Customer Form");
        btnAddCustomerForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustomerFormActionPerformed(evt);
            }
        });

        btnViewItemForm.setText("View Item Form");
        btnViewItemForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewItemFormActionPerformed(evt);
            }
        });

        btnDeleteCustomerForm.setText("Delete Customer Form");
        btnDeleteCustomerForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCustomerFormActionPerformed(evt);
            }
        });

        btnAddItemForm.setText("Add Item Form");
        btnAddItemForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemFormActionPerformed(evt);
            }
        });

        btnUpdateItemForm.setText("Update Item Form");
        btnUpdateItemForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateItemFormActionPerformed(evt);
            }
        });

        btnDeleteItemForm.setText("Delete Item Form");
        btnDeleteItemForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteItemFormActionPerformed(evt);
            }
        });

        btnSearchItemForm.setText("Search Item Form");
        btnSearchItemForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchItemFormActionPerformed(evt);
            }
        });

        btnViewCustomerForm.setText("View Customer Form");
        btnViewCustomerForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCustomerFormActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAddCustomerForm, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnAddItemForm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                .addComponent(btnUpdateItemForm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                .addComponent(btnDeleteItemForm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSearchItemForm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                            .addComponent(btnViewItemForm, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnUpdateCustomerForm, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                .addComponent(btnDeleteCustomerForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSearchCustomerForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnViewCustomerForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(lblHead, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblHead, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddCustomerForm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddItemForm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearchCustomerForm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchItemForm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateItemForm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateCustomerForm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteItemForm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteCustomerForm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewItemForm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewCustomerForm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchCustomerFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCustomerFormActionPerformed
        if(searchCustomerForm==null){
            searchCustomerForm=new SearchCustomerForm();
        }
        searchCustomerForm.setVisible(true);
    }//GEN-LAST:event_btnSearchCustomerFormActionPerformed

    private void btnAddCustomerFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustomerFormActionPerformed
       if(addCustomerForm==null){
            addCustomerForm=new AddCustomerForm();
        }
        addCustomerForm.setVisible(true);
        
    }//GEN-LAST:event_btnAddCustomerFormActionPerformed

    private void btnUpdateCustomerFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCustomerFormActionPerformed
        if(updateCustomerForm==null){
            updateCustomerForm=new UpdateCustomerForm();
        }
        updateCustomerForm.setVisible(true);
    }//GEN-LAST:event_btnUpdateCustomerFormActionPerformed

    private void btnDeleteCustomerFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCustomerFormActionPerformed
        if(deleteCustomerForm==null){
            deleteCustomerForm=new DeleteCustomerForm();
        }
        deleteCustomerForm.setVisible(true);
    }//GEN-LAST:event_btnDeleteCustomerFormActionPerformed

    private void btnViewItemFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewItemFormActionPerformed
        if(null==viewItemForm){
            viewItemForm=new ViewItemForm();
        }
        viewItemForm.setVisible(true);
    }//GEN-LAST:event_btnViewItemFormActionPerformed

    private void btnAddItemFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemFormActionPerformed
        // TODO add your handling code here:
        if(addItemForm==null){
            addItemForm=new AddItemForm();
        }
        addItemForm.setVisible(true);
    }//GEN-LAST:event_btnAddItemFormActionPerformed

    private void btnUpdateItemFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateItemFormActionPerformed
        // TODO add your handling code here:
         if(updateItemForm==null){
            updateItemForm=new UpdateItemForm();
        }
        updateItemForm.setVisible(true);
    }//GEN-LAST:event_btnUpdateItemFormActionPerformed

    private void btnDeleteItemFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteItemFormActionPerformed
        // TODO add your handling code here:
        if(deleteItemForm==null){
            deleteItemForm=new DeleteItemForm();
        }
        deleteItemForm.setVisible(true);
    }//GEN-LAST:event_btnDeleteItemFormActionPerformed

    private void btnSearchItemFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchItemFormActionPerformed
        // TODO add your handling code here:
        if(searchItemForm==null){
            searchItemForm=new SearchItemForm();
        }
        searchItemForm.setVisible(true);
    }//GEN-LAST:event_btnSearchItemFormActionPerformed

    private void btnViewCustomerFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCustomerFormActionPerformed
        // TODO add your handling code here:
        if(null==viewCustomerForm){
            viewCustomerForm=new ViewCustomerForm();
        }
        viewCustomerForm.setVisible(true);
    }//GEN-LAST:event_btnViewCustomerFormActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Thogakade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCustomerForm;
    private javax.swing.JButton btnAddItemForm;
    private javax.swing.JButton btnDeleteCustomerForm;
    private javax.swing.JButton btnDeleteItemForm;
    private javax.swing.JButton btnSearchCustomerForm;
    private javax.swing.JButton btnSearchItemForm;
    private javax.swing.JButton btnUpdateCustomerForm;
    private javax.swing.JButton btnUpdateItemForm;
    private javax.swing.JButton btnViewCustomerForm;
    private javax.swing.JButton btnViewItemForm;
    private javax.swing.JLabel lblHead;
    // End of variables declaration//GEN-END:variables
}
