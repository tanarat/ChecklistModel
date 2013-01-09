package org.silk.checklist.model;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Group {
	private String groupKey;
	private String groupName;
	private Map<String, Item> items = new LinkedHashMap<String, Item>();

	public Group() {
		super();
	}
	public Group(String key, String name) {
		super();
		this.groupKey = key;
		this.groupName = name;
	}
	public Group(String key, String name, Map<String, Item> items) {
		super();
		this.groupKey = key;
		this.groupName = name;
		this.items = items;
	}
	public void addItem(Item newItem){
		items.put(newItem.getKey(), newItem);
	}
	public Item getItem(String key){
		return items.get(key);
	}
	public int numberOfItems(){
		return items.size();
	}
	public String getGroupKey() {
		return groupKey;
	}
	public void setGroupKey(String key) {
		this.groupKey = key;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String name) {
		this.groupName = name;
	}
	public Map<String, Item> getItems() {
		return items;
	}
	public void setItems(Map<String, Item> items) {
		this.items = items;
	}



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
