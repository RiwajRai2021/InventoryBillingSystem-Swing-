package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.model.CashierModel;
import com.service.CashierService;
import com.service.CashierServiceImpl;

import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CashierForm extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JPanel panel_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField CId_textField;
	private JLabel lblNewLabel_2_1;
	private JTextField CNm_textField_1;
	private JLabel lblNewLabel_2_1_1;
	private JTextField CMob_textField_2;
	private JLabel lblNewLabel_2_1_1_1;
	private JTextField CAdd_textField_3;
	private JLabel lblNewLabel_2_1_1_1_1;
	private JTextField CEmail_textField_4;
	private JLabel lblNewLabel_2_1_1_1_1_1;
	private JTextField CPass_textField_5;
	private JButton btnNewButton;
	private JButton btnAdd;
	private JButton btnDelete;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnClear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CashierForm frame = new CashierForm();
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
	public CashierForm() {
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
		});
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1029, 556);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getPanel_1());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getScrollPane());
		displayData();
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(new Color(255, 140, 0));
			panel.setBounds(0, 0, 1013, 55);
			panel.setLayout(null);
			panel.add(getLblNewLabel());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Let's Shop");
			lblNewLabel.setForeground(new Color(255, 255, 255));
			lblNewLabel.setFont(new Font("Script MT Bold", Font.BOLD | Font.ITALIC, 25));
			lblNewLabel.setBounds(22, 0, 118, 55);
		}
		return lblNewLabel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBackground(new Color(255, 140, 0));
			panel_1.setBounds(0, 91, 309, 426);
			panel_1.setLayout(null);
			panel_1.add(getLblNewLabel_2());
			panel_1.add(getCId_textField());
			panel_1.add(getLblNewLabel_2_1());
			panel_1.add(getCNm_textField_1());
			panel_1.add(getLblNewLabel_2_1_1());
			panel_1.add(getCMob_textField_2());
			panel_1.add(getLblNewLabel_2_1_1_1());
			panel_1.add(getCAdd_textField_3());
			panel_1.add(getLblNewLabel_2_1_1_1_1());
			panel_1.add(getCEmail_textField_4());
			panel_1.add(getLblNewLabel_2_1_1_1_1_1());
			panel_1.add(getCPass_textField_5());
			panel_1.add(getBtnNewButton());
			panel_1.add(getBtnAdd());
			panel_1.add(getBtnDelete());
			panel_1.add(getBtnClear());
		}
		return panel_1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Cashier Details ");
			lblNewLabel_1.setForeground(new Color(255, 140, 0));
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 21));
			lblNewLabel_1.setBounds(123, 55, 186, 37);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Cashier ID:");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_2.setBounds(36, 27, 91, 22);
		}
		return lblNewLabel_2;
	}
	private JTextField getCId_textField() {
		if (CId_textField == null) {
			CId_textField = new JTextField();
			CId_textField.setBounds(116, 25, 179, 28);
			CId_textField.setColumns(10);
		}
		return CId_textField;
	}
	private JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("Cashier Name:");
			lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_2_1.setBounds(19, 71, 126, 22);
		}
		return lblNewLabel_2_1;
	}
	private JTextField getCNm_textField_1() {
		if (CNm_textField_1 == null) {
			CNm_textField_1 = new JTextField();
			CNm_textField_1.setColumns(10);
			CNm_textField_1.setBounds(116, 69, 179, 28);
		}
		return CNm_textField_1;
	}
	private JLabel getLblNewLabel_2_1_1() {
		if (lblNewLabel_2_1_1 == null) {
			lblNewLabel_2_1_1 = new JLabel("Mobile Number:");
			lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_2_1_1.setBounds(10, 128, 117, 22);
		}
		return lblNewLabel_2_1_1;
	}
	private JTextField getCMob_textField_2() {
		if (CMob_textField_2 == null) {
			CMob_textField_2 = new JTextField();
			CMob_textField_2.setColumns(10);
			CMob_textField_2.setBounds(116, 126, 179, 28);
		}
		return CMob_textField_2;
	}
	private JLabel getLblNewLabel_2_1_1_1() {
		if (lblNewLabel_2_1_1_1 == null) {
			lblNewLabel_2_1_1_1 = new JLabel("Address:");
			lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_2_1_1_1.setBounds(48, 179, 67, 22);
		}
		return lblNewLabel_2_1_1_1;
	}
	private JTextField getCAdd_textField_3() {
		if (CAdd_textField_3 == null) {
			CAdd_textField_3 = new JTextField();
			CAdd_textField_3.setColumns(10);
			CAdd_textField_3.setBounds(116, 177, 179, 28);
		}
		return CAdd_textField_3;
	}
	private JLabel getLblNewLabel_2_1_1_1_1() {
		if (lblNewLabel_2_1_1_1_1 == null) {
			lblNewLabel_2_1_1_1_1 = new JLabel("Email ID:");
			lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_2_1_1_1_1.setBounds(48, 229, 83, 22);
		}
		return lblNewLabel_2_1_1_1_1;
	}
	private JTextField getCEmail_textField_4() {
		if (CEmail_textField_4 == null) {
			CEmail_textField_4 = new JTextField();
			CEmail_textField_4.setColumns(10);
			CEmail_textField_4.setBounds(116, 227, 179, 28);
		}
		return CEmail_textField_4;
	}
	private JLabel getLblNewLabel_2_1_1_1_1_1() {
		if (lblNewLabel_2_1_1_1_1_1 == null) {
			lblNewLabel_2_1_1_1_1_1 = new JLabel("Password:");
			lblNewLabel_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_2_1_1_1_1_1.setBounds(40, 280, 89, 22);
		}
		return lblNewLabel_2_1_1_1_1_1;
	}
	private JTextField getCPass_textField_5() {
		if (CPass_textField_5 == null) {
			CPass_textField_5 = new JTextField();
			CPass_textField_5.setColumns(10);
			CPass_textField_5.setBounds(116, 278, 179, 28);
		}
		return CPass_textField_5;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Add");
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CashierModel cf = new CashierModel(); 
					cf.setName(CNm_textField_1.getText());
					cf.setMobileNumber(CMob_textField_2.getText());
					cf.setAddress(CAdd_textField_3.getText());
					cf.setEmail(CEmail_textField_4.getText());
					cf.setPassword(CPass_textField_5.getText());
					
					CashierService cs = new CashierServiceImpl(); 
					
					if(cs.addCashierModel(cf)) {
						JOptionPane.showMessageDialog(null, "added success");
						displayData();
						
					}else {
						JOptionPane.showMessageDialog(null, "added failed");
					}
				}
			});
			btnNewButton.setBounds(10, 348, 67, 28);
		}
		return btnNewButton;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("Edit");
			btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 9));
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if (table.getSelectedRow()<0) {
						JOptionPane.showMessageDialog(null,"select any row");
						return;	
					}
					int row = table.getSelectedRow();
					int id = (int) table.getModel().getValueAt(row, 0);
					
					CashierEditForm ef = new CashierEditForm();
					ef.setCashierData(id);
					ef.setVisible(true);
					dispose();
					
					
				}
			});
			btnAdd.setBounds(87, 348, 59, 28);
		}
		return btnAdd;
	}
	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton("Delete");
			btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 9));
			btnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if (table.getSelectedRow()<0) {
						JOptionPane.showMessageDialog(null,"select any row");
						return;	
					}
					int row = table.getSelectedRow();
					int id = (int) table.getModel().getValueAt(row, 0);
					
					CashierService cc = new CashierServiceImpl(); 
					if(cc.deleteCashierModel(id)) {
						JOptionPane.showMessageDialog(null,"deleted success");
						displayData();
					}
				}
			});
			btnDelete.setBounds(156, 348, 67, 29);
		}
		return btnDelete;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(307, 91, 706, 426);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setBackground(new Color(255, 255, 255));
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Id", "Name", "MobileNo.", "Address", "Email", "Password"
				}
			));
		}
		return table;
	}
	
	private void displayData() {
		
		CashierService cs = new CashierServiceImpl(); 
		List<CashierModel> sList =cs.getAllCashierModel();
		
		DefaultTableModel model=(DefaultTableModel) table.getModel();
		model.setRowCount(0);//rest table data
		
		for(CashierModel cf:sList) {
			model.addRow(new Object[] {cf.getId(),cf.getName(),cf.getMobileNumber(),cf.getAddress(),cf.getEmail(),cf.getPassword()});
			
			
		}
		 
		
	}
	private JButton getBtnClear() {
		if (btnClear == null) {
			btnClear = new JButton("Clear");
			btnClear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Clear();
									
				}
			});
			btnClear.setFont(new Font("Tahoma", Font.PLAIN, 9));
			btnClear.setBounds(233, 347, 67, 31);
		}
		return btnClear;
	}
	
	public void Clear() {
		
		CNm_textField_1.setText("");
			CMob_textField_2.setText("");
			CAdd_textField_3.setText("");
			CEmail_textField_4.setText("");
			CPass_textField_5.setText("");
			
		
		}
	

}
