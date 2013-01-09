package org.silk.checklist.model;

import java.util.HashSet;
import java.util.Set;

public class Answer {
	private long answerId;
	private Item item;
	private int selectedChoice;
	private Set<Integer> selectedNoReasons = new HashSet<Integer>();
	private String remark;
	
	
	public Answer(Item item) {
		super();
		this.item = item;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public int getSelectedChoice() {
		return selectedChoice;
	}
	public void setSelectedChoice(int selectedChoice) {
		this.selectedChoice = selectedChoice;
	}
	
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public long getAnswerId() {
		return answerId;
	}
	public void setAnswerId(long answerId) {
		this.answerId = answerId;
	}
	public Set<Integer> getSelectedNoReasons() {
		return selectedNoReasons;
	}
	public void setSelectedNoReasons(Set<Integer> selectedNoReasons) {
		this.selectedNoReasons = selectedNoReasons;
	}
	@Override
	public String toString() {
		return "Answer [answerId=" + answerId + ", item=" + item
				+ ", selectedChoice=" + selectedChoice + ", selectedNoReasons="
				+ selectedNoReasons + ", remark=" + remark + "]";
	}

}
