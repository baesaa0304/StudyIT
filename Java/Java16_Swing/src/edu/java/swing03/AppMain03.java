package edu.java.swing03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.security.auth.callback.TextInputCallback;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;

public class AppMain03 {

	private JFrame frame;
	private JTextField text1;
	private JTextField text2;	
	private JTextArea textAn;
	private JLabel lblnum1;
	private JLabel lblnum2;
	private JButton btnButtonP;
	private JButton btnButtonM;
	private JButton btnX;
	private JButton btnButtonA;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain03 window = new AppMain03();
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
	public AppMain03() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 581, 472);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblnum1 = new JLabel("num 1");		
		lblnum1.setHorizontalAlignment(SwingConstants.CENTER);
		lblnum1.setFont(new Font("굴림", Font.BOLD, 30));
		lblnum1.setBounds(24, 37, 135, 59);
		frame.getContentPane().add(lblnum1);
		
		lblnum2 = new JLabel("num 2");
		lblnum2.setHorizontalAlignment(SwingConstants.CENTER);
		lblnum2.setFont(new Font("굴림", Font.BOLD, 30));
		lblnum2.setBounds(24, 106, 135, 59);
		frame.getContentPane().add(lblnum2);
		
		text1 = new JTextField();
		text1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
		
		text1.setFont(new Font("굴림", Font.PLAIN, 17));
		text1.setBounds(171, 37, 353, 59);
		frame.getContentPane().add(text1);
		text1.setColumns(10);
		
		text2 = new JTextField();
		text2.setFont(new Font("굴림", Font.PLAIN, 17));
		text2.setColumns(10);
		text2.setBounds(171, 106, 353, 59);
		frame.getContentPane().add(text2);
		
		btnButtonP = new JButton("+");
		btnButtonP.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				handleButtonClick(e);
			}
		});
		btnButtonP.setFont(new Font("굴림", Font.BOLD, 47));
		btnButtonP.setBounds(37, 204, 99, 59);
		frame.getContentPane().add(btnButtonP);
		
		btnButtonM = new JButton("-");
		btnButtonM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleButtonClick(e);
			}
		});
		btnButtonM.setFont(new Font("굴림", Font.BOLD, 47));
		btnButtonM.setBounds(164, 204, 99, 59);
		frame.getContentPane().add(btnButtonM);
		
		btnButtonA = new JButton("/");
		btnButtonA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleButtonClick(e);
			}
		});
		btnButtonA.setFont(new Font("굴림", Font.BOLD, 47));
		btnButtonA.setBounds(425, 204, 99, 59);
		frame.getContentPane().add(btnButtonA);
		
		btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleButtonClick(e);
			}
		});
		btnX.setFont(new Font("굴림", Font.BOLD, 47));
		btnX.setBounds(291, 204, 99, 59);
		frame.getContentPane().add(btnX);
		
		textAn = new JTextArea();
		textAn.setFont(new Font("굴림", Font.BOLD, 32));
		textAn.setBounds(47, 273, 477, 133);
		frame.getContentPane().add(textAn);
		
		
	}

	private void handleButtonClick(ActionEvent event) {
		System.out.println(event.getSource());
		// System.out.println(event.getSource());
		// -> argument로 전달된 ActionEvent 객체에서 이벤트가 발생한 GUI 컴포넌트 정보를 알 수 있다.
		
		// JTextField에 입력된 문자열을 읽어서 double 타입으로 변환.
		double num1 = 0;
		double num2 = 0;
		try {
			num1 = Double.parseDouble(text1.getText());
			num2 = Double.parseDouble(text2.getText());
			
		}catch (NumberFormatException e) {
			textAn.setText("number1,2는 숫자로 입력하세요.");
			return; // 메서드 종료
		}
		
		double result = 0; // 사칙 연산 결과를 저장할 변수
		String op = ""; // 사칙 연산 연산자를 저장할 변수 (+ , - , x, /)
		
		Object source = event.getSource();
		if(source == btnButtonP) {
			result = num1 + num2;
			op = "+";
		} else if(source == btnButtonM) {
			result = num1 - num2;
			op = "-";
		} else if (source == btnX) {
			result = num1 * num2;
			op = "x";
		}else if (source == btnButtonA) {
			result = num1 / num2;
			op = "/";
		}
		
		String msg = String.format("%f %s %f = %f", num1, op, num2, result);
		textAn.setText(msg);
	}


}
