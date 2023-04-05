package edu.java.swing07;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain07 {
	// JTable에서 사용할 컬럼 이름들
	private static final String[] COLUMN_NAMES = {"국어" , "영어" , "수학", "총점", "평균"};
	
	private DefaultTableModel model; // 테이블의 행, 열에 대한 정보를 갖는 객체
	private JFrame frame;
	private JLabel lblKorean;
	private JTextField textKorean;
	private JTextField textEnglush;
	private JTextField textMath;
	private JLabel lblEnglish;
	private JLabel lblMath;
	private JButton btnInsert;
	private JButton btnDelete;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain07 window = new AppMain07();
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
	public AppMain07() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 473, 656);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblKorean = new JLabel("국어");
		lblKorean.setHorizontalAlignment(SwingConstants.CENTER);
		lblKorean.setFont(new Font("D2Coding", Font.BOLD, 22));
		lblKorean.setBounds(12, 10, 98, 68);
		frame.getContentPane().add(lblKorean);
		
		textKorean = new JTextField();		
		textKorean.setFont(new Font("D2Coding", Font.BOLD, 30));
		textKorean.setBounds(122, 10, 293, 68);
		frame.getContentPane().add(textKorean);
		textKorean.setColumns(10);
		
		lblEnglish = new JLabel("영어");
		lblEnglish.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnglish.setFont(new Font("D2Coding", Font.BOLD, 22));
		lblEnglish.setBounds(12, 111, 98, 68);
		frame.getContentPane().add(lblEnglish);
		
		textEnglush = new JTextField();
		textEnglush.setFont(new Font("D2Coding", Font.BOLD, 30));
		textEnglush.setColumns(10);
		textEnglush.setBounds(122, 111, 293, 68);
		frame.getContentPane().add(textEnglush);
		
		lblMath = new JLabel("수학");
		lblMath.setHorizontalAlignment(SwingConstants.CENTER);
		lblMath.setFont(new Font("D2Coding", Font.BOLD, 22));
		lblMath.setBounds(12, 205, 98, 68);
		frame.getContentPane().add(lblMath);
		
		textMath = new JTextField();
		textMath.setFont(new Font("D2Coding", Font.BOLD, 30));
		textMath.setColumns(10);
		textMath.setBounds(122, 205, 293, 68);
		frame.getContentPane().add(textMath);
		
		btnInsert = new JButton("입력");
		btnInsert.setFont(new Font("D2Coding", Font.BOLD, 23));
		btnInsert.setBounds(43, 297, 129, 68);		
		frame.getContentPane().add(btnInsert);
		
		btnDelete = new JButton("삭제");
		btnDelete.setFont(new Font("D2Coding", Font.BOLD, 23));
		btnDelete.setBounds(274, 297, 129, 68);
		frame.getContentPane().add(btnDelete);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 384, 433, 223);
		frame.getContentPane().add(scrollPane);
		
		JTable table = new JTable();
		Object[][] data = {}; // 테이블에 사용할 데이터
		model = new DefaultTableModel(data, COLUMN_NAMES);
		Object[]row = {10, 20, 30, 40, 50};
		model.addRow(row); // 입력버튼에 연결
		model.removeRow(0); // 삭제 버튼에 연결
		table.setModel(model);
		scrollPane.setViewportView(table);
	}
}
