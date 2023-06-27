package package1;

import java.awt.EventQueue;
import java.io.*;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

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
import javax.swing.table.DefaultTableModel;

public class TV_customer extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JScrollPane scrollPane;
	private JTextField search_field;
	private final JRadioButton code = new JRadioButton("Search by code");
	private final JRadioButton name = new JRadioButton("Search by product name");
	ArrayList<TV> ac;
	DefaultTableModel model;
    Object[][] airc;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TV_customer frame = new TV_customer();
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
	public TV_customer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 499);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		ObjectInputStream obj;
		File f; // airc= new Object[50][6];
	
		

        try {
        	f=new File("TV.bin");
		obj= new ObjectInputStream(new FileInputStream(f));
		ac=(ArrayList<TV>)obj.readObject();}
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
        	airc[i][5]=ac.get(i).get_screen();
        	
        }
        
		
		Object[] columns= {"Name", "Price", "Quantity","Rating","Code","Screen size"};

		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 158, 643, 320);
		contentPane.add(scrollPane);
		 model= new DefaultTableModel(airc,columns);
		
		table = new JTable(model);
		scrollPane.setViewportView(table);
		table.setBackground(new Color(100, 149, 237));
		table.setForeground(new Color(255, 255, 255));
		table.getColumnModel().getColumn(2).setPreferredWidth(60);
		table.getColumnModel().getColumn(0).setPreferredWidth(200);
		table.getColumnModel().getColumn(1).setPreferredWidth(60);
		table.getColumnModel().getColumn(3).setPreferredWidth(60);
		table.getColumnModel().getColumn(4).setPreferredWidth(60);
		table.getColumnModel().getColumn(5).setPreferredWidth(90);
		
		
		
		String[] search= {"Search by code","Search by name"};
		
		JButton btnNewButton_1 = new JButton("Buy Item");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					Buy_TV btv=new Buy_TV(); btv.show(); dispose();
					
					
				
					
			}
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(100, 149, 237));
		btnNewButton_1.setBounds(442, 64, 149, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Customer_menu fm= new Customer_menu();
				fm.show(); dispose();
			}
		});
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(100, 149, 237));
		btnNewButton_2.setBounds(10, 65, 89, 23);
		contentPane.add(btnNewButton_2);
		
		search_field = new JTextField();
		search_field.setBounds(149, 66, 129, 20);
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
							TV s= new TV();
							s=ac.get(j);
							Object[] search_code_display= new Object[] {s.get_name(),s.get_price(),s.get_quantity(),s.get_rating(),s.get_code(),s.get_screen()};
							model.addRow(search_code_display); break;
						
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
								TV s= new TV();
								s=ac.get(j);
								Object[] search_code_display= new Object[] {s.get_name(),s.get_price(),s.get_quantity(),s.get_rating(),s.get_code(),s.get_screen()};
								model.addRow(search_code_display); continue;
							
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
		btnNewButton_3.setBounds(275, 65, 89, 23);
		contentPane.add(btnNewButton_3);
		code.setBackground(new Color(0, 0, 255));
		code.setForeground(new Color(255, 255, 255));
		code.setBounds(149, 98, 140, 14);
		contentPane.add(code);
		
		
		name.setForeground(Color.WHITE);
		name.setBackground(Color.BLUE);
		name.setBounds(149, 115, 187, 14);
		contentPane.add(name);
		
		JLabel lblNewLabel = new JLabel("TV SECTION");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(263, 23, 149, 23);
		contentPane.add(lblNewLabel);
		//JTableHeader header=
		
	    //table.getTableHeader();
	}
}


//class main{
//	
//public static void main(String[] args){
//	AC a= new AC("fdf",300,4,434,2);
//	
//}	
//	
//}





