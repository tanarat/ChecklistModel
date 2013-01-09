package org.silk.checklist.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class Sheet {
	public static final int TIME_SLOT_0 = 0;
	public static final int TIME_SLOT_1 = 1;
	public static final String[] TIME_SLOTS = {"09:00 - 12:00", "13:00 - 16:00"};
	
	public static final int AUDIT_TYPE_0 = 0;
	public static final int AUDIT_TYPE_1 = 1;
	public static final int AUDIT_TYPE_2 = 2;
	public static final int AUDIT_TYPE_3 = 3;
	public static final String[] AUDIT_TYPES = {"ให้คำปรึกษา ครั้งที่ 1", 
												"ให้คำปรึกษา ครั้งที่ 2",
												"ตรวจประเมิน ครั้งที่ 1",
												"ตรวจประเมิน ครั้งที่ 2"};
	
	
	private long sheetId;
	private String sheetName;
	private Entrepreneur entrepreneur;
	private Date date;
	private int timeSlot;
	private int auditType;
	private Auditor auditor;
	private ChecklistType checklistType;
	private List<Answer> answers = new ArrayList<Answer>();
	
	public Sheet(){
		
	}
	
	public Sheet(String sheetName) {
		super();
		this.sheetName = sheetName;
	}

	
	public int numberOfAnswers(){
		return answers.size();
	}
	public Answer getAnswerForItem(Item item){
		for (Iterator<Answer> iterator = answers.iterator(); iterator.hasNext();) {
			Answer answer = iterator.next();
			if(item.getKey().equals(answer.getItem().getKey())){
				return answer;
			}
		}
		return null;
	}
	public String getSheetName() {
		return sheetName;
	}
	public void setSheetName(String sheetName) {
		this.sheetName = sheetName;
	}
	@Override
	public String toString() {
		return sheetName ;
	}

	public long getSheetId() {
		return sheetId;
	}

	public void setSheetId(long sheetId) {
		this.sheetId = sheetId;
	}

	public Entrepreneur getEntrepreneur() {
		return entrepreneur;
	}

	public void setEntrepreneur(Entrepreneur entrepreneur) {
		this.entrepreneur = entrepreneur;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(int timeSlot) {
		this.timeSlot = timeSlot;
	}

	public Auditor getAuditor() {
		return auditor;
	}

	public void setAuditor(Auditor auditor) {
		this.auditor = auditor;
	}

	public ChecklistType getChecklistType() {
		return checklistType;
	}

	public void setChecklistType(ChecklistType checklistType) {
		this.checklistType = checklistType;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public int getAuditType() {
		return auditType;
	}

	public void setAuditType(int auditType) {
		this.auditType = auditType;
	}
	
}
