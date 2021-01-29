package test;

import java.util.ArrayList;

import model.Question;
import model.QuestionBank;

public class QuestionTest {
	public static void main (String[] args){

		ArrayList<Question> db = QuestionBank.database;
		Question q1 = db.get(0);
		assert q1.checkAnswer("Bill Gate") == false; 
		assert q1.checkAnswer("James Gosling") == false;
		assert q1.checkAnswer("james gosling") == true; 
		
	}
	
}
