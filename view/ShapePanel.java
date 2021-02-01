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
	private JButton randonShapeButton;
	private JButton exitButton;

	public ShapePanel(JFrame window){
		this.window = window;
	}
	
	public void init(){
		Container cp = window.getContentPane();
		JPanel southPanel = new JPanel();
		cp.add(BorderLayout.SOUTH, southPanel);

		randonShapeButton = new JButton("Random Shapes");
		exitButton = new JButton("Exit");
		southPanel.add(randonShapeButton);
		southPanel.add(exitButton);

		//canvas
		canvas = new ShapeCanvas(this);
		cp.add(BorderLayout.CENTER, canvas);

		//event Listener
		ShapeEventListener listener = new ShapeEventListener(this);
		randonShapeButton.addActionListener(listener);
		exitButton.addActionListener(listener);

	}

	public JButton getRandomShapeButton(){
		return randonShapeButton;
	}

	public JButton getExitButton(){
		return exitButton;
	}

	public ShapeCanvas getCanvas(){
		return canvas;
	}

	public JFrame getWindow(){
		return window;
	}
	
}
