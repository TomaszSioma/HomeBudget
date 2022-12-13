package BudgetService;

import java.util.Scanner;

public class UserAction {
	

	private String text;
	private double value;
	private Integer number;

	Scanner scanner = new Scanner(System.in);

	public String inputString() {

		text = scanner.nextLine();

		return text;

	}

	public Integer inputInteger() {

		number = Integer.parseInt(scanner.nextLine());

		return number;

	}

	public Double inputDouble() {

		value = Double.parseDouble(scanner.nextLine());

		return value;

	}
	



}
