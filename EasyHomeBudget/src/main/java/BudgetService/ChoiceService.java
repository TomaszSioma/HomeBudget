package BudgetService;

import MainClass.Description;

public class ChoiceService {
	

	int choice;
	String month;

	Description description = new Description();
	UserAction userAction = new UserAction();

	// obsługa wprowadzania przychodu / wydatków
	public void MonthChoice() {

		description.monthMenu();

		String valueName;
		Double value;

		choice = -1;

		System.out.println("\n Jeżeli chcesz wrócić wpisz 0");
		while (choice != 0) {
			try {
				choice = userAction.inputInteger();
				if (choice > 0 && choice < 3 && choice != 0) {

					switch (choice) {

					case 1:

						System.out.println("\n Podaj nazwę przychodu: ");
						valueName = userAction.inputString();
						System.out.println("\n Podaj kwotę przychodu: ");
						value = userAction.inputDouble();
						System.out.println(
								"Został wprowadzony przychód : " + valueName + " o wartości: " + value + " zł");
						break;

					case 2:
						System.out.println("\n Podaj nazwę wydatku: ");
						valueName = userAction.inputString();
						System.out.println("\n Podaj kwotę wydatku: ");
						value = userAction.inputDouble();
						System.out.println("Został wprowadzony wydatek: " + valueName + " o wartości: " + value + " zł");
						break;

					}
					
				} else if (choice == 0)
				break;

			} catch (NumberFormatException e) {

				description.Exception();
			}
		}
	}

}
