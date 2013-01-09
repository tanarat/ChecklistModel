package org.silk.db;

import org.silk.checklist.model.Answer;

public class AnswerDbService {
	private AnswerDao dao;
	
	
	public AnswerDbService(AnswerDao dao) {
		super();
		this.dao = dao;
	}


	public void save(Answer answer){
		dao.save(answer);
	}
	public Answer getById(long answerId){
		return dao.get(answerId);
	}
}
