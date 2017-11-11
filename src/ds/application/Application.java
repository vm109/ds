package ds.application;

import ds.application.probability.Combination;
import ds.application.probability.Permutation;

public class Application {
	//If I have 16 pool balls how many ways I can arrange them
	public static long poolBallsArrange(int numberofballs) {
		// chose permutation because it depends on the order   1,2 or 2,1 as all balls are distinct 
		
		Permutation permutation = new Permutation();
		return permutation.getAllthePossibilities(numberofballs, 2);
	}
	
	
	public static long chose3BallsFrom4Balls() {
		Combination combination = new Combination();
		return combination.getCombinations(4, 3);
	}
	
	public static void main(String[] args) {
		System.out.println(poolBallsArrange(4));
		
		System.out.println(chose3BallsFrom4Balls());
	}
}
