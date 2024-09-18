package edu.java.swing06;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.JobAttributes;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain06 {

	private JFrame frame;
	private JButton btnMsgDig;
	private JButton btnComfirmDig;
	private JButton btnOptionDlg;
	private JButton btnInputDlg;
	private JButton btnCustomDlg;
	private JButton btnCustomFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain06 window = new AppMain06();
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
	public AppMain06() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 469, 675);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnMsgDig = new JButton("Message Dialog");
		btnMsgDig.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				JOptionPane.showMessageDialog(frame, "안녕하세요.");
				JOptionPane.showMessageDialog(frame, // 메세지 다이얼로그가 실행될 부모 컴포넌트
						"안녕하세요?", // 다이얼로그에 표실될 메세지
						"메세지", // 다이얼로그 타이틀(제목)
						JOptionPane.WARNING_MESSAGE// 메세지 타입
					);
			}
		});
		btnMsgDig.setFont(new Font("D2Coding", Font.PLAIN, 24));
		btnMsgDig.setBounds(12, 10, 410, 82);
		frame.getContentPane().add(btnMsgDig);
		
		btnComfirmDig = new JButton("Confirm Dialog");
		btnComfirmDig.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(
						frame, // 부모 컴포넌트
						"정말 삭제할까요?",  // 메세지
						"삭제확인", // 타이틀
						JOptionPane.YES_NO_CANCEL_OPTION, // 확인 옵션(Yes-no, yes- no- cancel)
						JOptionPane.QUESTION_MESSAGE // 메세지 타입
						);
				btnComfirmDig.setText("Confirm = " + result);
			}
		});
		btnComfirmDig.setFont(new Font("D2Coding", Font.PLAIN, 24));
		btnComfirmDig.setBounds(12, 114, 410, 82);
		frame.getContentPane().add(btnComfirmDig);
		
		btnOptionDlg = new JButton("Option Dialog");
		btnOptionDlg.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] options = {"아니요", "어려워요","재밌어요", "쉬어요."};
				int result = JOptionPane.showOptionDialog
								(frame, 
								"JavaSwing 재미있나여?", //메세지
								"옵션 확인", // 타이틀
								JOptionPane.YES_NO_CANCEL_OPTION, // 옵션 타입
								JOptionPane.QUESTION_MESSAGE,  // 메세지 타입
								null, // 아이콘
								options, // 옵션들의 배열
								options[2]
								); // 옵션 초기값
					btnOptionDlg.setText("Option result = " + result);
			}
		});
		btnOptionDlg.setFont(new Font("D2Coding", Font.PLAIN, 24));
		btnOptionDlg.setBounds(12, 206, 410, 82);
		frame.getContentPane().add(btnOptionDlg);
		
		btnInputDlg = new JButton("Input Dialog");
		btnInputDlg.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				String input = JOptionPane.showInputDialog(frame,"이름");
				Object[] selectionValues = {"10대", "20대", "30대", "40대"};
				Object input = JOptionPane.showInputDialog
						(frame, // 부모 컴포넌트
						 "나이?", // 메시지 	
						 "나이 확인", // 타이틀
						 JOptionPane.QUESTION_MESSAGE, // 메시지 타입 
						 null, // 아이콘
						selectionValues, 
						selectionValues[1]);	
				
				btnInputDlg.setText("Input = " + input);
			}
		});
		btnInputDlg.setFont(new Font("D2Coding", Font.PLAIN, 24));
		btnInputDlg.setBounds(12, 310, 410, 82);
		frame.getContentPane().add(btnInputDlg);
		
		btnCustomDlg = new JButton("Custom Dialog");
		btnCustomDlg.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MyDialog.showMyDialog(frame);
			}
		});
		btnCustomDlg.setFont(new Font("D2Coding", Font.PLAIN, 24));
		btnCustomDlg.setBounds(12, 421, 410, 82);
		frame.getContentPane().add(btnCustomDlg);
		
		btnCustomFrame = new JButton("Custom Frame");
		btnCustomFrame.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MyFrame.showMyFrame();
			}
		});
		btnCustomFrame.setFont(new Font("D2Coding", Font.PLAIN, 24));
		btnCustomFrame.setBounds(12, 526, 410, 82);
		frame.getContentPane().add(btnCustomFrame);
	}

}
