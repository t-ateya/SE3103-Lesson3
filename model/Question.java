package model;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Font;

public class Question {
	private String text; //Question
	private String answer;

	public Question(String text, String answer){
		setText(text);
		setAnswer(answer);
	}

	public String getText(){
		return text;
	}

	public void setText(String text){
		this.text = text;
	}

	public String getAnswer(){
		return answer;
	}

	public void setAnswer(String answer){
		this.answer = answer;
	}

	public boolean checkAnswer(String response){
		return response.equalsIgnoreCase(answer);
	}

	public void diplay(){
		System.out.println(text);
	}

	public void render(Graphics2D g2){
		g2.setColor(Color.yellow);
		g2.setFont(new Font("Courier", Font.BOLD, 14));
		g2.drawString(text, 50, 100); //location, x =50, y =100
	}
	
}
