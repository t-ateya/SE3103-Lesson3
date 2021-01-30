package test;

import java.util.ArrayList;

import model.Question;
import model.QuestionBank;

public class QuestionTest {
	public static void main (String[] args){

		ArrayList<Question> db = QuestionBank.database;
		Question q1 = db.get(0);
		q1.diplay();
		//Question q1 = db.get(0);
		assert !q1.checkAnswer("Bill Gate"); 
		assert q1.checkAnswer("James Gosling");
		assert q1.checkAnswer("james gosling"); 

		Question q2 = db.get(1);
		q2.diplay();
		assert q2.checkAnswer("edmond");
		assert !q2.checkAnswer("Tulsa");

		Question q3 =db.get(2);
		q3.diplay();
		assert q3.checkAnswer("2");
		assert !q3.checkAnswer("1");

		Question q4 = db.get(3);
		q4.diplay();
		assert q4.checkAnswer("4");
		assert !q4.checkAnswer("4");

	
		
	}
	
}
