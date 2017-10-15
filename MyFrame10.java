package Assignment;
import javax.swing.*;
import java.awt.*;
public class MyFrame10 extends JFrame{
	JPanel p1;
	public MyFrame10() {
		this.setSize(300, 200);
		this.setTitle("My Frame10");
		p1 = new JPanel(new FlowLayout());
		for(int i=0; i<10; i++)
			p1.add(new JButton("Button"+i));
		add(p1);
		this.setVisible(true);
	}

	public static void main(String[] args) {
	MyFrame10 f = new MyFrame10();
	}
}
