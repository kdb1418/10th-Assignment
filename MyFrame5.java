package Assignment;
import javax.swing.*;
import java.awt.*;
public class MyFrame5 extends JFrame{
	public MyFrame5() {
		this.setSize(600, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("MyFrame5");
		JPanel panel = new JPanel();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label1 = new JLabel("�ڹ� ���ڿ� ���� ���� ȯ���մϴ�. ������ ������ �����Ͻÿ�.");
		panel1.add(label1);
		JButton button1 = new JButton("�޺�����");
		JButton button2 = new JButton("������������");
		JButton button3 = new JButton("�Ұ������");
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		JLabel label2 = new JLabel("����");
		JTextField field = new JTextField(10);
		panel2.add(label2);
		panel2.add(field);
		panel.add(panel1);
		panel.add(panel2);
		this.add(panel);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		MyFrame5 f= new MyFrame5();
	}
}
