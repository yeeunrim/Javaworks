package layouts;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginWindow {
	
	public static void main(String[] args) {
		
		//프레임
		JFrame frame = new JFrame("Login");
		frame.setSize(300, 300);
		frame.setLocation(200, 100);
		
		frame.setLayout(null);
		
		//컴포넌트 생성 및 배치
		JLabel label1 = new JLabel("아이디");
		label1.setSize(80, 30);
		label1.setLocation(30, 70);
		frame.add(label1);
	
		JTextField text1 = new JTextField();
		text1.setSize(130, 30);
		text1.setLocation(110, 70);
		frame.add(text1);
		
		JLabel label2 = new JLabel("비밀번호");
		label2.setSize(80, 30);
		label2.setLocation(30, 110);
		frame.add(label2);
		
		JTextField text2 = new JTextField();
		text2.setSize(130, 30);
		text2.setLocation(110, 110);
		frame.add(text2);
		
		JButton button = new JButton("로그인");
		button.setSize(80, 40);
		button.setLocation(110, 150);
		frame.add(button);
		
		//디스플레이
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	
	}

}
