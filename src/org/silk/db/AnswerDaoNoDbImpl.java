package org.silk.db;

import org.silk.checklist.model.Answer;

public class AnswerDaoNoDbImpl implements AnswerDao{
	static long savedId;
	@Override
	public void save(Answer answer) {
		// TODO Auto-generated method stub
		if(answer.getAnswerId() == 0){ //first save
			insert(answer);
		}else{ // update answer
			update(answer);
		}

	}

	private void insert(Answer answer){
		answer.setAnswerId(++savedId);
		System.out.println("insert new Answer : " + answer.toString());

	}
	private void update(Answer answer){
		System.out.println("update Answer : " + answer.toString());

	}

	@Override
	public Answer get(long answerId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
