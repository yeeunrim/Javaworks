package components;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxExample2 extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1000L;
	
	//필드
	String[] currency = {"달러", "위안", "유로", "엔"};
	JComboBox<String> comboBox;
	JLabel label;

	//생성자
	public ComboBoxExample2() {
		
		//프레임
		this.setTitle("목록 상자");
		this.setSize(300, 200);
		this.setLocation(200, 100);
		
		//컴포넌트 객체 생성
		comboBox = new JComboBox<>(currency);
		label = new JLabel("화페 단위를 선택해주세요.");
		
		//컴포넌트 배치 
		this.add(comboBox, BorderLayout.NORTH);
		this.add(label, BorderLayout.CENTER);
		
		//콤보 이벤트
		comboBox.addActionListener(this);
		
		//디스플레이
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new ComboBoxExample2();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e){

		String currency = (String)comboBox.getSelectedItem();
		label.setText(currency + "(을)를 선택했습니다.");
		
	}
	
}
