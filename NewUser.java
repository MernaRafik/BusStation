import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.awt.event.ActionEvent;

public class NewUser extends JFrame {

	private JPanel contentPane;
	private JTextField textField_2;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewUser frame = new NewUser();
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
	public NewUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewUserRegister = new JLabel("New User Register");
		lblNewUserRegister.setBounds(140, 11, 129, 22);
		contentPane.add(lblNewUserRegister);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(10, 73, 75, 14);
		contentPane.add(lblUsername);
		
		textField_2 = new JTextField();
		textField_2.setBounds(93, 67, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(252, 73, 75, 14);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(321, 70, 86, 20);
		contentPane.add(passwordField);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				File filename = new File("Test .txt");
				FileWriter fw;
				try {
					fw = new FileWriter(filename,true);
					Writer output = new BufferedWriter(fw);
					output.write( textField_2.getText().toString( ) +",");
					output.write ( passwordField.getText().toString( ) +"  ");
					((BufferedWriter) output).newLine();
					output.close();
					JOptionPane.showMessageDialog(getParent(), " Done ");
					UserLogin u1= new UserLogin();
					u1.setLocationRelativeTo(null);
					u1.setVisible(true);
				} 
				
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnRegister.setBounds(127, 129, 89, 23);
		contentPane.add(btnRegister);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_2.setText(null);
				passwordField.setText(null);
			}
		});
		btnReset.setBounds(226, 129, 89, 23);
		contentPane.add(btnReset);
	}

}
