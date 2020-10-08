import java.util.HashMap;
import java.util.Map;

public class SevenDwarvesHashMapApp {

	public static void main(String[] args) {
	System.out.println("Hello!");
	
	//lets create a hashmap of the 7 dwarves
	//
	HashMap<String, String> dwarves = new HashMap<>();
	dwarves.put("DC", "Doc");
	dwarves.put("SL", "Sleepy");
	dwarves.put("SN", "Sneezy");
	dwarves.put("BA", "Bashful");
	dwarves.put("DO", "Dopey");
	dwarves.put("HA", "Happy");
	dwarves.put("GR", "Grumpy");
	
	System.out.println("List of all dwarves: ");
	for (Map.Entry <String, String> dwarf :dwarves.entrySet()) {
		System.out.println(dwarf.getKey()+"\t" +dwarf.getValue());
	}
	
	String str = "SN";
	System.out.println("Dwarf SN is " + dwarves.get(str));
	
	System.out.println("Bye!");

	}

}
