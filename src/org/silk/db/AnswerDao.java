package org.silk.db;

import org.silk.checklist.model.Answer;

public interface AnswerDao {

	void save(Answer answer);
	Answer get(long answerId);

}
