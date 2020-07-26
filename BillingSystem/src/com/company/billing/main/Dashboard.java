package com.company.billing.main;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.company.billing.model.Product;
import com.company.billing.model.ProductDAO;
import com.company.billing.utils.ConfigReader;
import com.company.billing.utils.ExcelReader;

public class Dashboard extends JFrame implements ConfigReader{

	private static final long serialVersionUID = -4148072398375373160L;
	
	private JPanel contentPane;

	public static void main(String[] args) {
		Dashboard frame = new Dashboard("Welcome null");
		frame.setVisible(true);
	}

	public Dashboard(String message) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 500);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		contentPane.setBackground(Color.BLACK);
		setContentPane(contentPane);
		
		JLabel lblWelcome = new JLabel(message);
		lblWelcome.setForeground(Color.CYAN);
		lblWelcome.setFont(new Font("Kokonor", Font.PLAIN, 30));
		lblWelcome.setBounds(625, 100, 300, 200);
		contentPane.add(lblWelcome);
		
		createMenu();
	}

	private void createMenu() {
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		
		JMenu adminMenu = new JMenu("Admin");
		menuBar.add(adminMenu);
		
		JMenuItem uploadMenuItem = new JMenuItem("Upload");
		adminMenu.add(uploadMenuItem);
		uploadMenuItem.addActionListener((e)->{
			doUpload();
		});
		
		JMenuItem billingMenuItem = new JMenuItem("Billing");
		adminMenu.add(billingMenuItem);
		
		JMenuItem exitMenuItem = new JMenuItem("Exit");
		adminMenu.addSeparator();
		adminMenu.add(exitMenuItem);
	}

	private void doUpload() {
		JFileChooser browse = new JFileChooser( rb.getString(BROWSE_PATH) );
		browse.showOpenDialog(this);
		File file = browse.getSelectedFile();
		try {
			ArrayList<Product> productsList = ExcelReader.readXLS(file);
			String msg = ProductDAO.bulkUpload(productsList) ? "Products uploaded" : "Products not uploaded";
			JOptionPane.showMessageDialog(this, msg);
		}
		catch (IOException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		System.out.println(file.getPath());
	}

}
