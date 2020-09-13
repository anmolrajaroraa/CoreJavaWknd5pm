package com.company.billing.main;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.company.billing.model.Product;
import com.company.billing.model.ProductDAO;

import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BillingScreen extends JFrame {

	private static final long serialVersionUID = 9215555796699495501L;
	
	private JPanel contentPane;
	JComboBox<String> comboBox = new JComboBox<>();
	JLabel lblProductName = new JLabel("");
	JLabel lblProductPhoto = new JLabel("");

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
		
		comboBox.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		comboBox.setBounds(150,25,200,30);
		contentPane.add(comboBox);
		fillCombo();
		
		JLabel lblChooseItem = new JLabel("Choose Item");
		lblChooseItem.setFont(new Font("Kokonor", Font.PLAIN, 20));
		lblChooseItem.setBounds(25, 32, 100, 20);
		contentPane.add(lblChooseItem);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(362, 27, 117, 29);
		btnSearch.addActionListener((e)->{
			search();
		});
		contentPane.add(btnSearch);
		
		lblProductName.setFont(new Font("Kokonor", Font.PLAIN, 18));
		lblProductName.setBounds(160, 67, 600, 30);
		contentPane.add(lblProductName);
		
		lblProductPhoto.setBounds(150, 109, 1200, 600);
		contentPane.add(lblProductPhoto);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				askForClose();
			}
		});
	}
	
	private void search() {
		String selectedProduct = (String) comboBox.getSelectedItem();
		System.out.println("Selected product is " + selectedProduct);
		try {
			Product product = ProductDAO.getProductByName(selectedProduct);
			lblProductName.setText(product.getName());
			String images[] = product.getPath().split("\"");
//			System.out.println(Arrays.toString(images));
			System.out.println(images[1]);
		    URL url = new URL(images[1]);
		    Image image = ImageIO.read(url);
		    image = image.getScaledInstance(800,600, java.awt.Image.SCALE_DEFAULT);
		    lblProductPhoto.setIcon(new ImageIcon(image));
//			lblProductPhoto.setIcon(new ImageIcon(BillingScreen.class.getResource("/com/company/billing/main/intro.png")));
//			lblProductPhoto.setBounds(150, 109, 1200, 600);
//			contentPane.add(lblProductPhoto);
		}
		catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}
	}

	private void fillCombo() {
		comboBox.addItem("Select Item");
		try {
			for(String productName : ProductDAO.getProductNames()) {
				comboBox.addItem(productName); 
			}
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public void askForClose() {
		int choice = JOptionPane.showConfirmDialog(this, "Do you want to leave this window?", "Company Name", JOptionPane.YES_NO_OPTION);
		if(choice == JOptionPane.YES_OPTION) {
			this.dispose();
		}
	}
}
