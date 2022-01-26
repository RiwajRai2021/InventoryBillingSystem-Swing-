package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.service.RegisterService;
import com.service.RegisterServiceImpl;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JPanel loginpanel;
	private JLabel lblNewLabel;
	private JPanel loginpanel1;
	private JLabel username;
	private JTextField PasswordTextField;
	private JLabel username_1;
	private JTextField UserName_textField;
	private JButton LogInBtn;
	private JButton CancelBtn;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
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
	public LoginForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLoginpanel());
		contentPane.add(getLoginpanel1());
	}
	private JPanel getLoginpanel() {
		if (loginpanel == null) {
			loginpanel = new JPanel();
			loginpanel.setBackground(new Color(255, 140, 0));
			loginpanel.setForeground(Color.ORANGE);
			loginpanel.setBounds(0, 0, 435, 64);
			loginpanel.setLayout(null);
			loginpanel.add(getLblNewLabel());
			loginpanel.add(getLblNewLabel_1());
			loginpanel.add(getLblNewLabel_2());
		}
		return loginpanel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Login Form");
			lblNewLabel.setForeground(new Color(255, 255, 255));
			lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 22));
			lblNewLabel.setBounds(10, 11, 181, 45);
		}
		return lblNewLabel;
	}
	private JPanel getLoginpanel1() {
		if (loginpanel1 == null) {
			loginpanel1 = new JPanel();
			loginpanel1.setBackground(SystemColor.menu);
			loginpanel1.setBounds(0, 61, 435, 264);
			loginpanel1.setLayout(null);
			loginpanel1.add(getUsername());
			loginpanel1.add(getPasswordTextField());
			loginpanel1.add(getUsername_1());
			loginpanel1.add(getUserName_textField());
			loginpanel1.add(getLogInBtn());
			loginpanel1.add(getCancelBtn());
			loginpanel1.add(getBtnNewButton());
		}
		return loginpanel1;
	}
	private JLabel getUsername() {
		if (username == null) {
			username = new JLabel("Password:");
			username.setForeground(new Color(0, 0, 0));
			username.setFont(new Font("Verdana", Font.PLAIN, 16));
			username.setBounds(55, 103, 115, 29);
		}
		return username;
	}
	private JTextField getPasswordTextField() {
		if (PasswordTextField == null) {
			PasswordTextField = new JTextField();
			PasswordTextField.setBounds(165, 105, 188, 29);
			PasswordTextField.setColumns(10);
		}
		return PasswordTextField;
	}
	private JLabel getUsername_1() {
		if (username_1 == null) {
			username_1 = new JLabel("Username:");
			username_1.setForeground(Color.BLACK);
			username_1.setFont(new Font("Verdana", Font.PLAIN, 16));
			username_1.setBounds(55, 51, 115, 29);
		}
		return username_1;
	}
	private JTextField getUserName_textField() {
		if (UserName_textField == null) {
			UserName_textField = new JTextField();
			UserName_textField.setColumns(10);
			UserName_textField.setBounds(165, 55, 188, 29);
		}
		return UserName_textField;
	}
	private JButton getLogInBtn() {
		if (LogInBtn == null) {
			LogInBtn = new JButton("Login");
			LogInBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					
					
					//validation
				if(UserName_textField.getText().isEmpty()) {
					
					JOptionPane.showMessageDialog(UserName_textField, "Enter Your Username");
					return; 
					
				}
				
				if(PasswordTextField.getText().isEmpty()) {
					
					JOptionPane.showMessageDialog(PasswordTextField, "Enter Your Password");
				
					return;
				}
				
				String un = UserName_textField.getText();
				String pass = PasswordTextField.getText();
				
				RegisterService rs  = new RegisterServiceImpl();
				if(rs.login(un, pass)) {
					JOptionPane.showMessageDialog(null, "login success");
					new DashHome().setVisible(true);
					
					}else {
					JOptionPane.showMessageDialog(null, "login failed");
				}
				
							
						
				}
			});
			LogInBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
			LogInBtn.setBounds(264, 157, 89, 25);
		}
		return LogInBtn;
	}
	private JButton getCancelBtn() {
		if (CancelBtn == null) {
			CancelBtn = new JButton("Cancel");
			CancelBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
				reset();
				}
			});
			CancelBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
			CancelBtn.setBounds(165, 157, 89, 25);
		}
		return CancelBtn;
	}
	
	public void reset() {
	
		UserName_textField.setText("");
		PasswordTextField.setText("");
		}
	
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("click here to register ");
			btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new RegisterForm().setVisible(true);
				dispose();
					
					
				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
			btnNewButton.setBounds(165, 203, 188, 25);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("X");
			lblNewLabel_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Welcome().setVisible(true);
				}
			});
			lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 13));
			lblNewLabel_1.setBounds(406, 0, 29, 29);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("-");
			lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 18));
			lblNewLabel_2.setBounds(389, -1, 20, 27);
		}
		return lblNewLabel_2;
	}
}
