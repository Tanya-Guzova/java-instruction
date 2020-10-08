import java.util.ArrayList;
import java.util.List;
//p.389
public class SevenDwarvesCollectionsApp {

	public static void main(String[] args) {
		System.out.println("Hello!");
		
		
		
		//"Doc", "Sleepy" are all String objects
		//List<String> dwarves = new ArrayList<>(); same as below
		ArrayList<String> dwarves = new ArrayList<>();
		dwarves.add("Doc");
		dwarves.add("Sleepy");
		dwarves.add("Grumpy");
		dwarves.add("Dopey");
		dwarves.add("Happy");
		dwarves.add(0, "Bashful");
		dwarves.add("Sneezy");
		System.out.println("7 dwarves " + dwarves);
		System.out.println("Dwarf 3 is :  " + dwarves.get(3));
		System.out.println("# dwarves :" + dwarves.size());
		
		//p.391
		System.out.println("contains 'Happy'? " + dwarves.contains("Happy"));
		System.out.println("contains 'happy'? " + dwarves.contains("happy"));
		System.out.println("Bye!");
		System.out.println("index of 'Dopey'? " + dwarves.indexOf("Dopey"));
		
		//if more than one "Grumpy", will the return the index of the the first one
		dwarves.add("Grumpy");
		System.out.println(dwarves);
		System.out.println("index of 'Grumpy'? " + dwarves.indexOf("Grumpy"));
		dwarves.remove(3);
		System.out.println(dwarves);
		dwarves.set(3,"Temp Dwarf");//replacing
		System.out.println(dwarves);
	}

}
