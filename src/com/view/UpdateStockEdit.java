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

public class UpdateStockEdit extends JFrame {
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
	private JButton btnUpdate;
	private int sid=0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateStockEdit frame = new UpdateStockEdit();
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
	public UpdateStockEdit() {
		setBackground(new Color(240, 240, 240));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 447, 488);
		getContentPane().setLayout(null);
		getContentPane().add(getPanel());
	
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(new Color(255, 140, 0));
			panel.setBounds(0, 0, 431, 455);
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
			panel.add(getBtnUpdate());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Update Stock ");
			lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 18));
			lblNewLabel.setBounds(203, 26, 141, 30);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("ProductId:");
			lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 13));
			lblNewLabel_1.setBounds(83, 79, 76, 30);
		}
		return lblNewLabel_1;
	}
	private JTextField getPid_textField() {
		if (Pid_textField == null) {
			Pid_textField = new JTextField();
			Pid_textField.setBounds(185, 83, 181, 27);
			Pid_textField.setColumns(10);
		}
		return Pid_textField;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("ProductName:");
			lblNewLabel_1_1.setFont(new Font("Verdana", Font.BOLD, 13));
			lblNewLabel_1_1.setBounds(52, 134, 108, 30);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getPn_textField_1() {
		if (Pn_textField_1 == null) {
			Pn_textField_1 = new JTextField();
			Pn_textField_1.setColumns(10);
			Pn_textField_1.setBounds(185, 138, 181, 27);
		}
		return Pn_textField_1;
	}
	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("QuantityAvailable:");
			lblNewLabel_1_1_1.setFont(new Font("Verdana", Font.BOLD, 13));
			lblNewLabel_1_1_1.setBounds(21, 193, 137, 30);
		}
		return lblNewLabel_1_1_1;
	}
	private JTextField getQav_textField_2() {
		if (Qav_textField_2 == null) {
			Qav_textField_2 = new JTextField();
			Qav_textField_2.setColumns(10);
			Qav_textField_2.setBounds(185, 197, 181, 27);
		}
		return Qav_textField_2;
	}
	private JLabel getLblNewLabel_1_1_1_1() {
		if (lblNewLabel_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1 = new JLabel("QuantityAdded:");
			lblNewLabel_1_1_1_1.setFont(new Font("Verdana", Font.BOLD, 13));
			lblNewLabel_1_1_1_1.setBounds(38, 255, 126, 30);
		}
		return lblNewLabel_1_1_1_1;
	}
	private JTextField getQadd_textField_3() {
		if (Qadd_textField_3 == null) {
			Qadd_textField_3 = new JTextField();
			Qadd_textField_3.setColumns(10);
			Qadd_textField_3.setBounds(185, 259, 181, 27);
		}
		return Qadd_textField_3;
	}
	private JLabel getLblNewLabel_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1_1 = new JLabel("MRP:");
			lblNewLabel_1_1_1_1_1.setFont(new Font("Verdana", Font.BOLD, 13));
			lblNewLabel_1_1_1_1_1.setBounds(114, 315, 35, 30);
		}
		return lblNewLabel_1_1_1_1_1;
	}
	private JTextField getMRP_textField_4() {
		if (MRP_textField_4 == null) {
			MRP_textField_4 = new JTextField();
			MRP_textField_4.setColumns(10);
			MRP_textField_4.setBounds(185, 318, 181, 27);
		}
		return MRP_textField_4;
	}
	private JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton("Update");
			btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					UpdateStockModel u = new UpdateStockModel();
					
					u.setId(sid);
					u.setProductName(Pn_textField_1.getText());
					u.setQuantityAdded(Qadd_textField_3.getText());
					u.setQuantityAvailable(Qav_textField_2.getText()); 
					u.setMRP(MRP_textField_4.getText());
				
					UpdateStockService uu = new UpdateStockServiceImpl(); 
					if(uu.addUpdateStockModel(u)) {
						JOptionPane.showMessageDialog(null,"update success");
						new UpdateStockForm().setVisible(true);
						dispose();
						
					}else {
						JOptionPane.showMessageDialog(null,"update failed");
					}
					
				}
					
				
				
			});
			btnUpdate.setBounds(236, 378, 90, 39);
		}
		return btnUpdate;
	}
	
	public void setUpdateStockData(int id) {
		
		sid = id;
		
		UpdateStockService ee = new UpdateStockServiceImpl(); 
		UpdateStockModel e = ee.getAllUpdateStockModelById(id);
		
		Pn_textField_1.setText(e.getProductName());
		Qav_textField_2.setText(e.getQuantityAvailable());
		Qadd_textField_3.setText(e.getQuantityAdded());
		MRP_textField_4.setText(e.getMRP());
		
	}
	
}
