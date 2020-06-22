/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book;
import java.awt.Color;
import java.awt.Component;
import java.util.*;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author brian
 */
public class PhoneBook extends javax.swing.JFrame {

    /**
     * Creates new form PhoneBook
     */
    public PhoneBook() {
        initComponents();
    }

    private class HighlightRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        // everything as usual
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        // added behavior
        if(row == table.getSelectedRow()) {

            // this will customize that kind of border that will be use to highlight a row
            setBorder(BorderFactory.createMatteBorder(2, 1, 2, 1, Color.BLACK));
        }

        return this;
    }}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        search = new javax.swing.JButton();
        first6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        first1 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        first2 = new javax.swing.JLabel();
        searchfield = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        first3 = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        first4 = new javax.swing.JLabel();
        create = new javax.swing.JButton();
        view = new javax.swing.JButton();
        a = new javax.swing.JButton();
        first5 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        delete1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(69, 123, 157));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search.setBackground(new java.awt.Color(0, 153, 51));
        search.setFont(new java.awt.Font("URW Bookman", 1, 24)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Search");
        search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 530, 140, 40));

        first6.setFont(new java.awt.Font("Noto Sans CJK JP DemiLight", 1, 38)); // NOI18N
        first6.setText("Search :");
        jPanel1.add(first6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 525, 230, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FirstName", "Last Name", "Address", "Contact", "E-mail"
            }
        ){public boolean isCellEditable(int row, int column){return false;}});
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, 990, 170));

        first1.setFont(new java.awt.Font("Noto Sans CJK JP DemiLight", 1, 38)); // NOI18N
        first1.setText("First Name :");
        jPanel1.add(first1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 230, 40));

        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });
        jPanel1.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 95, 450, 40));

        first2.setFont(new java.awt.Font("Noto Sans CJK JP DemiLight", 1, 38)); // NOI18N
        first2.setText("Last Name :");
        jPanel1.add(first2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 230, 40));

        searchfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchfieldActionPerformed(evt);
            }
        });
        jPanel1.add(searchfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 620, 40));

        address.setColumns(20);
        address.setRows(5);
        jScrollPane2.setViewportView(address);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 450, 110));

        first3.setFont(new java.awt.Font("Noto Sans CJK JP DemiLight", 1, 38)); // NOI18N
        first3.setText("Address :");
        jPanel1.add(first3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 230, 40));

        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        jPanel1.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 165, 450, 40));

        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 385, 450, 40));

        first4.setFont(new java.awt.Font("Noto Sans CJK JP DemiLight", 1, 38)); // NOI18N
        first4.setText("Contact :");
        jPanel1.add(first4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 230, 40));

        create.setBackground(new java.awt.Color(0, 153, 51));
        create.setFont(new java.awt.Font("URW Bookman", 1, 24)); // NOI18N
        create.setForeground(new java.awt.Color(255, 255, 255));
        create.setText("Create");
        create.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createMouseClicked(evt);
            }
        });
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });
        jPanel1.add(create, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, 140, 40));

        view.setBackground(new java.awt.Color(0, 153, 51));
        view.setFont(new java.awt.Font("URW Bookman", 1, 24)); // NOI18N
        view.setForeground(new java.awt.Color(255, 255, 255));
        view.setText("View");
        view.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        view.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                viewMouseMoved(evt);
            }
        });
        view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewMouseClicked(evt);
            }
        });
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        jPanel1.add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 210, 140, 40));

        a.setBackground(new java.awt.Color(0, 153, 51));
        a.setFont(new java.awt.Font("URW Bookman", 1, 24)); // NOI18N
        a.setForeground(new java.awt.Color(255, 255, 255));
        a.setText("Update");
        a.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        a.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aMouseClicked(evt);
            }
        });
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });
        jPanel1.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 300, 140, 40));

        first5.setFont(new java.awt.Font("Noto Sans CJK JP DemiLight", 1, 38)); // NOI18N
        first5.setText("E-mail :");
        jPanel1.add(first5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 230, 40));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 455, 450, 40));

        delete1.setBackground(new java.awt.Color(0, 153, 51));
        delete1.setFont(new java.awt.Font("URW Bookman", 1, 24)); // NOI18N
        delete1.setForeground(new java.awt.Color(255, 255, 255));
        delete1.setText("Delete");
        delete1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delete1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete1MouseClicked(evt);
            }
        });
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });
        jPanel1.add(delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 390, 140, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1160, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_searchMouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        final JTable table = new JTable(model);
    final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(model);
    jTable1.setRowSorter(sorter);
          
          String text = searchfield.getText();
                    if (text.length() == 0) {
          sorter.setRowFilter(null);
        } else {
          sorter.setRowFilter(RowFilter.regexFilter(text));
        }
        
        
    }//GEN-LAST:event_searchActionPerformed

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameActionPerformed

    private void searchfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchfieldActionPerformed
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            
        // TODO add your handling code here:
    }//GEN-LAST:event_searchfieldActionPerformed

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    private void createMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_createMouseClicked

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        jTable1.setVisible(false);
        if(firstname.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Empty","", JOptionPane.ERROR_MESSAGE);
            
           
       } else {
           
           
           if(address.getText().equals("") && contact.getText().equals("") && email.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Add Contact Info","", JOptionPane.ERROR_MESSAGE);
               
           }else{
               
               Data d1=new Data();
               d1.setFirst_Name_txt(firstname.getText());
               d1.setLast_Name_txt(lastname.getText());
               d1.setAddress_txt(address.getText());
               d1.setContact_txt(contact.getText());
               d1.setEmail_txt(email.getText());
               
               
               
               
        String first_Name= d1.getFirst_Name_txt();
        String last_Name=  d1.getLast_Name_txt();
        String addr= d1.getAddress_txt();
        String cont= d1.getContact_txt();
        String mail= d1.getEmail_txt();
        firstname.setText("");
        lastname.setText("");
        address.setText("");
        contact.setText("");
        email.setText("");   
        String[] row = {first_Name,last_Name,addr,cont,mail};
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(row);
        
               
           }
                
        
        }
    

    }//GEN-LAST:event_createActionPerformed

    private void viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_viewMouseClicked

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed

            jTable1.setVisible(true );


    }//GEN-LAST:event_viewActionPerformed

    private void aMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aMouseClicked
        int i = jTable1.getSelectedRow();
       DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
       
       if(firstname.getText().equals("") || address.getText().equals("") && contact.getText().equals("") && email.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Update Error","", JOptionPane.ERROR_MESSAGE);
       
       }else{
       model.setValueAt(firstname.getText(), i, 0);
       model.setValueAt(lastname.getText(), i, 1);
       model.setValueAt(address.getText(), i, 2);
       model.setValueAt(contact.getText(), i, 3);
       model.setValueAt(email.getText(), i, 4);
        firstname.setText("");
        lastname.setText("");
        address.setText("");
        contact.setText("");
        email.setText(""); 
       }
       
       
        // TODO add your handling code here:
    }//GEN-LAST:event_aMouseClicked

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aActionPerformed

    private void viewMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseMoved
    }//GEN-LAST:event_viewMouseMoved

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void delete1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_delete1MouseClicked

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed


        
        int row = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.removeRow( row );


        // TODO add your handling code here:
    }//GEN-LAST:event_delete1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked


        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(PhoneBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhoneBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhoneBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhoneBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhoneBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a;
    private javax.swing.JTextArea address;
    private javax.swing.JTextField contact;
    private javax.swing.JButton create;
    private javax.swing.JButton delete1;
    private javax.swing.JTextField email;
    private javax.swing.JLabel first1;
    private javax.swing.JLabel first2;
    private javax.swing.JLabel first3;
    private javax.swing.JLabel first4;
    private javax.swing.JLabel first5;
    private javax.swing.JLabel first6;
    private javax.swing.JTextField firstname;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lastname;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchfield;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}