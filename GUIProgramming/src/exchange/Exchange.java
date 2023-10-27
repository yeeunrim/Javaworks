package exchange;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exchange extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1000L;
	
	//필드
	String[] currency = {"달러($)", "위안(¥)", "유로(€)", "엔(¥)"};
	static final float USD = 1357.50F; //미국 달러 환율
	static final float CNY = 185.58F; //중국 위안 환율
	static final float EUR = 1432.43F; //유럽 유로 환율
	static final float JPY = 904.01F; //일본 엔화 환율 (100엔 기준)
	 
	JPanel panel1;
	JPanel panel2;
	JLabel label1;
	JTextField text;
	JComboBox<String> comboBox;
	JButton button;
	JLabel label2;
	
	//생성자
	public Exchange( ) {
		//frame(this) 생성
		this.setTitle("환율 변환기");
		this.setSize(400, 120);
		this.setLocation(200, 100);
		
		//1. Panel 2개 생성 - 위쪽, 가운데 배치
		panel1 = new JPanel();
		this.add(panel1, BorderLayout.NORTH);
		
		panel2 = new JPanel();
		this.add(panel2, BorderLayout.CENTER);
		
		//2. Panel1의 올릴 객체 생성 및 추가
		label1 = new JLabel("입력(₩)");
		text = new JTextField(7);
		comboBox = new JComboBox<String>(currency);
		button = new JButton("변환");
		
		panel1.add(label1);
		panel1.add(text);
		panel1.add(comboBox);
		panel1.add(button);
		
		//3. panel2의 올릴 객체 생성 및 추가
		label2 = new JLabel("변환 결과 > ");
		
		panel2.add(label2);
		
		//4. 변환 버튼 이벤트
		button.addActionListener(this);
		
		//5. 글꼴 변경
		label1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		text.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		label2.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		
		//디스플레이
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == button) {
			
			float won = Float.parseFloat(text.getText());
			String currency = (String)comboBox.getSelectedItem();
			
			if(currency.equals("달러($)")) {
				won = won / USD;
//				label2.setText(String.valueOf(won));
				label2.setText(String.format("변환 결과 > %.2f$", won));
			} else if(currency.equals("위안(¥)")) {
				won = won / CNY;
				label2.setText(String.format("변환 결과 > %.2f¥", won));
			} else if(currency.equals("유로(€)")) {
				won = won / EUR;
				label2.setText(String.format("변환 결과 > %.2f€", won));
			} else {
				won = (won / JPY) * 100;
				label2.setText(String.format("변환 결과 > %.2f¥", won));
			}
		}
		
		
	}
	
} //class
