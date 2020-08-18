import java.awt.Canvas;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Calendar;

import javax.swing.JFrame;

public class SleepDemo extends Thread{
	private JFrame f;
	private MyCanvas canvas;
	private Container con;
	SleepDemo(){
		f = new JFrame("Digital Watch");
		con = f.getContentPane();
		canvas = new MyCanvas();
	}
	private class MyCanvas extends Canvas{
		private java.util.Calendar cal;
		@Override
		public void paint(Graphics g){
			cal = Calendar.getInstance();
			String str = String.format("%tT", cal);
			g.drawString(str, 50, 50);
		}
	}
	private void display(){
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Font font = new Font("Arial", Font.BOLD, 50);
		this.canvas.setFont(font);
		con.add("Center", canvas);
		f.setSize(500,200);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		SleepDemo sd = new SleepDemo();
		sd.display();
		sd.start();
	}
	@Override
	public void run(){
		try{
			while(true){
				Thread.sleep(2000);
				this.canvas.repaint();
			}
		}catch(Exception ex){}
	}
}