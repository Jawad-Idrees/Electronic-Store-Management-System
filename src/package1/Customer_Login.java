package package1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Customer_Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer_Login frame = new Customer_Login();
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
	public Customer_Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(176, 66, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		
		
		
		JLabel lblNewLabel = new JLabel("Enter ID");
		lblNewLabel.setBounds(120, 72, 46, 14);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(103, 100, 63, 14);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		contentPane.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(176, 97, 86, 20);
		contentPane.add(passwordField);
		
		
		JButton btnNewButton = new JButton("LOG IN");
		btnNewButton.setBounds(176, 165, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JLabel fields_label = new JLabel("");
				fields_label.setBounds(150, 199, 322, 14);
				fields_label.setForeground(new Color(255, 255, 255));
				contentPane.add(fields_label);
				fields_label.setText("");
			
				    if(textField.getText().trim().isEmpty()&& passwordField.getText().trim().isEmpty())
						fields_label.setText("fields are empty");
					else if(textField.getText().trim().isEmpty()) 
						fields_label.setText("ID field is empty");
					else if(passwordField.getText().trim().isEmpty())
						fields_label.setText("password field is empty");
				    //fields_label.setText("");
				    
					
					
						
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBackground(new Color(100, 149, 237));
		btnNewButton.setForeground(new Color(255, 255, 255));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setBounds(23, 24, 89, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Customer_Login_Signup c1= new Customer_Login_Signup();
				c1.show();
				dispose();
			}
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(100, 149, 237));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Forgot password?");
		btnNewButton_2.setBounds(163, 125, 110, 22);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(0, 51, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton_2);
		
	}
}
