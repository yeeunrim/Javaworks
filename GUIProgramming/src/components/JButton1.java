package components;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JButton1 {
	
	public static void main(String[] args) {
		
		//프레임
		JFrame frame = new JFrame("레이아웃 예제");
		frame.setSize(300, 120);
		frame.setLocation(200, 100);
		
		//버튼
		JButton button1 = new JButton("북");
		frame.add(button1, BorderLayout.NORTH);
		
		JButton button2 = new JButton("남");
		frame.add(button2, BorderLayout.SOUTH);
		
		JButton button3 = new JButton("동");
		frame.add(button3, BorderLayout.EAST);
		
		JButton button4 = new JButton("서");
		frame.add(button4, BorderLayout.WEST);
		
		JButton button5 = new JButton("중");
		frame.add(button5, BorderLayout.CENTER);
	
		//디스플레이
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
