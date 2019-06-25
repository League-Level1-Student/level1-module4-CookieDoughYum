import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener{
	JFrame frame=new JFrame();
	JPanel panel = new JPanel();
	JLabel label=new JLabel();
	char currentLetter;
	TypingTutor(){
		currentLetter = generateRandomLetter();
	}
public static void main(String[] args) {
	TypingTutor tt=new TypingTutor();
	tt.createGUI();
}
void createGUI() {
	frame.add(panel);
	panel.add(label);
	label.setFont(label.getFont().deriveFont(28.0f));
	frame.addKeyListener(this);
	frame.setSize(500, 500);
	label.setText(""+currentLetter);
	frame.setVisible(true);
}
char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println( " you typed: " + currentLetter);
	if(e.getKeyChar()==currentLetter) {
		System.out.println("Correct!");
		panel.setBackground(Color.green);
	}
	else {
		panel.setBackground(Color.red);
	}
	
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
     currentLetter=generateRandomLetter();
	label.setText(""+currentLetter);
}
}
