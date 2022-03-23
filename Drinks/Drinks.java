package Kata;

public class Drinks {
	
	/* 1 glass of water per standard drink 
	 * you have several drinks tonight in the form of a string. 
	 * Return a string suggesting how many glasses of water you should drink. 
	 */
	
    public String hydrate(String drinkString) {
    	
        
    	String[] drinks = drinkString.split("(,|AND|and)");
    	int sumWater = 0;
    	String result = "";
    	
    	
    	for(String elt : drinks) {
    		char drink = elt.trim().charAt(0);
    		sumWater += Integer.parseInt(String.valueOf(drink)) ;
    	}
    	
    	if (sumWater == 1) result = sumWater + " glass of water";
    	else result = sumWater + " glasses of water";
    	
        return result;
	
    }
	
	
	public static void main(String[] args) {
		Drinks drinkin = new Drinks();
		String expected = "10 glasses of water";
		String actual1 = drinkin.hydrate("1 beer");
		String actual = drinkin.hydrate("1 shot, 5 beers, 2 shots, 1 glass of wine, 1 beer");
		System.out.println(expected.equals(actual));
	}

}
