package controller;

import javax.swing.JButton;
import javax.swing.JFrame;

import model.QuestionBank;
import view.MenuScreen;
import view.QuestionPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuestionButtonListener implements ActionListener {
	private QuestionPanel panel;

	public QuestionButtonListener(QuestionPanel panel) {
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		//System.out.println(button.getText());	
		if (button == panel.getQuitButton()){
			panel.getWindow().getContentPane().removeAll();
			var menu = new MenuScreen(panel.getWindow());
			menu.init();
			panel.getWindow().pack();
			panel.getWindow().revalidate();
		} else if (button == panel.getNexButton()){
			int index = panel.getCanvas().getQuestionIndex();
			++index;
			if (index == QuestionBank.database.size()){
				index = 0;
			}
			panel.getCanvas().setQuestionIndex(index);
			panel.getCanvas().repaint();  //To refresh the canvas
		}else if (button == panel.getPrevButton()){
			int index = panel.getCanvas().getQuestionIndex();
			--index;
			if (index <0){
				index = QuestionBank.database.size()-1;
			}
			panel.getCanvas().setQuestionIndex(index);
			panel.getCanvas().repaint();
		}

	}

	
	
}
