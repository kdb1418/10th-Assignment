package Assignment;
import javax.swing.*;
import java.awt.*;
public class MyFrame3 extends JFrame{
	public MyFrame3() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("MyFrame3");
		this.setLayout(new FlowLayout());
		JButton button = new JButton("¹öÆ°");
		this.add(button);
		this.setVisible(true);
	}
}
