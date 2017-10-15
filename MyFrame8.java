package Assignment;
import javax.swing.*;
import java.awt.*;
public class MyFrame8 extends JFrame{
	public MyFrame8() {
		this.setTitle("GrdLayout");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(0,3));
		add(new JButton("Button1"));
		add(new JButton("Button2"));
		add(new JButton("Button3"));
		add(new JButton("B4"));
		add(new JButton("Long Button5"));
		pack();
		this.setVisible(true);
	}
	public static void main(String[] args) {
		MyFrame8 f = new MyFrame8();
	}
}
