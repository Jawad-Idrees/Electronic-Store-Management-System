package package1;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class First_option extends JFrame {

	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("AUTOMATA");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Maining frame = new Maining();
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
	public First_option() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jawad\\Pictures\\verbs 1.PNG"));
		setBackground(new Color(0, 0, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblNewLabel.setBounds(166, 47, 169, 17);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DEAR CUSTOMER! WELCOME TO AUTOMATA");
		lblNewLabel_1.setFont(new Font("Sitka Small", Font.ITALIC, 14));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(61, 116, 334, 17);
		contentPane.add(lblNewLabel_1);
		
		JButton btnlog = new JButton("LOG IN");
		btnlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnlog.setForeground(new Color(255, 255, 255));
		btnlog.setBackground(new Color(100, 149, 237));
		btnlog.setBounds(168, 182, 89, 23);
		contentPane.add(btnlog);
		
		JButton btnSign = new JButton("SIGN UP");
		btnSign.setForeground(new Color(255, 255, 255));
		btnSign.setBackground(new Color(100, 149, 237));
		btnSign.setBounds(151, 246, 120, 23);
		contentPane.add(btnSign);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(100, 149, 237));
		btnNewButton.setBounds(25, 46, 89, 23);
		contentPane.add(btnNewButton);
	}
}

