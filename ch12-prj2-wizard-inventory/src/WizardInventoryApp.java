import java.util.ArrayList;

import ui.console.Console;

public class WizardInventoryApp {
	

	public static void main(String[] args) {
		ArrayList<String> items = new ArrayList<>();
		items.add("wooden staff");
		items.add("wizard hat");
		items.add("cloth shoes");
		System.out.println("The Wizard Inventory Game\n");
		System.out.println("Command Menu");
		System.out.println("show - Show all items");
		System.out.println("grab - Grab an item");
		System.out.println("edit - Edit an item");
		System.out.println("drop - Drop an item");
		System.out.println("exit - Exit program");
		String command = "";
		System.out.println();
		
		while (!command.equalsIgnoreCase("exit")) {
			int count = 0;
			command = Console.getRequiredString("Command: ");
			System.out.println();
			switch(command) {
			case "show":
				for (String item:items) {
				System.out.println((count+1)+". "+ item);
				count++;
				}
				break;
			case "grab":
				if (items.size() < 4) {
				String name = Console.getRequiredString("Name: ");
				items.add(name);
				System.out.println(name + " was added.");
				}
				else {
					System.out.println("You can't carry any more items. "
							+ "Drop something first.");
				}
				break;
				
			case "edit":
				int itemNumber = Console.getInt("Number:", 1, 4);
				String updatedName = Console.getRequiredString("Updated name: ");
				items.set((itemNumber-1), updatedName);
				System.out.println("Item number " + itemNumber + " was updated.");
				break;
			case "drop":
				int itemNum = Console.getInt("Number:", 1, 4);
				String item = items.get(itemNum-1);
				items.remove(itemNum-1);
				System.out.println(item + " was dropped.");
				break;
			}
			
		}
		


		
		
		System.out.println("Bye!");
	}

}
