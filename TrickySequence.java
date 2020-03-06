/*
 * Author: Isaiah Nwukor
 * Date: 9/12/18
 */
public class TrickySequence {

	/**
	 * @param args
	 */
	boolean isCouple = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		message1(true);
		message1(true);
		message1(false);
		message3();
		message1(true);
		message1(false);

	}
	
	// Accepts parameter isCouple which displays second message
	public static void message1(boolean isCouple) {
		System.out.println("Inside first method.");
		if (isCouple) {
			message2();
		}
	}

	public static void message2() {
		System.out.println("Inside second method.");
	}

	public static void message3() {
		System.out.println("Inside third method.");
	}
}

