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

public class Maining extends JFrame {

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
	public Maining() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jawad\\Pictures\\verbs 1.PNG"));
		setBackground(new Color(0, 0, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 482);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblNewLabel.setBounds(236, 42, 116, 35);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("WELCOME TO AUTOMATA!");
		lblNewLabel_1.setBounds(194, 107, 223, 17);
		lblNewLabel_1.setFont(new Font("Sitka Small", Font.ITALIC, 14));
		lblNewLabel_1.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel_1);
		
		JButton btnlog = new JButton("ADMIN");
		btnlog.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnlog.setBounds(209, 183, 164, 49);
		btnlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login l= new Login();
				l.show(); dispose();
			}
		});
		btnlog.setForeground(new Color(255, 255, 255));
		btnlog.setBackground(new Color(100, 149, 237));
		contentPane.add(btnlog);
		
		JButton btnSign = new JButton("CUSTOMER");
		btnSign.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSign.setBounds(209, 242, 164, 50);
		btnSign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                 Customer_Login_Signup cls= new Customer_Login_Signup();
                 cls.show();
                 dispose();

			}
		});
		btnSign.setForeground(new Color(255, 255, 255));
		btnSign.setBackground(new Color(100, 149, 237));
		contentPane.add(btnSign);
	}
}

