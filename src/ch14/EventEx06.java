package ch14;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import sun.misc.Perf.GetPerfAction;

public class EventEx06 extends JFrame{

	int imgX = 280;
	int imgY = 20;
	
	public EventEx06() {
		setTitle("장풍 예제");
		setSize(700, 300);
		setLocationRelativeTo(null); // 프레임이 화면 가운데 배치
		setContentPane(new MyPanel());
		setVisible(true);
	}
	
	// paintComponent 함수는 JFrame안에서 작동안함.
	class MyPanel extends JPanel {

		public MyPanel() {
			setFocusable(true);
			this.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					System.out.println("keycode : "+e.getKeyCode());
					System.out.println("keychar : "+e.getKeyChar());
					switch (e.getKeyCode()) {
					case KeyEvent.VK_LEFT: //0x25
						imgX = imgX - 10;
						break;
					case KeyEvent.VK_RIGHT: //0x27
						imgX = imgX + 10;
						break;
					case KeyEvent.VK_SPACE: //0x20
						new Thread(new Runnable() {
							
							@Override
							public void run() {
								int time = 20;
								while(time > 0) {
									imgX = imgX + 10;
									time--;
									try {
										Thread.sleep(100);
									} catch (InterruptedException e1) {
										e1.printStackTrace();
									}
									repaint();
								}
							}
						}).start();
						break;
					}

					repaint();
				}
			});
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			ImageIcon imgRyu = new ImageIcon("img/ryu.png");
			ImageIcon imgPa = new ImageIcon("img/pa.png");
			
			// 이미지 추출
			Image ryu = imgRyu.getImage();
			Image pa = imgPa.getImage();
			
			g.drawImage(ryu, 0,0,null);
			g.drawImage(pa, imgX, imgY, null);
		}
	}
	
	public static void main(String[] args) {
		new EventEx06();
	}

}
