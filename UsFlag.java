public class UsFlag {

	/**
	 * @param args
	 */
	int starCount, bannerCount;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int numBannerChars = 70;
		bannerSymbols(6,numBannerChars);
		bannerSymbols(5,numBannerChars);
		bannerSymbols(6,numBannerChars);
		bannerSymbols(5,numBannerChars);
		bannerSymbols(6,numBannerChars);
		bannerSymbols(5,numBannerChars);
		bannerSymbols(6,numBannerChars);
		bannerSymbols(5,numBannerChars);
		bannerSymbols(6,numBannerChars);

		bannerSymbols(0,numBannerChars);
		bannerSymbols(0,numBannerChars);
		bannerSymbols(0,numBannerChars);
		bannerSymbols(0,numBannerChars);
		bannerSymbols(0,numBannerChars);
		bannerSymbols(0,numBannerChars);
		
		
	}
	public static void starSymbols(int starCount) {
		for (int i = 0; i < starCount; i++) {
			System.out.print("*       ");
		}
		if (starCount == 5) {
			System.out.print("        ");
		}
	}
	
	public static void bannerSymbols(int starCount, int bannerCount) {
		if (starCount > 0) {
			starSymbols(starCount);
			
		}
		for (int i = 0; i < bannerCount; i++) {
			System.out.print("=");
		}

		System.out.println("");
	}

}

