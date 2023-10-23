package actionevent;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PlusCalcEvent {
	
	public static void main(String[] args) {
		
		//프레임 > 패널1, 패널2(BorderLayout, FlowLayout) > 버튼, 텍스트상자
		JFrame frame = new JFrame("덧셈 프로그램");
		frame.setSize(300, 120);
		frame.setLocation(200, 100);
		
		//패널1, 패널2 생성
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		//패널 배치 - BorderLayout()
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.CENTER);
		
		//패널1
		//버튼, 텍스트 상자 배치 - FlowLayout
		panel1.setLayout(new FlowLayout());
		JTextField text1 = new JTextField(5); //5 - column : 5글자
		JTextField text2 = new JTextField(5);
		JTextField text3 = new JTextField(5);
		//패널1에 버튼, 텍스트 상자 추가
		panel1.add(text1);
		panel1.add(new JLabel("+"));
		panel1.add(text2);
		panel1.add(new JLabel("="));
		panel1.add(text3);
		
		//패널2
		panel2.setLayout(new FlowLayout());
		JButton calcBtn = new JButton("결과");
		JButton rstBtn = new JButton("취소");
		//패널2에 버튼 추가 
		panel2.add(calcBtn);
		panel2.add(rstBtn);
		
		//버튼 이벤트 - 익명 개체 구현
		//계산 버튼 구현
		ActionListener listener =  new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//텍스트 상자에서 입력된 문자를 숫자로 변환
				int num1 = Integer.parseInt(text1.getText()); 
				int num2 = Integer.parseInt(text2.getText()); 
				int sum = num1 + num2;
				//숫자를 문자형으로 변환
				text3.setText(String.valueOf(sum)); 	
			}
			
		};
		calcBtn.addActionListener(listener); //계산 실행
		//취소 버튼 구현
		ActionListener listener2 =  new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//취소 버튼을 누르면 입력된 숫자가 지워지고 공백으로 초기화
				text1.setText(null);
				text2.setText(null);
				text3.setText(null);
			}
			
		};
		rstBtn.addActionListener(listener2); //리셋 실행
		
		//디스플레이
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}