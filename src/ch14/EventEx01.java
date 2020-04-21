package ch14;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class EventEx01 extends JFrame{

	public EventEx01() {
		setTitle("Action 이벤트 리스너 예제");
		// X버튼 클릭시 이벤트 분배 스레드 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		// 리스너 생성
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		setSize(350,  150);
		setVisible(true); // paint() 함수 호출 해줌.
	} // end of 생성자
	
	public static void main(String[] args) {
		new EventEx01();
	}

}

class MyActionListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		//Object를 리턴 => 다운 캐스팅하기
		JButton b = (JButton) e.getSource();
		if(b.getText().equals("Action")) {
			b.setText("액션"); // repaint()
		}else {
			b.setText("Action"); // repaint()
		}
	}
}