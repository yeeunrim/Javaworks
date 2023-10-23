package components;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrame1 {
	
	public static void main(String[] args) {
		
		//프레임 - 윈도우 전체
		JFrame frame = new JFrame();
		
		//제목 표시줄 - 내용
		frame.setTitle("처음 만드는 윈도우");
		frame.setSize(300, 300); //너비, 높이
		frame.setLocation(1142,0); //x좌표, y좌표
		
		//레이블(글자 출력)
		JLabel label = new JLabel("안녕, 오늘은 월요일이야");
		//label.setText("안녕:) 오늘은 월요일이다 !");
		//레이블 정렬(alignment:왼쪽, 가운데, 오른쪽)
		label.setHorizontalAlignment(JLabel.CENTER);
		//BorderLayout - 프레임을 동, 서, 남, 북, 중앙으로 배치
		frame.add(label, BorderLayout.CENTER); //프레임에 라벨을 추가해야 화면에 출력됨
		
		//버튼 생성
		JButton button = new JButton("확인");
		frame.add(button, BorderLayout.SOUTH);
		
		
		//윈도우 종료(닫기)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//윈도우 디스플레이 
		frame.setVisible(true);
	
	}

}
