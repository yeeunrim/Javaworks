package windowinherit;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ButtonEvent extends JFrame{
	
	private static final long serialVersionUID = 1000L;

	//생성자
	public ButtonEvent() {
	
		//프레임 생성 (상속을 받음으로서 frame 객체 생성을 생략 가능)
		//JFrame frame = new JFrame(); -- 생략
		this.setTitle("인사 프로그램");
		//this.setSize(250, 100); -- 프레임 크기 설정 생략
		this.setLocation(200, 100);
		
		//컴포넌트 생성 - 배치 
		//위쪽 - 입력 상자, 버튼
		//아래쪽 - 레이블
		//BorderLayout 사용
		JTextField text = new JTextField();
		this.add(text, BorderLayout.CENTER);
		text.setPreferredSize(new Dimension(200, 40));
		//text.setForeground(new Color(255, 153, 204)); (R, G, B)
		text.setForeground(new Color(0XCC0066)); //(16진수)
		text.setFont(new Font("cachildrenkkum", Font.PLAIN, 30)); //보통 굵기로 30pt
		text.setBackground(Color.lightGray);
		
		JButton button = new JButton("확인");
		this.add(button, BorderLayout.EAST);
		
		JLabel label = new JLabel("이름 > ");
		this.add(label, BorderLayout.SOUTH);
		label.setPreferredSize(new Dimension(200, 50));
		label.setFont(new Font("cachildrenkkum", Font.PLAIN, 30));
		
		//액션 이벤트
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String username = text.getText();
				label.setText("이름 > " + username);
			}
		};
		button.addActionListener(listener);
		
		//프레임과 같은 역할을 담당
		this.pack();
		
		//디스플레이
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		//생성자를 통해 구현
		//ButtonEvent event = new ButtonEvent();
		new ButtonEvent();
		
	}

}
