package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Welcome extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lable;
	private JButton adminlogin;
	private JButton cashierlogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome frame = new Welcome();
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
	public Welcome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(SystemColor.menu);
			panel.setForeground(new Color(0, 0, 0));
			panel.setBounds(0, 0, 453, 314);
			panel.setLayout(null);
			panel.add(getLblNewLabel());
			panel.add(getLable());
			panel.add(getAdminlogin());
			panel.add(getCashierlogin());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Welcome to SuperMarket Billing System");
			lblNewLabel.setOpaque(true);
			lblNewLabel.setBackground(new Color(255, 140, 0));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setForeground(new Color(255, 255, 255));
			lblNewLabel.setAlignmentX(Component.RIGHT_ALIGNMENT);
			lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 19));
			lblNewLabel.setBounds(0, 0, 453, 80);
		}
		return lblNewLabel;
	}
	private JLabel getLable() {
		if (lable == null) {
			lable = new JLabel("");
			lable.setHorizontalAlignment(SwingConstants.CENTER);
			Image img = new ImageIcon(this.getClass().getResource("/Shoppingcart-01-icon.png")).getImage();
			lable.setIcon(new ImageIcon(img));
			lable.setBounds(8, 81, 254, 225);
			 ImageIcon icon = new ImageIcon("C:"
			 		+ "\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\InventoryBillingSystem\\img\\mall-shopping-cart.png");
		}
		return lable;
	}
	private JButton getAdminlogin() {
		if (adminlogin == null) {
			adminlogin = new JButton("Admin Login");
			adminlogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					new LoginForm().setVisible(true);
					dispose();
				}
			});
			adminlogin.setFont(new Font("Tahoma", Font.PLAIN, 12));
			adminlogin.setBounds(260, 144, 132, 34);
		}
		return adminlogin;
	}
	private JButton getCashierlogin() {
		if (cashierlogin == null) {
			cashierlogin = new JButton("Cashier Login");
			cashierlogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new RegisterForm().setVisible(true);
					dispose();

				}
			});
			cashierlogin.setFont(new Font("Tahoma", Font.PLAIN, 12));
			cashierlogin.setBounds(260, 203, 132, 34);
		}
		return cashierlogin;
	}
}
