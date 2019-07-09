package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
//on step 2
public class WhackMole implements ActionListener{
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
public static void main(String[] args) {
	Random r=new Random(23);
}
void GUI() {
	frame.setVisible(true);
	frame.add(panel);
	for(int i=0; i<24; i++) {
		JButton button=new JButton();
		panel.add(button);
		button.addActionListener(this);
	}
}
void drawButtons(r) {
	drawButtons.GUI();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
