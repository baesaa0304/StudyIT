package edu.java.swing04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;
import javax.swing.SwingConstants;

public class AppMain04 {

	private JFrame frame;
	private JLabel lblImagelcon;
	private int index;
	private static final String[] IMAGES = {
	"images/1.jpg",
	"images/2.jpg",
	"images/3.jpg",
	"images/4.jpg",
	"images/5.jpg"
	};
	private JButton btn1;
	private JButton btn2;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain04 window = new AppMain04();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppMain04() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 508, 533);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblImagelcon = new JLabel("");
		lblImagelcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagelcon.setBounds(37, 10, 400, 400);
		lblImagelcon.setIcon(new ImageIcon(IMAGES[index]));
		frame.getContentPane().add(lblImagelcon);
		
		btn1 = new JButton(">");
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				nextButton(e);
			}
		});
		btn1.setFont(new Font("D2Coding", Font.BOLD, 50));
		btn1.setBounds(364, 423, 97, 61);
		frame.getContentPane().add(btn1);
		
		btn2 = new JButton("<");
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lastButton(e);
			}
		});
		btn2.setFont(new Font("D2Coding", Font.BOLD, 50));
		btn2.setBounds(22, 423, 97, 61);
		frame.getContentPane().add(btn2);
	}

	protected void nextButton(ActionEvent e) {
		if(index < IMAGES.length -1) {
			index ++;
		} else {
			index = 0;
		}
		lblImagelcon.setIcon(new ImageIcon(IMAGES[index]));
	}
		
	

	protected void lastButton(ActionEvent e) {
		if(index > 0) {
			index --;
		} else {
			index = IMAGES.length - 1;
		}
		lblImagelcon.setIcon(new ImageIcon(IMAGES[index]));
	}

}
