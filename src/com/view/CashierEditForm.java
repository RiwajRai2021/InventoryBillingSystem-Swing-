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

public class CashierEditForm extends JFrame {

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
	private int sid=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CashierEditForm frame = new CashierEditForm();
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
	public CashierEditForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 498, 542);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getPanel_1());
		contentPane.add(getLblNewLabel_1());
		
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(new Color(255, 140, 0));
			panel.setBounds(0, 0, 482, 55);
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
			panel_1.setBounds(0, 91, 482, 420);
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
		}
		return panel_1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Edit Form ");
			lblNewLabel_1.setForeground(new Color(255, 140, 0));
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 23));
			lblNewLabel_1.setBounds(225, 62, 138, 26);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Cashier ID:");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNewLabel_2.setBounds(69, 22, 91, 22);
		}
		return lblNewLabel_2;
	}
	private JTextField getCId_textField() {
		if (CId_textField == null) {
			CId_textField = new JTextField();
			CId_textField.setBounds(181, 16, 217, 28);
			CId_textField.setColumns(10);
		}
		return CId_textField;
	}
	private JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("Cashier Name:");
			lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNewLabel_2_1.setBounds(42, 78, 126, 22);
		}
		return lblNewLabel_2_1;
	}
	private JTextField getCNm_textField_1() {
		if (CNm_textField_1 == null) {
			CNm_textField_1 = new JTextField();
			CNm_textField_1.setColumns(10);
			CNm_textField_1.setBounds(181, 71, 217, 28);
		}
		return CNm_textField_1;
	}
	private JLabel getLblNewLabel_2_1_1() {
		if (lblNewLabel_2_1_1 == null) {
			lblNewLabel_2_1_1 = new JLabel("Mobile Number:");
			lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNewLabel_2_1_1.setBounds(33, 137, 141, 22);
		}
		return lblNewLabel_2_1_1;
	}
	private JTextField getCMob_textField_2() {
		if (CMob_textField_2 == null) {
			CMob_textField_2 = new JTextField();
			CMob_textField_2.setColumns(10);
			CMob_textField_2.setBounds(182, 133, 217, 28);
		}
		return CMob_textField_2;
	}
	private JLabel getLblNewLabel_2_1_1_1() {
		if (lblNewLabel_2_1_1_1 == null) {
			lblNewLabel_2_1_1_1 = new JLabel("Address:");
			lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNewLabel_2_1_1_1.setBounds(83, 200, 83, 22);
		}
		return lblNewLabel_2_1_1_1;
	}
	private JTextField getCAdd_textField_3() {
		if (CAdd_textField_3 == null) {
			CAdd_textField_3 = new JTextField();
			CAdd_textField_3.setColumns(10);
			CAdd_textField_3.setBounds(183, 194, 217, 28);
		}
		return CAdd_textField_3;
	}
	private JLabel getLblNewLabel_2_1_1_1_1() {
		if (lblNewLabel_2_1_1_1_1 == null) {
			lblNewLabel_2_1_1_1_1 = new JLabel("Email ID:");
			lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNewLabel_2_1_1_1_1.setBounds(88, 260, 83, 22);
		}
		return lblNewLabel_2_1_1_1_1;
	}
	private JTextField getCEmail_textField_4() {
		if (CEmail_textField_4 == null) {
			CEmail_textField_4 = new JTextField();
			CEmail_textField_4.setColumns(10);
			CEmail_textField_4.setBounds(184, 258, 217, 28);
		}
		return CEmail_textField_4;
	}
	private JLabel getLblNewLabel_2_1_1_1_1_1() {
		if (lblNewLabel_2_1_1_1_1_1 == null) {
			lblNewLabel_2_1_1_1_1_1 = new JLabel("Password:");
			lblNewLabel_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNewLabel_2_1_1_1_1_1.setBounds(80, 323, 89, 22);
		}
		return lblNewLabel_2_1_1_1_1_1;
	}
	private JTextField getCPass_textField_5() {
		if (CPass_textField_5 == null) {
			CPass_textField_5 = new JTextField();
			CPass_textField_5.setColumns(10);
			CPass_textField_5.setBounds(185, 320, 213, 28);
		}
		return CPass_textField_5;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Update");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					CashierModel cf = new CashierModel(); 
					cf.setId(sid);
					cf.setName(CNm_textField_1.getText());
					cf.setMobileNumber(CMob_textField_2.getText());
					cf.setAddress(CAdd_textField_3.getText());
					cf.setEmail(CEmail_textField_4.getText());
					cf.setPassword(CPass_textField_5.getText());
					
					CashierService cs = new CashierServiceImpl(); 
					
					if(cs.updateDetails(cf)) {
						JOptionPane.showMessageDialog(null, "update success");
						 new CashierForm().setVisible(true);
						 dispose();
					}else {
						JOptionPane.showMessageDialog(null, "update failed");
					}
				}
			});
			btnNewButton.setBounds(244, 366, 110, 38);
		}
		return btnNewButton;
	}
	
	public void setCashierData(int id) {
		
		sid =id;
		
		CashierService cs = new CashierServiceImpl();
		CashierModel s=cs.getAllCashierModelById(id);
		
		CNm_textField_1.setText(s.getName());
		CMob_textField_2.setText(s.getMobileNumber());
		CAdd_textField_3.setText(s.getAddress());
		CEmail_textField_4.setText(s.getEmail());
		CPass_textField_5.setText(s.getPassword());
		
		
	}
	
	}
