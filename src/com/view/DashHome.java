package com.view;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Window.Type;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class DashHome extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_12_1;
	private JLabel lblNewLabel_12_1_1;
	private JLabel lblNewLabel_12_1_1_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashHome frame = new DashHome();
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
	public DashHome() {
		setResizable(false);
		setForeground(new Color(255, 140, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 40, 1374, 716);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getPanel_1());
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(new Color(255, 140, 0));
			panel.setForeground(Color.LIGHT_GRAY);
			panel.setBounds(0, 0, 1368, 56);
			panel.setLayout(null);
			panel.add(getLblNewLabel_1());
			panel.add(getLblNewLabel_1_1());
			panel.add(getLblNewLabel_4());
			panel.add(getLblNewLabel_6());
			panel.add(getLblNewLabel_10());
			panel.add(getLblNewLabel_12());
			panel.add(getLblNewLabel_12_1());
			panel.add(getLblNewLabel_12_1_1());
			panel.add(getLblNewLabel_12_1_1_1());
			panel.add(getLblNewLabel());
			panel.add(getLblNewLabel_2());
		}
		return panel; 
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBounds(0, 58, 1368, 552);
			panel_1.setLayout(null);
		}
		return panel_1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Cashier");
			lblNewLabel_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					CashierForm C = new CashierForm();
					C.setVisible(true);
				}
			});
			lblNewLabel_1.setForeground(Color.WHITE);
			lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 15));
			lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
			lblNewLabel_1.setBounds(229, 15, 69, 26);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Stock");
			lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					UpdateStockForm uu = new UpdateStockForm();
					uu.setVisible(true);
					
					
				}
			});
			lblNewLabel_1_1.setForeground(Color.WHITE);
			lblNewLabel_1_1.setFont(new Font("Verdana", Font.BOLD, 15));
			lblNewLabel_1_1.setBackground(Color.LIGHT_GRAY);
			lblNewLabel_1_1.setBounds(425, 15, 55, 26);
		}
		return lblNewLabel_1_1;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Product Info");
			lblNewLabel_4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					ProductInfo pp = new ProductInfo(); 
					pp.setVisible(true);
				}
			});
			lblNewLabel_4.setFont(new Font("Verdana", Font.BOLD, 15));
			lblNewLabel_4.setForeground(Color.WHITE);
			lblNewLabel_4.setBounds(624, 19, 109, 18);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("Billing ");
			lblNewLabel_6.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					
					
				}
				@Override
				public void mouseClicked(MouseEvent e) {
					NewBill nn =new NewBill();
					nn.setVisible(true);
				}
			});
			lblNewLabel_6.setForeground(Color.WHITE);
			lblNewLabel_6.setFont(new Font("Verdana", Font.BOLD, 15));
			lblNewLabel_6.setBounds(885, 19, 70, 18);
		}
		return lblNewLabel_6;
	}
	private JLabel getLblNewLabel_10() {
		if (lblNewLabel_10 == null) {
			lblNewLabel_10 = new JLabel("Exit");
			lblNewLabel_10.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new LoginForm().setVisible(true);
					dispose();
				}
			});
			lblNewLabel_10.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					
				}
			});
			lblNewLabel_10.setForeground(Color.WHITE);
			lblNewLabel_10.setFont(new Font("Verdana", Font.BOLD, 12));
			lblNewLabel_10.setBounds(1275, 16, 28, 26);
		}
		return lblNewLabel_10;
	}
	private JLabel getLblNewLabel_12() {
		if (lblNewLabel_12 == null) {
			lblNewLabel_12 = new JLabel("|");
			lblNewLabel_12.setForeground(new Color(255, 255, 255));
			lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_12.setBounds(308, 6, 15, 45);
		}
		return lblNewLabel_12;
	}
	private JLabel getLblNewLabel_12_1() {
		if (lblNewLabel_12_1 == null) {
			lblNewLabel_12_1 = new JLabel("|");
			lblNewLabel_12_1.setForeground(Color.WHITE);
			lblNewLabel_12_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_12_1.setBounds(490, 6, 15, 45);
		}
		return lblNewLabel_12_1;
	}
	private JLabel getLblNewLabel_12_1_1() {
		if (lblNewLabel_12_1_1 == null) {
			lblNewLabel_12_1_1 = new JLabel("|");
			lblNewLabel_12_1_1.setForeground(new Color(255, 255, 255));
			lblNewLabel_12_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_12_1_1.setBounds(743, 6, 15, 45);
		}
		return lblNewLabel_12_1_1;
	}
	private JLabel getLblNewLabel_12_1_1_1() {
		if (lblNewLabel_12_1_1_1 == null) {
			lblNewLabel_12_1_1_1 = new JLabel("|");
			lblNewLabel_12_1_1_1.setForeground(Color.WHITE);
			lblNewLabel_12_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_12_1_1_1.setBounds(951, 6, 15, 45);
		}
		return lblNewLabel_12_1_1_1;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Let's Shop");
			lblNewLabel.setForeground(new Color(255, 255, 255));
			lblNewLabel.setFont(new Font("Script MT Bold", Font.BOLD | Font.ITALIC, 22));
			lblNewLabel.setBounds(33, 1, 99, 52);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Let's Shop");
			lblNewLabel_2.setForeground(Color.WHITE);
			lblNewLabel_2.setFont(new Font("Script MT Bold", Font.BOLD | Font.ITALIC, 22));
			lblNewLabel_2.setBounds(1068, 0, 99, 52);
		}
		return lblNewLabel_2;
	}
	}
