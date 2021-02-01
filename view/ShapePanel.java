package view;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.ShapeEventListener;

public class ShapePanel {
	private JFrame window;
	private ShapeCanvas canvas;

	public ShapePanel(JFrame window){
		this.window = window;
	}
	
	public void init(){
		Container cp = window.getContentPane();
		JPanel southPanel = new JPanel();
		cp.add(BorderLayout.SOUTH, southPanel);

		JButton randonShapeButton = new JButton("Random Shapes");
		JButton exiButton = new JButton("Exit");
		southPanel.add(randonShapeButton);
		southPanel.add(exiButton);

		//canvas
		canvas = new ShapeCanvas(this);
		cp.add(BorderLayout.CENTER, canvas);

		//event Listener
		ShapeEventListener listener = new ShapeEventListener(this);
		randonShapeButton.addActionListener(listener);
		exiButton.addActionListener(listener);

		
	}

	public ShapeCanvas getCanvas(){
		return canvas;
	}
	
}
