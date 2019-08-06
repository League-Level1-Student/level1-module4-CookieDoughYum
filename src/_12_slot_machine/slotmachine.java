package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class slotmachine implements ActionListener{
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JButton button=new JButton("Spin!");
	int reel1;
	int reel2;
	int reel3;
	static slotmachine sm=new slotmachine();
	JLabel slot1=new JLabel();
	JLabel slot2=new JLabel();
	JLabel slot3=new JLabel();
public static void main(String[] args) {
	sm.GUI();
}

void GUI(){
frame.setVisible(true);	
frame.add(panel);
panel.add(button);
button.addActionListener(this);
frame.pack();
}

void Remove() {
	frame.remove(panel);
	panel=new JPanel();
	frame.add(panel);
	panel.add(button);
	panel.remove(slot1);
    panel.remove(slot2);
	panel.remove(slot3);
	button.removeActionListener(this);;
}
void spinMachine() {
	reel1=new Random().nextInt(3)+1;
	reel2=new Random().nextInt(3)+1;
	reel3=new Random().nextInt(3)+1;
}

private JLabel createLabelImage(String fileName) throws MalformedURLException{
    URL imageURL = getClass().getResource(fileName);
if (imageURL == null){
	System.err.println("Could not find image " + fileName);
	return new JLabel();
}
Icon icon = new ImageIcon(imageURL);
JLabel imageLabel = new JLabel(icon);
return imageLabel;
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	Remove();
	GUI();
	sm.spinMachine();
	if(reel1==1) {
		try {
			slot1=createLabelImage("funnelcake.jpg");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	else if(reel1==2) {
		try {
			slot1=createLabelImage("cottoncandy.jpg");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	else if(reel1==3) {
		try {
			slot1=createLabelImage("icecream.jpg");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	if(reel2==1) {
		try {
			slot2=createLabelImage("funnelcake.jpg");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	else if(reel2==2) {
		try {
			slot2=createLabelImage("cottoncandy.jpg");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	else if(reel2==3) {
		try {
			slot2=createLabelImage("icecream.jpg");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	if(reel3==1) {
		try {
			slot3=createLabelImage("funnelcake.jpg");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	else if(reel3==2) {
		try {
			slot3=createLabelImage("cottoncandy.jpg");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	else if(reel3==3) {
		try {
			slot3=createLabelImage("icecream.jpg");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	if(reel1==reel2 && reel2==reel3) {
		JOptionPane.showMessageDialog(null, "You win!");
	}
	panel.add(slot1);
	panel.add(slot2);
	panel.add(slot3);
	frame.pack();
	System.out.println(reel1);
	System.out.println(reel2);
	System.out.println(reel3);
	System.out.println("-");
}

}
