import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TcpChatThread extends Thread{
	private String userid;
	private Frame f;
	private TextArea ta;
	private TextField tf;
	private Font font;
	
	public TcpChatThread(String userid) {
		this.userid = userid;
		this.font = new Font("¸¼Àº °íµñ", Font.PLAIN, 30);
		this.f = new Frame("[" + this.userid + "] MyChatting v1");
		this.ta = new TextArea("", 5, 10, TextArea.SCROLLBARS_BOTH);
		this.ta.setFont(font);
		this.ta.setEditable(false);
		
		this.tf = new TextField();
		this.tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {  //event handler
				String line = TcpChatThread.this.tf.getText();
				TcpChatThread.this.ta.append(line + "\n");
				TcpChatThread.this.tf.setText("");
			}
		});
		this.tf.setFont(font);
		this.f.add(ta, "Center");
		this.f.add(tf, "South");
		this.service();
		this.f.setSize(500, 800);
		this.f.setVisible(true);
	}
	private void service() {
		
	}
	@Override
	public void run() {
		//¼ö½ÅÃ³¸®
	}
}
