import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MainScreen extends JFrame {
	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen frame = new MainScreen();
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
	public MainScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBusBookingApplication = new JLabel("Bus Booking Application");
		lblBusBookingApplication.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBusBookingApplication.setBounds(146, 42, 186, 34);
		contentPane.add(lblBusBookingApplication);
		
		JButton btnUserLogin = new JButton("User Login");
		btnUserLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			UserLogin u1= new UserLogin();
			u1.setLocationRelativeTo(null);
			u1.setVisible(true);
			}
		});
		btnUserLogin.setBounds(62, 110, 109, 34);
		contentPane.add(btnUserLogin);
		
		JButton btnAdminLogin = new JButton("Admin Login");
		btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdminLogin a1= new AdminLogin();
				a1.setLocationRelativeTo(null);
				a1.setVisible(true);
			}
		});
		btnAdminLogin.setBounds(146, 171, 134, 53);
		contentPane.add(btnAdminLogin);
		
		JButton btnDriverLogin = new JButton("Driver Login");
		btnDriverLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DriverLogin d=new DriverLogin();
				d.setLocationRelativeTo(null);
				d.setVisible(true);
			}
		});
		btnDriverLogin.setBounds(260, 110, 109, 34);
		contentPane.add(btnDriverLogin);
	}

}
