package BudgetService;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import MainClass.Description;

public class ChoiceMonthService {
	

	int choice;
	String month;

	Description description = new Description();
	UserAction userAction = new UserAction();
	MonthService monthService = new MonthService();

	// obsługa wprowadzania przychodu / wydatków
	public void Menu() {

		description.MainMenu();;

		String valueName;
		Double value;

		choice = -1;

		while (choice != 0) {
			try {
				choice = userAction.inputInteger();
				if (choice > 0 && choice < 3 && choice != 0) {

					switch (choice) {

					case 1:
						System.out.println("Podaj miesiąc");
						valueName = userAction.inputString();
						monthService.ChoiceMonth(valueName);
						
						break;

					case 2:
				
						break;
					}
					
				} else if (choice == 0)
					System.out.println(" Koniec działania programu");
					System.out.println(" Dziękuje za użycie");
				break;

			} catch (NumberFormatException e) {

				description.Exception();
			}
		}
	}

}
