package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener{
	JButton Add=new JButton("add");
	JButton Sub=new JButton("sub");
	JButton Mul=new JButton("mul");
	JButton Div=new JButton("div");
	JLabel answer=new JLabel();
	JTextField Input1=new JTextField(10);
	JTextField Input2=new JTextField(10);
	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.GUI();
	}
	void GUI() {
		JFrame frame=new JFrame();
		frame.setVisible(true);
		JPanel panel=new JPanel();
		frame.add(panel);
		panel.add(Input1);
		panel.add(Input2);
		panel.add(Add);
		panel.add(Sub);
		panel.add(Mul);
		panel.add(Div);
		Add.addActionListener(this);
		Sub.addActionListener(this);
		Mul.addActionListener(this);
		Div.addActionListener(this);
		panel.add(answer);
		frame.pack();
	}
	
double add(double Input1, double Input2){
	return Input1+Input2;
}
double subtract(double Input1, double Input2){
	return Input1-Input2;
}
double multiply(double Input1, double Input2){
	return Input1*Input2;
}
double divide(double Input1, double Input2){
	return Input1/Input2;
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	double left=Double.parseDouble(Input1.getText());
	double right=Double.parseDouble(Input2.getText());
	if(e.getSource().equals(Add)) {
		answer.setText(""+add(left, right));
	}
	else if(e.getSource().equals(Sub)) {
		answer.setText(""+subtract(left, right));
	}
	else if(e.getSource().equals(Mul)) {
		answer.setText(""+multiply(left, right));
	}
	else if(e.getSource().equals(Div)) {
		answer.setText(""+divide(left, right));
	}
}
}
