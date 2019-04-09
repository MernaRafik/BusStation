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

public class UserLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	Logic logic =new Logic();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLogin frame = new UserLogin();
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
	public UserLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserLogin = new JLabel("User Login");
		lblUserLogin.setBounds(172, 38, 150, 26);
		contentPane.add(lblUserLogin);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(62, 88, 87, 14);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(62, 122, 61, 14);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(148, 85, 174, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(148, 119, 174, 20);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String filename="Test .txt";
			boolean valid =logic.validation(textField.getText().toString( ),passwordField.getText(), filename);
			if (valid) { 
				
				JOptionPane.showMessageDialog(getParent(), "WELCOME!");
				UserControl p= new UserControl(textField.getText());
				p.setLocationRelativeTo(null);
				p.setVisible(true);
				}
			
			else {
				JOptionPane.showMessageDialog(getParent(), "invalid username or password ");
				}
				 
			}
		});
		btnLogin.setBounds(148, 169, 77, 23);
		contentPane.add(btnLogin);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
				passwordField.setText(null);
				
			}
		});
		btnNewButton.setBounds(245, 169, 77, 23);
		contentPane.add(btnNewButton);
		
		JButton btnCreateAccount = new JButton("Create Account");
		btnCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NewUser x = new NewUser();
				x.setLocationRelativeTo(null);
				x.setVisible(true);
			}
		});
		btnCreateAccount.setBounds(148, 215, 174, 23);
		contentPane.add(btnCreateAccount);
	}
}
