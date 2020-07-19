package com.company.billing.user;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Register extends JFrame {

	private static final long serialVersionUID = -8756556934627010744L;
	private JPanel contentPane;
	private JTextField nameBox;
	private JTextField emailBox;
	private JPasswordField passwordBox;

	public static void main(String[] args) {
		Register frame = new Register();
		frame.setVisible(true);
		frame.requestFocusInWindow();
	}
	
	public Register() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		contentPane.setBackground(Color.BLACK);
		setContentPane(contentPane);
		
		JLabel lblLogin = new JLabel("Register");
		lblLogin.setForeground(Color.CYAN);
		lblLogin.setFont(new Font("Kokonor", Font.PLAIN, 25));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBounds(175, 6, 100, 32);
		contentPane.add(lblLogin);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Kokonor", Font.PLAIN, 20));
		lblName.setForeground(Color.CYAN);
		lblName.setBounds(50, 75, 100, 25);
		contentPane.add(lblName);
		
		nameBox = new JTextField("Enter Name here");
		nameBox.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		nameBox.setBounds(150, 70, 250, 26);
		nameBox.setForeground(Color.GRAY);
		contentPane.add(nameBox);
		nameBox.setColumns(10);
		nameBox.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				if(nameBox.getText().equals("Enter EmailID here")) {
					nameBox.setText("");
					nameBox.setForeground(Color.BLACK);
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if(nameBox.getText().equals("")) {
					nameBox.setText("Enter Name here");
					nameBox.setForeground(Color.GRAY);
				}
			}
			
		});

		
		JLabel lblEmailID = new JLabel("Email ID");
		lblEmailID.setFont(new Font("Kokonor", Font.PLAIN, 20));
		lblEmailID.setForeground(Color.CYAN);
		lblEmailID.setBounds(50, 125, 100, 25);
		contentPane.add(lblEmailID);
		
		emailBox = new JTextField("Enter EmailID here");
		emailBox.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		emailBox.setBounds(150, 120, 250, 26);
		emailBox.setForeground(Color.GRAY);
		contentPane.add(emailBox);
		emailBox.setColumns(10);
		emailBox.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				if(emailBox.getText().equals("Enter EmailID here")) {
					emailBox.setText("");
					emailBox.setForeground(Color.BLACK);
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if(emailBox.getText().equals("")) {
					emailBox.setText("Enter EmailID here");
					emailBox.setForeground(Color.GRAY);
				}
			}
			
		});
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.CYAN);
		lblPassword.setFont(new Font("Kokonor", Font.PLAIN, 20));
		lblPassword.setBounds(50, 175, 100, 25);
		contentPane.add(lblPassword);
		
		passwordBox = new JPasswordField("Enter password here");
		passwordBox.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		passwordBox.setBounds(150, 170, 250, 26);
		passwordBox.setForeground(Color.GRAY);
		passwordBox.setEchoChar((char)0);
		contentPane.add(passwordBox);
		passwordBox.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				String password = new String(passwordBox.getPassword());
				if(password.equals("Enter password here")) {
					passwordBox.setText("");
					passwordBox.setEchoChar('●');
					passwordBox.setForeground(Color.BLACK);
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				String password = new String(passwordBox.getPassword());
				if(password.equals("")) {
					passwordBox.setText("Enter password here");
					passwordBox.setForeground(Color.GRAY);
					passwordBox.setEchoChar((char)0);
				}
			}
			
		});
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener((e)->{
			emailBox.setText("Enter EmailID here");
			emailBox.setForeground(Color.GRAY);
			passwordBox.setText("Enter password here");
			passwordBox.setForeground(Color.GRAY);
			passwordBox.setEchoChar((char)0);
		});
		btnReset.setBounds(50, 225, 100, 29);
		contentPane.add(btnReset);
		
		JButton btnLogin = new JButton("Back");
		btnLogin.addActionListener((e)->{
			back();
		});
		btnLogin.setBounds(300, 225, 100, 29);
		contentPane.add(btnLogin);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener((e)->{
			register();
		});
		btnRegister.setBounds(175, 225, 100, 29);
		contentPane.add(btnRegister);
	}

	private void register() {
		String name = nameBox.getText();
		String emailID = emailBox.getText();
		String password = String.valueOf(passwordBox.getPassword());
	}
	
	private void back() {
		this.dispose();
		Login login = new Login();
		login.setVisible(true);
		login.requestFocusInWindow();
	}

}
