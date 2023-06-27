package package1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Admin_options extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_options frame = new Admin_options();
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
	public Admin_options() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 390);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Choose your option");
		lblNewLabel_1.setBounds(160, 27, 176, 17);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Add Item");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(172, 64, 118, 29);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(100, 149, 237));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnViewItems = new JButton("View Items");
		btnViewItems.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnViewItems.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnViewItems.setBounds(172, 104, 118, 35);
		btnViewItems.setForeground(Color.WHITE);
		btnViewItems.setBackground(new Color(100, 149, 237));
		contentPane.add(btnViewItems);
		
		JButton btnSearchItems = new JButton("Search Items");
		btnSearchItems.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSearchItems.setBounds(172, 150, 118, 35);
		btnSearchItems.setForeground(Color.WHITE);
		btnSearchItems.setBackground(new Color(100, 149, 237));
		contentPane.add(btnSearchItems);
		
		JButton btnDeleteItems = new JButton("Delete Items");
		btnDeleteItems.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDeleteItems.setBounds(172, 242, 118, 35);
		btnDeleteItems.setForeground(Color.WHITE);
		btnDeleteItems.setBackground(new Color(100, 149, 237));
		contentPane.add(btnDeleteItems);
		
		JButton btnEditItem = new JButton("Edit Item");
		btnEditItem.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEditItem.setBounds(172, 196, 118, 35);
		btnEditItem.setForeground(Color.WHITE);
		btnEditItem.setBackground(new Color(100, 149, 237));
		contentPane.add(btnEditItem);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Maining m= new Maining();
				m.show();
				dispose();
			}
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBackground(new Color(100, 149, 237));
		btnNewButton_1.setBounds(24, 36, 77, 29);
		contentPane.add(btnNewButton_1);
	}
}
