package Control;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class DeleteBus extends javax.swing.JInternalFrame {

    public DeleteBus() {
        initComponents();
   
        Scanner rs;
        try
        {	rs= new Scanner(new File("Trips.txt"));
    	DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        while(rs.hasNext())
        {
            model.addRow(new Object[]{rs.next(),rs.next(),rs.next(),rs.next(),rs.next(),rs.next(),rs.next(),rs.next()});
        } 
       
        rs.close();
        }
        catch(Exception  e)
        {
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(750, 350));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 27)); // NOI18N
        jLabel1.setText("Delete Bus");

        jTable1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bus No.", "Source", "Destination", "Time", "Price", "Seats","Drivers","car model"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int index =jTable1.getSelectedRow();
        TableModel model=jTable1.getModel();
        String busno=(String)model.getValueAt(index,0);

    int result=JOptionPane.showConfirmDialog(null,"Want to Delete? ","Sure !!!",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
    if(result==JOptionPane.OK_OPTION)
    {	Scanner rs;
        try
        {	rs= new Scanner(new File("Trips.txt"));
        int res=JOptionPane.showConfirmDialog(null,"Deleted Sucessfully","Done",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
   
    	if(res==JOptionPane.OK_OPTION)
                {
                    DefaultTableModel model2=(DefaultTableModel) jTable1.getModel();
                    model2.removeRow(jTable1.getSelectedRow());
                    int row=model.getRowCount();   
                    int col=model.getColumnCount();   
                    try
                    {
                        BufferedWriter out = new BufferedWriter(new FileWriter("Trips.txt")); // no longer append; you want to completely clear the old contents, don't you?
                        for(int i=0;i<row;i++){   
                            for(int j=0;j<col;j++){
                                Object data = model.getValueAt(i,j);   
                                out.write(data+"  "); 
                                ((BufferedWriter) out).newLine();
                            }   
                        }
                        out.close(); // to make sure the file connection is dropped
                    }catch (IOException e) {   
                        System.out.println(e);   
                    }	 
                }    
        rs.close();
        }
        catch(Exception  e)
        {
            System.out.println(e);
        }
    }
    
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
