import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.transform.Source;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.sql.Savepoint;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Tickets extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	Vechiles newcar=new Bus();
	Vechiles newcar2=new MiniBus();
	Vechiles newcar3=new Limousine();
	Vechiles newcar4=new Bus2();
	Trips newtrip=new internal();
	Trips newtrip2=new external();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tickets frame = new Tickets(toString() );
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public Tickets(String u) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnOneWay = new JRadioButton("One way");
		rdbtnOneWay.setBounds(311, 43, 90, 25);
		contentPane.add(rdbtnOneWay);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Round");
		rdbtnNewRadioButton.setBounds(311, 92, 84, 25);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnInternal = new JRadioButton("Internal");
		rdbtnInternal.setBounds(26, 66, 90, 25);
		contentPane.add(rdbtnInternal);
		
		JRadioButton rdbtnExternal = new JRadioButton("External");
		rdbtnExternal.setBounds(143, 66, 90, 25);
		contentPane.add(rdbtnExternal);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(26, 249, 56, 16);
		contentPane.add(lblPrice);
		
		textField = new JTextField();
		textField.setBounds(117, 246, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDistance = new JLabel("Distance");
		lblDistance.setBounds(26, 290, 56, 16);
		contentPane.add(lblDistance);
		
		textField_1 = new JTextField();
		textField_1.setBounds(117, 284, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(311, 148, 90, 22);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"N of stops", "One stop", "Many stops", "Non stop"}));
		contentPane.add(comboBox_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(26, 124, 90, 22);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Source", "Alexandria", "England"}));
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(143, 124, 90, 22);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Destination", "Matrouh", "Scotland"}));
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Vechiles", "Bus1 ", "Bus2 ", "MiniBus", "Limousine"}));
		comboBox_3.setBounds(311, 200, 90, 22);
		contentPane.add(comboBox_3);
		JLabel label = new JLabel();
		label.setText(u);
		label.setFont(new Font("Verdana", Font.PLAIN, 18));
		label.setBounds(388, 13, 69, 22);
		contentPane.add(label);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(rdbtnInternal.isSelected()&&comboBox.getSelectedItem().equals("Alexandria")&&comboBox_1.getSelectedItem().equals("Matrouh"))
				{	
					textField_1.setText(newtrip.getDistance());
					textField_2.setText(newtrip.getDate());
					textField_3.setText(newtrip.getTime());
					String x = new Double(newtrip.getPrice()).toString();
					textField.setText(x);
					
					if(rdbtnOneWay.isSelected()) {
						newtrip.save(label.getText(),"Internal", comboBox.getSelectedItem().toString(), comboBox_1.getSelectedItem().toString(),"One Way");
					}
					else
						newtrip.save(label.getText(),"Internal", comboBox.getSelectedItem().toString(), comboBox_1.getSelectedItem().toString(),"Round");
				}
				else if(rdbtnExternal.isSelected()&&comboBox.getSelectedItem().equals("England")&&comboBox_1.getSelectedItem().equals("Scotland"))
				{
					textField_1.setText(newtrip2.getDistance());
					textField_2.setText(newtrip2.getDate());
					textField_3.setText(newtrip2.getTime());
					String x = new Double(newtrip2.getPrice()).toString();
					textField.setText(x);
					
					if(rdbtnOneWay.isSelected())
						newtrip2.save(label.getText(),"External", comboBox.getSelectedItem().toString(), comboBox_1.getSelectedItem().toString(),"One Way");
					else
						newtrip2.save(label.getText(),"External", comboBox.getSelectedItem().toString(), comboBox_1.getSelectedItem().toString(),"Round");
				}
				
				if(comboBox_3.getSelectedItem().equals("Bus2 ")&&comboBox.getSelectedItem().equals("Alexandria")&&comboBox_1.getSelectedItem().equals("Matrouh"))
				{
					if(newcar4.checkavailability(comboBox_3.getSelectedItem().toString())==true)
					{
						newcar4.save(comboBox_3.getSelectedItem().toString());
						JOptionPane.showMessageDialog(null, "Booking Successful");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "No available seats");
					}
				}
				if(comboBox_3.getSelectedItem().equals("Bus1 ")&&comboBox.getSelectedItem().equals("England")&&comboBox_1.getSelectedItem().equals("Scotland"))
				{
					if(newcar.checkavailability(comboBox_3.getSelectedItem().toString())==true)
					{
						newcar.save(comboBox_3.getSelectedItem().toString());
						JOptionPane.showMessageDialog(null, "Booking Successful");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "No available seats");
					}
				}
				if(comboBox_3.getSelectedItem().equals("MiniBus"))
				{
					if(newcar2.checkavailability(comboBox_3.getSelectedItem().toString())==true)
					{
						newcar2.save(comboBox_3.getSelectedItem().toString());
						JOptionPane.showMessageDialog(null, "Booking Successful");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "No available seats");
					}
				}
				if(comboBox_3.getSelectedItem().equals("Limousine"))
				{
					if(newcar3.checkavailability(comboBox_3.getSelectedItem().toString())==true)
					{
						newcar3.save(comboBox_3.getSelectedItem().toString());
						JOptionPane.showMessageDialog(null, "Booking Successful");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "No available seats");
					}
					
			} 
			}});
		btnSubmit.setBounds(349, 328, 96, 25);
		contentPane.add(btnSubmit);
		
		JLabel lblPleaseSelectThe = new JLabel("Please select the type of your trip");
		lblPleaseSelectThe.setBounds(26, 25, 207, 21);
		contentPane.add(lblPleaseSelectThe);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(26, 183, 201, 2);
		contentPane.add(separator);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				rdbtnInternal.setSelected(false);
				rdbtnExternal.setSelected(false);
				rdbtnOneWay.setSelected(false);
				rdbtnNewRadioButton.setSelected(false);
				comboBox.setSelectedItem("Source");
				comboBox_1.setSelectedItem("Destination");
				comboBox_2.setSelectedItem("N of stops");
				comboBox_3.setSelectedItem("Vechiles");
			}
		});
		btnReset.setBounds(349, 281, 96, 25);
		contentPane.add(btnReset);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(261, 13, 21, 192);
		contentPane.add(separator_1);
		
		JLabel lblYourTripInfo = new JLabel("Your trip info");
		lblYourTripInfo.setBounds(85, 203, 128, 16);
		contentPane.add(lblYourTripInfo);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(26, 332, 56, 16);
		contentPane.add(lblDate);
		
		textField_2 = new JTextField();
		textField_2.setBounds(117, 327, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setBounds(26, 373, 56, 16);
		contentPane.add(lblTime);
		
		textField_3 = new JTextField();
		textField_3.setBounds(117, 370, 116, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
	
		
		
		
		
	}
}
