package org.silk.db;

import java.util.List;

import org.silk.checklist.model.Sheet;

public interface SheetDao {
	void save(Sheet sheet);
	Sheet getById(long sheetId);
	List<Sheet> list();
}
