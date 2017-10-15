package Assignment;
import javax.swing.*;
import java.awt.*;
public class MyFrame7 extends JFrame{
	public MyFrame7() {
		this.setTitle("borderLayoutTest");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		add(new JButton("Center"), BorderLayout.CENTER);
		add(new JButton("Line Start"), BorderLayout.LINE_START);
		add(new JButton("Line End"), BorderLayout.LINE_END);
		add(new JButton("Page Start"), BorderLayout.PAGE_START);
		add(new JButton("Page End"), BorderLayout.PAGE_END);
		pack();
		this.setVisible(true);
	}
	public static void main(String[] args) {
		MyFrame7 f = new MyFrame7();
	}
}
