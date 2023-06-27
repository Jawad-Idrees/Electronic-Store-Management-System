package package1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Buy_TV extends JFrame {

	private JPanel contentPane;
	private JTextField buy_code;
	private JTextField creditcard;
	ObjectOutputStream obb;
	ObjectInputStream inb;
	File f;
	ArrayList<TV> ac;
	private JTextField quantity;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buy_TV frame = new Buy_TV();
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
	public Buy_TV() {
		try {
		f= new File("TV.bin");
		inb= new ObjectInputStream(new FileInputStream(f));
		ac= (ArrayList<TV>) inb.readObject();
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 481);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		buy_code = new JTextField();
		buy_code.setBounds(276, 152, 222, 28);
		contentPane.add(buy_code);
		buy_code.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter Product Code");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(103, 158, 137, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterCreditcardNumber = new JLabel("Enter Creditcard Number");
		lblEnterCreditcardNumber.setForeground(Color.WHITE);
		lblEnterCreditcardNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEnterCreditcardNumber.setBounds(84, 216, 165, 14);
		contentPane.add(lblEnterCreditcardNumber);
		
		creditcard = new JTextField();
		creditcard.setColumns(10);
		creditcard.setBounds(276, 210, 222, 28);
		contentPane.add(creditcard);
		
		JLabel lblNewLabel_1 = new JLabel("Confirm Your Order");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(230, 41, 216, 37);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TV_customer tvc= new TV_customer();
				tvc.show();dispose();
				
			}
		});
		btnNewButton.setBackground(new Color(100, 149, 237));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(37, 50, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Confirm Order");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(buy_code.getText().trim().isEmpty()|| creditcard.getText().trim().isEmpty()||quantity.getText().trim().isEmpty())	JOptionPane.showMessageDialog(null,"Kindly fill both fields");
				
				else {
					int code= Integer.parseInt(buy_code.getText());
					char[] credit=creditcard.getText().toCharArray();
					int quant=Integer.parseInt( quantity.getText());
					int i;
					for( i=0;i<ac.size();i++) {
						JOptionPane.showMessageDialog(null,ac.get(i).get_code()+"  and your code is "+code );

						if(ac.get(i).get_code()==code) {
							JOptionPane.showMessageDialog(null,"I am in" );
							
								if(ac.get(i).get_quantity()<1){
									JOptionPane.showMessageDialog(null,"This product is currently out of stock");
									TV_customer tvc= new TV_customer(); tvc.show(); dispose(); break;
								}
								
								 if(quant>ac.get(i).get_quantity()){
									JOptionPane.showMessageDialog(null,"The Quantity you entered is greater than the stock available");break;
									
								}
								if(Customer_menu.credit_card_verification(credit)) {
								
									ac.get(i).set_quantity(ac.get(i).get_quantity()-quant);
									
								break;	
								}
								
								}
									}
 
						
							
						
					if(i==ac.size()) {
						JOptionPane.showMessageDialog(null,"No product with the specified code");
						TV_customer tvc= new TV_customer(); tvc.show(); dispose();
						
						
					}
					else {
                     try {						
						obb=new ObjectOutputStream(new FileOutputStream("TV.bin"));
						obb.writeObject(ac);
						obb.close();
						JOptionPane.showMessageDialog(null,"Thank You for Shopping");}
					catch(Exception ecp) {
						JOptionPane.showMessageDialog(null,"Exception in File Writing after buying ");}
					
					     }
					
					
						}
			}	
					
					
				
			
		});
		btnNewButton_1.setBackground(new Color(100, 149, 237));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(223, 340, 183, 37);
		contentPane.add(btnNewButton_1);
		
		JLabel lblEnterQuantity = new JLabel("Enter Quantity");
		lblEnterQuantity.setForeground(Color.WHITE);
		lblEnterQuantity.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEnterQuantity.setBounds(115, 270, 115, 14);
		contentPane.add(lblEnterQuantity);
		
		quantity = new JTextField();
		quantity.setColumns(10);
		quantity.setBounds(276, 264, 222, 28);
		contentPane.add(quantity);
	}
}
