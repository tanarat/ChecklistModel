package org.silk.checklist.model;

import java.util.ArrayList;
import java.util.List;

public class Item {
	private long id;
	private String key;
	private String title;
	private String subGroupName;
	private List<String> noReasons = new ArrayList<String>();
	
	public Item() {
		super();
	}


	public Item(String key, String title) {
		super();
		this.key = key;
		this.title = title;
	}


	public Item(String key, String title, List<String> noReasons) {
		super();
		this.key = key;
		this.title = title;
		this.noReasons = noReasons;
	}


	public Item(long id, String key, String title, List<String> noReasons) {
		super();
		this.id = id;
		this.key = key;
		this.title = title;
		this.noReasons = noReasons;
	}
	

	public Item(long id, String key, String title, String subGroupName,
			List<String> noReasons) {
		super();
		this.id = id;
		this.key = key;
		this.title = title;
		this.subGroupName = subGroupName;
		this.noReasons = noReasons;
	}


	public String getKey() {
		return key;
	}


	public void setKey(String key) {
		this.key = key;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	public List<String> getNoReasons() {
		return noReasons;
	}


	public void setNoReasons(List<String> noReasons) {
		this.noReasons = noReasons;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getSubGroupName() {
		return subGroupName;
	}


	public void setSubGroupName(String subGroupName) {
		this.subGroupName = subGroupName;
	}

}
