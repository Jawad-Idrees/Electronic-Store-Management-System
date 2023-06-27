package package1;

import java.awt.EventQueue;
import java.io.*;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

//import net.miginfocom.layout.AC;

import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.*;

public class Mobile_section extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JScrollPane scrollPane;
	private JTextField search_field;
	private final JRadioButton code = new JRadioButton("Search by code");
	private final JRadioButton name = new JRadioButton("Search by product name");
	Object[][] airc;
	ArrayList<Mobiles> ac= new ArrayList<>();
	DefaultTableModel model;
	ObjectOutputStream outing;
	ObjectInputStream inmob;
	private JTextField delete_field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mobile_section frame = new Mobile_section();
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
	public Mobile_section() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 495);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		ObjectInputStream obj;
		File f;  
//		try {
//		outing = new ObjectOutputStream(new FileOutputStream("AC.bin"));
//		}
//		catch(Exception exc){}
		
        try {
        	f=new File("Mobiles.bin");
		inmob= new ObjectInputStream(new FileInputStream(f));
		ac=(ArrayList<Mobiles>)inmob.readObject();}
        catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Exceptions in reading data");

        }
		airc= new Object[ac.size()][6];
        for(int i=0;i<ac.size();i++) {
        	airc[i][0]=ac.get(i).get_name();
        	airc[i][1]=ac.get(i).get_price();
        	airc[i][2]=ac.get(i).get_quantity();
        	airc[i][3]=ac.get(i).get_rating();
        	airc[i][4]=ac.get(i).get_code();
        	airc[i][5]=ac.get(i).get_brand();
        	
        }
        
        	
       
        
		
		int i=0;
		
		String[] columns= {"Name", "Price", "Quantity","Rating","Code","Brand"};
		
		
	
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 155, 643, 323);
		contentPane.add(scrollPane);
		 model= new DefaultTableModel(airc,columns);
		table = new JTable(model);
		scrollPane.setViewportView(table);
		table.setBackground(new Color(100, 149, 237));
		table.setForeground(new Color(255, 255, 255));
		table.getColumnModel().getColumn(2).setPreferredWidth(40);
		table.getColumnModel().getColumn(0).setPreferredWidth(300);
		table.getColumnModel().getColumn(1).setPreferredWidth(40);
		table.getColumnModel().getColumn(3).setPreferredWidth(40);
		table.getColumnModel().getColumn(4).setPreferredWidth(40);
		table.getColumnModel().getColumn(5).setPreferredWidth(40);
		//model.setRowCount(0); // Clear existing rows
		

		String[] search= {"Search by code","Search by name"};
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				First_menu fm= new First_menu();
				fm.show(); dispose();
			}
		});
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(100, 149, 237));
		btnNewButton_2.setBounds(10, 61, 67, 23);
		contentPane.add(btnNewButton_2);
		
		search_field = new JTextField();
		search_field.setBounds(107, 62, 129, 20);
		contentPane.add(search_field);
		search_field.setColumns(10);
		ButtonGroup btngrp= new ButtonGroup();
		btngrp.add(code);
		btngrp.add(name);
		
	
		
		
		JButton btnNewButton_3 = new JButton("Search");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.setRowCount(0);
				if(!code.isSelected()&&(!name.isSelected()))
					JOptionPane.showMessageDialog(null,"Select a radio button for search method");
				else if(code.isSelected()) { 
				int product_code= Integer.parseInt(search_field.getText());
				int j,k;
				try {
				for(j=0;j< ac.size();j++) {
					   
						if(ac.get(j).get_code()==product_code) {
							model.addRow(airc[j]); break;
						
						}	
				}
				
				}
				catch(Exception ecept) {					JOptionPane.showMessageDialog(null,"Exceptions in search by code");
}
					
				}
				else {
					String product_name= search_field.getText();
					int j,k;
					try {
					for(j=0;j< ac.size();j++) {
						
						 
							if(ac.get(j).get_name().equalsIgnoreCase(product_name)) {
								model.addRow(airc[j]); 
							
							}	
				}
					}
					catch(Exception cept) {					JOptionPane.showMessageDialog(null,"Exceptions in search by name");
}
					
				}
			}
		});
		
		btnNewButton_3.setBackground(new Color(100, 149, 237));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_3.setBounds(233, 62, 76, 20);
		contentPane.add(btnNewButton_3);
		code.setBackground(new Color(0, 0, 255));
		code.setForeground(new Color(255, 255, 255));
		code.setBounds(123, 89, 140, 14);
		contentPane.add(code);
		
		
		name.setForeground(Color.WHITE);
		name.setBackground(Color.BLUE);
		name.setBounds(122, 106, 187, 14);
		contentPane.add(name);
		
		JButton btnNewButton = new JButton("Delete Item");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			if(delete_field.getText().trim().isEmpty())
				JOptionPane.showMessageDialog(null,"Please enter code to delete the item");
			else {
				
				int delcode=Integer.parseInt(delete_field.getText());
				int i=0;
				try {
				for(i=0; i<ac.size();i++) {
					if(ac.get(i).get_code()==delcode)
						{ac.remove(i);
						JOptionPane.showMessageDialog(null,"Element deleted successfully\n To see the changes in the file,\nrerun the program");
						break;}
											
				}
				}
				catch(Exception p) {JOptionPane.showMessageDialog(null,"Exceptions");}
				if(i==ac.size()) {
					JOptionPane.showMessageDialog(null,"Elements not found");
				}
				else {
					
					try {outing = new ObjectOutputStream(new FileOutputStream("Mobiles.bin"));
						outing.writeObject(ac);
						outing.close();
						
					}
					catch(Exception oo) {}
				}
			}
			}
		});
		btnNewButton.setBackground(new Color(100, 149, 237));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(384, 85, 112, 23);
		contentPane.add(btnNewButton);
		
		JButton btnAddItem = new JButton("Add/Edit Item");
		btnAddItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			AddEdit_Mobile adc= new AddEdit_Mobile();
			adc.show();
			dispose();
				
				
			}
		});
		btnAddItem.setForeground(Color.WHITE);
		btnAddItem.setBackground(new Color(100, 149, 237));
		btnAddItem.setBounds(521, 61, 112, 23);
		contentPane.add(btnAddItem);
		
		delete_field = new JTextField();
		delete_field.setForeground(new Color(192, 192, 192));
		delete_field.setText("Add Item code to delete item");
		delete_field.setBounds(347, 62, 164, 20);
		contentPane.add(delete_field);
		delete_field.setColumns(10);
		JLabel lblNewLabel = new JLabel("MOBILES SECTION");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(233, 25, 190, 26);
		contentPane.add(lblNewLabel);
		//JTableHeader header=
		
	    //table.getTableHeader();
	}
}
