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
import java.awt.event.ActionEvent;

public class AdminLogin extends JFrame {

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
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdminLogin = new JLabel("Admin Login");
		lblAdminLogin.setBounds(173, 42, 106, 14);
		contentPane.add(lblAdminLogin);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(75, 94, 66, 14);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(75, 143, 66, 14);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(173, 91, 151, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(173, 140, 151, 20);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean valid =logic.validationAdmin(textField.getText().toString( ),passwordField.getText());
				String filename="AddA.txt";
				boolean valid2 =logic.validationNewAdmins(textField.getText().toString( ),passwordField.getText(), filename);
				
				if (valid || valid2) {
					JOptionPane.showMessageDialog(getParent(), "WELCOME!");
					AdminControl p=new AdminControl(textField.getText());
					p.setLocationRelativeTo(null);
					p.setVisible(true);
				}
		
				else {
					JOptionPane.showMessageDialog(getParent(), "invalid username or password ");
					}
					 
				
			}
		});
		btnLogin.setBounds(170, 187, 74, 23);
		contentPane.add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
				passwordField.setText(null);
			}
		});
		btnReset.setBounds(254, 187, 70, 23);
		contentPane.add(btnReset);
	}

}
