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

public class Customer_menu extends JFrame {

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
	public Customer_menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 484);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("AC SECTION");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ac_customer acc=new Ac_customer();
				acc.show();
				dispose();
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBackground(new Color(100, 149, 237));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(124, 152, 181, 68);
		contentPane.add(btnNewButton);
		
		JButton btnRefrigerators = new JButton("REFRIGERATORS");
		btnRefrigerators.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ref_customer rcc= new Ref_customer();
				rcc.show(); dispose();
				
			}
		});
		btnRefrigerators.setBounds(344, 151, 173, 70);
		btnRefrigerators.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRefrigerators.setBackground(new Color(100, 149, 237));
		btnRefrigerators.setForeground(new Color(255, 255, 255));
		contentPane.add(btnRefrigerators);
		
		JButton btnMobilePhones = new JButton("MOBILE PHONES");
		btnMobilePhones.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 Mobile_customer mbc= new Mobile_customer();
				 mbc.show();dispose();
				 
			}
		});
		btnMobilePhones.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMobilePhones.setForeground(new Color(255, 255, 255));
		btnMobilePhones.setBackground(new Color(100, 149, 237));
		btnMobilePhones.setBounds(344, 251, 173, 68);
		contentPane.add(btnMobilePhones);
		
		JButton btnLcds = new JButton("LCD TVs");
		btnLcds.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TV_customer tvc= new TV_customer();
				tvc.show(); dispose();
				
			}
		});
		btnLcds.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLcds.setForeground(new Color(255, 255, 255));
		btnLcds.setBackground(new Color(100, 149, 237));
		btnLcds.setBounds(124, 251, 181, 68);
		contentPane.add(btnLcds);
		
		JLabel lblNewLabel = new JLabel("MAIN MENU");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(100, 149, 237));
		lblNewLabel.setBounds(264, 51, 157, 39);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("LOG OUT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			Maining mn= new Maining(); mn.show();dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(100, 149, 237));
		btnNewButton_1.setBounds(45, 25, 89, 23);
		contentPane.add(btnNewButton_1);
	}
	
	public static boolean credit_card_validation(char[] credit_card_array) {

        boolean coming=false;

        if(credit_card_array.length==16) {
            for(int i=0;i<credit_card_array.length;i++) {
                if(Character.isDigit(credit_card_array[i])) {if(i==15) return true; else continue;}
            }}

        return coming;
    }

    public static boolean credit_card_verification(char [] credit_card_array){
    	if(!(credit_card_validation(credit_card_array)))return false;
    	else {

        int sum_of_doubles=0,sum_of_odds=0;int number;


        for(int i=14; i>=0;i-=2) {
            number= credit_card_array[i]-'0';
            number*=2;
            if(number>9)sum_of_doubles+= 1+number%10;
            else sum_of_doubles+=number;

        }
        for(int i=15;i>0;i-=2) {
            sum_of_odds+=credit_card_array[i]-'0';
        }
        if((sum_of_doubles+sum_of_odds)%10==0)return true;
        else return false;
    	}

    }
}
