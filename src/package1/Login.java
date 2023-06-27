package package1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnterYourEmail;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 648, 485);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(151, 145, 52, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("LOG IN MENU");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(276, 68, 162, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBackground(new Color(100, 149, 237));
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setBounds(131, 190, 82, 14);
		contentPane.add(lblNewLabel_1_1);
		
		txtEnterYourEmail = new JTextField();
		txtEnterYourEmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		txtEnterYourEmail.setForeground(SystemColor.inactiveCaption);
		txtEnterYourEmail.setBounds(240, 142, 184, 20);
		contentPane.add(txtEnterYourEmail);
		txtEnterYourEmail.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(240, 188, 184, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Maining m= new Maining();
				m.show();
				dispose();
				
			}
		});
		btnNewButton.setBackground(new Color(100, 149, 237));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(28, 26, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnLogIn = new JButton("LOG IN");
		btnLogIn.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				First_menu fm= new First_menu();
				fm.show();
				dispose();
				
				
				
			}
		});
		btnLogIn.setForeground(Color.WHITE);
		btnLogIn.setBackground(new Color(100, 149, 237));
		btnLogIn.setBounds(289, 245, 98, 31);
		contentPane.add(btnLogIn);
	}
}
