package Kata;

public class Football {

	/*
	 * Our football team finished the championship. The result of each match look
	 * like "x:y". Results of all matches are recorded in the collection.
	 * For example: ["3:1", "2:2", "0:1", ...]
	 * Write a function that takes such collection and counts the points of our team
	 * in the championship. Rules for counting points for each match:
	 * if x>y - 3 points if x<y - 0 point if x=y - 1 point 
	 * Notes: there are 10 matches in the championship 0 <= x <= 4 0 <= y <= 4
	 */
	
	
	 public static int points(String[] games) {
		 int firstTeam ;
		 int secondTeam;
		 int result = 0;
		 
		 for (String elt: games) {		
			 String[] numbers = elt.split(":");
			  firstTeam = Integer.valueOf(numbers[0]);
			  secondTeam = Integer.valueOf(numbers[1]);
			  
			 if ( firstTeam > secondTeam) { result += 3; } 
			 else if  (firstTeam == secondTeam) {result += 1;}
		 }
		 
		 
	      return result;
	    }
	public static void main(String[] args) {

		int result = Football.points(new String[]
				 // {"1:0","2:0","3:0","4:0","2:1","1:3","1:4","2:3","2:4","3:4"});     // 15
				 // {"1:1","2:2","3:3","4:4","2:2","3:3","4:4","3:3","4:4","4:4"});     // 10
				 // {"0:1","0:2","0:3","0:4","1:2","1:3","1:4","2:3","2:4","3:4"});		// 0
                  {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"}); 	// 30
		
		System.out.println(result);
	}

}
