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
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.model.UpdateStockModel;
import com.service.UpdateStockService;
import com.service.UpdateStockServiceImpl;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class UpdateStockForm extends JFrame {
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField Pid_textField;
	private JLabel lblNewLabel_1_1;
	private JTextField Pn_textField_1;
	private JLabel lblNewLabel_1_1_1;
	private JTextField Qav_textField_2;
	private JLabel lblNewLabel_1_1_1_1;
	private JTextField Qadd_textField_3;
	private JLabel lblNewLabel_1_1_1_1_1;
	private JTextField MRP_textField_4;
	private JButton btnNewButton;
	private JButton btnUpdate;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnDelete;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateStockForm frame = new UpdateStockForm();
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
	public UpdateStockForm() {
		setBackground(new Color(240, 240, 240));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 999, 531);
		getContentPane().setLayout(null);
		getContentPane().add(getPanel());
		getContentPane().add(getScrollPane());
		displayData();
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(new Color(255, 140, 0));
			panel.setBounds(0, 0, 352, 498);
			panel.setLayout(null);
			panel.add(getLblNewLabel());
			panel.add(getLblNewLabel_1());
			panel.add(getPid_textField());
			panel.add(getLblNewLabel_1_1());
			panel.add(getPn_textField_1());
			panel.add(getLblNewLabel_1_1_1());
			panel.add(getQav_textField_2());
			panel.add(getLblNewLabel_1_1_1_1());
			panel.add(getQadd_textField_3());
			panel.add(getLblNewLabel_1_1_1_1_1());
			panel.add(getMRP_textField_4());
			panel.add(getBtnNewButton());
			panel.add(getBtnUpdate());
			panel.add(getBtnDelete());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Update Stock ");
			lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 18));
			lblNewLabel.setBounds(175, 32, 141, 30);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("ProductId:");
			lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 13));
			lblNewLabel_1.setBounds(59, 83, 76, 30);
		}
		return lblNewLabel_1;
	}
	private JTextField getPid_textField() {
		if (Pid_textField == null) {
			Pid_textField = new JTextField();
			Pid_textField.setBounds(159, 87, 181, 27);
			Pid_textField.setColumns(10);
		}
		return Pid_textField;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("ProductName:");
			lblNewLabel_1_1.setFont(new Font("Verdana", Font.BOLD, 13));
			lblNewLabel_1_1.setBounds(28, 135, 108, 30);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getPn_textField_1() {
		if (Pn_textField_1 == null) {
			Pn_textField_1 = new JTextField();
			Pn_textField_1.setColumns(10);
			Pn_textField_1.setBounds(159, 142, 181, 27);
		}
		return Pn_textField_1;
	}
	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("QuantityAvailable:");
			lblNewLabel_1_1_1.setFont(new Font("Verdana", Font.BOLD, 13));
			lblNewLabel_1_1_1.setBounds(10, 197, 137, 30);
		}
		return lblNewLabel_1_1_1;
	}
	private JTextField getQav_textField_2() {
		if (Qav_textField_2 == null) {
			Qav_textField_2 = new JTextField();
			Qav_textField_2.setColumns(10);
			Qav_textField_2.setBounds(159, 201, 181, 27);
		}
		return Qav_textField_2;
	}
	private JLabel getLblNewLabel_1_1_1_1() {
		if (lblNewLabel_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1 = new JLabel("QuantityAdded:");
			lblNewLabel_1_1_1_1.setFont(new Font("Verdana", Font.BOLD, 13));
			lblNewLabel_1_1_1_1.setBounds(21, 259, 126, 30);
		}
		return lblNewLabel_1_1_1_1;
	}
	private JTextField getQadd_textField_3() {
		if (Qadd_textField_3 == null) {
			Qadd_textField_3 = new JTextField();
			Qadd_textField_3.setColumns(10);
			Qadd_textField_3.setBounds(159, 263, 181, 27);
		}
		return Qadd_textField_3;
	}
	private JLabel getLblNewLabel_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1_1 = new JLabel("MRP:");
			lblNewLabel_1_1_1_1_1.setFont(new Font("Verdana", Font.BOLD, 13));
			lblNewLabel_1_1_1_1_1.setBounds(99, 318, 65, 30);
		}
		return lblNewLabel_1_1_1_1_1;
	}
	private JTextField getMRP_textField_4() {
		if (MRP_textField_4 == null) {
			MRP_textField_4 = new JTextField();
			MRP_textField_4.setColumns(10);
			MRP_textField_4.setBounds(159, 322, 181, 27);
		}
		return MRP_textField_4;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Add");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					UpdateStockModel u = new UpdateStockModel();
					u.setProductName(Pn_textField_1.getText());
					u.setQuantityAdded(Qadd_textField_3.getText());
					u.setQuantityAvailable(Qav_textField_2.getText());
					u.setMRP(MRP_textField_4.getText());
				
					UpdateStockService uu = new UpdateStockServiceImpl(); 
					if(uu.addUpdateStockModel(u)) {
						JOptionPane.showMessageDialog(null,"added success");
						displayData();
					}else {
						JOptionPane.showMessageDialog(null,"added failed");
					}
					
				}
			});
			btnNewButton.setBounds(152, 398, 90, 39);
		}
		return btnNewButton;
	}
	private JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton("Edit");
			btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(table.getSelectedRow()<0) {
						JOptionPane.showMessageDialog(null, "select any row");
						return;
					}
					int row =table.getSelectedRow();
					int id = (int) table.getModel().getValueAt(row,0);
					
					UpdateStockEdit ee= new UpdateStockEdit();
					ee.setUpdateStockData(id);
					ee.setVisible(true);
					dispose();
										
								
							}
			});
			btnUpdate.setBounds(250, 398, 90, 39);
		}
		return btnUpdate;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(347, 0, 642, 498);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Id", "ProductName", "QuantityAvailable", "Mrp"
				}
			));
		}
		return table;
	}
	
	private void displayData() {
		
		UpdateStockService uu = new UpdateStockServiceImpl(); 
		  
		 List<UpdateStockModel>sList=uu.getAllUpdateStockModel(); 
		 
		 DefaultTableModel model=(DefaultTableModel) table.getModel();
		 model.setRowCount(0);
		 
		 for(UpdateStockModel U:sList) {
			 model.addRow(new Object[] {U.getId(),U.getProductName(),U.getQuantityAvailable(),U.getMRP()});
			 
			 
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
				int id = (int) table.getModel().getValueAt(row,0);
				
				UpdateStockService ss = new UpdateStockServiceImpl(); 
				if(ss.deleteUpdateStockModel(id)) {
					JOptionPane.showMessageDialog(null, "deleted success");
					displayData();
				}
				}
			});
			btnDelete.setBounds(52, 398, 90, 39);
		}
		return btnDelete;
	}
}
