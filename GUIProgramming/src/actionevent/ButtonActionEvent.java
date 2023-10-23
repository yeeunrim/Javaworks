package actionevent;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ButtonActionEvent {
	
	public static void main(String[] args) {
		
		//프레임
		JFrame frame = new JFrame("레이아웃 예제");
		frame.setSize(250, 100);
		frame.setLocation(200, 100);
		
		//컴포넌트 -JTextField(입력상자), JButton, JLabel
		JTextField text = new JTextField();
		JButton button = new JButton("확인");
		JLabel label = new JLabel("이름 > ");
		
		//배경 색상
		frame.setBackground(Color.blue);
		text.setBackground(Color.lightGray);
		
		//button 이벤트
		ConfirmBtnActionListener listener = new ConfirmBtnActionListener(text, label);
		button.addActionListener(listener);
		
		//컴포넌트 배치 - BorderLayout 사용
		frame.add(text, BorderLayout.CENTER);
		
		button.setPreferredSize(new Dimension(60, 30));
		frame.add(button, BorderLayout.EAST);
		
		label.setPreferredSize(new Dimension(250, 40));
		frame.add(label, BorderLayout.SOUTH);
		
		//디스플레이
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
