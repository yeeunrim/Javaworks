package components;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrame2 {
	
	public static void main(String[] args) {
		
		//프레임 - 윈도우 전체
		JFrame frame = new JFrame();
		
		//제목 표시줄 - 내용
		frame.setTitle("처음 만드는 윈도우");
		frame.setSize(300, 200); //너비, 높이
		frame.setLocation(1142,0); //x좌표, y좌표
		//null은 레이아웃 객체가 없는 상태
		frame.setLayout(null); //특정 위치로 배치할 때, 사용
		
		//레이블(글자 출력)
		JLabel label = new JLabel("우측 버튼을 눌러주세요.");
		label.setSize(200, 30);
		label.setLocation(40, 50);
		frame.add(label); //프레임에 라벨을 추가해야 화면에 출력됨
		
		//버튼 생성
		JButton button = new JButton("확인");
		button.setSize(70, 30);
		button.setLocation(180, 50);
		frame.add(button);
		
		//윈도우 종료(닫기)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//윈도우 디스플레이 
		frame.setVisible(true);
	
	}

}
