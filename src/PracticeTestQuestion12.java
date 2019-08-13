import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PracticeTestQuestion12 implements ActionListener{
	JFrame frame=new JFrame();
	JLabel label=new JLabel();
	JPanel panel=new JPanel();
	JButton button=new JButton();
	JButton button1=new JButton();
	JTextField textfield=new JTextField(15);
public static void main(String[] args) {
	PracticeTestQuestion12 pq=new PracticeTestQuestion12();
	pq.GUI();
}
void GUI(){ 
frame.setVisible(true);	
frame.add(panel);
panel.add(label);
panel.add(button);
panel.add(button1);
panel.add(textfield);
label.setText("Why couldn't Goldilocls sleep?");
button.setText("submit");
button.addActionListener(this);
button1.setText("hint");
button1.addActionListener(this);
frame.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==button) {
		if(textfield.getText().equals("Because of nightbears")) {
			JOptionPane.showMessageDialog(null, "correct!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry, that was incorrect");
		}
	}
	else if(e.getSource()==button1){
		JOptionPane.showMessageDialog(null, "What is a character in FNAF that is similar to Goldiloc's story?");
	}
}
}
