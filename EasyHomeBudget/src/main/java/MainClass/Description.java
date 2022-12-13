package MainClass;

public class Description {
	
	public void Hello() {
		
		System.out.println("Witaj!!!!!");
		System.out.println("\n Jest to aplikacja do prowadzenia budrzetu domowego");
		System.out.println("\n Dodatkowo mozesz prowadzic tutaj swoje rachunki inwestycyjne \n");
	
	}
	
	public void MainMenu() {
		
		System.out.println("\nCo chcesz zrobić?");
		System.out.println("\n1. Wybierz miesiąc do prowadzenia budrzetu");
		
		
		System.out.println("\n0. Koniec programu");
	}
	
	
	public void Exception() {
		
		System.out.println("Podana wartość nie jest liczbą");
		System.out.println("Podaj wartość zgodną z podanym przediałem");
	}
	
	public void monthMenu() {
		System.out.println("\n Wybierz akcję: ");
		System.out.println("\n1. Wprowadz przychód");
		System.out.println("\n2. Wprowadz wydatek");
	}


}
