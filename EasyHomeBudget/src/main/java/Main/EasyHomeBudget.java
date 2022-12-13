package Main;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import BudgetService.ChoiceMonthService;
import MainClass.Description;

public class EasyHomeBudget {

	public static void main(String[] args)throws UnsupportedEncodingException {
		
		System.setOut(new PrintStream (new FileOutputStream(java.io.FileDescriptor.out), true, "utf-8"));
		
		ChoiceMonthService service = new ChoiceMonthService();
		Description description = new Description();
		
		
		description.Hello();
		service.Menu();
		

		
	}

}
