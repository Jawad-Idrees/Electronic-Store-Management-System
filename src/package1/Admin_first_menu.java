package package1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class Admin_first_menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					First_menu frame = new First_menu();
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
	public Admin_first_menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 566, 391);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("AC SECTION");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AC_section ac=new AC_section();
				ac.show();
				dispose();
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBackground(new Color(100, 149, 237));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(124, 111, 153, 62);
		contentPane.add(btnNewButton);
		
		JButton btnRefrigerators = new JButton("REFRIGERATORS");
		btnRefrigerators.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRefrigerators.setBounds(326, 113, 146, 59);
		btnRefrigerators.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRefrigerators.setBackground(new Color(100, 149, 237));
		btnRefrigerators.setForeground(new Color(255, 255, 255));
		contentPane.add(btnRefrigerators);
		
		JButton btnLcds = new JButton("LCD TVs");
		btnLcds.setForeground(new Color(255, 255, 255));
		btnLcds.setBackground(new Color(100, 149, 237));
		btnLcds.setBounds(124, 203, 153, 57);
		contentPane.add(btnLcds);
		
		JButton btnPcs = new JButton("PCs");
		btnPcs.setForeground(new Color(255, 255, 255));
		btnPcs.setBackground(new Color(100, 149, 237));
		btnPcs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPcs.setBounds(326, 203, 146, 57);
		contentPane.add(btnPcs);
		
		JLabel lblNewLabel = new JLabel("MAIN MENU");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(100, 149, 237));
		lblNewLabel.setBounds(219, 25, 100, 13);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(100, 149, 237));
		btnNewButton_1.setBounds(45, 25, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
