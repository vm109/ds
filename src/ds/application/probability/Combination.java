package ds.application.probability;

import ds.application.math.utilites.Factorial;

/*
 * A combination does not have a order constraint. 
 * Say if we have to chose 3 number from 4 numbers 1, 2, 3, 4 [1, 2, 3 | 1,2 ,4 | 1, 3 , 4 | 2, 3, 4]
 * 
 * So the choice of combination and permutation should be decided 
 */
public class Combination {
	public long getCombinations(long numberOfEntites, long numberOfEntitesTobeChosenForCombinig) {
		Permutation permutation = new Permutation();
		return  permutation.getAllthePossibilities(numberOfEntites, numberOfEntitesTobeChosenForCombinig)/Factorial.getFactorialOfNumber(numberOfEntitesTobeChosenForCombinig);
	}
}
