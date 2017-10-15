package Assignment;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Calculator extends JFrame implements ActionListener{
	private JPanel panel;
	private JTextField tField;
	private JTextField result;
	private String temp="";
	private JButton[] buttons;
	private String n ="";
	private String[] labels = { 
			"Backspace", "", "", "CE", "C",
			"7", "8", "9", "/", "sqrt",
			"4", "5", "6", "*", "%",
			"1", "2", "3", "-", "1/x",
			"0", "+/-", ".", "+", "=",
	};
	public Calculator() {
		tField = new JTextField(35);
		result = new JTextField(35);
		panel = new JPanel();	
		panel.setLayout(new GridLayout(0, 5, 3, 3));
		buttons = new JButton[25];
		int index = 0;
		for (int rows = 0; rows < 5; rows++) {
			for (int cols = 0; cols < 5; cols++) {
				buttons[index] = new JButton(labels[index]);
				buttons[index].addActionListener(this);
				if( cols >= 3 )
					buttons[index].setForeground(Color.red);
				else 
					buttons[index].setForeground(Color.blue);
				buttons[index].setBackground(Color.yellow);
				panel.add(buttons[index]);
				index++;
			}
		}
		add(result, BorderLayout.SOUTH);
		add(tField, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		setVisible(true);
		pack();
	}
	public void actionPerformed(ActionEvent e) {
		String txt = e.getActionCommand();
		switch(txt) {
			case "1":case "2":case "3":case "4":case "5":
			case "6":case "7":case "8":case "9":case "0":
				tField.setText(tField.getText()+txt); temp += txt; break;
			case "Backspace":
				if(tField.getText().length()<1) tField.setText("0");
				else if(tField.getText().length()==1) {
					tField.setText("0");
					temp = temp.substring(0, temp.length()-1);
				}else {
				tField.setText(tField.getText().substring(0,tField.getText().length()-1));
				temp = temp.substring(0, temp.length()-1);} break;
			case "CE":
				tField.setText("0");
				n = this.findLToken(temp);
				temp = temp.substring(0, temp.length()-n.length());break;
				
			case "C": tField.setText("0"); temp = ""; break;
			case "sqrt":
				n = this.findLToken(temp);
				tField.setText(""+Math.sqrt(Double.parseDouble(n)));//위의 토큰의 제곱근 
				if(temp.length()>=n.length())
					temp = temp.substring(0, temp.length()-n.length());//토큰만큼제거 
				temp += Math.sqrt(Double.parseDouble(n));//제곱근 추가
				break;
			case "+": case"-": case"*": case"/": case"%":
				tField.setText(txt);
				temp += txt; break;
			case "1/x":	
				n = this.findLToken(temp);
				tField.setText(""+1/(Double.parseDouble(n)));
				if(temp.length()>=n.length())
					temp = temp.substring(0, temp.length()-n.length());//토큰만큼제거 
				temp += 1/(Double.parseDouble(n));
				break;
			case "=":
				Token d = new Token(temp);
				tField.setText(""+d.getResult());
				result.setText("");
				temp = "";
				temp = ""+d.getResult();
				break;
			case ".":
				temp += txt; tField.setText(tField.getText()+txt); break;
			case "+/-":
				String n4 = this.findLToken(temp);
				if(temp.length()>=n4.length())
					temp = temp.substring(0, temp.length()-n4.length());
				if(Double.parseDouble(n4)>0) {
					double p = Double.parseDouble("-"+n4);
					temp += "("+p+")";
					tField.setText("("+p+")");
				}
		}
	}
	public String findLToken(String temp) {
		StringTokenizer  s4 = new StringTokenizer (temp, "+,-,*,/,=,%");
		String n5 = "";
		for(int i=0; i<s4.countTokens(); i++) //마지막 토큰
			n5 = s4.nextToken();
		return n5;
	}
  
	public static void main(String args[]) {
		Calculator a = new Calculator();
	}
}
