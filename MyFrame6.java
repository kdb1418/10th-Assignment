package Assignment;
import javax.swing.*;
import java.awt.*;
public class MyFrame6 extends JFrame{
	public MyFrame6() {
		this.setTitle("FlowLayoutTest");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel.add(new JButton("Button1"));
		panel.add(new JButton("Button2"));
		panel.add(new JButton("Button3"));
		panel.add(new JButton("B4"));
		panel.add(new JButton("Long Button5"));
		add(panel);
		pack();
		setVisible(true);
	}
	public static void main(String[] args) {
		MyFrame6 f= new MyFrame6();
	}
}
