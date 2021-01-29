package model;

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
	
}
