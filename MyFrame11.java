package Assignment;
import javax.swing.*;
import java.awt.*;
public class MyFrame11 extends JFrame{
	JPanel p = new JPanel();
	JLabel[] labels = new JLabel[30];
	public MyFrame11() {
		p.setLayout(null);
		p.setBackground(Color.YELLOW);
		for(int i=0; i<30; i++) {
			labels[i] = new JLabel(""+i);
			int x = (int)(500*Math.random());
			int y = (int)(200*Math.random());
			labels[i].setForeground(Color.MAGENTA);
			labels[i].setLocation(x, y);
			labels[i].setSize(20, 20);
			p.add(labels[i]);
		}
		this.setSize(520, 220);
		add(p);
		setVisible(true);
	}
	public static void main(String[] args) {
		MyFrame11 f = new MyFrame11();
	}
}

