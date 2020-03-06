/* 
 * author: Isaiah Nwukor
 * Date: 9/12/18
 * */
public class StarOrder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		starTop();
		System.out.print("\n\n");
		starTop();
		starBar();
		starLine();
		starTop();
		System.out.print("\n\n");
		starTop();
		
	}
	
		
		public static void starTop() {
			System.out.println("    *****    ");
			System.out.println("  *********  ");
			System.out.println("*************");

		}
		
		public static void starLine() {

			System.out.println("*************");
		}
		
		
		public static void starBar() {

			System.out.println("* | | | | | *");
		}
		

}

/* Output 

    *****    
  *********  
*************


    *****    
  *********  
*************
* | | | | | *
*************
    *****    
  *********  
*************


    *****    
  *********  
*************

*/

