package view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelPopUp extends JPanel{
	public PanelPopUp(int type) {
		super(new BorderLayout());
		this.setPreferredSize(new Dimension(400,400));
		
		JLabel labelType = new JLabel("" + type);
		this.add(labelType);
		
		JButton rotate = new JButton("ROTATE");
		JButton flipHor = new JButton("FLIP HORIZONTAL");
		JButton flipVer = new JButton("FLIP VERTICAL");
		
		JPanel panelButton = new JPanel();
		
		panelButton.add(rotate);
		panelButton.add(flipVer);
		panelButton.add(flipHor);
		
		this.add(panelButton, BorderLayout.SOUTH);
		
		PanelViewerPopUp newPVPU = new PanelViewerPopUp();
		this.add(newPVPU, BorderLayout.CENTER);
		System.out.println("" + newPVPU.getCoordinates());
	}
}
