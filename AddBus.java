package Control;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;

public class AddBus extends javax.swing.JInternalFrame {

    public AddBus() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    //	Scanner rs= new Scanner(new File("AddD.txt"));
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        cb2 = new javax.swing.JComboBox<>();
        cb3 = new javax.swing.JComboBox<>();
        cb4 = new javax.swing.JComboBox<>();
        lblCarModel=new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(770, 370));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 19)); // NOI18N
        jLabel6.setText("Price");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 19)); // NOI18N
        jLabel7.setText("Seats");

        jButton1.setFont(new java.awt.Font("Verdana", 0, 19)); // NOI18N
        jButton1.setText("Save");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Verdana", 0, 19)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        t1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        t2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        t5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        t6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 27)); // NOI18N
        jLabel1.setText("Add Trip Details");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 19)); // NOI18N
        jLabel2.setText("Car No.");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 19)); // NOI18N
        jLabel3.setText("Source");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 19)); // NOI18N
        jLabel4.setText("Destination");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 19)); // NOI18N
        jLabel5.setText("Date");

        cb1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Cairo", "Tanta", "Mansoura " ,"Paris", "Italy", "Greece" }));

        cb2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Cairo", "Tanta", "Mansoura " ,"Paris", "Italy", "Greece" }));
        
    
            
        
        cb3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
  //      cb3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {" ", " Ahmed " }));
        
        lblNewLabel = new JLabel("Driver");
        lblNewLabel.setFont(new Font("Verdana", Font.ITALIC, 17));
        
        lblCarModel = new JLabel("Car Model");
        lblCarModel.setFont(new Font("Verdana", Font.PLAIN, 16));
        
   
        cb4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        cb4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", " Bus" , " Mini_Bus", " Limousine" }));


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(232)
        			.addComponent(jLabel1)
        			.addGap(0, 319, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(37)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        					.addGroup(layout.createSequentialGroup()
        						.addComponent(jLabel2)
        						.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(t1, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
        					.addGroup(layout.createSequentialGroup()
        						.addGroup(layout.createParallelGroup(Alignment.LEADING)
        							.addComponent(jLabel6)
        							.addComponent(lblNewLabel))
        						.addGap(44)
        						.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        							.addComponent(cb3, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(t5, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        							.addComponent(cb1, 0, 150, Short.MAX_VALUE))))
        				.addComponent(jLabel3))
        			.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        				.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel4)
        					.addGap(4))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jButton1)
        							.addGap(18)
        							.addComponent(jButton2))
        						.addComponent(jLabel7)
        						.addComponent(lblCarModel))
        					.addGap(21)))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(cb4, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        					.addComponent(t2, 160, 160, Short.MAX_VALUE)
        					.addComponent(t6, 160, 160, Short.MAX_VALUE)
        					.addComponent(cb2, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        			.addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jLabel1)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel5)
        						.addComponent(t2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(56)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(t1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel2))))
        			.addGap(27)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel4)
        						.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(jLabel3)
        							.addComponent(cb1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        					.addPreferredGap(ComponentPlacement.RELATED))
        				.addComponent(cb2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(34)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel6)
        				.addComponent(t5, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
        				.addComponent(t6, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel7))
        			.addGap(26)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(lblNewLabel)
        				.addComponent(cb3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        					.addComponent(lblCarModel)
        					.addComponent(cb4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
        			.addPreferredGap(ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton2)
        				.addComponent(jButton1))
        			.addGap(16))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void init() {
        DefaultComboBoxModel model=new DefaultComboBoxModel();
        String filePath = "C://Users//Marc//Desktop//JAVA//Reservation//Drivers.txt";
        File file = new File(filePath);
        
        try { Scanner x= new Scanner(file);
         while(x.hasNextLine()) {
            String line ;
            line = x.nextLine();
            model.addElement(line);
            cb3.setModel(model);

           }
        
			} catch (FileNotFoundException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
        
    }

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        Connection  con;
        Statement st;
        File fn = new File("Trips.txt");
		FileWriter fw;
		try {
			fw = new FileWriter(fn,true);
			Writer output = new BufferedWriter(fw);
			output.write( t1.getText().toString( ) +" ");
			output.write ( cb1.getSelectedItem().toString( ) +"  ");
			output.write ( cb2.getSelectedItem().toString( ) +"  ");
			output.write ( t2.getText().toString( ) +"  ");
			output.write ( t5.getText().toString( ) +"  ");
			output.write ( t6.getText().toString( ) +"  ");
			output.write ( cb3.getSelectedItem().toString( ) +"  ");
			output.write ( cb4.getSelectedItem().toString( ) +"  ");
			
			((BufferedWriter) output).newLine();
			output.close();
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/busmanage","root","");
            String s;
            int a,b;
            a=Integer.parseInt(t5.getText());
            b=Integer.parseInt(t6.getText());
            st=con.createStatement();
            s="insert into bus_detail values('"+t1.getText()+"','"+cb1.getSelectedItem()+"','"+cb2.getSelectedItem()+"','"+t2.getText()+"',"+a+","+b+",'"+cb3.getSelectedItem()+"','"+cb4.getSelectedItem()+"')";
            int x=st.executeUpdate(s);
            if(x>0)
            {
                JOptionPane.showMessageDialog(this,"Bus Added Sucessfully","Alert",JOptionPane.PLAIN_MESSAGE);
                t1.setText("");
                t2.setText("");
                cb1.setSelectedIndex(0);
                cb2.setSelectedIndex(0);
                t5.setText("");
                t6.setText("");
                cb3.setSelectedIndex(0);
                cb4.setSelectedIndex(0);
            }
        }
        catch(Exception  e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        t1.setText("");
        t2.setText("");
        cb1.setSelectedIndex(0);
        cb2.setSelectedIndex(0);
        t5.setText("");
        t6.setText("");
        cb3.setSelectedIndex(0);
        cb4.setSelectedIndex(0);
    }//GEN-LAST:event_jButton2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JComboBox<String> cb3;
    private javax.swing.JComboBox<String> cb4;
    private javax.swing.JLabel lblNewLabel;
    private JLabel lblCarModel;
}
