import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.Test;
import org.silk.checklist.model.Checklist;
import org.silk.checklist.model.ChecklistUtil;
import org.silk.checklist.model.Group;
import org.silk.checklist.model.Item;


public class TestChecklistUtil {

	@Test
	public void test() {
		File csvFile = new File("Checklist.csv");
		assertEquals(true, csvFile.exists());
		try {
			Checklist checklist = ChecklistUtil.createFromCSV(csvFile);
			assertEquals(2, checklist.numberOfGroups());
			assertEquals(17, checklist.numberOfItems());
			
			Group g5 = checklist.getGroup("5");
			Item item = g5.getItem("5.2.3.3");
			assertEquals("มีการประเมินและจัดการกับสุขภาพพนักงานที่เหมาะสม", item.getTitle());
			System.out.println(item.getNoReasons().toString());
			System.out.println(item.getSubGroupName());
			Item item2 = g5.getItem("5.2.3.4");
			System.out.println(item2.getNoReasons().toString());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testGetItemById(){
		File csvFile = new File("Checklist.csv");
		try {
			Checklist checklist = ChecklistUtil.createFromCSV(csvFile);
			Item item = checklist.getItem(16);
			assertEquals("มีการควบคุมสุขลักษณะส่วนบุคคลและสุขภาพของผู้เยี่ยมชมการผลิตอาหารฮาลาลที่เหมาะสม", item.getTitle());
			System.out.println(item.getTitle());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
