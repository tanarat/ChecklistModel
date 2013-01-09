import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.silk.checklist.model.Checklist;
import org.silk.checklist.model.Group;
import org.silk.checklist.model.Item;


public class TestChecklistItem {

	@Test
	public void test4(){
		Checklist checklist = new Checklist("แบบประเมินระบบ HAL-Q");
		
		Group group1 = new Group("4", "ระบบการบริหารด้านฮาลาล");
		group1.addItem(new Item("4.1","มีคู่มือคุณภาพ(QM) ครอบคลุมการผลิตอาหารฮาลาล"));
		group1.addItem(new Item("4.2","มีคู่มือการปฎิบัติงานครอบคลุมการผลิตอาหารฮาลาล"));
		
		
		List<String> noReasons = new ArrayList<String>();
		noReasons.add("ไม่มีการใช้งาน");
		noReasons.add("ไม่มีระบบการเก็บ");
		noReasons.add("ไม่มีระบบการทำลาย");
		Item item43 = new Item("4.3","มีการควบคุมเอกสารและการบันทึกการปฎิบัติในการผลิตอาหารฮาลาล",noReasons);
		
		group1.addItem(item43);
		checklist.addGroup(group1);
		
		
		Group group2 = new Group("5", "การบริหารทรัพยากร");
		group2.addItem(new Item("5.1","มีการจัดสรรทรัพยากรในการผลิตอาหารฮาลาลอย่างเหมาะสม และเพียงพอ"));
		group2.addItem(new Item("5.2.1.1","บุคลากรขององค์กรมีความสามารถ / ความตระหนัก / การฝึกอบรมในการผลิตอาหารฮาลาล"));
		group2.addItem(new Item("5.2.1.2","มีแผนการอบรมประจำปีที่ครอบคลุมการผลิตอาหารฮาลาล"));
		checklist.addGroup(group2);
		
		assertEquals(2, checklist.numberOfGroups());
		assertEquals(6, checklist.numberOfItems());
		
		Group g4 = checklist.getGroup("4");
		item43 = g4.getItem("4.3");
		assertEquals(3, item43.getNoReasons().size());
		
		Group group = new Group("4", "ระบบการบริหารด้านฮาลาล");
		assertEquals(true, checklist.exists(group));
		
	}
	@Test
	public void test1() {
		Item item1 = new Item("4.1", "item1");
		
	}
	
	@Test
	public void test2(){
		Group group1 = new Group("4", "ระบบการบริหารด้านฮาลาล");
		group1.addItem(new Item("4.1","มีคู่มือคุณภาพ(QM) ครอบคลุมการผลิตอาหารฮาลาล"));
		group1.addItem(new Item("4.2","มีคู่มือการปฎิบัติงานครอบคลุมการผลิตอาหารฮาลาล"));
		assertEquals(2, group1.numberOfItems());
		Item item = group1.getItem("4.1");
		assertEquals("มีคู่มือคุณภาพ(QM) ครอบคลุมการผลิตอาหารฮาลาล", item.getTitle());
	}

	@Test
	public void test3(){
		Checklist checklist = new Checklist("แบบประเมินระบบ HAL-Q");
		
		Group group1 = new Group("4", "ระบบการบริหารด้านฮาลาล");
		group1.addItem(new Item("4.1","มีคู่มือคุณภาพ(QM) ครอบคลุมการผลิตอาหารฮาลาล"));
		group1.addItem(new Item("4.2","มีคู่มือการปฎิบัติงานครอบคลุมการผลิตอาหารฮาลาล"));
		checklist.addGroup(group1);
		
		
		Group group2 = new Group("5", "การบริหารทรัพยากร");
		group2.addItem(new Item("5.1","มีการจัดสรรทรัพยากรในการผลิตอาหารฮาลาลอย่างเหมาะสม และเพียงพอ"));
		group2.addItem(new Item("5.2.1.1","บุคลากรขององค์กรมีความสามารถ / ความตระหนัก / การฝึกอบรมในการผลิตอาหารฮาลาล"));
		group2.addItem(new Item("5.2.1.2","มีแผนการอบรมประจำปีที่ครอบคลุมการผลิตอาหารฮาลาล"));
		checklist.addGroup(group2);
		
		assertEquals(2, checklist.numberOfGroups());
		assertEquals(5, checklist.numberOfItems());
	}
}
