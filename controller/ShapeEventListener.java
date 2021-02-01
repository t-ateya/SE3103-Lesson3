package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.ShapePanel;

public class ShapeEventListener implements ActionListener {
	private ShapePanel panel;
	public ShapeEventListener(ShapePanel panel){
		setPanel(panel);

	}

	public ShapePanel getPanel() {
		return panel;
	}
	public void setPanel(ShapePanel panel) {
		this.panel = panel;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		

	}
	
}
