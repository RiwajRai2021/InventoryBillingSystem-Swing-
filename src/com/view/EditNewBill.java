package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.model.NewBillModel;
import com.service.NewBillServiceImpl;
import com.toedter.calendar.JDateChooser;
import com.service.NewBillService;
import java.awt.Color;

public class EditNewBill extends JFrame {

	private JPanel contentPane;
	private JLabel lblCustomerName;
	private JLabel lblProductName;
	private JLabel lblMrp;
	private JLabel lblQuantity;
	private JButton btnNewButton;
	private JScrollPane scrollPane_1;
	private JLabel lblNewLabel_2;
	private JTextField BName_textField_1;
	private JTextField PName_textField_3;
	private JTextField MRP_textField_4;
	private JTextField Qu_textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditNewBill frame = new EditNewBill();
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
	public EditNewBill() {
		setBackground(new Color(240, 240, 240));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 408);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 140, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblCustomerName());
		contentPane.add(getLblProductName());
		contentPane.add(getLblMrp());
		contentPane.add(getLblQuantity());
		contentPane.add(getBtnNewButton());
		contentPane.add(getScrollPane_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getBName_textField_1());
		contentPane.add(getPName_textField_3());
		contentPane.add(getMRP_textField_4());
		contentPane.add(getQu_textField_5());
		
	}
	private JLabel getLblCustomerName() {
		if (lblCustomerName == null) {
			lblCustomerName = new JLabel("Customer Name:");
			lblCustomerName.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblCustomerName.setBounds(27, 78, 123, 27);
		}
		return lblCustomerName;
	}
	private JLabel getLblProductName() {
		if (lblProductName == null) {
			lblProductName = new JLabel("Product Name:");
			lblProductName.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblProductName.setBounds(35, 132, 118, 27);
		}
		return lblProductName;
	}
	private JLabel getLblMrp() {
		if (lblMrp == null) {
			lblMrp = new JLabel("MRP:");
			lblMrp.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblMrp.setBounds(107, 197, 45, 27);
		}
		return lblMrp;
	}
	private JLabel getLblQuantity() {
		if (lblQuantity == null) {
			lblQuantity = new JLabel("Quantity:");
			lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblQuantity.setBounds(81, 259, 72, 27);
		}
		return lblQuantity;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Update");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
				}
			});
			btnNewButton.setBounds(223, 315, 89, 36);
		}
		return btnNewButton;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(223, 11, 2, 2);
		}
		return scrollPane_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("New Bill");
			lblNewLabel_2.setForeground(Color.WHITE);
			lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 24));
			lblNewLabel_2.setBounds(206, 21, 118, 36);
		}
		return lblNewLabel_2;
	}
	private JTextField getBName_textField_1() {
		if (BName_textField_1 == null) {
			BName_textField_1 = new JTextField();
			BName_textField_1.setColumns(10);
			BName_textField_1.setBounds(172, 79, 203, 29);
		}
		return BName_textField_1;
	}
	private JTextField getPName_textField_3() {
		if (PName_textField_3 == null) {
			PName_textField_3 = new JTextField();
			PName_textField_3.setColumns(10);
			PName_textField_3.setBounds(172, 133, 203, 29);
		}
		return PName_textField_3;
	}
	private JTextField getMRP_textField_4() {
		if (MRP_textField_4 == null) {
			MRP_textField_4 = new JTextField();
			MRP_textField_4.setColumns(10);
			MRP_textField_4.setBounds(172, 198, 203, 29);
		}
		return MRP_textField_4;
	}
	private JTextField getQu_textField_5() {
		if (Qu_textField_5 == null) {
			Qu_textField_5 = new JTextField();
			Qu_textField_5.setColumns(10);
			Qu_textField_5.setBounds(172, 260, 203, 29);
		}
		return Qu_textField_5;
	}
	
	public void setNewBillData(int id) {
		
		NewBillService nn = new NewBillServiceImpl(); 
		NewBillModel N = nn.getAllNewBillModelById(id);
				
		BName_textField_1.setText(N.getCustomerName());
		PName_textField_3.setText(N.getProductName());
		MRP_textField_4.setText(N.getMRP());
		Qu_textField_5.setText(N.getQuantity());
		
	}
	
	
} 
