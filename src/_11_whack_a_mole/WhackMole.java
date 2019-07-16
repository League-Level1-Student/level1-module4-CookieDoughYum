package _11_whack_a_mole;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class WhackMole implements ActionListener{
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	int molesWhacked=0;
	int missed=0;
	static WhackMole wm = new WhackMole();
	Date timeAtStart=new Date();
	int ra;
public static void main(String[] args) {
	wm.GUI();
	wm.drawButtons();
}
void GUI() {
	frame.setVisible(true);
	frame.add(panel);
    frame.setSize(420, 220);
}
void drawButtons() {
	ra = new Random().nextInt(23);
	for(int i=0; i<24; i++) {
		JButton button=new JButton();
		panel.add(button);
		button.addActionListener(this);
		if(ra==i) {
			button.setText("mole!");
		}
	}
}

//void drawButtons(Random r) {

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	molesWhacked+=1;
	if(molesWhacked==10) {
		endGame(timeAtStart, 10);
	}
	if(!e.getSource().equals(ra)) {
		missed+=1;
		if(missed==1) {
		speak("you missed!");
		frame.remove(panel);
		panel=new JPanel();
        wm.drawButtons();
		}
		if(missed==2) {
			speak("do better next time!");
			frame.dispose();
			wm.drawButtons();
		}
		if(missed==3) {
			speak("I can't believe you missed again!");
			frame.dispose();
			wm.drawButtons();
		}
		if(missed==4) {
			speak("Too bad you keep missing");
			frame.dispose();
			wm.drawButtons();
		}
		if(missed==5) {
			speak("Sorry, you lost!");
			System.exit(1);
			frame.dispose();
			wm.drawButtons();
		}
	}
	else if(e.getSource().equals(ra)) {
		playSound("nail.wav");
		frame.dispose();
		GUI();
	}
}
private void playSound(String fileName) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
    sound.play();
}
void speak(String words) {
    try {
         Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
         e.printStackTrace();
    }
}
private void endGame(Date timeAtStart, int molesWhacked) {
    Date timeAtEnd = new Date();
    JOptionPane.showMessageDialog(null, "Your whack rate is "
         + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
         + " moles per second.");
}

}
