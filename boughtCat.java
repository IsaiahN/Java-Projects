public class BoughtCat {

	/**
	 * @Author: Isaiah Nwukor
	 * @Date: 9/12/18
	 */
	
      
	static String[] animals = {"Cat", "Hen", "Duck", "Goose"};
	static String[] animalCalls = {"fiddle-i-fee", "chimmy-chuck, chimmy-chuck", "quack, quack", "hissy, hissy"};

	public static void main(String[] args) {
      recite();
		
	}
  
	public static void recite() {
		// Generates Poem from arrays and adds casing/punctuation accordingly	
		for (int i = 0; i < animals.length; i++) {
			System.out.print("\nBought me a " + animals[i].toLowerCase() + " and the " + animals[i].toLowerCase() + " pleased me,");
			System.out.print("\nI fed my " + animals[i].toLowerCase() + " under yonder tree.");

			for (int j = i; j > -1; j--) {
				System.out.print("\n" + animals[j] + " goes " + animalCalls[j]);
				if (j > 0) {
					System.out.print(",");
				} else {
					System.out.print(".\n");
				}
			}
			System.out.println("");
		}
	}
}

