package org.silk.checklist.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Checklist {
	private long id;
	private String checklistName;
	
	
	public static Map<String, Group> groups = new LinkedHashMap<String, Group>();
	
	public Checklist() {
		super();
	}

	public Checklist(String checklistName) {
		super();
		this.checklistName = checklistName;
	}


	public String getChecklistName() {
		return checklistName;
	}

	public void setChecklistName(String checklistName) {
		this.checklistName = checklistName;
	}

	public Map<String, Group> getGroups() {
		return groups;
	}

	public static void setGroups(Map<String, Group> groups) {
		Checklist.groups = groups;
	}

	public static void addGroup(Group newGroup){
		Checklist.groups.put(newGroup.getGroupKey(), newGroup);
	}
	
	public static Group getGroup(String groupKey){
		return Checklist.groups.get(groupKey);
	}
	
	public static int numberOfGroups(){
		return Checklist.groups.size();
	}
	
	public static int numberOfItems(){
		int numberOfItems = 0;
		for (Iterator<Group> iterator = groups.values().iterator(); iterator.hasNext();) {
			Group group = iterator.next();
			numberOfItems += group.numberOfItems();
		}
		return numberOfItems;
	}
	public static boolean exists(Group group){
		return groups.containsKey(group.getGroupKey());
	}
	public static void addItem(Item item, Group group){
		groups.get(group.getGroupKey()).addItem(item);
	}
	public static Item getItem(long itemId){
		List<Group> groupList = new ArrayList<Group>(groups.values());
		for (Iterator<Group> iterator = groupList.iterator(); iterator.hasNext();) {
			Group group = iterator.next();
			Map<String,Item> itemMap = group.getItems();
			List<Item> itemList = new ArrayList<Item>(itemMap.values());
			for (Iterator<Item> iterator2 = itemList.iterator(); iterator2.hasNext();) {
				Item item = iterator2.next();
				if(item.getId() == itemId){
					return item;
				}
			}
		}
		return null;
	}
	public static List<Item> getItems(){
		List<Item> items = new ArrayList<Item>();
		
		List<Group> groupList = new ArrayList<Group>(groups.values());
		for (Iterator<Group> iterator = groupList.iterator(); iterator.hasNext();) {
			Group group = iterator.next();
			Map<String,Item> itemMap = group.getItems();
			List<Item> itemList = new ArrayList<Item>(itemMap.values());
			for (Iterator<Item> iterator2 = itemList.iterator(); iterator2.hasNext();) {
				Item item = iterator2.next();
				items.add(item);
			}
		}
		
		return items;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
