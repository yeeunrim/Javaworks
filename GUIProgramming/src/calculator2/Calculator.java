package calculator2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1000L;
	
	//필드
	String[] operator = {"+", "-", "÷", "x"};
	JComboBox<String> comboBox;
	JLabel label;
	JButton calcbtn;
	JButton rstbtn;
	JTextField text1; //첫째수
	JTextField text2; //둘째수
	JTextField text3; //셋째수
	
	//생성자
	public Calculator() {
		
		//윈도우(프레임)
		this.setTitle("사칙연산 프로그램");
		this.setSize(400, 120);
		this.setLocation(200, 100);
		
		//패널 2개 생성 - BorderLayout
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
	
		//컴포넌트 객체 생성 - FlowLayout
		//1. panel1
		panel1.setLayout(new FlowLayout());
		text1 = new JTextField(5);
		//콤보 박스
		comboBox = new JComboBox<>(operator);
		text2 = new JTextField(5);
		//레이블
		label = new JLabel("=");
		text3 = new JTextField(5);
		
		panel1.add(text1);
		panel1.add(comboBox);
		panel1.add(text2);
		panel1.add(label);
		panel1.add(text3);
		
		//2. panel2
		panel2.setLayout(new FlowLayout());
		calcbtn = new JButton("계산");
		rstbtn = new JButton("취소");
		
		panel2.add(calcbtn);
		panel2.add(rstbtn);
		
		//이벤트
		calcbtn.addActionListener(this);
		rstbtn.addActionListener(this);
	
		//디스플레이
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
			
	};
			
	//계산 버튼 눌렀을 때, 연산 구현
	@Override
	public void actionPerformed(ActionEvent e) {
		
			if(e.getSource() == calcbtn) { //객체가 calcbtn인 경우 
				int num1 = Integer.parseInt(text1.getText());
				
				//텍스트 상자에서 입력된 문자를 숫자로 변환
				String operatorInput = (String)comboBox.getSelectedItem();
				
				int num2 = Integer.parseInt(text1.getText());
				
				if(operatorInput.equals("+")) {
					int sum = num1 + num2;
					text3.setText(String.valueOf(sum)); 	
				} else if(operatorInput.equals("-")) {
					int sub = num1 - num2;
					text3.setText(String.valueOf(sub)); 
				} else if(operatorInput.equals("÷")) {
					double div = (double)num1 / num2;
					text3.setText(String.valueOf(div)); 
				} else {
					int mul = num1 * num2;
					text3.setText(String.valueOf(mul));
				}
			} //calcbtn인 경우 끝
		
			if(e.getSource() == rstbtn) {
				text1.setText("");
				text2.setText("");
				text3.setText("");
			} //rstbtn인 경우 끝
			
	}

}
