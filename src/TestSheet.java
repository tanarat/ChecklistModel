import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.silk.checklist.model.Answer;
import org.silk.checklist.model.Checklist;
import org.silk.checklist.model.ChecklistUtil;
import org.silk.checklist.model.Item;
import org.silk.checklist.model.Sheet;


public class TestSheet {

	@Test
	public void test() throws FileNotFoundException {
		File csvFile = new File("Checklist.csv");
		Checklist checklist = ChecklistUtil.createFromCSV(csvFile);
		
//		Sheet sheet  = new Sheet(checklist);
		Sheet sheet = new Sheet();
		
		List<Item> items = checklist.getItems();
		List<Answer> answers = new ArrayList<Answer>();
		for (Item item : items) {
			answers.add(new Answer(item));
		}
		sheet.setAnswers(answers);
		
		assertEquals(checklist.numberOfItems(), sheet.numberOfAnswers());
		
		Item searchItem = checklist.getItem(6);
		Answer foundAnswer =  sheet.getAnswerForItem(searchItem);
		assertEquals("มีระบบการสื่อสารเกี่ยวกับการผลิตอาหารฮาลาลในองค์กร เช่นการประชุม ประกาศ การทบทวนฝ่ายบริหาร", foundAnswer.getItem().getTitle());
		
		foundAnswer.setSelectedChoice(0);
		Set<Integer> selectedNoReasons = new HashSet<Integer>();
		selectedNoReasons.add(0);
		selectedNoReasons.add(1);
		foundAnswer.setSelectedNoReasons(selectedNoReasons);
		foundAnswer.setRemark("ไม่มีการใช้งานที่เหมาะสม");
	}

}
