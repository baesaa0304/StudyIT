package edu.java.swing05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain05 {

	private JFrame frame;
	private JRadioButton rbPrivate;
	private JRadioButton rbPackage;
	private JRadioButton rbProtected;
	private JRadioButton rbPublic;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JCheckBox cbAbstract;
	private JCheckBox cbFinal;
	private JCheckBox cbStatic;
	private JComboBox<String> comboBox;
	private JButton btninfo;
	private JTextArea textArea;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain05 window = new AppMain05();
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
	public AppMain05() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 965, 630);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		rbPrivate = new JRadioButton("private");
		rbPrivate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				handleRadioButtonClick(e);
			}
		});
		buttonGroup.add(rbPrivate);
		rbPrivate.setFont(new Font("D2Coding", Font.PLAIN, 16));
		rbPrivate.setBounds(0, 0, 159, 65);
		frame.getContentPane().add(rbPrivate);
		
		rbPackage = new JRadioButton("package");
		rbPackage.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				handleRadioButtonClick(e);
			}
		});
		buttonGroup.add(rbPackage);
		rbPackage.setFont(new Font("D2Coding", Font.PLAIN, 16));
		rbPackage.setBounds(204, 0, 159, 65);
		frame.getContentPane().add(rbPackage);
		
		rbProtected = new JRadioButton("protected");
		rbProtected.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				handleRadioButtonClick(e);
			}
		});
		buttonGroup.add(rbProtected);
		rbProtected.setFont(new Font("D2Coding", Font.PLAIN, 16));
		rbProtected.setBounds(410, 0, 159, 65);
		frame.getContentPane().add(rbProtected);
		
		rbPublic = new JRadioButton("public");
		rbPublic.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				handleRadioButtonClick(e);
			}
		});
		buttonGroup.add(rbPublic);
		rbPublic.setFont(new Font("D2Coding", Font.PLAIN, 16));
		rbPublic.setBounds(614, 0, 159, 65);
		frame.getContentPane().add(rbPublic);
		
		cbAbstract = new JCheckBox("abstract");
		cbAbstract.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				handleCheckBoxClick(e);
			}
		});
		cbAbstract.setFont(new Font("D2Coding", Font.PLAIN, 18));
		cbAbstract.setBounds(8, 69, 151, 50);
		frame.getContentPane().add(cbAbstract);
		
		cbFinal = new JCheckBox("final");
		cbFinal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				handleCheckBoxClick(e);
			}
		});
		cbFinal.setFont(new Font("D2Coding", Font.PLAIN, 18));
		cbFinal.setBounds(214, 67, 151, 50);
		frame.getContentPane().add(cbFinal);
		
		cbStatic = new JCheckBox("static");
		cbStatic.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				handleCheckBoxClick(e);
				
			}
		});
		cbStatic.setFont(new Font("D2Coding", Font.PLAIN, 18));
		cbStatic.setBounds(420, 67, 151, 50);
		frame.getContentPane().add(cbStatic);
		
		// JcomboBox<String> b = new JcomboBox<>();
		comboBox = new JComboBox<>();
		String[] items = {"naver.com", "gmail.com", "kakao.com"};
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(items);
		comboBox.setModel(model);
//		comboBox.setModel(new DefaultComboBoxModel(new String[] {"naver.com", "gmail.com", "kakao.com"}));
		comboBox.setBounds(8, 154, 452, 30);
		frame.getContentPane().add(comboBox);
		
		btninfo = new JButton("확인");
		btninfo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				printInfo();
			}
		});
		btninfo.setFont(new Font("D2Coding", Font.PLAIN, 18));
		btninfo.setBounds(518, 140, 114, 59);
		frame.getContentPane().add(btninfo);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 222, 814, 319);
		frame.getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("D2Coding", Font.PLAIN, 20));
		scrollPane.setViewportView(textArea);
	}

	private void printInfo() {
		// 라디오 버튼, 체크박스, 콤보박스의 상태를 JTextArea에 출력
		
		StringBuffer buffer = new StringBuffer(); // textArea에 출력할 문자열을 저장하기 위해서.
		
		// 어떤 라디오 버튼이 선택됐는 지를 체크
		if(rbPrivate.isSelected()) {
			buffer.append(rbPrivate.getText());
		} else if(rbPackage.isSelected()) {
			buffer.append(rbPackage.getText());
		} else if(rbProtected.isSelected()) {
			buffer.append(rbProtected.getText());
		} else {
			buffer.append(rbPublic.getText());
		}
		buffer.append("라디오 버튼 선택됨.\n");
		
		// 체크박스들의 선택 여부를 확인
		if (cbAbstract.isSelected()) {
			buffer.append(cbAbstract.getText()).append(" ");
		}
		if (cbFinal.isSelected()) {
			buffer.append(cbFinal.getText()).append(" ");
		}
		if(cbStatic.isSelected()) {
			buffer.append(cbStatic.getText()).append(" ");
		}
		buffer.append("체크박스 선택됨.\n");
		
		// 콤보박스에서 선택된 아이템 찾기
		String item = (String) comboBox.getSelectedItem();
		buffer.append(item).append("콤보박스 선택됨\n");
		
		// 버퍼의 내용을 textAread에 출력
		textArea.setText(buffer.toString());
	}

	private void handleCheckBoxClick(ActionEvent event) {
		// 클릭 이벤크가 발생한 이벤트 소스 (체크박스)
		JCheckBox chbox = (JCheckBox) event.getSource();
		
		// 체크박스의 텍스를 찾음.
		String text = chbox.getText();
		
		// 체크박스의 체크 (선택) 여부 확인
		boolean selected = chbox.isSelected();
		
		//정보 출력
		textArea.setText(text + " : " + selected);
		
	}

	private void handleRadioButtonClick(ActionEvent event) {
		
		// 클릭 이벤트가 발생한 이벤트 소스 (라디오 버튼)
		JRadioButton btn = (JRadioButton) event.getSource(); 
		
		// 라디오 버튼의 텍스트를 찾음.
		String btnText = btn.getText(); 
		
		// 라디오 버튼의 체크 여부
		boolean selected = btn.isSelected(); 
		
		 
		 // 결과를 JTextArea에 출력.
		 textArea.setText(btnText + " : " + selected); 
		
	}
}
