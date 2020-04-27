package ch11;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame {
	
	Container c;
	public MyFrame() {
		this(500,500);
	}
	public MyFrame(int w, int h) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		setSize(w, h);
	}
}

class BFrame extends MyFrame {
	public BFrame() {
		setVisible(true);
	}
}

public class AFrame extends MyFrame{

	public AFrame() {
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("화면이동");
		c.add(btn);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new BFrame();
			}
		});
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new AFrame();

	}

}
