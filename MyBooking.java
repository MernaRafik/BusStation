package Control;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;

public class MyBooking extends javax.swing.JInternalFrame {
	
    public MyBooking(String u) {
        initComponents();
        jLabel2.setText(u);
      Logic logic =new Logic();
        Scanner rs;
        try
        { rs= new Scanner(new File("Test2.txt"));
        	DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        	boolean valid =logic.reader(u);
        if(valid) {
        	while(rs.hasNext()) {
                model.addRow(new Object[]{rs.next(),rs.next(),rs.next(),rs.next(),rs.next(),rs.next(),rs.next(),rs.next(),rs.next(),rs.next()});
        	}
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 27)); // NOI18N
        jLabel1.setText("My Booking");

        jTable1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User", "Type", "Source", "Destination", "Journey","Price","Distance","Date","Time","Vechiles"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(242)
        			.addComponent(jLabel1)
        			.addPreferredGap(ComponentPlacement.RELATED, 296, Short.MAX_VALUE)
        			.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
        			.addGap(20))
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jScrollPane6, GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(9)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel1)
        				.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addComponent(jScrollPane6, GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
        			.addGap(36))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
