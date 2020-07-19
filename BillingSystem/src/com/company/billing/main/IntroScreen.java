package com.company.billing.main;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import org.apache.log4j.Logger;

import com.company.billing.user.Login;

public class IntroScreen extends JFrame {
	
	Logger logger = Logger.getLogger(IntroScreen.class);

	private static final long serialVersionUID = 4555923535542320691L;
	
	private JPanel contentPane;

	public static void main(String[] args) {
		IntroScreen frame = new IntroScreen();
		frame.logger.debug("Main start");
		frame.setVisible(true);
		frame.doProgress();
		frame.logger.debug("Main ends");
	}
	
	JProgressBar progressBar = new JProgressBar();
	int counter = 1;
	Timer timer;
	
	private void doProgress() {
//		int counter = 1;  // this is effectively final
		timer = new Timer(50, (e)->{
			progressBar.setValue(counter);
			counter++;
			if(counter > 100) {
				timer.stop();
				this.dispose();
				Login login = new Login();
				login.setVisible(true);
				login.requestFocusInWindow();
			}
		} );
		timer.start();
	}

	public IntroScreen() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1050, 460);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(242, 221, 131));
		setContentPane(contentPane);
		
		JLabel lblSplashImage = new JLabel("");
		lblSplashImage.setIcon(new ImageIcon(IntroScreen.class.getResource("/com/company/billing/main/intro.png")));
		lblSplashImage.setBounds(0, 0, 1050, 420);
		contentPane.add(lblSplashImage);
		
		progressBar.setStringPainted(true);
		progressBar.setBounds(0, 420, 1050, 20);
		contentPane.add(progressBar);
		
	}
}
