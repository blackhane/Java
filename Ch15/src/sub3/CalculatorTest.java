package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class CalculatorTest extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorTest frame = new CalculatorTest();
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
	public CalculatorTest() {
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 283, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("굴림", Font.BOLD, 16));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("0");
		textField.setBounds(12, 41, 240, 51);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.setBounds(12, 102, 51, 51);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.setBounds(75, 102, 51, 51);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("9");
		btnNewButton_1_1.setBounds(138, 102, 51, 51);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("6");
		btnNewButton_1_1_1.setBounds(138, 163, 51, 51);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_2 = new JButton("4");
		btnNewButton_2.setBounds(12, 163, 51, 51);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1_2 = new JButton("5");
		btnNewButton_1_2.setBounds(75, 163, 51, 51);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_1_1_1 = new JButton("3");
		btnNewButton_1_1_1_1.setBounds(138, 224, 51, 51);
		contentPane.add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_2_1 = new JButton("1");
		btnNewButton_2_1.setBounds(12, 224, 51, 51);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_1_2_1 = new JButton("2");
		btnNewButton_1_2_1.setBounds(75, 224, 51, 51);
		contentPane.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_1_1_1_1 = new JButton("=");
		btnNewButton_1_1_1_1_1.setBounds(138, 285, 51, 51);
		contentPane.add(btnNewButton_1_1_1_1_1);
		
		JButton btnNewButton_2_1_1 = new JButton("0");
		btnNewButton_2_1_1.setBounds(12, 285, 51, 51);
		contentPane.add(btnNewButton_2_1_1);
		
		JButton btnNewButton_1_2_1_1 = new JButton("C");
		btnNewButton_1_2_1_1.setBounds(75, 285, 51, 51);
		contentPane.add(btnNewButton_1_2_1_1);
		
		JButton btnNewButton_1_1_2 = new JButton("/");
		btnNewButton_1_1_2.setBounds(201, 102, 51, 51);
		contentPane.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_1_1_2 = new JButton("X");
		btnNewButton_1_1_1_2.setBounds(201, 163, 51, 51);
		contentPane.add(btnNewButton_1_1_1_2);
		
		JButton btnNewButton_1_1_1_1_2 = new JButton("-");
		btnNewButton_1_1_1_1_2.setBounds(201, 224, 51, 51);
		contentPane.add(btnNewButton_1_1_1_1_2);
		
		JButton btnNewButton_1_1_1_1_1_1 = new JButton("+");
		btnNewButton_1_1_1_1_1_1.setBounds(201, 285, 51, 51);
		contentPane.add(btnNewButton_1_1_1_1_1_1);
	}
}
