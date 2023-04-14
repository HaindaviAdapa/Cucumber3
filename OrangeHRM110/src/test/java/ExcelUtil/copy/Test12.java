package ExcelUtil.copy;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import ExcelUtil.ExcelApiTest4;

public class Test12 {
	
	
	//Map<String, String> ColumnsData = new HashMap<String, String>();

	//Map<String, String> ColumnsData = new HashMap<String, String>();
	
	Map<String, HashMap<String, String>> Datatable = new HashMap<String, HashMap<String, String>>();
	
	@Test
	public void Test1() throws Exception
	{
		
		ExcelApiTest4 eat = new ExcelApiTest4();
		
		Datatable=eat.getDataTable("C://HYBRIDFRAMEWORK_1//src//test//java//ExcelUtil//TestData1.xlsx", "Sheet1");
		
	//	TestCaseID	UserName	PassWord	SKillName	SkillDescr	JobTitle	JobDescr	JobNote	NationalityText

	
		//String TestURL=Datatable.get("TC01").get("UserName");
		
		System.out.println(Datatable.get("TC01").get("UserName"));
		System.out.println(Datatable.get("TC01").get("PassWord"));
		System.out.println(Datatable.get("TC01").get("SKillName"));
		System.out.println(Datatable.get("TC01").get("SkillDescr"));
		
		System.out.println("----------------------------------------------");
		
		
		System.out.println(Datatable.get("TC02").get("UserName"));
		System.out.println(Datatable.get("TC02").get("PassWord"));
		System.out.println(Datatable.get("TC02").get("JobTitle"));
		System.out.println(Datatable.get("TC02").get("JobDescr"));
		System.out.println(Datatable.get("TC02").get("JobNote"));
		


	
	}

	

}
