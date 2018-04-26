package organizationTable;

import java.util.Scanner;

public class Menu {
	
	private Scanner sc;
	private Table table;
	
	public Menu(){
        this.sc = new Scanner(System.in);
        this.table = new Table();
	}
	
	public void menu() {
		String option = "";
		String option2 = "";
		do {
			printMenu();
			option = sc.nextLine().toUpperCase();
			switch (option) {
			case "A":
				System.out.println("Activity?");
				String name = sc.nextLine();
				System.out.println("Time?");
				int duration = sc.nextInt();
				System.out.println("Priority?");
				int priority = sc.nextInt();
				
				table.addActivity(name, duration, priority);
				System.out.println("Number of activities: " + table.sizeTable());
				break;
			case "P":
				printSubMenu();
				option2 = sc.nextLine().toUpperCase();
				
				switch (option2) {
				case "P":
					table.printTable(table.orderPriority());
					break;

				case "D":
					table.printTable(table.orderDuration());
					break;
					
				}
			}
		} while (!option.equals("E"));
	}
	
	
	private void printMenu() {
		System.out.println(" (A)dd Activity"
				+ "\n (P)rint by Order"
				+ "\n (E)xit");
		System.out.println("Option> ");
	}
	
	private void printSubMenu() {
		System.out.println(" (P)riority"
				+ "\n (D)uration");
		System.out.println("Option> ");
	}


}
