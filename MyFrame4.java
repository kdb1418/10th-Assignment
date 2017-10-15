package Assignment;
import javax.swing.*;
import java.awt.*;
public class MyFrame4 extends JFrame{
	public MyFrame4() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		this.setSize(300, 200);
		this.setLocation(screenSize.width/2, screenSize.height/2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("MyFrame4");
		Image img = kit.getImage("car.gif");
		this.setIconImage(img);
		this.setLayout(new FlowLayout());
		JButton button = new JButton("¹öÆ°");
		this.add(button);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		MyFrame4 f = new MyFrame4();
	}
}
