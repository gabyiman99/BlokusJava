package view;

//import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FramePopUp extends JFrame{
	public FramePopUp(int type) {
		super("PopUp" + type);
		PanelPopUp inside = new PanelPopUp(type);
		
		this.getContentPane().add(inside);
	
		this.pack();
		
	}
	public void showWindow() {
		this.setVisible(true);
	}
}
