package com.company.billing.main;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.Font;

public class BillingScreen extends JFrame {

	private static final long serialVersionUID = 9215555796699495501L;
	
	private JPanel contentPane;
	JComboBox<String> comboBox = new JComboBox<>();

	public static void main(String[] args) {
		BillingScreen frame = new BillingScreen();
		frame.setVisible(true);
	}

	public BillingScreen() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		comboBox.setFont(new Font("Kokonor", Font.PLAIN, 16));
		comboBox.setBounds(150,25,200,30);
		contentPane.add(comboBox);
		fillCombo();
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				askForClose();
			}
		});
	}
	
	private void fillCombo() {
		comboBox.addItem("Select Item");
	}

	public void askForClose() {
		int choice = JOptionPane.showConfirmDialog(this, "Do you want to leave this window?", "Company Name", JOptionPane.YES_NO_OPTION);
		if(choice == JOptionPane.YES_OPTION) {
			this.dispose();
		}
	}
	
	
}
