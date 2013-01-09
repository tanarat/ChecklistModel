package org.silk.checklist.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ChecklistUtil {
	/*
	 * for csv file
	 */
	private static String delim = "|"; 

	public static Checklist createFromCSV(InputStream in){
		int id = 0;
		Scanner scanner = new Scanner(in);
		Checklist checklist = new Checklist();
		while(scanner.hasNextLine()){
			String line = scanner.nextLine();
			StringTokenizer token = new StringTokenizer(line, delim);
			
			String groupKey = token.nextToken();
			String groupName = token.nextToken();
			
			Group group = new Group(groupKey, groupName);
			String subGroupName = token.nextToken();
			String itemKey = token.nextToken();
			String itemTitle = token.nextToken();
			
			List<String> noReasons = new ArrayList<String>();
//			number of no reasons
			int no = Integer.parseInt(token.nextToken());
			for(int i=0; i<no; i++){
				noReasons.add(token.nextToken());
			}
			Item item = new Item(id++, itemKey, itemTitle, subGroupName, noReasons);
			
			
			if(!checklist.exists(group)){
				checklist.addGroup(group);
			}
			
			checklist.addItem(item,group);
		}
		return checklist;
	}
	
	public static Checklist createFromCSV(File csvFile) throws FileNotFoundException{
		int id = 0;
		Scanner scanner = new Scanner(csvFile);
		Checklist checklist = new Checklist();
		while(scanner.hasNextLine()){
			String line = scanner.nextLine();
			StringTokenizer token = new StringTokenizer(line, delim);
			
			String groupKey = token.nextToken();
			String groupName = token.nextToken();
			
			Group group = new Group(groupKey, groupName);
			String subGroupName = token.nextToken();
			String itemKey = token.nextToken();
			String itemTitle = token.nextToken();
			
			List<String> noReasons = new ArrayList<String>();
//			number of no reasons
			int no = Integer.parseInt(token.nextToken());
			for(int i=0; i<no; i++){
				noReasons.add(token.nextToken());
			}
			Item item = new Item(id++, itemKey, itemTitle, subGroupName, noReasons);
			
			
			if(!checklist.exists(group)){
				checklist.addGroup(group);
			}
			
			checklist.addItem(item,group);
		}
		return checklist;
	}

}
