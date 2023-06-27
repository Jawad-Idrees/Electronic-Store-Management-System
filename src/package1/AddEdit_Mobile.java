package package1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import net.miginfocom.layout.AC;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.io.*
;public class AddEdit_Mobile extends JFrame {

	private JPanel contentPane;
	private JTextField name_add;
	private JTextField price_add;
	private JTextField rating_add;
	private JTextField name_edit;
	private JTextField price_edit;
	private JTextField weight_add;
	File f;

	ObjectOutputStream out;
	FileOutputStream fout;
	ObjectInputStream obj;
	Object[][] airc;
	ArrayList<Mobiles> ac;

	private JTextField quantity_add;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField quantity_edit;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddEdit_Mobile frame = new AddEdit_Mobile();
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
	
	public AddEdit_Mobile() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 643, 486);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(162, 50, 46, 14);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Price");
		lblNewLabel_1.setBounds(162, 75, 46, 14);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Rating");
		lblNewLabel_1_1.setBounds(162, 100, 46, 14);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel_1_1);
		
		name_add = new JTextField();
		name_add.setBounds(239, 47, 145, 20);
		contentPane.add(name_add);
		name_add.setColumns(10);
		
		price_add = new JTextField();
		price_add.setBounds(239, 72, 145, 20);
		price_add.setColumns(10);
		contentPane.add(price_add);
		
		rating_add = new JTextField();
		rating_add.setBounds(239, 97, 145, 20);
		rating_add.setColumns(10);
		contentPane.add(rating_add);
		
		ac= new ArrayList<>();
	
	try {
        	f=new File("Mobiles.bin");
		obj= new ObjectInputStream(new FileInputStream(f));
        if(!f.exists()) f.createNewFile();
        else { ac=(ArrayList<Mobiles>) obj.readObject();
        
        }
       
        
        	
        }
        catch(Exception e) {
        	
        }
		
		
		JButton btnNewButton = new JButton("Add Item");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(432, 96, 115, 43);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(name_add.getText().trim().isEmpty()||price_add.getText().trim().isEmpty()||quantity_add.getText().trim().isEmpty()||rating_add.getText().trim().isEmpty()||weight_add.getText().trim().isEmpty())
					JOptionPane.showMessageDialog(null,"All fields of add button need to be filled");
				else {
					
				Mobiles a= new Mobiles(name_add.getText(), Integer.parseInt(price_add.getText()),Integer.parseInt(quantity_add.getText()),Double.parseDouble(rating_add.getText()),Product.generator(),weight_add.getText() );
			
				
				ac.add(a);		
						
					
		            try {
		            	
		            	fout=new FileOutputStream("Mobiles.bin");
					out=new ObjectOutputStream(fout);
					out.writeObject(ac);
					out.close();
					fout.close();
					JOptionPane.showMessageDialog(null, "Item added successfully");
					Mobile_section mb= new Mobile_section();
					mb.show(); dispose();
					
					
					}
					
					catch(Exception o) {
						JOptionPane.showMessageDialog(null, "Having Exceptions");
					}
					name_add.setText("");
					price_add.setText("");
					rating_add.setText("");
					weight_add.setText("");
					quantity_add.setText("");
					}
					
				}
		}
			
			);
		btnNewButton.setBackground(new Color(100, 149, 237));
		btnNewButton.setForeground(new Color(255, 255, 255));
		contentPane.add(btnNewButton);
		
		name_edit = new JTextField();
		name_edit.setBounds(239, 290, 151, 20);
		contentPane.add(name_edit);
		name_edit.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("OR");
		lblNewLabel_2.setBounds(283, 188, 53, 44);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewName = new JLabel("New name");
		lblNewName.setBounds(155, 293, 74, 14);
		lblNewName.setForeground(Color.WHITE);
		contentPane.add(lblNewName);
		
		JLabel lblNewPrice = new JLabel("New price");
		lblNewPrice.setBounds(155, 318, 70, 14);
		lblNewPrice.setForeground(Color.WHITE);
		contentPane.add(lblNewPrice);
		
		JLabel lblNewLabel_4_1 = new JLabel("New Rating");
		lblNewLabel_4_1.setBounds(155, 343, 67, 14);
		lblNewLabel_4_1.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(138, 218, 67, 14);
		lblNewLabel_4.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel_4);
		
		price_edit = new JTextField();
		price_edit.setBounds(239, 315, 151, 20);
		price_edit.setColumns(10);
		contentPane.add(price_edit);
		
		JLabel lblNewLabel_3 = new JLabel("Code of the product");
		lblNewLabel_3.setBounds(108, 268, 121, 14);
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		contentPane.add(lblNewLabel_3);
		
		JButton btnEditItem = new JButton("Edit Item");
		btnEditItem.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEditItem.setBounds(432, 314, 115, 43);
		btnEditItem.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
//				if(code_edit.getText().trim().isEmpty()||name_edit.getText().trim().isEmpty()||price_edit.getText().trim().isEmpty()||rating_edit.getText().trim().isEmpty()||weight_edit.getText().trim())
//					JOptionPane.showMessageDialog(null,"All fields of Edit button need to be filled");
//				else {
//					int p,t=0;int codedit=Integer.parseInt(code_edit.getText());
//					for(p=0;p<ac_string.length;p++) {
//						if(ac_string[p][3].equals(codedit))continue;
//						else {
//							t=1;
//							ac_string[p][0]=name_edit.getText();
//							ac_string[p][1]=price_edit.getText();
//							ac_string[p][2]=rating_edit.getText();
//						
//									
//						}
//						
//					}
//					if(t==1) { JOptionPane.showMessageDialog(null, "Item Info edited successfully");
//					for( ) {
//						
//					}
//					
//					}
//					
//				}
			}
});
		btnEditItem.setForeground(Color.WHITE);
		btnEditItem.setBackground(new Color(100, 149, 237));
		contentPane.add(btnEditItem);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Brand name");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setBounds(128, 125, 80, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		weight_add = new JTextField();
		weight_add.setColumns(10);
		weight_add.setBounds(239, 122, 145, 20);
		contentPane.add(weight_add);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("New brand");
		lblNewLabel_4_1_1.setForeground(Color.WHITE);
		lblNewLabel_4_1_1.setBounds(155, 368, 67, 14);
		contentPane.add(lblNewLabel_4_1_1);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mobile_section as= new Mobile_section();
				as.show();
				dispose();
				
			}
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(100, 149, 237));
		btnNewButton_1.setBounds(27, 32, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Quantity");
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setBounds(155, 150, 67, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		quantity_add = new JTextField();
		quantity_add.setColumns(10);
		quantity_add.setBounds(239, 147, 145, 20);
		contentPane.add(quantity_add);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(239, 265, 151, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(239, 340, 151, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(239, 365, 151, 20);
		contentPane.add(textField_3);
		
		quantity_edit = new JTextField();
		quantity_edit.setColumns(10);
		quantity_edit.setBounds(239, 389, 151, 20);
		contentPane.add(quantity_edit);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("New Quantity");
		lblNewLabel_4_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_4_1_1_1.setBounds(138, 392, 80, 14);
		contentPane.add(lblNewLabel_4_1_1_1);
	}
}
