package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

import com.model.RegisterModel;
import com.service.RegisterService;
import com.service.RegisterServiceImpl;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;

public class RegisterForm extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField fntextField;
	private JLabel lblNewLabel_1_1;
	private JTextField lntextField_1;
	private JLabel lblNewLabel_1_1_1;
	private JTextField UntextField;
	private JLabel lblNewLabel_1_1_1_1;
	private JTextField passtextField_1;
	private JLabel lblNewLabel_1_1_1_1_1_1;
	private JDateChooser dateChooser;
	private JLabel lblNewLabel_1_1_1_1_1_1_1;
	private JTextField addtextField;
	private JButton btnReset;
	private JButton btnRegister;
	private JButton btnLogin;
	private JLabel genderlb;
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnFemale;
	private JLabel lblNewLabel_1_1_1_2_1;
	private JTextField emailtextField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblNewLabel_1_1_1_2_1_1;
	private JTextField phtextField_1;
	private JLabel lblNewLabel_1_1_1_1_1_1_1_1;
	private JLabel lblNewLabel_1_1_1_1_1_1_1_1_1;
	private JComboBox comboBox_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_2_1;
	private JTextField Country_textField;
	private JButton btnClose;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterForm frame = new RegisterForm();
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
	public RegisterForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 736, 548);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getLabel_2());
		contentPane.add(getFntextField());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getLntextField_1());
		contentPane.add(getLblNewLabel_1_1_1());
		contentPane.add(getUntextField());
		contentPane.add(getLblNewLabel_1_1_1_1());
		contentPane.add(getPasstextField_1());
		contentPane.add(getLblNewLabel_1_1_1_1_1_1());
		contentPane.add(getDateChooser());
		contentPane.add(getLblNewLabel_1_1_1_1_1_1_1());
		contentPane.add(getAddtextField());
		contentPane.add(getBtnReset());
		contentPane.add(getBtnRegister());
		contentPane.add(getBtnLogin());
		contentPane.add(getGenderlb());
		contentPane.add(getRdbtnMale());
		contentPane.add(getRdbtnFemale());
		contentPane.add(getLblNewLabel_1_1_1_2_1());
		contentPane.add(getEmailtextField());
		contentPane.add(getLblNewLabel_1_1_1_2_1_1());
		contentPane.add(getPhtextField_1());
		contentPane.add(getLblNewLabel_1_1_1_1_1_1_1_1());
		contentPane.add(getLblNewLabel_1_1_1_1_1_1_1_1_1());
		contentPane.add(getComboBox_1());
		contentPane.add(getCountry_textField());
		contentPane.add(getBtnClose());
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(new Color(255, 140, 0));
			panel.setBounds(0, 0, 720, 71);
			panel.setLayout(null);
			panel.add(getLabel_1());
			panel.add(getLblNewLabel_2());
			panel.add(getLblNewLabel_2_1());
		}
		return panel;
	}
	private JLabel getLabel_1() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Registration ");
			lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
			lblNewLabel.setForeground(new Color(255, 255, 255));
			lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 22));
			lblNewLabel.setBounds(288, 17, 170, 29);
		}
		return lblNewLabel;
	}
	private JLabel getLabel_2() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("First Name: ");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_1.setBounds(48, 106, 79, 24);
		}
		return lblNewLabel_1;
	}
	private JTextField getFntextField() {
		if (fntextField == null) {
			fntextField = new JTextField();
			fntextField.setBounds(145, 102, 174, 32);
			fntextField.setColumns(10);
		}
		return fntextField;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Last Name: ");
			lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_1_1.setBounds(396, 107, 79, 24);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getLntextField_1() {
		if (lntextField_1 == null) {
			lntextField_1 = new JTextField();
			lntextField_1.setColumns(10);
			lntextField_1.setBounds(500, 104, 171, 31);
		}
		return lntextField_1;
	}
	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("User Name:");
			lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_1_1_1.setBounds(51, 161, 79, 24);
		}
		return lblNewLabel_1_1_1;
	}
	private JTextField getUntextField() {
		if (UntextField == null) {
			UntextField = new JTextField();
			UntextField.setColumns(10);
			UntextField.setBounds(145, 159, 173, 32);
		}
		return UntextField;
	}
	private JLabel getLblNewLabel_1_1_1_1() {
		if (lblNewLabel_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1 = new JLabel("Password:");
			lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_1_1_1_1.setBounds(402, 157, 79, 24);
		}
		return lblNewLabel_1_1_1_1;
	}
	private JTextField getPasstextField_1() {
		if (passtextField_1 == null) {
			passtextField_1 = new JTextField();
			passtextField_1.setColumns(10);
			passtextField_1.setBounds(500, 158, 173, 33);
		}
		return passtextField_1;
	}
	private JLabel getLblNewLabel_1_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1_1_1 = new JLabel("BirthDate:");
			lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_1_1_1_1_1_1.setBounds(400, 209, 79, 24);
		}
		return lblNewLabel_1_1_1_1_1_1;
	}
	private JDateChooser getDateChooser() {
		if (dateChooser == null) {
			dateChooser = new JDateChooser();
			dateChooser.setBounds(501, 205, 171, 29);
		}
		return dateChooser;
	}
	private JLabel getLblNewLabel_1_1_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Address:");
			lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_1_1_1_1_1_1_1.setBounds(63, 313, 79, 24);
		}
		return lblNewLabel_1_1_1_1_1_1_1;
	}
	private JTextField getAddtextField() {
		if (addtextField == null) {
			addtextField = new JTextField();
			addtextField.setColumns(10);
			addtextField.setBounds(145, 303, 171, 89);
		}
		return addtextField;
	}
	private JButton getBtnReset() {
		if (btnReset == null) {
			btnReset = new JButton("Reset");
			btnReset.setFont(new Font("Tahoma", Font.PLAIN, 12));
			btnReset.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					reset();
				}
			});
			btnReset.setBounds(235, 411, 89, 32);
		}
		return btnReset;
	}
	
	public void reset() {
		
		fntextField.setText("");
		lntextField_1.setText("");
		UntextField.setText("");
		passtextField_1.setText("");
		addtextField.setText("");
		phtextField_1.setText("");
		emailtextField.setText("");
		Country_textField.setText("");
	
	}
	private JButton getBtnRegister() {
		if (btnRegister == null) {
			btnRegister = new JButton("Register");
			btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 12));
			
			
			btnRegister.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					RegisterModel R = new RegisterModel();
					
					R.setFname(fntextField.getText());
					R.setLname(lntextField_1.getText());
					R.setUsername(UntextField.getText());
					R.setPassword(passtextField_1.getText());
					R.setCountry(Country_textField.getText());
					R.setEmail(emailtextField.getText());
					R.setPhone(phtextField_1.getText());
					R.setAddress(addtextField.getText());
					R.setDob(new Date(dateChooser.getDate().getTime()));
					if(rdbtnMale.isSelected()) {
						R.setGender("Male");
					
					}else {
						
						R.setGender("Female");
												
					}
					
					RegisterService RR = new RegisterServiceImpl();
					
					if (RR.addRegisterModel(R)) {
						
						JOptionPane.showMessageDialog(null, "Registered");
						return;
					}else {
						
						JOptionPane.showMessageDialog(null, "Registration Failed");
					}
					
					
						
						
					}
			});
			btnRegister.setBounds(335, 411, 89, 32);
		}
		return btnRegister;
	}
	private JButton getBtnLogin() {
		if (btnLogin == null) {
			btnLogin = new JButton("Click here to log in ");
			btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 12));
			 
			
			btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				new LoginForm().setVisible(true);
				dispose();
									}
			});
			btnLogin.setBounds(257, 461, 223, 32);
		}
		return btnLogin;
	}
	private JLabel getGenderlb() {
		if (genderlb == null) {
			genderlb = new JLabel("Gender: ");
			genderlb.setFont(new Font("Tahoma", Font.PLAIN, 14));
			genderlb.setBounds(72, 203, 79, 24);
		}
		return genderlb;
	}
	private JRadioButton getRdbtnMale() {
		if (rdbtnMale == null) {
			rdbtnMale = new JRadioButton("Male");
			buttonGroup.add(rdbtnMale);
			rdbtnMale.setBounds(147, 206, 52, 23);
		}
		return rdbtnMale;
	}
	private JRadioButton getRdbtnFemale() {
		if (rdbtnFemale == null) {
			rdbtnFemale = new JRadioButton("Female");
			buttonGroup.add(rdbtnFemale);
			rdbtnFemale.setBounds(218, 206, 89, 23);
		}
		return rdbtnFemale;
	}
	private JLabel getLblNewLabel_1_1_1_2_1() {
		if (lblNewLabel_1_1_1_2_1 == null) {
			lblNewLabel_1_1_1_2_1 = new JLabel("Email:");
			lblNewLabel_1_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_1_1_1_2_1.setBounds(81, 255, 61, 24);
		}
		return lblNewLabel_1_1_1_2_1;
	}
	private JTextField getEmailtextField() {
		if (emailtextField == null) {
			emailtextField = new JTextField();
			emailtextField.setColumns(10);
			emailtextField.setBounds(144, 252, 171, 32);
		}
		return emailtextField;
	}
	private JLabel getLblNewLabel_1_1_1_2_1_1() {
		if (lblNewLabel_1_1_1_2_1_1 == null) {
			lblNewLabel_1_1_1_2_1_1 = new JLabel("Phone:");
			lblNewLabel_1_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_1_1_1_2_1_1.setBounds(419, 258, 79, 24);
		}
		return lblNewLabel_1_1_1_2_1_1;
	}
	private JTextField getPhtextField_1() {
		if (phtextField_1 == null) {
			phtextField_1 = new JTextField();
			phtextField_1.setColumns(10);
			phtextField_1.setBounds(500, 254, 174, 34);
		}
		return phtextField_1;
	}
	private JLabel getLblNewLabel_1_1_1_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("Country:");
			lblNewLabel_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_1_1_1_1_1_1_1_1.setBounds(406, 308, 79, 24);
		}
		return lblNewLabel_1_1_1_1_1_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_1_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_1_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1_1_1_1_1_1 = new JLabel("State:");
			lblNewLabel_1_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_1_1_1_1_1_1_1_1_1.setBounds(428, 361, 79, 24);
		}
		return lblNewLabel_1_1_1_1_1_1_1_1_1;
	}
	private JComboBox getComboBox_1() {
		if (comboBox_1 == null) {
			comboBox_1 = new JComboBox();
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"------Select------", "State-1", "State-2", "State-3", "State-4", "State-5", "State-6", "State-7", ""}));
			comboBox_1.setBounds(504, 355, 169, 30);
		}
		return comboBox_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("x");
			lblNewLabel_2.setBounds(707, 0, 13, 14);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("-");
			lblNewLabel_2_1.setBounds(697, 0, 13, 14);
		}
		return lblNewLabel_2_1;
	}
	private JTextField getCountry_textField() {
		if (Country_textField == null) {
			Country_textField = new JTextField();
			Country_textField.setColumns(10);
			Country_textField.setBounds(502, 301, 173, 33);
		}
		return Country_textField;
	}
	private JButton getBtnClose() {
		if (btnClose == null) {
			btnClose = new JButton("Close");
			btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
			btnClose.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					dispose();
				}
			});
			btnClose.setBounds(435, 411, 89, 32);
		}
		return btnClose;
	}
}
