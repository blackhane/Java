package sub2;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;

public class ComponentTest extends JFrame {

	private JPanel contentPane;
	private JTextField txtf2;
	private JTextField txtf1;
	private JTextField txtf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentTest frame = new ComponentTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ComponentTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblNewLabel.setBounds(12, 10, 158, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("버튼 컴포넌트");
		lblNewLabel_1.setBounds(12, 61, 158, 15);
		contentPane.add(lblNewLabel_1);
		
		JButton btn2 = new JButton("버튼2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼2 클릭"); 
			}
		});
		btn2.setBounds(116, 87, 92, 23);
		contentPane.add(btn2);
		
		JButton btn1 = new JButton("버튼1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print("버튼1 클릭");
			}
		});
		btn1.setBounds(12, 87, 92, 23);
		contentPane.add(btn1);
		
		JButton btn3 = new JButton("버튼3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼3 클릭", "대화상자 제목", JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		btn3.setBounds(226, 87, 92, 23);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("버튼4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "버튼4 클릭", "확인대화상자", JOptionPane.INFORMATION_MESSAGE);
				
				if(answer == JOptionPane.YES_OPTION) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}
		});
		btn4.setBounds(330, 87, 92, 23);
		contentPane.add(btn4);
		
		JLabel lblNewLabel_2 = new JLabel("TextField");
		lblNewLabel_2.setBounds(12, 120, 92, 15);
		contentPane.add(lblNewLabel_2);
		
		txtf2 = new JTextField();
		txtf2.setBounds(12, 178, 128, 23);
		contentPane.add(txtf2);
		txtf2.setColumns(10);
		
		txtf1 = new JTextField();
		txtf1.setColumns(10);
		txtf1.setBounds(12, 145, 128, 23);
		contentPane.add(txtf1);
		
		txtf3 = new JTextField();
		txtf3.setColumns(10);
		txtf3.setBounds(12, 211, 128, 23);
		contentPane.add(txtf3);
		
		JLabel lblTxtf1Result = new JLabel("결과:");
		lblTxtf1Result.setBounds(213, 149, 113, 15);
		contentPane.add(lblTxtf1Result);
		
		JLabel lblTxtf2Result = new JLabel("결과:");
		lblTxtf2Result.setBounds(213, 182, 113, 15);
		contentPane.add(lblTxtf2Result);
		
		JLabel lblTxtf3Result = new JLabel("결과:");
		lblTxtf3Result.setBounds(213, 215, 113, 15);
		contentPane.add(lblTxtf3Result);
	
		JButton btnTextf1 = new JButton("확인");
		btnTextf1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = txtf1.getText();
				lblTxtf1Result.setText("결과 : " +txt);
			}
		});
		btnTextf1.setBounds(144, 145, 64, 23);
		contentPane.add(btnTextf1);
		
		JButton btnTextf2 = new JButton("확인");
		btnTextf2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = txtf2.getText();
				lblTxtf2Result.setText("결과 : " +txt);
			}
		});
		btnTextf2.setBounds(144, 178, 64, 23);
		contentPane.add(btnTextf2);
		
		JButton btnTextf3 = new JButton("확인");
		btnTextf3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = txtf3.getText();
				lblTxtf3Result.setText("결과 : " +txt);
			}
		});
		btnTextf3.setBounds(144, 211, 64, 23);
		contentPane.add(btnTextf3);
		
		JLabel lblNewLabel_3 = new JLabel("CheckBox");
		lblNewLabel_3.setBounds(12, 244, 92, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("취미를 고르세요");
		lblNewLabel_4.setBounds(12, 270, 128, 15);
		contentPane.add(lblNewLabel_4);
		
		JCheckBox chk1 = new JCheckBox("등산");
		chk1.setBounds(8, 291, 64, 23);
		contentPane.add(chk1);
		
		JCheckBox chk2 = new JCheckBox("여행");
		chk2.setBounds(76, 291, 64, 23);
		contentPane.add(chk2);
		
		JCheckBox chk3 = new JCheckBox("독서");
		chk3.setBounds(144, 291, 64, 23);
		contentPane.add(chk3);
		
		JCheckBox chk4 = new JCheckBox("운동");
		chk4.setBounds(8, 316, 64, 23);
		contentPane.add(chk4);
		
		JCheckBox chk5 = new JCheckBox("게임");
		chk5.setBounds(76, 316, 64, 23);
		contentPane.add(chk5);
		
		JLabel lblChkResult = new JLabel("결과 :");
		lblChkResult.setBounds(12, 345, 326, 15);
		contentPane.add(lblChkResult);
		
		JButton btnChk = new JButton("확인");
		btnChk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<String> chks = new ArrayList<>();
				if(chk1.isSelected()) {
					chks.add(chk1.getText());
				}
				if(chk2.isSelected()) {
					chks.add(chk2.getText());
				}
				if(chk3.isSelected()) {
					chks.add(chk3.getText());
				}
				if(chk4.isSelected()) {
					chks.add(chk4.getText());
				}
				if(chk5.isSelected()) {
					chks.add(chk5.getText());
				}
				
				lblChkResult.setText("결과 : " +chks.toString());
			}
		});
		btnChk.setBounds(144, 316, 97, 23);
		contentPane.add(btnChk);
		
		JLabel lblNewLabel_5 = new JLabel("Radio");
		lblNewLabel_5.setBounds(12, 385, 57, 15);
		contentPane.add(lblNewLabel_5);
		
		JRadioButton rbMale = new JRadioButton("남자");
		rbMale.setBounds(12, 406, 60, 23);
		contentPane.add(rbMale);
		
		JRadioButton rbFemale = new JRadioButton("여자");
		rbFemale.setBounds(76, 406, 60, 23);
		contentPane.add(rbFemale);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbMale);
		bg.add(rbFemale);
		
		JLabel lblGenderResult = new JLabel("결과 :");
		lblGenderResult.setBounds(12, 435, 326, 15);
		contentPane.add(lblGenderResult);
		
		JButton btnGender = new JButton("확인");
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gen = null;
				
				if(rbMale.isSelected()) {
					lblGenderResult.setText("결과 : 남자");
				}else {
					lblGenderResult.setText("결과 : 여자");
				}
			
			}
		});
		btnGender.setBounds(144, 406, 97, 23);
		contentPane.add(btnGender);
		
	

	}
}
