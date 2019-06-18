package _03_jeopardy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener{
	JButton button=new JButton("joke");
	JButton button1=new JButton("punchline");
public static void main(String[] args) {
	new ChuckleClicker().makeButtons();
}
void makeButtons(){
	JFrame frame=new JFrame();
	frame.setVisible(true);
	JPanel panel=new JPanel();
	frame.add(panel);
    button.setName("joke");
    panel.add(button);
    button1.setName("punchline");
    panel.add(button1);
    button.addActionListener(this);
    button1.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==button) {
		JOptionPane.showMessageDialog(null, "Why did the nurse need a red pen at work? Because she needed to draw blood");
	}
	if(e.getSource()==button1) {
		JOptionPane.showMessageDialog(null, "Your hair looks like a porcupine. Haha cool");
	}
}
}
