package calculator;

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

public class Calculator extends JFrame {
	
	private static final long serialVersionUID = 1000L;
	
	//필드
	String[] operator = {"+", "-", "÷", "x"};
	JComboBox<String> comboBox;
	JLabel label;
	
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
		JTextField text1 = new JTextField(5);
		//콤보 박스
		comboBox = new JComboBox<>(operator);
		JTextField text2 = new JTextField(5);
		//레이블
		label = new JLabel("=");
		JTextField text3 = new JTextField(5);
		
		panel1.add(text1);
		panel1.add(comboBox);
		panel1.add(text2);
		panel1.add(label);
		panel1.add(text3);
		
		//2. panel2
		panel2.setLayout(new FlowLayout());
		JButton calcbtn = new JButton("계산");
		JButton rstbtn = new JButton("취소");
		
		panel2.add(calcbtn);
		panel2.add(rstbtn);
		
		//이벤트
		//계산 버튼
		ActionListener listener1 =  new ActionListener() {
			
			//계산 버튼 눌렀을 때, 연산 구현
			@Override
			public void actionPerformed(ActionEvent e) {
				//텍스트 상자에서 입력된 문자를 숫자로 변환
				String operatorInput = (String)comboBox.getSelectedItem();
				
				int num1 = Integer.parseInt(text1.getText()); 
				int num2 = Integer.parseInt(text2.getText()); 
				
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
			}
			
		};
		calcbtn.addActionListener(listener1); //계산 실행
		//취소 버튼
		ActionListener listener2 =  new ActionListener() {
			
			//취소 버튼 눌렀을 때, 입력 초기화 구현
			@Override
			public void actionPerformed(ActionEvent e) {
				
				text1.setText(null);
				text2.setText(null);
				text3.setText(null);
			}
			
		};
		rstbtn.addActionListener(listener2); //리셋 실행
		
		//디스플레이
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

}
