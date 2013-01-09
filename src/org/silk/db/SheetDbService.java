package org.silk.db;


import java.util.List;

import org.silk.checklist.model.Sheet;

public class SheetDbService {
	private SheetDao dao;

	public SheetDbService(SheetDao dao) {
		super();
		this.dao = dao;
	}
	
	public Sheet getById(long sheetId){
		return dao.getById(sheetId);
	}
	public List<Sheet> list(){
		return dao.list();
	}

}
