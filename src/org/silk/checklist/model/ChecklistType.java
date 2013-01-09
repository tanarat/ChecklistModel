package org.silk.checklist.model;

import java.util.HashSet;
import java.util.Set;

public class ChecklistType {
	private long id;
	private String name;
	private Set<Long> naItems = new HashSet<Long>();
	
	
	public ChecklistType() {
		super();
	}
	public ChecklistType(long id, String name) {
		super();
		this.id = id;
		this.name = name;

	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void putNAItem(long naItemId){
		naItems.add(naItemId);
	}
	
}
