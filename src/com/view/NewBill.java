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
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class NewBill extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField BillNo_textField;
	private JLabel lblCustomerName;
	private JLabel lblProductName;
	private JLabel lblMrp;
	private JLabel lblQuantity;
	private JLabel lblDiscount;
	private JButton btnNewButton;
	private JButton btnAdd;
	private JLabel lblNewLabel_1;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JTextField textField_7;
	private JTable table;
	private JLabel lblNewLabel_2;
	private JTextField BName_textField_1;
	private JTextField PName_textField_3;
	private JTextField MRP_textField_4;
	private JTextField Qu_textField_5;
	private JTextField Dis_textField_8;
	private JDateChooser dateChooser;
	private JTextField Pro_Price_textField;
	private JLabel lblProductPrice;
	private JButton btnDelete;
	private JTextPane SearchPane;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewBill frame = new NewBill();
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
	public NewBill() {
		setBackground(new Color(240, 240, 240));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1029, 556);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 140, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getBillNo_textField());
		contentPane.add(getLblCustomerName());
		contentPane.add(getLblProductName());
		contentPane.add(getLblMrp());
		contentPane.add(getLblQuantity());
		contentPane.add(getLblDiscount());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnAdd());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getScrollPane());
		contentPane.add(getScrollPane_1());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getTextField_7());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getBName_textField_1());
		contentPane.add(getPName_textField_3());
		contentPane.add(getMRP_textField_4());
		contentPane.add(getQu_textField_5());
		contentPane.add(getDis_textField_8());
		contentPane.add(getDateChooser());
		contentPane.add(getPro_Price_textField());
		contentPane.add(getLblProductPrice());
		contentPane.add(getBtnDelete());
		contentPane.add(getSearchPane());
		contentPane.add(getLblNewLabel_3());
		displayData();
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Bill No:");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel.setBounds(85, 58, 55, 27);
		}
		return lblNewLabel;
	}
	private JTextField getBillNo_textField() {
		if (BillNo_textField == null) {
			BillNo_textField = new JTextField();
			BillNo_textField.setBounds(148, 57, 203, 29);
			BillNo_textField.setColumns(10);
		}
		return BillNo_textField;
	}
	private JLabel getLblCustomerName() {
		if (lblCustomerName == null) {
			lblCustomerName = new JLabel("Customer Name:");
			lblCustomerName.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblCustomerName.setBounds(27, 111, 123, 27);
		}
		return lblCustomerName;
	}
	private JLabel getLblProductName() {
		if (lblProductName == null) {
			lblProductName = new JLabel("Product Name:");
			lblProductName.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblProductName.setBounds(44, 168, 118, 27);
		}
		return lblProductName;
	}
	private JLabel getLblMrp() {
		if (lblMrp == null) {
			lblMrp = new JLabel("MRP:");
			lblMrp.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblMrp.setBounds(105, 286, 45, 27);
		}
		return lblMrp;
	}
	private JLabel getLblQuantity() {
		if (lblQuantity == null) {
			lblQuantity = new JLabel("Quantity:");
			lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblQuantity.setBounds(78, 343, 72, 27);
		}
		return lblQuantity;
	}
	private JLabel getLblDiscount() {
		if (lblDiscount == null) {
			lblDiscount = new JLabel("Discount:");
			lblDiscount.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblDiscount.setBounds(71, 397, 79, 27);
		}
		return lblDiscount;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Edit");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(table.getSelectedRow()<0) {
						JOptionPane.showMessageDialog(null,"select any row");
						return;
					}
					
					int row =table.getSelectedRow(); 
					int id = (int)table.getModel().getValueAt(row, 0);
					
					EditNewBill eb = new EditNewBill();
					eb.setNewBillData(id);
					eb.setVisible(true);
					dispose();
				}
			});
			btnNewButton.setBounds(247, 460, 89, 36);
		}
		return btnNewButton;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("Add");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					NewBillModel n = new NewBillModel();
					
					n.setBillNo(BillNo_textField.getText());
					n.setCustomerName(BName_textField_1.getText());
					n.setDate(new Date(dateChooser.getDate().getTime()));
					n.setProductName(PName_textField_3.getText());
					n.setDiscount(Dis_textField_8.getText());
					n.setQuantity(Qu_textField_5.getText());
					n.setMRP(MRP_textField_4.getText());
					n.setProductPrice(Pro_Price_textField.getText());
					
					NewBillService nb = new NewBillServiceImpl();
					
					if(nb.addNewBillModel(n)) {
						JOptionPane.showMessageDialog(null,"added success");
						displayData();
					}else {
						JOptionPane.showMessageDialog(null, "added failed"); 
					}
					
					
					
				}
			});
			
			btnAdd.setBounds(148, 461, 89, 35);
		}
		return btnAdd;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Date:");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNewLabel_1.setBounds(804, 11, 40, 27);
		}
		return lblNewLabel_1;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(359, 58, 644, 403);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(223, 11, 2, 2);
		}
		return scrollPane_1;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Print");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					try {
						table.print();
					} catch (PrinterException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			btnNewButton_1.setBounds(621, 465, 89, 31);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("Total");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton_2.setBounds(740, 465, 89, 30);
		}
		return btnNewButton_2;
	}
	private JTextField getTextField_7() {
		if (textField_7 == null) {
			textField_7 = new JTextField();
			textField_7.setBounds(849, 466, 154, 29);
			textField_7.setColumns(10);
		}
		return textField_7;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						
					"CustomerName", "ProductName", "Quantity", "MRP"
				}
			));
		}
		return table;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("New Bill");
			lblNewLabel_2.setForeground(Color.WHITE);
			lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 24));
			lblNewLabel_2.setBounds(182, 11, 118, 36);
		}
		return lblNewLabel_2;
	}
	private JTextField getBName_textField_1() {
		if (BName_textField_1 == null) {
			BName_textField_1 = new JTextField();
			BName_textField_1.setColumns(10);
			BName_textField_1.setBounds(148, 111, 203, 29);
		}
		return BName_textField_1;
	}
	private JTextField getPName_textField_3() {
		if (PName_textField_3 == null) {
			PName_textField_3 = new JTextField();
			PName_textField_3.setColumns(10);
			PName_textField_3.setBounds(148, 168, 203, 29);
		}
		return PName_textField_3;
	}
	private JTextField getMRP_textField_4() {
		if (MRP_textField_4 == null) {
			MRP_textField_4 = new JTextField();
			MRP_textField_4.setColumns(10);
			MRP_textField_4.setBounds(148, 286, 203, 29);
		}
		return MRP_textField_4;
	}
	private JTextField getQu_textField_5() {
		if (Qu_textField_5 == null) {
			Qu_textField_5 = new JTextField();
			Qu_textField_5.setColumns(10);
			Qu_textField_5.setBounds(148, 343, 203, 29);
		}
		return Qu_textField_5;
	}
	private JTextField getDis_textField_8() {
		if (Dis_textField_8 == null) {
			Dis_textField_8 = new JTextField();
			Dis_textField_8.setColumns(10);
			Dis_textField_8.setBounds(148, 397, 203, 29);
		}
		return Dis_textField_8;
	}
	private JDateChooser getDateChooser() {
		if (dateChooser == null) {
			dateChooser = new JDateChooser();
			dateChooser.setBounds(849, 11, 154, 27);
		}
		return dateChooser;
	}
	private JTextField getPro_Price_textField() {
		if (Pro_Price_textField == null) {
			Pro_Price_textField = new JTextField();
			Pro_Price_textField.setColumns(10);
			Pro_Price_textField.setBounds(148, 226, 203, 29);
		}
		return Pro_Price_textField;
	}
	private JLabel getLblProductPrice() {
		if (lblProductPrice == null) {
			lblProductPrice = new JLabel("Product Price:");
			lblProductPrice.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblProductPrice.setBounds(44, 226, 118, 27);
		}
		return lblProductPrice;
	}
	
	private void displayData() {
		
		NewBillService nn = new NewBillServiceImpl(); 
		List<NewBillModel> sList=nn.getAllNewBillModel();
		
		DefaultTableModel model=(DefaultTableModel) table.getModel(); 
		model.setRowCount(0);
		
		for(NewBillModel n:sList) {
			model.addRow(new Object[] {n.getCustomerName(),n.getProductName(),n.getQuantity(),n.getMRP()});
			
		}
		
	}
	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton("Delete");
			btnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(table.getSelectedRow()<0) {
						JOptionPane.showMessageDialog(null, "select any row");
						return;
						}
					int row =table.getSelectedRow();
					int id = (int)table.getModel().getValueAt(row, 0);
					
					NewBillService ss = new NewBillServiceImpl(); 
					if(ss.deleteNewBillModel(id)) {
						JOptionPane.showMessageDialog(null, "deleted success");
						displayData();
						 						
					}
				}
			});
			btnDelete.setBounds(44, 460, 89, 35);
		}
		return btnDelete;
	}
	private JTextPane getSearchPane() {
		if (SearchPane == null) {
			SearchPane = new JTextPane();
			SearchPane.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {

					String data = SearchPane.getText().trim();
					NewBillService nn = new NewBillServiceImpl();
					List<NewBillModel>nList=nn.searchNewBillModel(data);
					
					DefaultTableModel model=(DefaultTableModel) table.getModel(); 
					model.setRowCount(0);
					
					for(NewBillModel n:nList) {
						model.addRow(new Object[] {n.getCustomerName(),n.getProductName(),n.getQuantity(),n.getMRP()});
						
					}
				}
			
					
			});
			SearchPane.setBounds(592, 11, 175, 27);
		}
		return SearchPane;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Search:");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNewLabel_3.setBounds(537, 14, 45, 20);
		}
		return lblNewLabel_3;
	}
} 
