package view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelViewerPopUp extends JPanel{
	private int[][] coordinates;
	public PanelViewerPopUp() {
		super(new GridLayout(5,5));
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				JPanel label = new JPanel();
				label.setSize(20,20);
				label.setBorder(BorderFactory.createLineBorder(Color.black));
				this.add(label);
			}
		}
	}
	
	public void setCoordinates(int[][] coordinates) {
		this.coordinates = coordinates;
	}
	
	public int[][] getCoordinates() {
		return this.coordinates; 
	}
	
}
